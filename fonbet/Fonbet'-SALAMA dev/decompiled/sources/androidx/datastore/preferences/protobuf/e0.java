package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f9179b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean c(long j, Object obj) {
        switch (this.f9179b) {
            case 0:
                if (!h0.f9200g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!h0.f9200g) {
                    break;
                } else {
                    break;
                }
        }
        return h0.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final double d(long j, Object obj) {
        switch (this.f9179b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final float e(long j, Object obj) {
        switch (this.f9179b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void j(Object obj, long j, boolean z4) {
        switch (this.f9179b) {
            case 0:
                if (!h0.f9200g) {
                    h0.l(obj, j, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    h0.k(obj, j, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!h0.f9200g) {
                    h0.l(obj, j, z4 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    h0.k(obj, j, z4 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void k(Object obj, long j, byte b7) {
        switch (this.f9179b) {
            case 0:
                if (!h0.f9200g) {
                    h0.l(obj, j, b7);
                    break;
                } else {
                    h0.k(obj, j, b7);
                    break;
                }
            default:
                if (!h0.f9200g) {
                    h0.l(obj, j, b7);
                    break;
                } else {
                    h0.k(obj, j, b7);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void l(Object obj, long j, double d7) {
        switch (this.f9179b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d7));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d7));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void m(Object obj, long j, float f7) {
        switch (this.f9179b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f7));
                break;
            default:
                n(j, obj, Float.floatToIntBits(f7));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean r() {
        switch (this.f9179b) {
        }
        return false;
    }
}
