package com.microblink.blinkid.metadata.ocr;

/* loaded from: classes10.dex */
public final class DisplayableOcrResult extends com.microblink.blinkid.metadata.DisplayableObject {
    private final com.microblink.blinkid.results.ocr.OcrResult Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public DisplayableOcrResult(com.microblink.blinkid.results.ocr.OcrResult ocrResult, java.lang.String str, float[] fArr) {
        super(fArr);
        this.Camera2StreamConfigurationMap = ocrResult;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public final com.microblink.blinkid.results.ocr.OcrResult getOcrResult() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getResultName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
