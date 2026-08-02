package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class GetVbaUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> getHighSpeedVideoSizes;

    private GetVbaUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase newInstance(com.paypal.oslo.feature.directdeposit.domain.repository.VirtualBankAccountRepository virtualBankAccountRepository) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase(virtualBankAccountRepository);
    }
}
