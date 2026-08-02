package com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentEligibleFi;", "toMakeAPaymentEligibleFi", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentEligibleFi;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLMakePaymentOverviewInput;", "toInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentEligibleFiMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi toMakeAPaymentEligibleFi(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview;
        if (data == null || (bnplMakePaymentOverview = data.getBnplMakePaymentOverview()) == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> paymentFundingInstruments = bnplMakePaymentOverview.getPaymentFundingInstruments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = paymentFundingInstruments.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument) it.next()).getBnplServicingPaymentFundingInstrumentFragment());
            if (fundingInstrument != null) {
                arrayList.add(fundingInstrument);
            }
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi(arrayList);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput toInput(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput makeAPaymentEligibleFiInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentEligibleFiInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput(new com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP), makeAPaymentEligibleFiInput.getCreditAccountId());
    }
}
