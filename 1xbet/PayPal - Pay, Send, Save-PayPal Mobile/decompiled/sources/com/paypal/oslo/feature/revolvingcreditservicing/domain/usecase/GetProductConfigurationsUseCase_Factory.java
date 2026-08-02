package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetProductConfigurationsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetProductConfigurationsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository productConfigurationsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase(productConfigurationsRepository);
    }
}
