package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class GetPaymentRequestMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> getHighSpeedVideoFpsRangesFor;

    private GetPaymentRequestMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> provider2) {
        return new com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper newInstance(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper paymentRequestDisclosureMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper(currencyCountryMapper, paymentRequestDisclosureMapper);
    }
}
