package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
class ReticleOverlayResources extends com.microblink.blinkid.fragment.overlay.OverlayResources {
    final int ArtificialStackFrames;
    final int Camera2StreamConfigurationMap;
    final int CoroutineDebuggingKt;
    final android.graphics.drawable.Drawable _BOUNDARY;
    final android.graphics.drawable.Drawable _CREATION;

    /* renamed from: a, reason: collision with root package name */
    final int f3956a;
    final int accessartificialFrame;
    final int b;
    final android.graphics.drawable.Drawable c;
    final android.graphics.drawable.Drawable coroutineBoundary;
    final int coroutineCreation;
    final android.graphics.drawable.Drawable d;
    final int getARTIFICIAL_FRAME_PACKAGE_NAME;
    final android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final int getHighSpeedVideoSizesFor;
    final int getInputFormats;
    final int getInputSizeshNQ4ISI;
    final android.graphics.drawable.Drawable getOutputFormats;
    final int getOutputMinFrameDuration;
    final android.graphics.drawable.Drawable getOutputMinFrameDurationlomOqCM;
    final int getOutputSizes;
    final int getOutputSizeshNQ4ISI;
    final android.graphics.drawable.Drawable getOutputStallDuration;
    final int getOutputStallDurationlomOqCM;
    final android.graphics.drawable.Drawable getValidOutputFormatsForInputhNQ4ISI;
    final int init;
    final android.graphics.drawable.Drawable isOutputSupportedFor;
    final android.graphics.drawable.Drawable isOutputSupportedForhNQ4ISI;
    final int kernelVersion;
    final int toString;
    final android.graphics.drawable.Drawable unwrapAs;

    ReticleOverlayResources(android.app.Activity activity, int i) {
        super(activity, i, com.microblink.blinkid.library.R.style.MB_blinkid_reticle_overlay_style);
        this.isOutputSupportedFor = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleDefaultDrawable);
        this._CREATION = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleSuccessDrawable);
        this.getOutputMinFrameDurationlomOqCM = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleErrorDrawable);
        this.coroutineBoundary = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_torchOnDrawable);
        this._BOUNDARY = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_torchOffDrawable);
        this.getHighResolutionOutputSizeshNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_exitScanDrawable);
        this.getValidOutputFormatsForInputhNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_cardFrontDrawable);
        this.c = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_cardBackDrawable);
        this.d = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_passportTopPageDrawable);
        this.getOutputStallDuration = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_passportBottomPageDrawable);
        this.unwrapAs = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_passportPageHighlightDrawable);
        this.isOutputSupportedForhNQ4ISI = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_instructionsBackgroundDrawable);
        this.getOutputSizeshNQ4ISI = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_instructionsBackgroundColor);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_instructionsTextAppearance);
        this.coroutineCreation = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleColor);
        this.init = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleDefaultColor);
        this.getInputFormats = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_reticleErrorColor);
        this.toString = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_successFlashColor);
        this.getOutputStallDurationlomOqCM = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_onboardingPageIndicatorColor);
        this.getOutputFormats = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_flashlightWarningBackgroundDrawable);
        this.f3956a = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_flashlightWarningTextAppearance);
        this.getHighSpeedVideoFpsRangesFor = IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpButtonDrawable);
        this.getInputSizeshNQ4ISI = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpButtonBackgroundColor);
        this.getHighSpeedVideoSizesFor = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpButtonQuestionmarkColor);
        this.kernelVersion = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpTooltipTextAppearance);
        this.CoroutineDebuggingKt = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpTooltipColor);
        IlIllIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_helpTooltipBackground);
        this.getOutputMinFrameDuration = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_onboardingTitleTextAppearance);
        this.Camera2StreamConfigurationMap = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_onboardingMessageTextAppearance);
        this.getHighSpeedVideoFpsRanges = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_onboardingButtonTextAppearance);
        this.getHighSpeedVideoSizes = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_introductionTitleTextAppearance);
        this.ArtificialStackFrames = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_introductionMessageTextAppearance);
        this.b = IllIIIllII(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_introductionButtonTextAppearance);
        this.accessartificialFrame = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_onboardingBackgroundColor);
        this.getOutputSizes = llIIlIlIIl(com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay_mb_introductionBackgroundColor);
        llIIlIlIIl();
    }

    @Override // com.microblink.blinkid.fragment.overlay.OverlayResources
    public final int[] IlIllIlIIl() {
        return com.microblink.blinkid.library.R.styleable.BlinkIdReticleOverlay;
    }
}
