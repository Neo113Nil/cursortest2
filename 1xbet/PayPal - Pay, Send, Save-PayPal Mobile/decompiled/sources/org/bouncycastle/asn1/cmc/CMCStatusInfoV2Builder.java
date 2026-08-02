package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCStatusInfoV2Builder {
    private final org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cmc.OtherStatusInfo getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.CMCStatus getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmc.CMCStatusInfoV2Builder setStatusString(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERUTF8String(str);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoV2Builder setOtherInfo(org.bouncycastle.asn1.cmc.PendInfo pendInfo) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.cmc.OtherStatusInfo(pendInfo);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoV2Builder setOtherInfo(org.bouncycastle.asn1.cmc.ExtendedFailInfo extendedFailInfo) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.cmc.OtherStatusInfo(extendedFailInfo);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoV2Builder setOtherInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.cmc.OtherStatusInfo(cMCFailInfo);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoV2 build() {
        return new org.bouncycastle.asn1.cmc.CMCStatusInfoV2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    public CMCStatusInfoV2Builder(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr) {
        this.getHighSpeedVideoFpsRangesFor = cMCStatus;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(bodyPartIDArr);
    }

    public CMCStatusInfoV2Builder(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.cmc.BodyPartID bodyPartID) {
        this.getHighSpeedVideoFpsRangesFor = cMCStatus;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(bodyPartID);
    }
}
