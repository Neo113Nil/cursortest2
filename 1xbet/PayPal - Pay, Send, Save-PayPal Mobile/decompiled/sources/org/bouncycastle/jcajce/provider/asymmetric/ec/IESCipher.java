package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class IESCipher extends javax.crypto.CipherSpi {
    private org.bouncycastle.jce.spec.IESParameterSpec Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.engines.IESEngine getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRangesFor;
    private java.io.ByteArrayOutputStream getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoSizesFor;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.security.SecureRandom getOutputFormats;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
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
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException {
        org.bouncycastle.jce.spec.IESParameterSpec iESParameterSpec;
        org.bouncycastle.crypto.params.AsymmetricKeyParameter highResolutionOutputSizeshNQ4ISI;
        java.security.PrivateKey privateKey;
        byte[] bArr = null;
        this.getHighSpeedVideoSizesFor = null;
        if (algorithmParameterSpec == null) {
            int i2 = this.getInputSizeshNQ4ISI;
            if (i2 != 0 && i == 1) {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            iESParameterSpec = org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil.guessParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getCipher(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.IESParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            iESParameterSpec = (org.bouncycastle.jce.spec.IESParameterSpec) algorithmParameterSpec;
        }
        this.Camera2StreamConfigurationMap = iESParameterSpec;
        byte[] nonce = iESParameterSpec.getNonce();
        int i3 = this.getInputSizeshNQ4ISI;
        if (i3 != 0 && (nonce == null || nonce.length != i3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NONCE in IES Parameters needs to be ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(" bytes long");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (i == 1 || i == 3) {
            if (!(key instanceof java.security.PublicKey)) {
                if (!(key instanceof org.bouncycastle.jce.interfaces.IESKey)) {
                    throw new java.security.InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
                org.bouncycastle.jce.interfaces.IESKey iESKey = (org.bouncycastle.jce.interfaces.IESKey) key;
                this.getInputFormats = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(iESKey.getPublic());
                this.getHighSpeedVideoSizesFor = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(iESKey.getPrivate());
                this.getOutputFormats = secureRandom;
                this.getOutputMinFrameDurationlomOqCM = i;
                this.getHighSpeedVideoSizes.reset();
            }
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                throw new java.security.InvalidKeyException("must be passed EC key");
            }
            if (key instanceof java.security.PrivateKey) {
                privateKey = (java.security.PrivateKey) key;
            } else {
                if (!(key instanceof org.bouncycastle.jce.interfaces.IESKey)) {
                    throw new java.security.InvalidKeyException("must be passed recipient's private EC key for decryption");
                }
                org.bouncycastle.jce.interfaces.IESKey iESKey2 = (org.bouncycastle.jce.interfaces.IESKey) key;
                this.getHighSpeedVideoSizesFor = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(iESKey2.getPublic());
                privateKey = iESKey2.getPrivate();
            }
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
        }
        this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = secureRandom;
        this.getOutputMinFrameDurationlomOqCM = i;
        this.getHighSpeedVideoSizes.reset();
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
        this.getHighSpeedVideoFpsRangesFor = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighSpeedVideoFpsRangesFor == null && this.Camera2StreamConfigurationMap != null) {
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getOutputMinFrameDuration.createAlgorithmParameters("IES");
                this.getHighSpeedVideoFpsRangesFor = createAlgorithmParameters;
                createAlgorithmParameters.init(this.Camera2StreamConfigurationMap);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        org.bouncycastle.crypto.BufferedBlockCipher cipher;
        if (this.getInputFormats == null) {
            throw new java.lang.IllegalStateException("cipher not initialised");
        }
        int macSize = this.getHighResolutionOutputSizeshNQ4ISI.getMac().getMacSize();
        int fieldSize = this.getHighSpeedVideoSizesFor == null ? ((((org.bouncycastle.crypto.params.ECKeyParameters) this.getInputFormats).getParameters().getCurve().getFieldSize() + 7) / 8) * 2 : 0;
        int size = this.getHighSpeedVideoSizes.size() + i;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getCipher() != null) {
            int i2 = this.getOutputMinFrameDurationlomOqCM;
            if (i2 == 1 || i2 == 3) {
                cipher = this.getHighResolutionOutputSizeshNQ4ISI.getCipher();
            } else {
                if (i2 != 2 && i2 != 4) {
                    throw new java.lang.IllegalStateException("cipher not initialised");
                }
                cipher = this.getHighResolutionOutputSizeshNQ4ISI.getCipher();
                size = (size - macSize) - fieldSize;
            }
            size = cipher.getOutputSize(size);
        }
        int i3 = this.getOutputMinFrameDurationlomOqCM;
        if (i3 == 1 || i3 == 3) {
            return macSize + fieldSize + size;
        }
        if (i3 == 2 || i3 == 4) {
            return size;
        }
        throw new java.lang.IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(java.security.Key key) {
        if (key instanceof org.bouncycastle.jce.interfaces.ECKey) {
            return ((org.bouncycastle.jce.interfaces.ECKey) key).getParameters().getCurve().getFieldSize();
        }
        throw new java.lang.IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        org.bouncycastle.jce.spec.IESParameterSpec iESParameterSpec = this.Camera2StreamConfigurationMap;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getCipher() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getCipher().getBlockSize();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        if (i2 != 0) {
            this.getHighSpeedVideoSizes.write(bArr, i, i2);
        }
        byte[] byteArray = this.getHighSpeedVideoSizes.toByteArray();
        this.getHighSpeedVideoSizes.reset();
        org.bouncycastle.crypto.CipherParameters iESWithCipherParameters = new org.bouncycastle.crypto.params.IESWithCipherParameters(this.Camera2StreamConfigurationMap.getDerivationV(), this.Camera2StreamConfigurationMap.getEncodingV(), this.Camera2StreamConfigurationMap.getMacKeySize(), this.Camera2StreamConfigurationMap.getCipherKeySize());
        if (this.Camera2StreamConfigurationMap.getNonce() != null) {
            iESWithCipherParameters = new org.bouncycastle.crypto.params.ParametersWithIV(iESWithCipherParameters, this.Camera2StreamConfigurationMap.getNonce());
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = ((org.bouncycastle.crypto.params.ECKeyParameters) this.getInputFormats).getParameters();
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter = this.getHighSpeedVideoSizesFor;
        if (asymmetricKeyParameter != null) {
            try {
                int i3 = this.getOutputMinFrameDurationlomOqCM;
                if (i3 == 1 || i3 == 3) {
                    this.getHighResolutionOutputSizeshNQ4ISI.init(true, asymmetricKeyParameter, this.getInputFormats, iESWithCipherParameters);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.init(false, this.getInputFormats, asymmetricKeyParameter, iESWithCipherParameters);
                }
                return this.getHighResolutionOutputSizeshNQ4ISI.processBlock(byteArray, 0, byteArray.length);
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e);
            }
        }
        int i4 = this.getOutputMinFrameDurationlomOqCM;
        if (i4 != 1 && i4 != 3) {
            if (i4 != 2 && i4 != 4) {
                throw new java.lang.IllegalStateException("cipher not initialised");
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.init(this.getInputFormats, iESWithCipherParameters, new org.bouncycastle.crypto.parsers.ECIESPublicKeyParser(parameters));
                return this.getHighResolutionOutputSizeshNQ4ISI.processBlock(byteArray, 0, byteArray.length);
            } catch (org.bouncycastle.crypto.InvalidCipherTextException e2) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e2);
            }
        }
        org.bouncycastle.crypto.generators.ECKeyPairGenerator eCKeyPairGenerator = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
        eCKeyPairGenerator.init(new org.bouncycastle.crypto.params.ECKeyGenerationParameters(parameters, this.getOutputFormats));
        final boolean pointCompression = this.Camera2StreamConfigurationMap.getPointCompression();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.init(this.getInputFormats, iESWithCipherParameters, new org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator(eCKeyPairGenerator, new org.bouncycastle.crypto.KeyEncoder() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.1
                @Override // org.bouncycastle.crypto.KeyEncoder
                public byte[] getEncoded(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2) {
                    return ((org.bouncycastle.crypto.params.ECPublicKeyParameters) asymmetricKeyParameter2).getQ().getEncoded(pointCompression);
                }
            }));
            return this.getHighResolutionOutputSizeshNQ4ISI.processBlock(byteArray, 0, byteArray.length);
        } catch (java.lang.Exception e3) {
            throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e3);
        }
    }

    public static class ECIES extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher {
        public ECIES(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2) {
            super(new org.bouncycastle.crypto.engines.IESEngine(new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(digest), new org.bouncycastle.crypto.macs.HMac(digest2)));
        }

        public ECIES() {
            this(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), org.bouncycastle.crypto.util.DigestFactory.createSHA1());
        }
    }

    public static class ECIESwithCipher extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher {
        public ECIESwithCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i, org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.Digest digest2) {
            super(new org.bouncycastle.crypto.engines.IESEngine(new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(digest), new org.bouncycastle.crypto.macs.HMac(digest2), new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher)), i);
        }

        public ECIESwithCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
            this(blockCipher, i, org.bouncycastle.crypto.util.DigestFactory.createSHA1(), org.bouncycastle.crypto.util.DigestFactory.createSHA1());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        java.lang.System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public static class ECIESwithAESCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 16);
        }
    }

    public static class ECIESwithDESedeCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 8);
        }
    }

    public static class ECIESwithSHA256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIES {
        public ECIESwithSHA256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), org.bouncycastle.crypto.util.DigestFactory.createSHA256());
        }
    }

    public static class ECIESwithSHA256andAESCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA256andAESCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 16, org.bouncycastle.crypto.util.DigestFactory.createSHA256(), org.bouncycastle.crypto.util.DigestFactory.createSHA256());
        }
    }

    public static class ECIESwithSHA256andDESedeCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA256andDESedeCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 8, org.bouncycastle.crypto.util.DigestFactory.createSHA256(), org.bouncycastle.crypto.util.DigestFactory.createSHA256());
        }
    }

    public static class ECIESwithSHA384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIES {
        public ECIESwithSHA384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), org.bouncycastle.crypto.util.DigestFactory.createSHA384());
        }
    }

    public static class ECIESwithSHA384andAESCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA384andAESCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 16, org.bouncycastle.crypto.util.DigestFactory.createSHA384(), org.bouncycastle.crypto.util.DigestFactory.createSHA384());
        }
    }

    public static class ECIESwithSHA384andDESedeCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA384andDESedeCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 8, org.bouncycastle.crypto.util.DigestFactory.createSHA384(), org.bouncycastle.crypto.util.DigestFactory.createSHA384());
        }
    }

    public static class ECIESwithSHA512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIES {
        public ECIESwithSHA512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), org.bouncycastle.crypto.util.DigestFactory.createSHA512());
        }
    }

    public static class ECIESwithSHA512andAESCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA512andAESCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine()), 16, org.bouncycastle.crypto.util.DigestFactory.createSHA512(), org.bouncycastle.crypto.util.DigestFactory.createSHA512());
        }
    }

    public static class ECIESwithSHA512andDESedeCBC extends org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.ECIESwithCipher {
        public ECIESwithSHA512andDESedeCBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 8, org.bouncycastle.crypto.util.DigestFactory.createSHA512(), org.bouncycastle.crypto.util.DigestFactory.createSHA512());
        }
    }

    public IESCipher(org.bouncycastle.crypto.engines.IESEngine iESEngine, int i) {
        this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = iESEngine;
        this.getInputSizeshNQ4ISI = i;
    }

    public IESCipher(org.bouncycastle.crypto.engines.IESEngine iESEngine) {
        this.getOutputMinFrameDuration = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = iESEngine;
        this.getInputSizeshNQ4ISI = 0;
    }
}
