package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ArticleFullScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> Camera2StreamConfigurationMap;

    private ArticleFullScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel(fetchArticleUseCase);
    }
}
