package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnRewardsComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnRewardsComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$RewardsOverview;", "Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsOverview;", "asOverview", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$RewardsOverview;)Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RewardsComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnRewardsComponent onRewardsComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRewardsComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet4 wallet = onRewardsComponent.getWallet();
        if (wallet == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RewardsOverview rewardsOverview = wallet.getRewardsOverview();
        return new com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsProduct(true, rewardsOverview != null ? asOverview(rewardsOverview) : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview asOverview(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RewardsOverview rewardsOverview) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsOverview, "");
        java.lang.String obj = rewardsOverview.getRedeemablePointBalance().getPointsAvailable().toString();
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(obj);
        if (longOrNull != null) {
            obj = java.text.NumberFormat.getInstance().format(longOrNull.longValue());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        }
        return new com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview(obj);
    }
}
