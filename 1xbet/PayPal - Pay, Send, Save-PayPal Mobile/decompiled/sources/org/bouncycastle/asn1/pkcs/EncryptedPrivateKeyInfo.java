package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class EncryptedPrivateKeyInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getEncryptedData() {
        return this.getHighSpeedVideoFpsRangesFor.getOctets();
    }

    public static org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo) {
            return (org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedPrivateKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    private EncryptedPrivateKeyInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement());
    }
}
