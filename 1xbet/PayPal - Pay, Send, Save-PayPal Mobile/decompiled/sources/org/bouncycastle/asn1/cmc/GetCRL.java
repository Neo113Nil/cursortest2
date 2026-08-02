package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class GetCRL extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.ReasonFlags getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighSpeedVideoSizes;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        org.bouncycastle.asn1.x509.ReasonFlags reasonFlags = this.getHighSpeedVideoFpsRanges;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(reasonFlags);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.GeneralName getcRLName() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getTime() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.ReasonFlags getReasons() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuerName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmc.GetCRL getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.GetCRL) {
            return (org.bouncycastle.asn1.cmc.GetCRL) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.GetCRL(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GetCRL(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.x509.ReasonFlags reasonFlags) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
        this.getHighSpeedVideoSizes = generalName;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.getHighSpeedVideoFpsRanges = reasonFlags;
    }

    private GetCRL(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 4) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        int i = 1;
        if (aSN1Sequence.size() > 1 && (aSN1Sequence.getObjectAt(1).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
            i = 2;
        }
        if (aSN1Sequence.size() > i && (aSN1Sequence.getObjectAt(i).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1GeneralizedTime)) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        if (aSN1Sequence.size() <= i || !(aSN1Sequence.getObjectAt(i).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1BitString)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.ReasonFlags(org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i)));
    }
}
