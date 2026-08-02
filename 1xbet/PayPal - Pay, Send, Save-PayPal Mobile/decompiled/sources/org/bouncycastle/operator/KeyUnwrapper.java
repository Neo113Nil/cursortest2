package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface KeyUnwrapper {
    org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException;

    org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();
}
