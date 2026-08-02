package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ContactUsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> getHighSpeedVideoFpsRangesFor;

    private ContactUsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider3) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase fetchContactUsTopicsUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel(fetchContactUsTopicsUseCase, fetchRecommendedArticlesUseCase, fetchArticleUseCase);
    }
}
