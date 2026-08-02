package org.bouncycastle.util.io;

/* loaded from: classes17.dex */
public class TeeOutputStream extends java.io.OutputStream {
    private java.io.OutputStream getHighSpeedVideoFpsRangesFor;
    private java.io.OutputStream getHighSpeedVideoSizes;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
        this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.getHighSpeedVideoSizes.write(bArr);
        this.getHighSpeedVideoFpsRangesFor.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.getHighSpeedVideoSizes.write(i);
        this.getHighSpeedVideoFpsRangesFor.write(i);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.getHighSpeedVideoSizes.flush();
        this.getHighSpeedVideoFpsRangesFor.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.getHighSpeedVideoSizes.close();
        this.getHighSpeedVideoFpsRangesFor.close();
    }

    public TeeOutputStream(java.io.OutputStream outputStream, java.io.OutputStream outputStream2) {
        this.getHighSpeedVideoSizes = outputStream;
        this.getHighSpeedVideoFpsRangesFor = outputStream2;
    }
}
