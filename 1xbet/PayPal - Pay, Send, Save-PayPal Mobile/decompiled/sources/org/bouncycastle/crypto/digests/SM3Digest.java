package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SM3Digest extends org.bouncycastle.crypto.digests.GeneralDigest {
    private static final int[] getHighSpeedVideoFpsRangesFor = new int[64];
    private int[] Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            i = 16;
            if (i2 >= 16) {
                break;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = this.Camera2StreamConfigurationMap[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = iArr[i3 - 3];
            int i5 = iArr[i3 - 13];
            int i6 = ((i4 << 15) | (i4 >>> 17)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9]);
            iArr[i3] = (((i5 << 7) | (i5 >>> 25)) ^ (((i6 >>> 9) | (i6 << 23)) ^ (((i6 << 15) | (i6 >>> 17)) ^ i6))) ^ iArr[i3 - 6];
        }
        int[] iArr2 = this.getHighSpeedVideoFpsRanges;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        int i11 = iArr2[4];
        int i12 = iArr2[5];
        int i13 = iArr2[6];
        int i14 = iArr2[7];
        int i15 = 0;
        while (i15 < i) {
            int i16 = (i7 << 12) | (i7 >>> 20);
            int i17 = i16 + i11 + getHighSpeedVideoFpsRangesFor[i15];
            int i18 = (i17 << 7) | (i17 >>> 25);
            int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i19 = iArr3[i15];
            int i20 = iArr3[i15 + 4];
            int i21 = ((i11 ^ i12) ^ i13) + i14 + i18 + i19;
            i15++;
            int i22 = ((i7 ^ i8) ^ i9) + i10 + (i18 ^ i16) + (i19 ^ i20);
            i10 = i9;
            i9 = (i8 << 9) | (i8 >>> 23);
            i8 = i7;
            i7 = i22;
            i = 16;
            int i23 = i11;
            i11 = (i21 ^ ((i21 << 9) | (i21 >>> 23))) ^ ((i21 << 17) | (i21 >>> 15));
            i14 = i13;
            i13 = (i12 << 19) | (i12 >>> 13);
            i12 = i23;
        }
        int i24 = i14;
        int i25 = i7;
        int i26 = i13;
        int i27 = 16;
        while (i27 < 64) {
            int i28 = (i25 << 12) | (i25 >>> 20);
            int i29 = i28 + i11 + getHighSpeedVideoFpsRangesFor[i27];
            int i30 = (i29 << 7) | (i29 >>> 25);
            int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i31 = iArr4[i27];
            int i32 = iArr4[i27 + 4];
            int i33 = (i25 & (i8 | i9)) | (i8 & i9);
            int i34 = (((~i11) & i26) | (i12 & i11)) + i24 + i30 + i31;
            int i35 = (((i34 << 9) | (i34 >>> 23)) ^ i34) ^ ((i34 << 17) | (i34 >>> 15));
            i27++;
            int i36 = (i8 >>> 23) | (i8 << 9);
            int i37 = (i12 << 19) | (i12 >>> 13);
            i12 = i11;
            i11 = i35;
            i24 = i26;
            i26 = i37;
            i8 = i25;
            i25 = i33 + i10 + (i30 ^ i28) + (i31 ^ i32);
            i10 = i9;
            i9 = i36;
        }
        int[] iArr5 = this.getHighSpeedVideoFpsRanges;
        iArr5[0] = i25 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i8;
        iArr5[2] = iArr5[2] ^ i9;
        iArr5[3] = iArr5[3] ^ i10;
        iArr5[4] = iArr5[4] ^ i11;
        iArr5[5] = iArr5[5] ^ i12;
        iArr5[6] = i26 ^ iArr5[6];
        iArr5[7] = i24 ^ iArr5[7];
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.SM3Digest sM3Digest = (org.bouncycastle.crypto.digests.SM3Digest) memoable;
        super.copyIn(sM3Digest);
        getHighSpeedVideoFpsRangesFor(sM3Digest);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoSizes;
        iArr[i2] = (b4 & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getHighSpeedVideoSizes = i3;
        if (i3 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        int i = this.getHighSpeedVideoSizes;
        if (i > 14) {
            this.Camera2StreamConfigurationMap[i] = 0;
            this.getHighSpeedVideoSizes = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 >= 14) {
                int[] iArr = this.Camera2StreamConfigurationMap;
                iArr[i2] = (int) (j >>> 32);
                this.getHighSpeedVideoSizes = i2 + 2;
                iArr[i2 + 1] = (int) j;
                return;
            }
            this.Camera2StreamConfigurationMap[i2] = 0;
            this.getHighSpeedVideoSizes = i2 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SM3Digest(this);
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.digests.SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.getHighSpeedVideoFpsRanges;
        int[] iArr2 = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.Camera2StreamConfigurationMap;
        int[] iArr4 = this.Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.getHighSpeedVideoSizes = sM3Digest.getHighSpeedVideoSizes;
    }

    public SM3Digest(org.bouncycastle.crypto.digests.SM3Digest sM3Digest) {
        super(sM3Digest);
        this.getHighSpeedVideoFpsRanges = new int[8];
        this.Camera2StreamConfigurationMap = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = new int[68];
        getHighSpeedVideoFpsRangesFor(sM3Digest);
    }

    public SM3Digest() {
        this.getHighSpeedVideoFpsRanges = new int[8];
        this.Camera2StreamConfigurationMap = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = new int[68];
        reset();
    }

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            getHighSpeedVideoFpsRangesFor[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            getHighSpeedVideoFpsRangesFor[i] = (2055708042 << i3) | (2055708042 >>> (32 - i3));
        }
    }
}
