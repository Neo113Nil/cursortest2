package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public interface ValueDecryptorGenerator {
    org.bouncycastle.operator.InputDecryptor getValueDecryptor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cert.crmf.CRMFException;
}
