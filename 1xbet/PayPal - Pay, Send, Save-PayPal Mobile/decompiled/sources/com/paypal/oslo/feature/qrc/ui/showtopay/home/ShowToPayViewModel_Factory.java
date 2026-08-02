package com.paypal.oslo.feature.qrc.ui.showtopay.home;

/* loaded from: classes14.dex */
public final class ShowToPayViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> getHighSpeedVideoFpsRanges;

    private ShowToPayViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> provider2) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel newInstance(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayReducer showToPayReducer, com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher locationMatcher) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel(showToPayReducer, locationMatcher);
    }
}
