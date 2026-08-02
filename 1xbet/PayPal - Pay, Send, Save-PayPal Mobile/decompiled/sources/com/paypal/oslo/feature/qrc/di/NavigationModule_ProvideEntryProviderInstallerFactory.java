package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider4) {
        return new com.paypal.oslo.feature.qrc.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, amountScreenComponents, commonComponents, successScreenComponents));
    }
}
