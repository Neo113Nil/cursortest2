package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideAccountSetupSheetEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> getHighResolutionOutputSizeshNQ4ISI;

    private NavigationModule_ProvideAccountSetupSheetEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideAccountSetupSheetEntry(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideAccountSetupSheetEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.ui.webview.WebUrls> provider2) {
        return new com.paypal.oslo.feature.businesshome.di.NavigationModule_ProvideAccountSetupSheetEntryFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAccountSetupSheetEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.NavigationModule.INSTANCE.provideAccountSetupSheetEntry(appNavigator, webUrls));
    }
}
