package com.paypal.oslo.feature.bnplservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", "toCancelAutoPayResponse", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;", "Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;)Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelAutopayMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult toCancelAutoPayResponse(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;
        if (data == null || (cancelBnplAutopay = data.getCancelBnplAutopay()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount = cancelBnplAutopay.getNextPaymentDueAmount();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = (nextPaymentDueAmount == null || (bnplServicingMoneyFragment = nextPaymentDueAmount.getBnplServicingMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment);
        java.lang.Object nextPaymentDueDate = cancelBnplAutopay.getNextPaymentDueDate();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult(money, nextPaymentDueDate != null ? nextPaymentDueDate.toString() : null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput toGraphQLInput(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput cancelAutoPayInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelAutoPayInput, "");
        com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayFlowContextInput cancelBNPLAutopayFlowContextInput = new com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP);
        java.lang.String planId = cancelAutoPayInput.getPlanId();
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(cancelAutoPayInput.getCreditProductIdentifier());
        java.lang.String eTag = cancelAutoPayInput.getETag();
        return new com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput(cancelBNPLAutopayFlowContextInput, planId, safeValueOf, null, eTag == null ? "" : eTag, 8, null);
    }
}
