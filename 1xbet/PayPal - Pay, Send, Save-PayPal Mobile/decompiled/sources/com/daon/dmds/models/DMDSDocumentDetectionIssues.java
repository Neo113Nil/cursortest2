package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSDocumentDetectionIssues {
    private boolean Camera2StreamConfigurationMap = true;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean getHighSpeedVideoSizes = false;
    private boolean getHighSpeedVideoFpsRanges = false;
    private boolean getOutputMinFrameDuration = false;
    private boolean getHighSpeedVideoSizesFor = false;
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private boolean getOutputFormats = false;

    public boolean isBlurDetected() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isDocumentFillsScanningArea() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isDocumentTilted() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isDocumentTooCloseToCamera() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isDocumentTooCloseToEdge() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isFaceNotFound() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isGlareDetected() {
        return this.getHighSpeedVideoSizesFor;
    }

    public boolean isWrongSideDetected() {
        return this.getOutputFormats;
    }

    public void setBlurDetected(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setDocumentFillsScanningArea(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public void setDocumentTilted(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setDocumentTooCloseToCamera(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setDocumentTooCloseToEdge(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void setFaceNotFound(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public void setGlareDetected(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    public void setWrongSideDetected(boolean z) {
        this.getOutputFormats = z;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSDocumentDetectionMetadata{documentFillsScanningArea=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", isDocumentTilted=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", isDocumentTooCloseToEdge=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", isDocumentTooCloseToCamera=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", faceNotFound=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", isGlareDetected=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", isBlurDetected=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", isWrongSideDetected=");
        sb.append(this.getOutputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
