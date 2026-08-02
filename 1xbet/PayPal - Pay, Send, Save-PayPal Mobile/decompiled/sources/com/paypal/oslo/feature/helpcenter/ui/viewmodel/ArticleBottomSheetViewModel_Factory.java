package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ArticleBottomSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private ArticleBottomSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase> provider) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel(fetchArticleUseCase);
    }
}
