package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class ExecutePaymentTransferSendMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> getHighSpeedVideoFpsRanges;

    private ExecutePaymentTransferSendMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper newInstance(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper postTransferDisclosureMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper(currencyCountryMapper, postTransferDisclosureMapper);
    }
}
