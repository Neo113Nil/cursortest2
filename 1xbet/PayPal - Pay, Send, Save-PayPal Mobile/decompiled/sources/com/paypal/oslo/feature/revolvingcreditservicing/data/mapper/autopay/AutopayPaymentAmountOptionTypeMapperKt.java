package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditAutopayPaymentAmountOptionType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayPaymentAmountOptionTypeMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayPaymentAmountOptionType, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayPaymentAmountOptionTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditAutopayPaymentAmountOptionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.CUSTOM_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.MINIMUM_PAYMENT_DUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.STATEMENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
