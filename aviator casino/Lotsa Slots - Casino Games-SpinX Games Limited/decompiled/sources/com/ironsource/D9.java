package com.ironsource;

/* loaded from: classes5.dex */
public class D9 {
    private static final int n = 0;

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.ironsource.H9> f5670a;
    private com.ironsource.J1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private com.ironsource.C3267s2 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private com.ironsource.H9 m;

    public D9() {
        this.f5670a = new java.util.ArrayList<>();
        this.b = new com.ironsource.J1();
        this.g = new com.ironsource.C3267s2();
    }

    public void a(com.ironsource.H9 h9) {
        if (h9 != null) {
            this.f5670a.add(h9);
            if (this.m == null) {
                this.m = h9;
            } else if (h9.a(0)) {
                this.m = h9;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public com.ironsource.C3267s2 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public com.ironsource.J1 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public java.lang.String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public D9(int i, boolean z, int i2, com.ironsource.J1 j1, com.ironsource.C3267s2 c3267s2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f5670a = new java.util.ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.g = c3267s2;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public com.ironsource.H9 a(java.lang.String str) {
        java.util.Iterator<com.ironsource.H9> it = this.f5670a.iterator();
        while (it.hasNext()) {
            com.ironsource.H9 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public com.ironsource.H9 a() {
        java.util.Iterator<com.ironsource.H9> it = this.f5670a.iterator();
        while (it.hasNext()) {
            com.ironsource.H9 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.m;
    }
}
