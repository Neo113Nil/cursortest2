package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public abstract class BaseOverlayController implements com.microblink.blinkid.fragment.overlay.ScanningOverlay {
    public com.microblink.blinkid.fragment.RecognizerRunnerFragment IllIIIllII;
    protected android.app.AlertDialog lIlIIIIlIl;
    public com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIIlllll;
    public final com.microblink.blinkid.view.recognition.ScanResultListener llIIlIlIIl;
    public com.microblink.blinkid.fragment.overlay.OverlayState IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.DESTROYED;
    public final android.os.Handler IllIIIIllI = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.microblink.blinkid.fragment.overlay.components.ScanSoundPlayer llIIlIIlll = new com.microblink.blinkid.fragment.overlay.components.ScanSoundPlayer();
    public com.microblink.blinkid.fragment.overlay.components.TorchController IIlIIIllIl = new com.microblink.blinkid.fragment.overlay.components.TorchController();
    private final com.microblink.blinkid.view.BaseCameraEventsListener getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.view.CameraEventsListener() { // from class: com.microblink.blinkid.fragment.overlay.BaseOverlayController.1
        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusFailed() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.onCameraAutofocusFailed();
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusStarted(android.graphics.Rect[] rectArr) {
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusStopped(android.graphics.Rect[] rectArr) {
        }

        @Override // com.microblink.blinkid.view.CameraEventsListener
        public void onCameraPermissionDenied() {
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onCameraPreviewStarted() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IIlIIIllIl.onTorchSupportStatusAvailable();
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            if (baseOverlayController.IlIllIlIIl == com.microblink.blinkid.fragment.overlay.OverlayState.RESUMED) {
                baseOverlayController.lIlIIIIlIl();
            }
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onCameraPreviewStopped() {
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onError(final java.lang.Throwable th) {
            com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IllIIIllII;
            if (recognizerRunnerFragment == null || recognizerRunnerFragment.getActivity() == null) {
                com.microblink.blinkid.util.Log.w(this, "RecognizerRunnerFragment or Activity is null", new java.lang.Object[0]);
                return;
            }
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.lIlIIIIlIl = new com.microblink.blinkid.fragment.overlay.components.ErrorDialogFactory().createErrorDialog(com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IllIIIllII.getActivity(), th, new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.BaseOverlayController.1.1
                @Override // java.lang.Runnable
                public void run() {
                    com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.onUnrecoverableError(th);
                    com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IllIIIllII.getActivity().onBackPressed();
                }
            });
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            com.microblink.blinkid.fragment.overlay.OverlayState overlayState = baseOverlayController.IlIllIlIIl;
            if (overlayState == com.microblink.blinkid.fragment.overlay.OverlayState.RESUMED || overlayState == com.microblink.blinkid.fragment.overlay.OverlayState.STARTED) {
                baseOverlayController.lIlIIIIlIl.show();
                com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.lIlIIIIlIl = null;
            }
        }
    };
    private final com.microblink.blinkid.fragment.LifecycleObserver getHighSpeedVideoSizes = new com.microblink.blinkid.fragment.LifecycleObserver() { // from class: com.microblink.blinkid.fragment.overlay.BaseOverlayController.2
        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.llIIlIlIIl(configuration);
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onCreate(android.os.Bundle bundle) {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            baseOverlayController.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.CREATED;
            baseOverlayController.llIIlIlIIl(bundle);
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onDestroy() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            baseOverlayController.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.DESTROYED;
            baseOverlayController.llIIlIIlll.clear();
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController2 = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            baseOverlayController2.IllIIIllII = null;
            baseOverlayController2.IllIIIIllI.removeCallbacksAndMessages(null);
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IllIIIllII();
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onPause() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            baseOverlayController.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.STARTED;
            baseOverlayController.llIIIlllll();
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onResume() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController = com.microblink.blinkid.fragment.overlay.BaseOverlayController.this;
            baseOverlayController.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.RESUMED;
            android.app.AlertDialog alertDialog = baseOverlayController.lIlIIIIlIl;
            if (alertDialog != null) {
                alertDialog.show();
                com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.lIlIIIIlIl = null;
            }
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IllIIIIllI();
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onSaveInstanceState(android.os.Bundle bundle) {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IlIllIlIIl(bundle);
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onStart() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.STARTED;
        }

        @Override // com.microblink.blinkid.fragment.LifecycleObserver
        public void onStop() {
            com.microblink.blinkid.fragment.overlay.BaseOverlayController.this.IlIllIlIIl = com.microblink.blinkid.fragment.overlay.OverlayState.CREATED;
        }
    };

    public BaseOverlayController(com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        this.llIIlIlIIl = scanResultListener;
    }

    protected abstract int IlIllIlIIl();

    protected void IlIllIlIIl(android.os.Bundle bundle) {
    }

    protected void IllIIIIllI() {
    }

    protected void IllIIIllII() {
    }

    public android.content.Context getContext() {
        com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment = this.IllIIIllII;
        if (recognizerRunnerFragment == null) {
            return null;
        }
        return recognizerRunnerFragment.getActivity();
    }

    protected void lIlIIIIlIl() {
        this.llIIIlllll.setMeteringAreas(new android.graphics.RectF[]{new com.microblink.blinkid.geometry.Rectangle(0.33f, 0.33f, 0.33f, 0.33f).toRectF()}, true);
    }

    protected void llIIIlllll() {
    }

    protected abstract boolean llIIlIIlll();

    protected abstract int llIIlIlIIl();

    protected void llIIlIlIIl(android.content.res.Configuration configuration) {
    }

    protected void llIIlIlIIl(android.os.Bundle bundle) {
    }

    protected void onCameraAutofocusFailed() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onFrameRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onRecognizerRunnerFragmentAttached(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment, android.app.Activity activity) {
        this.IllIIIllII = recognizerRunnerFragment;
        recognizerRunnerFragment.setCameraEventsListener(this.getHighSpeedVideoFpsRangesFor);
        recognizerRunnerFragment.registerLifecycleObserver(this.getHighSpeedVideoSizes);
        recognizerRunnerFragment.setSplashScreenResourceId(IlIllIlIIl());
    }

    @Override // com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        this.llIIIlllll = recognizerRunnerFragment.getRecognizerRunnerView();
        this.llIIlIIlll.initialize(recognizerRunnerFragment.getActivity(), llIIlIlIIl());
    }

    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    public void onUnrecoverableError(java.lang.Throwable th) {
        this.llIIlIlIIl.onUnrecoverableError(th);
    }

    @Override // com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void pauseScanning() {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.pauseScanning();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void resumeScanning() {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.resumeScanning(llIIlIIlll());
        }
    }
}
