package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetFaceScanStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetFaceScanStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.FaceScanRepository faceScanRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase(faceScanRepository);
    }
}
