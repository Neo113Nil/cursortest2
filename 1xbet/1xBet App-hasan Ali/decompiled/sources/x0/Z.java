package x0;

import a.AbstractC0444a;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: k, reason: collision with root package name */
    public int f20973k;

    /* renamed from: l, reason: collision with root package name */
    public int f20974l;

    /* renamed from: m, reason: collision with root package name */
    public long f20975m;

    /* renamed from: n, reason: collision with root package name */
    public long f20976n = b0.f20983a;

    /* renamed from: o, reason: collision with root package name */
    public long f20977o = 0;

    public Z() {
        long j5 = 0;
        this.f20975m = (j5 & 4294967295L) | (j5 << 32);
    }

    public int W() {
        return (int) (this.f20975m & 4294967295L);
    }

    public int X() {
        return (int) (this.f20975m >> 32);
    }

    public final void Y() {
        this.f20973k = AbstractC0444a.t((int) (this.f20975m >> 32), W0.a.j(this.f20976n), W0.a.h(this.f20976n));
        this.f20974l = AbstractC0444a.t((int) (this.f20975m & 4294967295L), W0.a.i(this.f20976n), W0.a.g(this.f20976n));
        int i = this.f20973k;
        long j5 = this.f20975m;
        this.f20977o = (((i - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    public abstract void Z(long j5, float f, i4.c cVar);

    public final void c0(long j5) {
        if (W0.l.a(this.f20975m, j5)) {
            return;
        }
        this.f20975m = j5;
        Y();
    }

    public final void e0(long j5) {
        if (W0.a.b(this.f20976n, j5)) {
            return;
        }
        this.f20976n = j5;
        Y();
    }

    public /* synthetic */ Object k() {
        return null;
    }
}
