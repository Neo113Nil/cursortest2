package com.paypal.oslo.feature.mosaic.data.repository;

/* loaded from: classes13.dex */
public final class MosaicEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource> getHighResolutionOutputSizeshNQ4ISI;

    private MosaicEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource> provider) {
        return new com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl newInstance(com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource mosaicEligibilityRemoteDataSource) {
        return new com.paypal.oslo.feature.mosaic.data.repository.MosaicEligibilityRepositoryImpl(mosaicEligibilityRemoteDataSource);
    }
}
