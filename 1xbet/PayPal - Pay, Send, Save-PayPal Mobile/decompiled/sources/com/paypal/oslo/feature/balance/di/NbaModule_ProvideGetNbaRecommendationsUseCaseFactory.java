package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class NbaModule_ProvideGetNbaRecommendationsUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> Camera2StreamConfigurationMap;

    private NbaModule_ProvideGetNbaRecommendationsUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase get() {
        return provideGetNbaRecommendationsUseCase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.NbaModule_ProvideGetNbaRecommendationsUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.NbaModule_ProvideGetNbaRecommendationsUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase provideGetNbaRecommendationsUseCase(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository) {
        return (com.paypal.oslo.feature.balance.api.usecase.GetNbaRecommendationsUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.NbaModule.INSTANCE.provideGetNbaRecommendationsUseCase(nbaRepository));
    }
}
