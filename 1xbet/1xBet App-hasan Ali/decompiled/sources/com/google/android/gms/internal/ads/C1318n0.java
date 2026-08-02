package com.google.android.gms.internal.ads;

import B.C0072a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318n0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14563a;

    /* renamed from: b, reason: collision with root package name */
    public final F f14564b;

    public C1318n0(int i) {
        this.f14563a = i;
        switch (i) {
            case 1:
                this.f14564b = new W(35152, 2, "image/png");
                break;
            case 2:
                this.f14564b = new C1677v0();
                break;
            default:
                this.f14564b = new W(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        switch (this.f14563a) {
            case 0:
                ((W) this.f14564b).d(j5, j6);
                break;
            case 1:
                ((W) this.f14564b).d(j5, j6);
                break;
            default:
                ((C1677v0) this.f14564b).d(j5, j6);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        switch (this.f14563a) {
            case 0:
                return ((W) this.f14564b).e(g5);
            case 1:
                return ((W) this.f14564b).e(g5);
            default:
                return ((C1677v0) this.f14564b).e(g5);
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        switch (this.f14563a) {
            case 0:
                return ((W) this.f14564b).f(g5, c0072a);
            case 1:
                return ((W) this.f14564b).f(g5, c0072a);
            default:
                return ((C1677v0) this.f14564b).f(g5, c0072a);
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        switch (this.f14563a) {
            case 0:
                ((W) this.f14564b).h(h3);
                break;
            case 1:
                ((W) this.f14564b).h(h3);
                break;
            default:
                ((C1677v0) this.f14564b).f15946b = (HG) h3;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        switch (this.f14563a) {
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
