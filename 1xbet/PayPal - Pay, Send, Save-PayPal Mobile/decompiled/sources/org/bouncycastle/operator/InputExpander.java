package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface InputExpander {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    java.io.InputStream getInputStream(java.io.InputStream inputStream);
}
