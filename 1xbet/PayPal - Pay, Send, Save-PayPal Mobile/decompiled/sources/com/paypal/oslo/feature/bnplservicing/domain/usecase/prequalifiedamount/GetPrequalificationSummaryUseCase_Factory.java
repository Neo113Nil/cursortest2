package com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount;

/* loaded from: classes11.dex */
public final class GetPrequalificationSummaryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetPrequalificationSummaryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository prequalificationSummaryRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase(prequalificationSummaryRepository);
    }
}
