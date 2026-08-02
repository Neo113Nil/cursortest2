package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class IESCipher extends javax.crypto.CipherSpi {
    private org.bouncycastle.crypto.engines.IESEngine Camera2StreamConfigurationMap;
    private java.io.ByteArrayOutputStream getHighResolutionOutputSizeshNQ4ISI;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jce.spec.IESParameterSpec getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getInputSizeshNQ4ISI;
    private java.security.SecureRandom getOutputFormats;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getOutputMinFrameDuration;
    private int getOutputStallDuration;

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (!upperCase.equals("NOPADDING") && !upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING")) {
            throw new javax.crypto.NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        boolean z;
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NONE")) {
            z = false;
        } else {
            if (!upperCase.equals("DHAES")) {
                throw new java.lang.IllegalArgumentException("can't support mode ".concat(java.lang.String.valueOf(str)));
            }
            z = true;
        }
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException {
        org.bouncycastle.jce.spec.IESParameterSpec iESParameterSpec;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter;
        java.security.PrivateKey privateKey;
        byte[] bArr;
        if (algorithmParameterSpec == null) {
            int i2 = this.getInputFormats;
            if (i2 == 0 || i != 1) {
                bArr = null;
            } else {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            iESParameterSpec = org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil.guessParameterSpec(this.Camera2StreamConfigurationMap.getCipher(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.IESParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            iESParameterSpec = (org.bouncycastle.jce.spec.IESParameterSpec) algorithmParameterSpec;
        }
        this.getHighSpeedVideoSizes = iESParameterSpec;
        byte[] nonce = iESParameterSpec.getNonce();
        int i3 = this.getInputFormats;
        if (i3 != 0 && (nonce == null || nonce.length != i3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NONCE in IES Parameters needs to be ");
            sb.append(this.getInputFormats);
            sb.append(" bytes long");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof javax.crypto.interfaces.DHPublicKey)) {
                if (!(key instanceof org.bouncycastle.jce.interfaces.IESKey)) {
                    throw new java.security.InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                org.bouncycastle.jce.interfaces.IESKey iESKey = (org.bouncycastle.jce.interfaces.IESKey) key;
                this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(iESKey.getPublic());
                this.getHighSpeedVideoSizesFor = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
                this.getOutputFormats = secureRandom;
                this.getOutputStallDuration = i;
                this.getHighResolutionOutputSizeshNQ4ISI.reset();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((java.security.PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                throw new java.security.InvalidKeyException("must be passed EC key");
            }
            if (key instanceof javax.crypto.interfaces.DHPrivateKey) {
                privateKey = (java.security.PrivateKey) key;
            } else {
                if (!(key instanceof org.bouncycastle.jce.interfaces.IESKey)) {
                    throw new java.security.InvalidKeyException("must be passed recipient's private DH key for decryption");
                }
                org.bouncycastle.jce.interfaces.IESKey iESKey2 = (org.bouncycastle.jce.interfaces.IESKey) key;
                this.getHighSpeedVideoSizesFor = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(iESKey2.getPublic());
                privateKey = iESKey2.getPrivate();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(privateKey);
        }
        this.getInputSizeshNQ4ISI = generatePublicKeyParameter;
        this.getOutputFormats = secureRandom;
        this.getOutputStallDuration = i;
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot handle supplied parameter spec: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(org.bouncycastle.jce.spec.IESParameterSpec.class);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot recognise parameters: ");
                sb.append(e.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            parameterSpec = null;
        }
        this.getHighSpeedVideoFpsRanges = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoSizes != null) {
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getOutputMinFrameDuration.createAlgorithmParameters("IES");
                this.getHighSpeedVideoFpsRanges = createAlgorithmParameters;
                createAlgorithmParameters.init(this.getHighSpeedVideoSizes);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int size;
        org.bouncycastle.crypto.BufferedBlockCipher cipher;
        if (this.getInputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("cipher not initialised");
        }
        int macSize = this.Camera2StreamConfigurationMap.getMac().getMacSize();
        int bitLength = this.getHighSpeedVideoSizesFor == null ? (((((org.bouncycastle.crypto.params.DHKeyParameters) this.getInputSizeshNQ4ISI).getParameters().getP().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (this.Camera2StreamConfigurationMap.getCipher() != null) {
            int i2 = this.getOutputStallDuration;
            if (i2 == 1 || i2 == 3) {
                cipher = this.Camera2StreamConfigurationMap.getCipher();
            } else {
                if (i2 != 2 && i2 != 4) {
                    throw new java.lang.IllegalStateException("cipher not initialised");
                }
                cipher = this.Camera2StreamConfigurationMap.getCipher();
                i = (i - macSize) - bitLength;
            }
            i = cipher.getOutputSize(i);
        }
        int i3 = this.getOutputStallDuration;
        if (i3 == 1 || i3 == 3) {
            size = this.getHighResolutionOutputSizeshNQ4ISI.size() + macSize + bitLength;
        } else {
            if (i3 != 2 && i3 != 4) {
                throw new java.lang.IllegalStateException("IESCipher not initialised");
            }
            size = (this.getHighResolutionOutputSizeshNQ4ISI.size() - macSize) - bitLength;
        }
        return size + i;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(java.security.Key key) {
        if (key instanceof javax.crypto.interfaces.DHKey) {
            return ((javax.crypto.interfaces.DHKey) key).getParams().getP().bitLength();
        }
        throw new java.lang.IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        org.bouncycastle.jce.spec.IESParameterSpec iESParameterSpec = this.getHighSpeedVideoSizes;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.Camera2StreamConfigurationMap.getCipher() != null) {
            return this.Camera2StreamConfigurationMap.getCipher().getBlockSize();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        if (i2 != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        }
        byte[] byteArray = this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        org.bouncycastle.crypto.CipherParameters iESWithCipherParameters = new org.bouncycastle.crypto.params.IESWithCipherParameters(this.getHighSpeedVideoSizes.getDerivationV(), this.getHighSpeedVideoSizes.getEncodingV(), this.getHighSpeedVideoSizes.getMacKeySize(), this.getHighSpeedVideoSizes.getCipherKeySize());
        if (this.getHighSpeedVideoSizes.getNonce() != null) {
            iESWithCipherParameters = new org.bouncycastle.crypto.params.ParametersWithIV(iESWithCipherParameters, this.getHighSpeedVideoSizes.getNonce());
        }
        org.bouncycastle.crypto.params.DHParameters parameters = ((org.bouncycastle.crypto.params.DHKeyParameters) this.getInputSizeshNQ4ISI).getParameters();
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizesFor;
        if (asymmetricKeyParameter != null) {
            try {
                int i3 = this.getOutputStallDuration;
                if (i3 == 1 || i3 == 3) {
                    this.Camera2StreamConfigurationMap.init(true, asymmetricKeyParameter, this.getInputSizeshNQ4ISI, iESWithCipherParameters);
                } else {
                    this.Camera2StreamConfigurationMap.init(false, this.getInputSizeshNQ4ISI, asymmetricKeyParameter, iESWithCipherParameters);
                }
                return this.Camera2StreamConfigurationMap.processBlock(byteArray, 0, byteArray.length);
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e);
            }
        }
        int i4 = this.getOutputStallDuration;
        if (i4 == 1 || i4 == 3) {
            org.bouncycastle.crypto.generators.DHKeyPairGenerator dHKeyPairGenerator = new org.bouncycastle.crypto.generators.DHKeyPairGenerator();
            dHKeyPairGenerator.init(new org.bouncycastle.crypto.params.DHKeyGenerationParameters(this.getOutputFormats, parameters));
            try {
                this.Camera2StreamConfigurationMap.init(this.getInputSizeshNQ4ISI, iESWithCipherParameters, new org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator(dHKeyPairGenerator, new org.bouncycastle.crypto.KeyEncoder() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // org.bouncycastle.crypto.KeyEncoder
                    public byte[] getEncoded(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2) {
                        int bitLength = (((org.bouncycastle.crypto.params.DHKeyParameters) asymmetricKeyParameter2).getParameters().getP().bitLength() + 7) / 8;
                        byte[] bArr2 = new byte[bitLength];
                        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(((org.bouncycastle.crypto.params.DHPublicKeyParameters) asymmetricKeyParameter2).getY());
                        if (asUnsignedByteArray.length > bitLength) {
                            throw new java.lang.IllegalArgumentException("Senders's public key longer than expected.");
                        }
                        java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr2, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
                        return bArr2;
                    }
                }));
                return this.Camera2StreamConfigurationMap.processBlock(byteArray, 0, byteArray.length);
            } catch (java.lang.Exception e2) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e2);
            }
        }
        if (i4 != 2 && i4 != 4) {
            throw new java.lang.IllegalStateException("IESCipher not initialised");
        }
        try {
            org.bouncycastle.crypto.engines.IESEngine iESEngine = this.Camera2StreamConfigurationMap;
            org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2 = this.getInputSizeshNQ4ISI;
            iESEngine.init(asymmetricKeyParameter2, iESWithCipherParameters, new org.bouncycastle.crypto.parsers.DHIESPublicKeyParser(((org.bouncycastle.crypto.params.DHKeyParameters) asymmetricKeyParameter2).getParameters()));
            return this.Camera2StreamConfigurationMap.processBlock(byteArray, 0, byteArray.length);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e3) {
            throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        java.lang.System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public static class IES extends org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher {
        public IES() {
            super(new org.bouncycastle.crypto.engines.IESEngine(new org.bouncycastle.crypto.agreement.DHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()), new org.bouncycastle.crypto.macs.HMac(org.bouncycastle.crypto.util.DigestFactory.createSHA1())));
        }
    }

    public static class IESwithAESCBC extends org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher {
        public IESwithAESCBC() {
            super(new org.bouncycastle.crypto.engines.IESEngine(new org.bouncycastle.crypto.agreement.DHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()), new org.bouncycastle.crypto.macs.HMac(org.bouncycastle.crypto.util.DigestFactory.createSHA1()), new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher {
        public IESwithDESedeCBC() {
            super(new org.bouncycastle.crypto.engines.IESEngine(new org.bouncycastle.crypto.agreement.DHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()), new org.bouncycastle.crypto.macs.HMac(org.bouncycastle.crypto.util.DigestFactory.createSHA1()), new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()))), 8);
        }
    }

    public IESCipher(org.bouncycastle.crypto.engines.IESEngine iESEngine, int i) {
        this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputStallDuration = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizesFor = null;
        this.Camera2StreamConfigurationMap = iESEngine;
        this.getInputFormats = i;
    }

    public IESCipher(org.bouncycastle.crypto.engines.IESEngine iESEngine) {
        this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputStallDuration = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizesFor = null;
        this.Camera2StreamConfigurationMap = iESEngine;
        this.getInputFormats = 0;
    }
}
