package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public class AttributeTypeAndValue extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getType() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x500.AttributeTypeAndValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x500.AttributeTypeAndValue) {
            return (org.bouncycastle.asn1.x500.AttributeTypeAndValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x500.AttributeTypeAndValue(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        throw new java.lang.IllegalArgumentException("null value in getInstance()");
    }

    private AttributeTypeAndValue(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = aSN1Sequence.getObjectAt(1);
    }

    public AttributeTypeAndValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
