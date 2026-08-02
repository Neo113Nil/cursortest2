package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public interface PKIXCertRevocationChecker {
    void check(java.security.cert.Certificate certificate) throws java.security.cert.CertPathValidatorException;

    void initialize(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) throws java.security.cert.CertPathValidatorException;

    void setParameter(java.lang.String str, java.lang.Object obj);
}
