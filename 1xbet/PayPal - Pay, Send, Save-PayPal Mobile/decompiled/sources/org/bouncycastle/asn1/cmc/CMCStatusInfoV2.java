package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCStatusInfoV2 extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cmc.CMCStatus Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.cmc.OtherStatusInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        if (aSN1UTF8String != null) {
            aSN1EncodableVector.add(aSN1UTF8String);
        }
        org.bouncycastle.asn1.cmc.OtherStatusInfo otherStatusInfo = this.getHighResolutionOutputSizeshNQ4ISI;
        if (otherStatusInfo != null) {
            aSN1EncodableVector.add(otherStatusInfo);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean hasOtherInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public org.bouncycastle.asn1.cmc.CMCStatus getcMCStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1UTF8String getStatusStringUTF8() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.DERUTF8String getStatusString() {
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        return (aSN1UTF8String == null || (aSN1UTF8String instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) aSN1UTF8String : new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges.getString());
    }

    public org.bouncycastle.asn1.cmc.OtherStatusInfo getOtherStatusInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID[] getBodyList() {
        return org.bouncycastle.asn1.cmc.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.cmc.CMCStatusInfoV2 getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCStatusInfoV2) {
            return (org.bouncycastle.asn1.cmc.CMCStatusInfoV2) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.CMCStatusInfoV2(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    CMCStatusInfoV2(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String, org.bouncycastle.asn1.cmc.OtherStatusInfo otherStatusInfo) {
        this.Camera2StreamConfigurationMap = cMCStatus;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
        this.getHighResolutionOutputSizeshNQ4ISI = otherStatusInfo;
    }

    private CMCStatusInfoV2(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 4) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmc.CMCStatus.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() <= 2) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else if (aSN1Sequence.size() == 4) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.OtherStatusInfo.getInstance(aSN1Sequence.getObjectAt(3));
        } else if (aSN1Sequence.getObjectAt(2) instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cmc.OtherStatusInfo.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }
}
