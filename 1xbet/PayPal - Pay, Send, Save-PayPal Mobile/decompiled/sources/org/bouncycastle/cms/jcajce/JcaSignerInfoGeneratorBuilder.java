package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaSignerInfoGeneratorBuilder {
    private org.bouncycastle.cms.SignerInfoGeneratorBuilder getHighSpeedVideoFpsRanges;

    public org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getHighSpeedVideoFpsRanges.setUnsignedAttributeGenerator(cMSAttributeTableGenerator);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder setSignedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.getHighSpeedVideoFpsRanges.setSignedAttributeGenerator(cMSAttributeTableGenerator);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder setDirectSignature(boolean z) {
        this.getHighSpeedVideoFpsRanges.setDirectSignature(z);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder setContentDigest(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRanges.setContentDigest(algorithmIdentifier);
        return this;
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(org.bouncycastle.operator.ContentSigner contentSigner, byte[] bArr) throws org.bouncycastle.operator.OperatorCreationException {
        return this.getHighSpeedVideoFpsRanges.build(contentSigner, bArr);
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return this.getHighSpeedVideoFpsRanges.build(contentSigner, x509CertificateHolder);
    }

    public org.bouncycastle.cms.SignerInfoGenerator build(org.bouncycastle.operator.ContentSigner contentSigner, java.security.cert.X509Certificate x509Certificate) throws org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateEncodingException {
        return build(contentSigner, new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }

    public JcaSignerInfoGeneratorBuilder(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cms.SignerInfoGeneratorBuilder(digestCalculatorProvider, cMSSignatureEncryptionAlgorithmFinder);
    }

    public JcaSignerInfoGeneratorBuilder(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this(digestCalculatorProvider, new org.bouncycastle.cms.DefaultCMSSignatureEncryptionAlgorithmFinder());
    }
}
