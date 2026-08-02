package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchEducationalSheetDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> getHighSpeedVideoSizes;

    private FetchEducationalSheetDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider2) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase(fetchIpsArticlesUseCase, fetchArticleUseCase);
    }
}
