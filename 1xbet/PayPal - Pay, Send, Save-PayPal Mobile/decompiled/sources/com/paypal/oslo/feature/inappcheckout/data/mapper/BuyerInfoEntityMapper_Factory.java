package com.paypal.oslo.feature.inappcheckout.data.mapper;

/* loaded from: classes13.dex */
public final class BuyerInfoEntityMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighSpeedVideoFpsRanges;

    private BuyerInfoEntityMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper newInstance(com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper(contingencyMapper);
    }
}
