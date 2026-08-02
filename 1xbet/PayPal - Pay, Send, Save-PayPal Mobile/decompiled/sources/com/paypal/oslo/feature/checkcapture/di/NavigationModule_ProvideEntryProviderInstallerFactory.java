package com.paypal.oslo.feature.checkcapture.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.checkcapture.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler> provider4) {
        return new com.paypal.oslo.feature.checkcapture.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager manager, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, com.paypal.oslo.feature.checkcapture.ingo.IngoResultHandler ingoResultHandler) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.checkcapture.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, manager, ingoSdkLauncher, ingoResultHandler));
    }
}
