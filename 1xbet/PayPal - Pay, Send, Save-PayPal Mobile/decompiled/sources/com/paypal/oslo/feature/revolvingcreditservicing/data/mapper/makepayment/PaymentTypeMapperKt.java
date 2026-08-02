package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentType;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "toGql", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentType;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentTypeMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType toGql(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType paymentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        for (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType : com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.getEntries()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(revolvingCreditPaymentType.name(), paymentType.name())) {
                return revolvingCreditPaymentType;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
