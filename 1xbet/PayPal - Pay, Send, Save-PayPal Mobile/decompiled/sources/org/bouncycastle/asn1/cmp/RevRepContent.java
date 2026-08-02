package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class RevRepContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = this.getHighSpeedVideoSizes;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo[] getStatus() {
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        org.bouncycastle.asn1.cmp.PKIStatusInfo[] pKIStatusInfoArr = new org.bouncycastle.asn1.cmp.PKIStatusInfo[size];
        for (int i = 0; i != size; i++) {
            pKIStatusInfoArr[i] = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return pKIStatusInfoArr;
    }

    public org.bouncycastle.asn1.crmf.CertId[] getRevCerts() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.crmf.CertId[] certIdArr = new org.bouncycastle.asn1.crmf.CertId[size];
        for (int i = 0; i != size; i++) {
            certIdArr[i] = org.bouncycastle.asn1.crmf.CertId.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return certIdArr;
    }

    public org.bouncycastle.asn1.x509.CertificateList[] getCrls() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoSizes;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.CertificateList[] certificateListArr = new org.bouncycastle.asn1.x509.CertificateList[size];
        for (int i = 0; i != size; i++) {
            certificateListArr[i] = org.bouncycastle.asn1.x509.CertificateList.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return certificateListArr;
    }

    public static org.bouncycastle.asn1.cmp.RevRepContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.RevRepContent) {
            return (org.bouncycastle.asn1.cmp.RevRepContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.RevRepContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private RevRepContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true);
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRanges = aSN1Sequence2;
            } else {
                this.getHighSpeedVideoSizes = aSN1Sequence2;
            }
        }
    }
}
