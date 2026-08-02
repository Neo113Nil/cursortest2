package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDocumentDetectionMetadata {
    private com.daon.dmds.models.DMDSQuadrangle getHighSpeedVideoFpsRangesFor;

    public DMDSDocumentDetectionMetadata(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getHighSpeedVideoFpsRangesFor = dMDSQuadrangle;
    }

    public com.daon.dmds.models.DMDSQuadrangle getDetectionLocation() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDetectionLocation(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getHighSpeedVideoFpsRangesFor = dMDSQuadrangle;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSDocumentDetectionMetadata{detectionLocation=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public DMDSDocumentDetectionMetadata() {
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
