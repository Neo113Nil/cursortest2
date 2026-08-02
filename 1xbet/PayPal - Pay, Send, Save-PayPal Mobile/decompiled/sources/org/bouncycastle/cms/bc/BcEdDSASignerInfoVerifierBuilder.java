package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcEdDSASignerInfoVerifierBuilder {
    private org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder Camera2StreamConfigurationMap;
    private org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.bc.BcEdDSAContentVerifierProviderBuilder getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.bc.BcEdDSAContentVerifierProviderBuilder();
    private org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoSizes;

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.build(asymmetricKeyParameter), this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.cms.SignerInformationVerifier build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.cms.SignerInformationVerifier(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.build(x509CertificateHolder), this.getHighSpeedVideoSizes);
    }

    public BcEdDSASignerInfoVerifierBuilder(org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator cMSSignatureAlgorithmNameGenerator, org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder signatureAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = cMSSignatureAlgorithmNameGenerator;
        this.Camera2StreamConfigurationMap = signatureAlgorithmIdentifierFinder;
        this.getHighSpeedVideoSizes = digestCalculatorProvider;
    }
}
