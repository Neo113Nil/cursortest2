package com.paypal.oslo.feature.wallet.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider4) {
        return new com.paypal.oslo.feature.wallet.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.wallet.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, context, walletFeatureManager, commonComponents));
    }
}
