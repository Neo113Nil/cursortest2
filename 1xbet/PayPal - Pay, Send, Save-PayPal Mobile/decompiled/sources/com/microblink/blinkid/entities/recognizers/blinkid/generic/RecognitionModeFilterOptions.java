package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class RecognitionModeFilterOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilterOptions";

    private static native boolean[] recognitionModeFilterNativeGet(long j);

    private static native void recognitionModeFilterNativeSet(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter getRecognitionModeFilter() {
        boolean[] recognitionModeFilterNativeGet = recognitionModeFilterNativeGet(0L);
        return recognitionModeFilterNativeGet.length == 6 ? new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(recognitionModeFilterNativeGet[0], recognitionModeFilterNativeGet[1], recognitionModeFilterNativeGet[2], recognitionModeFilterNativeGet[3], recognitionModeFilterNativeGet[4], recognitionModeFilterNativeGet[5]) : new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter();
    }

    public void setRecognitionModeFilter(com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter recognitionModeFilter) {
        recognitionModeFilterNativeSet(0L, recognitionModeFilter.enableMrzId, recognitionModeFilter.enableMrzVisa, recognitionModeFilter.enableMrzPassport, recognitionModeFilter.enablePhotoId, recognitionModeFilter.enableBarcodeId, recognitionModeFilter.enableFullDocumentRecognition);
    }
}
