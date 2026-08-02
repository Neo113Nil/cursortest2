package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToBalanceMutation$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsResponse;", "toRedeemPointsResponse", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToBalanceMutation$Data;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsResponse;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToSavingsMutation$Data;", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToSavingsMutation$Data;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsResponse;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToCharityMutation$Data;", "toRedeemPointsToCharityResponse", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/RedeemPointsToCharityMutation$Data;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/repository/RedeemPointsResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemPointsMapperKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse toRedeemPointsResponse(com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToBalanceMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse(data.getRedeemPointsToBalance().getTransactionId());
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse toRedeemPointsResponse(com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToSavingsMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse(data.getRedeemPointsToSavings().getTransactionId());
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse toRedeemPointsToCharityResponse(com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToCharityMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.RedeemPointsToCharityMutation.RedeemPointsToCharity redeemPointsToCharity = data.getRedeemPointsToCharity();
        java.lang.String transactionId = redeemPointsToCharity != null ? redeemPointsToCharity.getTransactionId() : null;
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsResponse(transactionId != null ? transactionId : "");
    }
}
