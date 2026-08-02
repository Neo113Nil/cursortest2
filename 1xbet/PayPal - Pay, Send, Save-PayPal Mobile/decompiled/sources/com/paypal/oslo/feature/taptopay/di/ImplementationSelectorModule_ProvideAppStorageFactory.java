package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ImplementationSelectorModule_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule getHighSpeedVideoSizes;

    private ImplementationSelectorModule_ProvideAppStorageFactory(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = implementationSelectorModule;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule_ProvideAppStorageFactory create(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule_ProvideAppStorageFactory(implementationSelectorModule, provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(implementationSelectorModule.provideAppStorage(context));
    }
}
