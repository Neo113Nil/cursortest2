package p000;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qq1 extends sq1 {
    @Override // p000.sq1
    /* JADX INFO: renamed from: A */
    public final void mo4125A(Object obj, long j, double d) {
        ((Unsafe) this.f7192j).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: o */
    public final void mo4126o(Object obj, long j, byte b) {
        if (tq1.f7573f) {
            tq1.m4826b(obj, j, b);
        } else {
            tq1.m4827c(obj, j, b);
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: q */
    public final boolean mo4127q(Object obj, long j) {
        return tq1.f7573f ? tq1.m4838n(obj, j) : tq1.m4839o(obj, j);
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: s */
    public final void mo4128s(Object obj, long j, boolean z) {
        if (tq1.f7573f) {
            tq1.m4826b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            tq1.m4827c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: v */
    public final float mo4129v(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.f7192j).getInt(obj, j));
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: x */
    public final void mo4130x(Object obj, long j, float f) {
        ((Unsafe) this.f7192j).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: y */
    public final double mo4131y(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.f7192j).getLong(obj, j));
    }
}
