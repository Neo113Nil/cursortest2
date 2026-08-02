package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class DeleteFaceScanUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> getHighSpeedVideoFpsRangesFor;

    private DeleteFaceScanUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository faceScanRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase(faceScanRepository);
    }
}
