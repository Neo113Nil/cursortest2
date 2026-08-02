package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public class XXHash32 implements java.util.zip.Checksum {
    private final byte[] Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private boolean getInputFormats;

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public XXHash32() {
        this(0);
    }

    public XXHash32(int i) {
        this.Camera2StreamConfigurationMap = new byte[1];
        this.getHighResolutionOutputSizeshNQ4ISI = new int[4];
        this.getHighSpeedVideoSizes = new byte[16];
        this.getHighSpeedVideoFpsRanges = i;
        getHighSpeedVideoSizes();
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int i;
        int i2 = 0;
        if (this.getInputFormats) {
            i = java.lang.Integer.rotateLeft(this.getHighResolutionOutputSizeshNQ4ISI[0], 1) + java.lang.Integer.rotateLeft(this.getHighResolutionOutputSizeshNQ4ISI[1], 7) + java.lang.Integer.rotateLeft(this.getHighResolutionOutputSizeshNQ4ISI[2], 12) + java.lang.Integer.rotateLeft(this.getHighResolutionOutputSizeshNQ4ISI[3], 18);
        } else {
            i = this.getHighResolutionOutputSizeshNQ4ISI[2] + 374761393;
        }
        int i3 = i + this.getHighSpeedVideoSizesFor;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        while (i2 <= i4 - 4) {
            i3 = java.lang.Integer.rotateLeft(i3 + (getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, i2) * (-1028477379)), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.getHighSpeedVideoFpsRangesFor) {
            i3 = java.lang.Integer.rotateLeft(i3 + ((this.getHighSpeedVideoSizes[i2] & 255) * 374761393), 11) * (-1640531535);
            i2++;
        }
        int i5 = (i3 ^ (i3 >>> 15)) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return (i6 ^ (i6 >>> 16)) & 4294967295L;
    }

    private void getHighSpeedVideoSizes() {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoFpsRanges;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i + 1640531535;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int rotateLeft = java.lang.Integer.rotateLeft(i2 + (getHighResolutionOutputSizeshNQ4ISI(bArr, i) * (-2048144777)), 13);
        int rotateLeft2 = java.lang.Integer.rotateLeft(i3 + (getHighResolutionOutputSizeshNQ4ISI(bArr, i + 4) * (-2048144777)), 13);
        int rotateLeft3 = java.lang.Integer.rotateLeft(i4 + (getHighResolutionOutputSizeshNQ4ISI(bArr, i + 8) * (-2048144777)), 13);
        int rotateLeft4 = java.lang.Integer.rotateLeft(i5 + (getHighResolutionOutputSizeshNQ4ISI(bArr, i + 12) * (-2048144777)), 13);
        int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        iArr2[0] = rotateLeft * (-1640531535);
        iArr2[1] = rotateLeft2 * (-1640531535);
        iArr2[2] = rotateLeft3 * (-1640531535);
        iArr2[3] = rotateLeft4 * (-1640531535);
        this.getInputFormats = true;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        getHighSpeedVideoSizes();
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getInputFormats = false;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.getHighSpeedVideoSizesFor += i2;
        int i3 = i + i2;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        if ((i4 + i2) - 16 < 0) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i4, i2);
            this.getHighSpeedVideoFpsRangesFor += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = 16 - i4;
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i4, i5);
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, 0);
            i += i5;
        }
        while (i <= i3 - 16) {
            getHighSpeedVideoFpsRanges(bArr, i);
            i += 16;
        }
        if (i < i3) {
            int i6 = i3 - i;
            this.getHighSpeedVideoFpsRangesFor = i6;
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, 0, i6);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }
}
