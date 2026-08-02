package com.paypal.oslo.feature.onboarding.steps.nav.data;

/* loaded from: classes13.dex */
public final class CosFlowStepService_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi> getHighSpeedVideoFpsRanges;

    private CosFlowStepService_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi> provider) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService newInstance(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi cosFlowStepApi) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService(cosFlowStepApi);
    }
}
