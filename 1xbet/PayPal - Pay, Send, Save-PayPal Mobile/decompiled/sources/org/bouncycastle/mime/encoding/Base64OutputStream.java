package org.bouncycastle.mime.encoding;

/* loaded from: classes17.dex */
public class Base64OutputStream extends java.io.FilterOutputStream {
    private static final org.bouncycastle.util.encoders.Base64Encoder getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.util.encoders.Base64Encoder();
    private int Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = i2 + 1;
        this.Camera2StreamConfigurationMap = i3;
        bArr[i2] = (byte) i;
        if (i3 == 54) {
            getHighResolutionOutputSizeshNQ4ISI.encode(bArr, 0, 54, this.getHighSpeedVideoFpsRangesFor, 0);
            this.out.write(this.getHighSpeedVideoFpsRangesFor, 0, 74);
            this.Camera2StreamConfigurationMap = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = 54 - i3;
        if (i2 < i4) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, i3, i2);
            this.Camera2StreamConfigurationMap += i2;
            return;
        }
        if (i3 > 0) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, i3, i4);
            getHighResolutionOutputSizeshNQ4ISI.encode(this.getHighSpeedVideoFpsRanges, 0, 54, this.getHighSpeedVideoFpsRangesFor, 0);
            this.out.write(this.getHighSpeedVideoFpsRangesFor, 0, 74);
        } else {
            i4 = 0;
        }
        while (true) {
            int i5 = i2 - i4;
            if (i5 < 54) {
                java.lang.System.arraycopy(bArr, i + i4, this.getHighSpeedVideoFpsRanges, 0, i5);
                this.Camera2StreamConfigurationMap = i5;
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI.encode(bArr, i + i4, 54, this.getHighSpeedVideoFpsRangesFor, 0);
                this.out.write(this.getHighSpeedVideoFpsRangesFor, 0, 74);
                i4 += 54;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        int i = this.Camera2StreamConfigurationMap;
        if (i > 0) {
            int encode = getHighResolutionOutputSizeshNQ4ISI.encode(this.getHighSpeedVideoFpsRanges, 0, i, this.getHighSpeedVideoFpsRangesFor, 0);
            this.Camera2StreamConfigurationMap = 0;
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            bArr[encode] = 13;
            bArr[encode + 1] = 10;
            this.out.write(this.getHighSpeedVideoFpsRangesFor, 0, encode + 2);
        }
        this.out.close();
    }

    public Base64OutputStream(java.io.OutputStream outputStream) {
        super(outputStream);
        this.getHighSpeedVideoFpsRanges = new byte[54];
        byte[] bArr = new byte[74];
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.Camera2StreamConfigurationMap = 0;
        bArr[72] = 13;
        bArr[73] = 10;
    }
}
