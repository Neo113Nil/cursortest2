package com.paypal.oslo.feature.balance.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideEntryProviderInstallerBalanceOnHoldFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideEntryProviderInstallerBalanceOnHoldFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstallerBalanceOnHold(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.navigation.NavigationModule_ProvideEntryProviderInstallerBalanceOnHoldFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2) {
        return new com.paypal.oslo.feature.balance.di.navigation.NavigationModule_ProvideEntryProviderInstallerBalanceOnHoldFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerBalanceOnHold(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.navigation.NavigationModule.INSTANCE.provideEntryProviderInstallerBalanceOnHold(appNavigator, context));
    }
}
