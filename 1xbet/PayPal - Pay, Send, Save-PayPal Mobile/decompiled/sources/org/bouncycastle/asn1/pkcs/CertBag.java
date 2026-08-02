package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class CertBag extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getCertValue() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCertId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.pkcs.CertBag getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.CertBag) {
            return (org.bouncycastle.asn1.pkcs.CertBag) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.CertBag(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertBag(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject();
    }

    public CertBag(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
