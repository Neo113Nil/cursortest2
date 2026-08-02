package com.microblink.blinkid.fragment;

/* loaded from: classes10.dex */
public final class RecognizerRunnerFragment extends androidx.fragment.app.Fragment {
    private com.microblink.blinkid.fragment.overlay.ScanningOverlay Camera2StreamConfigurationMap;
    private com.microblink.blinkid.fragment.LifecycleObserver getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRanges;
    private android.widget.FrameLayout getHighSpeedVideoSizes;
    private com.microblink.blinkid.util.CameraPermissionManager getInputFormats;
    private com.microblink.blinkid.view.BaseCameraEventsListener getOutputFormats;
    private com.microblink.blinkid.view.recognition.RecognizerRunnerView getOutputMinFrameDuration;
    private android.view.View getInputSizeshNQ4ISI = null;
    private int getHighSpeedVideoSizesFor = com.microblink.blinkid.resources.Layouts.lllIlIlIIl;
    private final com.microblink.blinkid.view.recognition.ScanResultListener getOutputSizes = new com.microblink.blinkid.view.recognition.ScanResultListener() { // from class: com.microblink.blinkid.fragment.RecognizerRunnerFragment.1
        @Override // com.microblink.blinkid.view.recognition.ScanResultListener
        public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.Camera2StreamConfigurationMap.onScanningDone(recognitionSuccessType);
        }

