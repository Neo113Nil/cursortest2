package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class DownloadFileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> getHighSpeedVideoSizes;

    private DownloadFileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository> provider) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.DownloadFileUseCase(dataAccessRequestRepository);
    }
}
