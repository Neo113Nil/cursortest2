package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSCertInfoBuilder {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.DigestInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.dvcs.DVCSRequestInformation getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor = 1;
    private org.bouncycastle.asn1.dvcs.DVCSTime getInputFormats;
    private org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private org.bouncycastle.asn1.x509.PolicyInformation getOutputMinFrameDuration;

    public void setVersion(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    public void setSerialNumber(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getOutputFormats = aSN1Integer;
    }

    public void setResponseTime(org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime) {
        this.getInputFormats = dVCSTime;
    }

    public void setReqSignature(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getInputSizeshNQ4ISI = aSN1Set;
    }

    public void setPolicy(org.bouncycastle.asn1.x509.PolicyInformation policyInformation) {
        this.getOutputMinFrameDuration = policyInformation;
    }

    public void setMessageImprint(org.bouncycastle.asn1.x509.DigestInfo digestInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = digestInfo;
    }

    public void setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRangesFor = extensions;
    }

    public void setDvStatus(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this.getHighSpeedVideoFpsRanges = pKIStatusInfo;
    }

    public void setDvReqInfo(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation) {
        this.getHighSpeedVideoSizes = dVCSRequestInformation;
    }

    public void setCerts(org.bouncycastle.asn1.dvcs.TargetEtcChain[] targetEtcChainArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(targetEtcChainArr);
    }

    public org.bouncycastle.asn1.dvcs.DVCSCertInfo build() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        if (this.getHighSpeedVideoSizesFor != 1) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getInputFormats);
        org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo = this.getHighSpeedVideoFpsRanges;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) pKIStatusInfo));
        }
        org.bouncycastle.asn1.x509.PolicyInformation policyInformation = this.getOutputMinFrameDuration;
        if (policyInformation != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) policyInformation));
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getInputSizeshNQ4ISI;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRangesFor;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return org.bouncycastle.asn1.dvcs.DVCSCertInfo.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public DVCSCertInfoBuilder(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation, org.bouncycastle.asn1.x509.DigestInfo digestInfo, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime) {
        this.getHighSpeedVideoSizes = dVCSRequestInformation;
        this.getHighResolutionOutputSizeshNQ4ISI = digestInfo;
        this.getOutputFormats = aSN1Integer;
        this.getInputFormats = dVCSTime;
    }
}
