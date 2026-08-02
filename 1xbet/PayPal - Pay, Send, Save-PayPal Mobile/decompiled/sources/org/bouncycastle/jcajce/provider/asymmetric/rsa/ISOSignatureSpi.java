package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class ISOSignatureSpi extends java.security.SignatureSpi {
    private org.bouncycastle.crypto.signers.ISO9796d2Signer getHighSpeedVideoFpsRanges;

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.getHighSpeedVideoFpsRanges.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRanges.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        try {
            return this.getHighSpeedVideoFpsRanges.generateSignature();
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
        this.getHighSpeedVideoFpsRanges.init(false, org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoFpsRangesFor((java.security.interfaces.RSAPublicKey) publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        this.getHighSpeedVideoFpsRanges.init(true, org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.getHighSpeedVideoSizes((java.security.interfaces.RSAPrivateKey) privateKey));
    }

    public static class MD5WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public MD5WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createMD5(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA1WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA1WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA224WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA224WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA256WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA256WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA384WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA384WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA512WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512_224WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512_224(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class SHA512_256WithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512_256(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    public static class WhirlpoolWithRSAEncryption extends org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new org.bouncycastle.crypto.digests.WhirlpoolDigest(), new org.bouncycastle.crypto.engines.RSABlindedEngine());
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected ISOSignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.AsymmetricBlockCipher asymmetricBlockCipher) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.signers.ISO9796d2Signer(asymmetricBlockCipher, digest, true);
    }
}
