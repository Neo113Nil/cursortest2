package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface DigestCalculator {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    byte[] getDigest();

    java.io.OutputStream getOutputStream();
}
