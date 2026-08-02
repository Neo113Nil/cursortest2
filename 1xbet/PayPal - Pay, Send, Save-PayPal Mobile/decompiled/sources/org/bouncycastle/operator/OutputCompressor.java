package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface OutputCompressor {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    java.io.OutputStream getOutputStream(java.io.OutputStream outputStream);
}
