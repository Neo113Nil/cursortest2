package com.paypal.oslo.feature.bnplservicing.data.mapper.makeapayment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "toMakeAPaymentOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentOverviewInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLMakePaymentOverviewInput;", "toInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentOverviewInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentOverviewMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview toMakeAPaymentOverview(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview;
        java.util.ArrayList arrayList;
        if (data == null || (bnplMakePaymentOverview = data.getBnplMakePaymentOverview()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE.from(bnplMakePaymentOverview.getPlanStatus().name());
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> paymentOptions = bnplMakePaymentOverview.getPaymentOptions();
        if (paymentOptions != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption paymentOption : paymentOptions) {
                com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType from2 = com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.INSTANCE.from(paymentOption.getType().name());
                java.lang.Boolean shouldShowAutopayOnText = paymentOption.getShouldShowAutopayOnText();
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(paymentOption.getAmount().getBnplServicingMoneyFragment());
                if (money == null) {
                    money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "");
                }
                arrayList2.add(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption(from2, shouldShowAutopayOnText, money));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from3 = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE.from(bnplMakePaymentOverview.getCreditProductIdentifier().name());
        java.lang.Object countryCode = bnplMakePaymentOverview.getCountryCode();
        java.lang.String str = countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null;
        java.lang.Object currencyCode = bnplMakePaymentOverview.getCurrencyCode();
        java.lang.String str2 = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
        java.lang.Object productTimezone = bnplMakePaymentOverview.getProductTimezone();
        java.lang.String str3 = productTimezone instanceof java.lang.String ? (java.lang.String) productTimezone : null;
        java.lang.Object creditAccountId = bnplMakePaymentOverview.getCreditAccountId();
        java.lang.String str4 = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
        boolean interestBearing = bnplMakePaymentOverview.getInterestBearing();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplMakePaymentOverview.getCurrentDueAmount().getBnplServicingMoneyFragment());
        if (money2 == null) {
            money2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "");
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = money2;
        com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay = bnplMakePaymentOverview.getAutopay();
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay2 = autopay != null ? new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay(autopay.getEnabled(), com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(autopay.getPaymentFundingInstrument().getBnplServicingPaymentFundingInstrumentFragment()), autopay.isFundingInstrumentValid()) : null;
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> paymentFundingInstruments = bnplMakePaymentOverview.getPaymentFundingInstruments();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = paymentFundingInstruments.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(((com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1) it.next()).getBnplServicingPaymentFundingInstrumentFragment());
            if (fundingInstrument != null) {
                arrayList3.add(fundingInstrument);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedPaymentFundingInstrumentsToAdd = bnplMakePaymentOverview.getSupportedPaymentFundingInstrumentsToAdd();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedPaymentFundingInstrumentsToAdd, 10));
        for (java.util.Iterator it2 = supportedPaymentFundingInstrumentsToAdd.iterator(); it2.hasNext(); it2 = it2) {
            arrayList5.add(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.INSTANCE.from(((com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType) it2.next()).name()));
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.lang.Object paymentAuthorizationLink = bnplMakePaymentOverview.getPaymentAuthorizationLink();
        java.lang.String obj = paymentAuthorizationLink != null ? paymentAuthorizationLink.toString() : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money4 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplMakePaymentOverview.getMaxRepaymentAmount().getBnplServicingMoneyFragment());
        if (money4 == null) {
            money4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "");
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money5 = money4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money6 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplMakePaymentOverview.getMinRepaymentAmount().getBnplServicingMoneyFragment());
        if (money6 == null) {
            money6 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "");
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview(from, emptyList, from3, str, str2, str3, str4, interestBearing, money3, autopay2, arrayList4, arrayList6, obj, money5, money6);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput toInput(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentOverviewInput makeAPaymentOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentOverviewInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput(new com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP), makeAPaymentOverviewInput.getCreditAccountId());
    }
}
