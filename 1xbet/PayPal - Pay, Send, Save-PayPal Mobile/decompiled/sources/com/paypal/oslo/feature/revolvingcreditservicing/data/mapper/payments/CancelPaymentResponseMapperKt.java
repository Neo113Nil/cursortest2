package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/CancelRevolvingCreditPaymentMutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/CancelRepaymentResponse;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/CancelRevolvingCreditPaymentMutation$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/CancelRepaymentResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelPaymentResponseMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.CancelRevolvingCreditPaymentMutation.CancelRevolvingCreditPayment cancelRevolvingCreditPayment;
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse(java.lang.String.valueOf((data == null || (cancelRevolvingCreditPayment = data.getCancelRevolvingCreditPayment()) == null) ? null : cancelRevolvingCreditPayment.getCreditPaymentId()));
    }
}
