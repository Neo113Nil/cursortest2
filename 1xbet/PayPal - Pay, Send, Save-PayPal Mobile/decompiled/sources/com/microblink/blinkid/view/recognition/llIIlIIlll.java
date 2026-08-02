package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class llIIlIIlll extends com.microblink.blinkid.view.BaseCameraView.BaseCameraListener {
    public long IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView IllIIIllII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llIIlIIlll(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        super(recognizerRunnerView);
        this.IllIIIllII = recognizerRunnerView;
        this.IlIllIlIIl = -1L;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView.BaseCameraListener, com.microblink.blinkid.secured.lIlIllIIlI
    public final boolean canReceiveFrame() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        com.microblink.blinkid.view.BaseCameraView.CameraViewState cameraViewState;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean4;
        com.microblink.blinkid.view.BaseCameraView.CameraViewState cameraViewState2;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.IllIIIllII;
        atomicBoolean = recognizerRunnerView.getOutputMinFrameDurationlomOqCM;
        boolean z = atomicBoolean.get();
        atomicBoolean2 = this.IllIIIllII.coroutineBoundary;
        boolean z2 = atomicBoolean2.get();
        cameraViewState = this.IllIIIllII.llIIIlllll;
        com.microblink.blinkid.util.Log.v(recognizerRunnerView, "Recognition paused: {}, Analyzing frame: {}, Camera view state: {}", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), cameraViewState);
        atomicBoolean3 = this.IllIIIllII.getOutputMinFrameDurationlomOqCM;
        if (atomicBoolean3.get()) {
            return false;
        }
        atomicBoolean4 = this.IllIIIllII.coroutineBoundary;
        if (atomicBoolean4.get()) {
            return false;
        }
        cameraViewState2 = this.IllIIIllII.llIIIlllll;
        return cameraViewState2 == com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(r0, null, r12) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021d, code lost:
    
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(r0, null, r12) != false) goto L68;
     */
    @Override // com.microblink.blinkid.view.BaseCameraView.BaseCameraListener, com.microblink.blinkid.secured.lIlIllIIlI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCameraFrame(com.microblink.blinkid.secured.lIllIlIlII lillililii) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.microblink.blinkid.recognition.FrameAnalyzers frameAnalyzers;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.util.concurrent.atomic.AtomicReference atomicReference3;
        java.util.concurrent.atomic.AtomicReference atomicReference4;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper;
        java.util.concurrent.atomic.AtomicReference atomicReference5;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper3;
        java.util.concurrent.atomic.AtomicReference atomicReference6;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper4;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI2;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper5;
        java.util.concurrent.atomic.AtomicReference atomicReference7;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper6;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper7;
        com.microblink.blinkid.recognition.FrameAnalyzers frameAnalyzers2;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper8;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback2;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI3;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI4;
        com.microblink.blinkid.recognition.FrameAnalyzers frameAnalyzers3;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper9;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper10;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper11;
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle3;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback3;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI5;
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI6;
        if (this.IlIllIlIIl == -1) {
            this.IlIllIlIIl = java.lang.System.currentTimeMillis();
        }
        if (lillililii instanceof com.microblink.blinkid.secured.IlIIlIIIII) {
            com.microblink.blinkid.secured.IlIIlIIIII ilIIlIIIII = (com.microblink.blinkid.secured.IlIIlIIIII) lillililii;
            com.microblink.blinkid.secured.lllIIlIIlI llliiliili = new com.microblink.blinkid.secured.lllIIlIIlI(ilIIlIIIII);
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.IllIIIllII;
            llliiliili.llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(recognizerRunnerView, recognizerRunnerView.getVisiblePart()));
            llliiliili.IlIllIlIIl.lIlIIIIlIl = com.microblink.blinkid.view.recognition.RecognizerRunnerView.getOutputStallDurationlomOqCM(this.IllIIIllII);
            frameAnalyzers3 = this.IllIIIllII.getHighSpeedVideoSizes;
            if (llliiliili.IlIllIlIIl.llIIlIlIIl(frameAnalyzers3.llIIlIlIIl) && this.IllIIIllII.isCameraActive() && !com.microblink.blinkid.view.recognition.RecognizerRunnerView.coroutineBoundary(this.IllIIIllII)) {
                nativeRecognizerWrapper9 = this.IllIIIllII.coroutineCreation;
                if (nativeRecognizerWrapper9 != null) {
                    nativeRecognizerWrapper10 = this.IllIIIllII.coroutineCreation;
                    if (((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper10.llIIlIlIIl.get()) == com.microblink.blinkid.secured.IIlIIIIllI.READY) {
                        nativeRecognizerWrapper11 = this.IllIIIllII.coroutineCreation;
                        recognizerBundle3 = this.IllIIIllII.getOutputStallDuration;
                        recognitionProcessCallback3 = this.IllIIIllII.getOutputMinFrameDuration;
                        ilIllIlllI5 = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        ilIllIlllI6 = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        nativeRecognizerWrapper11.llIIlIlIIl(llliiliili, recognizerBundle3, recognitionProcessCallback3, ilIllIlllI5, ilIllIlllI6, false);
                        return;
                    }
                }
            }
            llliiliili.IlIllIlIIl.IlIllIlIIl();
            ilIIlIIIII.IlIllIlIIl();
            return;
        }
        if (com.microblink.blinkid.secured.IlIlIlllIl.IllIIIllII == 1) {
            if (this.IllIIIllII.isCameraActive() && !com.microblink.blinkid.view.recognition.RecognizerRunnerView.coroutineBoundary(this.IllIIIllII)) {
                nativeRecognizerWrapper6 = this.IllIIIllII.coroutineCreation;
                if (nativeRecognizerWrapper6 != null) {
                    nativeRecognizerWrapper7 = this.IllIIIllII.coroutineCreation;
                    if (((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper7.llIIlIlIIl.get()) == com.microblink.blinkid.secured.IIlIIIIllI.READY) {
                        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView2 = this.IllIIIllII;
                        lillililii.llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(recognizerRunnerView2, recognizerRunnerView2.getVisiblePart()));
                        lillililii.llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView.getOutputStallDurationlomOqCM(this.IllIIIllII));
                        frameAnalyzers2 = this.IllIIIllII.getHighSpeedVideoSizes;
                        if (!lillililii.llIIlIlIIl(frameAnalyzers2.llIIlIlIIl)) {
                            lillililii.IlIllIlIIl();
                            return;
                        }
                        com.microblink.blinkid.util.Log.v(this.IllIIIllII, "Sending frame id {} to recognition", java.lang.Long.valueOf(lillililii.IllIIIIllI()));
                        nativeRecognizerWrapper8 = this.IllIIIllII.coroutineCreation;
                        recognizerBundle2 = this.IllIIIllII.getOutputStallDuration;
                        recognitionProcessCallback2 = this.IllIIIllII.getOutputMinFrameDuration;
                        ilIllIlllI3 = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        ilIllIlllI4 = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        nativeRecognizerWrapper8.llIIlIlIIl(lillililii, recognizerBundle2, recognitionProcessCallback2, ilIllIlllI3, ilIllIlllI4, false);
                        return;
                    }
                }
            }
            lillililii.IlIllIlIIl();
            return;
        }
        atomicBoolean = this.IllIIIllII.coroutineBoundary;
        if (!atomicBoolean.compareAndSet(false, true)) {
            com.microblink.blinkid.util.Log.i(this, "Frame analysis already in progress. Will skip it", new java.lang.Object[0]);
            lillililii.IlIllIlIIl();
            return;
        }
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView3 = this.IllIIIllII;
        lillililii.llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighResolutionOutputSizeshNQ4ISI(recognizerRunnerView3, recognizerRunnerView3.getVisiblePart()));
        lillililii.llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView.getOutputStallDurationlomOqCM(this.IllIIIllII));
        frameAnalyzers = this.IllIIIllII.getHighSpeedVideoSizes;
        if (!lillililii.llIIlIlIIl(frameAnalyzers.llIIlIlIIl)) {
            lillililii.IlIllIlIIl();
            atomicBoolean3 = this.IllIIIllII.coroutineBoundary;
            atomicBoolean3.set(false);
            return;
        }
        com.microblink.blinkid.util.Log.v(this.IllIIIllII, "Calculating quality of frame id {}", java.lang.Long.valueOf(lillililii.IllIIIIllI()));
        double llIIIlllll = lillililii.llIIIlllll();
        com.microblink.blinkid.util.Log.v(this.IllIIIllII, "Finished quality calculation of frame id {}, quality is {}", java.lang.Long.valueOf(lillililii.IllIIIIllI()), java.lang.Double.valueOf(llIIIlllll));
        if (llIIIlllll < 0.0d) {
            atomicReference7 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
            lillililii = (com.microblink.blinkid.secured.lIllIlIlII) atomicReference7.getAndSet(lillililii);
        } else {
            if (llIIIlllll > 15.0d) {
                this.IlIllIlIIl = java.lang.System.currentTimeMillis();
            } else if (java.lang.System.currentTimeMillis() - this.IlIllIlIIl > 1500) {
                com.microblink.blinkid.util.Log.w(this.IllIIIllII, "No good quality frame for more than 1.5 sec. Requesting autofocus", new java.lang.Object[0]);
                this.IllIIIllII.focusCamera();
                this.IlIllIlIIl = java.lang.System.currentTimeMillis();
            }
            atomicReference = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
            com.microblink.blinkid.secured.lIllIlIlII lillililii2 = (com.microblink.blinkid.secured.lIllIlIlII) atomicReference.get();
            if (lillililii2 == null) {
                atomicReference4 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
            } else if (llIIIlllll >= lillililii2.llIIIlllll()) {
                atomicReference2 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, lillililii2, lillililii)) {
                    lillililii = lillililii2;
                } else {
                    atomicReference3 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
                }
            }
        }
        if (lillililii != null) {
            lillililii.IlIllIlIIl();
        }
        nativeRecognizerWrapper = this.IllIIIllII.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView4 = this.IllIIIllII;
            nativeRecognizerWrapper5 = recognizerRunnerView4.coroutineCreation;
            com.microblink.blinkid.util.Log.v(recognizerRunnerView4, "RecognizerRunner state is {}", (com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper5.llIIlIlIIl.get());
        } else {
            com.microblink.blinkid.util.Log.v(this.IllIIIllII, "RecognizerRunner is null", new java.lang.Object[0]);
        }
        if (com.microblink.blinkid.view.recognition.RecognizerRunnerView.coroutineBoundary(this.IllIIIllII)) {
            com.microblink.blinkid.util.Log.d(this.IllIIIllII, "Recognition is paused. Invalidating best frame", new java.lang.Object[0]);
            atomicReference5 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
            com.microblink.blinkid.secured.lIllIlIlII lillililii3 = (com.microblink.blinkid.secured.lIllIlIlII) atomicReference5.getAndSet(null);
            if (lillililii3 != null) {
                lillililii3.IlIllIlIIl();
            }
        } else if (this.IllIIIllII.isCameraActive()) {
            nativeRecognizerWrapper2 = this.IllIIIllII.coroutineCreation;
            if (nativeRecognizerWrapper2 != null) {
                nativeRecognizerWrapper3 = this.IllIIIllII.coroutineCreation;
                if (((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper3.llIIlIlIIl.get()) == com.microblink.blinkid.secured.IIlIIIIllI.READY) {
                    atomicReference6 = this.IllIIIllII.getValidOutputFormatsForInputhNQ4ISI;
                    com.microblink.blinkid.secured.lIllIlIlII lillililii4 = (com.microblink.blinkid.secured.lIllIlIlII) atomicReference6.getAndSet(null);
                    if (lillililii4 != null) {
                        com.microblink.blinkid.util.Log.v(this.IllIIIllII, "Sending frame id {} to recognition", java.lang.Long.valueOf(lillililii4.IllIIIIllI()));
                        nativeRecognizerWrapper4 = this.IllIIIllII.coroutineCreation;
                        recognizerBundle = this.IllIIIllII.getOutputStallDuration;
                        recognitionProcessCallback = this.IllIIIllII.getOutputMinFrameDuration;
                        ilIllIlllI = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        ilIllIlllI2 = this.IllIIIllII.getHighSpeedVideoSizesFor;
                        nativeRecognizerWrapper4.llIIlIlIIl(lillililii4, recognizerBundle, recognitionProcessCallback, ilIllIlllI, ilIllIlllI2, false);
                    }
                }
            }
        }
        atomicBoolean2 = this.IllIIIllII.coroutineBoundary;
        atomicBoolean2.set(false);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView.BaseCameraListener, com.microblink.blinkid.secured.lIlIllIIlI
    public final void onHighResFrame(com.microblink.blinkid.secured.lIllIlIlII lillililii) {
        com.microblink.blinkid.view.recognition.HighResImageListener highResImageListener;
        com.microblink.blinkid.view.recognition.HighResImageListener highResImageListener2;
        highResImageListener = this.IllIIIllII.getHighResolutionOutputSizeshNQ4ISI;
        if (highResImageListener != null) {
            com.microblink.blinkid.image.highres.HighResImageWrapper createFromFrame = com.microblink.blinkid.image.highres.HighResImageWrapper.Factory.createFromFrame(lillililii, com.microblink.blinkid.view.recognition.RecognizerRunnerView.getOutputStallDurationlomOqCM(this.IllIIIllII));
            highResImageListener2 = this.IllIIIllII.getHighResolutionOutputSizeshNQ4ISI;
            highResImageListener2.onHighResImageAvailable(createFromFrame);
        }
    }
}
