package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Blake2sDigest implements org.bouncycastle.crypto.ExtendedDigest {
    private static final int[] Camera2StreamConfigurationMap = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] getHighSpeedVideoSizes = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI}, new byte[]{14, 10, 4, 8, 9, com.google.common.base.Ascii.SI, 13, 6, 1, com.google.common.base.Ascii.FF, 0, 2, com.google.common.base.Ascii.VT, 7, 5, 3}, new byte[]{com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.FF, 0, 5, 2, com.google.common.base.Ascii.SI, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 14, 2, 6, 5, 10, 4, 0, com.google.common.base.Ascii.SI, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, com.google.common.base.Ascii.SI, 14, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 6, 8, 3, 13}, new byte[]{2, com.google.common.base.Ascii.FF, 6, 10, 0, com.google.common.base.Ascii.VT, 8, 3, 4, 13, 7, 5, com.google.common.base.Ascii.SI, 14, 1, 9}, new byte[]{com.google.common.base.Ascii.FF, 5, 1, com.google.common.base.Ascii.SI, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, com.google.common.base.Ascii.VT}, new byte[]{13, com.google.common.base.Ascii.VT, 7, 14, com.google.common.base.Ascii.FF, 1, 3, 9, 5, 0, com.google.common.base.Ascii.SI, 4, 8, 6, 2, 10}, new byte[]{6, com.google.common.base.Ascii.SI, 14, 9, com.google.common.base.Ascii.VT, 3, 0, 8, com.google.common.base.Ascii.FF, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 9, 14, 3, com.google.common.base.Ascii.FF, 13, 0}};
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private int[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private long isOutputSupportedForhNQ4ISI;
    private int toString;
    private byte[] unwrapAs;

    private void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.getOutputStallDurationlomOqCM;
        int i7 = iArr[i3] + iArr[i4] + i;
        iArr[i3] = i7;
        int i8 = iArr[i6] ^ i7;
        int i9 = (i8 >>> 16) | (i8 << 16);
        iArr[i6] = i9;
        int i10 = iArr[i5] + i9;
        iArr[i5] = i10;
        int i11 = iArr[i4] ^ i10;
        int i12 = (i11 >>> 12) | (i11 << 20);
        iArr[i4] = i12;
        int i13 = iArr[i3] + i12 + i2;
        iArr[i3] = i13;
        int i14 = iArr[i6] ^ i13;
        int i15 = (i14 >>> 8) | (i14 << 24);
        iArr[i6] = i15;
        int i16 = iArr[i5] + i15;
        iArr[i5] = i16;
        int i17 = iArr[i4] ^ i16;
        iArr[i4] = (i17 >>> 7) | (i17 << 25);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = 0;
        java.lang.System.arraycopy(iArr, 0, this.getOutputStallDurationlomOqCM, 0, iArr.length);
        int[] iArr2 = Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(iArr2, 0, this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI.length, 4);
        int[] iArr3 = this.getOutputStallDurationlomOqCM;
        iArr3[12] = this.getValidOutputFormatsForInputhNQ4ISI ^ iArr2[4];
        iArr3[13] = this.toString ^ iArr2[5];
        iArr3[14] = this.getHighSpeedVideoSizesFor ^ iArr2[6];
        iArr3[15] = iArr2[7];
        int[] iArr4 = new int[16];
        for (int i3 = 0; i3 < 16; i3++) {
            iArr4[i3] = org.bouncycastle.util.Pack.littleEndianToInt(bArr, (i3 * 4) + i);
        }
        int i4 = 0;
        while (i4 < 10) {
            byte[][] bArr2 = getHighSpeedVideoSizes;
            byte[] bArr3 = bArr2[i4];
            int i5 = i4;
            int[] iArr5 = iArr4;
            Camera2StreamConfigurationMap(iArr4[bArr3[0]], iArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr4[2]], iArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr5[4]], iArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr6[6]], iArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr7[8]], iArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr8[10]], iArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr9[12]], iArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i5];
            Camera2StreamConfigurationMap(iArr5[bArr10[14]], iArr5[bArr10[15]], 3, 4, 9, 14);
            i4 = i5 + 1;
            iArr4 = iArr5;
        }
        while (true) {
            int[] iArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 >= iArr6.length) {
                return;
            }
            int i6 = iArr6[i2];
            int[] iArr7 = this.getOutputStallDurationlomOqCM;
            iArr6[i2] = (i6 ^ iArr7[i2]) ^ iArr7[i2 + 8];
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.getHighSpeedVideoFpsRanges;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4, i2);
                this.getHighSpeedVideoFpsRanges += i2;
            }
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4, i3);
            int i5 = this.getValidOutputFormatsForInputhNQ4ISI + 64;
            this.getValidOutputFormatsForInputhNQ4ISI = i5;
            if (i5 == 0) {
                this.toString++;
            }
            Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0);
            this.getHighSpeedVideoFpsRanges = 0;
            org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        } else {
            i3 = 0;
        }
        int i6 = i2 + i;
        int i7 = i + i3;
        while (i7 < i6 - 64) {
            int i8 = this.getValidOutputFormatsForInputhNQ4ISI + 64;
            this.getValidOutputFormatsForInputhNQ4ISI = i8;
            if (i8 == 0) {
                this.toString++;
            }
            Camera2StreamConfigurationMap(bArr, i7);
            i7 += 64;
        }
        i2 = i6 - i7;
        java.lang.System.arraycopy(bArr, i7, this.getHighSpeedVideoFpsRangesFor, 0, i2);
        this.getHighSpeedVideoFpsRanges += i2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.getHighSpeedVideoFpsRanges;
        if (64 - i != 0) {
            this.getHighSpeedVideoFpsRangesFor[i] = b;
            this.getHighSpeedVideoFpsRanges = i + 1;
            return;
        }
        int i2 = this.getValidOutputFormatsForInputhNQ4ISI + 64;
        this.getValidOutputFormatsForInputhNQ4ISI = i2;
        if (i2 == 0) {
            this.toString++;
        }
        Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        this.getHighSpeedVideoFpsRangesFor[0] = b;
        this.getHighSpeedVideoFpsRanges = 1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        byte[] bArr = this.getOutputStallDuration;
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRangesFor, 0, bArr.length);
            this.getHighSpeedVideoFpsRanges = 64;
        }
        getHighSpeedVideoSizes(this.isOutputSupportedFor, this.unwrapAs, this.getOutputStallDuration);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int[] iArr;
        int i2;
        this.getHighSpeedVideoSizesFor = -1;
        int i3 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i4 = this.getHighSpeedVideoFpsRanges;
        int i5 = i3 + i4;
        this.getValidOutputFormatsForInputhNQ4ISI = i5;
        if (i5 < 0 && i4 > (-i5)) {
            this.toString++;
        }
        Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getOutputStallDurationlomOqCM, 0);
        int i6 = 0;
        while (true) {
            iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i6 >= iArr.length || (i2 = i6 * 4) >= this.getInputSizeshNQ4ISI) {
                break;
            }
            byte[] intToLittleEndian = org.bouncycastle.util.Pack.intToLittleEndian(iArr[i6]);
            int i7 = this.getInputSizeshNQ4ISI;
            if (i2 < i7 - 4) {
                java.lang.System.arraycopy(intToLittleEndian, 0, bArr, i2 + i, 4);
            } else {
                java.lang.System.arraycopy(intToLittleEndian, 0, bArr, i + i2, i7 - i2);
            }
            i6++;
        }
        org.bouncycastle.util.Arrays.fill(iArr, 0);
        reset();
        return this.getInputSizeshNQ4ISI;
    }

    public void clearSalt() {
        byte[] bArr = this.isOutputSupportedFor;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    public void clearKey() {
        byte[] bArr = this.getOutputStallDuration;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
            org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }

    private void getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.getHighSpeedVideoFpsRangesFor = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new java.lang.IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.getOutputStallDuration = bArr4;
            java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.getOutputSizes = bArr3.length;
            java.lang.System.arraycopy(bArr3, 0, this.getHighSpeedVideoFpsRangesFor, 0, bArr3.length);
            this.getHighSpeedVideoFpsRanges = 64;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new int[]{r3[0] ^ ((this.getInputSizeshNQ4ISI | (this.getOutputSizes << 8)) | ((this.getInputFormats << 16) | (this.getOutputMinFrameDuration << 24))), r3[1] ^ this.getOutputSizeshNQ4ISI, ((int) r4) ^ r3[2], ((r1 | (this.getOutputMinFrameDurationlomOqCM << 16)) | (this.getOutputFormats << 24)) ^ r5, r3[4], r3[5], 0, 0};
            int[] iArr = Camera2StreamConfigurationMap;
            long j = this.isOutputSupportedForhNQ4ISI;
            int i = (int) (j >> 32);
            int i2 = iArr[3];
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new java.lang.IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.isOutputSupportedFor = bArr5;
                java.lang.System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                iArr2[4] = iArr2[4] ^ org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0);
                int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                iArr3[5] = org.bouncycastle.util.Pack.littleEndianToInt(bArr, 4) ^ iArr3[5];
            }
            int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            iArr4[6] = iArr[6];
            iArr4[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new java.lang.IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.unwrapAs = bArr6;
                java.lang.System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                iArr5[6] = iArr5[6] ^ org.bouncycastle.util.Pack.littleEndianToInt(bArr2, 0);
                int[] iArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                iArr6[7] = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, 4) ^ iArr6[7];
            }
        }
    }

    public Blake2sDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.getInputSizeshNQ4ISI = 32;
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getInputFormats = 1;
        this.getOutputMinFrameDuration = 1;
        this.getOutputSizeshNQ4ISI = 0;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        if (i <= 0 || i > 32) {
            throw new java.lang.IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.getInputSizeshNQ4ISI = i;
        getHighSpeedVideoSizes(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(byte[] bArr) {
        this.getInputSizeshNQ4ISI = 32;
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getInputFormats = 1;
        this.getOutputMinFrameDuration = 1;
        this.getOutputSizeshNQ4ISI = 0;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        getHighSpeedVideoSizes(null, null, bArr);
    }

    public Blake2sDigest(org.bouncycastle.crypto.digests.Blake2sDigest blake2sDigest) {
        this.getInputSizeshNQ4ISI = 32;
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getInputFormats = 1;
        this.getOutputMinFrameDuration = 1;
        this.getOutputSizeshNQ4ISI = 0;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoFpsRanges = blake2sDigest.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(blake2sDigest.getHighSpeedVideoFpsRangesFor);
        this.getOutputSizes = blake2sDigest.getOutputSizes;
        this.getOutputStallDuration = org.bouncycastle.util.Arrays.clone(blake2sDigest.getOutputStallDuration);
        this.getInputSizeshNQ4ISI = blake2sDigest.getInputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = org.bouncycastle.util.Arrays.clone(this.getOutputStallDurationlomOqCM);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(blake2sDigest.getHighResolutionOutputSizeshNQ4ISI);
        this.getValidOutputFormatsForInputhNQ4ISI = blake2sDigest.getValidOutputFormatsForInputhNQ4ISI;
        this.toString = blake2sDigest.toString;
        this.getHighSpeedVideoSizesFor = blake2sDigest.getHighSpeedVideoSizesFor;
        this.isOutputSupportedFor = org.bouncycastle.util.Arrays.clone(blake2sDigest.isOutputSupportedFor);
        this.unwrapAs = org.bouncycastle.util.Arrays.clone(blake2sDigest.unwrapAs);
        this.getInputFormats = blake2sDigest.getInputFormats;
        this.getOutputMinFrameDuration = blake2sDigest.getOutputMinFrameDuration;
        this.getOutputSizeshNQ4ISI = blake2sDigest.getOutputSizeshNQ4ISI;
        this.isOutputSupportedForhNQ4ISI = blake2sDigest.isOutputSupportedForhNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = blake2sDigest.getOutputMinFrameDurationlomOqCM;
        this.getOutputFormats = blake2sDigest.getOutputFormats;
    }

    Blake2sDigest(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getInputFormats = 1;
        this.getOutputMinFrameDuration = 1;
        this.getOutputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getInputSizeshNQ4ISI = 32;
        this.isOutputSupportedForhNQ4ISI = j;
        getHighSpeedVideoSizes(bArr2, bArr3, bArr);
    }

    Blake2sDigest(int i, long j) {
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getInputSizeshNQ4ISI = i;
        this.isOutputSupportedForhNQ4ISI = j;
        this.getInputFormats = 0;
        this.getOutputMinFrameDuration = 0;
        this.getOutputSizeshNQ4ISI = 32;
        this.getOutputFormats = 32;
        this.getOutputMinFrameDurationlomOqCM = 0;
        getHighSpeedVideoSizes(null, null, null);
    }

    public Blake2sDigest(int i) {
        this.getInputSizeshNQ4ISI = 32;
        this.getOutputSizes = 0;
        this.isOutputSupportedFor = null;
        this.unwrapAs = null;
        this.getOutputStallDuration = null;
        this.getInputFormats = 1;
        this.getOutputMinFrameDuration = 1;
        this.getOutputSizeshNQ4ISI = 0;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 0;
        this.toString = 0;
        this.getHighSpeedVideoSizesFor = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.getInputSizeshNQ4ISI = i / 8;
        getHighSpeedVideoSizes(null, null, null);
    }

    public Blake2sDigest() {
        this(256);
    }
}
