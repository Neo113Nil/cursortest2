package com.paypal.oslo.feature.searchandintelligence.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry> provider, dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry uiComponentRendererRegistry, com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener privacyDisclosureOpener) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.searchandintelligence.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(uiComponentRendererRegistry, privacyDisclosureOpener));
    }
}
