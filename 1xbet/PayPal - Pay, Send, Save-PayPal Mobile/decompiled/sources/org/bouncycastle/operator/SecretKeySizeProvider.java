package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public interface SecretKeySizeProvider {
    int getKeySize(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    int getKeySize(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier);
}
