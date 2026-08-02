package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0328InvoiceViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase> getHighSpeedVideoSizes;

    private C0328InvoiceViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction invoiceAction) {
        return newInstance(invoiceAction, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.C0328InvoiceViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction invoiceAction, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetInvoiceUseCase getInvoiceUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getTaxSettingsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase observeTaxSettingsUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel(invoiceAction, getInvoiceUseCase, getTaxSettingsUseCase, observeTaxSettingsUseCase, userStore);
    }
}
