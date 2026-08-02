package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class SdkModule_ProvidesHceConfigProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private SdkModule_ProvidesHceConfigProviderFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider get() {
        return providesHceConfigProvider(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.SdkModule_ProvidesHceConfigProviderFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.di.SdkModule_ProvidesHceConfigProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider providesHceConfigProvider(android.content.Context context) {
        return (com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.SdkModule.INSTANCE.providesHceConfigProvider(context));
    }
}
