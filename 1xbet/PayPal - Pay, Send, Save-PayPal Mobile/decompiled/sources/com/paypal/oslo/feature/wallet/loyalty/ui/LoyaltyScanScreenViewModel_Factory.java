package com.paypal.oslo.feature.wallet.loyalty.ui;

/* loaded from: classes16.dex */
public final class LoyaltyScanScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private LoyaltyScanScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel(appNavigator);
    }
}
