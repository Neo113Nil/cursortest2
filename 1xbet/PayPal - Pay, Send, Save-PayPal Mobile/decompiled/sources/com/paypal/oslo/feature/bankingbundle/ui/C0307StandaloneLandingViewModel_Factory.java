package com.paypal.oslo.feature.bankingbundle.ui;

/* renamed from: com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0307StandaloneLandingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private C0307StandaloneLandingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel get(boolean z) {
        return newInstance(z, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel newInstance(boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel(z, appNavigator, bankingBundleNavigator, userStore);
    }
}
