package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u000e\u0010\u0001\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"", "p0", "", "getHighSpeedVideoFpsRanges", "(I)Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/type/LoyaltyTierCode;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;)Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "rewardsLandingDataMapper", "Lkotlin/jvm/functions/Function1;", "getRewardsLandingDataMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingDataMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData> rewardsLandingDataMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper.RewardsLandingDataMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper.RewardsLandingDataMapperKt.$r8$lambda$opPlkTmPBd8mQyXKFKbduk5FFaE((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData> getRewardsLandingDataMapper() {
        return rewardsLandingDataMapper;
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(int i) {
        if (i < 1000) {
            return java.lang.String.valueOf(i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i / 1000);
        sb.append("K");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode) {
        java.lang.String str;
        java.lang.String name2;
        int i = loyaltyTierCode == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper.RewardsLandingDataMapperKt.WhenMappings.$EnumSwitchMapping$0[loyaltyTierCode.ordinal()];
        if (i == 1) {
            return "Blue";
        }
        if (i == 2) {
            return "Gold";
        }
        if (i == 3) {
            return "Black";
        }
        if (loyaltyTierCode != null && (name2 = loyaltyTierCode.name()) != null) {
            str = name2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            if (str != null) {
                if (str.length() > 0) {
                    char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
                    java.lang.String substring = str.substring(1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(upperCase);
                    sb.append(substring);
                    str = sb.toString();
                }
                return str != null ? "" : str;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData $r8$lambda$opPlkTmPBd8mQyXKFKbduk5FFaE(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data data) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        long j;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getLoyaltyMemberships().getItems());
        java.lang.Object pointsAvailable = data.getRedeemablePointBalance().getPointsAvailable();
        java.lang.String str3 = pointsAvailable instanceof java.lang.String ? (java.lang.String) pointsAvailable : null;
        int parseInt = str3 != null ? java.lang.Integer.parseInt(str3) : 0;
        com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode tierCode = (item == null || (currentTier = item.getCurrentTier()) == null) ? null : currentTier.getTierCode();
        java.lang.Object value = (item == null || (metrics = item.getMetrics()) == null || (qualifyingPoints = metrics.getQualifyingPoints()) == null) ? null : qualifyingPoints.getValue();
        java.lang.Integer num = value instanceof java.lang.Integer ? (java.lang.Integer) value : null;
        int intValue = num != null ? num.intValue() : 0;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> tiers = item != null ? item.getTiers() : null;
        if (tiers == null) {
            tiers = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> list = tiers;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier) obj).getTierCode() == com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.BLACK) {
                break;
            }
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier tier = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier) obj;
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier) obj2).getTierCode() == com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.GOLD) {
                break;
            }
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier tier2 = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier) obj2;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> milestones = item != null ? item.getMilestones() : null;
        if (milestones == null) {
            milestones = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> list2 = milestones;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            java.lang.Object qualifyingPoints2 = ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone) it3.next()).getQualifyingPoints();
            java.lang.Integer num2 = qualifyingPoints2 instanceof java.lang.Integer ? (java.lang.Integer) qualifyingPoints2 : null;
            arrayList.add(java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        java.util.List sortedDescending = kotlin.collections.CollectionsKt.sortedDescending(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedDescending, 10));
        java.util.Iterator it4 = sortedDescending.iterator();
        while (it4.hasNext()) {
            arrayList2.add(getHighSpeedVideoFpsRanges(((java.lang.Number) it4.next()).intValue()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.lang.String[] strArr = new java.lang.String[2];
        if (tier2 != null) {
            java.lang.Object qualifyingPoints3 = tier2.getThreshold().getQualifyingPoints();
            java.lang.Integer num3 = qualifyingPoints3 instanceof java.lang.Integer ? (java.lang.Integer) qualifyingPoints3 : null;
            str = getHighSpeedVideoFpsRanges(num3 != null ? num3.intValue() : 0);
        } else {
            str = null;
        }
        strArr[0] = str;
        if (tier != null) {
            java.lang.Object qualifyingPoints4 = tier.getThreshold().getQualifyingPoints();
            java.lang.Integer num4 = qualifyingPoints4 instanceof java.lang.Integer ? (java.lang.Integer) qualifyingPoints4 : null;
            str2 = getHighSpeedVideoFpsRanges(num4 != null ? num4.intValue() : 0);
        } else {
            str2 = null;
        }
        strArr[1] = str2;
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList3, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr));
        java.lang.Object qualifyingPoints5 = (tier == null || (threshold = tier.getThreshold()) == null) ? null : threshold.getQualifyingPoints();
        java.lang.Integer num5 = qualifyingPoints5 instanceof java.lang.Integer ? (java.lang.Integer) qualifyingPoints5 : null;
        int intValue2 = num5 != null ? num5.intValue() : 0;
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(tierCode);
        int i = tierCode == null ? -1 : com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.mapper.RewardsLandingDataMapperKt.WhenMappings.$EnumSwitchMapping$0[tierCode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                j = 4294956800L;
            } else if (i == 3) {
                j = 4279900698L;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(parseInt);
            sb.append(" points");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData(new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData(highResolutionOutputSizeshNQ4ISI, j, sb.toString(), "Available to spend"), new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.TrackerData(getHighResolutionOutputSizeshNQ4ISI(tierCode), intValue, plus, intValue2), com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.mock.RewardsLandingMockDataKt.getMockEarnSectionData(), com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.mock.RewardsLandingMockDataKt.getMockRedeemSectionData());
        }
        j = 4284796671L;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(parseInt);
        sb2.append(" points");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData(new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData(highResolutionOutputSizeshNQ4ISI, j, sb2.toString(), "Available to spend"), new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.TrackerData(getHighResolutionOutputSizeshNQ4ISI(tierCode), intValue, plus, intValue2), com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.mock.RewardsLandingMockDataKt.getMockEarnSectionData(), com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.mock.RewardsLandingMockDataKt.getMockRedeemSectionData());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.BLUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.GOLD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode.BLACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
