package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerInformationVerifier {
    private org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap;
    private org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.operator.ContentVerifierProvider getHighSpeedVideoSizes;

    public boolean hasAssociatedCertificate() {
        return this.getHighSpeedVideoSizes.hasAssociatedCertificate();
    }

    public org.bouncycastle.operator.DigestCalculator getDigestCalculator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        return this.Camera2StreamConfigurationMap.get(algorithmIdentifier);
    }

    public org.bouncycastle.operator.ContentVerifier getContentVerifier(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) throws org.bouncycastle.operator.OperatorCreationException {
        return this.getHighSpeedVideoSizes.get(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor.find(this.getHighSpeedVideoFpsRanges.getSignatureName(algorithmIdentifier2, algorithmIdentifier)).getAlgorithm(), algorithmIdentifier.getParameters()));
    }

    public org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() {
        return this.getHighSpeedVideoSizes.getAssociatedCertificate();
    }

    public SignerInformationVerifier(org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator, org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder, org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getHighSpeedVideoFpsRanges = cMSSignatureAlgorithmNameGenerator;
        this.getHighSpeedVideoFpsRangesFor = signatureAlgorithmIdentifierFinder;
        this.getHighSpeedVideoSizes = contentVerifierProvider;
        this.Camera2StreamConfigurationMap = digestCalculatorProvider;
    }
}
