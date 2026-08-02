package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerInfoGeneratorBuilder {
    private org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private org.bouncycastle.cms.CMSAttributeTableGenerator getHighSpeedVideoSizesFor;
    private org.bouncycastle.cms.CMSAttributeTableGenerator getOutputMinFrameDuration;

    public org.bouncycastle.cms.SignerInfoGenerator build(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.cms.SignerInfoGenerator Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(contentSigner, new org.bouncycastle.asn1.cms.SignerIdentifier(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(x509CertificateHolder.toASN1Structure())));
        Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI = x509CertificateHolder;
        return Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.cms.SignerInfoGeneratorBuilder setUnsignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getHighSpeedVideoSizesFor = cMSAttributeTableGenerator;
        return this;
    }

    public org.bouncycastle.cms.SignerInfoGeneratorBuilder setSignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getOutputMinFrameDuration = cMSAttributeTableGenerator;
        return this;
    }

    public org.bouncycastle.cms.SignerInfoGeneratorBuilder setDirectSignature(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return this;
    }

    public org.bouncycastle.cms.SignerInfoGeneratorBuilder setContentDigest(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        return this;
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(org.bouncycastle.operator.ContentSigner contentSigner, byte[] bArr) throws org.bouncycastle.operator.OperatorCreationException {
        return Camera2StreamConfigurationMap(contentSigner, new org.bouncycastle.asn1.cms.SignerIdentifier((org.bouncycastle.asn1.ASN1OctetString) new org.bouncycastle.asn1.DEROctetString(bArr)));
    }

    private org.bouncycastle.cms.SignerInfoGenerator Camera2StreamConfigurationMap(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoSizes;
        org.bouncycastle.operator.DigestCalculator digestCalculator = algorithmIdentifier != null ? this.Camera2StreamConfigurationMap.get(algorithmIdentifier) : this.Camera2StreamConfigurationMap.get(this.getHighSpeedVideoFpsRangesFor.find(contentSigner.getAlgorithmIdentifier()));
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return new org.bouncycastle.cms.SignerInfoGenerator(signerIdentifier, contentSigner, digestCalculator.getAlgorithmIdentifier(), this.getHighSpeedVideoFpsRanges);
        }
        org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator = this.getOutputMinFrameDuration;
        if (cMSAttributeTableGenerator == null && this.getHighSpeedVideoSizesFor == null) {
            return new org.bouncycastle.cms.SignerInfoGenerator(signerIdentifier, contentSigner, digestCalculator, this.getHighSpeedVideoFpsRanges, new org.bouncycastle.cms.DefaultSignedAttributeTableGenerator(), null);
        }
        if (cMSAttributeTableGenerator == null) {
            this.getOutputMinFrameDuration = new org.bouncycastle.cms.DefaultSignedAttributeTableGenerator();
        }
        return new org.bouncycastle.cms.SignerInfoGenerator(signerIdentifier, contentSigner, digestCalculator, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
    }

    public SignerInfoGeneratorBuilder(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();
        this.Camera2StreamConfigurationMap = digestCalculatorProvider;
        this.getHighSpeedVideoFpsRanges = cMSSignatureEncryptionAlgorithmFinder;
    }

    public SignerInfoGeneratorBuilder(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this(digestCalculatorProvider, new org.bouncycastle.cms.DefaultCMSSignatureEncryptionAlgorithmFinder());
    }
}
