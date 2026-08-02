package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14045a;

    /* renamed from: b, reason: collision with root package name */
    public int f14046b;

    /* renamed from: c, reason: collision with root package name */
    public int f14047c;

    /* renamed from: d, reason: collision with root package name */
    public long f14048d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14049e;
    public final C1617tm f;

    /* renamed from: g, reason: collision with root package name */
    public final C1617tm f14050g;

    /* renamed from: h, reason: collision with root package name */
    public int f14051h;
    public int i;

    public C1139j1(C1617tm c1617tm, C1617tm c1617tm2, boolean z3) {
        this.f14050g = c1617tm;
        this.f = c1617tm2;
        this.f14049e = z3;
        c1617tm2.j(12);
        this.f14045a = c1617tm2.y();
        c1617tm.j(12);
        this.i = c1617tm.y();
        AbstractC1668us.G("first_chunk must be 1", c1617tm.q() == 1);
        this.f14046b = -1;
    }

    public final boolean a() {
        int i = this.f14046b + 1;
        this.f14046b = i;
        if (i == this.f14045a) {
            return false;
        }
        boolean z3 = this.f14049e;
        C1617tm c1617tm = this.f;
        this.f14048d = z3 ? c1617tm.E() : c1617tm.D();
        if (this.f14046b == this.f14051h) {
            C1617tm c1617tm2 = this.f14050g;
            this.f14047c = c1617tm2.y();
            c1617tm2.k(4);
            int i5 = this.i - 1;
            this.i = i5;
            this.f14051h = i5 > 0 ? (-1) + c1617tm2.y() : -1;
        }
        return true;
    }
}
