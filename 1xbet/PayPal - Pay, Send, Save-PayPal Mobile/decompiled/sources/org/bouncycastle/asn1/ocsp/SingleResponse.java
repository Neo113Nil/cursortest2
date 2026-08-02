package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class SingleResponse extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ocsp.CertStatus Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ocsp.CertID getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getThisUpdate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Extensions getSingleExtensions() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getNextUpdate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ocsp.CertStatus getCertStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ocsp.CertID getCertID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.SingleResponse getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.SingleResponse getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.SingleResponse) {
            return (org.bouncycastle.asn1.ocsp.SingleResponse) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.SingleResponse(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SingleResponse(org.bouncycastle.asn1.ocsp.CertID certID, org.bouncycastle.asn1.ocsp.CertStatus certStatus, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime2, org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this(certID, certStatus, aSN1GeneralizedTime, aSN1GeneralizedTime2, org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public SingleResponse(org.bouncycastle.asn1.ocsp.CertID certID, org.bouncycastle.asn1.ocsp.CertStatus certStatus, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime2, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighResolutionOutputSizeshNQ4ISI = certID;
        this.Camera2StreamConfigurationMap = certStatus;
        this.getHighSpeedVideoFpsRanges = aSN1GeneralizedTime;
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime2;
        this.getHighSpeedVideoSizes = extensions;
    }

    private SingleResponse(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ocsp.CertID.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ocsp.CertStatus.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() > 4) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(3), true);
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(4), true);
        } else if (aSN1Sequence.size() > 3) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(3);
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
            } else {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
