package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities;

/* loaded from: classes14.dex */
public final class GetFinancialActivitiesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetFinancialActivitiesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository financialActivityRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.activities.GetFinancialActivitiesUseCase(financialActivityRepository);
    }
}
