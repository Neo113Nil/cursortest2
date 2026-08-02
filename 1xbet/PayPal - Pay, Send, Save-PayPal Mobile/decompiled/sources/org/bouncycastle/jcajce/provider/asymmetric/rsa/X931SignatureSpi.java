package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class X931SignatureSpi extends java.security.SignatureSpi {
    private org.bouncycastle.crypto.signers.X931Signer getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.getHighResolutionOutputSizeshNQ4ISI.verifySignature(bArr);
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
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.generateSignature();
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
        this.getHighResolutionOutputSizeshNQ4ISI.init(false, org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor((java.security.interfaces.RSAPublicKey) publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoSizes((java.security.interfaces.RSAPrivateKey) privateKey));
    }

    public static class RIPEMD128WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public RIPEMD128WithRSAEncryption() {
            super(new org.bouncycastle.crypto.digests.RIPEMD128Digest(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA1WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA1WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA224WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA224WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA256WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA256WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA384WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA384WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA512WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512_224WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512_224(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512_256WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512_256(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class WhirlpoolWithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new org.bouncycastle.crypto.digests.WhirlpoolDigest(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected X931SignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.X931Signer(asymmetricBlockCipher, digest);
    }
}
