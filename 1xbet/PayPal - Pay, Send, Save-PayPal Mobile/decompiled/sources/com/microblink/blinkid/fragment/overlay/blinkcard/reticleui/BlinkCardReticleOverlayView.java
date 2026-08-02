package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
public class BlinkCardReticleOverlayView implements com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView {
    private android.widget.ImageView CoroutineDebuggingKt;
    private android.app.Activity coroutineBoundary;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private android.widget.ImageView getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getInputFormats;
    private final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView getOutputFormats;
    private com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources getOutputMinFrameDuration;
    private com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView getOutputMinFrameDurationlomOqCM;
    private com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager getOutputSizes;
    private com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;
    private android.widget.TextView getValidOutputFormatsForInputhNQ4ISI;
    private com.microblink.blinkid.fragment.overlay.reticle.ReticleView isOutputSupportedForhNQ4ISI;
    protected com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings llIIIlllll;
    private com.microblink.blinkid.fragment.overlay.reticle.ProgressView toString;
    private final boolean unwrapAs;
    private final android.os.Handler isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
    protected com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState llIIlIIlll = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.SENSING;
    private long Camera2StreamConfigurationMap = 0;
    private boolean getOutputSizeshNQ4ISI = false;
    private com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator getHighSpeedVideoSizesFor = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator.EMPTY;
    private boolean getHighSpeedVideoSizes = false;
    private android.view.View.OnClickListener getInputSizeshNQ4ISI = null;

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.IMMEDIATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode.DELAYED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.microblink.blinkid.view.recognition.DetectionStatus.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.view.recognition.DetectionStatus.FALLBACK_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_FAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_CLOSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_PARTIALLY_VISIBLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_TOO_CLOSE_TO_CAMERA_EDGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public BlinkCardReticleOverlayView(boolean z, boolean z2, boolean z3, boolean z4, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings blinkCardReticleOverlayStrings, int i) {
        this.getInputFormats = z;
        this.getOutputStallDurationlomOqCM = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.unwrapAs = z4;
        this.llIIIlllll = blinkCardReticleOverlayStrings;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (z3 || z4) {
            this.getOutputFormats = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView(z3, z4);
        } else {
            this.getOutputFormats = null;
        }
    }

