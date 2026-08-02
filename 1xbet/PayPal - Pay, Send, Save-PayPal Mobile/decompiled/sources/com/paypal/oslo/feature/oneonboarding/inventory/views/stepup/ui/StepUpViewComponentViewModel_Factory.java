package com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui;

/* loaded from: classes13.dex */
public final class StepUpViewComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> getHighSpeedVideoFpsRangesFor;

    private StepUpViewComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.stepup.StepupChallengeHandler> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel newInstance(com.paypal.oslo.core.identity.stepup.StepupChallengeHandler stepupChallengeHandler) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.stepup.ui.StepUpViewComponentViewModel(stepupChallengeHandler);
    }
}
