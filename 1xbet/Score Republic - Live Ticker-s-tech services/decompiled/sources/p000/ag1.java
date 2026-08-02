package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ag1 extends eg1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f177b = i;
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: c */
    public final boolean mo205c(Object obj, long j) {
        switch (this.f177b) {
            case 0:
                return gg1.f2732g ? gg1.m2037b(obj, j) : gg1.m2038c(obj, j);
            default:
                return gg1.f2732g ? gg1.m2037b(obj, j) : gg1.m2038c(obj, j);
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: d */
    public final double mo206d(Object obj, long j) {
        switch (this.f177b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m1419g(obj, j));
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: e */
    public final float mo207e(Object obj, long j) {
        switch (this.f177b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m1418f(obj, j));
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: j */
    public final void mo208j(Object obj, long j, boolean z) {
        switch (this.f177b) {
            case 0:
                if (!gg1.f2732g) {
                    gg1.m2047l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    gg1.m2046k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!gg1.f2732g) {
                    gg1.m2047l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    gg1.m2046k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: k */
    public final void mo209k(Object obj, long j, byte b) {
        switch (this.f177b) {
            case 0:
                if (!gg1.f2732g) {
                    gg1.m2047l(obj, j, b);
                } else {
                    gg1.m2046k(obj, j, b);
                }
                break;
            default:
                if (!gg1.f2732g) {
                    gg1.m2047l(obj, j, b);
                } else {
                    gg1.m2046k(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: l */
    public final void mo210l(Object obj, long j, double d) {
        switch (this.f177b) {
            case 0:
                m1423o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m1423o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: m */
    public final void mo211m(Object obj, long j, float f) {
        switch (this.f177b) {
            case 0:
                m1422n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                m1422n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: r */
    public final boolean mo212r() {
        switch (this.f177b) {
        }
        return false;
    }
}
