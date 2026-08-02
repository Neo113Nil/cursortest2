package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class IlIllIlllI implements com.microblink.blinkid.secured.lIIllllIII, com.microblink.blinkid.secured.llIllIlIII, com.microblink.blinkid.secured.lIllIlllIl {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIlIlIIl;

    public IlIllIlllI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.llIIlIlIIl = recognizerRunnerView;
    }

    @Override // com.microblink.blinkid.secured.lIllIlllIl
    public final void onLicenseInformation(java.lang.String str) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = this.llIIlIlIIl.getOutputStallDurationlomOqCM;
        atomicBoolean.set(true);
        this.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.view.recognition.lllIIIlIlI(this, str));
    }

    @Override // com.microblink.blinkid.secured.lIIllllIII
    public final void onRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.microblink.blinkid.view.recognition.FrameRecognitionCallback frameRecognitionCallback;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        com.microblink.blinkid.view.recognition.FrameRecognitionCallback frameRecognitionCallback2;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2;
        atomicBoolean = this.llIIlIlIIl.getOutputStallDurationlomOqCM;
        if (atomicBoolean.get()) {
            return;
        }
        com.microblink.blinkid.util.Log.v(this.llIIlIlIIl, "recognition done", new java.lang.Object[0]);
        boolean z = recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIlIlIIl;
        com.microblink.blinkid.util.Log.v(recognizerRunnerView, "Is camera active: {}, Should start timer: {}", java.lang.Boolean.valueOf(recognizerRunnerView.isCameraActive()), java.lang.Boolean.valueOf(z));
        if (this.llIIlIlIIl.isCameraActive() && z) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView2 = this.llIIlIlIIl;
            recognizerBundle2 = recognizerRunnerView2.getOutputStallDuration;
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(recognizerRunnerView2, recognizerBundle2.getNumMsBeforeTimeout());
        } else {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.toString(this.llIIlIlIIl);
        }
        frameRecognitionCallback = this.llIIlIlIIl.getInputFormats;
        if (frameRecognitionCallback != null) {
            frameRecognitionCallback2 = this.llIIlIlIIl.getInputFormats;
            frameRecognitionCallback2.onFrameRecognitionDone(recognitionSuccessType);
        }
        recognizerBundle = this.llIIlIlIIl.getOutputStallDuration;
        if (recognizerBundle.getRecognitionDebugMode() != com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.Camera2StreamConfigurationMap(this.llIIlIlIIl, true);
            this.llIIlIlIIl.getHighSpeedVideoSizes();
        } else if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(this.llIIlIlIIl, recognitionSuccessType);
        } else {
            this.llIIlIlIIl.getHighSpeedVideoSizes();
        }
    }

    @Override // com.microblink.blinkid.secured.lIIllllIII
    public final void onRecognitionDoneWithTimeout(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        atomicBoolean = this.llIIlIlIIl.getOutputStallDurationlomOqCM;
        if (atomicBoolean.get()) {
            return;
        }
        com.microblink.blinkid.util.Log.d(this.llIIlIlIIl, "recognition done with timeout", new java.lang.Object[0]);
        recognizerBundle = this.llIIlIlIIl.getOutputStallDuration;
        if (recognizerBundle.getRecognitionDebugMode() == com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(this.llIIlIlIIl, recognitionSuccessType);
        } else {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView.Camera2StreamConfigurationMap(this.llIIlIlIIl, true);
            this.llIIlIlIIl.getHighSpeedVideoSizes();
        }
    }

    @Override // com.microblink.blinkid.secured.llIllIlIII
    public final void onRecognizerError(java.lang.Throwable th) {
        this.llIIlIlIIl.llIIlIlIIl(new com.microblink.blinkid.view.recognition.lIIIIIllll(this, th));
    }
}
