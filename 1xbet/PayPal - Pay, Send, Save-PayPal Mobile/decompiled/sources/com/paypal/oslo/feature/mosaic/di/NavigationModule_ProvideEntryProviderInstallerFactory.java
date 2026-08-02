package com.paypal.oslo.feature.mosaic.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.mosaic.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider> provider3) {
        return new com.paypal.oslo.feature.mosaic.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider docUploadWidgetFactoryProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.mosaic.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, verificationCaptureWebViewConfigurer, docUploadWidgetFactoryProvider));
    }
}
