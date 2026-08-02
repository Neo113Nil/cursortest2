package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public interface PKCS12MacCalculatorBuilder {
    org.bouncycastle.operator.MacCalculator build(char[] cArr) throws org.bouncycastle.operator.OperatorCreationException;

    org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier();
}