    public void animateAndShowManualEntryButton() {
        this.getValidOutputFormatsForInputhNQ4ISI.setTranslationY((int) this.coroutineBoundary.getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_margin_bottom_manual_entry_btn));
        this.getValidOutputFormatsForInputhNQ4ISI.animate().setInterpolator(new android.view.animation.OvershootInterpolator()).translationY(0.0f).setDuration(500L);
        this.getValidOutputFormatsForInputhNQ4ISI.setVisibility(0);
    }

    public void changeState(final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState, final java.lang.String str) {
        this.Camera2StreamConfigurationMap = java.lang.System.currentTimeMillis();
        final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2 = this.llIIlIIlll;
        this.llIIlIIlll = blinkCardReticleUiState;
        this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.$r8$lambda$FB2RIwbM8AuWKS5GQKlaE2OtZSY(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this, blinkCardReticleUiState2, blinkCardReticleUiState, str);
            }
        });
    }

    public void changeStateIfRequired(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState, java.lang.String str) {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState3 = this.llIIlIIlll;
        if (blinkCardReticleUiState3 == blinkCardReticleUiState) {
            this.Camera2StreamConfigurationMap = java.lang.System.currentTimeMillis();
            return;
        }
        if (blinkCardReticleUiState != com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.ERROR_DIALOG) {
            com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState4 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.SUCCESS;
            if (blinkCardReticleUiState3 == blinkCardReticleUiState4) {
                return;
            }
            if (blinkCardReticleUiState != blinkCardReticleUiState4 && ((!blinkCardReticleUiState3.isDetectionError || blinkCardReticleUiState3 == com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.DOCUMENT_NOT_IN_HAND || blinkCardReticleUiState != com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.PROCESSING) && ((blinkCardReticleUiState3 != (blinkCardReticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.PROCESSING) || blinkCardReticleUiState != com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.DOCUMENT_NOT_IN_HAND) && ((blinkCardReticleUiState3 != blinkCardReticleUiState2 || !blinkCardReticleUiState.isProcessingError) && java.lang.System.currentTimeMillis() - this.Camera2StreamConfigurationMap < this.llIIlIIlll.minDurationMs)))) {
                return;
            }
        }
        changeState(blinkCardReticleUiState, str);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void cleanup() {
        this.isOutputSupportedForhNQ4ISI.clearAnimation();
        this.getOutputMinFrameDurationlomOqCM.setAnimationEnabled(false);
        this.toString.setAnimationEnabled(false);
        this.isOutputSupportedFor.removeCallbacksAndMessages(null);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public android.view.ViewGroup createLayout(final android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView;
        this.coroutineBoundary = activity;
        if (this.llIIIlllll == null) {
            this.llIIIlllll = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings.getHighSpeedVideoFpsRangesFor(activity);
        }
        this.getOutputMinFrameDuration = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources(activity, this.getHighResolutionOutputSizeshNQ4ISI);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.lIlIIIIlIl, (android.view.ViewGroup) recognizerRunnerView, false);
        com.microblink.blinkid.fragment.overlay.reticle.ReticleView reticleView = (com.microblink.blinkid.fragment.overlay.reticle.ReticleView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.reticleView);
        this.isOutputSupportedForhNQ4ISI = reticleView;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources = this.getOutputMinFrameDuration;
        reticleView.setDrawables(blinkCardReticleOverlayResources.getInputFormats, blinkCardReticleOverlayResources.getValidOutputFormatsForInputhNQ4ISI, blinkCardReticleOverlayResources.getOutputMinFrameDuration);
        com.microblink.blinkid.fragment.overlay.reticle.ProgressView progressView = (com.microblink.blinkid.fragment.overlay.reticle.ProgressView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.progressView);
        this.toString = progressView;
        progressView.setup(this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI);
        this.CoroutineDebuggingKt = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.cardAnimationView);
        com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView innerReticleView = (com.microblink.blinkid.fragment.overlay.reticle.InnerReticleView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.innerReticleView);
        this.getOutputMinFrameDurationlomOqCM = innerReticleView;
        innerReticleView.setup(this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.poweredByMicroblinkView);
        if (!com.microblink.blinkid.recognition.RightsManager.llIIIlllll() || !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_REMOVE_PRODUCTION_OVERLAY)) {
            imageView.setVisibility(0);
        }
        android.widget.TextSwitcher textSwitcher = (android.widget.TextSwitcher) viewGroup.findViewById(com.microblink.blinkid.library.R.id.instructionsView);
        textSwitcher.setBackground(this.getOutputMinFrameDuration.getInputSizeshNQ4ISI);
        com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager statusTextManager = new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager(textSwitcher, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda6
            @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler
            public final void applyStyle(android.widget.TextView textView) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.$r8$lambda$wXD827VYznmamzKkXUSsWm0kMG0(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this, textView);
            }
        });
        this.getOutputSizes = statusTextManager;
        statusTextManager.setShouldAnimate(false);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
        if (this.getInputFormats) {
            imageView2.setImageDrawable(this.getOutputMinFrameDuration.Camera2StreamConfigurationMap);
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    activity.onBackPressed();
                }
            });
        } else {
            imageView2.setVisibility(8);
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton);
        this.getHighSpeedVideoFpsRanges = imageView3;
        if (this.getInputFormats) {
            imageView3.setVisibility(0);
        } else {
            imageView3.setVisibility(8);
            this.getHighSpeedVideoFpsRanges = null;
        }
        if (this.unwrapAs && this.getOutputFormats != null) {
            android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.microblink.blinkid.library.R.id.blinkcardHelpButton);
            imageButton.setImageDrawable(this.getOutputMinFrameDuration.getHighSpeedVideoSizes);
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this.getOutputFormats.showOnboarding();
                }
            });
        }
        this.getOutputStallDuration = new com.microblink.blinkid.fragment.overlay.components.snackbar.SnackbarManager((android.widget.ViewSwitcher) viewGroup.findViewById(com.microblink.blinkid.library.R.id.snackbarViewSwitcher), this.llIIIlllll.flashlightWarning, this.getOutputMinFrameDuration.getOutputMinFrameDurationlomOqCM, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda1
            @Override // com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler
            public final void applyStyle(android.widget.TextView textView) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.$r8$lambda$fHLK3zbaJhFmnekA8qRa8iylMJw(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this, textView);
            }
        });
        if ((this.unwrapAs || this.getHighSpeedVideoFpsRangesFor) && (blinkCardDialogOnboardingView = this.getOutputFormats) != null) {
            blinkCardDialogOnboardingView.setupOnboarding(viewGroup, (androidx.appcompat.app.AppCompatActivity) activity, this.getOutputMinFrameDuration, this.llIIIlllll);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.manual_entry);
        this.getValidOutputFormatsForInputhNQ4ISI = textView;
        textView.setText(this.llIIIlllll.manualEntry);
        this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.$r8$lambda$ajFvkHopPgolAyPWhHueJiZpeOE(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this);
            }
        });
        recognizerRunnerView.addChildView(viewGroup, false);
        return viewGroup;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.components.TorchController torchController = new com.microblink.blinkid.fragment.overlay.components.TorchController();
        android.widget.ImageView imageView = this.getHighSpeedVideoFpsRanges;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources = this.getOutputMinFrameDuration;
        torchController.setup(imageView, recognizerRunnerView, blinkCardReticleOverlayResources.unwrapAs, blinkCardReticleOverlayResources.getOutputStallDurationlomOqCM);
        return torchController;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void disableManualEntryButton() {
        this.getValidOutputFormatsForInputhNQ4ISI.setVisibility(8);
        this.getHighSpeedVideoSizes = false;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void enableManualEntryButton(final android.view.View.OnClickListener onClickListener) {
        if (this.getValidOutputFormatsForInputhNQ4ISI.getVisibility() == 0) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        animateAndShowManualEntryButton();
        android.view.View.OnClickListener onClickListener2 = new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.$r8$lambda$qvfqlHCMWKBWdUbj_HX3zUNdGJ8(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this, onClickListener, view);
            }
        };
        this.getValidOutputFormatsForInputhNQ4ISI.setOnClickListener(onClickListener2);
        this.getInputSizeshNQ4ISI = onClickListener2;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView() {
        return this.getOutputFormats;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings blinkCardReticleOverlayStrings = this.llIIIlllll;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(blinkCardReticleOverlayStrings.recognitionTimeoutTitle, blinkCardReticleOverlayStrings.recognitionTimeoutMessage, blinkCardReticleOverlayStrings.retryButton);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onCardDetectionUpdate(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.SENSING;
        java.lang.String str = this.getOutputSizeshNQ4ISI ? this.llIIIlllll.backSideInstructions : this.llIIIlllll.frontSideInstructions;
        switch (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.AnonymousClass1.getHighSpeedVideoSizes[detectionStatus.ordinal()]) {
            case 1:
            case 2:
                blinkCardReticleUiState = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.PROCESSING;
                break;
            case 3:
                blinkCardReticleUiState = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.CAMERA_TOO_HIGH;
                str = this.llIIIlllll.errorMoveCloser;
                break;
            case 4:
            case 5:
                blinkCardReticleUiState = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.CAMERA_TOO_CLOSE;
                str = this.llIIIlllll.errorMoveFarther;
                break;
            case 6:
                blinkCardReticleUiState = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.DOCUMENT_TOO_CLOSE_TO_EDGE;
                str = this.llIIIlllll.errorCardTooCloseToEdge;
                break;
        }
        android.util.Pair pair = new android.util.Pair(blinkCardReticleUiState, str);
        changeStateIfRequired((com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState) pair.first, (java.lang.String) pair.second);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onConfigurationChanged(int i) {
        this.getOutputMinFrameDurationlomOqCM.onConfigurationChanged();
        this.toString.onConfigurationChanged();
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView = this.getOutputFormats;
        if (blinkCardDialogOnboardingView != null) {
            blinkCardDialogOnboardingView.onConfigurationChanged();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onErrorDialogShown() {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState = this.llIIlIIlll;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.ERROR_DIALOG;
        if (blinkCardReticleUiState != blinkCardReticleUiState2) {
            changeState(blinkCardReticleUiState2, "");
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onFirstSideScanStarted() {
        this.getOutputSizeshNQ4ISI = false;
        changeState(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.SENSING, this.llIIIlllll.frontSideInstructions);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onFrameProcessingStatus(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus blinkCardProcessingStatus) {
        if (blinkCardProcessingStatus == com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus.FieldIdentificationFailed) {
            changeState(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.DOCUMENT_NOT_FULLY_VISIBLE, this.llIIIlllll.errorCardNotFullyVisible);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public long onScanSuccess() {
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState = this.llIIlIIlll;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.SUCCESS;
        if (blinkCardReticleUiState == blinkCardReticleUiState2) {
            return 0L;
        }
        changeState(blinkCardReticleUiState2, "");
        return blinkCardReticleUiState2.minDurationMs;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onSecondSideScanStarted() {
        this.getOutputSizeshNQ4ISI = true;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState = this.llIIlIIlll;
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.FLIP_CARD;
        if (blinkCardReticleUiState == blinkCardReticleUiState2) {
            return;
        }
        changeState(blinkCardReticleUiState2, this.llIIIlllll.flipCardInstructions);
        final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState3 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState.AFTER_CARD_FLIP;
        final java.lang.String str = "";
        this.isOutputSupportedFor.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this.changeState(blinkCardReticleUiState3, str);
            }
        }, blinkCardReticleUiState2.minDurationMs);
        final java.lang.String str2 = this.llIIIlllll.backSideInstructions;
        this.isOutputSupportedFor.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.this.changeState(blinkCardReticleUiState3, str2);
            }
        }, blinkCardReticleUiState2.minDurationMs + 350);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView
    public void onTorchStateChanged(boolean z) {
        if (this.getOutputStallDurationlomOqCM) {
            if (z) {
                this.getOutputStallDuration.showSnackbar();
            } else {
                this.getOutputStallDuration.hideSnackbar();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$FB2RIwbM8AuWKS5GQKlaE2OtZSY(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView blinkCardReticleOverlayView, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleUiState blinkCardReticleUiState2, java.lang.String str) {
        blinkCardReticleOverlayView.getHighSpeedVideoSizesFor.cancel();
        if (blinkCardReticleOverlayView.llIIlIIlll.shouldShowProgress) {
            blinkCardReticleOverlayView.toString.setVisibility(0);
        } else {
            blinkCardReticleOverlayView.toString.setVisibility(8);
        }
        if (blinkCardReticleOverlayView.llIIlIIlll.shouldShowInnerReticle) {
            blinkCardReticleOverlayView.getOutputMinFrameDurationlomOqCM.setVisibility(0);
        } else {
            blinkCardReticleOverlayView.getOutputMinFrameDurationlomOqCM.setVisibility(8);
        }
        blinkCardReticleOverlayView.isOutputSupportedForhNQ4ISI.setType(blinkCardReticleUiState2.reticleType);
        if (blinkCardReticleUiState.isDetectionError) {
            int i = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.AnonymousClass1.getHighSpeedVideoFpsRanges[blinkCardReticleOverlayView.llIIlIIlll.Camera2StreamConfigurationMap.hurried().ordinal()];
            if (i == 1) {
                blinkCardReticleOverlayView.getOutputSizes.updateStatusImmediately(str);
            } else if (i == 2) {
                blinkCardReticleOverlayView.getOutputSizes.updateStatus(str);
            }
        } else {
            int i2 = com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView.AnonymousClass1.getHighSpeedVideoFpsRanges[blinkCardReticleOverlayView.llIIlIIlll.Camera2StreamConfigurationMap.ordinal()];
            if (i2 == 1) {
                blinkCardReticleOverlayView.getOutputSizes.updateStatusImmediately(str);
            } else if (i2 == 2) {
                blinkCardReticleOverlayView.getOutputSizes.updateStatus(str);
            }
        }
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.CardAnimator cardAnimator = blinkCardReticleOverlayView.llIIlIIlll.cardAnimator;
        blinkCardReticleOverlayView.getHighSpeedVideoSizesFor = cardAnimator;
        cardAnimator.start(blinkCardReticleOverlayView.CoroutineDebuggingKt, blinkCardReticleOverlayView.getOutputMinFrameDuration);
        blinkCardReticleOverlayView.getOutputMinFrameDurationlomOqCM.setAnimationEnabled(blinkCardReticleOverlayView.llIIlIIlll.shouldShowInnerReticle);
        blinkCardReticleOverlayView.toString.setAnimationEnabled(blinkCardReticleOverlayView.llIIlIIlll.shouldShowProgress);
    }

    public static /* synthetic */ void $r8$lambda$ajFvkHopPgolAyPWhHueJiZpeOE(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView blinkCardReticleOverlayView) {
        if (blinkCardReticleOverlayView.getHighSpeedVideoSizes) {
            blinkCardReticleOverlayView.getValidOutputFormatsForInputhNQ4ISI.setOnClickListener(blinkCardReticleOverlayView.getInputSizeshNQ4ISI);
            blinkCardReticleOverlayView.animateAndShowManualEntryButton();
        }
    }

    public static /* synthetic */ void $r8$lambda$fHLK3zbaJhFmnekA8qRa8iylMJw(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView blinkCardReticleOverlayView, android.widget.TextView textView) {
        textView.setLineSpacing(4.0f, 1.0f);
        textView.setTextAppearance(textView.getContext(), blinkCardReticleOverlayView.getOutputMinFrameDuration.getOutputStallDuration);
    }

    public static /* synthetic */ void $r8$lambda$qvfqlHCMWKBWdUbj_HX3zUNdGJ8(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView blinkCardReticleOverlayView, android.view.View.OnClickListener onClickListener, android.view.View view) {
        if (blinkCardReticleOverlayView.getOutputStallDuration.isSnackbarShown()) {
            return;
        }
        onClickListener.onClick(view);
    }

    public static /* synthetic */ void $r8$lambda$wXD827VYznmamzKkXUSsWm0kMG0(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView blinkCardReticleOverlayView, android.widget.TextView textView) {
        textView.setLineSpacing(4.0f, 1.0f);
        textView.setTextAppearance(textView.getContext(), blinkCardReticleOverlayView.getOutputMinFrameDuration.accessartificialFrame);
    }
}
