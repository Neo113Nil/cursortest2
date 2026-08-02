package com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/MakeAPaymentMutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;", "toMakeAPaymentSuccessResponse", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/MakeAPaymentMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentInput;", "Lcom/paypal/oslo/api/graphql/schema/type/MakeBNPLPaymentInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/MakeBNPLPaymentInput;", "toInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentInput;)Lcom/paypal/oslo/api/graphql/schema/type/MakeBNPLPaymentInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess toMakeAPaymentSuccessResponse(com.paypal.oslo.feature.bnplservicing.graphql.MakeAPaymentMutation.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.MakeAPaymentMutation.MakeBnplPayment makeBnplPayment;
        if (data == null || (makeBnplPayment = data.getMakeBnplPayment()) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess(com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(makeBnplPayment.getAmount().getBnplServicingMoneyFragment()));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.MakeBNPLPaymentInput toInput(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput makeAPaymentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentInput, "");
        com.paypal.oslo.api.graphql.schema.type.MakeBNPLPaymentFlowContextInput makeBNPLPaymentFlowContextInput = new com.paypal.oslo.api.graphql.schema.type.MakeBNPLPaymentFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP);
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = makeAPaymentInput.getAmount();
        return new com.paypal.oslo.api.graphql.schema.type.MakeBNPLPaymentInput(makeBNPLPaymentFlowContextInput, new com.paypal.oslo.api.graphql.schema.type.MoneyInput(amount.getCurrencyCode(), amount.getValue()), com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(makeAPaymentInput.getCreditProductIdentifier().name()), makeAPaymentInput.getCreditAccountId(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(java.lang.Boolean.valueOf(makeAPaymentInput.isAutopayOn())), null, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toPaymentFundingInstrumentInput(makeAPaymentInput.getFundingInstrument())), 32, null);
    }
}
