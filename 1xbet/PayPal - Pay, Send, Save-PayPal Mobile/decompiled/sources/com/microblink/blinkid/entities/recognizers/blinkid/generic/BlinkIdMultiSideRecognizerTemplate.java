package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
class BlinkIdMultiSideRecognizerTemplate extends com.microblink.blinkid.secured.lIIllIIIll implements com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions {
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback getHighSpeedVideoFpsRanges;

    public static class Result {
        public java.lang.String toString() {
            return "Blink Id Multi Side Recognizer";
        }
    }

    private static native void barcodeScanningStartedCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback);

    private static native void classFilterNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassFilter nativeClassFilter);

    private static native void classifierCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeClassifierCallback nativeClassifierCallback);

    private static native void dewarpedImageCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeDewarpedImageCallback nativeDewarpedImageCallback);

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions
    public void setBarcodeScanningStartedCallback(com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback barcodeScanningStartedCallback) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback = this.getHighSpeedVideoFpsRanges;
        if (nativeBarcodeScanningStartedCallbackCallback != null) {
            nativeBarcodeScanningStartedCallbackCallback.getHighSpeedVideoFpsRanges = barcodeScanningStartedCallback;
            return;
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback nativeBarcodeScanningStartedCallbackCallback2 = new com.microblink.blinkid.entities.recognizers.blinkid.generic.NativeBarcodeScanningStartedCallbackCallback(barcodeScanningStartedCallback);
        this.getHighSpeedVideoFpsRanges = nativeBarcodeScanningStartedCallbackCallback2;
        barcodeScanningStartedCallbackNativeSet(0L, nativeBarcodeScanningStartedCallbackCallback2);
    }
}
