package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class CreateErasureRequestUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> getHighSpeedVideoSizes;

    private CreateErasureRequestUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase(dataAccessRequestRepository);
    }
}
