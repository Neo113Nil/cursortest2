package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetErasureRequestsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> getHighSpeedVideoFpsRanges;

    private GetErasureRequestsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase(dataAccessRequestRepository);
    }
}
