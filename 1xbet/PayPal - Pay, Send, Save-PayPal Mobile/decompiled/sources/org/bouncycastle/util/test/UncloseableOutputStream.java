package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class UncloseableOutputStream extends java.io.FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.RuntimeException("close() called on UncloseableOutputStream");
    }

    public UncloseableOutputStream(java.io.OutputStream outputStream) {
        super(outputStream);
    }
}
