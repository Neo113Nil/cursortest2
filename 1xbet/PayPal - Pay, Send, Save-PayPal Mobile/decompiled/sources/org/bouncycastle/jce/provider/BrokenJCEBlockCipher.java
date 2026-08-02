package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class BrokenJCEBlockCipher implements org.bouncycastle.jce.provider.BrokenPBE {
    private org.bouncycastle.crypto.params.ParametersWithIV Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.BufferedBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Class[] getHighSpeedVideoFpsRanges;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputMinFrameDuration;

    protected byte[] engineWrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new java.security.InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (javax.crypto.BadPaddingException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.getHighResolutionOutputSizeshNQ4ISI.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, bArr2, i3);
    }

    protected java.security.Key engineUnwrap(byte[] bArr, java.lang.String str, int i) throws java.security.InvalidKeyException {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 3) {
                return new javax.crypto.spec.SecretKeySpec(engineDoFinal, str);
            }
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(str, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
                if (i == 1) {
                    return keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return keyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new java.security.InvalidKeyException("Unknown key type ".concat(java.lang.String.valueOf(i)));
            } catch (java.security.NoSuchAlgorithmException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown key type ");
                sb.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb.toString());
            } catch (java.security.NoSuchProviderException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown key type ");
                sb2.append(e2.getMessage());
                throw new java.security.InvalidKeyException(sb2.toString());
            } catch (java.security.spec.InvalidKeySpecException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown key type ");
                sb3.append(e3.getMessage());
                throw new java.security.InvalidKeyException(sb3.toString());
            }
        } catch (javax.crypto.BadPaddingException e4) {
            throw new java.security.InvalidKeyException(e4.getMessage());
        } catch (javax.crypto.IllegalBlockSizeException e5) {
            throw new java.security.InvalidKeyException(e5.getMessage());
        }
    }

    protected void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        org.bouncycastle.crypto.BufferedBlockCipher paddedBufferedBlockCipher;
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            paddedBufferedBlockCipher = new org.bouncycastle.crypto.BufferedBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher());
        } else if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING") || upperCase.equals("ISO10126PADDING")) {
            paddedBufferedBlockCipher = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher());
        } else {
            if (!upperCase.equals("WITHCTS")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding ");
                sb.append(str);
                sb.append(" unknown.");
                throw new javax.crypto.NoSuchPaddingException(sb.toString());
            }
            paddedBufferedBlockCipher = new org.bouncycastle.crypto.modes.CTSBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = paddedBufferedBlockCipher;
    }

    protected void engineSetMode(java.lang.String str) {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("ECB")) {
            this.getHighSpeedVideoSizes = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher());
            return;
        }
        if (upperCase.equals("CBC")) {
            this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher().getBlockSize();
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher()));
            return;
        }
        if (upperCase.startsWith("OFB")) {
            this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() == 3) {
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher(), this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize() * 8));
                return;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher(), java.lang.Integer.parseInt(upperCase.substring(3))));
                return;
            }
        }
        if (!upperCase.startsWith("CFB")) {
            throw new java.lang.IllegalArgumentException("can't support mode ".concat(java.lang.String.valueOf(str)));
        }
        this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher().getBlockSize();
        if (upperCase.length() == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher(), this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize() * 8));
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher(), java.lang.Integer.parseInt(upperCase.substring(3))));
        }
    }

    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV;
        org.bouncycastle.crypto.CipherParameters cipherParameters;
        org.bouncycastle.crypto.CipherParameters cipherParameters2;
        org.bouncycastle.crypto.CipherParameters keyParameter;
        if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
            org.bouncycastle.crypto.CipherParameters highSpeedVideoSizes = org.bouncycastle.jce.provider.BrokenPBE.Util.getHighSpeedVideoSizes((org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key, algorithmParameterSpec, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher().getAlgorithmName(), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
            cipherParameters2 = highSpeedVideoSizes;
            if (this.getOutputMinFrameDuration != 0) {
                this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ParametersWithIV) highSpeedVideoSizes;
                cipherParameters2 = highSpeedVideoSizes;
            }
        } else {
            if (algorithmParameterSpec == null) {
                keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
            } else {
                if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                    if (this.getHighSpeedVideoSizes != 0) {
                        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV2 = new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded()), ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV());
                        this.Camera2StreamConfigurationMap = parametersWithIV2;
                        cipherParameters = parametersWithIV2;
                    } else {
                        keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
                    }
                } else if (algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec) {
                    javax.crypto.spec.RC2ParameterSpec rC2ParameterSpec = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
                    org.bouncycastle.crypto.CipherParameters rC2Parameters = new org.bouncycastle.crypto.params.RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                    cipherParameters = rC2Parameters;
                    if (rC2ParameterSpec.getIV() != null) {
                        cipherParameters = rC2Parameters;
                        if (this.getHighSpeedVideoSizes != 0) {
                            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(rC2Parameters, rC2ParameterSpec.getIV());
                            this.Camera2StreamConfigurationMap = parametersWithIV;
                            cipherParameters2 = parametersWithIV;
                        }
                    }
                } else {
                    if (!(algorithmParameterSpec instanceof javax.crypto.spec.RC5ParameterSpec)) {
                        throw new java.security.InvalidAlgorithmParameterException("unknown parameter type.");
                    }
                    javax.crypto.spec.RC5ParameterSpec rC5ParameterSpec = (javax.crypto.spec.RC5ParameterSpec) algorithmParameterSpec;
                    org.bouncycastle.crypto.CipherParameters rC5Parameters = new org.bouncycastle.crypto.params.RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                    if (rC5ParameterSpec.getWordSize() != 32) {
                        throw new java.lang.IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                    }
                    cipherParameters = rC5Parameters;
                    if (rC5ParameterSpec.getIV() != null) {
                        cipherParameters = rC5Parameters;
                        if (this.getHighSpeedVideoSizes != 0) {
                            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                            this.Camera2StreamConfigurationMap = parametersWithIV;
                            cipherParameters2 = parametersWithIV;
                        }
                    }
                }
                cipherParameters2 = cipherParameters;
            }
            cipherParameters2 = keyParameter;
        }
        org.bouncycastle.crypto.CipherParameters cipherParameters3 = cipherParameters2;
        if (this.getHighSpeedVideoSizes != 0) {
            boolean z = cipherParameters2 instanceof org.bouncycastle.crypto.params.ParametersWithIV;
            cipherParameters3 = cipherParameters2;
            if (!z) {
                if (secureRandom == null) {
                    secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
                }
                if (i != 1 && i != 3) {
                    throw new java.security.InvalidAlgorithmParameterException("no IV set when one expected");
                }
                byte[] bArr = new byte[this.getHighSpeedVideoSizes];
                secureRandom.nextBytes(bArr);
                org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV3 = new org.bouncycastle.crypto.params.ParametersWithIV(cipherParameters2, bArr);
                this.Camera2StreamConfigurationMap = parametersWithIV3;
                cipherParameters3 = parametersWithIV3;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        java.lang.System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.init(false, cipherParameters3);
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, cipherParameters3);
    }

    protected void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage());
        }
    }

    protected void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                java.lang.Class[] clsArr = this.getHighSpeedVideoFpsRanges;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (java.lang.Exception unused) {
                    i2++;
                }
            }
            if (algorithmParameterSpec == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't handle parameter ");
                sb.append(algorithmParameters.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    protected java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighSpeedVideoFpsRangesFor == null && this.Camera2StreamConfigurationMap != null) {
            java.lang.String algorithmName = this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                java.security.AlgorithmParameters algorithmParameters = java.security.AlgorithmParameters.getInstance(algorithmName, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
                this.getHighSpeedVideoFpsRangesFor = algorithmParameters;
                algorithmParameters.init(this.Camera2StreamConfigurationMap.getIV());
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected int engineGetOutputSize(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOutputSize(i);
    }

    protected int engineGetKeySize(java.security.Key key) {
        return key.getEncoded().length;
    }

    protected byte[] engineGetIV() {
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = this.Camera2StreamConfigurationMap;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    protected int engineGetBlockSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
    }

    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int processBytes = i2 != 0 ? this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, processBytes);
            byte[] bArr3 = new byte[doFinal];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (org.bouncycastle.crypto.DataLengthException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e2) {
            throw new javax.crypto.BadPaddingException(e2.getMessage());
        }
    }

    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        int processBytes = i2 != 0 ? this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, bArr2, i3) : 0;
        try {
            return processBytes + this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, i3 + processBytes);
        } catch (org.bouncycastle.crypto.DataLengthException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e2) {
            throw new javax.crypto.BadPaddingException(e2.getMessage());
        }
    }

    public static class BrokePBEWithMD5AndDES extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends org.bouncycastle.jce.provider.BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.TwofishEngine()), 3, 1, 256, 128);
        }
    }

    protected BrokenJCEBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRanges = new java.lang.Class[]{javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class, javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class};
        this.getInputFormats = 2;
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher);
        this.getInputFormats = i;
        this.getHighSpeedVideoSizesFor = i2;
        this.getInputSizeshNQ4ISI = i3;
        this.getOutputMinFrameDuration = i4;
    }

    protected BrokenJCEBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRanges = new java.lang.Class[]{javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class, javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class};
        this.getInputFormats = 2;
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher);
    }
}
