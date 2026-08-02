package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface InputDecryptorProvider {
    org.bouncycastle.operator.InputDecryptor get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException;
}
