package com.paypal.oslo.feature.paymentreadylite.data.remoteconfig;

/* loaded from: classes13.dex */
public final class PaymentReadyLiteDynamicConfigImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private PaymentReadyLiteDynamicConfigImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteDynamicConfigImpl(dynamicConfiguration);
    }
}
