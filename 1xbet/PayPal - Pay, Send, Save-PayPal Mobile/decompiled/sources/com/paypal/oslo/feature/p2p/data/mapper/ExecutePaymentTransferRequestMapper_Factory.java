package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class ExecutePaymentTransferRequestMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> getHighSpeedVideoFpsRangesFor;

    private ExecutePaymentTransferRequestMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper> provider2) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper newInstance(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper paymentRequestDisclosureMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper(currencyCountryMapper, paymentRequestDisclosureMapper);
    }
}
