package com.bytedance.sdk.openadsdk.oo;

/* loaded from: classes4.dex */
public class oo {
    public static String pcc() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }

    public static String sf() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
