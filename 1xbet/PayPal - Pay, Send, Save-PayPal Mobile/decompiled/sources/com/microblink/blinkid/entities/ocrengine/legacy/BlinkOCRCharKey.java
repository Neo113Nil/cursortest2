package com.microblink.blinkid.entities.ocrengine.legacy;

/* loaded from: classes9.dex */
public class BlinkOCRCharKey {
    private final com.microblink.blinkid.results.ocr.OcrFont getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public BlinkOCRCharKey(int i, com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = ocrFont;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCRCharKey blinkOCRCharKey = (com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCRCharKey) obj;
        return this.getHighSpeedVideoFpsRangesFor == blinkOCRCharKey.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == blinkOCRCharKey.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.results.ocr.OcrFont getFont() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int hashCode() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(i), this.getHighSpeedVideoFpsRanges});
    }
}
