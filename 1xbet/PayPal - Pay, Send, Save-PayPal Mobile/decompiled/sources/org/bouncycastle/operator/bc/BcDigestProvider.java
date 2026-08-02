package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public interface BcDigestProvider {
    org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException;
}
