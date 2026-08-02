package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public interface PKMACValuesCalculator {
    byte[] calculateDigest(byte[] bArr) throws org.bouncycastle.cert.crmf.CRMFException;

    byte[] calculateMac(byte[] bArr, byte[] bArr2) throws org.bouncycastle.cert.crmf.CRMFException;

    void setup(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) throws org.bouncycastle.cert.crmf.CRMFException;
}
