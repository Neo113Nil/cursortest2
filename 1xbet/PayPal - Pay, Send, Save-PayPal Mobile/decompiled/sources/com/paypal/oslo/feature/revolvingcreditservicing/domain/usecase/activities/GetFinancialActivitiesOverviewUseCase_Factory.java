package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities;

/* loaded from: classes14.dex */
public final class GetFinancialActivitiesOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> Camera2StreamConfigurationMap;

    private GetFinancialActivitiesOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository financialActivityRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesOverviewUseCase(financialActivityRepository);
    }
}
