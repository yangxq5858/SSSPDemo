package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author yxqiang
 * @create 2018-10-11 21:58
 */
public class SSSPTest {



    @Test
    public void test1() throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());

    }
}
