package com.zxxz.admin.config;

import com.denghb.dbhelper.DbHelper;
import com.denghb.dbhelper.impl.DbHelperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfig {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean
    public DbHelper init(){
        DbHelperImpl dbHelper = new DbHelperImpl();
        dbHelper.setJdbcTemplate(jdbcTemplate);
        return dbHelper;
    }
}
