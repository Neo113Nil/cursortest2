package com.paypal.oslo.feature.bankingbundle.ui.navigation;

/* loaded from: classes11.dex */
public final class BankingBundleNavigator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private BankingBundleNavigator_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator_Factory(provider);
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator(appNavigator);
    }
}
