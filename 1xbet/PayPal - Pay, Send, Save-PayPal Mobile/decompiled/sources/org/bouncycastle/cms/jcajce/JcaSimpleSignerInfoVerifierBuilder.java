package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaSimpleSignerInfoVerifierBuilder {
    private org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper(this, 0);

    class Helper {
        org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().build();
        }

        org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(x509CertificateHolder);
        }

        org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(x509Certificate);
        }

        org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(publicKey);
        }

        /* synthetic */ Helper(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder jcaSimpleSignerInfoVerifierBuilder, byte b) {
            this();
        }

        private Helper() {
        }
    }

    class NamedHelper extends org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper {
        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setProvider(this.getHighSpeedVideoFpsRanges).build();
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRanges).build(x509CertificateHolder);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRanges).build(x509Certificate);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRanges).build(publicKey);
        }

        public NamedHelper(java.lang.String str) {
            super(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.this, (byte) 0);
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    class ProviderHelper extends org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper {
        private final java.security.Provider getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setProvider(this.getHighSpeedVideoFpsRangesFor).build();
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRangesFor).build(x509CertificateHolder);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRangesFor).build(x509Certificate);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoFpsRangesFor).build(publicKey);
        }

        public ProviderHelper(java.security.Provider provider) {
            super(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.this, (byte) 0);
            this.getHighSpeedVideoFpsRangesFor = provider;
        }
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.ProviderHelper(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.NamedHelper(str);
        return this;
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
        return new org.bouncycastle.cms.SignerInformationVerifier(new org.bouncycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator(), new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder(), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(x509CertificateHolder), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor());
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(new org.bouncycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator(), new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder(), this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(x509Certificate), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor());
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(new org.bouncycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator(), new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder(), this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(publicKey), this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor());
    }
}
