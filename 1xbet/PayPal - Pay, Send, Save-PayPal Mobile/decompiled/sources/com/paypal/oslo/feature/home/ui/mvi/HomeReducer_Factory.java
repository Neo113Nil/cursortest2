package com.paypal.oslo.feature.home.ui.mvi;

/* loaded from: classes12.dex */
public final class HomeReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.mvi.HomeReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> getHighSpeedVideoSizes;

    private HomeReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.mvi.HomeReducer get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.home.ui.mvi.HomeReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider2) {
        return new com.paypal.oslo.feature.home.ui.mvi.HomeReducer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.ui.mvi.HomeReducer newInstance(com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter homeNavigationRouter, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        return new com.paypal.oslo.feature.home.ui.mvi.HomeReducer(homeNavigationRouter, loadingSectionProvider);
    }
}
