package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class DESedeWrapEngine implements org.bouncycastle.crypto.Wrapper {
    private static final byte[] getHighSpeedVideoFpsRangesFor = {74, -35, -94, 44, 121, -24, 33, 5};
    private org.bouncycastle.crypto.modes.CBCBlockCipher Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.util.DigestFactory.createSHA1();
    byte[] getHighSpeedVideoSizes = new byte[20];
    private org.bouncycastle.crypto.params.ParametersWithIV getInputFormats;
    private org.bouncycastle.crypto.params.KeyParameter getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Null pointer as ciphertext");
        }
        int blockSize = this.Camera2StreamConfigurationMap.getBlockSize();
        if (i2 % blockSize != 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Ciphertext not multiple of ".concat(java.lang.String.valueOf(blockSize)));
        }
        this.Camera2StreamConfigurationMap.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(this.getInputSizeshNQ4ISI, getHighSpeedVideoFpsRangesFor));
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 != i2; i3 += blockSize) {
            this.Camera2StreamConfigurationMap.processBlock(bArr, i + i3, bArr2, i3);
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr2);
        byte[] bArr3 = new byte[8];
        this.getOutputMinFrameDuration = bArr3;
        int length = highResolutionOutputSizeshNQ4ISI.length;
        int i4 = length - 8;
        byte[] bArr4 = new byte[i4];
        java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr3, 0, 8);
        java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 8, bArr4, 0, highResolutionOutputSizeshNQ4ISI.length - 8);
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
        this.getInputFormats = parametersWithIV;
        this.Camera2StreamConfigurationMap.init(false, parametersWithIV);
        byte[] bArr5 = new byte[i4];
        for (int i5 = 0; i5 != i4; i5 += blockSize) {
            this.Camera2StreamConfigurationMap.processBlock(bArr4, i5, bArr5, i5);
        }
        int i6 = length - 16;
        byte[] bArr6 = new byte[i6];
        byte[] bArr7 = new byte[8];
        java.lang.System.arraycopy(bArr5, 0, bArr6, 0, i6);
        java.lang.System.arraycopy(bArr5, i6, bArr7, 0, 8);
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(getHighSpeedVideoSizes(bArr6), bArr7)) {
            return bArr6;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("Checksum inside ciphertext is corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2);
        int length = highSpeedVideoSizes.length + i2;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i2);
        java.lang.System.arraycopy(highSpeedVideoSizes, 0, bArr3, i2, highSpeedVideoSizes.length);
        int blockSize = this.Camera2StreamConfigurationMap.getBlockSize();
        if (length % blockSize != 0) {
            throw new java.lang.IllegalStateException("Not multiple of block length");
        }
        this.Camera2StreamConfigurationMap.init(true, this.getInputFormats);
        byte[] bArr4 = new byte[length];
        for (int i3 = 0; i3 != length; i3 += blockSize) {
            this.Camera2StreamConfigurationMap.processBlock(bArr3, i3, bArr4, i3);
        }
        byte[] bArr5 = this.getOutputMinFrameDuration;
        byte[] bArr6 = new byte[bArr5.length + length];
        java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        java.lang.System.arraycopy(bArr4, 0, bArr6, this.getOutputMinFrameDuration.length, length);
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr6);
        this.Camera2StreamConfigurationMap.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(this.getInputSizeshNQ4ISI, getHighSpeedVideoFpsRangesFor));
        for (int i4 = 0; i4 != highResolutionOutputSizeshNQ4ISI.length; i4 += blockSize) {
            this.Camera2StreamConfigurationMap.processBlock(highResolutionOutputSizeshNQ4ISI, i4, highResolutionOutputSizeshNQ4ISI, i4);
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine());
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            org.bouncycastle.crypto.CipherParameters parameters = parametersWithRandom.getParameters();
            java.security.SecureRandom random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
            secureRandom = random;
        } else {
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            this.getInputSizeshNQ4ISI = (org.bouncycastle.crypto.params.KeyParameter) cipherParameters;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                byte[] bArr = new byte[8];
                this.getOutputMinFrameDuration = bArr;
                secureRandom.nextBytes(bArr);
                this.getInputFormats = new org.bouncycastle.crypto.params.ParametersWithIV(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
                return;
            }
            return;
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getInputFormats = parametersWithIV;
            this.getOutputMinFrameDuration = parametersWithIV.getIV();
            this.getInputSizeshNQ4ISI = (org.bouncycastle.crypto.params.KeyParameter) this.getInputFormats.getParameters();
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.getOutputMinFrameDuration;
            if (bArr2 == null || bArr2.length != 8) {
                throw new java.lang.IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return "DESede";
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            bArr2[i] = bArr[bArr.length - i2];
            i = i2;
        }
        return bArr2;
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.getHighSpeedVideoFpsRanges.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoFpsRanges.doFinal(this.getHighSpeedVideoSizes, 0);
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, 0, bArr2, 0, 8);
        return bArr2;
    }
}
