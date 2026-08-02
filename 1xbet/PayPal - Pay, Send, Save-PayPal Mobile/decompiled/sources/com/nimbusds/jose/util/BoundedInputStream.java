package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public class BoundedInputStream extends java.io.InputStream {
    private final java.io.InputStream in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(java.io.InputStream inputStream, long j) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j;
        this.in = inputStream;
    }

    public BoundedInputStream(java.io.InputStream inputStream) {
        this(inputStream, -1L);
    }

    public long getLimitBytes() {
        return this.max;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exceeded configured input limit of ");
            sb.append(this.max);
            sb.append(" bytes");
            throw new java.io.IOException(sb.toString());
        }
        int read = this.in.read();
        this.pos++;
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exceeded configured input limit of ");
            sb.append(this.max);
            sb.append(" bytes");
            throw new java.io.IOException(sb.toString());
        }
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.pos + read;
        this.pos = j2;
        long j3 = this.max;
        if (j3 < 0 || j2 < j3) {
            return read;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Exceeded configured input limit of ");
        sb2.append(this.max);
        sb2.append(" bytes");
        throw new java.io.IOException(sb2.toString());
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long j2 = this.max;
        if (j2 >= 0) {
            j = java.lang.Math.min(j, j2 - this.pos);
        }
        long skip = this.in.skip(j);
        this.pos += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            return this.in.available();
        }
        return 0;
    }

    public java.lang.String toString() {
        return this.in.toString();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.propagateClose) {
            this.in.close();
        }
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            this.in.reset();
            this.pos = this.mark;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.in.mark(i);
            this.mark = this.pos;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }
}
