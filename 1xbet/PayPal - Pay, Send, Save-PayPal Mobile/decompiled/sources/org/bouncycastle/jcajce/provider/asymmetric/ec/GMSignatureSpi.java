package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private final org.bouncycastle.crypto.signers.SM2Signer getHighResolutionOutputSizeshNQ4ISI;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.jcajce.spec.SM2ParameterSpec getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.BCJcaJceHelper();

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
        } catch (org.bouncycastle.crypto.CryptoException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create signature: ");
            sb.append(e.getMessage());
            throw new java.security.SignatureException(sb.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.SM2ParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
        }
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.jcajce.spec.SM2ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(publicKey);
        org.bouncycastle.jcajce.spec.SM2ParameterSpec sM2ParameterSpec = this.getHighSpeedVideoFpsRangesFor;
        if (sM2ParameterSpec != null) {
            highResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ParametersWithID(highResolutionOutputSizeshNQ4ISI, sM2ParameterSpec.getID());
        }
        this.getHighResolutionOutputSizeshNQ4ISI.init(false, highResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.CipherParameters generatePrivateKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
        if (this.appRandom != null) {
            generatePrivateKeyParameter = new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, this.appRandom);
        }
        org.bouncycastle.jcajce.spec.SM2ParameterSpec sM2ParameterSpec = this.getHighSpeedVideoFpsRangesFor;
        if (sM2ParameterSpec != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.init(true, new org.bouncycastle.crypto.params.ParametersWithID(generatePrivateKeyParameter, sM2ParameterSpec.getID()));
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoFpsRangesFor != null) {
            try {
                java.security.AlgorithmParameters createAlgorithmParameters = this.getHighSpeedVideoSizes.createAlgorithmParameters("PSS");
                this.getHighSpeedVideoFpsRanges = createAlgorithmParameters;
                createAlgorithmParameters.init(this.getHighSpeedVideoFpsRangesFor);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public static class sha256WithSM2 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi {
        public sha256WithSM2() {
            super(new org.bouncycastle.crypto.signers.SM2Signer(new org.bouncycastle.crypto.digests.SHA256Digest()));
        }
    }

    public static class sm3WithSM2 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi {
        public sm3WithSM2() {
            super(new org.bouncycastle.crypto.signers.SM2Signer());
        }
    }

    @Override // java.security.SignatureSpi
    protected java.lang.Object engineGetParameter(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("engineGetParameter unsupported");
    }

    GMSignatureSpi(org.bouncycastle.crypto.signers.SM2Signer sM2Signer) {
        this.getHighResolutionOutputSizeshNQ4ISI = sM2Signer;
    }
}
