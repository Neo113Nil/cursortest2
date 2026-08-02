package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class RequestStatementUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository> getHighSpeedVideoFpsRangesFor;

    private RequestStatementUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.RequestStatementRepository requestStatementRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase(requestStatementRepository);
    }
}
