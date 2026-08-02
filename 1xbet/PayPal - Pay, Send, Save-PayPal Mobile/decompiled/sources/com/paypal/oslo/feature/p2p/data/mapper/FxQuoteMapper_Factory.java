package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class FxQuoteMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> getHighResolutionOutputSizeshNQ4ISI;

    private FxQuoteMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper p2PMoneyFragmentMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper(p2PMoneyFragmentMapper);
    }
}
