package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

/* loaded from: classes15.dex */
public final class ChooseSecondaryPaymentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> getHighSpeedVideoFpsRanges;

    private ChooseSecondaryPaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase isDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase isForegroundSettingEnabledUseCase) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel(isDefaultPaymentAppUseCase, isForegroundSettingEnabledUseCase);
    }
}
