package com.google.common.io;

/* loaded from: classes9.dex */
public final class CountingOutputStream extends java.io.FilterOutputStream {
    private long count;

    public CountingOutputStream(java.io.OutputStream outputStream) {
        super((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(outputStream));
    }

    public final long getCount() {
        return this.count;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
        this.count += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.out.write(i);
        this.count++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.out.close();
    }
}
