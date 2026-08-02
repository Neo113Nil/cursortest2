package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public interface X509ContentVerifierProviderBuilder {
    org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.operator.OperatorCreationException;

    org.bouncycastle.operator.ContentVerifierProvider build(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.operator.OperatorCreationException;
}
