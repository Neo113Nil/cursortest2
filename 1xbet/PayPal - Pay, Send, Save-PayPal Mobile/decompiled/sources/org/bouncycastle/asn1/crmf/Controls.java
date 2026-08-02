package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class Controls extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] toAttributeTypeAndValueArray() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] attributeTypeAndValueArr = new org.bouncycastle.asn1.crmf.AttributeTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            attributeTypeAndValueArr[i] = org.bouncycastle.asn1.crmf.AttributeTypeAndValue.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return attributeTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.crmf.Controls getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.Controls) {
            return (org.bouncycastle.asn1.crmf.Controls) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.Controls(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Controls(org.bouncycastle.asn1.crmf.AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(attributeTypeAndValueArr);
    }

    public Controls(org.bouncycastle.asn1.crmf.AttributeTypeAndValue attributeTypeAndValue) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(attributeTypeAndValue);
    }

    private Controls(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }
}
