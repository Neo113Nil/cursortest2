package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA1Digest extends org.bouncycastle.crypto.digests.GeneralDigest implements org.bouncycastle.crypto.digests.EncodableDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int[] getHighSpeedVideoSizesFor;
    private int getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.getHighSpeedVideoSizesFor;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 << 1) | (i2 >>> 31);
        }
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = this.getHighSpeedVideoFpsRanges;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = this.Camera2StreamConfigurationMap;
        int i7 = this.getHighSpeedVideoFpsRangesFor;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = ((i3 << 5) | (i3 >>> 27)) + (((~i4) & i6) | (i5 & i4));
            int[] iArr2 = this.getHighSpeedVideoSizesFor;
            int i11 = i7 + i10 + iArr2[i9] + 1518500249;
            int i12 = (i4 << 30) | (i4 >>> 2);
            int i13 = i6 + ((i11 << 5) | (i11 >>> 27)) + (((~i3) & i5) | (i12 & i3)) + iArr2[i9 + 1] + 1518500249;
            int i14 = (i3 << 30) | (i3 >>> 2);
            int i15 = i5 + ((i13 << 5) | (i13 >>> 27)) + (((~i11) & i12) | (i14 & i11)) + iArr2[i9 + 2] + 1518500249;
            i7 = (i11 << 30) | (i11 >>> 2);
            i4 = i12 + ((i15 << 5) | (i15 >>> 27)) + (((~i13) & i14) | (i7 & i13)) + iArr2[i9 + 3] + 1518500249;
            i6 = (i13 << 30) | (i13 >>> 2);
            i3 = i14 + ((i4 << 5) | (i4 >>> 27)) + (((~i15) & i7) | (i6 & i15)) + iArr2[i9 + 4] + 1518500249;
            i5 = (i15 << 30) | (i15 >>> 2);
            i8++;
            i9 += 5;
        }
        int i16 = 0;
        while (i16 < 4) {
            int[] iArr3 = this.getHighSpeedVideoSizesFor;
            int i17 = i7 + ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6) + iArr3[i9] + 1859775393;
            int i18 = (i4 << 30) | (i4 >>> 2);
            int i19 = i6 + ((i17 << 5) | (i17 >>> 27)) + ((i3 ^ i18) ^ i5) + iArr3[i9 + 1] + 1859775393;
            int i20 = (i3 << 30) | (i3 >>> 2);
            int i21 = i5 + ((i19 << 5) | (i19 >>> 27)) + ((i17 ^ i20) ^ i18) + iArr3[i9 + 2] + 1859775393;
            i7 = (i17 << 30) | (i17 >>> 2);
            i4 = i18 + ((i21 << 5) | (i21 >>> 27)) + ((i19 ^ i7) ^ i20) + iArr3[i9 + 3] + 1859775393;
            i6 = (i19 << 30) | (i19 >>> 2);
            i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + ((i21 ^ i6) ^ i7) + iArr3[i9 + 4] + 1859775393;
            i5 = (i21 << 30) | (i21 >>> 2);
            i16++;
            i9 += 5;
        }
        int i22 = 0;
        while (i22 < 4) {
            int[] iArr4 = this.getHighSpeedVideoSizesFor;
            int i23 = i7 + (((((i3 << 5) | (i3 >>> 27)) + (((i5 | i6) & i4) | (i5 & i6))) + iArr4[i9]) - 1894007588);
            int i24 = (i4 << 30) | (i4 >>> 2);
            int i25 = i6 + (((((i23 << 5) | (i23 >>> 27)) + (((i24 | i5) & i3) | (i24 & i5))) + iArr4[i9 + 1]) - 1894007588);
            int i26 = (i3 << 30) | (i3 >>> 2);
            int i27 = i5 + (((((i25 << 5) | (i25 >>> 27)) + (((i26 | i24) & i23) | (i26 & i24))) + iArr4[i9 + 2]) - 1894007588);
            i7 = (i23 << 30) | (i23 >>> 2);
            i4 = i24 + (((((i27 << 5) | (i27 >>> 27)) + (((i7 | i26) & i25) | (i7 & i26))) + iArr4[i9 + 3]) - 1894007588);
            i6 = (i25 << 30) | (i25 >>> 2);
            i3 = i26 + (((((i4 << 5) | (i4 >>> 27)) + (((i6 | i7) & i27) | (i6 & i7))) + iArr4[i9 + 4]) - 1894007588);
            i5 = (i27 << 30) | (i27 >>> 2);
            i22++;
            i9 += 5;
        }
        int i28 = 0;
        while (i28 <= 3) {
            int[] iArr5 = this.getHighSpeedVideoSizesFor;
            int i29 = i7 + (((((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6)) + iArr5[i9]) - 899497514);
            int i30 = (i4 << 30) | (i4 >>> 2);
            int i31 = i6 + (((((i29 << 5) | (i29 >>> 27)) + ((i3 ^ i30) ^ i5)) + iArr5[i9 + 1]) - 899497514);
            int i32 = (i3 << 30) | (i3 >>> 2);
            int i33 = i5 + (((((i31 << 5) | (i31 >>> 27)) + ((i29 ^ i32) ^ i30)) + iArr5[i9 + 2]) - 899497514);
            i7 = (i29 << 30) | (i29 >>> 2);
            i4 = i30 + (((((i33 << 5) | (i33 >>> 27)) + ((i31 ^ i7) ^ i32)) + iArr5[i9 + 3]) - 899497514);
            i6 = (i31 << 30) | (i31 >>> 2);
            i3 = i32 + (((((i4 << 5) | (i4 >>> 27)) + ((i33 ^ i6) ^ i7)) + iArr5[i9 + 4]) - 899497514);
            i5 = (i33 << 30) | (i33 >>> 2);
            i28++;
            i9 += 5;
        }
        this.getHighSpeedVideoSizes += i3;
        this.getHighSpeedVideoFpsRanges += i4;
        this.getHighResolutionOutputSizeshNQ4ISI += i5;
        this.Camera2StreamConfigurationMap += i6;
        this.getHighSpeedVideoFpsRangesFor += i7;
        this.getInputSizeshNQ4ISI = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            this.getHighSpeedVideoSizesFor[i34] = 0;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest = (org.bouncycastle.crypto.digests.SHA1Digest) memoable;
        super.copyIn(sHA1Digest);
        Camera2StreamConfigurationMap(sHA1Digest);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighSpeedVideoSizes = 1732584193;
        this.getHighSpeedVideoFpsRanges = -271733879;
        this.getHighResolutionOutputSizeshNQ4ISI = -1732584194;
        this.Camera2StreamConfigurationMap = 271733878;
        this.getHighSpeedVideoFpsRangesFor = -1009589776;
        this.getInputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizesFor;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.getHighSpeedVideoSizesFor;
        int i2 = this.getInputSizeshNQ4ISI;
        iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getInputSizeshNQ4ISI = i3;
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getInputSizeshNQ4ISI > 14) {
            processBlock();
        }
        int[] iArr = this.getHighSpeedVideoSizesFor;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.getInputSizeshNQ4ISI * 4) + 40];
        super.populateState(bArr);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, bArr, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 24);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr, 28);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, 32);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputSizeshNQ4ISI, bArr, 36);
        for (int i = 0; i != this.getInputSizeshNQ4ISI; i++) {
            org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizesFor[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, bArr, i);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, i + 4);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 8);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr, i + 12);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA1Digest(this);
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest) {
        this.getHighSpeedVideoSizes = sHA1Digest.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = sHA1Digest.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = sHA1Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = sHA1Digest.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = sHA1Digest.getHighSpeedVideoFpsRangesFor;
        int[] iArr = sHA1Digest.getHighSpeedVideoSizesFor;
        java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoSizesFor, 0, iArr.length);
        this.getInputSizeshNQ4ISI = sHA1Digest.getInputSizeshNQ4ISI;
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.getHighSpeedVideoSizesFor = new int[80];
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 16);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 20);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 24);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 28);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 32);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.getInputSizeshNQ4ISI; i++) {
            this.getHighSpeedVideoSizesFor[i] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    public SHA1Digest(org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.getHighSpeedVideoSizesFor = new int[80];
        Camera2StreamConfigurationMap(sHA1Digest);
    }

    public SHA1Digest() {
        this.getHighSpeedVideoSizesFor = new int[80];
        reset();
    }
}
