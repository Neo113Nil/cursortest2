package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends dg1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f9752b = i;
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: c */
    public final boolean mo650c(Object obj, long j) {
        switch (this.f9752b) {
            case 0:
                if (fg1.f2403g) {
                    if (fg1.m1782h(obj, j) == 0) {
                        return false;
                    }
                } else if (fg1.m1783i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (fg1.f2403g) {
                    if (fg1.m1782h(obj, j) == 0) {
                        return false;
                    }
                } else if (fg1.m1783i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: d */
    public final byte mo651d(Object obj, long j) {
        switch (this.f9752b) {
            case 0:
                return fg1.f2403g ? fg1.m1782h(obj, j) : fg1.m1783i(obj, j);
            default:
                return fg1.f2403g ? fg1.m1782h(obj, j) : fg1.m1783i(obj, j);
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: e */
    public final double mo652e(Object obj, long j) {
        switch (this.f9752b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m1206h(obj, j));
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: f */
    public final float mo653f(Object obj, long j) {
        switch (this.f9752b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m1205g(obj, j));
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: k */
    public final void mo654k(Object obj, long j, boolean z) {
        switch (this.f9752b) {
            case 0:
                if (!fg1.f2403g) {
                    fg1.m1787m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    fg1.m1786l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!fg1.f2403g) {
                    fg1.m1787m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    fg1.m1786l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: l */
    public final void mo655l(Object obj, long j, byte b) {
        switch (this.f9752b) {
            case 0:
                if (!fg1.f2403g) {
                    fg1.m1787m(obj, j, b);
                } else {
                    fg1.m1786l(obj, j, b);
                }
                break;
            default:
                if (!fg1.f2403g) {
                    fg1.m1787m(obj, j, b);
                } else {
                    fg1.m1786l(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: m */
    public final void mo656m(Object obj, long j, double d) {
        switch (this.f9752b) {
            case 0:
                m1210p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m1210p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: n */
    public final void mo657n(Object obj, long j, float f) {
        switch (this.f9752b) {
            case 0:
                m1209o(obj, j, Float.floatToIntBits(f));
                break;
            default:
                m1209o(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: s */
    public final boolean mo659s() {
        switch (this.f9752b) {
        }
        return false;
    }
}
