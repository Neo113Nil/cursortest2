package com.paypal.oslo.feature.directdeposit.ui.summary.state;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/SummaryState;", "", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "vbaData", "", "isLoading", "", "error", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;ZLjava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/SummaryState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "getVbaData", "Z", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SummaryState {
    public static final int $stable = 0;
    private final java.lang.String error;
    private final boolean isLoading;
    private final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaData;

    public SummaryState(com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vbaSummaryItemState, "");
        this.vbaData = vbaSummaryItemState;
        this.isLoading = z;
        this.error = str;
    }

    public /* synthetic */ SummaryState(com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vbaSummaryItemState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState getVbaData() {
        return this.vbaData;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState = this.vbaData;
        boolean z = this.isLoading;
        java.lang.String str = this.error;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SummaryState(vbaData=");
        sb.append(vbaSummaryItemState);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", error=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.vbaData.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str = this.error;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState)) {
            return false;
        }
        com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState summaryState = (com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.vbaData, summaryState.vbaData) && this.isLoading == summaryState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.error, summaryState.error);
    }

    public final com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState copy(com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaData, boolean isLoading, java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vbaData, "");
        return new com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState(vbaData, isLoading, error);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState getVbaData() {
        return this.vbaData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState copy$default(com.paypal.oslo.feature.directdeposit.ui.summary.state.SummaryState summaryState, com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState vbaSummaryItemState, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vbaSummaryItemState = summaryState.vbaData;
        }
        if ((i & 2) != 0) {
            z = summaryState.isLoading;
        }
        if ((i & 4) != 0) {
            str = summaryState.error;
        }
        return summaryState.copy(vbaSummaryItemState, z, str);
    }
}
