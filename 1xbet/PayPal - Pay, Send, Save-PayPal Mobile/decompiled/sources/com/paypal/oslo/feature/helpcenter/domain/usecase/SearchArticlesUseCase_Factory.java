package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class SearchArticlesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository> getHighSpeedVideoFpsRanges;

    private SearchArticlesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository searchArticlesRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase(searchArticlesRepository);
    }
}
