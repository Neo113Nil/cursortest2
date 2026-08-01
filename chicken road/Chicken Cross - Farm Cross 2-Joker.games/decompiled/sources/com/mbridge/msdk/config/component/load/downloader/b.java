package com.mbridge.msdk.config.component.load.downloader;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DownloadMessage.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Object f8986a;
    private int b;
    private String c;
    private Map<String, Object> d;
    private int e = 0;
    private String f = "";
    private String g;
    private boolean h;
    private long i;
    private int j;
    private String k;
    private String l;
    private long m;
    private long n;

    public b(Object obj, String str, String str2, String str3, int i) {
        this.f8986a = obj;
        this.g = str3;
        this.b = i;
        this.c = str;
        this.k = str2;
        try {
            if (TextUtils.isEmpty(str2)) {
                URL url = new URL(str);
                this.k = url.getProtocol() + "://" + url.getHost() + url.getPath();
            }
        } catch (MalformedURLException e) {
            q0.b("DownloadMessage", e.getMessage(), e);
        }
    }

    public void a(String str, Object obj) {
        if (this.d == null) {
            this.d = new HashMap(4);
        }
        this.d.put(str, obj);
    }

    public void b(int i) {
        this.b = i;
    }

    public long c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.m;
    }

    public String h() {
        return this.g;
    }

    public long i() {
        return this.n;
    }

    public String j() {
        return this.f;
    }

    public boolean k() {
        return this.h;
    }

    public void b(String str) {
        this.f = str;
    }

    public void c(long j) {
        this.n = j;
    }

    public String b() {
        return this.k;
    }

    public void b(long j) {
        this.m = j;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void a(long j) {
        this.i = j;
    }

    public void a(int i) {
        this.j = i;
    }

    public String a() {
        return this.l;
    }

    public void a(String str) {
        this.l = str;
    }
}
