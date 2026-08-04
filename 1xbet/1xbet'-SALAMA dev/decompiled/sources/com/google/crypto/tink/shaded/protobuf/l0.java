package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f11803b = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean c(long j, Object obj) {
        switch (this.f11803b) {
            case 0:
                if (o0.f11814g) {
                    if (o0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (o0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (o0.f11814g) {
                    if (o0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (o0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final byte d(long j, Object obj) {
        switch (this.f11803b) {
            case 0:
                return o0.f11814g ? o0.h(j, obj) : o0.i(j, obj);
            default:
                return o0.f11814g ? o0.h(j, obj) : o0.i(j, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final double e(long j, Object obj) {
        switch (this.f11803b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final float f(long j, Object obj) {
        switch (this.f11803b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void k(Object obj, long j, boolean z4) {
        switch (this.f11803b) {
            case 0:
                if (!o0.f11814g) {
                    o0.q(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.p(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!o0.f11814g) {
                    o0.q(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    o0.p(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void l(Object obj, long j, byte b7) {
        switch (this.f11803b) {
            case 0:
                if (!o0.f11814g) {
                    o0.q(obj, j, b7);
                } else {
                    o0.p(obj, j, b7);
                }
                break;
            default:
                if (!o0.f11814g) {
                    o0.q(obj, j, b7);
                } else {
                    o0.p(obj, j, b7);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void m(Object obj, long j, double d7) {
        switch (this.f11803b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d7));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d7));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void n(Object obj, long j, float f7) {
        switch (this.f11803b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f7));
                break;
            default:
                o(j, obj, Float.floatToIntBits(f7));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final boolean s() {
        switch (this.f11803b) {
        }
        return false;
    }
}
