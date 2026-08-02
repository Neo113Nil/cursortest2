package com.paypal.oslo.feature.taptopay.di.data;

/* loaded from: classes5.dex */
public final class PayairProvidesModule_ProvideTimeProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider get() {
        return provideTimeProvider();
    }

    public static com.paypal.oslo.feature.taptopay.di.data.PayairProvidesModule_ProvideTimeProviderFactory create() {
        return com.paypal.oslo.feature.taptopay.di.data.PayairProvidesModule_ProvideTimeProviderFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider provideTimeProvider() {
        return (com.paypal.oslo.feature.taptopay.data.repository.card.payair.TimeProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.data.PayairProvidesModule.INSTANCE.provideTimeProvider());
    }

    /* loaded from: classes15.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.di.data.PayairProvidesModule_ProvideTimeProviderFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taptopay.di.data.PayairProvidesModule_ProvideTimeProviderFactory();

        private InstanceHolder() {
        }
    }
}
