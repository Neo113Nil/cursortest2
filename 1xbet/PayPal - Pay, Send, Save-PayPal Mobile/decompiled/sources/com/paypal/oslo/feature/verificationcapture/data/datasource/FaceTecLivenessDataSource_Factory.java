package com.paypal.oslo.feature.verificationcapture.data.datasource;

/* loaded from: classes15.dex */
public final class FaceTecLivenessDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> getHighSpeedVideoFpsRangesFor;

    private FaceTecLivenessDataSource_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider) {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource newInstance(com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource(restConfig);
    }
}
