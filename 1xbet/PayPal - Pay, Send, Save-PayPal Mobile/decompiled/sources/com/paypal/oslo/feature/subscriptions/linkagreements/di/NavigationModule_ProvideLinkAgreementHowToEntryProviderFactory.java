package com.paypal.oslo.feature.subscriptions.linkagreements.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideLinkAgreementHowToEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideLinkAgreementHowToEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideLinkAgreementHowToEntryProvider(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule_ProvideLinkAgreementHowToEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule_ProvideLinkAgreementHowToEntryProviderFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkAgreementHowToEntryProvider(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.INSTANCE.provideLinkAgreementHowToEntryProvider(configuredBottomSheetConfigProvider));
    }
}
