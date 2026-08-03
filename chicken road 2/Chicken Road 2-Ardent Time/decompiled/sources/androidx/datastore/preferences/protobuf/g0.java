package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class g0 extends androidx.datastore.preferences.protobuf.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(sun.misc.Unsafe unsafe, int i2) {
        super(unsafe);
        this.f2305b = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j2, java.lang.Object obj) {
        switch (this.f2305b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    break;
                } else {
                    break;
                }
        }
        return androidx.datastore.preferences.protobuf.j0.c(j2, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j2, java.lang.Object obj) {
        switch (this.f2305b) {
        }
        return java.lang.Double.longBitsToDouble(g(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j2, java.lang.Object obj) {
        switch (this.f2305b) {
        }
        return java.lang.Float.intBitsToFloat(f(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(java.lang.Object obj, long j2, boolean z2) {
        switch (this.f2305b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    androidx.datastore.preferences.protobuf.j0.l(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    androidx.datastore.preferences.protobuf.j0.k(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    androidx.datastore.preferences.protobuf.j0.l(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    androidx.datastore.preferences.protobuf.j0.k(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(java.lang.Object obj, long j2, byte b2) {
        switch (this.f2305b) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    androidx.datastore.preferences.protobuf.j0.l(obj, j2, b2);
                    break;
                } else {
                    androidx.datastore.preferences.protobuf.j0.k(obj, j2, b2);
                    break;
                }
            default:
                if (!androidx.datastore.preferences.protobuf.j0.f2329f) {
                    androidx.datastore.preferences.protobuf.j0.l(obj, j2, b2);
                    break;
                } else {
                    androidx.datastore.preferences.protobuf.j0.k(obj, j2, b2);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(java.lang.Object obj, long j2, double d2) {
        switch (this.f2305b) {
            case 0:
                o(obj, j2, java.lang.Double.doubleToLongBits(d2));
                break;
            default:
                o(obj, j2, java.lang.Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(java.lang.Object obj, long j2, float f2) {
        switch (this.f2305b) {
            case 0:
                n(obj, j2, java.lang.Float.floatToIntBits(f2));
                break;
            default:
                n(obj, j2, java.lang.Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f2305b) {
        }
        return false;
    }
}
