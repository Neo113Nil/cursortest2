package com.paypal.oslo.feature.onboarding.steps.nav.data;

/* loaded from: classes13.dex */
public final class NavigationOrchestrator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository> getHighSpeedVideoFpsRangesFor;

    private NavigationOrchestrator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator newInstance(com.paypal.oslo.feature.onboarding.steps.nav.domain.repository.FlowStepRepository flowStepRepository) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator(flowStepRepository);
    }
}
