package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC2WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private static final byte[] getHighSpeedVideoFpsRanges = {74, -35, -94, 44, 121, -24, 33, 5};
    private org.bouncycastle.crypto.modes.CBCBlockCipher Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ParametersWithIV getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.CipherParameters getOutputMinFrameDuration;
    org.bouncycastle.crypto.Digest getHighSpeedVideoSizes = org.bouncycastle.crypto.util.DigestFactory.createSHA1();
    byte[] getHighSpeedVideoFpsRangesFor = new byte[20];

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (i2 % this.Camera2StreamConfigurationMap.getBlockSize() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ciphertext not multiple of ");
            sb.append(this.Camera2StreamConfigurationMap.getBlockSize());
            throw new org.bouncycastle.crypto.InvalidCipherTextException(sb.toString());
        }
        this.Camera2StreamConfigurationMap.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(this.getOutputMinFrameDuration, getHighSpeedVideoFpsRanges));
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        for (int i3 = 0; i3 < i2 / this.Camera2StreamConfigurationMap.getBlockSize(); i3++) {
            int blockSize = this.Camera2StreamConfigurationMap.getBlockSize() * i3;
            this.Camera2StreamConfigurationMap.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i2];
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            bArr3[i4] = bArr2[i2 - i5];
            i4 = i5;
        }
        byte[] bArr4 = new byte[8];
        this.getInputFormats = bArr4;
        int i6 = i2 - 8;
        byte[] bArr5 = new byte[i6];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, 8);
        java.lang.System.arraycopy(bArr3, 8, bArr5, 0, i6);
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(this.getOutputMinFrameDuration, this.getInputFormats);
        this.getHighSpeedVideoSizesFor = parametersWithIV;
        this.Camera2StreamConfigurationMap.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i6];
        java.lang.System.arraycopy(bArr5, 0, bArr6, 0, i6);
        for (int i7 = 0; i7 < i6 / this.Camera2StreamConfigurationMap.getBlockSize(); i7++) {
            int blockSize2 = this.Camera2StreamConfigurationMap.getBlockSize() * i7;
            this.Camera2StreamConfigurationMap.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i8 = i2 - 16;
        byte[] bArr7 = new byte[i8];
        byte[] bArr8 = new byte[8];
        java.lang.System.arraycopy(bArr6, 0, bArr7, 0, i8);
        java.lang.System.arraycopy(bArr6, i8, bArr8, 0, 8);
        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(getHighResolutionOutputSizeshNQ4ISI(bArr7), bArr8)) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i9 = bArr7[0];
        if (i8 - ((i9 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i9];
            java.lang.System.arraycopy(bArr7, 1, bArr9, 0, i9);
            return bArr9;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("too many pad bytes (");
        sb2.append(i8 - ((bArr7[0] & 255) + 1));
        sb2.append(")");
        throw new org.bouncycastle.crypto.InvalidCipherTextException(sb2.toString());
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Not initialized for wrapping");
        }
        int i3 = i2 + 1;
        int i4 = i3 % 8;
        int i5 = i4 != 0 ? (8 - i4) + i3 : i3;
        byte[] bArr2 = new byte[i5];
        bArr2[0] = (byte) i2;
        java.lang.System.arraycopy(bArr, i, bArr2, 1, i2);
        int i6 = (i5 - i2) - 1;
        byte[] bArr3 = new byte[i6];
        if (i6 > 0) {
            this.getInputSizeshNQ4ISI.nextBytes(bArr3);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i3, i6);
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr2);
        int length = highResolutionOutputSizeshNQ4ISI.length + i5;
        byte[] bArr4 = new byte[length];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, i5);
        java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr4, i5, highResolutionOutputSizeshNQ4ISI.length);
        byte[] bArr5 = new byte[length];
        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.Camera2StreamConfigurationMap.getBlockSize();
        if (length % this.Camera2StreamConfigurationMap.getBlockSize() != 0) {
            throw new java.lang.IllegalStateException("Not multiple of block length");
        }
        this.Camera2StreamConfigurationMap.init(true, this.getHighSpeedVideoSizesFor);
        for (int i7 = 0; i7 < blockSize; i7++) {
            int blockSize2 = this.Camera2StreamConfigurationMap.getBlockSize() * i7;
            this.Camera2StreamConfigurationMap.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.getInputFormats;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        java.lang.System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        java.lang.System.arraycopy(bArr5, 0, bArr7, this.getInputFormats.length, length);
        byte[] bArr8 = new byte[length2];
        int i8 = 0;
        while (i8 < length2) {
            int i9 = i8 + 1;
            bArr8[i8] = bArr7[length2 - i9];
            i8 = i9;
        }
        this.Camera2StreamConfigurationMap.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(this.getOutputMinFrameDuration, getHighSpeedVideoFpsRanges));
        for (int i10 = 0; i10 < blockSize + 1; i10++) {
            int blockSize3 = this.Camera2StreamConfigurationMap.getBlockSize() * i10;
            this.Camera2StreamConfigurationMap.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine());
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getInputSizeshNQ4ISI = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.getInputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            this.getOutputMinFrameDuration = cipherParameters;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                byte[] bArr = new byte[8];
                this.getInputFormats = bArr;
                this.getInputSizeshNQ4ISI.nextBytes(bArr);
                this.getHighSpeedVideoSizesFor = new org.bouncycastle.crypto.params.ParametersWithIV(this.getOutputMinFrameDuration, this.getInputFormats);
                return;
            }
            return;
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        this.getHighSpeedVideoSizesFor = parametersWithIV;
        this.getInputFormats = parametersWithIV.getIV();
        this.getOutputMinFrameDuration = this.getHighSpeedVideoSizesFor.getParameters();
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.getInputFormats;
        if (bArr2 == null || bArr2.length != 8) {
            throw new java.lang.IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        return "RC2";
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoSizes.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, bArr2, 0, 8);
        return bArr2;
    }
}
