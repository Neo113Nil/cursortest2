package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcRSASignerInfoVerifierBuilder {
    private org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator Camera2StreamConfigurationMap;
    private org.bouncycastle.operator.bc.BcRSAContentVerifierProviderBuilder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder getHighSpeedVideoSizes;

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.build(asymmetricKeyParameter), this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.build(x509CertificateHolder), this.getHighSpeedVideoFpsRangesFor);
    }

    public BcRSASignerInfoVerifierBuilder(org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator, org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.Camera2StreamConfigurationMap = cMSSignatureAlgorithmNameGenerator;
        this.getHighSpeedVideoSizes = signatureAlgorithmIdentifierFinder;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.bc.BcRSAContentVerifierProviderBuilder(digestAlgorithmIdentifierFinder);
        this.getHighSpeedVideoFpsRangesFor = digestCalculatorProvider;
    }
}
