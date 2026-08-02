package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "toResult", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;)Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionResultKt {
    public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload toResult(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
        long amount = transactionApprovedPayload.getAmount();
        java.lang.Long gratuityAmount = transactionApprovedPayload.getGratuityAmount();
        java.lang.String cardType = transactionApprovedPayload.getCardType();
        java.lang.String tsi = transactionApprovedPayload.getTsi();
        java.lang.String cardPaymentEntryMode = transactionApprovedPayload.getCardPaymentEntryMode();
        java.lang.String cardholderVerificationMethod = transactionApprovedPayload.getCardholderVerificationMethod();
        java.lang.String tvr = transactionApprovedPayload.getTvr();
        java.lang.String cardIssuingBank = transactionApprovedPayload.getCardIssuingBank();
        java.lang.String maskedPan = transactionApprovedPayload.getMaskedPan();
        java.lang.String applicationName = transactionApprovedPayload.getApplicationName();
        java.lang.String applicationIdentifier = transactionApprovedPayload.getApplicationIdentifier();
        java.lang.String authorizationCode = transactionApprovedPayload.getAuthorizationCode();
        long installmentAmount = transactionApprovedPayload.getInstallmentAmount();
        int nrOfInstallments = transactionApprovedPayload.getNrOfInstallments();
        java.lang.String mxFiid = transactionApprovedPayload.getMxFiid();
        java.lang.String mxCardType = transactionApprovedPayload.getMxCardType();
        java.lang.Integer mxPaymentMethodCode = transactionApprovedPayload.getMxPaymentMethodCode();
        java.lang.String cardHash = transactionApprovedPayload.getCardHash();
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference = transactionApprovedPayload.getReference();
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionResultPayloadImpl(amount, gratuityAmount, cardType, tsi, cardPaymentEntryMode, cardholderVerificationMethod, tvr, cardIssuingBank, maskedPan, applicationName, applicationIdentifier, authorizationCode, installmentAmount, nrOfInstallments, mxFiid, mxCardType, mxPaymentMethodCode, cardHash, reference != null ? reference.prepareInternal$core_publicRelease(transactionApprovedPayload) : null, transactionApprovedPayload.getReferenceNumber(), transactionApprovedPayload.getCardPaymentUUID(), transactionApprovedPayload.getSuggestionEmail(), transactionApprovedPayload.getSuggestionPhone(), transactionApprovedPayload.getSuggestionPhoneCountryCode());
    }
}
