package com.ironsource;

import android.content.Context;

/* loaded from: classes6.dex */
public class V4 {
    private static V4 h;

    /* renamed from: a, reason: collision with root package name */
    private String f7962a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final InterfaceC4673u7 g;

    private V4(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        this.g = a2;
        this.f7962a = a2.q();
        this.b = a2.l();
        this.c = a2.f();
        this.d = a2.i();
        this.e = a2.e();
        this.f = a2.v(context);
    }

    public static V4 b(Context context) {
        if (h == null) {
            h = new V4(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public int a() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f7962a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public float a(Context context) {
        return this.g.F(context);
    }

    public String b() {
        return this.f;
    }
}
