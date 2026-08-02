package com.google.common.hash;

/* loaded from: classes9.dex */
public final class HashingOutputStream extends java.io.FilterOutputStream {
    private final com.google.common.hash.Hasher hasher;

    public HashingOutputStream(com.google.common.hash.HashFunction hashFunction, java.io.OutputStream outputStream) {
        super((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(outputStream));
        this.hasher = (com.google.common.hash.Hasher) com.google.common.base.Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.hasher.putByte((byte) i);
        this.out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.hasher.putBytes(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }

    public final com.google.common.hash.HashCode hash() {
        return this.hasher.hash();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.out.close();
    }
}
