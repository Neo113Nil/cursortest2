package org.bouncycastle.pqc.jcajce.provider.qtesla;

/* loaded from: classes17.dex */
public class SignatureSpi extends java.security.Signature {
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.qtesla.QTESLASigner getHighSpeedVideoFpsRanges;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey)) {
            throw new java.security.InvalidKeyException("unknown private key passed to qTESLA");
        }
        org.bouncycastle.crypto.CipherParameters cipherParameters = ((org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey) privateKey).getHighSpeedVideoSizes;
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRangesFor;
        if (secureRandom != null) {
            cipherParameters = new org.bouncycastle.crypto.params.ParametersWithRandom(cipherParameters, secureRandom);
        }
        this.getHighSpeedVideoFpsRanges.init(true, cipherParameters);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey)) {
            throw new java.security.InvalidKeyException("unknown public key passed to qTESLA");
        }
        org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters qTESLAPublicKeyParameters = ((org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoFpsRanges.init(false, qTESLAPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        return this.getHighSpeedVideoFpsRanges.verifySignature(org.bouncycastle.pqc.jcajce.provider.qtesla.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI), bArr);
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
            return this.getHighSpeedVideoFpsRanges.generateSignature(org.bouncycastle.pqc.jcajce.provider.qtesla.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.IllegalStateException) {
                throw new java.security.SignatureException(e.getMessage());
            }
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
    protected void engineInitSign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        this.getHighSpeedVideoFpsRangesFor = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    public static class PI extends org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi {
        public PI() {
            super(org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(5), new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.qtesla.QTESLASigner());
        }
    }

    public static class PIII extends org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi {
        public PIII() {
            super(org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(6), new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.qtesla.QTESLASigner());
        }
    }

    public static class qTESLA extends org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi {
        public qTESLA() {
            super("qTESLA", new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.pqc.crypto.qtesla.QTESLASigner());
        }
    }

    protected SignatureSpi(java.lang.String str, org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.qtesla.QTESLASigner qTESLASigner) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = qTESLASigner;
    }

    protected SignatureSpi(java.lang.String str) {
        super(str);
    }
}
