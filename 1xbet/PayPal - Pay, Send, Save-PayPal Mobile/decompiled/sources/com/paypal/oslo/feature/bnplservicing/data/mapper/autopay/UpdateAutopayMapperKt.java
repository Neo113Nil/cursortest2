package com.paypal.oslo.feature.bnplservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/SetBnplAutopayMutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/UpdateAutoPayResult;", "toUpdateAutoPayResult", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/SetBnplAutopayMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/UpdateAutoPayResult;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/UpdateAutoPayInput;", "Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/UpdateAutoPayInput;)Lcom/paypal/oslo/api/graphql/schema/type/SetBNPLAutopayInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateAutopayMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult toUpdateAutoPayResult(com.paypal.oslo.feature.bnplservicing.graphql.SetBnplAutopayMutation.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.SetBnplAutopayMutation.SetBnplAutopay setBnplAutopay;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = null;
        if (data == null || (setBnplAutopay = data.getSetBnplAutopay()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.SetBnplAutopayMutation.PaymentFundingInstrument paymentFundingInstrument = setBnplAutopay.getPaymentFundingInstrument();
        if (paymentFundingInstrument != null && (bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.getBnplServicingPaymentFundingInstrumentFragment()) != null) {
            fundingInstrument = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(bnplServicingPaymentFundingInstrumentFragment);
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult(fundingInstrument);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput toGraphQLInput(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.UpdateAutoPayInput updateAutoPayInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutoPayInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayInput(new com.paypal.oslo.api.graphql.schema.type.SetBNPLAutopayFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP), updateAutoPayInput.getPlanId(), com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(updateAutoPayInput.getCpi().name()), null, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toPaymentFundingInstrumentInput(updateAutoPayInput.getFundingInstrument())), "", 8, null);
    }
}
