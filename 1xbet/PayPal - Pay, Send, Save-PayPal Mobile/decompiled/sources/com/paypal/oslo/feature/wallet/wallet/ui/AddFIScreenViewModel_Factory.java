package com.paypal.oslo.feature.wallet.wallet.ui;

/* loaded from: classes16.dex */
public final class AddFIScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private AddFIScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel(appNavigator);
    }
}
