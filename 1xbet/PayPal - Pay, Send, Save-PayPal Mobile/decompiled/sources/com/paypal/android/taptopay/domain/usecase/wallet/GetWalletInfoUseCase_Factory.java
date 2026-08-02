package com.paypal.android.taptopay.domain.usecase.wallet;

/* loaded from: classes10.dex */
public final class GetWalletInfoUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighResolutionOutputSizeshNQ4ISI;

    public GetWalletInfoUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.wallet.GetWalletInfoUseCase(cardRepository);
    }
}
