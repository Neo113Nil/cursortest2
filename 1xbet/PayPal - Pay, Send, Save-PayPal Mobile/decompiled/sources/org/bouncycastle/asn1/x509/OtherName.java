package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class OtherName extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, this.getHighSpeedVideoFpsRanges));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getTypeID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.OtherName getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.OtherName) {
            return (org.bouncycastle.asn1.x509.OtherName) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.OtherName(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private OtherName(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject();
    }

    public OtherName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
