package com.paypal.oslo.feature.wallet.banks.ui.details;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0441RemoveBankAccountViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase> getHighSpeedVideoFpsRangesFor;

    private C0441RemoveBankAccountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase removeBankAccountUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel(str, removeBankAccountUseCase);
    }
}
