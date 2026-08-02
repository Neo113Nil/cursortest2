package com.google.common.io;

/* loaded from: classes9.dex */
public final class CountingInputStream extends java.io.FilterInputStream {
    private long count;
    private long mark;

    public CountingInputStream(java.io.InputStream inputStream) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(inputStream));
        this.mark = -1L;
    }

    public final long getCount() {
        return this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int read = this.in.read();
        if (read != -1) {
            this.count++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.count += read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long skip = this.in.skip(j);
        this.count += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.in.mark(i);
            this.mark = this.count;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        synchronized (this) {
            if (!this.in.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new java.io.IOException("Mark not set");
            }
            this.in.reset();
            this.count = this.mark;
        }
    }
}
