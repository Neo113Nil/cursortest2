package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface DigestAlgorithmIdentifierFinder {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier find(java.lang.String str);

    org.bouncycastle.asn1.x509.AlgorithmIdentifier find(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    org.bouncycastle.asn1.x509.AlgorithmIdentifier find(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier);
}
