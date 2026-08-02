package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPayLaterHubOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> Camera2StreamConfigurationMap;

    private GetPayLaterHubOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> provider) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase newInstance(com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository) {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase(payLaterHubRepository);
    }
}
