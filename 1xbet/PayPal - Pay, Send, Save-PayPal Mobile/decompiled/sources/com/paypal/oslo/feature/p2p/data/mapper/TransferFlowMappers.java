package com.paypal.oslo.feature.p2p.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/TransferFlowMappers;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/StartTransferAttemptMutationToStartTransferAttemptMapper;", "startTransferAttemptMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptReceiverMapper;", "receiverMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptNoteMapper;", "noteMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentMapper;", "amountAndIntentMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper;", "transferTypeMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/ReceiverMapper;", "contingencyReceiverMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper;", "amountAndIntentFxQuoteMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/ResolvePlanContingencyInputMapper;", "resolvePlanContingencyInputMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "fundingOptionsMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/CurrencyConversionProviderFxQuoteMapper;", "conversionProviderFxQuoteMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;", "planCurrencyExchangeMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/StartTransferAttemptMutationToStartTransferAttemptMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptReceiverMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptNoteMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/ReceiverMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/ResolvePlanContingencyInputMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/CurrencyConversionProviderFxQuoteMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;)V", "Lcom/paypal/oslo/feature/p2p/data/mapper/StartTransferAttemptMutationToStartTransferAttemptMapper;", "getStartTransferAttemptMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/StartTransferAttemptMutationToStartTransferAttemptMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptReceiverMapper;", "getReceiverMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptReceiverMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptNoteMapper;", "getNoteMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptNoteMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentMapper;", "getAmountAndIntentMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper;", "getTransferTypeMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/ReceiverMapper;", "getContingencyReceiverMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/ReceiverMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper;", "getAmountAndIntentFxQuoteMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/ResolvePlanContingencyInputMapper;", "getResolvePlanContingencyInputMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/ResolvePlanContingencyInputMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "getFundingOptionsMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/CurrencyConversionProviderFxQuoteMapper;", "getConversionProviderFxQuoteMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/CurrencyConversionProviderFxQuoteMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;", "getPlanCurrencyExchangeMapper", "()Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransferFlowMappers {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper amountAndIntentFxQuoteMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper amountAndIntentMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper contingencyReceiverMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper conversionProviderFxQuoteMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper fundingOptionsMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper noteMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper planCurrencyExchangeMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper receiverMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper resolvePlanContingencyInputMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper startTransferAttemptMapper;
    private final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper transferTypeMapper;

    @javax.inject.Inject
    public TransferFlowMappers(com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper startTransferAttemptMutationToStartTransferAttemptMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper updatePaymentTransferAttemptReceiverMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper updatePaymentTransferAttemptNoteMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper updatePaymentTransferAttemptAmountAndIntentMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper updatePaymentTransferTypeMutationDataToPaymentTypeMapper, com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper receiverMapper, com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper updatePaymentTransferAttemptAmountAndIntentFxQuoteMapper, com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper resolvePlanContingencyInputMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper, com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper currencyConversionProviderFxQuoteMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper planCurrencyExchangeMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTransferAttemptMutationToStartTransferAttemptMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiverMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptNoteMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptAmountAndIntentMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferTypeMutationDataToPaymentTypeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptAmountAndIntentFxQuoteMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyInputMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptFundingOptionsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionProviderFxQuoteMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchangeMapper, "");
        this.startTransferAttemptMapper = startTransferAttemptMutationToStartTransferAttemptMapper;
        this.receiverMapper = updatePaymentTransferAttemptReceiverMapper;
        this.noteMapper = updatePaymentTransferAttemptNoteMapper;
        this.amountAndIntentMapper = updatePaymentTransferAttemptAmountAndIntentMapper;
        this.transferTypeMapper = updatePaymentTransferTypeMutationDataToPaymentTypeMapper;
        this.contingencyReceiverMapper = receiverMapper;
        this.amountAndIntentFxQuoteMapper = updatePaymentTransferAttemptAmountAndIntentFxQuoteMapper;
        this.resolvePlanContingencyInputMapper = resolvePlanContingencyInputMapper;
        this.fundingOptionsMapper = paymentTransferAttemptFundingOptionsMapper;
        this.conversionProviderFxQuoteMapper = currencyConversionProviderFxQuoteMapper;
        this.planCurrencyExchangeMapper = planCurrencyExchangeMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.StartTransferAttemptMutationToStartTransferAttemptMapper getStartTransferAttemptMapper() {
        return this.startTransferAttemptMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper getReceiverMapper() {
        return this.receiverMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper getNoteMapper() {
        return this.noteMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper getAmountAndIntentMapper() {
        return this.amountAndIntentMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferTypeMutationDataToPaymentTypeMapper getTransferTypeMapper() {
        return this.transferTypeMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.ReceiverMapper getContingencyReceiverMapper() {
        return this.contingencyReceiverMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper getAmountAndIntentFxQuoteMapper() {
        return this.amountAndIntentFxQuoteMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper getResolvePlanContingencyInputMapper() {
        return this.resolvePlanContingencyInputMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper getFundingOptionsMapper() {
        return this.fundingOptionsMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.CurrencyConversionProviderFxQuoteMapper getConversionProviderFxQuoteMapper() {
        return this.conversionProviderFxQuoteMapper;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper getPlanCurrencyExchangeMapper() {
        return this.planCurrencyExchangeMapper;
    }
}
