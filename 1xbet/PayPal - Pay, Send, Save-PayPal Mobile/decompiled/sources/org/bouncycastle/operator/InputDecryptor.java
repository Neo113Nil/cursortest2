package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface InputDecryptor {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    java.io.InputStream getInputStream(java.io.InputStream inputStream);
}
