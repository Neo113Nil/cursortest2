package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class WrappedRevocationChecker implements org.bouncycastle.jcajce.PKIXCertRevocationChecker {
    private final java.security.cert.PKIXCertPathChecker Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(java.lang.String str, java.lang.Object obj) {
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) throws java.security.cert.CertPathValidatorException {
        this.Camera2StreamConfigurationMap.init(false);
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void check(java.security.cert.Certificate certificate) throws java.security.cert.CertPathValidatorException {
        this.Camera2StreamConfigurationMap.check(certificate);
    }

    public WrappedRevocationChecker(java.security.cert.PKIXCertPathChecker pKIXCertPathChecker) {
        this.Camera2StreamConfigurationMap = pKIXCertPathChecker;
    }
}
