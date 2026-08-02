package com.google.common.hash;

/* loaded from: classes9.dex */
public final class HashingInputStream extends java.io.FilterInputStream {
    private final com.google.common.hash.Hasher hasher;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public HashingInputStream(com.google.common.hash.HashFunction hashFunction, java.io.InputStream inputStream) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(inputStream));
        this.hasher = (com.google.common.hash.Hasher) com.google.common.base.Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int read = this.in.read();
        if (read != -1) {
            this.hasher.putByte((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.hasher.putBytes(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        throw new java.io.IOException("reset not supported");
    }

    public final com.google.common.hash.HashCode hash() {
        return this.hasher.hash();
    }
}
