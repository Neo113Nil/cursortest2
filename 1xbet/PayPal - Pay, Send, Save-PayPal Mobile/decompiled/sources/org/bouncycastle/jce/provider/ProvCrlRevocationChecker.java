package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class ProvCrlRevocationChecker implements org.bouncycastle.jcajce.PKIXCertRevocationChecker {
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters getHighSpeedVideoFpsRangesFor;
    java.util.Date getHighSpeedVideoSizes = null;

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(java.lang.String str, java.lang.Object obj) {
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.getHighSpeedVideoFpsRangesFor = pKIXCertRevocationCheckerParameters;
        this.getHighSpeedVideoSizes = new java.util.Date();
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void check(java.security.cert.Certificate certificate) throws java.security.cert.CertPathValidatorException {
        try {
            org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.jce.provider.RFC3280CertPathUtilities.getHighSpeedVideoSizes(pKIXCertRevocationCheckerParameters, pKIXCertRevocationCheckerParameters.getParamsPKIX(), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.getValidDate(), (java.security.cert.X509Certificate) certificate, this.getHighSpeedVideoFpsRangesFor.getSigningCert(), this.getHighSpeedVideoFpsRangesFor.getWorkingPublicKey(), this.getHighSpeedVideoFpsRangesFor.getCertPath().getCertificates(), this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
            throw new java.security.cert.CertPathValidatorException(e.getMessage(), e.getCause() != null ? e.getCause() : e, this.getHighSpeedVideoFpsRangesFor.getCertPath(), this.getHighSpeedVideoFpsRangesFor.getIndex());
        }
    }

    public ProvCrlRevocationChecker(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getHighResolutionOutputSizeshNQ4ISI = jcaJceHelper;
    }
}
