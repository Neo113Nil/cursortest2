package com.ironsource;

/* renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3029ee {
    private static final int o = 0;

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.ironsource.C3064gd> f6217a;
    private com.ironsource.J1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private com.ironsource.C3064gd l;
    private com.ironsource.C3267s2 m;
    private boolean n;

    public C3029ee() {
        this.f6217a = new java.util.ArrayList<>();
        this.b = new com.ironsource.J1();
    }

    public void a(com.ironsource.C3064gd c3064gd) {
        if (c3064gd != null) {
            this.f6217a.add(c3064gd);
            if (this.l == null) {
                this.l = c3064gd;
            } else if (c3064gd.a(0)) {
                this.l = c3064gd;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public java.util.ArrayList<com.ironsource.C3064gd> e() {
        return this.f6217a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public com.ironsource.C3267s2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public com.ironsource.J1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public java.lang.String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public C3029ee(int i, boolean z, int i2, int i3, com.ironsource.J1 j1, com.ironsource.C3267s2 c3267s2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f6217a = new java.util.ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.f = i3;
        this.m = c3267s2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public com.ironsource.C3064gd a(java.lang.String str) {
        java.util.Iterator<com.ironsource.C3064gd> it = this.f6217a.iterator();
        while (it.hasNext()) {
            com.ironsource.C3064gd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public com.ironsource.C3064gd a() {
        java.util.Iterator<com.ironsource.C3064gd> it = this.f6217a.iterator();
        while (it.hasNext()) {
            com.ironsource.C3064gd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
