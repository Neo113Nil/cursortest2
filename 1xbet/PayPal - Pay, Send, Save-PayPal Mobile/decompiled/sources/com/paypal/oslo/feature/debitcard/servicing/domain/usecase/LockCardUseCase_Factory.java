package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class LockCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> getHighResolutionOutputSizeshNQ4ISI;

    private LockCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository debitCardServicingRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase(debitCardServicingRepository);
    }
}
