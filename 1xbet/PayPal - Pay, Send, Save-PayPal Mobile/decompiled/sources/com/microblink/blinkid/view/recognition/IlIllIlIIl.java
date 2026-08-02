package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class IlIllIlIIl implements com.microblink.blinkid.hardware.accelerometer.ShakeCallback {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.llIIlIlIIl = recognizerRunnerView;
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStarted() {
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStopped() {
        if (com.microblink.blinkid.view.recognition.RecognizerRunnerView.coroutineBoundary(this.llIIlIlIIl)) {
            return;
        }
        com.microblink.blinkid.view.recognition.RecognizerRunnerView.Camera2StreamConfigurationMap(this.llIIlIlIIl, false);
    }
}
