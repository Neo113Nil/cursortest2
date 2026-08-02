package com.paypal.oslo.feature.bnplservicing.data.mapper.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubOverview;", "toPayLaterHubOverview", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview toPayLaterHubOverview(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount prequalificationAmount = null;
        if (data == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.toPlansOverview(data.getBnplServicingPlansOverviewFragment());
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary = data.getBnplPrequalificationSummary();
        if (bnplPrequalificationSummary != null) {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower = bnplPrequalificationSummary.getSpendingPower();
            prequalificationAmount = new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(spendingPower != null ? spendingPower.getBnplServicingMoneyFragment() : null), bnplPrequalificationSummary.getPreQualificationEligible(), null, null, 12, null);
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview("", null, plansOverview, null, prequalificationAmount, null, false, 42, null);
    }
}
