package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/CashBackSummary;", "toCashBackSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsSummary;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/CashBackSummary;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CashBackSummaryMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackSummary toCashBackSummary(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary rewardsSummary) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackAdjustment cashBackAdjustment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier cashBackTier;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount netEarnedAmount = rewardsSummary.getNetEarnedAmount();
        java.util.ArrayList arrayList2 = null;
        if (netEarnedAmount == null || (revolvingCreditMoneyFragment = netEarnedAmount.getRevolvingCreditMoneyFragment()) == null || (currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment)) == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier> rewardTiers = rewardsSummary.getRewardTiers();
        if (rewardTiers != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier rewardTier : rewardTiers) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned rewardsEarned = rewardTier.getRewardsEarned();
                if (rewardsEarned == null || (revolvingCreditMoneyFragment4 = rewardsEarned.getRevolvingCreditMoneyFragment()) == null || (currencyAmount3 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment4)) == null) {
                    cashBackTier = null;
                } else {
                    java.lang.Object percentage = rewardTier.getPercentage();
                    if (percentage != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(percentage);
                        sb.append("%");
                        str = sb.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    cashBackTier = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier(str, currencyAmount3);
                }
                if (cashBackTier != null) {
                    arrayList3.add(cashBackTier);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments totalAdjustments = rewardsSummary.getTotalAdjustments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = (totalAdjustments == null || (revolvingCreditMoneyFragment3 = totalAdjustments.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment3);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment> adjustments = rewardsSummary.getAdjustments();
        if (adjustments != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment adjustment : adjustments) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1 rewardsEarned2 = adjustment.getRewardsEarned();
                if (rewardsEarned2 == null || (revolvingCreditMoneyFragment2 = rewardsEarned2.getRevolvingCreditMoneyFragment()) == null || (currencyAmount2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2)) == null) {
                    cashBackAdjustment = null;
                } else {
                    com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAdjustmentCategory category = adjustment.getCategory();
                    java.lang.String obj = category != null ? category.toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    cashBackAdjustment = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackAdjustment(obj, currencyAmount2);
                }
                if (cashBackAdjustment != null) {
                    arrayList4.add(cashBackAdjustment);
                }
            }
            arrayList2 = arrayList4;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackSummary(currencyAmount, arrayList, currencyAmount4, arrayList2);
    }
}
