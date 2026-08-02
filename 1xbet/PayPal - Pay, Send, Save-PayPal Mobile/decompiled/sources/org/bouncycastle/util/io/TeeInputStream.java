package org.bouncycastle.util.io;

/* loaded from: classes17.dex */
public class TeeInputStream extends java.io.InputStream {
    private final java.io.InputStream getHighSpeedVideoFpsRanges;
    private final java.io.OutputStream getHighSpeedVideoSizes;

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.getHighSpeedVideoFpsRanges.read(bArr, i, i2);
        if (read > 0) {
            this.getHighSpeedVideoSizes.write(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.getHighSpeedVideoFpsRanges.read();
        if (read >= 0) {
            this.getHighSpeedVideoSizes.write(read);
        }
        return read;
    }

    public java.io.OutputStream getOutputStream() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.close();
        this.getHighSpeedVideoSizes.close();
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.available();
    }

    public TeeInputStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        this.getHighSpeedVideoFpsRanges = inputStream;
        this.getHighSpeedVideoSizes = outputStream;
    }
}
