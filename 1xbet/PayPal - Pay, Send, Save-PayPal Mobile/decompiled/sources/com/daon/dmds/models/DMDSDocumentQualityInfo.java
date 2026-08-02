package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDocumentQualityInfo {
    private com.daon.dmds.models.DMDSDocumentDetectionStatus Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSDocumentResultQuality getHighSpeedVideoFpsRanges;

    public DMDSDocumentQualityInfo(com.daon.dmds.models.DMDSDocumentResultQuality dMDSDocumentResultQuality, com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus) {
        this.getHighSpeedVideoFpsRanges = dMDSDocumentResultQuality;
        this.Camera2StreamConfigurationMap = dMDSDocumentDetectionStatus;
    }

    public com.daon.dmds.models.DMDSDocumentDetectionStatus getAnalyzeStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.daon.dmds.models.DMDSDocumentResultQuality getDocumentResultQuality() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setAnalyzeStatus(com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus) {
        this.Camera2StreamConfigurationMap = dMDSDocumentDetectionStatus;
    }

    public void setDocumentResultQuality(com.daon.dmds.models.DMDSDocumentResultQuality dMDSDocumentResultQuality) {
        this.getHighSpeedVideoFpsRanges = dMDSDocumentResultQuality;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSDocumentQualityInfo{documentResultQuality=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", analyzeStatus=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public DMDSDocumentQualityInfo() {
    }
}
