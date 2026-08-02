package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionConfirmationUiData;", "", "", "redeemedAmount", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionConfirmationUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getRedeemedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RedemptionConfirmationUiData {
    public static final int $stable = 0;
    private final double redeemedAmount;

    public RedemptionConfirmationUiData(double d) {
        this.redeemedAmount = d;
    }

    public final double getRedeemedAmount() {
        return this.redeemedAmount;
    }

    public final java.lang.String toString() {
        double d = this.redeemedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedemptionConfirmationUiData(redeemedAmount=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.redeemedAmount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData) && java.lang.Double.compare(this.redeemedAmount, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData) other).redeemedAmount) == 0;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData copy(double redeemedAmount) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData(redeemedAmount);
    }

    /* renamed from: component1, reason: from getter */
    public final double getRedeemedAmount() {
        return this.redeemedAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData redemptionConfirmationUiData, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = redemptionConfirmationUiData.redeemedAmount;
        }
        return redemptionConfirmationUiData.copy(d);
    }
}
