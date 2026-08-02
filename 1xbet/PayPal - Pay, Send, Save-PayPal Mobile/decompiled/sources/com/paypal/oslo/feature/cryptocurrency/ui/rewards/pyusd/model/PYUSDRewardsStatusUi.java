package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "", "", "isEnrolledCardDisplayed", "isAccruingRewards", "", "formattedRate", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(ZZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getFormattedRate", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardsStatusUi {
    public static final int $stable = 0;
    private final java.lang.String assetSymbol;
    private final java.lang.String formattedRate;
    private final boolean isAccruingRewards;
    private final boolean isEnrolledCardDisplayed;

    public PYUSDRewardsStatusUi(boolean z, boolean z2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.isEnrolledCardDisplayed = z;
        this.isAccruingRewards = z2;
        this.formattedRate = str;
        this.assetSymbol = str2;
    }

    public final boolean isEnrolledCardDisplayed() {
        return this.isEnrolledCardDisplayed;
    }

    public final boolean isAccruingRewards() {
        return this.isAccruingRewards;
    }

    public final java.lang.String getFormattedRate() {
        return this.formattedRate;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolledCardDisplayed;
        boolean z2 = this.isAccruingRewards;
        java.lang.String str = this.formattedRate;
        java.lang.String str2 = this.assetSymbol;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardsStatusUi(isEnrolledCardDisplayed=");
        sb.append(z);
        sb.append(", isAccruingRewards=");
        sb.append(z2);
        sb.append(", formattedRate=");
        sb.append(str);
        sb.append(", assetSymbol=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.isEnrolledCardDisplayed) * 31) + java.lang.Boolean.hashCode(this.isAccruingRewards)) * 31) + this.formattedRate.hashCode()) * 31) + this.assetSymbol.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi) other;
        return this.isEnrolledCardDisplayed == pYUSDRewardsStatusUi.isEnrolledCardDisplayed && this.isAccruingRewards == pYUSDRewardsStatusUi.isAccruingRewards && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedRate, pYUSDRewardsStatusUi.formattedRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, pYUSDRewardsStatusUi.assetSymbol);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi copy(boolean isEnrolledCardDisplayed, boolean isAccruingRewards, java.lang.String formattedRate, java.lang.String assetSymbol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi(isEnrolledCardDisplayed, isAccruingRewards, formattedRate, assetSymbol);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFormattedRate() {
        return this.formattedRate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAccruingRewards() {
        return this.isAccruingRewards;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolledCardDisplayed() {
        return this.isEnrolledCardDisplayed;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi copy$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi, boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pYUSDRewardsStatusUi.isEnrolledCardDisplayed;
        }
        if ((i & 2) != 0) {
            z2 = pYUSDRewardsStatusUi.isAccruingRewards;
        }
        if ((i & 4) != 0) {
            str = pYUSDRewardsStatusUi.formattedRate;
        }
        if ((i & 8) != 0) {
            str2 = pYUSDRewardsStatusUi.assetSymbol;
        }
        return pYUSDRewardsStatusUi.copy(z, z2, str, str2);
    }
}
