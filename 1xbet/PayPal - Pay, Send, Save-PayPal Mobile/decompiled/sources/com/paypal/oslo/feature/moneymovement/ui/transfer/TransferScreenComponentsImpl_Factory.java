package com.paypal.oslo.feature.moneymovement.ui.transfer;

/* loaded from: classes13.dex */
public final class TransferScreenComponentsImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.summary.Summary> getOutputMinFrameDuration;

    private TransferScreenComponentsImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion> provider5, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion> provider6, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.summary.Summary> provider7) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getOutputMinFrameDuration = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion> provider2, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion> provider3, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion> provider5, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion> provider6, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.summary.Summary> provider7) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl newInstance(com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposefield.PurposeField purposeField, com.paypal.oslo.feature.moneymovement.ui.transfer.component.purposecodeaccordion.PurposeCodeAccordion purposeCodeAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.PaymentTypeAccordion paymentTypeAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordion planAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.ShippingAccordion shippingAccordion, com.paypal.oslo.feature.moneymovement.ui.transfer.component.transferperiodaccordion.TransferPeriodAccordion transferPeriodAccordion, com.paypal.oslo.feature.moneymovement.ui.summary.Summary summary) {
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl(purposeField, purposeCodeAccordion, paymentTypeAccordion, planAccordion, shippingAccordion, transferPeriodAccordion, summary);
    }
}
