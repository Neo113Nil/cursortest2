package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcECSignerInfoVerifierBuilder {
    private org.bouncycastle.operator.DigestCalculatorProvider getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.operator.bc.BcECContentVerifierProviderBuilder getHighSpeedVideoSizes;

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.build(asymmetricKeyParameter), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.build(x509CertificateHolder), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public BcECSignerInfoVerifierBuilder(org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator, org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getHighSpeedVideoFpsRangesFor = cMSSignatureAlgorithmNameGenerator;
        this.getHighSpeedVideoFpsRanges = signatureAlgorithmIdentifierFinder;
        this.getHighSpeedVideoSizes = new org.bouncycastle.operator.bc.BcECContentVerifierProviderBuilder(digestAlgorithmIdentifierFinder);
        this.getHighResolutionOutputSizeshNQ4ISI = digestCalculatorProvider;
    }
}
