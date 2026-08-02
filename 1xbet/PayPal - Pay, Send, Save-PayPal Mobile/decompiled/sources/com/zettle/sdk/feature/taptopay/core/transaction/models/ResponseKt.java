package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/commons/network/Response;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/SignaturePayload;", "toSignaturePayload", "(Lcom/zettle/sdk/commons/network/Response;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/SignaturePayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;", "toTransactionAppCommandPayload", "(Lcom/zettle/sdk/commons/network/Response;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionAppCommandPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "toTransactionApprovedPayload", "(Lcom/zettle/sdk/commons/network/Response;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;", "toTransactionDeclinedPayload", "(Lcom/zettle/sdk/commons/network/Response;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayload;", "toTransactionPayload", "(Lcom/zettle/sdk/commons/network/Response;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayload;", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "updateCardPaymentUUID", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResponseKt {
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload toTransactionPayload(com.zettle.sdk.commons.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayload) response.payload(new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionPayloadParser());
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload toTransactionAppCommandPayload(com.zettle.sdk.commons.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayload) response.payload(new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionAppCommandPayloadParser());
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload toTransactionDeclinedPayload(com.zettle.sdk.commons.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayload) response.payload(new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionDeclinedPayloadParser());
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload toTransactionApprovedPayload(com.zettle.sdk.commons.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload) response.payload(new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayloadParser());
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayload toSignaturePayload(com.zettle.sdk.commons.network.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return (com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayload) response.payload(new com.zettle.sdk.feature.taptopay.core.transaction.models.SignaturePayloadParser());
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload updateCardPaymentUUID(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload transactionApprovedPayload, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionApprovedPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String state = transactionApprovedPayload.getState();
        long amount = transactionApprovedPayload.getAmount();
        java.lang.String result = transactionApprovedPayload.getResult();
        boolean signatureRequired = transactionApprovedPayload.getSignatureRequired();
        boolean signaturePermissive = transactionApprovedPayload.getSignaturePermissive();
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionApprovedPayload(state, result, amount, signatureRequired, transactionApprovedPayload.getSignatureOptional(), signaturePermissive, transactionApprovedPayload.getCardHolderName(), transactionApprovedPayload.getCardLastDigits(), transactionApprovedPayload.getApplicationIdentifier(), transactionApprovedPayload.getCardHash(), transactionApprovedPayload.getReferenceNumber(), transactionApprovedPayload.getCardType(), transactionApprovedPayload.getTsi(), transactionApprovedPayload.getCardPaymentEntryMode(), transactionApprovedPayload.getCardholderVerificationMethod(), transactionApprovedPayload.getTvr(), transactionApprovedPayload.getCardIssuingBank(), transactionApprovedPayload.getMaskedPan(), transactionApprovedPayload.getApplicationName(), transactionApprovedPayload.getAuthorizationCode(), str, transactionApprovedPayload.getSuggestionEmail(), transactionApprovedPayload.getSuggestionPhone(), transactionApprovedPayload.getSuggestionPhoneCountryCode(), transactionApprovedPayload.getInstallmentAmount(), transactionApprovedPayload.getNrOfInstallments(), transactionApprovedPayload.getMxFiid(), transactionApprovedPayload.getMxCardType(), null, transactionApprovedPayload.getReference(), null, androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN, null);
    }
}
