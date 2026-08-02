package org.bouncycastle.its.operator;

/* loaded from: classes17.dex */
public interface ITSContentSigner {
    org.bouncycastle.its.ITSCertificate getAssociatedCertificate();

    byte[] getAssociatedCertificateDigest();

    org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm();

    java.io.OutputStream getOutputStream();

    byte[] getSignature();

    boolean isForSelfSigning();
}
