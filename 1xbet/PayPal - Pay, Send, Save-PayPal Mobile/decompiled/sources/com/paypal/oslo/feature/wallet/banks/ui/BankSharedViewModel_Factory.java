package com.paypal.oslo.feature.wallet.banks.ui;

/* loaded from: classes15.dex */
public final class BankSharedViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private BankSharedViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel(appNavigator);
    }
}
