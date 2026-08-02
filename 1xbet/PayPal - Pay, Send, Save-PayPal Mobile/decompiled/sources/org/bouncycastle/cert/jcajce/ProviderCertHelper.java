package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
class ProviderCertHelper extends org.bouncycastle.cert.jcajce.CertHelper {
    private final java.security.Provider getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    protected final java.security.cert.CertificateFactory getHighSpeedVideoFpsRangesFor(java.lang.String str) throws java.security.cert.CertificateException {
        return java.security.cert.CertificateFactory.getInstance(str, this.getHighSpeedVideoFpsRanges);
    }

    ProviderCertHelper(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }
}
