package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class PoolingByteArrayOutputStream extends java.io.ByteArrayOutputStream {
    private final com.android.volley.toolbox.ByteArrayPool getHighSpeedVideoFpsRangesFor;

    public PoolingByteArrayOutputStream(com.android.volley.toolbox.ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 256);
    }

    public PoolingByteArrayOutputStream(com.android.volley.toolbox.ByteArrayPool byteArrayPool, int i) {
        this.getHighSpeedVideoFpsRangesFor = byteArrayPool;
        this.buf = byteArrayPool.getBuf(java.lang.Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.returnBuf(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.getHighSpeedVideoFpsRangesFor.returnBuf(this.buf);
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] buf = this.getHighSpeedVideoFpsRangesFor.getBuf((this.count + i) * 2);
        java.lang.System.arraycopy(this.buf, 0, buf, 0, this.count);
        this.getHighSpeedVideoFpsRangesFor.returnBuf(this.buf);
        this.buf = buf;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            getHighSpeedVideoFpsRanges(i2);
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        synchronized (this) {
            getHighSpeedVideoFpsRanges(1);
            super.write(i);
        }
    }
}
