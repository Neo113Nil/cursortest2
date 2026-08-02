package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.rainbow.RainbowSigner getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        return this.getHighSpeedVideoSizes.verifySignature(bArr2, bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        byte[] bArr = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        try {
            return this.getHighSpeedVideoSizes.generateSignature(bArr);
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
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter = org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeysToParams.generatePublicKeyParameter(publicKey);
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoSizes.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        this.getHighSpeedVideoFpsRanges = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeysToParams.generatePrivateKeyParameter(privateKey);
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRanges;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoSizes.init(true, generatePrivateKeyParameter);
    }

    public static class withSha224 extends org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi {
        public withSha224() {
            super(new org.bouncycastle.crypto.digests.SHA224Digest(), new org.bouncycastle.pqc.crypto.rainbow.RainbowSigner());
        }
    }

    public static class withSha256 extends org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi {
        public withSha256() {
            super(new org.bouncycastle.crypto.digests.SHA256Digest(), new org.bouncycastle.pqc.crypto.rainbow.RainbowSigner());
        }
    }

    public static class withSha384 extends org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi {
        public withSha384() {
            super(new org.bouncycastle.crypto.digests.SHA384Digest(), new org.bouncycastle.pqc.crypto.rainbow.RainbowSigner());
        }
    }

    public static class withSha512 extends org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi {
        public withSha512() {
            super(new org.bouncycastle.crypto.digests.SHA512Digest(), new org.bouncycastle.pqc.crypto.rainbow.RainbowSigner());
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected SignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.rainbow.RainbowSigner rainbowSigner) {
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoSizes = rainbowSigner;
    }
}
