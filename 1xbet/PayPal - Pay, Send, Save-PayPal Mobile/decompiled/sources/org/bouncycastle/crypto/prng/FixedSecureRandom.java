package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class FixedSecureRandom extends java.security.SecureRandom {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;

    @Override // java.util.Random
    public int nextInt() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = i + 2;
        this.Camera2StreamConfigurationMap = i3;
        int i4 = ((bArr[i + 1] & 255) << 16) | i2;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i5 == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = i5 - 1;
        } else {
            this.Camera2StreamConfigurationMap = i + 3;
            i4 |= (bArr[i3] & 255) << 8;
        }
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i6 == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = i6 - 1;
            return i4;
        }
        int i7 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i7 + 1;
        return (bArr[i7] & 255) | i4;
    }

    @Override // java.util.Random
    public long nextLong() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.Camera2StreamConfigurationMap = i + 8;
        return (bArr[i2] & 255) | j;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, bArr, 0, bArr.length);
        this.Camera2StreamConfigurationMap += bArr.length;
    }

    public boolean isExhausted() {
        return this.Camera2StreamConfigurationMap == this.getHighSpeedVideoFpsRangesFor.length;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(boolean z, byte[][] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (int i = 0; i != bArr.length; i++) {
            try {
                byteArrayOutputStream.write(bArr[i]);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.getHighSpeedVideoFpsRangesFor = byteArray;
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(boolean z, byte[] bArr) {
        this(z, new byte[][]{bArr});
    }
}
