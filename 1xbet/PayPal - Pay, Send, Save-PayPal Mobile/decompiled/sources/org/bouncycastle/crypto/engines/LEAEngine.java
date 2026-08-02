package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class LEAEngine implements org.bouncycastle.crypto.BlockCipher {
    private static final int[] Camera2StreamConfigurationMap = {-1007687205, 1147300610, 2044886154, 2027892972, 1902027934, -947529206, -531697110, -440137385};
    private final int[] getHighResolutionOutputSizeshNQ4ISI = new int[4];
    private int getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int[][] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, boolean z) {
        int length = bArr == null ? 0 : bArr.length;
        int i2 = i + 16;
        if (i < 0 || i2 < 0 || i2 > length) {
            if (!z) {
                throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short.");
            }
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to LEA init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if ((length << 1) % 16 != 0 || length < 16 || length > 32) {
            throw new java.lang.IllegalArgumentException("KeyBitSize must be 128, 192 or 256");
        }
        this.getHighSpeedVideoFpsRangesFor = z;
        int length2 = (key.length >> 1) + 16;
        this.getHighSpeedVideoFpsRanges = length2;
        this.getHighSpeedVideoSizes = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, length2, 6);
        int length3 = key.length / 4;
        int[] iArr = new int[length3];
        org.bouncycastle.util.Pack.littleEndianToInt(key, 0, iArr, 0, length3);
        if (length3 == 4) {
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges; i++) {
                int i2 = Camera2StreamConfigurationMap[i & 3];
                int i3 = (i2 << i) | (i2 >>> (32 - i));
                int i4 = iArr[0] + i3;
                int i5 = (i4 << 1) | (i4 >>> 31);
                iArr[0] = i5;
                int i6 = iArr[1] + ((i3 >>> 31) | (i3 << 1));
                int i7 = (i6 << 3) | (i6 >>> 29);
                iArr[1] = i7;
                int i8 = iArr[2] + ((i3 >>> 30) | (i3 << 2));
                int i9 = (i8 << 6) | (i8 >>> 26);
                iArr[2] = i9;
                int i10 = iArr[3] + ((i3 << 3) | (i3 >>> 29));
                iArr[3] = (i10 >>> 21) | (i10 << 11);
                int[] iArr2 = this.getHighSpeedVideoSizes[i];
                iArr2[0] = i5;
                iArr2[1] = i7;
                iArr2[2] = i9;
                int i11 = iArr[1];
                iArr2[3] = i11;
                iArr2[4] = iArr[3];
                iArr2[5] = i11;
            }
            return;
        }
        if (length3 == 6) {
            for (int i12 = 0; i12 < this.getHighSpeedVideoFpsRanges; i12++) {
                int i13 = Camera2StreamConfigurationMap[i12 % 6];
                int i14 = (i13 << i12) | (i13 >>> (32 - i12));
                int i15 = iArr[0] + ((i14 >>> 32) | i14);
                iArr[0] = (i15 << 1) | (i15 >>> 31);
                int i16 = iArr[1] + ((i14 >>> 31) | (i14 << 1));
                iArr[1] = (i16 << 3) | (i16 >>> 29);
                int i17 = iArr[2] + ((i14 >>> 30) | (i14 << 2));
                iArr[2] = (i17 << 6) | (i17 >>> 26);
                int i18 = iArr[3] + ((i14 >>> 29) | (i14 << 3));
                iArr[3] = (i18 << 11) | (i18 >>> 21);
                int i19 = iArr[4] + ((i14 >>> 28) | (i14 << 4));
                iArr[4] = (i19 << 13) | (i19 >>> 19);
                int i20 = iArr[5] + ((i14 << 5) | (i14 >>> 27));
                iArr[5] = (i20 >>> 15) | (i20 << 17);
                java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoSizes[i12], 0, 6);
            }
            return;
        }
        int i21 = 0;
        for (int i22 = 0; i22 < this.getHighSpeedVideoFpsRanges; i22++) {
            int i23 = Camera2StreamConfigurationMap[i22 & 7];
            int i24 = (i23 << i22) | (i23 >>> (32 - i22));
            int[] iArr3 = this.getHighSpeedVideoSizes[i22];
            int i25 = i21 & 7;
            int i26 = iArr[i25] + i24;
            int i27 = (i26 << 1) | (i26 >>> 31);
            iArr3[0] = i27;
            iArr[i25] = i27;
            int i28 = (i21 + 1) & 7;
            int i29 = iArr[i28] + ((i24 >>> 31) | (i24 << 1));
            int i30 = (i29 << 3) | (i29 >>> 29);
            iArr3[1] = i30;
            iArr[i28] = i30;
            int i31 = (i21 + 2) & 7;
            int i32 = iArr[i31] + ((i24 >>> 30) | (i24 << 2));
            int i33 = (i32 << 6) | (i32 >>> 26);
            iArr3[2] = i33;
            iArr[i31] = i33;
            int i34 = (i21 + 3) & 7;
            int i35 = iArr[i34] + ((i24 >>> 29) | (i24 << 3));
            int i36 = (i35 << 11) | (i35 >>> 21);
            iArr3[3] = i36;
            iArr[i34] = i36;
            int i37 = (i21 + 4) & 7;
            int i38 = iArr[i37] + ((i24 >>> 28) | (i24 << 4));
            int i39 = (i38 << 13) | (i38 >>> 19);
            iArr3[4] = i39;
            iArr[i37] = i39;
            int i40 = (i21 + 5) & 7;
            int i41 = iArr[i40] + ((i24 << 5) | (i24 >>> 27));
            int i42 = (i41 >>> 15) | (i41 << 17);
            iArr3[5] = i42;
            i21 += 6;
            iArr[i40] = i42;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        getHighSpeedVideoFpsRangesFor(bArr, i, false);
        getHighSpeedVideoFpsRangesFor(bArr2, i2, true);
        if (this.getHighSpeedVideoFpsRangesFor) {
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, 0, 4);
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
                int[] iArr = this.getHighSpeedVideoSizes[i3];
                int i4 = (i3 + 3) % 4;
                int i5 = i4 == 0 ? 3 : i4 - 1;
                int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i6 = (iArr[4] ^ iArr2[i5]) + (iArr2[i4] ^ iArr[5]);
                iArr2[i4] = (i6 << 29) | (i6 >>> 3);
                int i7 = i5 == 0 ? 3 : i5 - 1;
                int i8 = (iArr2[i7] ^ iArr[2]) + (iArr[3] ^ iArr2[i5]);
                iArr2[i5] = (i8 << 27) | (i8 >>> 5);
                int i9 = (iArr2[i7 == 0 ? 3 : i7 - 1] ^ iArr[0]) + (iArr[1] ^ iArr2[i7]);
                iArr2[i7] = (i9 >>> 23) | (i9 << 9);
            }
            org.bouncycastle.util.Pack.intToLittleEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr2, i2);
            return 16;
        }
        org.bouncycastle.util.Pack.littleEndianToInt(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, 0, 4);
        for (int i10 = this.getHighSpeedVideoFpsRanges - 1; i10 >= 0; i10--) {
            int[] iArr3 = this.getHighSpeedVideoSizes[i10];
            int i11 = i10 % 4;
            int i12 = i11 == 3 ? 0 : i11 + 1;
            int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i13 = iArr4[i12];
            int i14 = iArr3[1] ^ (((i13 << 23) | (i13 >>> 9)) - (iArr4[i11] ^ iArr3[0]));
            iArr4[i12] = i14;
            int i15 = i12 == 3 ? 0 : i12 + 1;
            int i16 = iArr4[i15];
            int i17 = iArr3[3] ^ (((i16 >>> 27) | (i16 << 5)) - (i14 ^ iArr3[2]));
            iArr4[i15] = i17;
            int i18 = i15 == 3 ? 0 : i15 + 1;
            int i19 = iArr4[i18];
            iArr4[i18] = iArr3[5] ^ (((i19 >>> 29) | (i19 << 3)) - (i17 ^ iArr3[4]));
        }
        org.bouncycastle.util.Pack.intToLittleEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "LEA";
    }
}
