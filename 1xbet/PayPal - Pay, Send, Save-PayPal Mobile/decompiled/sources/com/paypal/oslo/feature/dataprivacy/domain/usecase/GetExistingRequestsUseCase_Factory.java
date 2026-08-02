package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetExistingRequestsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> Camera2StreamConfigurationMap;

    private GetExistingRequestsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase(dataAccessRequestRepository);
    }
}
