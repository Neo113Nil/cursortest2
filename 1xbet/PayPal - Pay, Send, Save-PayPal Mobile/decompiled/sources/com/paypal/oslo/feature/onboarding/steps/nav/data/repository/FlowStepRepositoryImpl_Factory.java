package com.paypal.oslo.feature.onboarding.steps.nav.data.repository;

/* loaded from: classes13.dex */
public final class FlowStepRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService> getHighSpeedVideoFpsRanges;

    private FlowStepRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService> provider) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService cosFlowStepService) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl(cosFlowStepService);
    }
}
