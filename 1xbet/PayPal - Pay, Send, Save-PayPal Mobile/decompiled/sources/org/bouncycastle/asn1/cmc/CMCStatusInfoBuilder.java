package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCStatusInfoBuilder {
    private org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.CMCStatus getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmc.CMCStatusInfoBuilder setStatusString(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERUTF8String(str);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoBuilder setOtherInfo(org.bouncycastle.asn1.cmc.PendInfo pendInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo(pendInfo);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfoBuilder setOtherInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.cmc.CMCStatusInfo.OtherInfo(cMCFailInfo);
        return this;
    }

    public org.bouncycastle.asn1.cmc.CMCStatusInfo build() {
        return new org.bouncycastle.asn1.cmc.CMCStatusInfo(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public CMCStatusInfoBuilder(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.cmc.BodyPartID[] bodyPartIDArr) {
        this.getHighSpeedVideoFpsRangesFor = cMCStatus;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(bodyPartIDArr);
    }

    public CMCStatusInfoBuilder(org.bouncycastle.asn1.cmc.CMCStatus cMCStatus, org.bouncycastle.asn1.cmc.BodyPartID bodyPartID) {
        this.getHighSpeedVideoFpsRangesFor = cMCStatus;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(bodyPartID);
    }
}
