package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ME extends BC {

    /* renamed from: m, reason: collision with root package name */
    public final C1109iE f10608m;

    /* renamed from: n, reason: collision with root package name */
    public final H2.j f10609n;

    public ME(YD yd) {
        super(5);
        H2.j jVar = new H2.j(2);
        this.f10609n = jVar;
        try {
            this.f10608m = new C1109iE(yd, this);
            jVar.f();
        } catch (Throwable th) {
            this.f10609n.f();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void Y0(int i, long j5) {
        this.f10609n.d();
        this.f10608m.Y0(i, j5);
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final int b1() {
        this.f10609n.d();
        return this.f10608m.b1();
    }

    public final int c() {
        this.f10609n.d();
        return this.f10608m.c();
    }

    public final int f() {
        this.f10609n.d();
        C1109iE c1109iE = this.f10608m;
        c1109iE.t0();
        return c1109iE.f13907a0.f8487n;
    }

    @Override // com.google.android.gms.internal.ads.BC, com.google.android.gms.internal.ads.Bi
    public final void g() {
        this.f10609n.d();
        this.f10608m.t0();
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final AbstractC0715Xa l1() {
        this.f10609n.d();
        return this.f10608m.l1();
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void o1() {
        this.f10609n.d();
        this.f10608m.t0();
    }

    public final int p1() {
        this.f10609n.d();
        C1109iE c1109iE = this.f10608m;
        c1109iE.t0();
        if (c1109iE.H1()) {
            return c1109iE.f13907a0.f8477b.f15680b;
        }
        return -1;
    }

    public final int q1() {
        this.f10609n.d();
        C1109iE c1109iE = this.f10608m;
        c1109iE.t0();
        if (c1109iE.H1()) {
            return c1109iE.f13907a0.f8477b.f15681c;
        }
        return -1;
    }

    public final long r1() {
        this.f10609n.d();
        C1109iE c1109iE = this.f10608m;
        c1109iE.t0();
        if (c1109iE.H1()) {
            EE ee = c1109iE.f13907a0;
            return ee.f8484k.equals(ee.f8477b) ? AbstractC1260lo.v(c1109iE.f13907a0.f8489p) : c1109iE.E1();
        }
        c1109iE.t0();
        if (c1109iE.f13907a0.f8476a.o()) {
            return c1109iE.f13909c0;
        }
        EE ee2 = c1109iE.f13907a0;
        long j5 = 0;
        if (ee2.f8484k.f15682d != ee2.f8477b.f15682d) {
            return AbstractC1260lo.v(ee2.f8476a.e(c1109iE.b1(), (C0603Ha) c1109iE.f7794k, 0L).f9404j);
        }
        long j6 = ee2.f8489p;
        if (c1109iE.f13907a0.f8484k.b()) {
            EE ee3 = c1109iE.f13907a0;
            ee3.f8476a.n(ee3.f8484k.f15679a, c1109iE.f13923x).f.a(c1109iE.f13907a0.f8484k.f15680b).getClass();
        } else {
            j5 = j6;
        }
        EE ee4 = c1109iE.f13907a0;
        ee4.f8476a.n(ee4.f8484k.f15679a, c1109iE.f13923x);
        return AbstractC1260lo.v(j5);
    }

    public final long s1() {
        this.f10609n.d();
        return this.f10608m.D1();
    }

    public final long u1() {
        this.f10609n.d();
        return this.f10608m.E1();
    }

    public final C0981fd v1() {
        this.f10609n.d();
        C1109iE c1109iE = this.f10608m;
        c1109iE.t0();
        return (C0981fd) c1109iE.f13907a0.i.f14379n;
    }

    public final boolean w1() {
        this.f10609n.d();
        return this.f10608m.G1();
    }

    public final boolean x1() {
        this.f10609n.d();
        return this.f10608m.H1();
    }
}
