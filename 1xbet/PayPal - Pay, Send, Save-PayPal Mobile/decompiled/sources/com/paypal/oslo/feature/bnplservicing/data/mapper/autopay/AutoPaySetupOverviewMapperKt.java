package com.paypal.oslo.feature.bnplservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", "toAutoPaySetupOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLAutopaySetupOverviewInput;", "toInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoPaySetupOverviewMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview toAutoPaySetupOverview(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview;
        if (data == null || (bnplAutopaySetupOverview = data.getBnplAutopaySetupOverview()) == null) {
            return null;
        }
        java.lang.Object paymentAuthorizationLink = bnplAutopaySetupOverview.getPaymentAuthorizationLink();
        java.lang.String str = paymentAuthorizationLink instanceof java.lang.String ? (java.lang.String) paymentAuthorizationLink : null;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedFundingInstrumentsToAdd = bnplAutopaySetupOverview.getSupportedFundingInstrumentsToAdd();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedFundingInstrumentsToAdd, 10));
        java.util.Iterator<T> it = supportedFundingInstrumentsToAdd.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.INSTANCE.from(((com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType) it.next()).name()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> paymentFundingInstruments = bnplAutopaySetupOverview.getPaymentFundingInstruments();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = paymentFundingInstruments.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument) it2.next()).getBnplServicingPaymentFundingInstrumentFragment());
            if (fundingInstrument != null) {
                arrayList3.add(fundingInstrument);
            }
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview(str, arrayList2, arrayList3);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput toInput(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput autoPaySetupOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoPaySetupOverviewInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput(new com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.INSTANCE.safeValueOf(autoPaySetupOverviewInput.getFlowSpecifier().name()), com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP), autoPaySetupOverviewInput.getCreditAccountId(), com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(autoPaySetupOverviewInput.getCreditProductIdentifier().name()));
    }
}
