package com.paypal.oslo.feature.wallet.banks.ui.details;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0440BankDetailViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> getHighSpeedVideoSizes;

    private C0440BankDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase> provider3, dagger.internal.Provider<android.content.Context> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel get(java.lang.String str) {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), str, this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase> provider3, dagger.internal.Provider<android.content.Context> provider4) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase, com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil getBankBannersUiUtil, com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase updateBankAccountNicknameUseCase, java.lang.String str, android.content.Context context) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel(getBankAccountDetailsUseCase, getBankBannersUiUtil, updateBankAccountNicknameUseCase, str, context);
    }
}
