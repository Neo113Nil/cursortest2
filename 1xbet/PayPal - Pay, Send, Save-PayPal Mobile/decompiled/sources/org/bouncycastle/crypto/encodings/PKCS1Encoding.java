package org.bouncycastle.crypto.encodings;

/* loaded from: classes17.dex */
public class PKCS1Encoding implements org.bouncycastle.crypto.AsymmetricBlockCipher {
    public static final java.lang.String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final java.lang.String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private org.bouncycastle.crypto.AsymmetricBlockCipher Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private java.security.SecureRandom getOutputMinFrameDuration;

    public PKCS1Encoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getInputFormats = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = asymmetricBlockCipher;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true) ? false : !org.bouncycastle.util.Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
    }

    public PKCS1Encoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, int i) {
        this.getInputFormats = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = asymmetricBlockCipher;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true) ? false : !org.bouncycastle.util.Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
        this.getInputFormats = i;
    }

    public PKCS1Encoding(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.getInputFormats = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = asymmetricBlockCipher;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true) ? false : !org.bouncycastle.util.Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getInputFormats = bArr.length;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        if (this.getHighSpeedVideoSizes) {
            if (i2 > getInputBlockSize()) {
                throw new java.lang.IllegalArgumentException("input data too large");
            }
            int inputBlockSize = this.Camera2StreamConfigurationMap.getInputBlockSize();
            byte[] bArr2 = new byte[inputBlockSize];
            if (this.getHighSpeedVideoFpsRanges) {
                bArr2[0] = 1;
                for (int i3 = 1; i3 != (inputBlockSize - i2) - 1; i3++) {
                    bArr2[i3] = -1;
                }
            } else {
                this.getOutputMinFrameDuration.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i4 = 1; i4 != (inputBlockSize - i2) - 1; i4++) {
                    while (bArr2[i4] == 0) {
                        bArr2[i4] = (byte) this.getOutputMinFrameDuration.nextInt();
                    }
                }
            }
            int i5 = inputBlockSize - i2;
            bArr2[i5 - 1] = 0;
            java.lang.System.arraycopy(bArr, i, bArr2, i5, i2);
            return this.Camera2StreamConfigurationMap.processBlock(bArr2, 0, inputBlockSize);
        }
        if (this.getInputFormats == -1) {
            byte[] processBlock = this.Camera2StreamConfigurationMap.processBlock(bArr, i, i2);
            boolean z = this.getHighSpeedVideoSizesFor;
            boolean z2 = processBlock.length != this.Camera2StreamConfigurationMap.getOutputBlockSize();
            if (processBlock.length < getOutputBlockSize()) {
                processBlock = this.getHighSpeedVideoFpsRangesFor;
            }
            byte b = processBlock[0];
            boolean z3 = !this.getHighSpeedVideoFpsRanges ? b == 1 : b == 2;
            int i6 = -1;
            boolean z4 = false;
            for (int i7 = 1; i7 != processBlock.length; i7++) {
                byte b2 = processBlock[i7];
                if ((b2 == 0) & (i6 < 0)) {
                    i6 = i7;
                }
                z4 |= (b2 != -1) & (b == 1) & (i6 < 0);
            }
            int i8 = (z4 ? -1 : i6) + 1;
            if (z3 || (i8 < 10)) {
                org.bouncycastle.util.Arrays.fill(processBlock, (byte) 0);
                throw new org.bouncycastle.crypto.InvalidCipherTextException("block incorrect");
            }
            if (z && z2) {
                org.bouncycastle.util.Arrays.fill(processBlock, (byte) 0);
                throw new org.bouncycastle.crypto.InvalidCipherTextException("block incorrect size");
            }
            int length = processBlock.length - i8;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(processBlock, i8, bArr3, 0, length);
            return bArr3;
        }
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] processBlock2 = this.Camera2StreamConfigurationMap.processBlock(bArr, i, i2);
        byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr4 == null) {
            bArr4 = new byte[this.getInputFormats];
            this.getOutputMinFrameDuration.nextBytes(bArr4);
        }
        if (this.getHighSpeedVideoSizesFor & (processBlock2.length != this.Camera2StreamConfigurationMap.getOutputBlockSize())) {
            processBlock2 = this.getHighSpeedVideoFpsRangesFor;
        }
        int i9 = this.getInputFormats;
        int i10 = processBlock2[0] ^ 2;
        int length2 = processBlock2.length;
        int i11 = i9 + 1;
        for (int i12 = 1; i12 < length2 - i11; i12++) {
            byte b3 = processBlock2[i12];
            int i13 = b3 | (b3 >> 1);
            int i14 = i13 | (i13 >> 2);
            i10 |= ((i14 | (i14 >> 4)) & 1) - 1;
        }
        int i15 = processBlock2[processBlock2.length - i11] | i10;
        int i16 = i15 | (i15 >> 1);
        int i17 = i16 | (i16 >> 2);
        int i18 = ~(((i17 | (i17 >> 4)) & 1) - 1);
        byte[] bArr5 = new byte[this.getInputFormats];
        int i19 = 0;
        while (true) {
            int i20 = this.getInputFormats;
            if (i19 >= i20) {
                org.bouncycastle.util.Arrays.fill(processBlock2, (byte) 0);
                return bArr5;
            }
            bArr5[i19] = (byte) ((processBlock2[(processBlock2.length - i20) + i19] & (~i18)) | (bArr4[i19] & i18));
            i19++;
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getOutputMinFrameDuration = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z) {
                this.getOutputMinFrameDuration = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
        }
        this.Camera2StreamConfigurationMap.init(z, cipherParameters);
        this.getHighSpeedVideoFpsRanges = asymmetricKeyParameter.isPrivate();
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = new byte[this.Camera2StreamConfigurationMap.getOutputBlockSize()];
        if (this.getInputFormats > 0 && this.getHighResolutionOutputSizeshNQ4ISI == null && this.getOutputMinFrameDuration == null) {
            throw new java.lang.IllegalArgumentException("encoder requires random");
        }
    }

    public org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.Camera2StreamConfigurationMap.getOutputBlockSize();
        return this.getHighSpeedVideoSizes ? outputBlockSize : outputBlockSize - 10;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.Camera2StreamConfigurationMap.getInputBlockSize();
        return this.getHighSpeedVideoSizes ? inputBlockSize - 10 : inputBlockSize;
    }
}
