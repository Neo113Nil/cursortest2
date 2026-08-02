package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CAKeyUpdAnnContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cmp.CMPCertificate getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.CMPCertificate getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cmp.CMPCertificate getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate getOldWithNew() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate getNewWithOld() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate getNewWithNew() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.CAKeyUpdAnnContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CAKeyUpdAnnContent) {
            return (org.bouncycastle.asn1.cmp.CAKeyUpdAnnContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CAKeyUpdAnnContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CAKeyUpdAnnContent(org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate, org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate2, org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate3) {
        this.getHighResolutionOutputSizeshNQ4ISI = cMPCertificate;
        this.getHighSpeedVideoFpsRanges = cMPCertificate2;
        this.getHighSpeedVideoSizes = cMPCertificate3;
    }

    private CAKeyUpdAnnContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
