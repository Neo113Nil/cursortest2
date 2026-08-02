package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
public class LMSSignatureSpi extends java.security.Signature {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner getHighSpeedVideoSizes;

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey)) {
            throw new java.security.InvalidKeyException("unknown private key passed to LMS");
        }
        org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner lMSContextBasedSigner = (org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner) ((org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey) privateKey).getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = lMSContextBasedSigner;
        if (lMSContextBasedSigner.getUsagesRemaining() == 0) {
            throw new java.security.InvalidKeyException("private key exhausted");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (!(publicKey instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey)) {
            throw new java.security.InvalidKeyException("unknown public key passed to XMSS");
        }
        org.bouncycastle.crypto.digests.NullDigest nullDigest = new org.bouncycastle.crypto.digests.NullDigest();
        this.getHighResolutionOutputSizeshNQ4ISI = nullDigest;
        nullDigest.reset();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier) ((org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey) publicKey).Camera2StreamConfigurationMap;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws java.security.SignatureException {
        org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext = this.getHighSpeedVideoFpsRangesFor.generateLMSContext(bArr);
        byte[] highSpeedVideoSizes = org.bouncycastle.pqc.jcajce.provider.lms.DigestUtil.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
        generateLMSContext.update(highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
        return this.getHighSpeedVideoFpsRangesFor.verify(generateLMSContext);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws java.security.SignatureException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws java.security.SignatureException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws java.security.SignatureException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
        }
        try {
            byte[] generateSignature = this.getHighSpeedVideoSizes.generateSignature((org.bouncycastle.pqc.crypto.lms.LMSContext) this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            return generateSignature;
        } catch (java.lang.Exception e) {
            if (e instanceof java.lang.IllegalStateException) {
                throw new java.security.SignatureException(e.getMessage(), e);
            }
            throw new java.security.SignatureException(e.toString(), e);
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
        this.Camera2StreamConfigurationMap = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges() throws java.security.SignatureException {
        try {
            return this.getHighSpeedVideoSizes.generateLMSContext();
        } catch (org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException e) {
            throw new java.security.SignatureException(e.getMessage(), e);
        }
    }

    public static class generic extends org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi {
        public generic() {
            super("LMS", new org.bouncycastle.crypto.digests.NullDigest());
        }
    }

    protected LMSSignatureSpi(java.lang.String str, org.bouncycastle.crypto.Digest digest) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
    }

    protected LMSSignatureSpi(java.lang.String str) {
        super(str);
    }
}
