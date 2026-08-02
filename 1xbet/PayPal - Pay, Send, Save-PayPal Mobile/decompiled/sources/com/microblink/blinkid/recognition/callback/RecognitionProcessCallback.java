package com.microblink.blinkid.recognition.callback;

/* loaded from: classes.dex */
public final class RecognitionProcessCallback extends com.microblink.blinkid.recognition.callback.BaseRecognitionProcessCallback {
    public RecognitionProcessCallback(com.microblink.blinkid.secured.lIllIlllIl lillilllil, com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode recognitionDebugMode) {
        super(lillilllil, rectangle, recognitionDebugMode);
        setMetadataCallbacks(metadataCallbacks);
    }

    private static native void nativeSetGlareCallback(long j, boolean z);

    private static native void nativeSetOcrCallback(long j, boolean z);

    public final void onFirstSideResult() {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getHighSpeedVideoFpsRangesFor;
        if (nativeRecognizerWrapper != null) {
            java.util.Timer timer = nativeRecognizerWrapper.IllIIIllII;
            if (timer != null) {
                timer.cancel();
            }
            nativeRecognizerWrapper.IlIllIlIIl = false;
            nativeRecognizerWrapper.IllIIIllII = null;
        }
        if (this.Camera2StreamConfigurationMap.getFirstSideRecognitionCallback() != null) {
            this.Camera2StreamConfigurationMap.getFirstSideRecognitionCallback().onFirstSideRecognitionFinished();
        }
    }

    public final void onGlare(boolean z) {
        this.Camera2StreamConfigurationMap.getGlareCallback().onGlare(z);
    }

    public final void onOcrResult(float[] fArr, java.lang.String str, long j) {
        this.Camera2StreamConfigurationMap.getOcrCallback().onOcrResult(new com.microblink.blinkid.metadata.ocr.DisplayableOcrResult(new com.microblink.blinkid.results.ocr.OcrResult(j, null), str, fArr));
    }

    @Override // com.microblink.blinkid.recognition.callback.BaseRecognitionProcessCallback
    public final void setMetadataCallbacks(com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        super.setMetadataCallbacks(metadataCallbacks);
        nativeSetOcrCallback(this.getHighSpeedVideoSizes, metadataCallbacks.getOcrCallback() != null);
        nativeSetGlareCallback(this.getHighSpeedVideoSizes, metadataCallbacks.getGlareCallback() != null);
    }
}
