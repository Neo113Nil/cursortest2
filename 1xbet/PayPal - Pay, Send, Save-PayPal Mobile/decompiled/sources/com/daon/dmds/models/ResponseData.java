package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class ResponseData {
    private com.microblink.blinkid.hardware.orientation.Orientation getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSResult getHighSpeedVideoFpsRangesFor;

    public ResponseData(com.daon.dmds.models.DMDSResult dMDSResult, com.microblink.blinkid.image.Image image) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT;
        this.getHighSpeedVideoFpsRangesFor = dMDSResult;
        if (image != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = image.getImageOrientation();
        }
    }

    public com.microblink.blinkid.hardware.orientation.Orientation getImageOrientation() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.daon.dmds.models.DMDSResult getResult() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setImageOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.getHighResolutionOutputSizeshNQ4ISI = orientation;
    }

    public void setResult(com.daon.dmds.models.DMDSResult dMDSResult) {
        this.getHighSpeedVideoFpsRangesFor = dMDSResult;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseData{result=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", imageOrientation=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.name());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
