package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface MacCalculatorProvider {
    org.bouncycastle.operator.MacCalculator get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier);
}
