package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class TapToPayMainViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> getHighSpeedVideoFpsRangesFor;

    private TapToPayMainViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getTaxSettingsUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel(userStore, getTaxSettingsUseCase);
    }
}
