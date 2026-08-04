package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends J0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f12110b = i7;
    }

    @Override // com.google.protobuf.J0
    public final void c(long j, byte[] bArr, long j3, long j7) {
        switch (this.f12110b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.J0
    public final boolean d(long j, Object obj) {
        switch (this.f12110b) {
            case 0:
                if (K0.f12122h) {
                    if (K0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (K0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (K0.f12122h) {
                    if (K0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (K0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.J0
    public final byte e(long j) {
        switch (this.f12110b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.J0
    public final byte f(long j, Object obj) {
        switch (this.f12110b) {
            case 0:
                return K0.f12122h ? K0.h(j, obj) : K0.i(j, obj);
            default:
                return K0.f12122h ? K0.h(j, obj) : K0.i(j, obj);
        }
    }

    @Override // com.google.protobuf.J0
    public final double g(long j, Object obj) {
        switch (this.f12110b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // com.google.protobuf.J0
    public final float h(long j, Object obj) {
        switch (this.f12110b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // com.google.protobuf.J0
    public final void m(Object obj, long j, boolean z4) {
        switch (this.f12110b) {
            case 0:
                if (!K0.f12122h) {
                    K0.n(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    K0.m(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!K0.f12122h) {
                    K0.n(obj, j, z4 ? (byte) 1 : (byte) 0);
                } else {
                    K0.m(obj, j, z4 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.J0
    public final void n(Object obj, long j, byte b7) {
        switch (this.f12110b) {
            case 0:
                if (!K0.f12122h) {
                    K0.n(obj, j, b7);
                } else {
                    K0.m(obj, j, b7);
                }
                break;
            default:
                if (!K0.f12122h) {
                    K0.n(obj, j, b7);
                } else {
                    K0.m(obj, j, b7);
                }
                break;
        }
    }

    @Override // com.google.protobuf.J0
    public final void o(Object obj, long j, double d7) {
        switch (this.f12110b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d7));
                break;
            default:
                r(obj, j, Double.doubleToLongBits(d7));
                break;
        }
    }

    @Override // com.google.protobuf.J0
    public final void p(Object obj, long j, float f7) {
        switch (this.f12110b) {
            case 0:
                q(j, obj, Float.floatToIntBits(f7));
                break;
            default:
                q(j, obj, Float.floatToIntBits(f7));
                break;
        }
    }

    @Override // com.google.protobuf.J0
    public final boolean u() {
        switch (this.f12110b) {
        }
        return false;
    }
}
