package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class TimeStampTokenEvidence extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cms.TimeStampAndCRL[] getHighSpeedVideoSizes;

    public TimeStampTokenEvidence(org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr) {
        int length = timeStampAndCRLArr.length;
        org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr2 = new org.bouncycastle.asn1.cms.TimeStampAndCRL[length];
        java.lang.System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, length);
        this.getHighSpeedVideoSizes = timeStampAndCRLArr2;
    }

    public org.bouncycastle.asn1.cms.TimeStampAndCRL[] toTimeStampAndCRLArray() {
        org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoSizes;
        int length = timeStampAndCRLArr.length;
        org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr2 = new org.bouncycastle.asn1.cms.TimeStampAndCRL[length];
        java.lang.System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, length);
        return timeStampAndCRLArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighSpeedVideoSizes.length);
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoSizes;
            if (i == timeStampAndCRLArr.length) {
                return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
            }
            aSN1EncodableVector.add(timeStampAndCRLArr[i]);
            i++;
        }
    }

    public static org.bouncycastle.asn1.cms.TimeStampTokenEvidence getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.TimeStampTokenEvidence getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.TimeStampTokenEvidence) {
            return (org.bouncycastle.asn1.cms.TimeStampTokenEvidence) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.TimeStampTokenEvidence(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TimeStampTokenEvidence(org.bouncycastle.asn1.cms.TimeStampAndCRL timeStampAndCRL) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cms.TimeStampAndCRL[]{timeStampAndCRL};
    }

    private TimeStampTokenEvidence(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cms.TimeStampAndCRL[aSN1Sequence.size()];
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            this.getHighSpeedVideoSizes[i] = org.bouncycastle.asn1.cms.TimeStampAndCRL.getInstance(objects.nextElement());
            i++;
        }
    }
}
