package com.google.common.hash;

@com.google.common.hash.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class HashingInputStream extends java.io.FilterInputStream {
    private final com.google.common.hash.Hasher hasher;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public HashingInputStream(com.google.common.hash.HashFunction hashFunction, java.io.InputStream in) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(in));
        this.hasher = (com.google.common.hash.Hasher) com.google.common.base.Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.in.read();
        if (read != -1) {
            this.hasher.putByte((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bytes, int off, int len) throws java.io.IOException {
        int read = this.in.read(bytes, off, len);
        if (read != -1) {
            this.hasher.putBytes(bytes, off, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        throw new java.io.IOException("reset not supported");
    }

    public com.google.common.hash.HashCode hash() {
        return this.hasher.hash();
    }
}
