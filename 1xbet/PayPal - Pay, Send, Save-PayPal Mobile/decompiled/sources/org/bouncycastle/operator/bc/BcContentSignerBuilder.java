package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public abstract class BcContentSignerBuilder {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    protected org.bouncycastle.operator.bc.BcDigestProvider digestProvider = org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    protected abstract org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) throws org.bouncycastle.operator.OperatorCreationException;

    public org.bouncycastle.operator.bc.BcContentSignerBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.Camera2StreamConfigurationMap = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.ContentSigner build(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.crypto.Signer createSigner = createSigner(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        java.security.SecureRandom secureRandom = this.Camera2StreamConfigurationMap;
        if (secureRandom != null) {
            createSigner.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(asymmetricKeyParameter, secureRandom));
        } else {
            createSigner.init(true, asymmetricKeyParameter);
        }
        return new org.bouncycastle.operator.ContentSigner(createSigner) { // from class: org.bouncycastle.operator.bc.BcContentSignerBuilder.1
            private org.bouncycastle.operator.bc.BcSignerOutputStream Camera2StreamConfigurationMap;
            final /* synthetic */ org.bouncycastle.crypto.Signer getHighSpeedVideoFpsRangesFor;

            @Override // org.bouncycastle.operator.ContentSigner
            public byte[] getSignature() {
                try {
                    return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.generateSignature();
                } catch (org.bouncycastle.crypto.CryptoException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                }
            }

            @Override // org.bouncycastle.operator.ContentSigner
            public java.io.OutputStream getOutputStream() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // org.bouncycastle.operator.ContentSigner
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return org.bouncycastle.operator.bc.BcContentSignerBuilder.this.getHighResolutionOutputSizeshNQ4ISI;
            }

            {
                this.getHighSpeedVideoFpsRangesFor = createSigner;
                this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.bc.BcSignerOutputStream(createSigner);
            }
        };
    }

    public BcContentSignerBuilder(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoSizes = algorithmIdentifier2;
    }
}
