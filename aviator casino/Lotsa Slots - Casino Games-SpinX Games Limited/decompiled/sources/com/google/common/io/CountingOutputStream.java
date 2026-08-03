package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class CountingOutputStream extends java.io.FilterOutputStream {
    private long count;

    public CountingOutputStream(java.io.OutputStream out) {
        super((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(out));
    }

    public long getCount() {
        return this.count;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b, int off, int len) throws java.io.IOException {
        this.out.write(b, off, len);
        this.count += len;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b) throws java.io.IOException {
        this.out.write(b);
        this.count++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
    }
}
