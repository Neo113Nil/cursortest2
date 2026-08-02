package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class GenMsgContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.cmp.InfoTypeAndValue[] toInfoTypeAndValueArray() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr = new org.bouncycastle.asn1.cmp.InfoTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            infoTypeAndValueArr[i] = org.bouncycastle.asn1.cmp.InfoTypeAndValue.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return infoTypeAndValueArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.GenMsgContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.GenMsgContent) {
            return (org.bouncycastle.asn1.cmp.GenMsgContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.GenMsgContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GenMsgContent(org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(infoTypeAndValueArr);
    }

    public GenMsgContent(org.bouncycastle.asn1.cmp.InfoTypeAndValue infoTypeAndValue) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(infoTypeAndValue);
    }

    private GenMsgContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }
}
