package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class SaveAddressUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> getHighSpeedVideoSizes;

    private SaveAddressUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase(updateApplicationRepository);
    }
}
