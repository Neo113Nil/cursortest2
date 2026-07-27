package com.bytedance.sdk.openadsdk.oo;

/* loaded from: classes4.dex */
public class dax {
    public static String pcc() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String sf() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
