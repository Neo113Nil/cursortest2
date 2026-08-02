package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "", "getBnplQualifier", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Ljava/lang/String;", "", "getAllBadgeTexts", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Ljava/util/List;", "getPrimaryQualifier", "getCombinedQualifier", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "getBenefitTypes", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$Reward;", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "getBenefitsMetadata", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QualifierExtensionsKt {
    public static final java.lang.String getBnplQualifier(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig bnplConfig = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.BnplConfig) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onStore.getBnplConfig());
        if (bnplConfig != null) {
            return bnplConfig.getCallToAction();
        }
        return null;
    }

    public static final java.util.List<java.lang.String> getAllBadgeTexts(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item> items = onStore.getMerchantOffers().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset> presentmentAssets = ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item) it.next()).getPresentmentAssets();
            java.util.ArrayList arrayList2 = null;
            if (presentmentAssets != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator<T> it2 = presentmentAssets.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnPromotionRewardBadge onPromotionRewardBadge = ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.PresentmentAsset) it2.next()).getOnPromotionRewardBadge();
                    java.lang.String badgeText = onPromotionRewardBadge != null ? onPromotionRewardBadge.getBadgeText() : null;
                    if (badgeText != null) {
                        arrayList3.add(badgeText);
                    }
                }
                arrayList2 = arrayList3;
            }
            if (arrayList2 == null) {
                arrayList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final java.lang.String getPrimaryQualifier(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) getAllBadgeTexts(onStore));
        return str == null ? getBnplQualifier(onStore) : str;
    }

    public static final java.lang.String getCombinedQualifier(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        java.lang.String bnplQualifier = getBnplQualifier(onStore);
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) getAllBadgeTexts(onStore));
        if (bnplQualifier == null || str == null) {
            if (bnplQualifier != null) {
                return bnplQualifier;
            }
            if (str == null) {
                return null;
            }
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(bnplQualifier);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(str);
        return sb.toString();
    }

    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> getBenefitTypes(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType navBenefitType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        java.lang.String bnplQualifier = getBnplQualifier(onStore);
        if (kotlin.jvm.internal.Intrinsics.areEqual(bnplQualifier, com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle)) {
            navBenefitType = com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.PAY_LATER_GENERIC;
        } else {
            navBenefitType = kotlin.jvm.internal.Intrinsics.areEqual(bnplQualifier, "0% APR") ? com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ZERO_APR : com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL;
        }
        return getHighSpeedVideoFpsRanges(onStore) != null ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType[]{navBenefitType, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.MERCHANT_OFFER_PERCENT}) : kotlin.collections.CollectionsKt.listOf(navBenefitType);
    }

    private static final com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward;
        java.util.Iterator<T> it = onStore.getMerchantOffers().getItems().iterator();
        do {
            reward = null;
            if (!it.hasNext()) {
                break;
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward reward2 = ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Item) it.next()).getReward();
            if (reward2 != null && (reward2.getPercentage() != null || reward2.getPoints() != null)) {
                reward = reward2;
            }
        } while (reward == null);
        return reward;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Reward highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(onStore);
        if (highSpeedVideoFpsRanges == null) {
            return new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        java.lang.Object percentage = highSpeedVideoFpsRanges.getPercentage();
        java.lang.String obj = percentage != null ? percentage.toString() : null;
        java.lang.Integer points = highSpeedVideoFpsRanges.getPoints();
        return new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata(obj, points != null ? java.lang.String.valueOf(points.intValue()) : null);
    }
}
