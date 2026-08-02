package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class IpsArticleListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private IpsArticleListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> provider) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel(fetchIpsArticlesUseCase);
    }
}
