package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
class SSHBuffer {
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges = 0;

    public final void getHighSpeedVideoFpsRanges() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i > this.getHighResolutionOutputSizeshNQ4ISI.length - Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalArgumentException("not enough data for block");
        }
        this.getHighSpeedVideoFpsRanges = i + Camera2StreamConfigurationMap;
    }

    public final int Camera2StreamConfigurationMap() {
        int i = this.getHighSpeedVideoFpsRanges;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i > bArr.length - 4) {
            throw new java.lang.IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.getHighSpeedVideoFpsRanges = i + 4;
        return (bArr[i2] & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
    }

    public final byte[] getHighSpeedVideoSizes() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == 0) {
            return new byte[0];
        }
        int i = this.getHighSpeedVideoFpsRanges;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i > bArr.length - Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalArgumentException("not enough data for block");
        }
        int i2 = Camera2StreamConfigurationMap + i;
        this.getHighSpeedVideoFpsRanges = i2;
        return org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i2);
    }

    public final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        int i = this.getHighSpeedVideoFpsRanges;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = Camera2StreamConfigurationMap + i;
        if (i2 > bArr.length) {
            throw new java.lang.IllegalArgumentException("not enough data for big num");
        }
        this.getHighSpeedVideoFpsRanges = i2;
        return new java.math.BigInteger(1, org.bouncycastle.util.Arrays.copyOfRange(bArr, i, i2));
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                throw new java.lang.IllegalArgumentException("magic-number incorrect");
            }
        }
        this.getHighSpeedVideoFpsRanges += bArr.length;
    }

    public SSHBuffer(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
