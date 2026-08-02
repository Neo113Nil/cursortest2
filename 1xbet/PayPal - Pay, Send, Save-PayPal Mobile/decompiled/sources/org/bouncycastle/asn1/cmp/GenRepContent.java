package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class GenRepContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.InfoTypeAndValue[] toInfoTypeAndValueArray() {
        int size = this.getHighSpeedVideoSizes.size();
        org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr = new org.bouncycastle.asn1.cmp.InfoTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            infoTypeAndValueArr[i] = org.bouncycastle.asn1.cmp.InfoTypeAndValue.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return infoTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.GenRepContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.GenRepContent) {
            return (org.bouncycastle.asn1.cmp.GenRepContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.GenRepContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GenRepContent(org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(infoTypeAndValueArr);
    }

    public GenRepContent(org.bouncycastle.asn1.cmp.InfoTypeAndValue infoTypeAndValue) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(infoTypeAndValue);
    }

    private GenRepContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }
}
