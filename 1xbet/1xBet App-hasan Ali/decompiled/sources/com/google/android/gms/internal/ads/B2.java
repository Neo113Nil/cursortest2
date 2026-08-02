package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.List;

/* loaded from: classes.dex */
public final class B2 implements F {

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f7761c;

    /* renamed from: d, reason: collision with root package name */
    public final C0826c0 f7762d;

    /* renamed from: e, reason: collision with root package name */
    public HG f7763e;
    public long f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7765h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final C2 f7759a = new C2(0, null, true);

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f7760b = new C1617tm(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f7764g = -1;

    public B2() {
        C1617tm c1617tm = new C1617tm(10);
        this.f7761c = c1617tm;
        byte[] bArr = c1617tm.f15724a;
        this.f7762d = new C0826c0(bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f7765h = false;
        this.f7759a.b();
        this.f = j6;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        C1617tm c1617tm;
        B b3;
        int i = 0;
        while (true) {
            c1617tm = this.f7761c;
            b3 = (B) g5;
            b3.G(c1617tm.f15724a, 0, 10, false);
            c1617tm.j(0);
            if (c1617tm.x() != 4801587) {
                break;
            }
            c1617tm.k(3);
            int u5 = c1617tm.u();
            i += u5 + 10;
            b3.g(u5, false);
        }
        B b5 = (B) g5;
        b5.f7754p = 0;
        b3.g(i, false);
        if (this.f7764g == -1) {
            this.f7764g = i;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = i;
        do {
            b3.G(c1617tm.f15724a, 0, 2, false);
            c1617tm.j(0);
            if ((c1617tm.z() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                b3.G(c1617tm.f15724a, 0, 4, false);
                C0826c0 c0826c0 = this.f7762d;
                c0826c0.s(14);
                int f = c0826c0.f(13);
                if (f <= 6) {
                    i7++;
                    b5.f7754p = 0;
                    b3.g(i7, false);
                } else {
                    b3.g(f - 6, false);
                    i6 += f;
                }
            } else {
                i7++;
                b5.f7754p = 0;
                b3.g(i7, false);
            }
            i5 = 0;
            i6 = 0;
        } while (i7 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        AbstractC1668us.F(this.f7763e);
        C1617tm c1617tm = this.f7760b;
        int e3 = ((B) g5).e(c1617tm.f15724a, 0, 2048);
        if (!this.i) {
            this.f7763e.x(new J(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (e3 == -1) {
            return -1;
        }
        c1617tm.j(0);
        c1617tm.i(e3);
        boolean z3 = this.f7765h;
        C2 c22 = this.f7759a;
        if (!z3) {
            c22.f7960t = this.f;
            this.f7765h = true;
        }
        c22.c(c1617tm);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f7763e = (HG) h3;
        this.f7759a.e(h3, new C0829c3(Integer.MIN_VALUE, 0, 1));
        ((HG) h3).v();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
