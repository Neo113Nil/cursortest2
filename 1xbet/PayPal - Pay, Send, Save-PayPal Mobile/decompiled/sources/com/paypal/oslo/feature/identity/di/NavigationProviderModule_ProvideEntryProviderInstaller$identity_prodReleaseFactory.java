package com.paypal.oslo.feature.identity.di;

/* loaded from: classes12.dex */
public final class NavigationProviderModule_ProvideEntryProviderInstaller$identity_prodReleaseFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.navigation3.runtime.NavKey> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> getHighSpeedVideoSizes;

    private NavigationProviderModule_ProvideEntryProviderInstaller$identity_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> provider3, dagger.internal.Provider<androidx.navigation3.runtime.NavKey> provider4, dagger.internal.Provider<android.content.Context> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller$identity_prodRelease(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.di.NavigationProviderModule_ProvideEntryProviderInstaller$identity_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver> provider3, dagger.internal.Provider<androidx.navigation3.runtime.NavKey> provider4, dagger.internal.Provider<android.content.Context> provider5) {
        return new com.paypal.oslo.feature.identity.di.NavigationProviderModule_ProvideEntryProviderInstaller$identity_prodReleaseFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller$identity_prodRelease(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, javax.inject.Provider<androidx.navigation3.runtime.NavKey> provider, android.content.Context context) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.di.NavigationProviderModule.INSTANCE.provideEntryProviderInstaller$identity_prodRelease(appNavigator, loginFlowController, loginEffectResolver, provider, context));
    }
}
