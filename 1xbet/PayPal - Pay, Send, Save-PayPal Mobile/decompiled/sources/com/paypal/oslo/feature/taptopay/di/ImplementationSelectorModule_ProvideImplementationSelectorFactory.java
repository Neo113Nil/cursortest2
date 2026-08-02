package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ImplementationSelectorModule_ProvideImplementationSelectorFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule getHighSpeedVideoFpsRangesFor;

    private ImplementationSelectorModule_ProvideImplementationSelectorFactory(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRangesFor = implementationSelectorModule;
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector get() {
        return provideImplementationSelector(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule_ProvideImplementationSelectorFactory create(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule_ProvideImplementationSelectorFactory(implementationSelectorModule, provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector provideImplementationSelector(com.paypal.oslo.feature.taptopay.di.ImplementationSelectorModule implementationSelectorModule, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return (com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector) dagger.internal.Preconditions.checkNotNullFromProvides(implementationSelectorModule.provideImplementationSelector(appStorage));
    }
}
