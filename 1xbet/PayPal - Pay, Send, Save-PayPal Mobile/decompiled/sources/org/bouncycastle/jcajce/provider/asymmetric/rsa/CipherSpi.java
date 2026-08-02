package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class CipherSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi {
    private java.security.spec.AlgorithmParameterSpec Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream getHighSpeedVideoFpsRanges;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;
    private boolean getInputSizeshNQ4ISI;
    private boolean getOutputFormats;

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.engines.RSABlindedEngine) {
            if (this.getHighSpeedVideoFpsRanges.size() <= this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize() + 1) {
                return null;
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        if (this.getHighSpeedVideoFpsRanges.size() <= this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize()) {
            return null;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.engines.RSABlindedEngine) {
            if (this.getHighSpeedVideoFpsRanges.size() <= this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize() + 1) {
                return 0;
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        if (this.getHighSpeedVideoFpsRanges.size() <= this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize()) {
            return 0;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.engines.RSABlindedEngine();
            return;
        }
        if (upperCase.equals("PKCS1PADDING")) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine());
            return;
        }
        if (upperCase.equals("ISO9796-1PADDING")) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.encodings.ISO9796d1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine());
            return;
        }
        if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("MD5", "MGF1", new java.security.spec.MGF1ParameterSpec("MD5"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPPADDING")) {
            getHighSpeedVideoSizes(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA-384", "MGF1", java.security.spec.MGF1ParameterSpec.SHA384, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA3-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA3-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-256"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA3-384", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-384"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
        } else {
            if (upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                getHighSpeedVideoSizes(new javax.crypto.spec.OAEPParameterSpec("SHA3-512", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-512"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" unavailable with RSA.");
            throw new javax.crypto.NoSuchPaddingException(sb.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NONE") || upperCase.equals("ECB")) {
            return;
        }
        if (upperCase.equals("1")) {
            this.getInputSizeshNQ4ISI = true;
            this.getOutputFormats = false;
        } else {
            if (!upperCase.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D)) {
                throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
            }
            this.getInputSizeshNQ4ISI = false;
            this.getOutputFormats = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v26, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    /* JADX WARN: Type inference failed for: r8v27, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.RSAKeyParameters highSpeedVideoSizes;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof javax.crypto.spec.OAEPParameterSpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown parameter type: ");
            sb.append(algorithmParameterSpec.getClass().getName());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (key instanceof java.security.interfaces.RSAPublicKey) {
            if (this.getInputSizeshNQ4ISI && i == 1) {
                throw new java.security.InvalidKeyException("mode 1 requires RSAPrivateKey");
            }
            highSpeedVideoSizes = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor((java.security.interfaces.RSAPublicKey) key);
        } else {
            if (!(key instanceof java.security.interfaces.RSAPrivateKey)) {
                throw new java.security.InvalidKeyException("unknown key type passed to RSA");
            }
            if (this.getOutputFormats && i == 1) {
                throw new java.security.InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            highSpeedVideoSizes = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoSizes((java.security.interfaces.RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec = (javax.crypto.spec.OAEPParameterSpec) algorithmParameterSpec;
            this.Camera2StreamConfigurationMap = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1.getId())) {
                throw new java.security.InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof java.security.spec.MGF1ParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no match on digest algorithm: ");
                sb2.append(oAEPParameterSpec.getDigestAlgorithm());
                throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
            }
            java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            org.bouncycastle.crypto.Digest digest2 = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("no match on MGF digest algorithm: ");
                sb3.append(mGF1ParameterSpec.getDigestAlgorithm());
                throw new java.security.InvalidAlgorithmParameterException(sb3.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.encodings.OAEPEncoding(new org.bouncycastle.crypto.engines.RSABlindedEngine(), digest, digest2, ((javax.crypto.spec.PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        if (!(this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.engines.RSABlindedEngine)) {
            highSpeedVideoSizes = secureRandom != null ? new org.bouncycastle.crypto.params.ParametersWithRandom(highSpeedVideoSizes, secureRandom) : new org.bouncycastle.crypto.params.ParametersWithRandom(highSpeedVideoSizes, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
        }
        this.getHighSpeedVideoFpsRanges.reset();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("unknown opmode ");
                        sb4.append(i);
                        sb4.append(" passed to RSA");
                        throw new java.security.InvalidParameterException(sb4.toString());
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.init(false, highSpeedVideoSizes);
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, highSpeedVideoSizes);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Eeeek! ");
            sb.append(e.toString());
            throw new java.security.InvalidKeyException(sb.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(javax.crypto.spec.OAEPParameterSpec.class);
            } catch (java.security.spec.InvalidParameterSpecException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot recognise parameters: ");
                sb.append(e.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString(), e);
            }
        } else {
            parameterSpec = null;
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighSpeedVideoFpsRangesFor == null && this.Camera2StreamConfigurationMap != null) {
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getHighSpeedVideoSizes.createAlgorithmParameters("OAEP");
                this.getHighSpeedVideoFpsRangesFor = createAlgorithmParameters;
                createAlgorithmParameters.init(this.Camera2StreamConfigurationMap);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getOutputBlockSize();
        } catch (java.lang.NullPointerException unused) {
            throw new java.lang.IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(java.security.Key key) {
        java.math.BigInteger modulus;
        if (key instanceof java.security.interfaces.RSAPrivateKey) {
            modulus = ((java.security.interfaces.RSAPrivateKey) key).getModulus();
        } else {
            if (!(key instanceof java.security.interfaces.RSAPublicKey)) {
                throw new java.lang.IllegalArgumentException("not an RSA key!");
            }
            modulus = ((java.security.interfaces.RSAPublicKey) key).getModulus();
        }
        return modulus.bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize();
        } catch (java.lang.NullPointerException unused) {
            throw new java.lang.IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        if (bArr != null) {
            this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.engines.RSABlindedEngine) {
            if (this.getHighSpeedVideoFpsRanges.size() > this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize() + 1) {
                throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.getHighSpeedVideoFpsRanges.size() > this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize()) {
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return Camera2StreamConfigurationMap();
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.bouncycastle.crypto.engines.RSABlindedEngine) {
            if (this.getHighSpeedVideoFpsRanges.size() > this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize() + 1) {
                throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.getHighSpeedVideoFpsRanges.size() > this.getHighResolutionOutputSizeshNQ4ISI.getInputBlockSize()) {
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        for (int i4 = 0; i4 != Camera2StreamConfigurationMap.length; i4++) {
            bArr2[i3 + i4] = Camera2StreamConfigurationMap[i4];
        }
        return Camera2StreamConfigurationMap.length;
    }

    private void getHighSpeedVideoSizes(javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec) throws javax.crypto.NoSuchPaddingException {
        java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.encodings.OAEPEncoding(new org.bouncycastle.crypto.engines.RSABlindedEngine(), digest, ((javax.crypto.spec.PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.Camera2StreamConfigurationMap = oAEPParameterSpec;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no match on OAEP constructor for digest algorithm: ");
            sb.append(mGF1ParameterSpec.getDigestAlgorithm());
            throw new javax.crypto.NoSuchPaddingException(sb.toString());
        }
    }

    private byte[] Camera2StreamConfigurationMap() throws javax.crypto.BadPaddingException {
        try {
            try {
                try {
                    return this.getHighResolutionOutputSizeshNQ4ISI.processBlock(this.getHighSpeedVideoFpsRanges.getBuf(), 0, this.getHighSpeedVideoFpsRanges.size());
                } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
                    throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to decrypt block", e);
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.getHighSpeedVideoFpsRanges.erase();
        }
    }

    public CipherSpi(boolean z, boolean z2, org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputFormats = false;
        this.getInputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream();
        this.getOutputFormats = z;
        this.getInputSizeshNQ4ISI = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
    }

    public static class ISO9796d1Padding extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public ISO9796d1Padding() {
            super(new org.bouncycastle.crypto.encodings.ISO9796d1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class NoPadding extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public NoPadding() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public OAEPPadding() {
            super(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public PKCS1v1_5Padding() {
            super(new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine()));
        }
    }

    public CipherSpi(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputFormats = false;
        this.getInputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream();
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricBlockCipher;
    }

    public CipherSpi(javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getOutputFormats = false;
        this.getInputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream();
        try {
            getHighSpeedVideoSizes(oAEPParameterSpec);
        } catch (javax.crypto.NoSuchPaddingException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage());
        }
    }
}
