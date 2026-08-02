package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchRecommendedArticlesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository> getHighSpeedVideoFpsRanges;

    private FetchRecommendedArticlesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository helpCenterRecommendedArticlesRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase(helpCenterRecommendedArticlesRepository);
    }
}
