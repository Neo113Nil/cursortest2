package com.paypal.oslo.feature.debitcard.shared.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideDebitCardDeepLinkEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideDebitCardDeepLinkEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDebitCardDeepLinkEntryProviderInstaller(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.di.NavigationModule_ProvideDebitCardDeepLinkEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        return new com.paypal.oslo.feature.debitcard.shared.di.NavigationModule_ProvideDebitCardDeepLinkEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDebitCardDeepLinkEntryProviderInstaller(com.paypal.oslo.feature.debitcard.shared.util.DebitCardDeepLinkMapper debitCardDeepLinkMapper, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.debitcard.shared.di.NavigationModule.INSTANCE.provideDebitCardDeepLinkEntryProviderInstaller(debitCardDeepLinkMapper, appNavigator));
    }
}
