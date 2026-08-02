package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u0004\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsUiState;", "", "", "isLoading", "isError", "", "pyusdRewardsFormattedRate", "isRewardsEnabled", "isToggleLoading", "isRewardsPaymentOnHold", "<init>", "(ZZLjava/lang/String;ZZZ)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(ZZLjava/lang/String;ZZZ)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getPyusdRewardsFormattedRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PYUSDRewardsSettingsUiState {
    public static final int $stable = 0;
    private final boolean isError;
    private final boolean isLoading;
    private final boolean isRewardsEnabled;
    private final boolean isRewardsPaymentOnHold;
    private final boolean isToggleLoading;
    private final java.lang.String pyusdRewardsFormattedRate;

    public PYUSDRewardsSettingsUiState(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.isLoading = z;
        this.isError = z2;
        this.pyusdRewardsFormattedRate = str;
        this.isRewardsEnabled = z3;
        this.isToggleLoading = z4;
        this.isRewardsPaymentOnHold = z5;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isError() {
        return this.isError;
    }

    public /* synthetic */ PYUSDRewardsSettingsUiState(boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
    }

    public final java.lang.String getPyusdRewardsFormattedRate() {
        return this.pyusdRewardsFormattedRate;
    }

    public final boolean isRewardsEnabled() {
        return this.isRewardsEnabled;
    }

    public final boolean isToggleLoading() {
        return this.isToggleLoading;
    }

    public final boolean isRewardsPaymentOnHold() {
        return this.isRewardsPaymentOnHold;
    }

    public final java.lang.String toString() {
        boolean z = this.isLoading;
        boolean z2 = this.isError;
        java.lang.String str = this.pyusdRewardsFormattedRate;
        boolean z3 = this.isRewardsEnabled;
        boolean z4 = this.isToggleLoading;
        boolean z5 = this.isRewardsPaymentOnHold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PYUSDRewardsSettingsUiState(isLoading=");
        sb.append(z);
        sb.append(", isError=");
        sb.append(z2);
        sb.append(", pyusdRewardsFormattedRate=");
        sb.append(str);
        sb.append(", isRewardsEnabled=");
        sb.append(z3);
        sb.append(", isToggleLoading=");
        sb.append(z4);
        sb.append(", isRewardsPaymentOnHold=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.isLoading) * 31) + java.lang.Boolean.hashCode(this.isError)) * 31) + this.pyusdRewardsFormattedRate.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRewardsEnabled)) * 31) + java.lang.Boolean.hashCode(this.isToggleLoading)) * 31) + java.lang.Boolean.hashCode(this.isRewardsPaymentOnHold);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState pYUSDRewardsSettingsUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) other;
        return this.isLoading == pYUSDRewardsSettingsUiState.isLoading && this.isError == pYUSDRewardsSettingsUiState.isError && kotlin.jvm.internal.Intrinsics.areEqual(this.pyusdRewardsFormattedRate, pYUSDRewardsSettingsUiState.pyusdRewardsFormattedRate) && this.isRewardsEnabled == pYUSDRewardsSettingsUiState.isRewardsEnabled && this.isToggleLoading == pYUSDRewardsSettingsUiState.isToggleLoading && this.isRewardsPaymentOnHold == pYUSDRewardsSettingsUiState.isRewardsPaymentOnHold;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState copy(boolean isLoading, boolean isError, java.lang.String pyusdRewardsFormattedRate, boolean isRewardsEnabled, boolean isToggleLoading, boolean isRewardsPaymentOnHold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pyusdRewardsFormattedRate, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState(isLoading, isError, pyusdRewardsFormattedRate, isRewardsEnabled, isToggleLoading, isRewardsPaymentOnHold);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRewardsPaymentOnHold() {
        return this.isRewardsPaymentOnHold;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsToggleLoading() {
        return this.isToggleLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRewardsEnabled() {
        return this.isRewardsEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPyusdRewardsFormattedRate() {
        return this.pyusdRewardsFormattedRate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState pYUSDRewardsSettingsUiState, boolean z, boolean z2, java.lang.String str, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pYUSDRewardsSettingsUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = pYUSDRewardsSettingsUiState.isError;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            str = pYUSDRewardsSettingsUiState.pyusdRewardsFormattedRate;
        }
        java.lang.String str2 = str;
        if ((i & 8) != 0) {
            z3 = pYUSDRewardsSettingsUiState.isRewardsEnabled;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = pYUSDRewardsSettingsUiState.isToggleLoading;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            z5 = pYUSDRewardsSettingsUiState.isRewardsPaymentOnHold;
        }
        return pYUSDRewardsSettingsUiState.copy(z, z6, str2, z7, z8, z5);
    }

    public PYUSDRewardsSettingsUiState() {
        this(false, false, null, false, false, false, 63, null);
    }
}
