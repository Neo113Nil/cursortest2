package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailRewardSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment;", "p0", "Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment;)Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailRewardSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailRewardSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailRewardSectionMapper();

    private TransactionDetailRewardSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment;
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment2;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward = input.getResult().getSynchronyReward();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress> list = null;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> rewardList = (synchronyReward == null || (activityDetailSynchronyRewardFragment = synchronyReward.getActivityDetailSynchronyRewardFragment()) == null) ? null : activityDetailSynchronyRewardFragment.getRewardList();
        if (rewardList != null && !rewardList.isEmpty()) {
            return true;
        }
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary = input.getTransactionRewardSummary();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward> earnedRewards = (transactionRewardSummary == null || (promotionRewardSummaryFragment2 = transactionRewardSummary.getPromotionRewardSummaryFragment()) == null) ? null : promotionRewardSummaryFragment2.getEarnedRewards();
        if (earnedRewards != null && !earnedRewards.isEmpty()) {
            return true;
        }
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary2 = input.getTransactionRewardSummary();
        if (transactionRewardSummary2 != null && (promotionRewardSummaryFragment = transactionRewardSummary2.getPromotionRewardSummaryFragment()) != null) {
            list = promotionRewardSummaryFragment.getRewardProgress();
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress> list2 = list;
        return (list2 == null || list2.isEmpty()) ? false : true;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection;
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection2;
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals completedRewardTotals;
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment promotionOfferEarnedRewardTotalsFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> amounts;
        int i;
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals completedRewardTotals2;
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment promotionOfferEarnedRewardTotalsFragment2;
        java.lang.Object points;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress> rewardProgress;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward> earnedRewards;
        int i2;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward> earnedRewards2;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> rewardList;
        int i3;
        java.lang.Object percentage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward = input.getResult().getSynchronyReward();
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection3 = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment = synchronyReward != null ? synchronyReward.getActivityDetailSynchronyRewardFragment() : null;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary = input.getTransactionRewardSummary();
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment = transactionRewardSummary != null ? transactionRewardSummary.getPromotionRewardSummaryFragment() : null;
        int i4 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_rewards_header;
        int i5 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_view_all_header;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (activityDetailSynchronyRewardFragment != null && (rewardList = activityDetailSynchronyRewardFragment.getRewardList()) != null) {
            for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList rewardList2 : rewardList) {
                boolean z = rewardList2.getStatus() == com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus.PENDING;
                java.lang.String description = rewardList2.getDescription();
                if (description == null) {
                    description = "";
                }
                java.lang.String obj = (z || (percentage = rewardList2.getPercentage()) == null) ? null : percentage.toString();
                if (input.getResult().getSubType() == com.paypal.oslo.api.graphql.schema.type.ActivitySubType.AUTHORIZATION) {
                    i3 = com.paypal.oslo.feature.activity.R.string.feature_activity_rewards_pending_status;
                } else if (z) {
                    i3 = com.paypal.oslo.feature.activity.R.string.feature_activity_cashback_pending_title;
                } else {
                    i3 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_cashback_percentage_value;
                }
                com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem(java.lang.Integer.valueOf(i3), description, obj);
                if (z) {
                    arrayList.add(activityDetailRewardItem);
                } else {
                    arrayList2.add(activityDetailRewardItem);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            activityDetailRewardSection = null;
        } else {
            activityDetailRewardSection = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection(arrayList, arrayList2, com.paypal.oslo.feature.activity.R.string.feature_activity_cashback_pending_title, com.paypal.oslo.feature.activity.R.string.feature_activity_detail_cashback_earned_title, null, null, activityDetailSynchronyRewardFragment != null ? activityDetailSynchronyRewardFragment.getNote() : null, null, 176, null);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (promotionRewardSummaryFragment != null && (earnedRewards2 = promotionRewardSummaryFragment.getEarnedRewards()) != null) {
            for (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward earnedReward : earnedRewards2) {
                com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency onPromotionOfferEarnedRewardCurrency = earnedReward.getOnPromotionOfferEarnedRewardCurrency();
                if (onPromotionOfferEarnedRewardCurrency != null) {
                    boolean pending = earnedReward.getPending();
                    com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem2 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem(input.getResult().getSubType() == com.paypal.oslo.api.graphql.schema.type.ActivitySubType.AUTHORIZATION ? java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_rewards_pending_status) : null, earnedReward.getDescription(), getHighResolutionOutputSizeshNQ4ISI(onPromotionOfferEarnedRewardCurrency.getAmount().getActivityMoneyFragment()));
                    if (pending) {
                        arrayList3.add(activityDetailRewardItem2);
                    } else {
                        arrayList4.add(activityDetailRewardItem2);
                    }
                }
            }
        }
        if (arrayList3.isEmpty() && arrayList4.isEmpty()) {
            activityDetailRewardSection2 = null;
        } else {
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount amount = (promotionRewardSummaryFragment == null || (completedRewardTotals = promotionRewardSummaryFragment.getCompletedRewardTotals()) == null || (promotionOfferEarnedRewardTotalsFragment = completedRewardTotals.getPromotionOfferEarnedRewardTotalsFragment()) == null || (amounts = promotionOfferEarnedRewardTotalsFragment.getAmounts()) == null) ? null : (com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) amounts);
            activityDetailRewardSection2 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection(arrayList3, arrayList4, com.paypal.oslo.feature.activity.R.string.feature_activity_cashback_pending_title, com.paypal.oslo.feature.activity.R.string.feature_activity_detail_cashback_earned_title, getHighResolutionOutputSizeshNQ4ISI(amount != null ? amount.getActivityMoneyFragment() : null), null, null, null, 224, null);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        if (promotionRewardSummaryFragment != null && (earnedRewards = promotionRewardSummaryFragment.getEarnedRewards()) != null) {
            for (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward earnedReward2 : earnedRewards) {
                com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints onPromotionOfferEarnedRewardPoints = earnedReward2.getOnPromotionOfferEarnedRewardPoints();
                if (onPromotionOfferEarnedRewardPoints != null) {
                    boolean pending2 = earnedReward2.getPending();
                    java.lang.String description2 = earnedReward2.getDescription();
                    java.lang.String obj2 = onPromotionOfferEarnedRewardPoints.getPoints().toString();
                    if (input.getResult().getSubType() == com.paypal.oslo.api.graphql.schema.type.ActivitySubType.AUTHORIZATION) {
                        i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_rewards_pending_status;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(onPromotionOfferEarnedRewardPoints.getPoints().toString(), "1")) {
                        i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_reward_point_value;
                    } else {
                        i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_reward_points_value;
                    }
                    com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem3 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem(java.lang.Integer.valueOf(i2), description2, obj2);
                    if (pending2) {
                        arrayList5.add(activityDetailRewardItem3);
                    } else {
                        arrayList6.add(activityDetailRewardItem3);
                    }
                }
            }
        }
        if (!arrayList5.isEmpty() || !arrayList6.isEmpty()) {
            java.lang.String obj3 = (promotionRewardSummaryFragment == null || (completedRewardTotals2 = promotionRewardSummaryFragment.getCompletedRewardTotals()) == null || (promotionOfferEarnedRewardTotalsFragment2 = completedRewardTotals2.getPromotionOfferEarnedRewardTotalsFragment()) == null || (points = promotionOfferEarnedRewardTotalsFragment2.getPoints()) == null) ? null : points.toString();
            java.util.ArrayList arrayList7 = arrayList5;
            java.util.ArrayList arrayList8 = arrayList6;
            int i6 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_points_pending_title;
            int i7 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_points_earned_title;
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, "1")) {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_reward_point_value;
            } else {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_reward_points_value;
            }
            activityDetailRewardSection3 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection(arrayList7, arrayList8, i6, i7, obj3, java.lang.Integer.valueOf(i), null, arrayList5.isEmpty() ? null : java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_pending_points_eta_message), 64, null);
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardSection activityDetailRewardSection4 = activityDetailRewardSection3;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        if (promotionRewardSummaryFragment != null && (rewardProgress = promotionRewardSummaryFragment.getRewardProgress()) != null) {
            java.util.Iterator<T> it = rewardProgress.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress) it.next()).getPromotionRewardProgressItemFragment());
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    arrayList9.add(highResolutionOutputSizeshNQ4ISI);
                }
            }
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailRewardSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardModel(activityDetailRewardSection, activityDetailRewardSection2, activityDetailRewardSection4, arrayList9, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), true, true, null, 256, null));
    }

    private static com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment p0) {
        java.lang.Long l;
        java.lang.String valueOf;
        java.lang.Integer valueOf2;
        java.lang.Integer transactionCountCompleted;
        java.lang.Integer transactionCountRemaining;
        java.lang.Object enrollmentExpiryDateTime = p0.getEnrollmentExpiryDateTime();
        java.lang.String str = enrollmentExpiryDateTime instanceof java.lang.String ? (java.lang.String) enrollmentExpiryDateTime : null;
        try {
            l = java.lang.Long.valueOf(java.time.temporal.ChronoUnit.MINUTES.between(java.time.Instant.now(), java.time.OffsetDateTime.parse(str).toInstant()));
        } catch (java.lang.Exception unused) {
            l = null;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress = p0.getProgress();
        int i = 0;
        int intValue = (progress == null || (transactionCountRemaining = progress.getTransactionCountRemaining()) == null) ? 0 : transactionCountRemaining.intValue();
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress2 = p0.getProgress();
        if (progress2 != null && (transactionCountCompleted = progress2.getTransactionCountCompleted()) != null) {
            i = transactionCountCompleted.intValue();
        }
        int i2 = i;
        int i3 = i2 + intValue;
        if (l == null || l.longValue() < 0 || i3 <= 0 || p0.getDescription().length() == 0) {
            return null;
        }
        long longValue = l.longValue() / 60;
        long j = longValue / 24;
        if (j >= 30) {
            valueOf = java.time.OffsetDateTime.parse(str).atZoneSameInstant(java.time.ZoneId.systemDefault()).format(java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_DAY_MONTH_YEAR_DATE_FORMAT, java.util.Locale.getDefault()));
            valueOf2 = java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_reward_tracker_date_ends_text);
        } else if (j > 1) {
            valueOf = java.lang.String.valueOf(j);
            valueOf2 = java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_reward_tracker_days_left_text);
        } else if (longValue >= 1) {
            valueOf = java.lang.String.valueOf(longValue);
            valueOf2 = java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_reward_tracker_ends_hours_text);
        } else {
            valueOf = java.lang.String.valueOf(longValue);
            valueOf2 = java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_reward_tracker_ends_within_hour_text);
        }
        java.lang.String str2 = valueOf;
        java.lang.String description = p0.getDescription();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return new com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel(description, str2, valueOf2.intValue(), i2, i3);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment p0) {
        if (p0 == null) {
            return null;
        }
        java.lang.String currencySymbol$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.AmountUtils.INSTANCE.getCurrencySymbol$activity_prodRelease(p0.getCurrencyCode().toString());
        java.lang.String value = p0.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(currencySymbol$activity_prodRelease);
        sb.append(value);
        return sb.toString();
    }
}
