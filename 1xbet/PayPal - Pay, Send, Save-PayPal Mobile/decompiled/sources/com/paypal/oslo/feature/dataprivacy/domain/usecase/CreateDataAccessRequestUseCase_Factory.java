package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class CreateDataAccessRequestUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> getHighSpeedVideoSizes;

    private CreateDataAccessRequestUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository, com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase(dataAccessRequestRepository, dataPrivacyDynamicConfiguration);
    }
}
