package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface DigestCalculatorProvider {
    org.bouncycastle.operator.DigestCalculator get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException;
}
