package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class UpdateBankAccountNicknameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> getHighSpeedVideoFpsRanges;

    private UpdateBankAccountNicknameUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository bankAccountDetailsRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase(bankAccountDetailsRepository);
    }
}
