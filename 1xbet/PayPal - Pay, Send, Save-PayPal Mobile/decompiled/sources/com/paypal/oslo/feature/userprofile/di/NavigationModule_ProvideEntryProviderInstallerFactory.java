package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5) {
        return new com.paypal.oslo.feature.userprofile.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.userstore.UserStore userStore) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(context, appNavigator, userProfileConfig, featureGate, userStore));
    }
}
