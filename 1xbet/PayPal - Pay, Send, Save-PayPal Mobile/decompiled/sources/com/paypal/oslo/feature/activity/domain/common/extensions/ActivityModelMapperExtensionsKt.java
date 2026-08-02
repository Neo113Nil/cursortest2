package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;", "toActivityCryptoAssetQuantityInformation", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityCryptoAssetQuantityInformation;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "toActivityFlags", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityRewardStatus;", "toActivityRewardStatus", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus;)Lcom/paypal/oslo/feature/activity/api/models/ActivityRewardStatus;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "", "sourcePage", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "toPromotionalRewardDestinationsKey", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPartnerFragment;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;", "toActivityPartnerInfo", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPartnerFragment;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityModelMapperExtensionsKt {
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation toActivityCryptoAssetQuantityInformation(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment) {
        if (activityCryptoAssetQuantityFragment != null) {
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCryptoAssetQuantityInformation(activityCryptoAssetQuantityFragment.getQuantity(), activityCryptoAssetQuantityFragment.getAssetSymbol().getRawValue(), activityCryptoAssetQuantityFragment.getQuantityInSubunits(), activityCryptoAssetQuantityFragment.getDecimals());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags toActivityFlags(com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags(activityFlagsFragment != null ? activityFlagsFragment.isAnonymousContribution() : false, activityFlagsFragment != null ? activityFlagsFragment.isUprTransaction() : false, activityFlagsFragment != null ? activityFlagsFragment.isPaypalWorldTransaction() : false);
    }

    public static final com.paypal.oslo.feature.activity.api.models.ActivityRewardStatus toActivityRewardStatus(com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus) {
        if (rewardStatus != null && com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.WhenMappings.$EnumSwitchMapping$0[rewardStatus.ordinal()] == 1) {
            return com.paypal.oslo.feature.activity.api.models.ActivityRewardStatus.EARNED;
        }
        return com.paypal.oslo.feature.activity.api.models.ActivityRewardStatus.PENDING;
    }

    public static final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey toPromotionalRewardDestinationsKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, java.lang.String str) {
        java.lang.Integer points;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo = activityTransactionModel.getRewardInfo();
        return new com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey((rewardInfo == null || (points = rewardInfo.getPoints()) == null) ? 0 : points.intValue(), activityTransactionModel.getDate(), toActivityRewardStatus(rewardInfo != null ? rewardInfo.getRewardStatus() : null), activityTransactionModel.getTitle(), str);
    }

    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo toActivityPartnerInfo(com.paypal.oslo.feature.activity.graphql.fragment.ActivityPartnerFragment activityPartnerFragment) {
        com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType type;
        java.lang.String str = null;
        java.lang.String externalId = activityPartnerFragment != null ? activityPartnerFragment.getExternalId() : null;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.Companion companion = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.INSTANCE;
        if (activityPartnerFragment != null && (type = activityPartnerFragment.getType()) != null) {
            str = type.getRawValue();
        }
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo(externalId, companion.safeValueOf(str));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.EARNED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
