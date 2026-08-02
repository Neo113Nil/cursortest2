package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class PEMKeyPair {
    private final org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.pkcs.PrivateKeyInfo getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getPublicKeyInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.pkcs.PrivateKeyInfo getPrivateKeyInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public PEMKeyPair(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) {
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
        this.getHighSpeedVideoFpsRangesFor = privateKeyInfo;
    }
}
