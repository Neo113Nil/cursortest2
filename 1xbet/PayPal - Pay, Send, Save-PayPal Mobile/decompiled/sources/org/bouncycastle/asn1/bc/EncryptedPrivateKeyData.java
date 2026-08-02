package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class EncryptedPrivateKeyData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.Certificate[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRanges));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getEncryptedPrivateKeyInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Certificate[] getCertificateChain() {
        org.bouncycastle.asn1.x509.Certificate[] certificateArr = this.getHighSpeedVideoFpsRanges;
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        java.lang.System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
        return certificateArr2;
    }

    public static org.bouncycastle.asn1.bc.EncryptedPrivateKeyData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.EncryptedPrivateKeyData) {
            return (org.bouncycastle.asn1.bc.EncryptedPrivateKeyData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.EncryptedPrivateKeyData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedPrivateKeyData(org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, org.bouncycastle.asn1.x509.Certificate[] certificateArr) {
        this.getHighSpeedVideoFpsRangesFor = encryptedPrivateKeyInfo;
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        this.getHighSpeedVideoFpsRanges = certificateArr2;
        java.lang.System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
    }

    private EncryptedPrivateKeyData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Certificate[aSN1Sequence2.size()];
        while (true) {
            org.bouncycastle.asn1.x509.Certificate[] certificateArr = this.getHighSpeedVideoFpsRanges;
            if (i == certificateArr.length) {
                return;
            }
            certificateArr[i] = org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Sequence2.getObjectAt(i));
            i++;
        }
    }
}
