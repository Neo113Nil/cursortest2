package com.paypal.oslo.feature.onboarding.welcomeback.di;

/* loaded from: classes13.dex */
public final class WelcomeBackEmailConfirmationNavigationModule_ProvideStepEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> Camera2StreamConfigurationMap;

    private WelcomeBackEmailConfirmationNavigationModule_ProvideStepEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideStepEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule_ProvideStepEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        return new com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule_ProvideStepEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideStepEntryProviderInstaller(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule.INSTANCE.provideStepEntryProviderInstaller(postOnboardingNavigator));
    }
}
