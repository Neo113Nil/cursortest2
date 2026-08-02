package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RFC3211WrapEngine implements org.bouncycastle.crypto.Wrapper {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.ParametersWithIV getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.modes.CBCBlockCipher getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for wrapping");
        }
        if (i2 > 255 || i2 < 0) {
            throw new java.lang.IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        this.getHighSpeedVideoFpsRanges.init(true, this.getHighResolutionOutputSizeshNQ4ISI);
        int blockSize = this.getHighSpeedVideoFpsRanges.getBlockSize();
        int i3 = i2 + 4;
        int i4 = blockSize * 2;
        if (i3 >= i4) {
            i4 = i3 % blockSize == 0 ? i3 : ((i3 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i4];
        bArr2[0] = (byte) i2;
        java.lang.System.arraycopy(bArr, i, bArr2, 4, i2);
        int i5 = i4 - i3;
        byte[] bArr3 = new byte[i5];
        this.Camera2StreamConfigurationMap.nextBytes(bArr3);
        java.lang.System.arraycopy(bArr3, 0, bArr2, i3, i5);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i6 = 0; i6 < i4; i6 += blockSize) {
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, i6, bArr2, i6);
        }
        for (int i7 = 0; i7 < i4; i7 += blockSize) {
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, i7, bArr2, i7);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.getHighSpeedVideoFpsRanges.getBlockSize();
        if (i2 < blockSize * 2) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("input too short");
        }
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[blockSize];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        java.lang.System.arraycopy(bArr, i, bArr3, 0, blockSize);
        this.getHighSpeedVideoFpsRanges.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(this.getHighResolutionOutputSizeshNQ4ISI.getParameters(), bArr3));
        for (int i3 = blockSize; i3 < i2; i3 += blockSize) {
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, i3, bArr2, i3);
        }
        java.lang.System.arraycopy(bArr2, i2 - blockSize, bArr3, 0, blockSize);
        this.getHighSpeedVideoFpsRanges.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(this.getHighResolutionOutputSizeshNQ4ISI.getParameters(), bArr3));
        this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr2, 0);
        this.getHighSpeedVideoFpsRanges.init(false, this.getHighResolutionOutputSizeshNQ4ISI);
        for (int i4 = 0; i4 < i2; i4 += blockSize) {
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, i4, bArr2, i4);
        }
        int i5 = i2 - 4;
        int i6 = bArr2[0] & 255;
        boolean z = i6 > i5;
        byte[] bArr4 = z ? new byte[i5] : new byte[i6];
        java.lang.System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i7 = 0;
        int i8 = 0;
        while (i7 != 3) {
            int i9 = i7 + 1;
            i8 |= bArr2[i7 + 4] ^ ((byte) (~bArr2[i9]));
            i7 = i9;
        }
        org.bouncycastle.util.Arrays.clear(bArr2);
        if (!z && !(i8 != 0)) {
            return bArr4;
        }
        throw new org.bouncycastle.crypto.InvalidCipherTextException("wrapped key corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.Camera2StreamConfigurationMap = parametersWithRandom.getRandom();
            if (!(parametersWithRandom.getParameters() instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges.getUnderlyingCipher().getAlgorithmName());
        sb.append("/RFC3211Wrap");
        return sb.toString();
    }

    public RFC3211WrapEngine(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.modes.CBCBlockCipher(blockCipher);
    }
}
