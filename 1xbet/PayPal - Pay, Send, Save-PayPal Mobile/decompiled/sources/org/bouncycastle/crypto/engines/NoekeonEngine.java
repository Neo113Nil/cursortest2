package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class NoekeonEngine implements org.bouncycastle.crypto.BlockCipher {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {Byte.MIN_VALUE, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 108, -40, -85, 77, -102, 47, 94, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 106, -44};
    private boolean getHighSpeedVideoFpsRangesFor;
    private final int[] getHighSpeedVideoFpsRanges = new int[4];
    private boolean Camera2StreamConfigurationMap = false;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.Camera2StreamConfigurationMap) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i3 = 16;
        if (i > bArr.length - 16) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i4 = 0;
        int i5 = 8;
        if (this.getHighSpeedVideoFpsRangesFor) {
            int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i);
            int bigEndianToInt2 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 4);
            int bigEndianToInt3 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 8);
            int bigEndianToInt4 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 12);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            while (true) {
                int i10 = (getHighResolutionOutputSizeshNQ4ISI[i4] & 255) ^ bigEndianToInt;
                int i11 = i10 ^ bigEndianToInt3;
                int rotateLeft = i11 ^ (org.bouncycastle.util.Integers.rotateLeft(i11, 8) ^ org.bouncycastle.util.Integers.rotateLeft(i11, 24));
                int i12 = bigEndianToInt2 ^ i7;
                int i13 = bigEndianToInt4 ^ i9;
                int i14 = i12 ^ i13;
                int rotateLeft2 = i14 ^ (org.bouncycastle.util.Integers.rotateLeft(i14, 24) ^ org.bouncycastle.util.Integers.rotateLeft(i14, 8));
                int i15 = (i10 ^ i6) ^ rotateLeft2;
                int i16 = i12 ^ rotateLeft;
                int i17 = (bigEndianToInt3 ^ i8) ^ rotateLeft2;
                int i18 = i13 ^ rotateLeft;
                i4++;
                if (i4 > 16) {
                    org.bouncycastle.util.Pack.intToBigEndian(i15, bArr2, i2);
                    org.bouncycastle.util.Pack.intToBigEndian(i16, bArr2, i2 + 4);
                    org.bouncycastle.util.Pack.intToBigEndian(i17, bArr2, i2 + 8);
                    org.bouncycastle.util.Pack.intToBigEndian(i18, bArr2, i2 + 12);
                    return 16;
                }
                int rotateLeft3 = org.bouncycastle.util.Integers.rotateLeft(i16, 1);
                int rotateLeft4 = org.bouncycastle.util.Integers.rotateLeft(i17, 5);
                int rotateLeft5 = org.bouncycastle.util.Integers.rotateLeft(i18, 2);
                int i19 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
                int i20 = ~i19;
                int i21 = i15 ^ (rotateLeft4 & i20);
                int i22 = (rotateLeft4 ^ (i20 ^ rotateLeft5)) ^ i21;
                int i23 = i19 ^ (i21 | i22);
                int rotateLeft6 = org.bouncycastle.util.Integers.rotateLeft(i23, 31);
                int rotateLeft7 = org.bouncycastle.util.Integers.rotateLeft(i22, 27);
                bigEndianToInt = (i23 & i22) ^ rotateLeft5;
                bigEndianToInt4 = org.bouncycastle.util.Integers.rotateLeft(i21, 30);
                bigEndianToInt2 = rotateLeft6;
                bigEndianToInt3 = rotateLeft7;
            }
        } else {
            int bigEndianToInt5 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i);
            int bigEndianToInt6 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 4);
            int bigEndianToInt7 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 8);
            int bigEndianToInt8 = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 12);
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            int i26 = iArr2[2];
            int i27 = iArr2[3];
            int i28 = 16;
            while (true) {
                int i29 = bigEndianToInt5 ^ bigEndianToInt7;
                int rotateLeft8 = i29 ^ (org.bouncycastle.util.Integers.rotateLeft(i29, i5) ^ org.bouncycastle.util.Integers.rotateLeft(i29, 24));
                int i30 = bigEndianToInt6 ^ i25;
                int i31 = bigEndianToInt8 ^ i27;
                int i32 = i30 ^ i31;
                int rotateLeft9 = i32 ^ (org.bouncycastle.util.Integers.rotateLeft(i32, 24) ^ org.bouncycastle.util.Integers.rotateLeft(i32, i5));
                int i33 = i30 ^ rotateLeft8;
                int i34 = (bigEndianToInt7 ^ i26) ^ rotateLeft9;
                int i35 = i31 ^ rotateLeft8;
                int i36 = ((bigEndianToInt5 ^ i24) ^ rotateLeft9) ^ (getHighResolutionOutputSizeshNQ4ISI[i28] & 255);
                i28--;
                if (i28 < 0) {
                    org.bouncycastle.util.Pack.intToBigEndian(i36, bArr2, i2);
                    org.bouncycastle.util.Pack.intToBigEndian(i33, bArr2, i2 + 4);
                    org.bouncycastle.util.Pack.intToBigEndian(i34, bArr2, i2 + 8);
                    org.bouncycastle.util.Pack.intToBigEndian(i35, bArr2, i2 + 12);
                    return i3;
                }
                int rotateLeft10 = org.bouncycastle.util.Integers.rotateLeft(i33, 1);
                int rotateLeft11 = org.bouncycastle.util.Integers.rotateLeft(i34, 5);
                int rotateLeft12 = org.bouncycastle.util.Integers.rotateLeft(i35, 2);
                int i37 = rotateLeft10 ^ (rotateLeft12 | rotateLeft11);
                int i38 = ~i37;
                int i39 = i36 ^ (rotateLeft11 & i38);
                int i40 = ((i38 ^ rotateLeft12) ^ rotateLeft11) ^ i39;
                int i41 = i37 ^ (i39 | i40);
                int rotateLeft13 = org.bouncycastle.util.Integers.rotateLeft(i41, 31);
                int rotateLeft14 = org.bouncycastle.util.Integers.rotateLeft(i40, 27);
                int rotateLeft15 = org.bouncycastle.util.Integers.rotateLeft(i39, 30);
                int i42 = rotateLeft12 ^ (i40 & i41);
                bigEndianToInt7 = rotateLeft14;
                bigEndianToInt6 = rotateLeft13;
                i3 = 16;
                i5 = 8;
                bigEndianToInt5 = i42;
                bigEndianToInt8 = rotateLeft15;
            }
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to Noekeon init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new java.lang.IllegalArgumentException("Key length not 128 bits.");
        }
        org.bouncycastle.util.Pack.bigEndianToInt(key, 0, this.getHighSpeedVideoFpsRanges, 0, 4);
        if (!z) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = i ^ i3;
            int rotateLeft = i5 ^ (org.bouncycastle.util.Integers.rotateLeft(i5, 8) ^ org.bouncycastle.util.Integers.rotateLeft(i5, 24));
            int i6 = i2 ^ i4;
            int rotateLeft2 = (org.bouncycastle.util.Integers.rotateLeft(i6, 8) ^ org.bouncycastle.util.Integers.rotateLeft(i6, 24)) ^ i6;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            iArr2[0] = i ^ rotateLeft2;
            iArr2[1] = i2 ^ rotateLeft;
            iArr2[2] = i3 ^ rotateLeft2;
            iArr2[3] = i4 ^ rotateLeft;
        }
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Noekeon";
    }
}
