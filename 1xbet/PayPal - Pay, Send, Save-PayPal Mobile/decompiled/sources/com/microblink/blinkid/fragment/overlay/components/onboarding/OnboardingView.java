package com.microblink.blinkid.fragment.overlay.components.onboarding;

/* loaded from: classes10.dex */
public interface OnboardingView {
    void attachPresenter(com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter);

    void cancelDelayedTooltip();

    void showIntroductionDialog(android.content.Context context);

    void showOnboarding();

    void showOnboardingTooltipDelayed(long j, boolean z);
}
