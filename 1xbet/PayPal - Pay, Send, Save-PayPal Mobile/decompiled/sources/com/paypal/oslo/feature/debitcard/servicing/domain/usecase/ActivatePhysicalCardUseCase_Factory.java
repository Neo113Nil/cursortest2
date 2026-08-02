package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class ActivatePhysicalCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> getHighSpeedVideoSizes;

    private ActivatePhysicalCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase(debitCardServicingRepository);
    }
}
