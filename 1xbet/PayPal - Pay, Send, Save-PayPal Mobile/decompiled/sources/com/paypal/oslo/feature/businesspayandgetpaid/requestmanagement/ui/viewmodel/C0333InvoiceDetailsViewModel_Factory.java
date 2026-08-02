package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0333InvoiceDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase> getHighSpeedVideoSizes;

    private C0333InvoiceDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase> provider4) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0333InvoiceDetailsViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase getInvoiceDetailsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase getInvoiceConditionalRulesUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase sendInvoiceReminderUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase cancelInvoiceUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel(str, getInvoiceDetailsUseCase, getInvoiceConditionalRulesUseCase, sendInvoiceReminderUseCase, cancelInvoiceUseCase);
    }
}
