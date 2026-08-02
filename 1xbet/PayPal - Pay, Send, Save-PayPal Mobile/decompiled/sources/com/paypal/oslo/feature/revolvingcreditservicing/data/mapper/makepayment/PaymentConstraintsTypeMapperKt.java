package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentConstraintsType;", "toGql", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentConstraintsType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConstraintsTypeMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType toGql(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType paymentConstraintsType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConstraintsType, "");
        for (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType revolvingCreditPaymentConstraintsType : com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType.getEntries()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(revolvingCreditPaymentConstraintsType.name(), paymentConstraintsType.name())) {
                return revolvingCreditPaymentConstraintsType;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
