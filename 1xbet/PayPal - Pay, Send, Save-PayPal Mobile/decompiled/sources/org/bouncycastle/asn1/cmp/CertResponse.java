package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertResponse extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cmp.CertifiedKeyPair getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.cmp.CertifiedKeyPair certifiedKeyPair = this.getHighSpeedVideoSizes;
        if (certifiedKeyPair != null) {
            aSN1EncodableVector.add(certifiedKeyPair);
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.Camera2StreamConfigurationMap;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmp.CertifiedKeyPair getCertifiedKeyPair() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Integer getCertReqId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmp.CertResponse getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertResponse) {
            return (org.bouncycastle.asn1.cmp.CertResponse) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CertResponse(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertResponse(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() >= 3) {
            if (aSN1Sequence.size() != 3) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.CertifiedKeyPair.getInstance(aSN1Sequence.getObjectAt(2));
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3));
                return;
            }
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(2);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1OctetString) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(objectAt);
            } else {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.CertifiedKeyPair.getInstance(objectAt);
            }
        }
    }

    public CertResponse(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo, org.bouncycastle.asn1.cmp.CertifiedKeyPair certifiedKeyPair, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        if (aSN1Integer == null) {
            throw new java.lang.IllegalArgumentException("'certReqId' cannot be null");
        }
        if (pKIStatusInfo == null) {
            throw new java.lang.IllegalArgumentException("'status' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        this.getHighResolutionOutputSizeshNQ4ISI = pKIStatusInfo;
        this.getHighSpeedVideoSizes = certifiedKeyPair;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
    }

    public CertResponse(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this(aSN1Integer, pKIStatusInfo, null, null);
    }
}
