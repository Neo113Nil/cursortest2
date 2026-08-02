package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RFC3394WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.BlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for wrapping");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new org.bouncycastle.crypto.DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr3 = new byte[bArr2.length + i2];
        byte[] bArr4 = new byte[bArr2.length + 8];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        java.lang.System.arraycopy(bArr, i, bArr3, this.getHighSpeedVideoFpsRanges.length, i2);
        this.getHighResolutionOutputSizeshNQ4ISI.init(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        for (int i4 = 0; i4 != 6; i4++) {
            for (int i5 = 1; i5 <= i3; i5++) {
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, this.getHighSpeedVideoFpsRanges.length);
                int i6 = i5 * 8;
                java.lang.System.arraycopy(bArr3, i6, bArr4, this.getHighSpeedVideoFpsRanges.length, 8);
                this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr4, 0, bArr4, 0);
                int i7 = (i3 * i4) + i5;
                int i8 = 1;
                while (i7 != 0) {
                    int length = this.getHighSpeedVideoFpsRanges.length - i8;
                    bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                    i7 >>>= 8;
                    i8++;
                }
                java.lang.System.arraycopy(bArr4, 0, bArr3, 0, 8);
                java.lang.System.arraycopy(bArr4, 8, bArr3, i6, 8);
            }
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for unwrapping");
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr3 = new byte[i2 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        java.lang.System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(bArr, i + bArr6.length, bArr3, 0, i2 - bArr6.length);
        this.getHighResolutionOutputSizeshNQ4ISI.init(!this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        int i4 = i3 - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 > 0; i6--) {
                java.lang.System.arraycopy(bArr4, 0, bArr5, 0, this.getHighSpeedVideoFpsRanges.length);
                int i7 = (i6 - 1) * 8;
                java.lang.System.arraycopy(bArr3, i7, bArr5, this.getHighSpeedVideoFpsRanges.length, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int length = this.getHighSpeedVideoFpsRanges.length - i9;
                    bArr5[length] = (byte) (((byte) i8) ^ bArr5[length]);
                    i8 >>>= 8;
                    i9++;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr5, 0, bArr5, 0);
                java.lang.System.arraycopy(bArr5, 0, bArr4, 0, 8);
                java.lang.System.arraycopy(bArr5, 8, bArr3, i7, 8);
            }
        }
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr4, this.getHighSpeedVideoFpsRanges)) {
            return bArr3;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("checksum failed");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.KeyParameter) cipherParameters;
            return;
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getHighSpeedVideoFpsRanges = parametersWithIV.getIV();
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
            if (this.getHighSpeedVideoFpsRanges.length != 8) {
                throw new java.lang.IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName();
    }

    public RFC3394WrapEngine(org.bouncycastle.crypto.BlockCipher blockCipher, boolean z) {
        this.getHighSpeedVideoFpsRanges = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.getHighResolutionOutputSizeshNQ4ISI = blockCipher;
        this.Camera2StreamConfigurationMap = !z;
    }

    public RFC3394WrapEngine(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, false);
    }
}
