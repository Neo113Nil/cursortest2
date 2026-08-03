package com.ironsource;

/* loaded from: classes5.dex */
public class U2 {
    private static final int p = 0;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.J1 f5995a;
    private int b;
    private long c;
    private boolean d;
    private java.util.ArrayList<com.ironsource.C3018e3> e;
    private com.ironsource.C3018e3 f;
    private int g;
    private int h;
    private com.ironsource.C3267s2 i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;

    public U2() {
        this.f5995a = new com.ironsource.J1();
        this.e = new java.util.ArrayList<>();
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public com.ironsource.C3267s2 d() {
        return this.i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.h;
    }

    public com.ironsource.J1 g() {
        return this.f5995a;
    }

    public int h() {
        return this.g;
    }

    public com.ironsource.C3018e3 i() {
        java.util.Iterator<com.ironsource.C3018e3> it = this.e.iterator();
        while (it.hasNext()) {
            com.ironsource.C3018e3 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        com.ironsource.C3018e3 c3018e3 = this.f;
        return c3018e3 != null ? c3018e3 : new com.ironsource.C3109j5();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.m;
    }

    public java.lang.String toString() {
        return "BannerConfigurations{parallelLoad=" + this.b + ", bidderExclusive=" + this.d + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public void a(com.ironsource.C3018e3 c3018e3) {
        if (c3018e3 != null) {
            this.e.add(c3018e3);
            if (this.f == null) {
                this.f = c3018e3;
            } else if (c3018e3.a(0)) {
                this.f = c3018e3;
            }
        }
    }

    public U2(int i, long j, boolean z, com.ironsource.J1 j1, int i2, com.ironsource.C3267s2 c3267s2, int i3, boolean z2, long j2, boolean z3, boolean z4, boolean z5, long j3) {
        this.e = new java.util.ArrayList<>();
        this.b = i;
        this.c = j;
        this.d = z;
        this.f5995a = j1;
        this.g = i2;
        this.h = i3;
        this.i = c3267s2;
        this.j = z2;
        this.k = j2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = j3;
    }

    public com.ironsource.C3018e3 a(java.lang.String str) {
        java.util.Iterator<com.ironsource.C3018e3> it = this.e.iterator();
        while (it.hasNext()) {
            com.ironsource.C3018e3 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
