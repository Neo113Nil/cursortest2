package com.microblink.blinkid.metadata;

/* loaded from: classes.dex */
public final class MetadataCallbacks {
    private com.microblink.blinkid.metadata.glare.GlareCallback Camera2StreamConfigurationMap;
    private com.microblink.blinkid.metadata.detection.FailedDetectionCallback getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.metadata.text.DebugTextCallback getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback getHighSpeedVideoSizes;
    private com.microblink.blinkid.metadata.image.DebugImageCallback getHighSpeedVideoSizesFor;
    private com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback getOutputFormats;
    private com.microblink.blinkid.metadata.ocr.OcrCallback getOutputMinFrameDuration;

    public final com.microblink.blinkid.metadata.image.DebugImageCallback getDebugImageCallback() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.microblink.blinkid.metadata.text.DebugTextCallback getDebugTextCallback() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final com.microblink.blinkid.metadata.detection.FailedDetectionCallback getFailedDetectionCallback() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback getFirstSideRecognitionCallback() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.microblink.blinkid.metadata.glare.GlareCallback getGlareCallback() {
        return this.Camera2StreamConfigurationMap;
    }

    public final com.microblink.blinkid.metadata.ocr.OcrCallback getOcrCallback() {
        return this.getOutputMinFrameDuration;
    }

    public final com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback getPointsDetectionCallback() {
        return this.getOutputFormats;
    }

    public final com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback getQuadDetectionCallback() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setDebugImageCallback(com.microblink.blinkid.metadata.image.DebugImageCallback debugImageCallback) {
        this.getHighSpeedVideoSizesFor = debugImageCallback;
    }

    public final void setDebugTextCallback(com.microblink.blinkid.metadata.text.DebugTextCallback debugTextCallback) {
        this.getHighSpeedVideoFpsRanges = debugTextCallback;
    }

    public final void setFailedDetectionCallback(com.microblink.blinkid.metadata.detection.FailedDetectionCallback failedDetectionCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = failedDetectionCallback;
    }

    public final void setFirstSideRecognitionCallback(com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback firstSideRecognitionCallback) {
        this.getHighSpeedVideoFpsRangesFor = firstSideRecognitionCallback;
    }

    public final void setGlareCallback(com.microblink.blinkid.metadata.glare.GlareCallback glareCallback) {
        this.Camera2StreamConfigurationMap = glareCallback;
    }

    public final void setOcrCallback(com.microblink.blinkid.metadata.ocr.OcrCallback ocrCallback) {
        this.getOutputMinFrameDuration = ocrCallback;
    }

    public final void setPointsDetectionCallback(com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback pointsDetectionCallback) {
        this.getOutputFormats = pointsDetectionCallback;
    }

    public final void setQuadDetectionCallback(com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback quadDetectionCallback) {
        this.getHighSpeedVideoSizes = quadDetectionCallback;
    }
}
