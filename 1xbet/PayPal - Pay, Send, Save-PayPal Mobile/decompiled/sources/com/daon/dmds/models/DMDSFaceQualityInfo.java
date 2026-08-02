package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSFaceQualityInfo {
    private final com.daon.dmds.models.DMDSDocumentDetectionStatus getHighSpeedVideoFpsRanges;
    private final com.daon.dmds.models.DMDSFaceResultQuality getHighSpeedVideoSizes;

    public DMDSFaceQualityInfo(com.daon.dmds.models.DMDSFaceResultQuality dMDSFaceResultQuality, com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus) {
        this.getHighSpeedVideoSizes = dMDSFaceResultQuality;
        this.getHighSpeedVideoFpsRanges = dMDSDocumentDetectionStatus;
    }

    public com.daon.dmds.models.DMDSDocumentDetectionStatus getAnalyzeStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.daon.dmds.models.DMDSFaceResultQuality getFaceResultQuality() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSFaceQualityInfo{faceResultQuality=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", analyzeStatus=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
