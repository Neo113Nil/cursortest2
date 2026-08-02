package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPlanListOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetPlanListOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository planListRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanListOverviewUseCase(planListRepository);
    }
}
