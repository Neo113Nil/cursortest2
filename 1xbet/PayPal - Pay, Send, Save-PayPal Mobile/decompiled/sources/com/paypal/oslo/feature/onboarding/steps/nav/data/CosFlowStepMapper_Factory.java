package com.paypal.oslo.feature.onboarding.steps.nav.data;

/* loaded from: classes13.dex */
public final class CosFlowStepMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> getHighResolutionOutputSizeshNQ4ISI;

    private CosFlowStepMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper newInstance(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepMapper(errorMapper);
    }
}
