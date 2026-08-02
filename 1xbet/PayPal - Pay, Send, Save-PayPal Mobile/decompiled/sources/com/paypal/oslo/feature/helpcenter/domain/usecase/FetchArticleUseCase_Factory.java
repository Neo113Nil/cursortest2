package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchArticleUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository> getHighSpeedVideoFpsRanges;

    private FetchArticleUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.ArticleRepository articleRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase(articleRepository);
    }
}
