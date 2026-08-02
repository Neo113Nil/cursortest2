package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideDataPrivacyWebViewEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;

    private NavigationModule_ProvideDataPrivacyWebViewEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDataPrivacyWebViewEntryProvider(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.NavigationModule_ProvideDataPrivacyWebViewEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.NavigationModule_ProvideDataPrivacyWebViewEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDataPrivacyWebViewEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.NavigationModule.INSTANCE.provideDataPrivacyWebViewEntryProvider(appNavigator));
    }
}
