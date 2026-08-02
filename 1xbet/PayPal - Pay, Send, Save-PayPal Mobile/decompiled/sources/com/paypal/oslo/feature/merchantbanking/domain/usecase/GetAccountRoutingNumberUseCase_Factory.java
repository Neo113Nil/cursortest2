package com.paypal.oslo.feature.merchantbanking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetAccountRoutingNumberUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetAccountRoutingNumberUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository> provider) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase newInstance(com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository merchantAccountRoutingNumberRepository) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase(merchantAccountRoutingNumberRepository);
    }
}
