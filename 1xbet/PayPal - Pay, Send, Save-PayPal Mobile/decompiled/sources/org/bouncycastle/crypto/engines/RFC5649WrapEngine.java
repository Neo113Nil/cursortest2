package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RFC5649WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private org.bouncycastle.crypto.params.KeyParameter Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes = null;
    private byte[] getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for unwrapping");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        if (i3 <= 1) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        byte[] bArr3 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr3, 0, i2);
        byte[] bArr4 = new byte[i2];
        if (i3 == 2) {
            this.getHighSpeedVideoFpsRanges.init(false, this.Camera2StreamConfigurationMap);
            int i4 = 0;
            while (i4 < i2) {
                this.getHighSpeedVideoFpsRanges.processBlock(bArr3, i4, bArr4, i4);
                i4 += this.getHighSpeedVideoFpsRanges.getBlockSize();
            }
            byte[] bArr5 = new byte[8];
            this.getHighSpeedVideoSizes = bArr5;
            java.lang.System.arraycopy(bArr4, 0, bArr5, 0, 8);
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            int length = i2 - bArr6.length;
            bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr4, bArr6.length, bArr2, 0, length);
        } else {
            int i5 = i2 - 8;
            byte[] bArr7 = new byte[i5];
            byte[] bArr8 = new byte[8];
            byte[] bArr9 = new byte[16];
            java.lang.System.arraycopy(bArr, i, bArr8, 0, 8);
            java.lang.System.arraycopy(bArr, i + 8, bArr7, 0, i5);
            this.getHighSpeedVideoFpsRanges.init(false, this.Camera2StreamConfigurationMap);
            int i6 = i3 - 1;
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = i6; i8 > 0; i8--) {
                    java.lang.System.arraycopy(bArr8, 0, bArr9, 0, 8);
                    int i9 = (i8 - 1) * 8;
                    java.lang.System.arraycopy(bArr7, i9, bArr9, 8, 8);
                    int i10 = (i6 * i7) + i8;
                    int i11 = 1;
                    while (i10 != 0) {
                        int i12 = 8 - i11;
                        bArr9[i12] = (byte) (((byte) i10) ^ bArr9[i12]);
                        i10 >>>= 8;
                        i11++;
                    }
                    this.getHighSpeedVideoFpsRanges.processBlock(bArr9, 0, bArr9, 0);
                    java.lang.System.arraycopy(bArr9, 0, bArr8, 0, 8);
                    java.lang.System.arraycopy(bArr9, 8, bArr7, i9, 8);
                }
            }
            this.getHighSpeedVideoSizes = bArr8;
            bArr2 = bArr7;
        }
        int i13 = 4;
        byte[] bArr10 = new byte[4];
        byte[] bArr11 = new byte[4];
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, 0, bArr10, 0, 4);
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, 4, bArr11, 0, 4);
        int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr11, 0);
        boolean constantTimeAreEqual = org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr10, this.getInputSizeshNQ4ISI);
        int length2 = bArr2.length;
        if (bigEndianToInt <= length2 - 8) {
            constantTimeAreEqual = false;
        }
        if (bigEndianToInt > length2) {
            constantTimeAreEqual = false;
        }
        int i14 = length2 - bigEndianToInt;
        if (i14 >= 8 || i14 < 0) {
            constantTimeAreEqual = false;
        } else {
            i13 = i14;
        }
        byte[] bArr12 = new byte[i13];
        java.lang.System.arraycopy(bArr2, bArr2.length - i13, bArr12, 0, i13);
        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr12, new byte[i13]) || !constantTimeAreEqual) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("checksum failed");
        }
        byte[] bArr13 = new byte[bigEndianToInt];
        java.lang.System.arraycopy(bArr2, 0, bArr13, 0, bigEndianToInt);
        return bArr13;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] intToBigEndian = org.bouncycastle.util.Pack.intToBigEndian(i2);
        byte[] bArr3 = this.getInputSizeshNQ4ISI;
        int i3 = 0;
        java.lang.System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        java.lang.System.arraycopy(intToBigEndian, 0, bArr2, this.getInputSizeshNQ4ISI.length, intToBigEndian.length);
        byte[] bArr4 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr4, 0, i2);
        int i4 = (8 - (i2 % 8)) % 8;
        int i5 = i2 + i4;
        byte[] bArr5 = new byte[i5];
        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, i2);
        if (i4 != 0) {
            java.lang.System.arraycopy(new byte[i4], 0, bArr5, i2, i4);
        }
        if (i5 != 8) {
            org.bouncycastle.crypto.engines.RFC3394WrapEngine rFC3394WrapEngine = new org.bouncycastle.crypto.engines.RFC3394WrapEngine(this.getHighSpeedVideoFpsRanges);
            rFC3394WrapEngine.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(this.Camera2StreamConfigurationMap, bArr2));
            return rFC3394WrapEngine.wrap(bArr5, 0, i5);
        }
        int i6 = i5 + 8;
        byte[] bArr6 = new byte[i6];
        java.lang.System.arraycopy(bArr2, 0, bArr6, 0, 8);
        java.lang.System.arraycopy(bArr5, 0, bArr6, 8, i5);
        this.getHighSpeedVideoFpsRanges.init(true, this.Camera2StreamConfigurationMap);
        while (i3 < i6) {
            this.getHighSpeedVideoFpsRanges.processBlock(bArr6, i3, bArr6, i3);
            i3 += this.getHighSpeedVideoFpsRanges.getBlockSize();
        }
        return bArr6;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.KeyParameter) cipherParameters;
            this.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        } else if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getInputSizeshNQ4ISI = parametersWithIV.getIV();
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
            if (this.getInputSizeshNQ4ISI.length != 4) {
                throw new java.lang.IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return this.getHighSpeedVideoFpsRanges.getAlgorithmName();
    }

    public RFC5649WrapEngine(org.bouncycastle.crypto.BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getInputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoFpsRanges = blockCipher;
    }
}
