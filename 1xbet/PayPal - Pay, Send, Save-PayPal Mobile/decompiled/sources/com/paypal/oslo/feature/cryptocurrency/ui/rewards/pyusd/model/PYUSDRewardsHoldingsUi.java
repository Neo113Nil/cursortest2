package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "", "", "lifetimePayout", "accrued", "", "isCannotPerformPayoutError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLifetimePayout", "getAccrued", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardsHoldingsUi {
    public static final int $stable = 0;
    private final java.lang.String accrued;
    private final boolean isCannotPerformPayoutError;
    private final java.lang.String lifetimePayout;

    public PYUSDRewardsHoldingsUi(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.lifetimePayout = str;
        this.accrued = str2;
        this.isCannotPerformPayoutError = z;
    }

    public final java.lang.String getLifetimePayout() {
        return this.lifetimePayout;
    }

    public final java.lang.String getAccrued() {
        return this.accrued;
    }

    public final boolean isCannotPerformPayoutError() {
        return this.isCannotPerformPayoutError;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.lifetimePayout;
        java.lang.String str2 = this.accrued;
        boolean z = this.isCannotPerformPayoutError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardsHoldingsUi(lifetimePayout=");
        sb.append(str);
        sb.append(", accrued=");
        sb.append(str2);
        sb.append(", isCannotPerformPayoutError=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.lifetimePayout.hashCode() * 31) + this.accrued.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isCannotPerformPayoutError);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi pYUSDRewardsHoldingsUi = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimePayout, pYUSDRewardsHoldingsUi.lifetimePayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.accrued, pYUSDRewardsHoldingsUi.accrued) && this.isCannotPerformPayoutError == pYUSDRewardsHoldingsUi.isCannotPerformPayoutError;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi copy(java.lang.String lifetimePayout, java.lang.String accrued, boolean isCannotPerformPayoutError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifetimePayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accrued, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi(lifetimePayout, accrued, isCannotPerformPayoutError);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCannotPerformPayoutError() {
        return this.isCannotPerformPayoutError;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccrued() {
        return this.accrued;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLifetimePayout() {
        return this.lifetimePayout;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi copy$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi pYUSDRewardsHoldingsUi, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pYUSDRewardsHoldingsUi.lifetimePayout;
        }
        if ((i & 2) != 0) {
            str2 = pYUSDRewardsHoldingsUi.accrued;
        }
        if ((i & 4) != 0) {
            z = pYUSDRewardsHoldingsUi.isCannotPerformPayoutError;
        }
        return pYUSDRewardsHoldingsUi.copy(str, str2, z);
    }
}
