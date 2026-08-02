package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface ContentVerifier {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    java.io.OutputStream getOutputStream();

    boolean verify(byte[] bArr);
}
