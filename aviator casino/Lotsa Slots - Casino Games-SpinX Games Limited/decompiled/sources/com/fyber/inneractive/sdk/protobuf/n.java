package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class n extends com.fyber.inneractive.sdk.protobuf.q {
    private static final long serialVersionUID = 1;
    public final int e;
    public final int f;

    public n(byte[] bArr, int i, int i2) {
        super(bArr);
        com.fyber.inneractive.sdk.protobuf.s.a(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final void a(int i, byte[] bArr) {
        java.lang.System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final byte c(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Index < 0: ", i));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final byte d(int i) {
        return this.d[this.e + i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q
    public final int g() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.s
    public final int size() {
        return this.f;
    }

    public java.lang.Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = com.fyber.inneractive.sdk.protobuf.l1.b;
        } else {
            byte[] bArr2 = new byte[size];
            a(size, bArr2);
            bArr = bArr2;
        }
        return new com.fyber.inneractive.sdk.protobuf.q(bArr);
    }
}
