package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class BoundaryLimitedInputStream extends java.io.InputStream {
    private int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private int getOutputFormats;
    private final java.io.InputStream getOutputMinFrameDuration;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;
    private boolean Camera2StreamConfigurationMap = false;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read() throws java.io.IOException {
        int read;
        int read2;
        int read3;
        if (this.Camera2StreamConfigurationMap) {
            return -1;
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i < i2) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i3 = i + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            read = bArr[i] & 255;
            if (i3 < i2) {
                return read;
            }
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        } else {
            read = this.getOutputMinFrameDuration.read();
        }
        this.getOutputFormats = read;
        if (read < 0) {
            return -1;
        }
        if (read == 13 || read == 10) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            if (read == 13) {
                read2 = this.getOutputMinFrameDuration.read();
                if (read2 == 10) {
                    byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
                    int i4 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = i4 + 1;
                    bArr2[i4] = 10;
                }
                if (read2 == 45) {
                    byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
                    int i5 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = i5 + 1;
                    bArr3[i5] = 45;
                    read2 = this.getOutputMinFrameDuration.read();
                }
                if (read2 != 45) {
                    byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                    int i6 = this.getHighSpeedVideoFpsRanges;
                    int i7 = i6 + 1;
                    this.getHighSpeedVideoFpsRanges = i7;
                    bArr4[i6] = 45;
                    while (true) {
                        if (this.getHighSpeedVideoFpsRanges - i7 == this.getHighSpeedVideoSizes.length || (read3 = this.getOutputMinFrameDuration.read()) < 0) {
                            break;
                        }
                        byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
                        int i8 = this.getHighSpeedVideoFpsRanges;
                        byte b = (byte) read3;
                        bArr5[i8] = b;
                        if (b != this.getHighSpeedVideoSizes[i8 - i7]) {
                            this.getHighSpeedVideoFpsRanges = i8 + 1;
                            break;
                        }
                        this.getHighSpeedVideoFpsRanges = i8 + 1;
                    }
                    if (this.getHighSpeedVideoFpsRanges - i7 == this.getHighSpeedVideoSizes.length) {
                        this.Camera2StreamConfigurationMap = true;
                        return -1;
                    }
                } else if (read2 >= 0) {
                    byte[] bArr6 = this.getHighSpeedVideoFpsRangesFor;
                    int i9 = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = i9 + 1;
                    bArr6[i9] = (byte) read2;
                }
            }
            read2 = this.getOutputMinFrameDuration.read();
            if (read2 == 45) {
            }
            if (read2 != 45) {
            }
        }
        return read;
    }

    public BoundaryLimitedInputStream(java.io.InputStream inputStream, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputMinFrameDuration = inputStream;
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Strings.toByteArray(str);
        this.getHighSpeedVideoFpsRangesFor = new byte[str.length() + 3];
        this.getHighSpeedVideoFpsRanges = 0;
    }
}
