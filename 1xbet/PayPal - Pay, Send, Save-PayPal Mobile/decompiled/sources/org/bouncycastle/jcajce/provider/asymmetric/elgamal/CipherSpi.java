package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class CipherSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi {
    private org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.ErasableOutputStream();
    private java.security.AlgorithmParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getHighSpeedVideoFpsRangesFor;
    private java.security.spec.AlgorithmParameterSpec getHighSpeedVideoSizes;

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.engines.ElGamalEngine();
            return;
        }
        if (upperCase.equals("PKCS1PADDING")) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.ElGamalEngine());
            return;
        }
        if (upperCase.equals("ISO9796-1PADDING")) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.encodings.ISO9796d1Encoding(new org.bouncycastle.crypto.engines.ElGamalEngine());
            return;
        }
        if (upperCase.equals("OAEPPADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("MD5", "MGF1", new java.security.spec.MGF1ParameterSpec("MD5"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA-384", "MGF1", java.security.spec.MGF1ParameterSpec.SHA384, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA3-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA3-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-256"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA3-384", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-384"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
        } else {
            if (upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                getHighResolutionOutputSizeshNQ4ISI(new javax.crypto.spec.OAEPParameterSpec("SHA3-512", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-512"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" unavailable with ElGamal.");
            throw new javax.crypto.NoSuchPaddingException(sb.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (!upperCase.equals("NONE") && !upperCase.equals("ECB")) {
            throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.CipherParameters generatePrivateKeyParameter;
        org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher;
        if (key instanceof javax.crypto.interfaces.DHPublicKey) {
            generatePrivateKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.elgamal.ElGamalUtil.generatePublicKeyParameter((java.security.PublicKey) key);
        } else {
            if (!(key instanceof javax.crypto.interfaces.DHPrivateKey)) {
                throw new java.security.InvalidKeyException("unknown key type passed to ElGamal");
            }
            generatePrivateKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.elgamal.ElGamalUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
        }
        if (algorithmParameterSpec instanceof javax.crypto.spec.OAEPParameterSpec) {
            javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec = (javax.crypto.spec.OAEPParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoSizes = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1.getId())) {
                throw new java.security.InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof java.security.spec.MGF1ParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no match on digest algorithm: ");
                sb.append(oAEPParameterSpec.getDigestAlgorithm());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
            java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            org.bouncycastle.crypto.Digest digest2 = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no match on MGF digest algorithm: ");
                sb2.append(mGF1ParameterSpec.getDigestAlgorithm());
                throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
            }
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.encodings.OAEPEncoding(new org.bouncycastle.crypto.engines.ElGamalEngine(), digest, digest2, ((javax.crypto.spec.PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec != null) {
            throw new java.security.InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            generatePrivateKeyParameter = new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unknown opmode ");
                        sb3.append(i);
                        sb3.append(" passed to ElGamal");
                        throw new java.security.InvalidParameterException(sb3.toString());
                    }
                }
            }
            asymmetricBlockCipher = this.getHighSpeedVideoFpsRangesFor;
            z = false;
            asymmetricBlockCipher.init(z, generatePrivateKeyParameter);
        }
        asymmetricBlockCipher = this.getHighSpeedVideoFpsRangesFor;
        asymmetricBlockCipher.init(z, generatePrivateKeyParameter);
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
        throw new java.security.InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null && this.getHighSpeedVideoSizes != null) {
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("OAEP");
                this.getHighResolutionOutputSizeshNQ4ISI = createParametersInstance;
                createParametersInstance.init(this.getHighSpeedVideoSizes);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getOutputBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(java.security.Key key) {
        java.math.BigInteger p;
        if (key instanceof org.bouncycastle.jce.interfaces.ElGamalKey) {
            p = ((org.bouncycastle.jce.interfaces.ElGamalKey) key).getParameters().getP();
        } else {
            if (!(key instanceof javax.crypto.interfaces.DHKey)) {
                throw new java.lang.IllegalArgumentException("not an ElGamal key!");
            }
            p = ((javax.crypto.interfaces.DHKey) key).getParams().getP();
        }
        return p.bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getInputBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        if (bArr != null) {
            this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        }
        if (this.getHighSpeedVideoFpsRangesFor instanceof org.bouncycastle.crypto.engines.ElGamalEngine) {
            if (this.Camera2StreamConfigurationMap.size() > this.getHighSpeedVideoFpsRangesFor.getInputBlockSize() + 1) {
                throw new java.lang.ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.Camera2StreamConfigurationMap.size() > this.getHighSpeedVideoFpsRangesFor.getInputBlockSize()) {
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        }
        if (this.getHighSpeedVideoFpsRangesFor instanceof org.bouncycastle.crypto.engines.ElGamalEngine) {
            if (this.Camera2StreamConfigurationMap.size() > this.getHighSpeedVideoFpsRangesFor.getInputBlockSize() + 1) {
                throw new java.lang.ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.Camera2StreamConfigurationMap.size() > this.getHighSpeedVideoFpsRangesFor.getInputBlockSize()) {
            throw new java.lang.ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        for (int i4 = 0; i4 != highResolutionOutputSizeshNQ4ISI.length; i4++) {
            bArr2[i3 + i4] = highResolutionOutputSizeshNQ4ISI[i4];
        }
        return highResolutionOutputSizeshNQ4ISI.length;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec) throws javax.crypto.NoSuchPaddingException {
        java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.encodings.OAEPEncoding(new org.bouncycastle.crypto.engines.ElGamalEngine(), digest, ((javax.crypto.spec.PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.getHighSpeedVideoSizes = oAEPParameterSpec;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no match on OAEP constructor for digest algorithm: ");
            sb.append(mGF1ParameterSpec.getDigestAlgorithm());
            throw new javax.crypto.NoSuchPaddingException(sb.toString());
        }
    }

    public static class NoPadding extends org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi {
        public NoPadding() {
            super(new org.bouncycastle.crypto.engines.ElGamalEngine());
        }
    }

    public static class PKCS1v1_5Padding extends org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi {
        public PKCS1v1_5Padding() {
            super(new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.ElGamalEngine()));
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() throws javax.crypto.BadPaddingException {
        try {
            try {
                try {
                    return this.getHighSpeedVideoFpsRangesFor.processBlock(this.Camera2StreamConfigurationMap.getBuf(), 0, this.Camera2StreamConfigurationMap.size());
                } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
                    throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to decrypt block", e);
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.Camera2StreamConfigurationMap.erase();
        }
    }

    public CipherSpi(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoFpsRangesFor = asymmetricBlockCipher;
    }
}
