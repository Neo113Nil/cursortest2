package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateDirectDebitStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> getHighSpeedVideoFpsRanges;

    private UpdateDirectDebitStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase newInstance(com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository virtualBankAccountRepository) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase(virtualBankAccountRepository);
    }
}