        @Override // com.microblink.blinkid.view.recognition.ScanResultListener
        public void onUnrecoverableError(java.lang.Throwable th) {
            com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.Camera2StreamConfigurationMap.onUnrecoverableError(th);
        }
    };
    private final com.microblink.blinkid.view.CameraEventsListener getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.view.CameraEventsListener() { // from class: com.microblink.blinkid.fragment.RecognizerRunnerFragment.2
        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusFailed() {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onAutofocusFailed();
            }
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusStarted(android.graphics.Rect[] rectArr) {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onAutofocusStarted(rectArr);
            }
        }

        @Override // com.microblink.blinkid.hardware.camera.AutofocusListener
        public void onAutofocusStopped(android.graphics.Rect[] rectArr) {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onAutofocusStopped(rectArr);
            }
        }

        @Override // com.microblink.blinkid.view.CameraEventsListener
        public void onCameraPermissionDenied() {
            com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getInputFormats.askForCameraPermission();
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onCameraPreviewStarted() {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getInputSizeshNQ4ISI != null && com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getInputSizeshNQ4ISI.getVisibility() == 0) {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.microblink.blinkid.fragment.RecognizerRunnerFragment.2.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(android.view.animation.Animation animation) {
                        com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getInputSizeshNQ4ISI.setVisibility(8);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(android.view.animation.Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(android.view.animation.Animation animation) {
                    }
                });
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getInputSizeshNQ4ISI.startAnimation(alphaAnimation);
            }
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onCameraPreviewStarted();
            }
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onCameraPreviewStopped() {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onCameraPreviewStopped();
            }
        }

        @Override // com.microblink.blinkid.view.BaseCameraEventsListener
        public void onError(java.lang.Throwable th) {
            if (com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getOutputFormats.onError(th);
            }
        }
    };
    private final com.microblink.blinkid.view.recognition.FrameRecognitionCallback getOutputSizeshNQ4ISI = new com.microblink.blinkid.view.recognition.FrameRecognitionCallback() { // from class: com.microblink.blinkid.fragment.RecognizerRunnerFragment.3
        @Override // com.microblink.blinkid.view.recognition.FrameRecognitionCallback
        public void onFrameRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.Camera2StreamConfigurationMap.onFrameRecognitionDone(recognitionSuccessType);
        }
    };

    /* renamed from: com.microblink.blinkid.fragment.RecognizerRunnerFragment$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.microblink.blinkid.view.BaseCameraView.CameraViewState.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public interface ScanningOverlayBinder {
        com.microblink.blinkid.fragment.overlay.ScanningOverlay getScanningOverlay();
    }

    public final android.widget.FrameLayout getContentLayout() {
        return this.getHighSpeedVideoSizes;
    }

    public final com.microblink.blinkid.view.recognition.RecognizerRunnerView getRecognizerRunnerView() {
        return this.getOutputMinFrameDuration;
    }

    public final int getSplashScreenResourceId() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(android.app.Activity activity) {
        java.lang.String str;
        super.onAttach(activity);
        com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder scanningOverlayBinder = activity instanceof com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder ? (com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder) activity : getParentFragment() instanceof com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder ? (com.microblink.blinkid.fragment.RecognizerRunnerFragment.ScanningOverlayBinder) getParentFragment() : null;
        if (scanningOverlayBinder != null) {
            com.microblink.blinkid.fragment.overlay.ScanningOverlay scanningOverlay = scanningOverlayBinder.getScanningOverlay();
            this.Camera2StreamConfigurationMap = scanningOverlay;
            scanningOverlay.onRecognizerRunnerFragmentAttached(this, activity);
            return;
        }
        if (getParentFragment() != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(" or ");
            sb.append(getParentFragment().toString());
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(activity.toString());
        sb2.append(str);
        sb2.append(" must implement ScanningOverlayBinder interface!");
        throw new java.lang.ClassCastException(sb2.toString());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.changeConfiguration(configuration);
        }
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        com.microblink.blinkid.locale.LanguageUtils.setLanguageConfiguration(getResources());
        super.onCreate(bundle);
        com.microblink.blinkid.util.Log.i(this, "onCreate: {}", this);
        com.microblink.blinkid.util.Log.d(this, "My instance is: {}", com.microblink.blinkid.fragment.RecognizerRunnerFragment.class.getName());
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(layoutInflater.getContext());
        this.getHighSpeedVideoSizes = frameLayout;
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.getHighSpeedVideoSizes.setVisibility(0);
        this.getInputFormats = new com.microblink.blinkid.util.CameraPermissionManager(this);
        getHighResolutionOutputSizeshNQ4ISI(layoutInflater.getContext());
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView == null) {
            return null;
        }
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = recognizerRunnerView.getRecognizerBundle();
        this.getHighSpeedVideoFpsRanges = recognizerBundle;
        if (recognizerBundle == null) {
            throw new java.lang.NullPointerException("You must set RecognizerBundle in your onRecognizerRunnerViewCreated callback");
        }
        if (recognizerBundle.getRecognizers().length == 0) {
            throw new java.lang.IllegalStateException("You must set at least one Recognizer object into RecognizerBundle which is set to RecognizerRunnerView in onRecognizerRunnerViewCreated callback");
        }
        for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : this.getHighSpeedVideoFpsRanges.getRecognizers()) {
            if (recognizer == null) {
                throw new java.lang.NullPointerException("It is not allowed to set null Recognizer in RecognizerBundle!");
            }
        }
        int i = this.getHighSpeedVideoSizesFor;
        if (i != 0) {
            this.getInputSizeshNQ4ISI = layoutInflater.inflate(i, (android.view.ViewGroup) null);
        }
        android.view.View view = this.getInputSizeshNQ4ISI;
        if (view != null) {
            view.setVisibility(0);
        }
        android.view.View view2 = this.getInputSizeshNQ4ISI;
        if (view2 != null) {
            this.getHighSpeedVideoSizes.addView(view2);
        }
        android.view.View askPermissionOverlay = this.getInputFormats.getAskPermissionOverlay();
        if (askPermissionOverlay != null) {
            this.getHighSpeedVideoSizes.addView(askPermissionOverlay);
        }
        this.getOutputMinFrameDuration.create();
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.destroy();
            this.getOutputMinFrameDuration = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.pause();
        }
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.getInputFormats.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        com.microblink.blinkid.locale.LanguageUtils.setLanguageConfiguration(getResources());
        super.onResume();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.resume();
            android.view.View view = this.getInputSizeshNQ4ISI;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onResume();
        }
        com.microblink.blinkid.util.CameraPermissionManager cameraPermissionManager = this.getInputFormats;
        if (cameraPermissionManager != null) {
            cameraPermissionManager.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.start();
        }
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.stop();
        }
        com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lifecycleObserver != null) {
            lifecycleObserver.onStop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void recreateRecognizerRunnerView() {
        boolean z;
        boolean z2;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getOutputMinFrameDuration;
        if (recognizerRunnerView == null) {
            throw new java.lang.IllegalStateException("RecognizerRunnerView has not been created yet,it is created in onCreateView() method!");
        }
        com.microblink.blinkid.view.BaseCameraView.CameraViewState cameraViewState = recognizerRunnerView.getCameraViewState();
        int[] iArr = com.microblink.blinkid.fragment.RecognizerRunnerFragment.AnonymousClass4.getHighSpeedVideoFpsRangesFor;
        int i = iArr[cameraViewState.ordinal()];
        boolean z3 = true;
        if (i == 1) {
            this.getOutputMinFrameDuration.pause();
        } else if (i != 2) {
        }
        this.getOutputMinFrameDuration.stop();
        this.getOutputMinFrameDuration.destroy();
        this.getOutputMinFrameDuration = null;
        getHighResolutionOutputSizeshNQ4ISI(getActivity());
        if (this.getOutputMinFrameDuration == null) {
            return;
        }
        int i2 = iArr[cameraViewState.ordinal()];
        if (i2 != 1) {
            z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                    z3 = false;
                } else {
                    z2 = false;
                }
                if (z3) {
                    this.getOutputMinFrameDuration.create();
                }
                if (z2) {
                    this.getOutputMinFrameDuration.start();
                }
                if (z) {
                    return;
                }
                this.getOutputMinFrameDuration.resume();
                return;
            }
        } else {
            z = true;
        }
        z2 = true;
        if (z3) {
        }
        if (z2) {
        }
        if (z) {
        }
    }

    public final void registerLifecycleObserver(com.microblink.blinkid.fragment.LifecycleObserver lifecycleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleObserver;
    }

    public final void setCameraEventsListener(com.microblink.blinkid.view.BaseCameraEventsListener baseCameraEventsListener) {
        this.getOutputFormats = baseCameraEventsListener;
    }

    public final void setSplashScreenResourceId(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        try {
            this.getOutputMinFrameDuration = new com.microblink.blinkid.view.recognition.RecognizerRunnerView(context);
        } catch (com.microblink.blinkid.view.exception.NonLandscapeOrientationNotSupportedException unused) {
            getActivity().setRequestedOrientation(0);
            getActivity().recreate();
            this.getOutputMinFrameDuration = null;
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
            this.getOutputMinFrameDuration = null;
        }
        if (this.getOutputMinFrameDuration != null) {
            this.getHighSpeedVideoSizes.removeAllViews();
            this.getHighSpeedVideoSizes.addView(this.getOutputMinFrameDuration);
            this.Camera2StreamConfigurationMap.onRecognizerRunnerViewCreated(this);
            this.getOutputMinFrameDuration.setScanResultListener(this.getOutputSizes);
            this.getOutputMinFrameDuration.setFrameRecognitionCallback(this.getOutputSizeshNQ4ISI);
            this.getOutputMinFrameDuration.setCameraEventsListener(this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
