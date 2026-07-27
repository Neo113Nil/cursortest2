package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i2) {
        super(unsafe);
        this.f4435b = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j2, Object obj) {
        switch (this.f4435b) {
            case 0:
                if (!i0.f4461f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i0.f4461f) {
                    break;
                } else {
                    break;
                }
        }
        return i0.c(j2, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j2, Object obj) {
        switch (this.f4435b) {
        }
        return Double.longBitsToDouble(g(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j2, Object obj) {
        switch (this.f4435b) {
        }
        return Float.intBitsToFloat(f(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j2, boolean z) {
        switch (this.f4435b) {
            case 0:
                if (!i0.f4461f) {
                    i0.l(obj, j2, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j2, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i0.f4461f) {
                    i0.l(obj, j2, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j2, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j2, byte b6) {
        switch (this.f4435b) {
            case 0:
                if (!i0.f4461f) {
                    i0.l(obj, j2, b6);
                    break;
                } else {
                    i0.k(obj, j2, b6);
                    break;
                }
            default:
                if (!i0.f4461f) {
                    i0.l(obj, j2, b6);
                    break;
                } else {
                    i0.k(obj, j2, b6);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j2, double d6) {
        switch (this.f4435b) {
            case 0:
                o(obj, j2, Double.doubleToLongBits(d6));
                break;
            default:
                o(obj, j2, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j2, float f3) {
        switch (this.f4435b) {
            case 0:
                n(obj, j2, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j2, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f4435b) {
        }
        return false;
    }
}
