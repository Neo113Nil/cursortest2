package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditServicingPaymentStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/PaymentStatus;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/PaymentStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentStatusMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus revolvingCreditServicingPaymentStatus) {
        int i = revolvingCreditServicingPaymentStatus == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentStatusMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditServicingPaymentStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.NO_PAYMENT_DUE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.MINIMUM_PAYMENT_DUE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.PAST_DUE;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus.NO_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus.MINIMUM_PAYMENT_DUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus.PAST_DUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
