package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaSimpleSignerInfoGeneratorBuilder {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.cms.CMSAttributeTableGenerator getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cms.CMSAttributeTableGenerator getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper(this, 0);

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getHighSpeedVideoFpsRanges = cMSAttributeTableGenerator;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getHighSpeedVideoFpsRangesFor = cMSAttributeTableGenerator;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(org.bouncycastle.asn1.cms.AttributeTable attributeTable) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.DefaultSignedAttributeTableGenerator(attributeTable);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setProvider(java.security.Provider provider) throws org.bouncycastle.operator.OperatorCreationException {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.ProviderHelper(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setProvider(java.lang.String str) throws org.bouncycastle.operator.OperatorCreationException {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.NamedHelper(str);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setDirectSignature(boolean z) {
        this.Camera2StreamConfigurationMap = z;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder setContentDigest(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        return this;
    }

    class Helper {
        org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().build();
        }

        org.bouncycastle.operator.ContentSigner getHighSpeedVideoFpsRanges(java.lang.String str, java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentSignerBuilder(str).build(org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey));
        }

        /* synthetic */ Helper(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder jcaSimpleSignerInfoGeneratorBuilder, byte b) {
            this();
        }

        private Helper() {
        }
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(java.lang.String str, java.security.PrivateKey privateKey, byte[] bArr) throws org.bouncycastle.operator.OperatorCreationException {
        return getHighSpeedVideoSizes().build(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(str, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey)), bArr);
    }

    class NamedHelper extends org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper {
        private final java.lang.String getHighSpeedVideoSizes;

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        final org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setProvider(this.getHighSpeedVideoSizes).build();
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        final org.bouncycastle.operator.ContentSigner getHighSpeedVideoFpsRanges(java.lang.String str, java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentSignerBuilder(str).setProvider(this.getHighSpeedVideoSizes).build(org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey));
        }

        public NamedHelper(java.lang.String str) {
            super(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.this, (byte) 0);
            this.getHighSpeedVideoSizes = str;
        }
    }

    class ProviderHelper extends org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper {
        private final java.security.Provider getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        final org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap() throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setProvider(this.getHighSpeedVideoFpsRanges).build();
        }

        @Override // org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        final org.bouncycastle.operator.ContentSigner getHighSpeedVideoFpsRanges(java.lang.String str, java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
            return new org.bouncycastle.operator.jcajce.JcaContentSignerBuilder(str).setProvider(this.getHighSpeedVideoFpsRanges).build(org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey));
        }

        public ProviderHelper(java.security.Provider provider) {
            super(org.bouncycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.this, (byte) 0);
            this.getHighSpeedVideoFpsRanges = provider;
        }
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(java.lang.String str, java.security.PrivateKey privateKey, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return getHighSpeedVideoSizes().build(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(str, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey)), x509CertificateHolder);
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(java.lang.String str, java.security.PrivateKey privateKey, java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateEncodingException {
        return getHighSpeedVideoSizes().build(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(str, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey)), new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }

    private org.bouncycastle.cms.SignerInfoGeneratorBuilder getHighSpeedVideoSizes() throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.cms.SignerInfoGeneratorBuilder signerInfoGeneratorBuilder = new org.bouncycastle.cms.SignerInfoGeneratorBuilder(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap());
        signerInfoGeneratorBuilder.setDirectSignature(this.Camera2StreamConfigurationMap);
        signerInfoGeneratorBuilder.setContentDigest(this.getHighResolutionOutputSizeshNQ4ISI);
        signerInfoGeneratorBuilder.setSignedAttributeGenerator(this.getHighSpeedVideoFpsRangesFor);
        signerInfoGeneratorBuilder.setUnsignedAttributeGenerator(this.getHighSpeedVideoFpsRanges);
        return signerInfoGeneratorBuilder;
    }
}
