package com.ironsource;

/* loaded from: classes5.dex */
public class X4 {
    private static com.ironsource.X4 h;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6070a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;
    private java.lang.String f;
    private final com.ironsource.InterfaceC3362x7 g;

    private X4(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        this.g = a2;
        this.f6070a = a2.q();
        this.b = a2.l();
        this.c = a2.f();
        this.d = a2.i();
        this.e = a2.e();
        this.f = a2.v(context);
    }

    public static com.ironsource.X4 b(android.content.Context context) {
        if (h == null) {
            h = new com.ironsource.X4(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public int a() {
        return this.e;
    }

    public java.lang.String c() {
        return this.b;
    }

    public java.lang.String d() {
        return this.f6070a;
    }

    public java.lang.String e() {
        return this.c;
    }

    public java.lang.String f() {
        return this.d;
    }

    public float a(android.content.Context context) {
        return this.g.F(context);
    }

    public java.lang.String b() {
        return this.f;
    }
}
