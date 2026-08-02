package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface CMSSignatureEncryptionAlgorithmFinder {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier findEncryptionAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier);
}
