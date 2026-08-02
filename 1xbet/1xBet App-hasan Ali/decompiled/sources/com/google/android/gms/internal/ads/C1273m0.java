package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273m0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14452a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f14453b;

    /* renamed from: c, reason: collision with root package name */
    public final W f14454c;

    public C1273m0(int i) {
        this.f14452a = i;
        switch (i) {
            case 1:
                this.f14453b = new C1617tm(4);
                this.f14454c = new W(-1, -1, "image/heif");
                break;
            case 2:
                this.f14453b = new C1617tm(4);
                this.f14454c = new W(-1, -1, "image/webp");
                break;
            default:
                this.f14453b = new C1617tm(4);
                this.f14454c = new W(-1, -1, "image/avif");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        switch (this.f14452a) {
            case 0:
                this.f14454c.d(j5, j6);
                break;
            case 1:
                this.f14454c.d(j5, j6);
                break;
            default:
                this.f14454c.d(j5, j6);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        switch (this.f14452a) {
            case 0:
                ((B) g5).g(4, false);
                B b3 = (B) g5;
                C1617tm c1617tm = this.f14453b;
                c1617tm.g(4);
                b3.G(c1617tm.f15724a, 0, 4, false);
                if (c1617tm.D() == 1718909296) {
                    c1617tm.g(4);
                    b3.G(c1617tm.f15724a, 0, 4, false);
                    if (c1617tm.D() == 1635150182) {
                    }
                }
                break;
            case 1:
                ((B) g5).g(4, false);
                B b5 = (B) g5;
                C1617tm c1617tm2 = this.f14453b;
                c1617tm2.g(4);
                b5.G(c1617tm2.f15724a, 0, 4, false);
                if (c1617tm2.D() == 1718909296) {
                    c1617tm2.g(4);
                    b5.G(c1617tm2.f15724a, 0, 4, false);
                    if (c1617tm2.D() == 1751476579) {
                    }
                }
                break;
            default:
                C1617tm c1617tm3 = this.f14453b;
                c1617tm3.g(4);
                B b6 = (B) g5;
                b6.G(c1617tm3.f15724a, 0, 4, false);
                if (c1617tm3.D() == 1380533830) {
                    b6.g(4, false);
                    c1617tm3.g(4);
                    b6.G(c1617tm3.f15724a, 0, 4, false);
                    if (c1617tm3.D() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        switch (this.f14452a) {
        }
        return this.f14454c.f(g5, c0072a);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        switch (this.f14452a) {
            case 0:
                this.f14454c.h(h3);
                break;
            case 1:
                this.f14454c.h(h3);
                break;
            default:
                this.f14454c.h(h3);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        switch (this.f14452a) {
            case 0:
                C0954ev c0954ev = AbstractC1044gv.f13676l;
                break;
            case 1:
                C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                break;
            default:
                C0954ev c0954ev3 = AbstractC1044gv.f13676l;
                break;
        }
        return C1761wv.f16184o;
    }
}
