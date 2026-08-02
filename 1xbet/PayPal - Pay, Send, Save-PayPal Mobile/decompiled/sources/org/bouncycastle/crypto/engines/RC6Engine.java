package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC6Engine implements org.bouncycastle.crypto.BlockCipher {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoSizes = null;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        int[] iArr;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to RC6 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = (key.length + 3) / 4;
        int length2 = (key.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = key.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr2[i] = (iArr2[i] << 8) + (key[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.getHighSpeedVideoSizes = iArr3;
        iArr3[0] = -1209970333;
        int i2 = 1;
        while (true) {
            iArr = this.getHighSpeedVideoSizes;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] - 1640531527;
            i2++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length4; i7++) {
            int[] iArr4 = this.getHighSpeedVideoSizes;
            int i8 = iArr4[i3] + i4 + i5;
            i4 = (i8 >>> (-3)) | (i8 << 3);
            iArr4[i3] = i4;
            int i9 = iArr2[i6] + i4 + i5;
            int i10 = i5 + i4;
            i5 = (i9 << i10) | (i9 >>> (-i10));
            iArr2[i6] = i5;
            i3 = (i3 + 1) % iArr4.length;
            i6 = (i6 + 1) % length2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int blockSize = getBlockSize();
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("RC6 engine not initialised");
        }
        if (i + blockSize > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (blockSize + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i3 = 20;
        int i4 = 0;
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            int i5 = 0;
            for (int i6 = 3; i6 >= 0; i6--) {
                i5 = (i5 << 8) + (bArr[i6 + i] & 255);
            }
            int i7 = i + 4;
            int i8 = 0;
            for (int i9 = 3; i9 >= 0; i9--) {
                i8 = (i8 << 8) + (bArr[i9 + i7] & 255);
            }
            int i10 = i + 8;
            int i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                i11 = (i11 << 8) + (bArr[i12 + i10] & 255);
            }
            int i13 = i + 12;
            int i14 = 0;
            for (int i15 = 3; i15 >= 0; i15--) {
                i14 = (i14 << 8) + (bArr[i15 + i13] & 255);
            }
            int[] iArr = this.getHighSpeedVideoSizes;
            int i16 = i11 - iArr[43];
            int i17 = i5 - iArr[42];
            int i18 = i8;
            int i19 = i14;
            int i20 = i17;
            int i21 = i16;
            while (i3 > 0) {
                int i22 = ((i20 * 2) + 1) * i20;
                int i23 = (i22 << 5) | (i22 >>> (-5));
                int i24 = ((i21 * 2) + 1) * i21;
                int i25 = (i24 << 5) | (i24 >>> (-5));
                int[] iArr2 = this.getHighSpeedVideoSizes;
                int i26 = i3 * 2;
                int i27 = i18 - iArr2[i26 + 1];
                int i28 = i19 - iArr2[i26];
                i3--;
                int i29 = i21;
                i21 = ((i27 >>> i23) | (i27 << (-i23))) ^ i25;
                i18 = i20;
                i20 = ((i28 >>> i25) | (i28 << (-i25))) ^ i23;
                i19 = i29;
            }
            int[] iArr3 = this.getHighSpeedVideoSizes;
            int i30 = iArr3[1];
            int i31 = iArr3[0];
            for (int i32 = 0; i32 < 4; i32++) {
                bArr2[i32 + i2] = (byte) i20;
                i20 >>>= 8;
            }
            int i33 = i18 - i31;
            int i34 = i2 + 4;
            for (int i35 = 0; i35 < 4; i35++) {
                bArr2[i35 + i34] = (byte) i33;
                i33 >>>= 8;
            }
            int i36 = i2 + 8;
            for (int i37 = 0; i37 < 4; i37++) {
                bArr2[i37 + i36] = (byte) i21;
                i21 >>>= 8;
            }
            int i38 = i19 - i30;
            int i39 = i2 + 12;
            while (i4 < 4) {
                bArr2[i4 + i39] = (byte) i38;
                i38 >>>= 8;
                i4++;
            }
            return 16;
        }
        int i40 = 0;
        for (int i41 = 3; i41 >= 0; i41--) {
            i40 = (i40 << 8) + (bArr[i41 + i] & 255);
        }
        int i42 = i + 4;
        int i43 = 0;
        for (int i44 = 3; i44 >= 0; i44--) {
            i43 = (i43 << 8) + (bArr[i44 + i42] & 255);
        }
        int i45 = i + 8;
        int i46 = 0;
        for (int i47 = 3; i47 >= 0; i47--) {
            i46 = (i46 << 8) + (bArr[i47 + i45] & 255);
        }
        int i48 = i + 12;
        int i49 = 0;
        for (int i50 = 3; i50 >= 0; i50--) {
            i49 = (i49 << 8) + (bArr[i50 + i48] & 255);
        }
        int[] iArr4 = this.getHighSpeedVideoSizes;
        int i51 = i43 + iArr4[0];
        int i52 = i49 + iArr4[1];
        int i53 = 1;
        int i54 = i46;
        int i55 = i52;
        while (i53 <= 20) {
            int i56 = ((i51 * 2) + 1) * i51;
            int i57 = (i56 << 5) | (i56 >>> (-5));
            int i58 = ((i55 * 2) + 1) * i55;
            int i59 = (i58 << 5) | (i58 >>> (-5));
            int i60 = i40 ^ i57;
            int[] iArr5 = this.getHighSpeedVideoSizes;
            int i61 = i53 * 2;
            int i62 = iArr5[i61];
            int i63 = i54 ^ i59;
            i53++;
            int i64 = i51;
            i51 = ((i63 << i57) | (i63 >>> (-i57))) + iArr5[i61 + 1];
            i54 = i55;
            i55 = ((i60 << i59) | (i60 >>> (-i59))) + i62;
            i40 = i64;
        }
        int[] iArr6 = this.getHighSpeedVideoSizes;
        int i65 = iArr6[42];
        int i66 = iArr6[43];
        int i67 = i40 + i65;
        for (int i68 = 0; i68 < 4; i68++) {
            bArr2[i68 + i2] = (byte) i67;
            i67 >>>= 8;
        }
        int i69 = i2 + 4;
        for (int i70 = 0; i70 < 4; i70++) {
            bArr2[i70 + i69] = (byte) i51;
            i51 >>>= 8;
        }
        int i71 = i54 + i66;
        int i72 = i2 + 8;
        for (int i73 = 0; i73 < 4; i73++) {
            bArr2[i73 + i72] = (byte) i71;
            i71 >>>= 8;
        }
        int i74 = i2 + 12;
        while (i4 < 4) {
            bArr2[i4 + i74] = (byte) i55;
            i55 >>>= 8;
            i4++;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "RC6";
    }
}
