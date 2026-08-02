package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/RewardsItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RewardsItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.RewardsStringProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public RewardsItemFactory(com.paypal.oslo.feature.home.domain.RewardsStringProvider rewardsStringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsStringProvider, "");
        this.getHighSpeedVideoFpsRanges = rewardsStringProvider;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance;
        java.lang.Object pointsAvailable;
        java.lang.String rewardsPoints;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.rewardsOverview(data);
        if (rewardsOverview == null || (redeemablePointBalance = rewardsOverview.getRedeemablePointBalance()) == null || (pointsAvailable = redeemablePointBalance.getPointsAvailable()) == null) {
            return null;
        }
        com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards rewards = com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards.INSTANCE;
        com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r3 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
        java.lang.String rewardsProductName = this.getHighSpeedVideoFpsRanges.getRewardsProductName();
        java.lang.String obj = pointsAvailable.toString();
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(obj);
        if (longOrNull == null) {
            rewardsPoints = this.getHighSpeedVideoFpsRanges.getRewardsPoints(obj);
        } else {
            java.lang.String format = java.text.NumberFormat.getIntegerInstance(java.util.Locale.US).format(longOrNull.longValue());
            com.paypal.oslo.feature.home.domain.RewardsStringProvider rewardsStringProvider = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            rewardsPoints = rewardsStringProvider.getRewardsPoints(format);
        }
        return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("rewards", rewards, r3, rewardsProductName, null, rewardsPoints, null, null, this.getHighSpeedVideoFpsRanges.getAvailableToRedeem(), com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE, null, null, kotlin.collections.CollectionsKt.listOf("https://www.paypalobjects.com/home-nav/PayPal-Rewards.png"), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return 3;
    }
}
