package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public class BlinkIdDialogOnboardingPresenter implements com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter {
    private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;
    public final java.util.concurrent.atomic.AtomicBoolean introductionDialogShown = new java.util.concurrent.atomic.AtomicBoolean(false);

    public BlinkIdDialogOnboardingPresenter(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView onboardingView, long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = blinkIdOverlayController;
        this.getHighSpeedVideoFpsRangesFor = onboardingView;
        this.getHighSpeedVideoSizes = j;
        onboardingView.attachPresenter(this);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void onFirstSideScanStarted() {
        if (this.introductionDialogShown.getAndSet(true)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.showIntroductionDialog(this.getHighResolutionOutputSizeshNQ4ISI.getContext());
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowClosed() {
        this.getHighResolutionOutputSizeshNQ4ISI.resumeScanning();
        this.getHighSpeedVideoFpsRangesFor.showOnboardingTooltipDelayed(this.getHighSpeedVideoSizes, false);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowDisplayed() {
        this.getHighResolutionOutputSizeshNQ4ISI.pauseScanning();
        this.getHighSpeedVideoFpsRangesFor.cancelDelayedTooltip();
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter
    public void overlayWindowRefused() {
        this.getHighResolutionOutputSizeshNQ4ISI.resumeScanning();
        this.getHighSpeedVideoFpsRangesFor.showOnboardingTooltipDelayed(this.getHighSpeedVideoSizes, false);
    }
}
