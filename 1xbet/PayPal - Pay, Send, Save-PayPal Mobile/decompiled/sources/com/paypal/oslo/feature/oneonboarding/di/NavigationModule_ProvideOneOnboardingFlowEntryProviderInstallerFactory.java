package com.paypal.oslo.feature.oneonboarding.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideOneOnboardingFlowEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideOneOnboardingFlowEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideOneOnboardingFlowEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.di.NavigationModule_ProvideOneOnboardingFlowEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator> provider) {
        return new com.paypal.oslo.feature.oneonboarding.di.NavigationModule_ProvideOneOnboardingFlowEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideOneOnboardingFlowEntryProviderInstaller(com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.oneonboarding.di.NavigationModule.INSTANCE.provideOneOnboardingFlowEntryProviderInstaller(oneOnboardingNavigator));
    }
}
