package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class IESEngine {
    org.bouncycastle.crypto.BufferedBlockCipher Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.DerivationFunction getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.BasicAgreement getHighSpeedVideoFpsRanges;
    byte[] getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    byte[] getHighSpeedVideoSizesFor;
    org.bouncycastle.crypto.Mac getInputFormats;
    org.bouncycastle.crypto.CipherParameters getInputSizeshNQ4ISI;
    org.bouncycastle.crypto.params.IESParameters getOutputFormats;
    org.bouncycastle.crypto.CipherParameters getOutputMinFrameDuration;
    private org.bouncycastle.crypto.KeyParser getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDurationlomOqCM;

    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        int processBytes;
        byte[] bArr3;
        byte[] bArr4;
        byte[] lengthTag;
        org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher;
        org.bouncycastle.crypto.CipherParameters keyParameter;
        int doFinal;
        byte[] bArr5;
        byte[] bArr6;
        if (this.getHighSpeedVideoSizes) {
            org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.getOutputSizeshNQ4ISI;
            if (ephemeralKeyPairGenerator != null) {
                org.bouncycastle.crypto.EphemeralKeyPair generate = ephemeralKeyPairGenerator.generate();
                this.getOutputMinFrameDuration = generate.getKeyPair().getPrivate();
                this.getHighSpeedVideoFpsRangesFor = generate.getEncodedPublicKey();
            }
        } else if (this.getOutputMinFrameDurationlomOqCM != null) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr, i, i2);
            try {
                this.getInputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM.readKey(byteArrayInputStream);
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.copyOfRange(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to recover ephemeral public key: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.crypto.InvalidCipherTextException(sb.toString(), e);
            } catch (java.lang.IllegalArgumentException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to recover ephemeral public key: ");
                sb2.append(e2.getMessage());
                throw new org.bouncycastle.crypto.InvalidCipherTextException(sb2.toString(), e2);
            }
        }
        this.getHighSpeedVideoFpsRanges.init(this.getOutputMinFrameDuration);
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighSpeedVideoFpsRanges.getFieldSize(), this.getHighSpeedVideoFpsRanges.calculateAgreement(this.getInputSizeshNQ4ISI));
        byte[] bArr7 = this.getHighSpeedVideoFpsRangesFor;
        if (bArr7.length != 0) {
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr7, asUnsignedByteArray);
            org.bouncycastle.util.Arrays.fill(asUnsignedByteArray, (byte) 0);
            bArr2 = concatenate;
        } else {
            bArr2 = asUnsignedByteArray;
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.init(new org.bouncycastle.crypto.params.KDFParameters(bArr2, this.getOutputFormats.getDerivationV()));
            if (this.getHighSpeedVideoSizes) {
                if (this.Camera2StreamConfigurationMap == null) {
                    byte[] bArr8 = new byte[i2];
                    int macKeySize = this.getOutputFormats.getMacKeySize() / 8;
                    bArr5 = new byte[macKeySize];
                    int i3 = i2 + macKeySize;
                    byte[] bArr9 = new byte[i3];
                    this.getHighResolutionOutputSizeshNQ4ISI.generateBytes(bArr9, 0, i3);
                    if (this.getHighSpeedVideoFpsRangesFor.length != 0) {
                        java.lang.System.arraycopy(bArr9, 0, bArr5, 0, macKeySize);
                        java.lang.System.arraycopy(bArr9, macKeySize, bArr8, 0, i2);
                    } else {
                        java.lang.System.arraycopy(bArr9, 0, bArr8, 0, i2);
                        java.lang.System.arraycopy(bArr9, i2, bArr5, 0, macKeySize);
                    }
                    bArr6 = new byte[i2];
                    for (int i4 = 0; i4 != i2; i4++) {
                        bArr6[i4] = (byte) (bArr[i + i4] ^ bArr8[i4]);
                    }
                    doFinal = i2;
                } else {
                    int cipherKeySize = ((org.bouncycastle.crypto.params.IESWithCipherParameters) this.getOutputFormats).getCipherKeySize() / 8;
                    byte[] bArr10 = new byte[cipherKeySize];
                    int macKeySize2 = this.getOutputFormats.getMacKeySize() / 8;
                    byte[] bArr11 = new byte[macKeySize2];
                    int i5 = cipherKeySize + macKeySize2;
                    byte[] bArr12 = new byte[i5];
                    this.getHighResolutionOutputSizeshNQ4ISI.generateBytes(bArr12, 0, i5);
                    java.lang.System.arraycopy(bArr12, 0, bArr10, 0, cipherKeySize);
                    java.lang.System.arraycopy(bArr12, cipherKeySize, bArr11, 0, macKeySize2);
                    if (this.getOutputStallDurationlomOqCM != null) {
                        bufferedBlockCipher = this.Camera2StreamConfigurationMap;
                        keyParameter = new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr10), this.getOutputStallDurationlomOqCM);
                    } else {
                        bufferedBlockCipher = this.Camera2StreamConfigurationMap;
                        keyParameter = new org.bouncycastle.crypto.params.KeyParameter(bArr10);
                    }
                    bufferedBlockCipher.init(true, keyParameter);
                    byte[] bArr13 = new byte[this.Camera2StreamConfigurationMap.getOutputSize(i2)];
                    int processBytes2 = this.Camera2StreamConfigurationMap.processBytes(bArr, i, i2, bArr13, 0);
                    doFinal = processBytes2 + this.Camera2StreamConfigurationMap.doFinal(bArr13, processBytes2);
                    bArr5 = bArr11;
                    bArr6 = bArr13;
                }
                byte[] encodingV = this.getOutputFormats.getEncodingV();
                lengthTag = this.getHighSpeedVideoFpsRangesFor.length != 0 ? getLengthTag(encodingV) : null;
                int macSize = this.getInputFormats.getMacSize();
                byte[] bArr14 = new byte[macSize];
                this.getInputFormats.init(new org.bouncycastle.crypto.params.KeyParameter(bArr5));
                this.getInputFormats.update(bArr6, 0, bArr6.length);
                if (encodingV != null) {
                    this.getInputFormats.update(encodingV, 0, encodingV.length);
                }
                if (this.getHighSpeedVideoFpsRangesFor.length != 0) {
                    this.getInputFormats.update(lengthTag, 0, lengthTag.length);
                }
                this.getInputFormats.doFinal(bArr14, 0);
                byte[] bArr15 = this.getHighSpeedVideoFpsRangesFor;
                bArr4 = new byte[bArr15.length + doFinal + macSize];
                java.lang.System.arraycopy(bArr15, 0, bArr4, 0, bArr15.length);
                java.lang.System.arraycopy(bArr6, 0, bArr4, this.getHighSpeedVideoFpsRangesFor.length, doFinal);
                java.lang.System.arraycopy(bArr14, 0, bArr4, this.getHighSpeedVideoFpsRangesFor.length + doFinal, macSize);
            } else {
                if (i2 < this.getHighSpeedVideoFpsRangesFor.length + this.getInputFormats.getMacSize()) {
                    throw new org.bouncycastle.crypto.InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
                }
                if (this.Camera2StreamConfigurationMap == null) {
                    int length = (i2 - this.getHighSpeedVideoFpsRangesFor.length) - this.getInputFormats.getMacSize();
                    byte[] bArr16 = new byte[length];
                    int macKeySize3 = this.getOutputFormats.getMacKeySize() / 8;
                    bArr3 = new byte[macKeySize3];
                    int i6 = length + macKeySize3;
                    byte[] bArr17 = new byte[i6];
                    this.getHighResolutionOutputSizeshNQ4ISI.generateBytes(bArr17, 0, i6);
                    if (this.getHighSpeedVideoFpsRangesFor.length != 0) {
                        java.lang.System.arraycopy(bArr17, 0, bArr3, 0, macKeySize3);
                        java.lang.System.arraycopy(bArr17, macKeySize3, bArr16, 0, length);
                    } else {
                        java.lang.System.arraycopy(bArr17, 0, bArr16, 0, length);
                        java.lang.System.arraycopy(bArr17, length, bArr3, 0, macKeySize3);
                    }
                    bArr4 = new byte[length];
                    for (int i7 = 0; i7 != length; i7++) {
                        bArr4[i7] = (byte) (bArr[(this.getHighSpeedVideoFpsRangesFor.length + i) + i7] ^ bArr16[i7]);
                    }
                    processBytes = 0;
                } else {
                    int cipherKeySize2 = ((org.bouncycastle.crypto.params.IESWithCipherParameters) this.getOutputFormats).getCipherKeySize() / 8;
                    byte[] bArr18 = new byte[cipherKeySize2];
                    int macKeySize4 = this.getOutputFormats.getMacKeySize() / 8;
                    byte[] bArr19 = new byte[macKeySize4];
                    int i8 = cipherKeySize2 + macKeySize4;
                    byte[] bArr20 = new byte[i8];
                    this.getHighResolutionOutputSizeshNQ4ISI.generateBytes(bArr20, 0, i8);
                    java.lang.System.arraycopy(bArr20, 0, bArr18, 0, cipherKeySize2);
                    java.lang.System.arraycopy(bArr20, cipherKeySize2, bArr19, 0, macKeySize4);
                    org.bouncycastle.crypto.CipherParameters keyParameter2 = new org.bouncycastle.crypto.params.KeyParameter(bArr18);
                    byte[] bArr21 = this.getOutputStallDurationlomOqCM;
                    if (bArr21 != null) {
                        keyParameter2 = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter2, bArr21);
                    }
                    this.Camera2StreamConfigurationMap.init(false, keyParameter2);
                    byte[] bArr22 = new byte[this.Camera2StreamConfigurationMap.getOutputSize((i2 - this.getHighSpeedVideoFpsRangesFor.length) - this.getInputFormats.getMacSize())];
                    org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher2 = this.Camera2StreamConfigurationMap;
                    byte[] bArr23 = this.getHighSpeedVideoFpsRangesFor;
                    processBytes = bufferedBlockCipher2.processBytes(bArr, bArr23.length + i, (i2 - bArr23.length) - this.getInputFormats.getMacSize(), bArr22, 0);
                    bArr3 = bArr19;
                    bArr4 = bArr22;
                }
                byte[] encodingV2 = this.getOutputFormats.getEncodingV();
                lengthTag = this.getHighSpeedVideoFpsRangesFor.length != 0 ? getLengthTag(encodingV2) : null;
                int i9 = i + i2;
                byte[] copyOfRange = org.bouncycastle.util.Arrays.copyOfRange(bArr, i9 - this.getInputFormats.getMacSize(), i9);
                int length2 = copyOfRange.length;
                byte[] bArr24 = new byte[length2];
                this.getInputFormats.init(new org.bouncycastle.crypto.params.KeyParameter(bArr3));
                org.bouncycastle.crypto.Mac mac = this.getInputFormats;
                byte[] bArr25 = this.getHighSpeedVideoFpsRangesFor;
                mac.update(bArr, i + bArr25.length, (i2 - bArr25.length) - length2);
                if (encodingV2 != null) {
                    this.getInputFormats.update(encodingV2, 0, encodingV2.length);
                }
                if (this.getHighSpeedVideoFpsRangesFor.length != 0) {
                    this.getInputFormats.update(lengthTag, 0, lengthTag.length);
                }
                this.getInputFormats.doFinal(bArr24, 0);
                if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(copyOfRange, bArr24)) {
                    throw new org.bouncycastle.crypto.InvalidCipherTextException("invalid MAC");
                }
                org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher3 = this.Camera2StreamConfigurationMap;
                if (bufferedBlockCipher3 != null) {
                    bArr4 = org.bouncycastle.util.Arrays.copyOfRange(bArr4, 0, processBytes + bufferedBlockCipher3.doFinal(bArr4, processBytes));
                }
            }
            return bArr4;
        } finally {
            org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
        }
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.CipherParameters cipherParameters2, org.bouncycastle.crypto.CipherParameters cipherParameters3) {
        this.getHighSpeedVideoSizes = z;
        this.getOutputMinFrameDuration = cipherParameters;
        this.getInputSizeshNQ4ISI = cipherParameters2;
        this.getHighSpeedVideoFpsRangesFor = new byte[0];
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters3);
    }

    public void init(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.getHighSpeedVideoSizes = true;
        this.getInputSizeshNQ4ISI = asymmetricKeyParameter;
        this.getOutputSizeshNQ4ISI = ephemeralKeyPairGenerator;
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters);
    }

    public void init(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.KeyParser keyParser) {
        this.getHighSpeedVideoSizes = false;
        this.getOutputMinFrameDuration = asymmetricKeyParameter;
        this.getOutputMinFrameDurationlomOqCM = keyParser;
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters);
    }

    public org.bouncycastle.crypto.Mac getMac() {
        return this.getInputFormats;
    }

    protected byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            org.bouncycastle.util.Pack.longToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public org.bouncycastle.crypto.BufferedBlockCipher getCipher() {
        return this.Camera2StreamConfigurationMap;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getOutputStallDurationlomOqCM = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.getOutputStallDurationlomOqCM = null;
        }
        this.getOutputFormats = (org.bouncycastle.crypto.params.IESParameters) cipherParameters;
    }

    public IESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
        this.getHighSpeedVideoFpsRanges = basicAgreement;
        this.getHighResolutionOutputSizeshNQ4ISI = derivationFunction;
        this.getInputFormats = mac;
        this.getHighSpeedVideoSizesFor = new byte[mac.getMacSize()];
        this.Camera2StreamConfigurationMap = bufferedBlockCipher;
    }

    public IESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac) {
        this.getHighSpeedVideoFpsRanges = basicAgreement;
        this.getHighResolutionOutputSizeshNQ4ISI = derivationFunction;
        this.getInputFormats = mac;
        this.getHighSpeedVideoSizesFor = new byte[mac.getMacSize()];
        this.Camera2StreamConfigurationMap = null;
    }
}
