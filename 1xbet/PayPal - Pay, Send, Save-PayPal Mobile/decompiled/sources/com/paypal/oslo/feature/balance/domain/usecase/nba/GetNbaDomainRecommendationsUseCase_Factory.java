package com.paypal.oslo.feature.balance.domain.usecase.nba;

/* loaded from: classes11.dex */
public final class GetNbaDomainRecommendationsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> getHighSpeedVideoSizes;

    private GetNbaDomainRecommendationsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> provider) {
        return new com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase newInstance(com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository nbaRepository) {
        return new com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase(nbaRepository);
    }
}
