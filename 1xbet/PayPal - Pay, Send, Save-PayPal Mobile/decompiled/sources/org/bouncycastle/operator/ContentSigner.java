package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface ContentSigner {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    java.io.OutputStream getOutputStream();

    byte[] getSignature();
}
