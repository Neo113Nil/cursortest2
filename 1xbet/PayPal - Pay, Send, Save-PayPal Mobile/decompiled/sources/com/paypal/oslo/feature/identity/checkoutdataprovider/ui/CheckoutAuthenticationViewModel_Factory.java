package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

/* loaded from: classes12.dex */
public final class CheckoutAuthenticationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> getHighSpeedVideoSizes;

    private CheckoutAuthenticationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider5) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel newInstance(com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel(checkoutInputDataStore, checkoutOutputDataStore, authCodeDataStore, identityTokenStorage, identityAnalyticsTracker);
    }
}
