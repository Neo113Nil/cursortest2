package org.bouncycastle.crypto.encodings;

/* loaded from: classes17.dex */
public class ISO9796d1Encoding implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoSizesFor;
    private int getInputFormats = 0;
    private boolean getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputFormats;
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(16);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(6);
    private static byte[] getHighSpeedVideoFpsRanges = {14, 3, 5, 8, 9, 4, 2, com.google.common.base.Ascii.SI, 0, 13, com.google.common.base.Ascii.VT, 6, 7, 10, com.google.common.base.Ascii.FF, 1};
    private static byte[] getHighSpeedVideoSizes = {8, com.google.common.base.Ascii.SI, 6, 1, 5, 2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 3, 4, 13, 10, 14, 9, 0, 7};

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        int i3 = 0;
        if (this.getInputSizeshNQ4ISI) {
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 + 7) / 8;
            byte[] bArr2 = new byte[i5];
            int i6 = this.getInputFormats;
            int i7 = (i4 + 13) / 16;
            int i8 = 0;
            while (i8 < i7) {
                if (i8 > i7 - i2) {
                    int i9 = i7 - i8;
                    java.lang.System.arraycopy(bArr, (i + i2) - i9, bArr2, i5 - i7, i9);
                } else {
                    java.lang.System.arraycopy(bArr, i, bArr2, i5 - (i8 + i2), i2);
                }
                i8 += i2;
            }
            for (int i10 = i5 - (i7 * 2); i10 != i5; i10 += 2) {
                byte b = bArr2[(i5 - i7) + (i10 / 2)];
                byte[] bArr3 = getHighSpeedVideoFpsRanges;
                bArr2[i10] = (byte) (bArr3[b & com.google.common.base.Ascii.SI] | (bArr3[(b & 255) >>> 4] << 4));
                bArr2[i10 + 1] = b;
            }
            int i11 = i5 - (i2 * 2);
            bArr2[i11] = (byte) (bArr2[i11] ^ (i6 + 1));
            int i12 = i5 - 1;
            bArr2[i12] = (byte) ((bArr2[i12] << 4) | 6);
            int i13 = 8 - ((this.getHighSpeedVideoFpsRangesFor - 1) % 8);
            if (i13 != 8) {
                byte b2 = (byte) (bArr2[0] & (255 >>> i13));
                bArr2[0] = b2;
                bArr2[0] = (byte) ((128 >>> i13) | b2);
            } else {
                bArr2[0] = 0;
                bArr2[1] = (byte) (bArr2[1] | 128);
                i3 = 1;
            }
            return this.getHighSpeedVideoSizesFor.processBlock(bArr2, i3, i5 - i3);
        }
        byte[] processBlock = this.getHighSpeedVideoSizesFor.processBlock(bArr, i, i2);
        int i14 = (this.getHighSpeedVideoFpsRangesFor + 13) / 16;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, processBlock);
        java.math.BigInteger bigInteger2 = getHighResolutionOutputSizeshNQ4ISI;
        java.math.BigInteger mod = bigInteger.mod(bigInteger2);
        java.math.BigInteger bigInteger3 = Camera2StreamConfigurationMap;
        if (!mod.equals(bigInteger3)) {
            if (!this.getOutputFormats.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.getOutputFormats.subtract(bigInteger);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr4 = new byte[length];
            java.lang.System.arraycopy(byteArray, 1, bArr4, 0, length);
            byteArray = bArr4;
        }
        if ((byteArray[byteArray.length - 1] & com.google.common.base.Ascii.SI) != 6) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("invalid forcing byte in block");
        }
        byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (getHighSpeedVideoSizes[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
        byte[] bArr5 = getHighSpeedVideoFpsRanges;
        byte b3 = byteArray[1];
        byteArray[0] = (byte) (bArr5[b3 & com.google.common.base.Ascii.SI] | (bArr5[(b3 & 255) >>> 4] << 4));
        int i15 = 0;
        boolean z = false;
        int i16 = 1;
        for (int length2 = byteArray.length - 1; length2 >= byteArray.length - (i14 * 2); length2 -= 2) {
            byte[] bArr6 = getHighSpeedVideoFpsRanges;
            byte b4 = byteArray[length2];
            int i17 = bArr6[b4 & com.google.common.base.Ascii.SI] | (bArr6[(b4 & 255) >>> 4] << 4);
            int i18 = length2 - 1;
            int i19 = (i17 ^ byteArray[i18]) & 255;
            if (i19 != 0) {
                if (z) {
                    throw new org.bouncycastle.crypto.InvalidCipherTextException("invalid tsums in block");
                }
                z = true;
                i16 = i19;
                i15 = i18;
            }
        }
        byteArray[i15] = 0;
        int length3 = (byteArray.length - i15) / 2;
        byte[] bArr7 = new byte[length3];
        while (i3 < length3) {
            bArr7[i3] = byteArray[(i3 * 2) + i15 + 1];
            i3++;
        }
        this.getInputFormats = i16 - 1;
        return bArr7;
    }

    public void setPadBits(int i) {
        if (i > 7) {
            throw new java.lang.IllegalArgumentException("padBits > 7");
        }
        this.getInputFormats = i;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.RSAKeyParameters rSAKeyParameters = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? (org.bouncycastle.crypto.params.RSAKeyParameters) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : (org.bouncycastle.crypto.params.RSAKeyParameters) cipherParameters;
        this.getHighSpeedVideoSizesFor.init(z, cipherParameters);
        java.math.BigInteger modulus = rSAKeyParameters.getModulus();
        this.getOutputFormats = modulus;
        this.getHighSpeedVideoFpsRangesFor = modulus.bitLength();
        this.getInputSizeshNQ4ISI = z;
    }

    public org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int getPadBits() {
        return this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.getHighSpeedVideoSizesFor.getOutputBlockSize();
        return this.getInputSizeshNQ4ISI ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.getHighSpeedVideoSizesFor.getInputBlockSize();
        return this.getInputSizeshNQ4ISI ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    public ISO9796d1Encoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoSizesFor = asymmetricBlockCipher;
    }
}
