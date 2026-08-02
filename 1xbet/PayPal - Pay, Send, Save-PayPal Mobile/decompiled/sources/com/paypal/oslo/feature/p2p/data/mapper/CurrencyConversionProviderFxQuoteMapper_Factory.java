package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class CurrencyConversionProviderFxQuoteMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> getHighSpeedVideoFpsRanges;

    private CurrencyConversionProviderFxQuoteMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper p2PMoneyFragmentMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper(p2PMoneyFragmentMapper);
    }
}
