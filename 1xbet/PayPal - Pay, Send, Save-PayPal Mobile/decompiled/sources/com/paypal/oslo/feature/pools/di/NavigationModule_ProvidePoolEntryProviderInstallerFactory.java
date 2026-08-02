package com.paypal.oslo.feature.pools.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvidePoolEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler> getHighSpeedVideoSizes;

    private NavigationModule_ProvidePoolEntryProviderInstallerFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providePoolEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pools.di.NavigationModule_ProvidePoolEntryProviderInstallerFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler> provider4) {
        return new com.paypal.oslo.feature.pools.di.NavigationModule_ProvidePoolEntryProviderInstallerFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePoolEntryProviderInstaller(android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler errorNavigationHandler) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.pools.di.NavigationModule.INSTANCE.providePoolEntryProviderInstaller(context, appNavigator, iActivityWidgetProvider, errorNavigationHandler));
    }
}
