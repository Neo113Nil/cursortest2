package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertReqMessages extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.crmf.CertReqMsg[] toCertReqMsgArray() {
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        org.bouncycastle.asn1.crmf.CertReqMsg[] certReqMsgArr = new org.bouncycastle.asn1.crmf.CertReqMsg[size];
        for (int i = 0; i != size; i++) {
            certReqMsgArr[i] = org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return certReqMsgArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.crmf.CertReqMessages getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.CertReqMessages) {
            return (org.bouncycastle.asn1.crmf.CertReqMessages) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.CertReqMessages(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertReqMessages(org.bouncycastle.asn1.crmf.CertReqMsg[] certReqMsgArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(certReqMsgArr);
    }

    public CertReqMessages(org.bouncycastle.asn1.crmf.CertReqMsg certReqMsg) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(certReqMsg);
    }

    private CertReqMessages(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }
}
