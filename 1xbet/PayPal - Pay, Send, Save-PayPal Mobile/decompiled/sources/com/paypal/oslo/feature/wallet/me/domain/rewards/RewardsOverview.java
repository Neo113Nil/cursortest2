package com.paypal.oslo.feature.wallet.me.domain.rewards;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsOverview;", "", "", "rewardsPoints", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/rewards/RewardsOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRewardsPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RewardsOverview {
    public static final int $stable = 0;
    private final java.lang.String rewardsPoints;

    public RewardsOverview(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.rewardsPoints = str;
    }

    public final java.lang.String getRewardsPoints() {
        return this.rewardsPoints;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.rewardsPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsOverview(rewardsPoints=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.rewardsPoints.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsPoints, ((com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview) other).rewardsPoints);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview copy(java.lang.String rewardsPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsPoints, "");
        return new com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview(rewardsPoints);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRewardsPoints() {
        return this.rewardsPoints;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview copy$default(com.paypal.oslo.feature.wallet.me.domain.rewards.RewardsOverview rewardsOverview, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rewardsOverview.rewardsPoints;
        }
        return rewardsOverview.copy(str);
    }
}
