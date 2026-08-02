package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class PaymentRequestSettingsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> getHighSpeedVideoFpsRanges;

    private PaymentRequestSettingsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getTaxSettingsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase updateTaxSettingsUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel(getTaxSettingsUseCase, updateTaxSettingsUseCase);
    }
}
