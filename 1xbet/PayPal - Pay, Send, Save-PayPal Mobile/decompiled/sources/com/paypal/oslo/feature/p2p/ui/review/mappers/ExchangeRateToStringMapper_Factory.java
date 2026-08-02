package com.paypal.oslo.feature.p2p.ui.review.mappers;

/* loaded from: classes13.dex */
public final class ExchangeRateToStringMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper_Factory create() {
        return com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper newInstance() {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper_Factory();

        private InstanceHolder() {
        }
    }
}
