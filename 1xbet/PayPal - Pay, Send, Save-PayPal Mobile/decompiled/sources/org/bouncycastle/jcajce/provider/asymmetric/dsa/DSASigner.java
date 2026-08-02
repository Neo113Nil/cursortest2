package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class DSASigner extends java.security.SignatureSpi implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.signers.DSAEncoding getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE;
    private org.bouncycastle.crypto.DSAExt getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, 0);
        try {
            java.math.BigInteger[] decode = this.getHighSpeedVideoFpsRangesFor.decode(this.getHighSpeedVideoSizes.getOrder(), bArr);
            return this.getHighSpeedVideoSizes.verifySignature(bArr2, decode[0], decode[1]);
        } catch (java.lang.Exception unused) {
            throw new java.security.SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0);
        try {
            java.math.BigInteger[] generateSignature = this.getHighSpeedVideoSizes.generateSignature(bArr);
            return this.getHighSpeedVideoFpsRangesFor.encode(this.getHighSpeedVideoSizes.getOrder(), generateSignature[0], generateSignature[1]);
        } catch (java.lang.Exception e) {
            throw new java.security.SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.generatePublicKeyParameter(publicKey);
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoSizes.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        this.Camera2StreamConfigurationMap = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters generatePrivateKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.generatePrivateKeyParameter(privateKey);
        java.security.SecureRandom secureRandom = this.Camera2StreamConfigurationMap;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoSizes.init(true, generatePrivateKeyParameter);
    }

    public static class detDSA extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSA() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA1())));
        }
    }

    public static class detDSA224 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSA224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA224())));
        }
    }

    public static class detDSA256 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSA256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA256())));
        }
    }

    public static class detDSA384 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSA384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA384())));
        }
    }

    public static class detDSA512 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSA512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA512())));
        }
    }

    public static class detDSASha3_224 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSASha3_224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224())));
        }
    }

    public static class detDSASha3_256 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSASha3_256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256())));
        }
    }

    public static class detDSASha3_384 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSASha3_384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384())));
        }
    }

    public static class detDSASha3_512 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public detDSASha3_512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.DSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512())));
        }
    }

    public static class dsa224 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa256 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa384 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsa512 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsa512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaRMD160 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsaRMD160() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_224 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsaSha3_224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_256 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsaSha3_256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_384 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsaSha3_384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class dsaSha3_512 extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public dsaSha3_512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class noneDSA extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public noneDSA() {
            super(new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    public static class stdDSA extends org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner {
        public stdDSA() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.DSASigner());
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineGetParameter unsupported");
    }

    protected DSASigner(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.DSAExt dSAExt) {
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoSizes = dSAExt;
    }
}
