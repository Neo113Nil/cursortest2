package com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount;

/* loaded from: classes11.dex */
public final class PrequalificationAmountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> Camera2StreamConfigurationMap;

    private PrequalificationAmountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository prequalificationSummaryRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.PrequalificationAmountUseCase(prequalificationSummaryRepository);
    }
}
