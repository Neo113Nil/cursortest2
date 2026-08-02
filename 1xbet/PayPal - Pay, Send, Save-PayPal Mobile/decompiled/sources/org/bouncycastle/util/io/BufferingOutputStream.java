package org.bouncycastle.util.io;

/* loaded from: classes17.dex */
public class BufferingOutputStream extends java.io.OutputStream {
    private int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final java.io.OutputStream getHighSpeedVideoSizes;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] bArr2;
        byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
        int length = bArr3.length;
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i2 < length - i3) {
            java.lang.System.arraycopy(bArr, i, bArr3, i3, i2);
        } else {
            int length2 = bArr3.length - i3;
            java.lang.System.arraycopy(bArr, i, bArr3, i3, length2);
            this.getHighSpeedVideoFpsRanges += length2;
            flush();
            int i4 = i + length2;
            i2 -= length2;
            while (true) {
                bArr2 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 < bArr2.length) {
                    break;
                }
                this.getHighSpeedVideoSizes.write(bArr, i4, bArr2.length);
                byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                i4 += bArr4.length;
                i2 -= bArr4.length;
            }
            if (i2 <= 0) {
                return;
            } else {
                java.lang.System.arraycopy(bArr, i4, bArr2, this.getHighSpeedVideoFpsRanges, i2);
            }
        }
        this.getHighSpeedVideoFpsRanges += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 + 1;
        this.getHighSpeedVideoFpsRanges = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.getHighSpeedVideoSizes.write(this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = 0;
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        flush();
        this.getHighSpeedVideoSizes.close();
    }

    public BufferingOutputStream(java.io.OutputStream outputStream, int i) {
        this.getHighSpeedVideoSizes = outputStream;
        this.getHighSpeedVideoFpsRangesFor = new byte[i];
    }

    public BufferingOutputStream(java.io.OutputStream outputStream) {
        this.getHighSpeedVideoSizes = outputStream;
        this.getHighSpeedVideoFpsRangesFor = new byte[4096];
    }
}
