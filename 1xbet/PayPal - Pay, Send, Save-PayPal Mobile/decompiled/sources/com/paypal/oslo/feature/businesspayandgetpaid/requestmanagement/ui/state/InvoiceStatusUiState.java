package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "invoiceStatus", "", "displayNameResId", "Lcom/paypal/pds/components/BadgeStyle;", "badgeStyle", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;ILcom/paypal/pds/components/BadgeStyle;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "component2", "()I", "component3", "()Lcom/paypal/pds/components/BadgeStyle;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;ILcom/paypal/pds/components/BadgeStyle;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "getInvoiceStatus", com.visa.cbp.getEncExpo.warmup, "getDisplayNameResId", "Lcom/paypal/pds/components/BadgeStyle;", "getBadgeStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceStatusUiState {
    public static final int $stable = 0;
    private final com.paypal.pds.components.BadgeStyle badgeStyle;
    private final int displayNameResId;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus;

    public InvoiceStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus, int i, com.paypal.pds.components.BadgeStyle badgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        this.invoiceStatus = invoiceStatus;
        this.displayNameResId = i;
        this.badgeStyle = badgeStyle;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public final int getDisplayNameResId() {
        return this.displayNameResId;
    }

    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus = this.invoiceStatus;
        int i = this.displayNameResId;
        com.paypal.pds.components.BadgeStyle badgeStyle = this.badgeStyle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceStatusUiState(invoiceStatus=");
        sb.append(invoiceStatus);
        sb.append(", displayNameResId=");
        sb.append(i);
        sb.append(", badgeStyle=");
        sb.append(badgeStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.invoiceStatus.hashCode() * 31) + java.lang.Integer.hashCode(this.displayNameResId)) * 31) + this.badgeStyle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState) other;
        return this.invoiceStatus == invoiceStatusUiState.invoiceStatus && this.displayNameResId == invoiceStatusUiState.displayNameResId && kotlin.jvm.internal.Intrinsics.areEqual(this.badgeStyle, invoiceStatusUiState.badgeStyle);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState copy(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus, int displayNameResId, com.paypal.pds.components.BadgeStyle badgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeStyle, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoiceStatus, displayNameResId, badgeStyle);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.components.BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDisplayNameResId() {
        return this.displayNameResId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus, int i, com.paypal.pds.components.BadgeStyle badgeStyle, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            invoiceStatus = invoiceStatusUiState.invoiceStatus;
        }
        if ((i2 & 2) != 0) {
            i = invoiceStatusUiState.displayNameResId;
        }
        if ((i2 & 4) != 0) {
            badgeStyle = invoiceStatusUiState.badgeStyle;
        }
        return invoiceStatusUiState.copy(invoiceStatus, i, badgeStyle);
    }
}
