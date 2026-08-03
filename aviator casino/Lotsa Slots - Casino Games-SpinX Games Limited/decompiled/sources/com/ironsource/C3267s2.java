package com.ironsource;

/* renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3267s2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6587a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private boolean m;
    private java.util.ArrayList<java.lang.String> n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;

    public C3267s2() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = true;
        this.n = new java.util.ArrayList<>();
        this.g = 0;
        this.o = false;
        this.p = false;
        this.q = 1;
    }

    public java.lang.String a() {
        return this.b;
    }

    public long b() {
        return this.j;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.q;
    }

    public boolean e() {
        return this.m;
    }

    public java.util.ArrayList<java.lang.String> f() {
        return this.n;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.f6587a;
    }

    public int i() {
        return this.g;
    }

    public long j() {
        return this.k;
    }

    public long k() {
        return this.i;
    }

    public long l() {
        return this.l;
    }

    public long m() {
        return this.h;
    }

    public boolean n() {
        return this.t;
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.p;
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.r;
    }

    public java.lang.String a(boolean z) {
        return z ? this.d : this.c;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.n.add(str);
    }

    C3267s2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.h = j;
        this.f6587a = z4;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = j5;
        this.m = z;
        this.g = i3;
        this.n = new java.util.ArrayList<>();
        this.o = z2;
        this.p = z3;
        this.q = i4;
        this.r = z5;
        this.s = z6;
        this.t = z7;
    }
}
