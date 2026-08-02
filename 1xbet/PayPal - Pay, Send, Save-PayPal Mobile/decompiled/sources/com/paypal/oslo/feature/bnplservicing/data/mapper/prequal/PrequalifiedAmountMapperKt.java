package com.paypal.oslo.feature.bnplservicing.data.mapper.prequal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00060\u0006j\u0002`\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationSummaryQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", "toPrequalifiedAmountOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationSummaryQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLPrequalificationSummaryInput;", "toPrequalificationSummaryInput", "(Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", "toPrequalificationAmount", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrequalifiedAmountMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary toPrequalifiedAmountOverview(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.BnplPrequalificationSummary bnplPrequalificationSummary;
        java.util.List emptyList;
        if (data == null || (bnplPrequalificationSummary = data.getBnplPrequalificationSummary()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.SpendingPower spendingPower = bnplPrequalificationSummary.getSpendingPower();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(spendingPower != null ? spendingPower.getBnplServicingMoneyFragment() : null);
        java.lang.String spendingPowerDisclaimerText = bnplPrequalificationSummary.getSpendingPowerDisclaimerText();
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.SpendingPowerFaq> spendingPowerFaqs = bnplPrequalificationSummary.getSpendingPowerFaqs();
        if (spendingPowerFaqs == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.SpendingPowerFaq> list = spendingPowerFaqs;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery.SpendingPowerFaq spendingPowerFaq : list) {
                java.lang.String question = spendingPowerFaq.getQuestion();
                java.lang.Object answer = spendingPowerFaq.getAnswer();
                java.lang.String str = answer instanceof java.lang.String ? (java.lang.String) answer : null;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.Faq(question, str));
            }
            emptyList = arrayList;
        }
        java.lang.Object legalMessage = bnplPrequalificationSummary.getLegalMessage();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary(money, spendingPowerDisclaimerText, emptyList, legalMessage instanceof java.lang.String ? (java.lang.String) legalMessage : null, bnplPrequalificationSummary.getPreQualificationEligible());
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput toPrequalificationSummaryInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.bnplservicing.data.mapper.common.CreditProductIdentifierMapperKt.toBNPLCreditProductIdentifier((com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) it.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput(arrayList, new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput(null, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.SELF_SERVICING, null, 9, null));
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount toPrequalificationAmount(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary;
        if (data == null || (bnplPrequalificationSummary = data.getBnplPrequalificationSummary()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower = bnplPrequalificationSummary.getSpendingPower();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(spendingPower != null ? spendingPower.getBnplServicingMoneyFragment() : null), bnplPrequalificationSummary.getPreQualificationEligible(), kotlin.collections.CollectionsKt.emptyList(), null);
    }
}
