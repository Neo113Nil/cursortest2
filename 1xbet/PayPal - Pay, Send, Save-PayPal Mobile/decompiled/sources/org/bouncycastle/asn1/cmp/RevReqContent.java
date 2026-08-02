package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class RevReqContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.cmp.RevDetails[] toRevDetailsArray() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.cmp.RevDetails[] revDetailsArr = new org.bouncycastle.asn1.cmp.RevDetails[size];
        for (int i = 0; i != size; i++) {
            revDetailsArr[i] = org.bouncycastle.asn1.cmp.RevDetails.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return revDetailsArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.RevReqContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.RevReqContent) {
            return (org.bouncycastle.asn1.cmp.RevReqContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.RevReqContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RevReqContent(org.bouncycastle.asn1.cmp.RevDetails[] revDetailsArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(revDetailsArr);
    }

    public RevReqContent(org.bouncycastle.asn1.cmp.RevDetails revDetails) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(revDetails);
    }

    private RevReqContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }
}
