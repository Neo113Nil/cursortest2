package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b \u0010!\"&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$RedeemablePointBalance;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;", "toRewardsOverview", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$RedeemablePointBalance;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RewardsOverview;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/type/PromotionsOfferPresentmentProgressBarType;", "barType", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$Progress;", "progress", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "toOfferProgress", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionsOfferPresentmentProgressBarType;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$Progress;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$ActivatedOffers;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferData;", "toActiveEarnOffers", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$ActivatedOffers;)Ljava/util/List;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$EligibleOffers;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$InactiveEarnOffer;", "toInactiveEarnOffers", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$EligibleOffers;)Ljava/util/List;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$CategorySelection;", "", "shouldShowPpdcCard", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$CategorySelection;)Z", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$InviteFriend;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaOffer;", "toSingleCtaOffer", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$InviteFriend;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$SavingsEligibility;", "savingsEligibility", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemEligibility;", "toRedeemMethodsEligibility", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$SavingsEligibility;)Ljava/util/List;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsSummaryQuery$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "rewardsSummaryDataMapper", "Lkotlin/jvm/functions/Function1;", "getRewardsSummaryDataMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> rewardsSummaryDataMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.m19504$r8$lambda$e39s5aQxfcDCEuZLSGyqDrmJM((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data) obj);
        }
    };

    public static /* synthetic */ boolean $r8$lambda$TgG2SASKVvOpVMQX1O3gHvOQHnA() {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$_NFxjAo3qJkgnDHurxJyAnOeLdc() {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$rhLZLCOFRh6vyIkxxH3nThO9Cic() {
        return true;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview toRewardsOverview(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.RedeemablePointBalance redeemablePointBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment = redeemablePointBalance.getRedeemablePointBalanceFragment().getAmountAvailable().getRewardsMoneyFragment();
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview(redeemablePointBalance.getRedeemablePointBalanceFragment().getPointsAvailable().toString(), rewardsMoneyFragment.getCurrencyCode().toString(), rewardsMoneyFragment.getValue());
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress toOfferProgress(com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Progress progress) {
        int i = promotionsOfferPresentmentProgressBarType == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.WhenMappings.$EnumSwitchMapping$0[promotionsOfferPresentmentProgressBarType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(progress != null ? progress.getDiscreteRewardSummaryProgressFragment() : null);
        }
        if (i == 2) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper.INSTANCE.getOfferProgress$shopping_rewards_prodRelease(progress != null ? progress.getContinuousRewardSummaryProgressFragment() : null);
        }
        if (i == 3) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE;
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment = progress != null ? progress.getContinuousRewardSummaryProgressFragment() : null;
        if (continuousRewardSummaryProgressFragment != null) {
            java.lang.Float floatOrNull = kotlin.text.StringsKt.toFloatOrNull(continuousRewardSummaryProgressFragment.getPercentCompleted());
            float floatValue = floatOrNull != null ? floatOrNull.floatValue() : 0.0f;
            java.lang.Float floatOrNull2 = kotlin.text.StringsKt.toFloatOrNull(continuousRewardSummaryProgressFragment.getPercentRemaining());
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous(floatValue, floatOrNull2 != null ? floatOrNull2.floatValue() : 100.0f, false);
        }
        return com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData> toActiveEarnOffers(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.ActivatedOffers activatedOffers) {
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Progress progress;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset> presentmentAssets;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard;
        com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType activeOfferNavigationType;
        java.lang.Object activatedImageUrl;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserEnrollment userEnrollment;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserRewardSummary userRewardSummary;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatedOffers, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item> items = activatedOffers.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        for (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item item : items) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserRewardSummary> userRewardSummary2 = item.getUserRewardSummary();
            if (userRewardSummary2 != null) {
                if (userRewardSummary2.isEmpty()) {
                    userRewardSummary2 = null;
                }
                if (userRewardSummary2 != null && (userRewardSummary = userRewardSummary2.get(0)) != null) {
                    progress = userRewardSummary.getProgress();
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserEnrollment> userEnrollments = item.getUserEnrollments();
                    java.lang.String valueOf = java.lang.String.valueOf((userEnrollments != null || (userEnrollment = userEnrollments.get(0)) == null) ? null : userEnrollment.getExpiryTime());
                    java.lang.String id = item.getPromotionOfferFragment().getId();
                    presentmentAssets = item.getActivatedPromotionOfferFragment().getPresentmentAssets();
                    if (presentmentAssets != null) {
                        java.util.Iterator<T> it = presentmentAssets.iterator();
                        while (it.hasNext()) {
                            onPromotionRewardsTabOfferCard = ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset) it.next()).getOnPromotionRewardsTabOfferCard();
                            if (onPromotionRewardsTabOfferCard != null) {
                                break;
                            }
                        }
                    }
                    onPromotionRewardsTabOfferCard = null;
                    com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress = toOfferProgress(onPromotionRewardsTabOfferCard == null ? onPromotionRewardsTabOfferCard.getActivatedProgressBarType() : null, progress);
                    java.lang.String activatedTitleText = onPromotionRewardsTabOfferCard == null ? onPromotionRewardsTabOfferCard.getActivatedTitleText() : null;
                    java.lang.String str = activatedTitleText != null ? "" : activatedTitleText;
                    java.lang.String activatedDescriptionText = onPromotionRewardsTabOfferCard == null ? onPromotionRewardsTabOfferCard.getActivatedDescriptionText() : null;
                    java.lang.String str2 = activatedDescriptionText != null ? "" : activatedDescriptionText;
                    java.lang.String obj = (onPromotionRewardsTabOfferCard != null || (activatedImageUrl = onPromotionRewardsTabOfferCard.getActivatedImageUrl()) == null) ? null : activatedImageUrl.toString();
                    java.lang.String str3 = obj != null ? "" : obj;
                    if ((onPromotionRewardsTabOfferCard != null ? onPromotionRewardsTabOfferCard.getNavigationType() : null) != com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType.REWARDS_CATEGORY_OFFER) {
                        activeOfferNavigationType = com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType.CATEGORY_CONFIRMATION;
                    } else {
                        activeOfferNavigationType = com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType.DEFAULT;
                    }
                    arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData(id, str, str2, str3, valueOf, offerProgress, activeOfferNavigationType));
                }
            }
            progress = null;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserEnrollment> userEnrollments2 = item.getUserEnrollments();
            java.lang.String valueOf2 = java.lang.String.valueOf((userEnrollments2 != null || (userEnrollment = userEnrollments2.get(0)) == null) ? null : userEnrollment.getExpiryTime());
            java.lang.String id2 = item.getPromotionOfferFragment().getId();
            presentmentAssets = item.getActivatedPromotionOfferFragment().getPresentmentAssets();
            if (presentmentAssets != null) {
            }
            onPromotionRewardsTabOfferCard = null;
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress2 = toOfferProgress(onPromotionRewardsTabOfferCard == null ? onPromotionRewardsTabOfferCard.getActivatedProgressBarType() : null, progress);
            if (onPromotionRewardsTabOfferCard == null) {
            }
            if (activatedTitleText != null) {
            }
            if (onPromotionRewardsTabOfferCard == null) {
            }
            if (activatedDescriptionText != null) {
            }
            if (onPromotionRewardsTabOfferCard != null) {
            }
            if (obj != null) {
            }
            if ((onPromotionRewardsTabOfferCard != null ? onPromotionRewardsTabOfferCard.getNavigationType() : null) != com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType.REWARDS_CATEGORY_OFFER) {
            }
            arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferData(id2, str, str2, str3, valueOf2, offerProgress2, activeOfferNavigationType));
        }
        return arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.InactiveEarnOffer> toInactiveEarnOffers(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.EligibleOffers eligibleOffers) {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard;
        java.lang.Object endTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleOffers, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item2> items = eligibleOffers.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item2 item2 : items) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset> presentmentAssets = item2.getEligiblePromotionOfferFragment().getPresentmentAssets();
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.InactiveEarnOffer inactiveEarnOffer = null;
            r4 = null;
            java.lang.String str = null;
            inactiveEarnOffer = null;
            if (presentmentAssets != null) {
                java.util.Iterator<T> it = presentmentAssets.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        onPromotionRewardsTabOfferCard = null;
                        break;
                    }
                    onPromotionRewardsTabOfferCard = ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.EligiblePromotionOfferFragment.PresentmentAsset) it.next()).getOnPromotionRewardsTabOfferCard();
                    if (onPromotionRewardsTabOfferCard != null) {
                        break;
                    }
                }
                if (onPromotionRewardsTabOfferCard != null) {
                    java.lang.String eligibleTitleText = onPromotionRewardsTabOfferCard.getEligibleTitleText();
                    java.lang.String eligibleSubtitleText = onPromotionRewardsTabOfferCard.getEligibleSubtitleText();
                    java.lang.String eligibleDescriptionText = onPromotionRewardsTabOfferCard.getEligibleDescriptionText();
                    java.lang.String id = item2.getPromotionOfferFragment().getId();
                    com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule = item2.getPromotionOfferFragment().getSchedule();
                    if (schedule != null && (endTime = schedule.getEndTime()) != null) {
                        str = endTime.toString();
                    }
                    java.lang.String str2 = str == null ? "" : str;
                    java.lang.String obj = onPromotionRewardsTabOfferCard.getEligibleCardImageUrl().toString();
                    java.lang.String eligibleCtaText = onPromotionRewardsTabOfferCard.getEligibleCtaText();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(eligibleTitleText);
                    sb.append(" - ");
                    sb.append(eligibleSubtitleText);
                    sb.append(" - ");
                    sb.append(eligibleDescriptionText);
                    inactiveEarnOffer = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.InactiveEarnOffer(id, eligibleTitleText, eligibleSubtitleText, str2, eligibleDescriptionText, obj, eligibleCtaText, sb.toString());
                }
            }
            if (inactiveEarnOffer != null) {
                arrayList.add(inactiveEarnOffer);
            }
        }
        return arrayList;
    }

    public static final boolean shouldShowPpdcCard(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.CategorySelection categorySelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categorySelection, "");
        if (categorySelection.getItems().isEmpty()) {
            return false;
        }
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item1> items = categorySelection.getItems();
        if ((items instanceof java.util.Collection) && items.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.UserEnrollment1> userEnrollments = ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item1) it.next()).getUserEnrollments();
            if (userEnrollments != null && !userEnrollments.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaOffer toSingleCtaOffer(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.InviteFriend inviteFriend) {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType singleCtaNavigationType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inviteFriend, "");
        java.util.Iterator<T> it = inviteFriend.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                onPromotionSingleCtaOfferCard = null;
                break;
            }
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> presentmentAssets = ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Item3) it.next()).getInviteFriendFragment().getPresentmentAssets();
            if (presentmentAssets != null) {
                java.util.Iterator<T> it2 = presentmentAssets.iterator();
                while (it2.hasNext()) {
                    onPromotionSingleCtaOfferCard = ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset) it2.next()).getOnPromotionSingleCtaOfferCard();
                    if (onPromotionSingleCtaOfferCard != null) {
                        break;
                    }
                }
            }
            onPromotionSingleCtaOfferCard = null;
            if (onPromotionSingleCtaOfferCard != null) {
                break;
            }
        }
        if (onPromotionSingleCtaOfferCard == null) {
            return null;
        }
        if (onPromotionSingleCtaOfferCard.getNavigationType() == com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType.MGM) {
            singleCtaNavigationType = com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType.MGM;
        } else {
            singleCtaNavigationType = com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType.NONE;
        }
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaOffer(onPromotionSingleCtaOfferCard.getTitle(), onPromotionSingleCtaOfferCard.getDescription(), onPromotionSingleCtaOfferCard.getCardImageUrl().toString(), onPromotionSingleCtaOfferCard.getCtaText(), onPromotionSingleCtaOfferCard.getTermsText(), singleCtaNavigationType);
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response> getRewardsSummaryDataMapper() {
        return rewardsSummaryDataMapper;
    }

    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility> toRedeemMethodsEligibility(final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.SavingsEligibility savingsEligibility) {
        java.util.List<kotlin.Pair> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.USE_AT_CHECKOUT, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.$r8$lambda$_NFxjAo3qJkgnDHurxJyAnOeLdc());
            }
        }), kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_BALANCE, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.$r8$lambda$rhLZLCOFRh6vyIkxxH3nThO9Cic());
            }
        }), kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_SAVINGS, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.$r8$lambda$YRHEOtkVvANxMWV5oi2s9sczvbg(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.SavingsEligibility.this));
            }
        }), kotlin.TuplesKt.to(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType.REDEEM_TO_GIVING, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.mapper.RewardsSummaryMapperKt.$r8$lambda$TgG2SASKVvOpVMQX1O3gHvOQHnA());
            }
        })});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        for (kotlin.Pair pair : listOf) {
            arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemEligibility((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemType) pair.component1(), ((java.lang.Boolean) ((kotlin.jvm.functions.Function0) pair.component2()).invoke()).booleanValue()));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean $r8$lambda$YRHEOtkVvANxMWV5oi2s9sczvbg(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.SavingsEligibility savingsEligibility) {
        return (savingsEligibility != null ? savingsEligibility.getId() : null) != null;
    }

    /* renamed from: $r8$lambda$e39s5a-QxfcDCEuZLSGyqDrm-JM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response m19504$r8$lambda$e39s5aQxfcDCEuZLSGyqDrmJM(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RewardsOverview rewardsOverview = toRewardsOverview(data.getRedeemablePointBalance());
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent earnContent = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent(toActiveEarnOffers(data.getActivatedOffers()), toInactiveEarnOffers(data.getEligibleOffers()), toSingleCtaOffer(data.getInviteFriend()), shouldShowPpdcCard(data.getCategorySelection()), null);
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.SavingsEligibility> savingsEligibility = data.getSavingsEligibility();
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response(rewardsOverview, earnContent, null, toRedeemMethodsEligibility(savingsEligibility != null ? (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsSummaryQuery.SavingsEligibility) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsEligibility) : null), null, 20, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.DISCRETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.CONTINUOUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
