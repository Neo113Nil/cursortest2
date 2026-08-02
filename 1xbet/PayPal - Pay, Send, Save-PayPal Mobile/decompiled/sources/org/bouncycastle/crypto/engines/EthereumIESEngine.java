package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class EthereumIESEngine {
    byte[] Camera2StreamConfigurationMap;
    byte[] getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.crypto.BasicAgreement getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.crypto.BufferedBlockCipher getHighSpeedVideoSizes;
    org.bouncycastle.crypto.CipherParameters getHighSpeedVideoSizesFor;
    org.bouncycastle.crypto.DerivationFunction getInputFormats;
    org.bouncycastle.crypto.params.IESParameters getInputSizeshNQ4ISI;
    org.bouncycastle.crypto.Mac getOutputFormats;
    byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator getOutputSizes;
    org.bouncycastle.crypto.CipherParameters getOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.KeyParser getOutputStallDuration;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    public byte[] processBlock(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int processBytes;
        byte[] bArr4;
        byte[] bArr5;
        byte[] lengthTag;
        byte[] bArr6;
        org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher;
        org.bouncycastle.crypto.CipherParameters keyParameter;
        int doFinal;
        byte[] bArr7;
        byte[] bArr8;
        if (this.getHighSpeedVideoFpsRangesFor) {
            org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.getOutputSizes;
            if (ephemeralKeyPairGenerator != null) {
                org.bouncycastle.crypto.EphemeralKeyPair generate = ephemeralKeyPairGenerator.generate();
                this.getHighSpeedVideoSizesFor = generate.getKeyPair().getPrivate();
                this.Camera2StreamConfigurationMap = generate.getEncodedPublicKey();
            }
        } else if (this.getOutputStallDuration != null) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr, i, i2);
            try {
                this.getOutputSizeshNQ4ISI = this.getOutputStallDuration.readKey(byteArrayInputStream);
                this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.copyOfRange(bArr, i, (i2 - byteArrayInputStream.available()) + i);
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
        this.getHighSpeedVideoFpsRanges.init(this.getHighSpeedVideoSizesFor);
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(this.getHighSpeedVideoFpsRanges.getFieldSize(), this.getHighSpeedVideoFpsRanges.calculateAgreement(this.getOutputSizeshNQ4ISI));
        byte[] bArr9 = this.Camera2StreamConfigurationMap;
        if (bArr9.length != 0) {
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr9, asUnsignedByteArray);
            org.bouncycastle.util.Arrays.fill(asUnsignedByteArray, (byte) 0);
            bArr2 = concatenate;
        } else {
            bArr2 = asUnsignedByteArray;
        }
        try {
            this.getInputFormats.init(new org.bouncycastle.crypto.params.KDFParameters(bArr2, this.getInputSizeshNQ4ISI.getDerivationV()));
            if (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes == null) {
                    byte[] bArr10 = new byte[i2];
                    int macKeySize = this.getInputSizeshNQ4ISI.getMacKeySize() / 8;
                    bArr7 = new byte[macKeySize];
                    int i3 = i2 + macKeySize;
                    byte[] bArr11 = new byte[i3];
                    this.getInputFormats.generateBytes(bArr11, 0, i3);
                    if (this.Camera2StreamConfigurationMap.length != 0) {
                        java.lang.System.arraycopy(bArr11, 0, bArr7, 0, macKeySize);
                        java.lang.System.arraycopy(bArr11, macKeySize, bArr10, 0, i2);
                    } else {
                        java.lang.System.arraycopy(bArr11, 0, bArr10, 0, i2);
                        java.lang.System.arraycopy(bArr11, i2, bArr7, 0, macKeySize);
                    }
                    bArr8 = new byte[i2];
                    for (int i4 = 0; i4 != i2; i4++) {
                        bArr8[i4] = (byte) (bArr[i + i4] ^ bArr10[i4]);
                    }
                    doFinal = i2;
                } else {
                    int cipherKeySize = ((org.bouncycastle.crypto.params.IESWithCipherParameters) this.getInputSizeshNQ4ISI).getCipherKeySize() / 8;
                    byte[] bArr12 = new byte[cipherKeySize];
                    int macKeySize2 = this.getInputSizeshNQ4ISI.getMacKeySize() / 8;
                    byte[] bArr13 = new byte[macKeySize2];
                    int i5 = cipherKeySize + macKeySize2;
                    byte[] bArr14 = new byte[i5];
                    this.getInputFormats.generateBytes(bArr14, 0, i5);
                    java.lang.System.arraycopy(bArr14, 0, bArr12, 0, cipherKeySize);
                    java.lang.System.arraycopy(bArr14, cipherKeySize, bArr13, 0, macKeySize2);
                    if (this.getOutputMinFrameDurationlomOqCM != null) {
                        bufferedBlockCipher = this.getHighSpeedVideoSizes;
                        keyParameter = new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr12), this.getOutputMinFrameDurationlomOqCM);
                    } else {
                        bufferedBlockCipher = this.getHighSpeedVideoSizes;
                        keyParameter = new org.bouncycastle.crypto.params.KeyParameter(bArr12);
                    }
                    bufferedBlockCipher.init(true, keyParameter);
                    byte[] bArr15 = new byte[this.getHighSpeedVideoSizes.getOutputSize(i2)];
                    int processBytes2 = this.getHighSpeedVideoSizes.processBytes(bArr, i, i2, bArr15, 0);
                    doFinal = processBytes2 + this.getHighSpeedVideoSizes.doFinal(bArr15, processBytes2);
                    bArr7 = bArr13;
                    bArr8 = bArr15;
                }
                byte[] encodingV = this.getInputSizeshNQ4ISI.getEncodingV();
                lengthTag = this.Camera2StreamConfigurationMap.length != 0 ? getLengthTag(encodingV) : null;
                int macSize = this.getOutputFormats.getMacSize();
                byte[] bArr16 = new byte[macSize];
                org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest = new org.bouncycastle.crypto.digests.SHA256Digest();
                byte[] bArr17 = new byte[sHA256Digest.getDigestSize()];
                sHA256Digest.reset();
                sHA256Digest.update(bArr7, 0, bArr7.length);
                sHA256Digest.doFinal(bArr17, 0);
                this.getOutputFormats.init(new org.bouncycastle.crypto.params.KeyParameter(bArr17));
                org.bouncycastle.crypto.Mac mac = this.getOutputFormats;
                byte[] bArr18 = this.getOutputMinFrameDurationlomOqCM;
                mac.update(bArr18, 0, bArr18.length);
                this.getOutputFormats.update(bArr8, 0, bArr8.length);
                if (encodingV != null) {
                    this.getOutputFormats.update(encodingV, 0, encodingV.length);
                }
                if (this.Camera2StreamConfigurationMap.length != 0) {
                    this.getOutputFormats.update(lengthTag, 0, lengthTag.length);
                }
                org.bouncycastle.crypto.Mac mac2 = this.getOutputFormats;
                byte[] bArr19 = this.getHighResolutionOutputSizeshNQ4ISI;
                mac2.update(bArr19, 0, bArr19.length);
                this.getOutputFormats.doFinal(bArr16, 0);
                byte[] bArr20 = this.Camera2StreamConfigurationMap;
                bArr5 = new byte[bArr20.length + doFinal + macSize];
                java.lang.System.arraycopy(bArr20, 0, bArr5, 0, bArr20.length);
                java.lang.System.arraycopy(bArr8, 0, bArr5, this.Camera2StreamConfigurationMap.length, doFinal);
                java.lang.System.arraycopy(bArr16, 0, bArr5, this.Camera2StreamConfigurationMap.length + doFinal, macSize);
                bArr6 = bArr2;
            } else {
                bArr3 = this.Camera2StreamConfigurationMap.length + this.getOutputFormats.getMacSize();
                try {
                    if (i2 < bArr3) {
                        throw new org.bouncycastle.crypto.InvalidCipherTextException("length of input must be greater than the MAC and V combined");
                    }
                    if (this.getHighSpeedVideoSizes == null) {
                        int length = (i2 - this.Camera2StreamConfigurationMap.length) - this.getOutputFormats.getMacSize();
                        byte[] bArr21 = new byte[length];
                        int macKeySize3 = this.getInputSizeshNQ4ISI.getMacKeySize() / 8;
                        bArr4 = new byte[macKeySize3];
                        int i6 = length + macKeySize3;
                        byte[] bArr22 = new byte[i6];
                        this.getInputFormats.generateBytes(bArr22, 0, i6);
                        if (this.Camera2StreamConfigurationMap.length != 0) {
                            java.lang.System.arraycopy(bArr22, 0, bArr4, 0, macKeySize3);
                            java.lang.System.arraycopy(bArr22, macKeySize3, bArr21, 0, length);
                        } else {
                            java.lang.System.arraycopy(bArr22, 0, bArr21, 0, length);
                            java.lang.System.arraycopy(bArr22, length, bArr4, 0, macKeySize3);
                        }
                        bArr5 = new byte[length];
                        for (int i7 = 0; i7 != length; i7++) {
                            bArr5[i7] = (byte) (bArr[(this.Camera2StreamConfigurationMap.length + i) + i7] ^ bArr21[i7]);
                        }
                        processBytes = 0;
                    } else {
                        int cipherKeySize2 = ((org.bouncycastle.crypto.params.IESWithCipherParameters) this.getInputSizeshNQ4ISI).getCipherKeySize() / 8;
                        byte[] bArr23 = new byte[cipherKeySize2];
                        int macKeySize4 = this.getInputSizeshNQ4ISI.getMacKeySize() / 8;
                        byte[] bArr24 = new byte[macKeySize4];
                        int i8 = cipherKeySize2 + macKeySize4;
                        byte[] bArr25 = new byte[i8];
                        this.getInputFormats.generateBytes(bArr25, 0, i8);
                        java.lang.System.arraycopy(bArr25, 0, bArr23, 0, cipherKeySize2);
                        java.lang.System.arraycopy(bArr25, cipherKeySize2, bArr24, 0, macKeySize4);
                        org.bouncycastle.crypto.CipherParameters keyParameter2 = new org.bouncycastle.crypto.params.KeyParameter(bArr23);
                        byte[] bArr26 = this.getOutputMinFrameDurationlomOqCM;
                        if (bArr26 != null) {
                            keyParameter2 = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter2, bArr26);
                        }
                        this.getHighSpeedVideoSizes.init(false, keyParameter2);
                        byte[] bArr27 = new byte[this.getHighSpeedVideoSizes.getOutputSize((i2 - this.Camera2StreamConfigurationMap.length) - this.getOutputFormats.getMacSize())];
                        org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher2 = this.getHighSpeedVideoSizes;
                        byte[] bArr28 = this.Camera2StreamConfigurationMap;
                        processBytes = bufferedBlockCipher2.processBytes(bArr, bArr28.length + i, (i2 - bArr28.length) - this.getOutputFormats.getMacSize(), bArr27, 0);
                        bArr4 = bArr24;
                        bArr5 = bArr27;
                    }
                    byte[] encodingV2 = this.getInputSizeshNQ4ISI.getEncodingV();
                    lengthTag = this.Camera2StreamConfigurationMap.length != 0 ? getLengthTag(encodingV2) : null;
                    int i9 = i + i2;
                    byte[] copyOfRange = org.bouncycastle.util.Arrays.copyOfRange(bArr, i9 - this.getOutputFormats.getMacSize(), i9);
                    int length2 = copyOfRange.length;
                    byte[] bArr29 = new byte[length2];
                    org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest2 = new org.bouncycastle.crypto.digests.SHA256Digest();
                    byte[] bArr30 = new byte[sHA256Digest2.getDigestSize()];
                    sHA256Digest2.reset();
                    byte[] bArr31 = bArr2;
                    try {
                        sHA256Digest2.update(bArr4, 0, bArr4.length);
                        sHA256Digest2.doFinal(bArr30, 0);
                        this.getOutputFormats.init(new org.bouncycastle.crypto.params.KeyParameter(bArr30));
                        org.bouncycastle.crypto.Mac mac3 = this.getOutputFormats;
                        byte[] bArr32 = this.getOutputMinFrameDurationlomOqCM;
                        mac3.update(bArr32, 0, bArr32.length);
                        org.bouncycastle.crypto.Mac mac4 = this.getOutputFormats;
                        byte[] bArr33 = this.Camera2StreamConfigurationMap;
                        mac4.update(bArr, i + bArr33.length, (i2 - bArr33.length) - length2);
                        if (encodingV2 != null) {
                            this.getOutputFormats.update(encodingV2, 0, encodingV2.length);
                        }
                        if (this.Camera2StreamConfigurationMap.length != 0) {
                            this.getOutputFormats.update(lengthTag, 0, lengthTag.length);
                        }
                        org.bouncycastle.crypto.Mac mac5 = this.getOutputFormats;
                        byte[] bArr34 = this.getHighResolutionOutputSizeshNQ4ISI;
                        mac5.update(bArr34, 0, bArr34.length);
                        this.getOutputFormats.doFinal(bArr29, 0);
                        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(copyOfRange, bArr29)) {
                            throw new org.bouncycastle.crypto.InvalidCipherTextException("invalid MAC");
                        }
                        org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher3 = this.getHighSpeedVideoSizes;
                        if (bufferedBlockCipher3 != null) {
                            bArr5 = org.bouncycastle.util.Arrays.copyOfRange(bArr5, 0, processBytes + bufferedBlockCipher3.doFinal(bArr5, processBytes));
                        }
                        bArr6 = bArr31;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr3 = bArr31;
                        org.bouncycastle.util.Arrays.fill(bArr3, (byte) 0);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            org.bouncycastle.util.Arrays.fill(bArr6, (byte) 0);
            return bArr5;
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr3 = bArr2;
        }
    }

    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.CipherParameters cipherParameters2, org.bouncycastle.crypto.CipherParameters cipherParameters3) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizesFor = cipherParameters;
        this.getOutputSizeshNQ4ISI = cipherParameters2;
        this.Camera2StreamConfigurationMap = new byte[0];
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters3);
    }

    public void init(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputSizeshNQ4ISI = asymmetricKeyParameter;
        this.getOutputSizes = ephemeralKeyPairGenerator;
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters);
    }

    public void init(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.KeyParser keyParser) {
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizesFor = asymmetricKeyParameter;
        this.getOutputStallDuration = keyParser;
        getHighResolutionOutputSizeshNQ4ISI(cipherParameters);
    }

    public org.bouncycastle.crypto.Mac getMac() {
        return this.getOutputFormats;
    }

    public static class HandshakeKDFFunction implements org.bouncycastle.crypto.DigestDerivationFunction {
        private int Camera2StreamConfigurationMap;
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
        private byte[] getHighSpeedVideoSizes;

        @Override // org.bouncycastle.crypto.DerivationFunction
        public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
            if (derivationParameters instanceof org.bouncycastle.crypto.params.KDFParameters) {
                org.bouncycastle.crypto.params.KDFParameters kDFParameters = (org.bouncycastle.crypto.params.KDFParameters) derivationParameters;
                this.getHighSpeedVideoSizes = kDFParameters.getSharedSecret();
                this.getHighResolutionOutputSizeshNQ4ISI = kDFParameters.getIV();
            } else {
                if (!(derivationParameters instanceof org.bouncycastle.crypto.params.ISO18033KDFParameters)) {
                    throw new java.lang.IllegalArgumentException("KDF parameters required for generator");
                }
                this.getHighSpeedVideoSizes = ((org.bouncycastle.crypto.params.ISO18033KDFParameters) derivationParameters).getSeed();
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }

        @Override // org.bouncycastle.crypto.DigestDerivationFunction
        public org.bouncycastle.crypto.Digest getDigest() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.crypto.DerivationFunction
        public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
            int i3 = i2;
            int i4 = i;
            if (bArr.length - i3 < i4) {
                throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
            }
            long j = i3;
            int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
            if (j > 8589934591L) {
                throw new java.lang.IllegalArgumentException("output length too large");
            }
            long j2 = digestSize;
            int i5 = (int) (((j + j2) - 1) / j2);
            byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
            int i6 = 4;
            byte[] bArr3 = new byte[4];
            org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr3, 0);
            int i7 = this.Camera2StreamConfigurationMap & (-256);
            int i8 = 0;
            while (i8 < i5) {
                this.getHighSpeedVideoFpsRangesFor.update(bArr3, 0, i6);
                org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRangesFor;
                byte[] bArr4 = this.getHighSpeedVideoSizes;
                digest.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (bArr5 != null) {
                    this.getHighSpeedVideoFpsRangesFor.update(bArr5, 0, bArr5.length);
                }
                this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
                if (i3 > digestSize) {
                    java.lang.System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                    i4 += digestSize;
                    i3 -= digestSize;
                } else {
                    java.lang.System.arraycopy(bArr2, 0, bArr, i4, i3);
                }
                byte b = (byte) (bArr3[3] + 1);
                bArr3[3] = b;
                if (b == 0) {
                    i7 += 256;
                    org.bouncycastle.util.Pack.intToBigEndian(i7, bArr3, 0);
                }
                i8++;
                i6 = 4;
            }
            this.getHighSpeedVideoFpsRangesFor.reset();
            return (int) j;
        }

        public HandshakeKDFFunction(int i, org.bouncycastle.crypto.Digest digest) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = digest;
        }
    }

    protected byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            org.bouncycastle.util.Pack.longToBigEndian(bArr.length * 8, bArr2, 0);
        }
        return bArr2;
    }

    public org.bouncycastle.crypto.BufferedBlockCipher getCipher() {
        return this.getHighSpeedVideoSizes;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getOutputMinFrameDurationlomOqCM = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        this.getInputSizeshNQ4ISI = (org.bouncycastle.crypto.params.IESParameters) cipherParameters;
    }

    public EthereumIESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac, byte[] bArr, org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
        this.getHighSpeedVideoFpsRanges = basicAgreement;
        this.getInputFormats = derivationFunction;
        this.getOutputFormats = mac;
        this.getOutputMinFrameDuration = new byte[mac.getMacSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = bufferedBlockCipher;
    }

    public EthereumIESEngine(org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction, org.bouncycastle.crypto.Mac mac, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = basicAgreement;
        this.getInputFormats = derivationFunction;
        this.getOutputFormats = mac;
        this.getOutputMinFrameDuration = new byte[mac.getMacSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = null;
    }
}
