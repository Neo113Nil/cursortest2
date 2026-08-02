package com.paypal.oslo.feature.oneonboarding.domain.usecase;

/* loaded from: classes13.dex */
public final class GetFlowUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository> getHighSpeedVideoFpsRanges;

    private GetFlowUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository> provider) {
        return new com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase newInstance(com.paypal.oslo.feature.oneonboarding.domain.repository.FlowStepRepository flowStepRepository) {
        return new com.paypal.oslo.feature.oneonboarding.domain.usecase.GetFlowUseCase(flowStepRepository);
    }
}
