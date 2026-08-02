package com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "", "", "isOptIn", "", "rate", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "previouslyEnrolled", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getRate", "getAssetSymbol", "getPreviouslyEnrolled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardsStatus {
    public static final int $stable = 0;
    private final java.lang.String assetSymbol;
    private final boolean isOptIn;
    private final boolean previouslyEnrolled;
    private final java.lang.String rate;

    public PYUSDRewardsStatus(boolean z, java.lang.String str, java.lang.String str2, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.isOptIn = z;
        this.rate = str;
        this.assetSymbol = str2;
        this.previouslyEnrolled = z2;
    }

    public final boolean isOptIn() {
        return this.isOptIn;
    }

    public final java.lang.String getRate() {
        return this.rate;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final boolean getPreviouslyEnrolled() {
        return this.previouslyEnrolled;
    }

    public final java.lang.String toString() {
        boolean z = this.isOptIn;
        java.lang.String str = this.rate;
        java.lang.String str2 = this.assetSymbol;
        boolean z2 = this.previouslyEnrolled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardsStatus(isOptIn=");
        sb.append(z);
        sb.append(", rate=");
        sb.append(str);
        sb.append(", assetSymbol=");
        sb.append(str2);
        sb.append(", previouslyEnrolled=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.isOptIn) * 31) + this.rate.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + java.lang.Boolean.hashCode(this.previouslyEnrolled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) other;
        return this.isOptIn == pYUSDRewardsStatus.isOptIn && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, pYUSDRewardsStatus.rate) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, pYUSDRewardsStatus.assetSymbol) && this.previouslyEnrolled == pYUSDRewardsStatus.previouslyEnrolled;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus copy(boolean isOptIn, java.lang.String rate, java.lang.String assetSymbol, boolean previouslyEnrolled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus(isOptIn, rate, assetSymbol, previouslyEnrolled);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPreviouslyEnrolled() {
        return this.previouslyEnrolled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRate() {
        return this.rate;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOptIn() {
        return this.isOptIn;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus, boolean z, java.lang.String str, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pYUSDRewardsStatus.isOptIn;
        }
        if ((i & 2) != 0) {
            str = pYUSDRewardsStatus.rate;
        }
        if ((i & 4) != 0) {
            str2 = pYUSDRewardsStatus.assetSymbol;
        }
        if ((i & 8) != 0) {
            z2 = pYUSDRewardsStatus.previouslyEnrolled;
        }
        return pYUSDRewardsStatus.copy(z, str, str2, z2);
    }
}
