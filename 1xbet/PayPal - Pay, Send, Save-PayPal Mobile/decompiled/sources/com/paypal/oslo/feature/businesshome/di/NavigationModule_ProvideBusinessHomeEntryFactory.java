package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBusinessHomeEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideBusinessHomeEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBusinessHomeEntry(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessHomeEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> provider2) {
        return new com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideBusinessHomeEntryFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessHomeEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.NavigationModule.INSTANCE.provideBusinessHomeEntry(appNavigator, webUrls));
    }
}
