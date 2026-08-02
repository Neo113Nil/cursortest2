package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
public interface CertPathValidation extends org.bouncycastle.util.Memoable {
    void validate(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.path.CertPathValidationException;
}
