package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPlanDetailsOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository> Camera2StreamConfigurationMap;

    private GetPlanDetailsOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository planDetailsOverviewRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase(planDetailsOverviewRepository);
    }
}
