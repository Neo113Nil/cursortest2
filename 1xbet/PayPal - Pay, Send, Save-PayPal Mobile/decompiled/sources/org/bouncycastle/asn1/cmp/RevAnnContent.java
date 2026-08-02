package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class RevAnnContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cmp.PKIStatus Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.crmf.CertId getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getWillBeRevokedAt() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cmp.PKIStatus getStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Extensions getCrlDetails() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.crmf.CertId getCertId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getBadSinceDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.RevAnnContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.RevAnnContent) {
            return (org.bouncycastle.asn1.cmp.RevAnnContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.RevAnnContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private RevAnnContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIStatus.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.crmf.CertId.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        if (aSN1Sequence.size() > 4) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1Sequence.getObjectAt(4));
        }
    }
}
