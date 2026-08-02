package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class ClaimMoneyTransferMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> getHighSpeedVideoSizes;

    private ClaimMoneyTransferMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper> provider2) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper newInstance(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper postTransferDisclosureMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper(currencyCountryMapper, postTransferDisclosureMapper);
    }
}
