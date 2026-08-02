package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public class ReticleOverlayView implements com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView {
    private com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode ArtificialStackFrames;
    private android.widget.ImageView Camera2StreamConfigurationMap;
    protected java.lang.String IllIIIIllI;
    private final boolean _BOUNDARY;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3958a;
    private com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager accessartificialFrame;
    private final boolean coroutineBoundary;
    private final boolean coroutineCreation;
    private android.os.Vibrator getARTIFICIAL_FRAME_PACKAGE_NAME;
    private com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private android.widget.FrameLayout getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.fragment.overlay.reticle.ProgressView getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager getInputFormats;
    private com.microblink.blinkid.fragment.overlay.reticle.ReticleView getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources getOutputStallDurationlomOqCM;
    private com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView getValidOutputFormatsForInputhNQ4ISI;
    private final boolean isOutputSupportedFor;
    private final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView isOutputSupportedForhNQ4ISI;
    protected com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings llIIIlllll;
    private final boolean toString;
    private android.view.ViewGroup unwrapAs;
    private final android.os.Handler CoroutineDebuggingKt = new android.os.Handler(android.os.Looper.getMainLooper());
    protected com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState lllIIIlIlI = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SENSING_START;
    private long getOutputMinFrameDuration = 0;
    private boolean _CREATION = false;
    private boolean getOutputStallDuration = false;
    private boolean getOutputSizeshNQ4ISI = false;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation getOutputSizes = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
    private com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.getHighSpeedVideoFpsRanges;

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.IMMEDIATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.DELAYED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.SCANNING_WRONG_SIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.FACE_PHOTO_NOT_FULLY_VISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.MANDATORY_FIELD_MISSING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.BLUR_DETECTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.GLARE_DETECTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.microblink.blinkid.view.recognition.DetectionStatus.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr3;
            try {
                iArr3[com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.view.recognition.DetectionStatus.FALLBACK_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_FAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_CLOSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_PARTIALLY_VISIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_TOO_CLOSE_TO_CAMERA_EDGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.values().length];
            getHighSpeedVideoFpsRangesFor = iArr4;
            try {
                iArr4[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Barcode.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Mrz.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.PhotoId.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            int[] iArr5 = new int[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.values().length];
            Camera2StreamConfigurationMap = iArr5;
            try {
                iArr5[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
        }
    }

    public interface OnboardingClosedListener {
        void onOnboardingClosed();
    }

    public ReticleOverlayView(@java.lang.Deprecated boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings, int i, boolean z7, boolean z8) {
        this.isOutputSupportedFor = z;
        this.toString = z2;
        this.getHighSpeedVideoSizesFor = z3;
        this.coroutineBoundary = z4;
        this._BOUNDARY = z5;
        this.f3958a = z6;
        this.llIIIlllll = reticleOverlayStrings;
        this.getOutputFormats = i;
        this.coroutineCreation = z7;
        this.getHighSpeedVideoFpsRanges = z8;
        if (z3 || z4) {
            this.isOutputSupportedForhNQ4ISI = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView(z3, z4);
        } else {
            this.isOutputSupportedForhNQ4ISI = null;
        }
    }

    public void changeState(final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState, final java.lang.String str) {
        this.getOutputMinFrameDuration = java.lang.System.currentTimeMillis();
        final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = this.lllIIIlIlI;
        this.lllIIIlIlI = reticleUiState;
        this.CoroutineDebuggingKt.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.$r8$lambda$P5cqD3HswlDJayu6GBH8STuGcLI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.this, reticleUiState2, reticleUiState, str);
            }
        });
    }

    public void changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState, java.lang.String str) {
        android.os.Vibrator vibrator;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = this.lllIIIlIlI;
        if (reticleUiState2 == reticleUiState) {
            if (reticleUiState2 != com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.DOCUMENT_NOT_FULLY_VISIBLE) {
                this.getOutputMinFrameDuration = java.lang.System.currentTimeMillis();
            }
        } else if (reticleUiState == com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.ERROR_DIALOG || reticleUiState2 == com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS || ((reticleUiState2.isDetectionError && reticleUiState == com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.PROCESSING) || ((reticleUiState2 == com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.PROCESSING && reticleUiState.isProcessingError) || java.lang.System.currentTimeMillis() - this.getOutputMinFrameDuration >= this.lllIIIlIlI.minDurationMs))) {
            if ((reticleUiState.isDetectionError || reticleUiState.isProcessingError) && this.f3958a && (vibrator = this.getARTIFICIAL_FRAME_PACKAGE_NAME) != null) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(100L, 50));
            }
            changeState(reticleUiState, str);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void cleanup() {
        this.getValidOutputFormatsForInputhNQ4ISI.cancelAnimation();
        this.getInputSizeshNQ4ISI.clearAnimation();
        this.getHighResolutionOutputSizeshNQ4ISI.setAnimationEnabled(false);
        this.getHighSpeedVideoSizes.setAnimationEnabled(false);
        this.CoroutineDebuggingKt.removeCallbacksAndMessages(null);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public android.view.ViewGroup createLayout(final android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView;
        llIIlIlIIl(activity);
        this.getOutputStallDurationlomOqCM = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources(activity, this.getOutputFormats);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.llIIlIIlll, (android.view.ViewGroup) recognizerRunnerView, false);
        if (activity.checkSelfPermission("android.permission.VIBRATE") == 0) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = (android.os.Vibrator) viewGroup.getContext().getSystemService("vibrator");
        } else {
            this.f3958a = false;
        }
        this.IllIIIIllI = this.llIIIlllll.errorDocumentNotFullyVisible;
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView reticleView = (com.microblink.blinkid.fragment.overlay.reticle.ReticleView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.reticleView);
        this.getInputSizeshNQ4ISI = reticleView;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources = this.getOutputStallDurationlomOqCM;
        reticleView.setDrawables(reticleOverlayResources.isOutputSupportedFor, reticleOverlayResources._CREATION, reticleOverlayResources.getOutputMinFrameDurationlomOqCM);
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView reticleView2 = this.getInputSizeshNQ4ISI;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources2 = this.getOutputStallDurationlomOqCM;
        reticleView2.setColors(reticleOverlayResources2.init, reticleOverlayResources2.getInputFormats);
        com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView = (com.microblink.blinkid.fragment.overlay.reticle.ProgressView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.progressView);
        this.getHighSpeedVideoSizes = progressView;
        progressView.setup(this.getOutputStallDurationlomOqCM.coroutineCreation);
        this.getHighSpeedVideoFpsRangesFor = (android.widget.FrameLayout) viewGroup.findViewById(com.microblink.blinkid.library.R.id.documentImageContainer);
        com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView = (com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.innerReticleView);
        this.getHighResolutionOutputSizeshNQ4ISI = innerReticleView;
        innerReticleView.setup(this.getOutputStallDurationlomOqCM.coroutineCreation);
        com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView successFlashView = (com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.successFlashView);
        this.getValidOutputFormatsForInputhNQ4ISI = successFlashView;
        successFlashView.setup(this.getOutputStallDurationlomOqCM.toString);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.poweredByMicroblinkView);
        if (!com.microblink.blinkid.recognition.RightsManager.llIIIlllll() || !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_REMOVE_PRODUCTION_OVERLAY)) {
            imageView.setVisibility(0);
        }
        android.widget.TextSwitcher textSwitcher = (android.widget.TextSwitcher) viewGroup.findViewById(com.microblink.blinkid.library.R.id.instructionsView);
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources3 = this.getOutputStallDurationlomOqCM;
        android.graphics.drawable.Drawable drawable = reticleOverlayResources3.isOutputSupportedForhNQ4ISI;
        if (drawable != null) {
            drawable.setColorFilter(reticleOverlayResources3.getOutputSizeshNQ4ISI, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        textSwitcher.setBackground(drawable);
        com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager statusTextManager = new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager(textSwitcher, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda6
            @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler
            public final void applyStyle(android.widget.TextView textView) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.$r8$lambda$U3DfPXCWX3K_xqB6wI_fzywWai4(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.this, textView);
            }
        });
        this.getInputFormats = statusTextManager;
        statusTextManager.setShouldAnimate(false);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
        if (this.getHighSpeedVideoFpsRanges && this.isOutputSupportedFor) {
            imageView2.setImageDrawable(this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI);
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    activity.onBackPressed();
                }
            });
        } else {
            imageView2.setVisibility(8);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton);
        this.Camera2StreamConfigurationMap = imageView3;
        if (this.coroutineCreation && this.isOutputSupportedFor) {
            imageView3.setVisibility(0);
        } else {
            imageView3.setVisibility(8);
            this.Camera2StreamConfigurationMap = null;
        }
        if (this.coroutineBoundary && this.isOutputSupportedForhNQ4ISI != null) {
            android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.microblink.blinkid.library.R.id.blinkidHelpButton);
            android.graphics.drawable.Drawable drawable2 = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor;
            if (drawable2 instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable2;
                if (layerDrawable.findDrawableByLayerId(com.microblink.blinkid.library.R.id.help_button_background) != null) {
                    layerDrawable.findDrawableByLayerId(com.microblink.blinkid.library.R.id.help_button_background).setColorFilter(this.getOutputStallDurationlomOqCM.getInputSizeshNQ4ISI, android.graphics.PorterDuff.Mode.SRC_IN);
                }
                if (layerDrawable.findDrawableByLayerId(com.microblink.blinkid.library.R.id.help_button_questionmark) != null) {
                    layerDrawable.findDrawableByLayerId(com.microblink.blinkid.library.R.id.help_button_questionmark).setColorFilter(this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizesFor, android.graphics.PorterDuff.Mode.SRC_IN);
                }
                imageButton.setImageDrawable(layerDrawable);
            } else {
                imageButton.setImageDrawable(drawable2);
            }
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.$r8$lambda$lA2W6Xw7G8G5JpXLsagFUu9M9Uo(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.this, view);
                }
            });
        }
        this.accessartificialFrame = new com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager((android.widget.ViewSwitcher) viewGroup.findViewById(com.microblink.blinkid.library.R.id.snackbarViewSwitcher), this.llIIIlllll.flashlightWarning, this.getOutputStallDurationlomOqCM.getOutputFormats, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda1
            @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler
            public final void applyStyle(android.widget.TextView textView) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.$r8$lambda$ATWjpKmreqYbwU1WkD8Oj9iSb6g(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.this, textView);
            }
        });
        if ((this.coroutineBoundary || this.getHighSpeedVideoSizesFor) && (blinkIdDialogOnboardingView = this.isOutputSupportedForhNQ4ISI) != null) {
            blinkIdDialogOnboardingView.setupOnboarding(viewGroup, (androidx.appcompat.app.AppCompatActivity) activity, this.getOutputStallDurationlomOqCM, this.llIIIlllll, this.ArtificialStackFrames, new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda5
                @Override // com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener
                public final void onOnboardingClosed() {
                    com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.this.getHighSpeedVideoSizes(1);
                }
            });
        }
        recognizerRunnerView.addChildView(viewGroup, false);
        this.unwrapAs = viewGroup;
        return viewGroup;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.components.TorchController torchController = new com.microblink.blinkid.fragment.overlay.components.TorchController();
        android.widget.ImageView imageView = this.Camera2StreamConfigurationMap;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources = this.getOutputStallDurationlomOqCM;
        torchController.setup(imageView, recognizerRunnerView, reticleOverlayResources._BOUNDARY, reticleOverlayResources.coroutineBoundary);
        return torchController;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDataMismatchStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings = this.llIIIlllll;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(reticleOverlayStrings.dataMismatchTitle, reticleOverlayStrings.dataMismatchMessage, reticleOverlayStrings.retryButton);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDocumentNotSupportedDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings = this.llIIIlllll;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(reticleOverlayStrings.unsupportedDocumentTitle, reticleOverlayStrings.unsupportedDocumentMessage, reticleOverlayStrings.retryButton);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings = this.llIIIlllll;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(reticleOverlayStrings.recognitionTimeoutTitle, reticleOverlayStrings.recognitionTimeoutMessage, reticleOverlayStrings.retryButton);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getSidesNotMatchingDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings = this.llIIIlllll;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(reticleOverlayStrings.sidesNotMatchingTitle, reticleOverlayStrings.sidesNotMatchingMessage, reticleOverlayStrings.retryButton);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onCardDetectionUpdate(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
        java.lang.String str;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SENSING;
        if (!this._CREATION) {
            str = this.llIIIlllll.firstSideInstructions;
        } else if (this.getOutputStallDuration) {
            str = this.llIIIlllll.backSideBarcodeInstructions;
        } else if (this.getOutputSizeshNQ4ISI) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.Camera2StreamConfigurationMap[this.getOutputSizes.ordinal()];
            str = (i == 1 || i == 2) ? this.llIIIlllll.topPageInstructions : i != 3 ? i != 4 ? this.llIIIlllll.topPageInstructions : this.llIIIlllll.leftPageInstructions : this.llIIIlllll.rightPageInstructions;
        } else {
            str = this.llIIIlllll.backSideInstructions;
        }
        switch (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[detectionStatus.ordinal()]) {
            case 1:
            case 2:
                reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.PROCESSING;
                break;
            case 3:
                reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.CAMERA_TOO_HIGH;
                str = this.llIIIlllll.errorMoveCloser;
                break;
            case 4:
            case 5:
                reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.CAMERA_TOO_CLOSE;
                str = this.llIIIlllll.errorMoveFarther;
                break;
            case 6:
                reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.DOCUMENT_TOO_CLOSE_TO_EDGE;
                str = this.llIIIlllll.errorDocumentTooCloseToEdge;
                break;
        }
        android.util.Pair pair = new android.util.Pair(reticleUiState, str);
        changeStateIfRequired((com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState) pair.first, (java.lang.String) pair.second);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onConfigurationChanged(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.onConfigurationChanged();
        this.getHighSpeedVideoSizes.onConfigurationChanged();
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView = this.isOutputSupportedForhNQ4ISI;
        if (blinkIdDialogOnboardingView != null) {
            blinkIdDialogOnboardingView.onConfigurationChanged();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onDocumentClassified() {
        changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.PROCESSING, "");
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onErrorDialogShown() {
        android.os.Vibrator vibrator;
        if (this.f3958a && (vibrator = this.getARTIFICIAL_FRAME_PACKAGE_NAME) != null) {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(300L, 100));
        }
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState = this.lllIIIlIlI;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.ERROR_DIALOG;
        if (reticleUiState != reticleUiState2) {
            changeState(reticleUiState2, "");
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onFirstSideScanStarted() {
        this._CREATION = false;
        this.getOutputSizeshNQ4ISI = false;
        this.getOutputSizes = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
        changeState(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SENSING_START, this.llIIIlllll.firstSideInstructions);
        this.CoroutineDebuggingKt.postDelayed(new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda2(this, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SENSING, this.llIIIlllll.firstSideInstructions), 0L);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onFirstSideScanSuccess(boolean z, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation) {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState;
        this._CREATION = true;
        this.getOutputSizeshNQ4ISI = z;
        this.getOutputSizes = cardRotation;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = z ? com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.TURN_PAGE : com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.FLIP_CARD;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState3 = this.lllIIIlIlI;
        if (reticleUiState3 == reticleUiState2 || reticleUiState3 == (reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS_FIRST_SIDE)) {
            return;
        }
        changeState(reticleUiState, "");
        java.lang.String str = this.llIIIlllll.flipInstructions;
        if (z) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.Camera2StreamConfigurationMap[this.getOutputSizes.ordinal()];
            if (i == 1 || i == 2) {
                str = this.llIIIlllll.turnTopPageInstructions;
            } else if (i == 3) {
                str = this.llIIIlllll.turnRightPageInstructions;
            } else if (i == 4) {
                str = this.llIIIlllll.turnLeftPageInstructions;
            }
        }
        this.CoroutineDebuggingKt.postDelayed(new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda2(this, reticleUiState2, str), reticleUiState.minDurationMs);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onGlare(boolean z) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onMovingCloserToBarcodeRequired() {
        this.getOutputStallDuration = true;
        changeState(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SENSING, this.llIIIlllll.backSideBarcodeInstructions);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError processingError) {
        int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.getHighSpeedVideoFpsRanges[processingError.ordinal()];
        if (i != 1) {
            if (i == 2) {
                changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.FACE_PHOTO_NOT_FULLY_VISIBLE, this.llIIIlllll.errorFacePhotoNotFullyVisible);
            } else if (i != 3) {
                if (i == 4) {
                    changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.BLUR_DETECTED, this.llIIIlllll.errorBlurDetected);
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.GLARE_DETECTED, this.llIIIlllll.errorGlareDetected);
                    return;
                }
            }
            changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.DOCUMENT_NOT_FULLY_VISIBLE, this.IllIIIIllI);
            return;
        }
        java.lang.String str = this.llIIIlllll.errorScanningWrongSide;
        if (this.getOutputSizeshNQ4ISI) {
            int i2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.Camera2StreamConfigurationMap[this.getOutputSizes.ordinal()];
            if (i2 == 1 || i2 == 2) {
                str = this.llIIIlllll.errorScanningWrongPageTop;
            } else if (i2 == 3) {
                str = this.llIIIlllll.errorScanningWrongPageRight;
            } else if (i2 == 4) {
                str = this.llIIIlllll.errorScanningWrongPageLeft;
            }
        }
        changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SCANNING_WRONG_SIDE, str);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public long onScanSuccess() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState = this.lllIIIlIlI;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS;
        if (reticleUiState == reticleUiState2) {
            return 0L;
        }
        changeState(reticleUiState2, "");
        return reticleUiState2.minDurationMs;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onSecondSideScanStarted() {
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings = this.llIIIlllll;
        java.lang.String str = reticleOverlayStrings.backSideInstructions;
        if (this.getOutputStallDuration) {
            str = reticleOverlayStrings.backSideBarcodeInstructions;
        } else if (this.getOutputSizeshNQ4ISI) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.Camera2StreamConfigurationMap[this.getOutputSizes.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    str = this.llIIIlllll.rightPageInstructions;
                } else if (i == 4) {
                    str = this.llIIIlllll.leftPageInstructions;
                }
            }
            str = this.llIIIlllll.topPageInstructions;
        }
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.AFTER_CARD_FLIP;
        changeState(reticleUiState, "");
        this.CoroutineDebuggingKt.postDelayed(new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView$$ExternalSyntheticLambda2(this, reticleUiState, str), 350L);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onTorchStateChanged(boolean z) {
        if (this.toString) {
            if (z) {
                android.widget.ImageView imageView = this.Camera2StreamConfigurationMap;
                imageView.announceForAccessibility(imageView.getContext().getString(com.microblink.blinkid.library.R.string.mb_flashlight_on));
                android.widget.ImageView imageView2 = this.Camera2StreamConfigurationMap;
                imageView2.setContentDescription(imageView2.getContext().getString(com.microblink.blinkid.library.R.string.mb_turn_flashlight_off));
                this.accessartificialFrame.showSnackbar();
                return;
            }
            android.widget.ImageView imageView3 = this.Camera2StreamConfigurationMap;
            imageView3.announceForAccessibility(imageView3.getContext().getString(com.microblink.blinkid.library.R.string.mb_flashlight_off));
            android.widget.ImageView imageView4 = this.Camera2StreamConfigurationMap;
            imageView4.setContentDescription(imageView4.getContext().getString(com.microblink.blinkid.library.R.string.mb_turn_flashlight_on));
            this.accessartificialFrame.hideSnackbar();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setRecognizerSupportsClassification(boolean z) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setScanRecognitionModeOverlay(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode scanRecognitionMode) {
        this.ArtificialStackFrames = scanRecognitionMode;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setShowBackSideBarcodeInstructions(boolean z) {
        this.getOutputStallDuration = z;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setMandatoryFieldsMissingTooltipText(int[] iArr, android.app.Activity activity) {
        java.lang.String str;
        if (activity != null && iArr != null && this._BOUNDARY) {
            if (iArr.length == 1) {
                str = activity.getString(com.microblink.blinkid.library.R.string.mb_blinkid_mf_keep_fields_visible_singular, activity.getString(iArr[0]));
            } else if (iArr.length != 2) {
                str = "";
            } else {
                str = activity.getString(com.microblink.blinkid.library.R.string.mb_blinkid_mf_keep_fields_visible_plural, activity.getString(iArr[0]), activity.getString(iArr[1]));
            }
        } else {
            str = this.llIIIlllll.errorDocumentNotFullyVisible;
        }
        this.IllIIIIllI = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(int i) {
        android.view.ViewGroup viewGroup = this.unwrapAs;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
            android.view.View findViewById2 = this.unwrapAs.findViewById(com.microblink.blinkid.library.R.id.blinkidHelpButton);
            android.view.View currentView = ((android.widget.TextSwitcher) this.unwrapAs.findViewById(com.microblink.blinkid.library.R.id.instructionsView)).getCurrentView();
            android.widget.ImageView imageView = this.Camera2StreamConfigurationMap;
            android.view.View[] viewArr = {findViewById, imageView, findViewById2, this.getInputSizeshNQ4ISI, imageView, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoSizes, currentView};
            for (int i2 = 0; i2 < 10; i2++) {
                android.view.View view = viewArr[i2];
                if (view != null) {
                    view.setImportantForAccessibility(i);
                }
            }
        }
    }

    protected final void llIIlIlIIl(android.app.Activity activity) {
        if (this.llIIIlllll == null) {
            this.llIIIlllll = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.getHighSpeedVideoFpsRanges(activity);
        }
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode scanRecognitionMode = this.ArtificialStackFrames;
        if (scanRecognitionMode != null) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.getHighSpeedVideoFpsRangesFor[scanRecognitionMode.ordinal()];
            if (i == 1) {
                this.llIIIlllll = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder(activity).setFirstSideInstructionsText(activity.getString(com.microblink.blinkid.library.R.string.mb_blinkid_back_instructions_barcode)).build();
            } else if (i == 2) {
                this.llIIIlllll = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder(activity).setFirstSideInstructionsText(activity.getString(com.microblink.blinkid.library.R.string.mb_blinkid_instructions_mrz)).build();
            } else if (i == 3) {
                this.llIIIlllll = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings.Builder(activity).setFirstSideInstructionsText(activity.getString(com.microblink.blinkid.library.R.string.mb_blinkid_instructions_photo)).build();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$ATWjpKmreqYbwU1WkD8Oj9iSb6g(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView reticleOverlayView, android.widget.TextView textView) {
        textView.setLineSpacing(4.0f, 1.0f);
        textView.setTextAppearance(textView.getContext(), reticleOverlayView.getOutputStallDurationlomOqCM.f3956a);
    }

    public static /* synthetic */ void $r8$lambda$P5cqD3HswlDJayu6GBH8STuGcLI(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView reticleOverlayView, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState reticleUiState2, java.lang.String str) {
        android.os.Vibrator vibrator;
        android.os.Vibrator vibrator2;
        reticleOverlayView.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes();
        if (reticleOverlayView.lllIIIlIlI.shouldShowProgress) {
            reticleOverlayView.getHighSpeedVideoSizes.setVisibility(0);
        } else {
            reticleOverlayView.getHighSpeedVideoSizes.setVisibility(8);
        }
        if (reticleOverlayView.lllIIIlIlI.shouldShowInnerReticle) {
            reticleOverlayView.getHighResolutionOutputSizeshNQ4ISI.setVisibility(0);
        } else {
            reticleOverlayView.getHighResolutionOutputSizeshNQ4ISI.setVisibility(8);
        }
        reticleOverlayView.getInputSizeshNQ4ISI.setType(reticleUiState2.reticleType);
        if (reticleUiState.isDetectionError) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.getHighSpeedVideoSizes[reticleOverlayView.lllIIIlIlI.getHighSpeedVideoSizes.hurried().ordinal()];
            if (i == 1) {
                reticleOverlayView.getInputFormats.updateStatusImmediately(str);
            } else if (i == 2) {
                reticleOverlayView.getInputFormats.updateStatus(str);
            }
        } else {
            int i2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.getHighSpeedVideoSizes[reticleOverlayView.lllIIIlIlI.getHighSpeedVideoSizes.ordinal()];
            if (i2 == 1) {
                reticleOverlayView.getInputFormats.updateStatusImmediately(str);
            } else if (i2 == 2) {
                reticleOverlayView.getInputFormats.updateStatus(str);
            }
        }
        reticleOverlayView.getOutputMinFrameDurationlomOqCM = reticleOverlayView.lllIIIlIlI.cardAnimator;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation documentRotation = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.ZERO;
        int i3 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.AnonymousClass1.Camera2StreamConfigurationMap[reticleOverlayView.getOutputSizes.ordinal()];
        if (i3 == 2) {
            documentRotation = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.UPSIDE_DOWN;
        } else if (i3 == 3) {
            documentRotation = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.CLOCKWISE_90;
        } else if (i3 == 4) {
            documentRotation = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.CardAnimator.DocumentRotation.COUNTER_CLOCKWISE_90;
        }
        reticleOverlayView.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(documentRotation, reticleOverlayView.getHighSpeedVideoFpsRangesFor, reticleOverlayView.getOutputStallDurationlomOqCM);
        reticleOverlayView.getHighResolutionOutputSizeshNQ4ISI.setAnimationEnabled(reticleOverlayView.lllIIIlIlI.shouldShowInnerReticle);
        reticleOverlayView.getHighSpeedVideoSizes.setAnimationEnabled(reticleOverlayView.lllIIIlIlI.shouldShowProgress);
        if (reticleUiState2 != com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS) {
            if (reticleUiState2 == com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS_FIRST_SIDE) {
                if (reticleOverlayView.f3958a && (vibrator = reticleOverlayView.getARTIFICIAL_FRAME_PACKAGE_NAME) != null) {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(100L, 50));
                }
                android.view.ViewGroup viewGroup = reticleOverlayView.unwrapAs;
                viewGroup.announceForAccessibility(viewGroup.getContext().getString(com.microblink.blinkid.library.R.string.mb_success_first_side_scanned));
                return;
            }
            return;
        }
        if (reticleOverlayView.f3958a && (vibrator2 = reticleOverlayView.getARTIFICIAL_FRAME_PACKAGE_NAME) != null) {
            vibrator2.vibrate(android.os.VibrationEffect.createOneShot(100L, 50));
        }
        android.view.ViewGroup viewGroup2 = reticleOverlayView.unwrapAs;
        viewGroup2.announceForAccessibility(viewGroup2.getContext().getString(com.microblink.blinkid.library.R.string.mb_success_document_scanned));
        reticleOverlayView.getValidOutputFormatsForInputhNQ4ISI.setVisibility(0);
        reticleOverlayView.getValidOutputFormatsForInputhNQ4ISI.startAnimation();
    }

    public static /* synthetic */ void $r8$lambda$U3DfPXCWX3K_xqB6wI_fzywWai4(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView reticleOverlayView, android.widget.TextView textView) {
        textView.setLineSpacing(4.0f, 1.0f);
        textView.setTextAppearance(textView.getContext(), reticleOverlayView.getOutputStallDurationlomOqCM.getARTIFICIAL_FRAME_PACKAGE_NAME);
    }

    public static /* synthetic */ void $r8$lambda$lA2W6Xw7G8G5JpXLsagFUu9M9Uo(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView reticleOverlayView, android.view.View view) {
        reticleOverlayView.isOutputSupportedForhNQ4ISI.showOnboarding();
        reticleOverlayView.getHighSpeedVideoSizes(2);
    }
}
