package com.paypal.android.taptopay.domain.di;

/* loaded from: classes10.dex */
public final class ImplementationSelectorModule_ProvideImplementationSelectorFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.ImplementationSelector> {
    private final javax.inject.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.domain.di.ImplementationSelectorModule getHighSpeedVideoFpsRanges;

    public ImplementationSelectorModule_ProvideImplementationSelectorFactory(com.paypal.android.taptopay.domain.di.ImplementationSelectorModule implementationSelectorModule, javax.inject.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = implementationSelectorModule;
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.ImplementationSelector get() {
        return provideImplementationSelector(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.di.ImplementationSelectorModule_ProvideImplementationSelectorFactory create(com.paypal.android.taptopay.domain.di.ImplementationSelectorModule implementationSelectorModule, javax.inject.Provider<android.content.Context> provider) {
        return new com.paypal.android.taptopay.domain.di.ImplementationSelectorModule_ProvideImplementationSelectorFactory(implementationSelectorModule, provider);
    }

    public static com.paypal.android.taptopay.domain.di.ImplementationSelector provideImplementationSelector(com.paypal.android.taptopay.domain.di.ImplementationSelectorModule implementationSelectorModule, android.content.Context context) {
        return (com.paypal.android.taptopay.domain.di.ImplementationSelector) dagger.internal.Preconditions.checkNotNullFromProvides(implementationSelectorModule.provideImplementationSelector(context));
    }
}
