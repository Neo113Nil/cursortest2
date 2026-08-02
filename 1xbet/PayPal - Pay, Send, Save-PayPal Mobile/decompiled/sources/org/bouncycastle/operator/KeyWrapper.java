package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface KeyWrapper {
    byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException;

    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();
}
