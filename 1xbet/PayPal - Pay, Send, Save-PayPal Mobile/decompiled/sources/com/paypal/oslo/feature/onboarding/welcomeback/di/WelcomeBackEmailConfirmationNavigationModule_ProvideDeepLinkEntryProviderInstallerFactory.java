package com.paypal.oslo.feature.onboarding.welcomeback.di;

/* loaded from: classes13.dex */
public final class WelcomeBackEmailConfirmationNavigationModule_ProvideDeepLinkEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> getHighResolutionOutputSizeshNQ4ISI;

    private WelcomeBackEmailConfirmationNavigationModule_ProvideDeepLinkEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDeepLinkEntryProviderInstaller(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule_ProvideDeepLinkEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        return new com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule_ProvideDeepLinkEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDeepLinkEntryProviderInstaller(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.onboarding.welcomeback.di.WelcomeBackEmailConfirmationNavigationModule.INSTANCE.provideDeepLinkEntryProviderInstaller(postOnboardingNavigator));
    }
}
