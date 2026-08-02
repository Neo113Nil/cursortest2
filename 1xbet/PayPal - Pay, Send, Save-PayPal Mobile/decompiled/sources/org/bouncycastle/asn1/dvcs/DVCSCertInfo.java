package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSCertInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.DigestInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.dvcs.DVCSRequestInformation getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.x509.PolicyInformation getInputFormats;
    private int getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private org.bouncycastle.asn1.dvcs.DVCSTime getOutputMinFrameDuration;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DVCSCertInfo {\n");
        if (this.getInputSizeshNQ4ISI != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("version: ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("dvReqInfo: ");
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("messageImprint: ");
        sb3.append(this.Camera2StreamConfigurationMap);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("serialNumber: ");
        sb4.append(this.getOutputFormats);
        sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("responseTime: ");
        sb5.append(this.getOutputMinFrameDuration);
        sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb5.toString());
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dvStatus: ");
            sb6.append(this.getHighSpeedVideoFpsRanges);
            sb6.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb6.toString());
        }
        if (this.getInputFormats != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("policy: ");
            sb7.append(this.getInputFormats);
            sb7.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb7.toString());
        }
        if (this.getHighSpeedVideoSizesFor != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reqSignature: ");
            sb8.append(this.getHighSpeedVideoSizesFor);
            sb8.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb8.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("certs: ");
            sb9.append(this.getHighSpeedVideoFpsRangesFor);
            sb9.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb9.toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("extensions: ");
            sb10.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb10.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb10.toString());
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        if (this.getInputSizeshNQ4ISI != 1) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getInputSizeshNQ4ISI));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo = this.getHighSpeedVideoFpsRanges;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) pKIStatusInfo));
        }
        org.bouncycastle.asn1.x509.PolicyInformation policyInformation = this.getInputFormats;
        if (policyInformation != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) policyInformation));
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoSizesFor;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.dvcs.DVCSTime getResponseTime() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Set getReqSignature() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.PolicyInformation getPolicy() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.x509.DigestInfo getMessageImprint() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getDvStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.dvcs.DVCSRequestInformation getDvReqInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.dvcs.TargetEtcChain[] getCerts() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            return org.bouncycastle.asn1.dvcs.TargetEtcChain.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSCertInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.DVCSCertInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.DVCSCertInfo) {
            return (org.bouncycastle.asn1.dvcs.DVCSCertInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.DVCSCertInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DVCSCertInfo(org.bouncycastle.asn1.dvcs.DVCSRequestInformation dVCSRequestInformation, org.bouncycastle.asn1.x509.DigestInfo digestInfo, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime) {
        this.getInputSizeshNQ4ISI = 1;
        this.getHighSpeedVideoSizes = dVCSRequestInformation;
        this.Camera2StreamConfigurationMap = digestInfo;
        this.getOutputFormats = aSN1Integer;
        this.getOutputMinFrameDuration = dVCSTime;
    }

    private DVCSCertInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        this.getInputSizeshNQ4ISI = 1;
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        try {
            this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(objectAt).intValueExact();
            try {
                objectAt = aSN1Sequence.getObjectAt(1);
            } catch (java.lang.IllegalArgumentException unused) {
            }
            i = 2;
        } catch (java.lang.IllegalArgumentException unused2) {
            i = 1;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.dvcs.DVCSRequestInformation.getInstance(objectAt);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.DigestInfo.getInstance(aSN1Sequence.getObjectAt(i));
        this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.dvcs.DVCSTime.getInstance(aSN1Sequence.getObjectAt(i + 2));
        for (int i2 = i + 3; i2 < aSN1Sequence.size(); i2++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i2);
            if (objectAt2 instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objectAt2);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    this.getInputFormats = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
                } else if (tagNo == 2) {
                    this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 3) {
                        throw new java.lang.IllegalArgumentException("Unknown tag encountered: ".concat(java.lang.String.valueOf(tagNo)));
                    }
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false);
                }
            } else {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance(objectAt2);
                } catch (java.lang.IllegalArgumentException unused3) {
                }
            }
        }
    }
}
