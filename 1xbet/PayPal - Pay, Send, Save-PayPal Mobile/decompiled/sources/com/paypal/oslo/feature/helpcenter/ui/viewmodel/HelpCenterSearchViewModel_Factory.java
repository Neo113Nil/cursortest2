package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class HelpCenterSearchViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase> getHighSpeedVideoFpsRangesFor;

    private HelpCenterSearchViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase> provider) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.SearchArticlesUseCase searchArticlesUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.HelpCenterSearchViewModel(searchArticlesUseCase);
    }
}
