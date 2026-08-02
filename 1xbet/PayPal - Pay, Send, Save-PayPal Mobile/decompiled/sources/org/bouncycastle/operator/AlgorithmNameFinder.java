package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface AlgorithmNameFinder {
    java.lang.String getAlgorithmName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    java.lang.String getAlgorithmName(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier);

    boolean hasAlgorithmName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);
}
