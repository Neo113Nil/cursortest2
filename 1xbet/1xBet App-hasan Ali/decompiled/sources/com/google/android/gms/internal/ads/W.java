package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.List;

/* loaded from: classes.dex */
public final class W implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f11972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11974c;

    /* renamed from: d, reason: collision with root package name */
    public int f11975d;

    /* renamed from: e, reason: collision with root package name */
    public int f11976e;
    public HG f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0737a0 f11977g;

    public W(int i, int i5, String str) {
        this.f11972a = i;
        this.f11973b = i5;
        this.f11974c = str;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        if (j5 == 0 || this.f11976e == 1) {
            this.f11976e = 1;
            this.f11975d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        int i = this.f11973b;
        int i5 = this.f11972a;
        AbstractC1668us.a0((i5 == -1 || i == -1) ? false : true);
        C1617tm c1617tm = new C1617tm(i);
        ((B) g5).G(c1617tm.f15724a, 0, i, false);
        return c1617tm.z() == i5;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        int i = this.f11976e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC0737a0 interfaceC0737a0 = this.f11977g;
        interfaceC0737a0.getClass();
        int b3 = interfaceC0737a0.b(g5, 1024, true);
        if (b3 != -1) {
            this.f11975d += b3;
            return 0;
        }
        this.f11976e = 2;
        this.f11977g.d(0L, 1, this.f11975d, 0, null);
        this.f11975d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        HG hg = (HG) h3;
        this.f = hg;
        InterfaceC0737a0 w5 = hg.w(1024, 4);
        this.f11977g = w5;
        C1649uH c1649uH = new C1649uH();
        c1649uH.c(this.f11974c);
        w5.e(new C1407p(c1649uH));
        this.f.v();
        this.f.x(new X());
        this.f11976e = 1;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
