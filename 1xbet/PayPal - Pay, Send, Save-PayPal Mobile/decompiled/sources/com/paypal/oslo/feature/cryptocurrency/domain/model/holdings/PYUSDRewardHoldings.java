package com.paypal.oslo.feature.cryptocurrency.domain.model.holdings;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "", "", "rate", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;", "lifetimePayout", "accrued", "lastPayoutStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRate", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/RewardHolding;", "getLifetimePayout", "getAccrued", "getLastPayoutStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardHoldings {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding accrued;
    private final java.lang.String lastPayoutStatus;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding lifetimePayout;
    private final java.lang.String rate;

    public PYUSDRewardHoldings(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardHolding, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardHolding2, "");
        this.rate = str;
        this.lifetimePayout = rewardHolding;
        this.accrued = rewardHolding2;
        this.lastPayoutStatus = str2;
    }

    public final java.lang.String getRate() {
        return this.rate;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding getLifetimePayout() {
        return this.lifetimePayout;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding getAccrued() {
        return this.accrued;
    }

    public final java.lang.String getLastPayoutStatus() {
        return this.lastPayoutStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.rate;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding = this.lifetimePayout;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding2 = this.accrued;
        java.lang.String str2 = this.lastPayoutStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardHoldings(rate=");
        sb.append(str);
        sb.append(", lifetimePayout=");
        sb.append(rewardHolding);
        sb.append(", accrued=");
        sb.append(rewardHolding2);
        sb.append(", lastPayoutStatus=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.rate.hashCode();
        int hashCode2 = this.lifetimePayout.hashCode();
        int hashCode3 = this.accrued.hashCode();
        java.lang.String str = this.lastPayoutStatus;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rate, pYUSDRewardHoldings.rate) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimePayout, pYUSDRewardHoldings.lifetimePayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.accrued, pYUSDRewardHoldings.accrued) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastPayoutStatus, pYUSDRewardHoldings.lastPayoutStatus);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings copy(java.lang.String rate, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding lifetimePayout, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding accrued, java.lang.String lastPayoutStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifetimePayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accrued, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings(rate, lifetimePayout, accrued, lastPayoutStatus);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastPayoutStatus() {
        return this.lastPayoutStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding getAccrued() {
        return this.accrued;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding getLifetimePayout() {
        return this.lifetimePayout;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRate() {
        return this.rate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pYUSDRewardHoldings.rate;
        }
        if ((i & 2) != 0) {
            rewardHolding = pYUSDRewardHoldings.lifetimePayout;
        }
        if ((i & 4) != 0) {
            rewardHolding2 = pYUSDRewardHoldings.accrued;
        }
        if ((i & 8) != 0) {
            str2 = pYUSDRewardHoldings.lastPayoutStatus;
        }
        return pYUSDRewardHoldings.copy(str, rewardHolding, rewardHolding2, str2);
    }
}
