package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface MacCalculator {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();

    org.bouncycastle.operator.GenericKey getKey();

    byte[] getMac();

    java.io.OutputStream getOutputStream();
}
