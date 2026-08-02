package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
    final java.io.OutputStream getHighSpeedVideoFpsRangesFor;
    java.nio.ByteOrder getHighSpeedVideoSizes;

    ByteOrderedDataOutputStream(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        super(outputStream);
        this.getHighSpeedVideoFpsRangesFor = outputStream;
        this.getHighSpeedVideoSizes = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(short s) throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.getHighSpeedVideoFpsRangesFor.write(s & 255);
            this.getHighSpeedVideoFpsRangesFor.write((s >>> 8) & 255);
        } else if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
            this.getHighSpeedVideoFpsRangesFor.write((s >>> 8) & 255);
            this.getHighSpeedVideoFpsRangesFor.write(s & 255);
        }
    }

    public final void getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.getHighSpeedVideoFpsRangesFor.write(i & 255);
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 8) & 255);
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 16) & 255);
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 24) & 255);
            return;
        }
        if (this.getHighSpeedVideoSizes == java.nio.ByteOrder.BIG_ENDIAN) {
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 24) & 255);
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 16) & 255);
            this.getHighSpeedVideoFpsRangesFor.write((i >>> 8) & 255);
            this.getHighSpeedVideoFpsRangesFor.write(i & 255);
        }
    }
}
