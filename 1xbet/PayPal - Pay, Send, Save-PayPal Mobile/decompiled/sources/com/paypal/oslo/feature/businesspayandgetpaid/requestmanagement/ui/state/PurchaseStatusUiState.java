package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "", "", "displayNameResId", "Lcom/paypal/pds/components/BadgeStyle;", "badgeStyle", "<init>", "(ILcom/paypal/pds/components/BadgeStyle;)V", "component1", "()I", "component2", "()Lcom/paypal/pds/components/BadgeStyle;", "copy", "(ILcom/paypal/pds/components/BadgeStyle;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDisplayNameResId", "Lcom/paypal/pds/components/BadgeStyle;", "getBadgeStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PurchaseStatusUiState {
    public static final int $stable = 0;
    private final com.paypal.pds.components.BadgeStyle badgeStyle;
    private final int displayNameResId;

    public PurchaseStatusUiState(int i, com.paypal.pds.components.BadgeStyle badgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        this.displayNameResId = i;
        this.badgeStyle = badgeStyle;
    }

    public final int getDisplayNameResId() {
        return this.displayNameResId;
    }

    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public final java.lang.String toString() {
        int i = this.displayNameResId;
        com.paypal.pds.components.BadgeStyle badgeStyle = this.badgeStyle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurchaseStatusUiState(displayNameResId=");
        sb.append(i);
        sb.append(", badgeStyle=");
        sb.append(badgeStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.displayNameResId) * 31) + this.badgeStyle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState purchaseStatusUiState = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState) other;
        return this.displayNameResId == purchaseStatusUiState.displayNameResId && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeStyle, purchaseStatusUiState.badgeStyle);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState copy(int displayNameResId, com.paypal.pds.components.BadgeStyle badgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(displayNameResId, badgeStyle);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDisplayNameResId() {
        return this.displayNameResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState purchaseStatusUiState, int i, com.paypal.pds.components.BadgeStyle badgeStyle, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = purchaseStatusUiState.displayNameResId;
        }
        if ((i2 & 2) != 0) {
            badgeStyle = purchaseStatusUiState.badgeStyle;
        }
        return purchaseStatusUiState.copy(i, badgeStyle);
    }
}
