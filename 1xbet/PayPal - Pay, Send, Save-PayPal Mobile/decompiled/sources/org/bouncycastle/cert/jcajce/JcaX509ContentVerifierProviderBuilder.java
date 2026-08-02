package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509ContentVerifierProviderBuilder implements org.bouncycastle.cert.X509ContentVerifierProviderBuilder {
    private org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder();

    public org.bouncycastle.cert.jcajce.JcaX509ContentVerifierProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges.setProvider(provider);
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaX509ContentVerifierProviderBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.setProvider(str);
        return this;
    }

    @Override // org.bouncycastle.cert.X509ContentVerifierProviderBuilder
    public org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            return this.getHighSpeedVideoFpsRanges.build(x509CertificateHolder);
        } catch (java.security.cert.CertificateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to process certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cert.X509ContentVerifierProviderBuilder
    public org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.operator.OperatorCreationException {
        return this.getHighSpeedVideoFpsRanges.build(subjectPublicKeyInfo);
    }
}
