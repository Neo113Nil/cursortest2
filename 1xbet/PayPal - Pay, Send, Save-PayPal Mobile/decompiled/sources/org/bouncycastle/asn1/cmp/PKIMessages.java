package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIMessages extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.PKIMessage[] toPKIMessageArray() {
        int size = this.getHighSpeedVideoSizes.size();
        org.bouncycastle.asn1.cmp.PKIMessage[] pKIMessageArr = new org.bouncycastle.asn1.cmp.PKIMessage[size];
        for (int i = 0; i != size; i++) {
            pKIMessageArr[i] = org.bouncycastle.asn1.cmp.PKIMessage.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return pKIMessageArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.PKIMessages getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIMessages) {
            return (org.bouncycastle.asn1.cmp.PKIMessages) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIMessages(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIMessages(org.bouncycastle.asn1.cmp.PKIMessage[] pKIMessageArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(pKIMessageArr);
    }

    public PKIMessages(org.bouncycastle.asn1.cmp.PKIMessage pKIMessage) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(pKIMessage);
    }

    private PKIMessages(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }
}
