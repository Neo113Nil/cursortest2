package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class PrepareDigitizationDataUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository> Camera2StreamConfigurationMap;

    private PrepareDigitizationDataUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.PrepareDigitizationDataRepository prepareDigitizationDataRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase(prepareDigitizationDataRepository);
    }
}
