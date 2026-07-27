package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* compiled from: EventTable.java */
/* loaded from: classes6.dex */
public class i implements Serializable {
    static String i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";
    static String j = "DROP TABLE IF EXISTS %s";

    /* renamed from: a, reason: collision with root package name */
    private final e f9988a;
    private int b;
    private int c;
    private final String d;
    private long e;
    private boolean f = false;
    private boolean g = false;
    private String h;

    public i(e eVar) {
        this.f9988a = eVar;
        this.d = eVar.n();
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public e d() {
        return this.f9988a;
    }

    public long g() {
        return this.e;
    }

    public int h() {
        return this.b;
    }

    public String i() {
        return this.h;
    }

    public int j() {
        return this.c;
    }

    public String k() {
        return this.d;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.f;
    }

    public void a(int i2) {
        this.b = i2;
    }

    public void b(int i2) {
        this.c = i2;
    }

    public void a(long j2) {
        this.e = j2;
    }

    public void a(String str) {
        this.h = str;
    }
}
