package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class OldPKCS12ParametersGenerator extends org.bouncycastle.crypto.PBEParametersGenerator {
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    private byte[] getHighSpeedVideoFpsRanges(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != i3; i5++) {
            bArr3[i5] = (byte) i;
        }
        int i6 = 1;
        if (this.salt == null || this.salt.length == 0) {
            bArr = new byte[0];
        } else {
            int i7 = this.getHighSpeedVideoFpsRangesFor;
            int length = this.salt.length;
            int i8 = this.getHighSpeedVideoFpsRangesFor;
            int i9 = i7 * (((length + i8) - 1) / i8);
            bArr = new byte[i9];
            for (int i10 = 0; i10 != i9; i10++) {
                byte[] bArr5 = this.salt;
                bArr[i10] = bArr5[i10 % bArr5.length];
            }
        }
        if (this.password == null || this.password.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i11 = this.getHighSpeedVideoFpsRangesFor;
            int length2 = this.password.length;
            int i12 = this.getHighSpeedVideoFpsRangesFor;
            int i13 = i11 * (((length2 + i12) - 1) / i12);
            bArr2 = new byte[i13];
            for (int i14 = 0; i14 != i13; i14++) {
                byte[] bArr6 = this.password;
                bArr2[i14] = bArr6[i14 % bArr6.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr7 = new byte[length3];
        java.lang.System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr7, bArr.length, bArr2.length);
        int i15 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr8 = new byte[i15];
        int i16 = this.getHighSpeedVideoFpsRanges;
        int i17 = ((i2 + i16) - 1) / i16;
        int i18 = 1;
        while (i18 <= i17) {
            int i19 = this.getHighSpeedVideoFpsRanges;
            byte[] bArr9 = new byte[i19];
            this.getHighSpeedVideoSizes.update(bArr3, i4, i3);
            this.getHighSpeedVideoSizes.update(bArr7, i4, length3);
            this.getHighSpeedVideoSizes.doFinal(bArr9, i4);
            for (int i20 = i6; i20 != this.iterationCount; i20++) {
                this.getHighSpeedVideoSizes.update(bArr9, i4, i19);
                this.getHighSpeedVideoSizes.doFinal(bArr9, i4);
            }
            for (int i21 = i4; i21 != i15; i21++) {
                bArr8[i18] = bArr9[i21 % i19];
            }
            int i22 = i4;
            while (true) {
                int i23 = this.getHighSpeedVideoFpsRangesFor;
                if (i22 == length3 / i23) {
                    break;
                }
                int i24 = i23 * i22;
                int i25 = (i15 + i24) - 1;
                int i26 = i3;
                int i27 = (bArr8[i15 - 1] & 255) + (bArr7[i25] & 255) + 1;
                bArr7[i25] = (byte) i27;
                int i28 = i27 >>> 8;
                int i29 = i15 - 2;
                while (i29 >= 0) {
                    int i30 = i24 + i29;
                    int i31 = i28 + (bArr8[i29] & 255) + (bArr7[i30] & 255);
                    bArr7[i30] = (byte) i31;
                    i28 = i31 >>> 8;
                    i29--;
                    length3 = length3;
                    bArr3 = bArr3;
                }
                i22++;
                i3 = i26;
            }
            int i32 = i3;
            byte[] bArr10 = bArr3;
            int i33 = length3;
            if (i18 == i17) {
                int i34 = (i18 - 1) * this.getHighSpeedVideoFpsRanges;
                i4 = 0;
                java.lang.System.arraycopy(bArr9, 0, bArr4, i34, i2 - i34);
            } else {
                i4 = 0;
                java.lang.System.arraycopy(bArr9, 0, bArr4, (i18 - 1) * this.getHighSpeedVideoFpsRanges, i19);
            }
            i18++;
            length3 = i33;
            bArr3 = bArr10;
            i6 = 1;
            i3 = i32;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(1, i3);
        return new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(highSpeedVideoFpsRanges, 0, i3), getHighSpeedVideoFpsRanges(2, i4), 0, i4);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoFpsRanges(1, i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoFpsRanges(3, i2), 0, i2);
    }

    public OldPKCS12ParametersGenerator(org.bouncycastle.crypto.Digest digest) {
        int i;
        this.getHighSpeedVideoSizes = digest;
        if (digest instanceof org.bouncycastle.crypto.digests.MD5Digest) {
            i = 16;
        } else {
            if (!(digest instanceof org.bouncycastle.crypto.digests.SHA1Digest) && !(digest instanceof org.bouncycastle.crypto.digests.RIPEMD160Digest)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Digest ");
                sb.append(digest.getAlgorithmName());
                sb.append(" unsupported");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            i = 20;
        }
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = 64;
    }
}
