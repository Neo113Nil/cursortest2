package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes12.dex */
public final class FaceScanRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi> getHighSpeedVideoFpsRangesFor;

    private FaceScanRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi faceScanApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.FaceScanMapper faceScanMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.FaceScanRepositoryImpl(faceScanApi, faceScanMapper);
    }
}
