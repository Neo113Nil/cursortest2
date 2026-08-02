package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class TransferFlowMappers_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper> getOutputStallDuration;

    private TransferFlowMappers_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper> provider8, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider9, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper> provider10, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> provider11) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getOutputStallDuration = provider5;
        this.getHighSpeedVideoSizes = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getInputSizeshNQ4ISI = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
        this.Camera2StreamConfigurationMap = provider10;
        this.getOutputFormats = provider11;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputStallDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper> provider8, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider9, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper> provider10, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> provider11) {
        return new com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers newInstance(com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper startTransferAttemptMutationToStartTransferAttemptMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper updatePaymentTransferAttemptReceiverMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper updatePaymentTransferAttemptNoteMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper updatePaymentTransferAttemptAmountAndIntentMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper updatePaymentTransferTypeMutationDataToPaymentTypeMapper, com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper receiverMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper updatePaymentTransferAttemptAmountAndIntentFxQuoteMapper, com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper resolvePlanContingencyInputMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper, com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper currencyConversionProviderFxQuoteMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper planCurrencyExchangeMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers(startTransferAttemptMutationToStartTransferAttemptMapper, updatePaymentTransferAttemptReceiverMapper, updatePaymentTransferAttemptNoteMapper, updatePaymentTransferAttemptAmountAndIntentMapper, updatePaymentTransferTypeMutationDataToPaymentTypeMapper, receiverMapper, updatePaymentTransferAttemptAmountAndIntentFxQuoteMapper, resolvePlanContingencyInputMapper, paymentTransferAttemptFundingOptionsMapper, currencyConversionProviderFxQuoteMapper, planCurrencyExchangeMapper);
    }
}
