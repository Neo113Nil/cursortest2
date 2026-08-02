package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCustomStatementOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository> getHighSpeedVideoSizes;

    private GetCustomStatementOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.CustomStatementRepository customStatementRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetCustomStatementOptionsUseCase(customStatementRepository);
    }
}
