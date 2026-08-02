package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "toPaymentOption", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentOptionMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption toPaymentOption(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayPaymentAmountOptionType, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.PaymentOptionMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditAutopayPaymentAmountOptionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption toPaymentOption(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditOneTimePaymentAmountOptionType, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.PaymentOptionMapperKt.WhenMappings.$EnumSwitchMapping$1[revolvingCreditOneTimePaymentAmountOptionType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE;
            case 2:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
            case 3:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE;
            case 4:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
            case 5:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
            case 6:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.MINIMUM_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.STATEMENT_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.CUSTOM_AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.MINIMUM_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.STATEMENT_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.CURRENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.CUSTOM_AMOUNT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.REMAINING_STATEMENT_BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.UNKNOWN__.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
