package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class BaseStreamCipher extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private java.lang.Class[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.ParametersWithIV getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.StreamCipher getHighSpeedVideoSizes;
    private javax.crypto.spec.PBEParameterSpec getHighSpeedVideoSizesFor;
    private int getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighSpeedVideoSizes.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        try {
            this.getHighSpeedVideoSizes.processBytes(bArr, i, i2, bArr2, i3);
            return i2;
        } catch (org.bouncycastle.crypto.DataLengthException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        if (str.equalsIgnoreCase("NoPadding")) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding ");
        sb.append(str);
        sb.append(" unknown.");
        throw new javax.crypto.NoSuchPaddingException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB") && !str.equals("NONE")) {
            throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.CipherParameters cipherParameters;
        org.bouncycastle.crypto.CipherParameters keyParameter;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputMinFrameDuration = null;
        this.engineParams = null;
        if (!(key instanceof javax.crypto.SecretKey)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key for algorithm ");
            sb.append(key.getAlgorithm());
            sb.append(" not suitable for symmetric enryption.");
            throw new java.security.InvalidKeyException(sb.toString());
        }
        if (key instanceof org.bouncycastle.jcajce.PKCS12Key) {
            org.bouncycastle.jcajce.PKCS12Key pKCS12Key = (org.bouncycastle.jcajce.PKCS12Key) key;
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoSizesFor = pBEParameterSpec;
            if ((pKCS12Key instanceof org.bouncycastle.jcajce.PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                org.bouncycastle.jcajce.PKCS12KeyWithParameters pKCS12KeyWithParameters = (org.bouncycastle.jcajce.PKCS12KeyWithParameters) pKCS12Key;
                this.getHighSpeedVideoSizesFor = new javax.crypto.spec.PBEParameterSpec(pKCS12KeyWithParameters.getSalt(), pKCS12KeyWithParameters.getIterationCount());
            }
            cipherParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(pKCS12Key.getEncoded(), 2, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor * 8, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes.getAlgorithmName());
        } else {
            if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
                org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key;
                this.getOutputMinFrameDuration = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
                if (bCPBEKey.getParam() != null) {
                    keyParameter = bCPBEKey.getParam();
                    this.getHighSpeedVideoSizesFor = new javax.crypto.spec.PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                } else {
                    if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                        throw new java.security.InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    org.bouncycastle.crypto.CipherParameters makePBEParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.getHighSpeedVideoSizes.getAlgorithmName());
                    this.getHighSpeedVideoSizesFor = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
                    keyParameter = makePBEParameters;
                }
                if (bCPBEKey.getIvSize() != 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.ParametersWithIV) keyParameter;
                }
            } else if (algorithmParameterSpec == null) {
                if (this.getHighSpeedVideoFpsRanges > 0) {
                    throw new java.security.InvalidKeyException("Algorithm requires a PBE key");
                }
                keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
            } else {
                if (!(algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec)) {
                    throw new java.security.InvalidAlgorithmParameterException("unknown parameter type.");
                }
                org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded()), ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV());
                this.getHighResolutionOutputSizeshNQ4ISI = parametersWithIV;
                cipherParameters = parametersWithIV;
            }
            cipherParameters = keyParameter;
        }
        if (this.getHighSpeedVideoFpsRangesFor != 0 && !(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            if (secureRandom == null) {
                secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            if (i != 1 && i != 3) {
                throw new java.security.InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[this.getHighSpeedVideoFpsRangesFor];
            secureRandom.nextBytes(bArr);
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV2 = new org.bouncycastle.crypto.params.ParametersWithIV(cipherParameters, bArr);
            this.getHighResolutionOutputSizeshNQ4ISI = parametersWithIV2;
            cipherParameters = parametersWithIV2;
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown opmode ");
                            sb2.append(i);
                            sb2.append(" passed");
                            throw new java.security.InvalidParameterException(sb2.toString());
                        }
                    }
                }
                this.getHighSpeedVideoSizes.init(false, cipherParameters);
                return;
            }
            this.getHighSpeedVideoSizes.init(true, cipherParameters);
        } catch (java.lang.Exception e) {
            throw new java.security.InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new java.security.InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = org.bouncycastle.jcajce.provider.symmetric.util.SpecUtil.getHighSpeedVideoFpsRanges(algorithmParameters, this.Camera2StreamConfigurationMap);
            if (algorithmParameterSpec == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't handle parameter ");
                sb.append(algorithmParameters.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.getHighSpeedVideoSizesFor != null) {
                try {
                    java.security.AlgorithmParameters createParametersInstance = createParametersInstance(this.getOutputMinFrameDuration);
                    createParametersInstance.init(this.getHighSpeedVideoSizesFor);
                    return createParametersInstance;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                java.lang.String algorithmName = this.getHighSpeedVideoSizes.getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                if (algorithmName.startsWith("ChaCha7539")) {
                    algorithmName = "ChaCha7539";
                } else if (algorithmName.startsWith("Grain")) {
                    algorithmName = "Grainv1";
                } else if (algorithmName.startsWith("HC")) {
                    int indexOf = algorithmName.indexOf(45);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(algorithmName.substring(0, indexOf));
                    sb.append(algorithmName.substring(indexOf + 1));
                    algorithmName = sb.toString();
                }
                try {
                    this.engineParams = createParametersInstance(algorithmName);
                    this.engineParams.init(new javax.crypto.spec.IvParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getIV()));
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException(e.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(java.security.Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = this.getHighResolutionOutputSizeshNQ4ISI;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            this.getHighSpeedVideoSizes.reset();
            return new byte[0];
        }
        byte[] engineUpdate = engineUpdate(bArr, i, i2);
        this.getHighSpeedVideoSizes.reset();
        return engineUpdate;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        if (i3 + i2 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            this.getHighSpeedVideoSizes.processBytes(bArr, i, i2, bArr2, i3);
        }
        this.getHighSpeedVideoSizes.reset();
        return i2;
    }

    public BaseStreamCipher(org.bouncycastle.crypto.StreamCipher streamCipher, int i, int i2, int i3) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizes = streamCipher;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getOutputFormats = i2;
        this.getHighSpeedVideoFpsRanges = i3;
    }

    public BaseStreamCipher(org.bouncycastle.crypto.StreamCipher streamCipher, int i, int i2) {
        this(streamCipher, i, i2, -1);
    }

    public BaseStreamCipher(org.bouncycastle.crypto.StreamCipher streamCipher, int i) {
        this(streamCipher, i, -1, -1);
    }
}
