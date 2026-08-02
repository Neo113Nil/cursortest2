package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectSideEffectsMiddlewareKt {
    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType access$toDebitErrorType(com.paypal.oslo.feature.cardconnect.api.models.CardConnectError cardConnectError) {
        return cardConnectError instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoInternet ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK : cardConnectError instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE : com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo access$toErrorInfo(com.paypal.oslo.feature.cardconnect.api.models.CardConnectError cardConnectError) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo(cardConnectError.getTag(), cardConnectError instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError ? ((com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError) cardConnectError).getErrorDetail() : null);
    }
}
