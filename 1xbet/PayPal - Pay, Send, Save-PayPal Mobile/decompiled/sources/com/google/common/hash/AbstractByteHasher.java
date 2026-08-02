package com.google.common.hash;

/* loaded from: classes9.dex */
abstract class AbstractByteHasher extends com.google.common.hash.AbstractHasher {
    private java.nio.ByteBuffer scratch;

    protected abstract void update(byte b);

    AbstractByteHasher() {
    }

    protected void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    protected void update(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            update(bArr[i3]);
        }
    }

    protected void update(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            update(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            com.google.common.hash.Java8Compatibility.position(byteBuffer, byteBuffer.limit());
        } else {
            for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
                update(byteBuffer.get());
            }
        }
    }

    private com.google.common.hash.Hasher update(java.nio.ByteBuffer byteBuffer, int i) {
        try {
            update(byteBuffer.array(), 0, i);
            return this;
        } finally {
            com.google.common.hash.Java8Compatibility.clear(byteBuffer);
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bArr) {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        update(bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        update(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer byteBuffer) {
        update(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putShort(short s) {
        java.nio.ByteBuffer scratch = scratch();
        scratch.putShort(s);
        return update(scratch, 2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putInt(int i) {
        java.nio.ByteBuffer scratch = scratch();
        scratch.putInt(i);
        return update(scratch, 4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putLong(long j) {
        java.nio.ByteBuffer scratch = scratch();
        scratch.putLong(j);
        return update(scratch, 8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public com.google.common.hash.Hasher putChar(char c) {
        java.nio.ByteBuffer scratch = scratch();
        scratch.putChar(c);
        return update(scratch, 2);
    }

    private java.nio.ByteBuffer scratch() {
        if (this.scratch == null) {
            this.scratch = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        return this.scratch;
    }
}
