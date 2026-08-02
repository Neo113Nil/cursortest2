package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethod;", "getRedeemMethod", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethodData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/RedeemContent$RedeemMethod;", "redeemMethod"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DomainModelsKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod getRedeemMethod(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethodData redeemMethodData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemMethodData, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.RedeemContent.RedeemMethod(redeemMethodData.getRedeemType(), redeemMethodData.getTitle(), redeemMethodData.getDescription(), redeemMethodData.getImageUrl(), redeemMethodData.getButtonLabel(), redeemMethodData.getDestination());
    }
}
