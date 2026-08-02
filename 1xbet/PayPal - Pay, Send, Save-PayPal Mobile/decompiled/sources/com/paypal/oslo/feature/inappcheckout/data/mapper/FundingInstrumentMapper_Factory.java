package com.paypal.oslo.feature.inappcheckout.data.mapper;

/* loaded from: classes13.dex */
public final class FundingInstrumentMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighSpeedVideoSizes;

    private FundingInstrumentMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper newInstance(com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper(contingencyMapper);
    }
}
