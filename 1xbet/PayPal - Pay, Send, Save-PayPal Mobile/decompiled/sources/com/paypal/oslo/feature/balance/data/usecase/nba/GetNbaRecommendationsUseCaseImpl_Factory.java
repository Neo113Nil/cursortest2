package com.paypal.oslo.feature.balance.data.usecase.nba;

/* loaded from: classes11.dex */
public final class GetNbaRecommendationsUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> Camera2StreamConfigurationMap;

    private GetNbaRecommendationsUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl(nbaRepository);
    }
}
