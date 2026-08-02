package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Blake2bDigest implements org.bouncycastle.crypto.ExtendedDigest {
    private static final long[] getHighResolutionOutputSizeshNQ4ISI = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] getHighSpeedVideoFpsRangesFor = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI}, new byte[]{14, 10, 4, 8, 9, com.google.common.base.Ascii.SI, 13, 6, 1, com.google.common.base.Ascii.FF, 0, 2, com.google.common.base.Ascii.VT, 7, 5, 3}, new byte[]{com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.FF, 0, 5, 2, com.google.common.base.Ascii.SI, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 14, 2, 6, 5, 10, 4, 0, com.google.common.base.Ascii.SI, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, com.google.common.base.Ascii.SI, 14, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 6, 8, 3, 13}, new byte[]{2, com.google.common.base.Ascii.FF, 6, 10, 0, com.google.common.base.Ascii.VT, 8, 3, 4, 13, 7, 5, com.google.common.base.Ascii.SI, 14, 1, 9}, new byte[]{com.google.common.base.Ascii.FF, 5, 1, com.google.common.base.Ascii.SI, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, com.google.common.base.Ascii.VT}, new byte[]{13, com.google.common.base.Ascii.VT, 7, 14, com.google.common.base.Ascii.FF, 1, 3, 9, 5, 0, com.google.common.base.Ascii.SI, 4, 8, 6, 2, 10}, new byte[]{6, com.google.common.base.Ascii.SI, 14, 9, com.google.common.base.Ascii.VT, 3, 0, 8, com.google.common.base.Ascii.FF, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 9, 14, 3, com.google.common.base.Ascii.FF, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 14, com.google.common.base.Ascii.SI}, new byte[]{14, 10, 4, 8, 9, com.google.common.base.Ascii.SI, 13, 6, 1, com.google.common.base.Ascii.FF, 0, 2, com.google.common.base.Ascii.VT, 7, 5, 3}};
    private static int getHighSpeedVideoSizes = 12;
    private byte[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizesFor;
    private long getInputFormats;
    private long[] getInputSizeshNQ4ISI;
    private long[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private long getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    private void getHighSpeedVideoSizes(byte[] bArr, int i) {
        long[] jArr = this.getOutputFormats;
        int i2 = 0;
        java.lang.System.arraycopy(jArr, 0, this.getInputSizeshNQ4ISI, 0, jArr.length);
        long[] jArr2 = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(jArr2, 0, this.getInputSizeshNQ4ISI, this.getOutputFormats.length, 4);
        long[] jArr3 = this.getInputSizeshNQ4ISI;
        jArr3[12] = this.getOutputSizes ^ jArr2[4];
        jArr3[13] = this.getOutputSizeshNQ4ISI ^ jArr2[5];
        jArr3[14] = this.getInputFormats ^ jArr2[6];
        jArr3[15] = jArr2[7];
        long[] jArr4 = new long[16];
        for (int i3 = 0; i3 < 16; i3++) {
            jArr4[i3] = org.bouncycastle.util.Pack.littleEndianToLong(bArr, (i3 * 8) + i);
        }
        int i4 = 0;
        while (i4 < getHighSpeedVideoSizes) {
            byte[][] bArr2 = getHighSpeedVideoFpsRangesFor;
            byte[] bArr3 = bArr2[i4];
            int i5 = i4;
            long[] jArr5 = jArr4;
            getHighSpeedVideoFpsRanges(jArr4[bArr3[0]], jArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr4[2]], jArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr5[4]], jArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr6[6]], jArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr7[8]], jArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr8[10]], jArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr9[12]], jArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i5];
            getHighSpeedVideoFpsRanges(jArr5[bArr10[14]], jArr5[bArr10[15]], 3, 4, 9, 14);
            i4 = i5 + 1;
            jArr4 = jArr5;
        }
        while (true) {
            long[] jArr6 = this.getOutputFormats;
            if (i2 >= jArr6.length) {
                return;
            }
            long j = jArr6[i2];
            long[] jArr7 = this.getInputSizeshNQ4ISI;
            jArr6[i2] = (j ^ jArr7[i2]) ^ jArr7[i2 + 8];
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
            i3 = 128 - i4;
            if (i3 >= i2) {
                java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, i4, i2);
                this.getHighSpeedVideoFpsRanges += i2;
            }
            java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, i4, i3);
            long j = this.getOutputSizes + 128;
            this.getOutputSizes = j;
            if (j == 0) {
                this.getOutputSizeshNQ4ISI++;
            }
            getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, 0);
            this.getHighSpeedVideoFpsRanges = 0;
            org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i + i3;
        while (i6 < i5 + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) {
            long j2 = this.getOutputSizes + 128;
            this.getOutputSizes = j2;
            if (j2 == 0) {
                this.getOutputSizeshNQ4ISI++;
            }
            getHighSpeedVideoSizes(bArr, i6);
            i6 += 128;
        }
        i2 = i5 - i6;
        java.lang.System.arraycopy(bArr, i6, this.Camera2StreamConfigurationMap, 0, i2);
        this.getHighSpeedVideoFpsRanges += i2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.getHighSpeedVideoFpsRanges;
        if (128 - i != 0) {
            this.Camera2StreamConfigurationMap[i] = b;
            this.getHighSpeedVideoFpsRanges = i + 1;
            return;
        }
        long j = this.getOutputSizes + 128;
        this.getOutputSizes = j;
        if (j == 0) {
            this.getOutputSizeshNQ4ISI++;
        }
        getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        this.Camera2StreamConfigurationMap[0] = b;
        this.getHighSpeedVideoFpsRanges = 1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputFormats = 0L;
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getOutputFormats = null;
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        byte[] bArr = this.getOutputMinFrameDuration;
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, this.Camera2StreamConfigurationMap, 0, bArr.length);
            this.getHighSpeedVideoFpsRanges = 128;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        long[] jArr;
        int i2;
        this.getInputFormats = -1L;
        long j = this.getOutputSizes;
        int i3 = this.getHighSpeedVideoFpsRanges;
        long j2 = j + i3;
        this.getOutputSizes = j2;
        if (i3 > 0 && j2 == 0) {
            this.getOutputSizeshNQ4ISI++;
        }
        getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getInputSizeshNQ4ISI, 0L);
        int i4 = 0;
        while (true) {
            jArr = this.getOutputFormats;
            if (i4 >= jArr.length || (i2 = i4 * 8) >= this.getHighSpeedVideoSizesFor) {
                break;
            }
            byte[] longToLittleEndian = org.bouncycastle.util.Pack.longToLittleEndian(jArr[i4]);
            int i5 = this.getHighSpeedVideoSizesFor;
            if (i2 < i5 - 8) {
                java.lang.System.arraycopy(longToLittleEndian, 0, bArr, i2 + i, 8);
            } else {
                java.lang.System.arraycopy(longToLittleEndian, 0, bArr, i + i2, i5 - i2);
            }
            i4++;
        }
        org.bouncycastle.util.Arrays.fill(jArr, 0L);
        reset();
        return this.getHighSpeedVideoSizesFor;
    }

    public void clearSalt() {
        byte[] bArr = this.getOutputStallDuration;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    public void clearKey() {
        byte[] bArr = this.getOutputMinFrameDuration;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
            org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getOutputFormats == null) {
            long[] jArr = {r2[0] ^ ((this.getHighSpeedVideoSizesFor | (this.getOutputMinFrameDurationlomOqCM << 8)) | android.R.attr.theme), r2[1], r2[2], r2[3], r5, r2[5], 0, 0};
            this.getOutputFormats = jArr;
            long[] jArr2 = getHighResolutionOutputSizeshNQ4ISI;
            long j = jArr2[4];
            byte[] bArr = this.getOutputStallDuration;
            if (bArr != null) {
                jArr[4] = j ^ org.bouncycastle.util.Pack.littleEndianToLong(bArr, 0);
                long[] jArr3 = this.getOutputFormats;
                jArr3[5] = jArr3[5] ^ org.bouncycastle.util.Pack.littleEndianToLong(this.getOutputStallDuration, 8);
            }
            long[] jArr4 = this.getOutputFormats;
            long j2 = jArr2[6];
            jArr4[6] = j2;
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.getOutputStallDurationlomOqCM;
            if (bArr2 != null) {
                jArr4[6] = org.bouncycastle.util.Pack.littleEndianToLong(bArr2, 0) ^ j2;
                long[] jArr5 = this.getOutputFormats;
                jArr5[7] = jArr5[7] ^ org.bouncycastle.util.Pack.littleEndianToLong(this.getOutputStallDurationlomOqCM, 8);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.getInputSizeshNQ4ISI;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        jArr[i4] = org.bouncycastle.util.Longs.rotateRight(jArr[i4] ^ j3, 32);
        long[] jArr2 = this.getInputSizeshNQ4ISI;
        long j4 = jArr2[i3] + jArr2[i4];
        jArr2[i3] = j4;
        jArr2[i2] = org.bouncycastle.util.Longs.rotateRight(j4 ^ jArr2[i2], 24);
        long[] jArr3 = this.getInputSizeshNQ4ISI;
        long j5 = jArr3[i] + jArr3[i2] + j2;
        jArr3[i] = j5;
        jArr3[i4] = org.bouncycastle.util.Longs.rotateRight(jArr3[i4] ^ j5, 16);
        long[] jArr4 = this.getInputSizeshNQ4ISI;
        long j6 = jArr4[i3] + jArr4[i4];
        jArr4[i3] = j6;
        jArr4[i2] = org.bouncycastle.util.Longs.rotateRight(j6 ^ jArr4[i2], 63);
    }

    public Blake2bDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.getHighSpeedVideoSizesFor = 64;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputSizeshNQ4ISI = new long[16];
        this.getOutputFormats = null;
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getInputFormats = 0L;
        this.Camera2StreamConfigurationMap = new byte[128];
        if (i <= 0 || i > 64) {
            throw new java.lang.IllegalArgumentException("Invalid digest length (required: 1 - 64)");
        }
        this.getHighSpeedVideoSizesFor = i;
        if (bArr2 != null) {
            if (bArr2.length != 16) {
                throw new java.lang.IllegalArgumentException("salt length must be exactly 16 bytes");
            }
            byte[] bArr4 = new byte[16];
            this.getOutputStallDuration = bArr4;
            java.lang.System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        if (bArr3 != null) {
            if (bArr3.length != 16) {
                throw new java.lang.IllegalArgumentException("personalization length must be exactly 16 bytes");
            }
            byte[] bArr5 = new byte[16];
            this.getOutputStallDurationlomOqCM = bArr5;
            java.lang.System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
        }
        if (bArr != null) {
            byte[] bArr6 = new byte[bArr.length];
            this.getOutputMinFrameDuration = bArr6;
            java.lang.System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            if (bArr.length > 64) {
                throw new java.lang.IllegalArgumentException("Keys > 64 are not supported");
            }
            this.getOutputMinFrameDurationlomOqCM = bArr.length;
            java.lang.System.arraycopy(bArr, 0, this.Camera2StreamConfigurationMap, 0, bArr.length);
            this.getHighSpeedVideoFpsRanges = 128;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    public Blake2bDigest(byte[] bArr) {
        this.getHighSpeedVideoSizesFor = 64;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputSizeshNQ4ISI = new long[16];
        this.getOutputFormats = null;
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getInputFormats = 0L;
        this.Camera2StreamConfigurationMap = new byte[128];
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.getOutputMinFrameDuration = bArr2;
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            if (bArr.length > 64) {
                throw new java.lang.IllegalArgumentException("Keys > 64 are not supported");
            }
            this.getOutputMinFrameDurationlomOqCM = bArr.length;
            java.lang.System.arraycopy(bArr, 0, this.Camera2StreamConfigurationMap, 0, bArr.length);
            this.getHighSpeedVideoFpsRanges = 128;
        }
        this.getHighSpeedVideoSizesFor = 64;
        getHighSpeedVideoFpsRangesFor();
    }

    public Blake2bDigest(org.bouncycastle.crypto.digests.Blake2bDigest blake2bDigest) {
        this.getHighSpeedVideoSizesFor = 64;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputSizeshNQ4ISI = new long[16];
        this.getOutputFormats = null;
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getInputFormats = 0L;
        this.getHighSpeedVideoFpsRanges = blake2bDigest.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(blake2bDigest.Camera2StreamConfigurationMap);
        this.getOutputMinFrameDurationlomOqCM = blake2bDigest.getOutputMinFrameDurationlomOqCM;
        this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(blake2bDigest.getOutputMinFrameDuration);
        this.getHighSpeedVideoSizesFor = blake2bDigest.getHighSpeedVideoSizesFor;
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(blake2bDigest.getOutputFormats);
        this.getOutputStallDurationlomOqCM = org.bouncycastle.util.Arrays.clone(blake2bDigest.getOutputStallDurationlomOqCM);
        this.getOutputStallDuration = org.bouncycastle.util.Arrays.clone(blake2bDigest.getOutputStallDuration);
        this.getOutputSizes = blake2bDigest.getOutputSizes;
        this.getOutputSizeshNQ4ISI = blake2bDigest.getOutputSizeshNQ4ISI;
        this.getInputFormats = blake2bDigest.getInputFormats;
    }

    public Blake2bDigest(int i) {
        this.getHighSpeedVideoSizesFor = 64;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDuration = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getInputSizeshNQ4ISI = new long[16];
        this.getOutputFormats = null;
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = 0L;
        this.getInputFormats = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.Camera2StreamConfigurationMap = new byte[128];
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getHighSpeedVideoSizesFor = i / 8;
        getHighSpeedVideoFpsRangesFor();
    }

    public Blake2bDigest() {
        this(512);
    }
}
