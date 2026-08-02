package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\t\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\t\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\f\u001a+\u0010\u0011\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$OnRevolvingCreditCashbackRewardsSummary;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductValueProposition;", "valuePropositions", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "toRewardSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$OnRevolvingCreditCashbackRewardsSummary;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery$OnRevolvingCreditCashbackRewardsSummary;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery$OnRevolvingCreditCashbackRewardsSummary;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery$Data;", "Lkotlin/Triple;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery$Data;)Lkotlin/Triple;", "", "p0", "p1", "", "p2", "p3", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RewardsCalculation;", "toRewardsCalculation", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RewardsCalculation;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsCalculation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RewardsSummaryMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary toRewardSummary$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.OnRevolvingCreditCashbackRewardsSummary onRevolvingCreditCashbackRewardsSummary, java.util.List list, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return toRewardSummary(onRevolvingCreditCashbackRewardsSummary, list, str, partialErrorHandler);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary toRewardSummary(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.OnRevolvingCreditCashbackRewardsSummary onRevolvingCreditCashbackRewardsSummary, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.TotalLifetimeRewardsAmount totalLifetimeRewardsAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.CurrentBalanceAmount currentBalanceAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.YearToDateRewardsEarnedAmount yearToDateRewardsEarnedAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment3;
        boolean z = list != null && list.contains(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition.EARN_CASHBACK);
        if (z && partialErrorHandler != null && partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.REWARDS)) {
            return null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary((onRevolvingCreditCashbackRewardsSummary == null || (currentBalanceAmount = onRevolvingCreditCashbackRewardsSummary.getCurrentBalanceAmount()) == null || (revolvingCreditMoneyFragment2 = currentBalanceAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2), (onRevolvingCreditCashbackRewardsSummary == null || (yearToDateRewardsEarnedAmount = onRevolvingCreditCashbackRewardsSummary.getYearToDateRewardsEarnedAmount()) == null || (revolvingCreditMoneyFragment3 = yearToDateRewardsEarnedAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment3), (onRevolvingCreditCashbackRewardsSummary == null || (totalLifetimeRewardsAmount = onRevolvingCreditCashbackRewardsSummary.getTotalLifetimeRewardsAmount()) == null || (revolvingCreditMoneyFragment = totalLifetimeRewardsAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment), z, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary toRewardSummary(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.OnRevolvingCreditCashbackRewardsSummary onRevolvingCreditCashbackRewardsSummary, java.lang.String str) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.TotalLifetimeRewardsAmount totalLifetimeRewardsAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.CurrentBalanceAmount currentBalanceAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.YearToDateRewardsEarnedAmount yearToDateRewardsEarnedAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (onRevolvingCreditCashbackRewardsSummary == null || (yearToDateRewardsEarnedAmount = onRevolvingCreditCashbackRewardsSummary.getYearToDateRewardsEarnedAmount()) == null || (revolvingCreditMoneyFragment3 = yearToDateRewardsEarnedAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment3);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = (onRevolvingCreditCashbackRewardsSummary == null || (currentBalanceAmount = onRevolvingCreditCashbackRewardsSummary.getCurrentBalanceAmount()) == null || (revolvingCreditMoneyFragment2 = currentBalanceAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
        if (onRevolvingCreditCashbackRewardsSummary != null && (totalLifetimeRewardsAmount = onRevolvingCreditCashbackRewardsSummary.getTotalLifetimeRewardsAmount()) != null && (revolvingCreditMoneyFragment = totalLifetimeRewardsAmount.getRevolvingCreditMoneyFragment()) != null) {
            currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary(currencyAmount3, currencyAmount2, currencyAmount, false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls] */
    public static final kotlin.Triple<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls> toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.Rewards rewards;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.OnRevolvingCreditCashbackRewardsSummary onRevolvingCreditCashbackRewardsSummary;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditProductFeatureOffer revolvingCreditProductFeatureOffer;
        java.lang.Object creditAccountId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        java.lang.String obj = (revolvingCreditAccount == null || (creditAccountId = revolvingCreditAccount.getCreditAccountId()) == null) ? null : creditAccountId.toString();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditProductFeatureOffer> revolvingCreditProductFeatureOffers = data.getRevolvingCreditProductFeatureOffers();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.OnRevolvingCreditProductFeatureRedeemPointsOffer onRevolvingCreditProductFeatureRedeemPointsOffer = (revolvingCreditProductFeatureOffers == null || (revolvingCreditProductFeatureOffer = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditProductFeatureOffer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) revolvingCreditProductFeatureOffers)) == null) ? null : revolvingCreditProductFeatureOffer.getOnRevolvingCreditProductFeatureRedeemPointsOffer();
        if (onRevolvingCreditProductFeatureRedeemPointsOffer != null) {
            boolean z = onRevolvingCreditProductFeatureRedeemPointsOffer.getStatus() == com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRedeemPointsEligibilityStatus.ELIGIBLE;
            java.lang.Boolean loyaltyProgramEnrolled = onRevolvingCreditProductFeatureRedeemPointsOffer.getLoyaltyProgramEnrolled();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RewardsCalculation rewardsCalculation = onRevolvingCreditProductFeatureRedeemPointsOffer.getRewardsCalculation();
            productFeatureOffers = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers(z, loyaltyProgramEnrolled, rewardsCalculation != null ? Camera2StreamConfigurationMap(rewardsCalculation.getPercent(), rewardsCalculation.getRoundingStrategy(), rewardsCalculation.getScale(), rewardsCalculation.getType()) : null, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            productFeatureOffers = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditRewardsSummary revolvingCreditRewardsSummary = data.getRevolvingCreditRewardsSummary();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardSummary = (revolvingCreditRewardsSummary == null || (onRevolvingCreditCashbackRewardsSummary = revolvingCreditRewardsSummary.getOnRevolvingCreditCashbackRewardsSummary()) == null) ? null : toRewardSummary(onRevolvingCreditCashbackRewardsSummary, obj);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        if (revolvingCreditServicingContent != null && (rewards = revolvingCreditServicingContent.getRewards()) != null) {
            java.lang.Object rewardsProgramTermsAndConditionsUrl = rewards.getRewardsProgramTermsAndConditionsUrl();
            java.lang.String obj2 = rewardsProgramTermsAndConditionsUrl != null ? rewardsProgramTermsAndConditionsUrl.toString() : null;
            java.lang.Object loyaltyProgramLearnMoreUrl = rewards.getLoyaltyProgramLearnMoreUrl();
            java.lang.String obj3 = loyaltyProgramLearnMoreUrl != null ? loyaltyProgramLearnMoreUrl.toString() : null;
            java.lang.Object loyaltyProgramTermsAndConditionsUrl = rewards.getLoyaltyProgramTermsAndConditionsUrl();
            r1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls(obj2, obj3, loyaltyProgramTermsAndConditionsUrl != null ? loyaltyProgramTermsAndConditionsUrl.toString() : null);
        }
        return new kotlin.Triple<>(rewardSummary, productFeatureOffers, r1);
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Object obj3) {
        java.lang.Number number = obj instanceof java.lang.Number ? (java.lang.Number) obj : null;
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(number != null ? java.lang.Float.valueOf(number.floatValue()) : null, obj2 != null ? obj2.toString() : null, num, obj3.toString());
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation toRewardsCalculation(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RewardsCalculation rewardsCalculation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsCalculation, "");
        return Camera2StreamConfigurationMap(rewardsCalculation.getPercent(), rewardsCalculation.getRoundingStrategy(), rewardsCalculation.getScale(), rewardsCalculation.getType());
    }
}
