package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class CompletePaymentTransferMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> getHighSpeedVideoFpsRangesFor;

    private CompletePaymentTransferMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        return new com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper newInstance(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper postTransferDisclosureMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper(currencyCountryMapper, postTransferDisclosureMapper);
    }
}
