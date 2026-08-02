package com.paypal.oslo.feature.inappcheckout.data.mapper;

/* loaded from: classes13.dex */
public final class FundingSelectionEntityMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighResolutionOutputSizeshNQ4ISI;

    private FundingSelectionEntityMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper newInstance(com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper fundingInstrumentMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper(fundingInstrumentMapper, contingencyMapper);
    }
}
