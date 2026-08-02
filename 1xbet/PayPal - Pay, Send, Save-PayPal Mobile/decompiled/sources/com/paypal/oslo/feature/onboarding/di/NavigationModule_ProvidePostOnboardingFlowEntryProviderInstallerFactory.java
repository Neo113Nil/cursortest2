package com.paypal.oslo.feature.onboarding.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvidePostOnboardingFlowEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvidePostOnboardingFlowEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providePostOnboardingFlowEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.di.NavigationModule_ProvidePostOnboardingFlowEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator> provider) {
        return new com.paypal.oslo.feature.onboarding.di.NavigationModule_ProvidePostOnboardingFlowEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePostOnboardingFlowEntryProviderInstaller(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.onboarding.di.NavigationModule.INSTANCE.providePostOnboardingFlowEntryProviderInstaller(postOnboardingNavigator));
    }
}
