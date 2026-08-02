package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public final class NativeBarcodeScanningStartedCallbackCallback {
    com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback getHighSpeedVideoFpsRanges;

    public NativeBarcodeScanningStartedCallbackCallback(com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback barcodeScanningStartedCallback) {
        this.getHighSpeedVideoFpsRanges = barcodeScanningStartedCallback;
    }

    public final void onBarcodeScanningStarted() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback barcodeScanningStartedCallback = this.getHighSpeedVideoFpsRanges;
        if (barcodeScanningStartedCallback != null) {
            barcodeScanningStartedCallback.onBarcodeScanningStarted();
        }
    }
}
