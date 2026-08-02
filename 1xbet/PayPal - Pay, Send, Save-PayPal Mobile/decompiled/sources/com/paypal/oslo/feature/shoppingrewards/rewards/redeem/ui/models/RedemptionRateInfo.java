package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionRateInfo;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;", "pointsCurrency", "usdCurrency", "", "pointsPerDollar", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;I)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;", "component2", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionRateInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionCurrency;", "getPointsCurrency", "getUsdCurrency", com.visa.cbp.getEncExpo.warmup, "getPointsPerDollar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RedemptionRateInfo {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency pointsCurrency;
    private final int pointsPerDollar;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency usdCurrency;

    public RedemptionRateInfo(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionCurrency2, "");
        this.pointsCurrency = redemptionCurrency;
        this.usdCurrency = redemptionCurrency2;
        this.pointsPerDollar = i;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency getPointsCurrency() {
        return this.pointsCurrency;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency getUsdCurrency() {
        return this.usdCurrency;
    }

    public final int getPointsPerDollar() {
        return this.pointsPerDollar;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency = this.pointsCurrency;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency2 = this.usdCurrency;
        int i = this.pointsPerDollar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedemptionRateInfo(pointsCurrency=");
        sb.append(redemptionCurrency);
        sb.append(", usdCurrency=");
        sb.append(redemptionCurrency2);
        sb.append(", pointsPerDollar=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.pointsCurrency.hashCode() * 31) + this.usdCurrency.hashCode()) * 31) + java.lang.Integer.hashCode(this.pointsPerDollar);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo redemptionRateInfo = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pointsCurrency, redemptionRateInfo.pointsCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.usdCurrency, redemptionRateInfo.usdCurrency) && this.pointsPerDollar == redemptionRateInfo.pointsPerDollar;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo copy(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency pointsCurrency, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency usdCurrency, int pointsPerDollar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usdCurrency, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo(pointsCurrency, usdCurrency, pointsPerDollar);
    }

    /* renamed from: component3, reason: from getter */
    public final int getPointsPerDollar() {
        return this.pointsPerDollar;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency getUsdCurrency() {
        return this.usdCurrency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency getPointsCurrency() {
        return this.pointsCurrency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionRateInfo redemptionRateInfo, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionCurrency redemptionCurrency2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            redemptionCurrency = redemptionRateInfo.pointsCurrency;
        }
        if ((i2 & 2) != 0) {
            redemptionCurrency2 = redemptionRateInfo.usdCurrency;
        }
        if ((i2 & 4) != 0) {
            i = redemptionRateInfo.pointsPerDollar;
        }
        return redemptionRateInfo.copy(redemptionCurrency, redemptionCurrency2, i);
    }
}
