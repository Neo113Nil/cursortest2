package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class u3 extends com.fyber.inneractive.sdk.protobuf.w3 {
    public u3(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, byte b) {
        if (com.fyber.inneractive.sdk.protobuf.x3.h) {
            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, b);
        } else {
            com.fyber.inneractive.sdk.protobuf.x3.b(obj, j, b);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.f4226a.getLong(obj, j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.f4226a.getInt(obj, j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(java.lang.Object obj, long j) {
        return com.fyber.inneractive.sdk.protobuf.x3.h ? com.fyber.inneractive.sdk.protobuf.x3.a(obj, j) : com.fyber.inneractive.sdk.protobuf.x3.b(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(java.lang.Object obj, long j) {
        return com.fyber.inneractive.sdk.protobuf.x3.h ? com.fyber.inneractive.sdk.protobuf.x3.a(obj, j) != 0 : com.fyber.inneractive.sdk.protobuf.x3.b(obj, j) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, boolean z) {
        if (com.fyber.inneractive.sdk.protobuf.x3.h) {
            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            com.fyber.inneractive.sdk.protobuf.x3.b(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, float f) {
        this.f4226a.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(java.lang.Object obj, long j, double d) {
        this.f4226a.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j, byte[] bArr, long j2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
