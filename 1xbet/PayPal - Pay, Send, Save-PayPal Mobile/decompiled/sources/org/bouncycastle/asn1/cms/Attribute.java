package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class Attribute extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable[] getAttributeValues() {
        return this.getHighSpeedVideoFpsRanges.toArray();
    }

    public org.bouncycastle.asn1.ASN1Set getAttrValues() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAttrType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cms.Attribute getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.Attribute) {
            return (org.bouncycastle.asn1.cms.Attribute) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private Attribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Set) aSN1Sequence.getObjectAt(1);
    }

    public Attribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1Set;
    }
}
