package com.paypal.oslo.feature.mosaic.domain.usecase;

/* loaded from: classes13.dex */
public final class GetMosaicEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository> getHighSpeedVideoSizes;

    private GetMosaicEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository> provider) {
        return new com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase newInstance(com.paypal.oslo.feature.mosaic.domain.repository.MosaicEligibilityRepository mosaicEligibilityRepository) {
        return new com.paypal.oslo.feature.mosaic.domain.usecase.GetMosaicEligibilityUseCase(mosaicEligibilityRepository);
    }
}
