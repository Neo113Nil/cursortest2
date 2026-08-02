package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class PSSSignatureSpi extends java.security.SignatureSpi {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizesFor;
    private java.security.spec.PSSParameterSpec getInputFormats;
    private org.bouncycastle.crypto.params.RSAKeyParameters getInputSizeshNQ4ISI;
    private java.security.spec.PSSParameterSpec getOutputFormats;
    private org.bouncycastle.crypto.signers.PSSSigner getOutputMinFrameDuration;
    private org.bouncycastle.crypto.AsymmetricBlockCipher getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private byte getOutputStallDuration;
    private java.security.SecureRandom getOutputStallDurationlomOqCM;

    protected PSSSignatureSpi(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, java.security.spec.PSSParameterSpec pSSParameterSpec, boolean z) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputSizes = asymmetricBlockCipher;
        this.getOutputFormats = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.getInputFormats = java.security.spec.PSSParameterSpec.DEFAULT;
        } else {
            this.getInputFormats = pSSParameterSpec;
        }
        this.getHighSpeedVideoSizesFor = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest("MGF1".equals(this.getInputFormats.getMGFAlgorithm()) ? this.getInputFormats.getDigestAlgorithm() : this.getInputFormats.getMGFAlgorithm());
        this.getOutputSizeshNQ4ISI = this.getInputFormats.getSaltLength();
        if (this.getInputFormats.getTrailerField() != 1) {
            throw new java.lang.IllegalArgumentException("unknown trailer field");
        }
        this.getOutputStallDuration = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
        this.Camera2StreamConfigurationMap = z;
        getHighSpeedVideoFpsRanges();
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidAlgorithmParameterException {
        java.lang.String digestAlgorithm;
        org.bouncycastle.crypto.signers.PSSSigner pSSSigner;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.getOutputFormats) == null) {
            return;
        }
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.security.ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof java.security.spec.PSSParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        java.security.spec.PSSParameterSpec pSSParameterSpec = (java.security.spec.PSSParameterSpec) algorithmParameterSpec;
        java.security.spec.PSSParameterSpec pSSParameterSpec2 = this.getOutputFormats;
        if (pSSParameterSpec2 != null && !org.bouncycastle.jcajce.provider.util.DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("parameter must be using ");
            sb.append(this.getOutputFormats.getDigestAlgorithm());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") || pSSParameterSpec.getMGFAlgorithm().equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1.getId())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof java.security.spec.MGF1ParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("unknown MGF parameters");
            }
            java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!org.bouncycastle.jcajce.provider.util.DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new java.security.InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            digestAlgorithm = mGF1ParameterSpec.getDigestAlgorithm();
        } else {
            if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) {
                throw new java.security.InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            digestAlgorithm = pSSParameterSpec.getMGFAlgorithm();
        }
        org.bouncycastle.crypto.Digest digest = org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(digestAlgorithm);
        if (digest == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no match on MGF algorithm: ");
            sb2.append(pSSParameterSpec.getMGFAlgorithm());
            throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
        }
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputFormats = pSSParameterSpec;
        this.getHighSpeedVideoSizesFor = digest;
        this.getOutputSizeshNQ4ISI = pSSParameterSpec.getSaltLength();
        boolean z = true;
        if (this.getInputFormats.getTrailerField() != 1) {
            throw new java.lang.IllegalArgumentException("unknown trailer field");
        }
        this.getOutputStallDuration = org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT;
        getHighSpeedVideoFpsRanges();
        if (this.getInputSizeshNQ4ISI != null) {
            this.getOutputMinFrameDuration = new org.bouncycastle.crypto.signers.PSSSigner(this.getOutputSizes, this.getHighResolutionOutputSizeshNQ4ISI, digest, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration);
            if (this.getInputSizeshNQ4ISI.isPrivate()) {
                pSSSigner = this.getOutputMinFrameDuration;
            } else {
                pSSSigner = this.getOutputMinFrameDuration;
                z = false;
            }
            pSSSigner.init(z, this.getInputSizeshNQ4ISI);
        }
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor = true;
        return this.getOutputMinFrameDuration.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getOutputMinFrameDuration.update(bArr, i, i2);
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getOutputMinFrameDuration.update(b);
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor = true;
        try {
            return this.getOutputMinFrameDuration.generateSignature();
        } catch (org.bouncycastle.crypto.CryptoException e) {
            throw new java.security.SignatureException(e.getMessage());
        }
    }

    class NullPssDigest implements org.bouncycastle.crypto.Digest {
        private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
        private java.io.ByteArrayOutputStream getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayOutputStream();
        private boolean Camera2StreamConfigurationMap = true;

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(b);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            this.getHighSpeedVideoFpsRanges.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.getHighSpeedVideoFpsRanges.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.Digest
        public java.lang.String getAlgorithmName() {
            return "NULL";
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            byte[] byteArray = this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
            if (this.Camera2StreamConfigurationMap) {
                java.lang.System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.getHighSpeedVideoFpsRanges.update(byteArray, 0, byteArray.length);
                this.getHighSpeedVideoFpsRanges.doFinal(bArr, i);
            }
            reset();
            this.Camera2StreamConfigurationMap = !this.Camera2StreamConfigurationMap;
            return byteArray.length;
        }

        public NullPssDigest(org.bouncycastle.crypto.Digest digest) {
            this.getHighSpeedVideoFpsRanges = digest;
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof java.security.interfaces.RSAPublicKey)) {
            throw new java.security.InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor((java.security.interfaces.RSAPublicKey) publicKey);
        org.bouncycastle.crypto.signers.PSSSigner pSSSigner = new org.bouncycastle.crypto.signers.PSSSigner(this.getOutputSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration);
        this.getOutputMinFrameDuration = pSSSigner;
        pSSSigner.init(false, this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        this.getOutputStallDurationlomOqCM = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof java.security.interfaces.RSAPrivateKey)) {
            throw new java.security.InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoSizes((java.security.interfaces.RSAPrivateKey) privateKey);
        org.bouncycastle.crypto.signers.PSSSigner pSSSigner = new org.bouncycastle.crypto.signers.PSSSigner(this.getOutputSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration);
        this.getOutputMinFrameDuration = pSSSigner;
        java.security.SecureRandom secureRandom = this.getOutputStallDurationlomOqCM;
        pSSSigner.init(true, secureRandom != null ? new org.bouncycastle.crypto.params.ParametersWithRandom(this.getInputSizeshNQ4ISI, secureRandom) : this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        java.security.spec.PSSParameterSpec pSSParameterSpec;
        if (this.getHighSpeedVideoFpsRanges == null && (pSSParameterSpec = this.getInputFormats) != null) {
            if (pSSParameterSpec.getDigestAlgorithm().equals(this.getInputFormats.getMGFAlgorithm()) && this.getInputFormats.getMGFParameters() == null) {
                return null;
            }
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getHighSpeedVideoSizes.createAlgorithmParameters("PSS");
                this.getHighSpeedVideoFpsRanges = createAlgorithmParameters;
                createAlgorithmParameters.init(this.getInputFormats);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineGetParameter unsupported");
    }

    public static class PSSwithRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public PSSwithRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), null);
        }
    }

    public static class SHA1withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA1withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), java.security.spec.PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA1withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA1", "SHAKE128", null, 20, 1));
        }
    }

    public static class SHA1withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA1", "SHAKE256", null, 20, 1));
        }
    }

    public static class SHA224withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA224withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-224", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA224withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-224", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA256withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA256withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-256", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA256withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-256", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA384withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA384withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-384", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-384", "SHAKE128", null, 48, 1));
        }
    }

    public static class SHA384withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-384", "SHAKE256", null, 48, 1));
        }
    }

    public static class SHA3_224withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-224", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-224", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA3_224withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-224", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA3_256withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-256", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-256", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA3_256withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-256", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA3_384withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-384", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-384", "SHAKE128", null, 48, 1));
        }
    }

    public static class SHA3_384withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-384", "SHAKE256", null, 48, 1));
        }
    }

    public static class SHA3_512withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-512", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-512", "SHAKE128", null, 64, 1));
        }
    }

    public static class SHA3_512withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA3-512", "SHAKE256", null, 64, 1));
        }
    }

    public static class SHA512_224withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(224)", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(224)", "SHAKE128", null, 28, 1));
        }
    }

    public static class SHA512_224withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(224)", "SHAKE256", null, 28, 1));
        }
    }

    public static class SHA512_256withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(256)", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(256)", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHA512_256withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512(256)", "SHAKE256", null, 32, 1));
        }
    }

    public static class SHA512withRSA extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512withRSA() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", new java.security.spec.MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE128 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512", "SHAKE128", null, 64, 1));
        }
    }

    public static class SHA512withRSAandSHAKE256 extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHA-512", "SHAKE256", null, 64, 1));
        }
    }

    public static class SHAKE128WithRSAPSS extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHAKE128", "SHAKE128", null, 32, 1));
        }
    }

    public static class SHAKE256WithRSAPSS extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), new java.security.spec.PSSParameterSpec("SHAKE256", "SHAKE256", null, 64, 1));
        }
    }

    public static class nonePSS extends org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi {
        public nonePSS() {
            super(new org.bouncycastle.crypto.engines.RSABlindedEngine(), null, true);
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap ? new org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.NullPssDigest(this.getHighSpeedVideoSizesFor) : org.bouncycastle.jcajce.provider.util.DigestFactory.getDigest(this.getInputFormats.getDigestAlgorithm());
    }

    protected PSSSignatureSpi(org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher, java.security.spec.PSSParameterSpec pSSParameterSpec) {
        this(asymmetricBlockCipher, pSSParameterSpec, false);
    }
}
