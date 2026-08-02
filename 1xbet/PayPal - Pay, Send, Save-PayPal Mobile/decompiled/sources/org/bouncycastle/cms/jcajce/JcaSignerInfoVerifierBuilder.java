package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaSignerInfoVerifierBuilder {
    private org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper(this, 0);
    private org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator getHighSpeedVideoSizes = new org.bouncycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator();
    private org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder Camera2StreamConfigurationMap = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder();

    public org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder setSignatureAlgorithmNameGenerator(org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator) {
        this.getHighSpeedVideoSizes = cMSSignatureAlgorithmNameGenerator;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder setSignatureAlgorithmFinder(org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder) {
        this.Camera2StreamConfigurationMap = signatureAlgorithmIdentifierFinder;
        return this;
    }

    class Helper {
        org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(x509CertificateHolder);
        }

        org.bouncycastle.operator.ContentVerifierProvider Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(x509Certificate);
        }

        org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().build(publicKey);
        }

        /* synthetic */ Helper(org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder jcaSignerInfoVerifierBuilder, byte b) {
            this();
        }

        private Helper() {
        }
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.ProviderHelper(provider);
        return this;
    }

    class NamedHelper extends org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper {
        private final java.lang.String Camera2StreamConfigurationMap;

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.Camera2StreamConfigurationMap).build(x509CertificateHolder);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.Camera2StreamConfigurationMap).build(x509Certificate);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.Camera2StreamConfigurationMap).build(publicKey);
        }

        public NamedHelper(java.lang.String str) {
            super(org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.this, (byte) 0);
            this.Camera2StreamConfigurationMap = str;
        }
    }

    class ProviderHelper extends org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper {
        private final java.security.Provider getHighSpeedVideoSizes;

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoSizes).build(x509CertificateHolder);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoSizes).build(x509Certificate);
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.Helper
        final org.bouncycastle.operator.ContentVerifierProvider getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder().setProvider(this.getHighSpeedVideoSizes).build(publicKey);
        }

        public ProviderHelper(java.security.Provider provider) {
            super(org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.this, (byte) 0);
            this.getHighSpeedVideoSizes = provider;
        }
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.JcaSignerInfoVerifierBuilder.NamedHelper(str);
        return this;
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(x509CertificateHolder), this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(x509Certificate), this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(publicKey), this.getHighSpeedVideoFpsRanges);
    }

    public JcaSignerInfoVerifierBuilder(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getHighSpeedVideoFpsRanges = digestCalculatorProvider;
    }
}
