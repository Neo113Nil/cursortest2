package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class Attributes extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cms.Attribute[] getAttributes() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        org.bouncycastle.asn1.cms.Attribute[] attributeArr = new org.bouncycastle.asn1.cms.Attribute[size];
        for (int i = 0; i != size; i++) {
            attributeArr[i] = org.bouncycastle.asn1.cms.Attribute.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return attributeArr;
    }

    public static org.bouncycastle.asn1.cms.Attributes getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.Attributes getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.Attributes) {
            return (org.bouncycastle.asn1.cms.Attributes) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.Attributes(org.bouncycastle.asn1.ASN1Set.getInstance(obj));
        }
        return null;
    }

    private Attributes(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoFpsRanges = aSN1Set;
    }

    public Attributes(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DLSet(aSN1EncodableVector);
    }
}
