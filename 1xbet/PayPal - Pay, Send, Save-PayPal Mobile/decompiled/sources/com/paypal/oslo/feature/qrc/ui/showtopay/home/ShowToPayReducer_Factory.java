package com.paypal.oslo.feature.qrc.ui.showtopay.home;

/* loaded from: classes14.dex */
public final class ShowToPayReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> getHighSpeedVideoFpsRanges;

    private ShowToPayReducer_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer newInstance(com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer(getCountriesListUseCase);
    }
}
