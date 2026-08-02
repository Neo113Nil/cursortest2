package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "", "", "isLoading", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "status", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "holdings", "<init>", "(ZLcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "copy", "(ZLcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "getStatus", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsHoldingsUi;", "getHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardsCardUiState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi holdings;
    private final boolean isLoading;
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi status;

    public PYUSDRewardsCardUiState(boolean z, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi pYUSDRewardsHoldingsUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsStatusUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsHoldingsUi, "");
        this.isLoading = z;
        this.status = pYUSDRewardsStatusUi;
        this.holdings = pYUSDRewardsHoldingsUi;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi getHoldings() {
        return this.holdings;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi = this.status;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi pYUSDRewardsHoldingsUi = this.holdings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardsCardUiState(isLoading=");
        sb.append(z);
        sb.append(", status=");
        sb.append(pYUSDRewardsStatusUi);
        sb.append(", holdings=");
        sb.append(pYUSDRewardsHoldingsUi);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isLoading) * 31) + this.status.hashCode()) * 31) + this.holdings.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) other;
        return this.isLoading == pYUSDRewardsCardUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.status, pYUSDRewardsCardUiState.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, pYUSDRewardsCardUiState.holdings);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState copy(boolean isLoading, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi status, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi holdings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdings, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState(isLoading, status, holdings);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi getHoldings() {
        return this.holdings;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, boolean z, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi pYUSDRewardsStatusUi, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsHoldingsUi pYUSDRewardsHoldingsUi, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pYUSDRewardsCardUiState.isLoading;
        }
        if ((i & 2) != 0) {
            pYUSDRewardsStatusUi = pYUSDRewardsCardUiState.status;
        }
        if ((i & 4) != 0) {
            pYUSDRewardsHoldingsUi = pYUSDRewardsCardUiState.holdings;
        }
        return pYUSDRewardsCardUiState.copy(z, pYUSDRewardsStatusUi, pYUSDRewardsHoldingsUi);
    }
}
