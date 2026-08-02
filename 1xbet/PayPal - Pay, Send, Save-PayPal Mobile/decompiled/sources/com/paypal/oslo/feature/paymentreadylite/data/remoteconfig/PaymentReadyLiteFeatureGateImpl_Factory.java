package com.paypal.oslo.feature.paymentreadylite.data.remoteconfig;

/* loaded from: classes13.dex */
public final class PaymentReadyLiteFeatureGateImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private PaymentReadyLiteFeatureGateImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.paymentreadylite.data.remoteconfig.PaymentReadyLiteFeatureGateImpl(featureGate);
    }
}
