package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
public class BlinkCardDialogOnboardingPresenter implements com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter {
    private final long Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.BaseOverlayController getHighSpeedVideoSizes;
    public final java.util.concurrent.atomic.AtomicBoolean introductionDialogShown = new java.util.concurrent.atomic.AtomicBoolean(false);

    public BlinkCardDialogOnboardingPresenter(com.microblink.blinkid.fragment.overlay.BaseOverlayController baseOverlayController, com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView onboardingView, long j) {
        this.getHighSpeedVideoSizes = baseOverlayController;
        this.getHighResolutionOutputSizeshNQ4ISI = onboardingView;
        this.Camera2StreamConfigurationMap = j;
        onboardingView.attachPresenter(this);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void onFirstSideScanStarted() {
        if (this.introductionDialogShown.getAndSet(true)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.showIntroductionDialog(this.getHighSpeedVideoSizes.getContext());
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowClosed() {
        this.getHighSpeedVideoSizes.resumeScanning();
        this.getHighResolutionOutputSizeshNQ4ISI.showOnboardingTooltipDelayed(this.Camera2StreamConfigurationMap, false);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowDisplayed() {
        this.getHighSpeedVideoSizes.pauseScanning();
        this.getHighResolutionOutputSizeshNQ4ISI.cancelDelayedTooltip();
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowRefused() {
        this.getHighSpeedVideoSizes.resumeScanning();
        this.getHighResolutionOutputSizeshNQ4ISI.showOnboardingTooltipDelayed(this.Camera2StreamConfigurationMap, false);
    }
}
