package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class Attribute extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable[] getAttributeValues() {
        return this.getHighSpeedVideoFpsRangesFor.toArray();
    }

    public org.bouncycastle.asn1.ASN1Set getAttrValues() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAttrType() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.pkcs.Attribute getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.pkcs.Attribute)) {
            return (org.bouncycastle.asn1.pkcs.Attribute) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.pkcs.Attribute((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public Attribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Set) aSN1Sequence.getObjectAt(1);
    }

    public Attribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Set;
    }
}
