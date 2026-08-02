package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface ContentVerifierProvider {
    org.bouncycastle.operator.ContentVerifier get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException;

    org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
