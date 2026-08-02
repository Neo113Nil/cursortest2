package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class BinaryOutputStream extends java.io.OutputStream {
    private java.nio.ByteOrder byteOrder;
    private int count;
    private final java.io.OutputStream os;

    public BinaryOutputStream(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.os = outputStream;
    }

    public BinaryOutputStream(java.io.OutputStream outputStream) {
        this.byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        this.os = outputStream;
    }

    protected void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.os.write(i);
        this.count++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        this.os.write(bArr, 0, bArr.length);
        this.count += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.os.write(bArr, i, i2);
        this.count += i2;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.os.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.os.close();
    }

    public int getByteCount() {
        return this.count;
    }

    public final void write4Bytes(int i) throws java.io.IOException {
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            write((i >> 24) & 255);
            write((i >> 16) & 255);
            write((i >> 8) & 255);
            write(i & 255);
            return;
        }
        write(i & 255);
        write((i >> 8) & 255);
        write((i >> 16) & 255);
        write((i >> 24) & 255);
    }

    public final void write3Bytes(int i) throws java.io.IOException {
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            write((i >> 16) & 255);
            write((i >> 8) & 255);
            write(i & 255);
        } else {
            write(i & 255);
            write((i >> 8) & 255);
            write((i >> 16) & 255);
        }
    }

    public final void write2Bytes(int i) throws java.io.IOException {
        if (this.byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            write((i >> 8) & 255);
            write(i & 255);
        } else {
            write(i & 255);
            write((i >> 8) & 255);
        }
    }
}
