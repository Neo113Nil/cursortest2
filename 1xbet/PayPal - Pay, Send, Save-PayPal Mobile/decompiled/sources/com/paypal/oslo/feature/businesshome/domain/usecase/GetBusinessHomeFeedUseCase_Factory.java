package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBusinessHomeFeedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private GetBusinessHomeFeedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase> provider2) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository merchantInsightsRepository, com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase evaluateAccountSetupStatusUseCase) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase(merchantInsightsRepository, evaluateAccountSetupStatusUseCase);
    }
}
