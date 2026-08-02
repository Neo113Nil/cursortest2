package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class HelpCenterHomeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase> getHighSpeedVideoSizes;

    private HelpCenterHomeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase> provider2) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchRecommendedArticlesUseCase fetchRecommendedArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.GetUserFirstNameUseCase getUserFirstNameUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterHomeViewModel(fetchRecommendedArticlesUseCase, getUserFirstNameUseCase);
    }
}
