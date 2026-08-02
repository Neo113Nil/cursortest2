package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class OtherKeyAttribute extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getKeyAttrId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Encodable getKeyAttr() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.OtherKeyAttribute getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.OtherKeyAttribute) {
            return (org.bouncycastle.asn1.cms.OtherKeyAttribute) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.OtherKeyAttribute(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private OtherKeyAttribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoSizes = aSN1Sequence.getObjectAt(1);
    }

    public OtherKeyAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
