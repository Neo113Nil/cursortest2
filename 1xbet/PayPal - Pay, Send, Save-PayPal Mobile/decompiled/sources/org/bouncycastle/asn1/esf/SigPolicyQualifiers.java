package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SigPolicyQualifiers extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int size() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    public org.bouncycastle.asn1.esf.SigPolicyQualifierInfo getInfoAt(int i) {
        return org.bouncycastle.asn1.esf.SigPolicyQualifierInfo.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
    }

    public static org.bouncycastle.asn1.esf.SigPolicyQualifiers getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SigPolicyQualifiers) {
            return (org.bouncycastle.asn1.esf.SigPolicyQualifiers) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.esf.SigPolicyQualifiers(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SigPolicyQualifiers(org.bouncycastle.asn1.esf.SigPolicyQualifierInfo[] sigPolicyQualifierInfoArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(sigPolicyQualifierInfoArr);
    }

    private SigPolicyQualifiers(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }
}
