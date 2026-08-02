package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class ScannerProviderModule_ProvideImageProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ScannerProviderModule_ProvideImageProviderFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider get() {
        return provideImageProvider(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideImageProviderFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideImageProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider provideImageProvider(android.content.Context context) {
        return (com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.ScannerProviderModule.INSTANCE.provideImageProvider(context));
    }
}
