package com.paypal.oslo.feature.verificationcapture.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideIdScanEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideIdScanEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideIdScanEntryProviderInstaller(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.di.NavigationModule_ProvideIdScanEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate> provider4) {
        return new com.paypal.oslo.feature.verificationcapture.di.NavigationModule_ProvideIdScanEntryProviderInstallerFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideIdScanEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider provider, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.verificationcapture.di.NavigationModule.INSTANCE.provideIdScanEntryProviderInstaller(appNavigator, context, provider, verificationCaptureWebViewDelegate));
    }
}
