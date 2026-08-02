package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJZ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentTypeAccordionUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "selectedTypeId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "isEnabled", "isAwaitingTransferTypeConfirmation", "isLoading", "lastConfirmedTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentTypeAccordionUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getSelectedTypeId", "Z", "getLastConfirmedTypeId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentTypeAccordionUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final boolean isAwaitingTransferTypeConfirmation;
    private final boolean isEnabled;
    private final boolean isExpanded;
    private final boolean isLoading;
    private final java.lang.String lastConfirmedTypeId;
    private final java.lang.String name;
    private final java.lang.String selectedTypeId;

    public PaymentTypeAccordionUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.selectedTypeId = str2;
        this.isExpanded = z;
        this.isEnabled = z2;
        this.isAwaitingTransferTypeConfirmation = z3;
        this.isLoading = z4;
        this.lastConfirmedTypeId = str3;
    }

    public /* synthetic */ PaymentTypeAccordionUiState(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "PaymentTypeAccordionUiState" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? z4 : false, (i & 64) == 0 ? str3 : null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getSelectedTypeId() {
        return this.selectedTypeId;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isAwaitingTransferTypeConfirmation() {
        return this.isAwaitingTransferTypeConfirmation;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getLastConfirmedTypeId() {
        return this.lastConfirmedTypeId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.selectedTypeId;
        boolean z = this.isExpanded;
        boolean z2 = this.isEnabled;
        boolean z3 = this.isAwaitingTransferTypeConfirmation;
        boolean z4 = this.isLoading;
        java.lang.String str3 = this.lastConfirmedTypeId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTypeAccordionUiState(name=");
        sb.append(str);
        sb.append(", selectedTypeId=");
        sb.append(str2);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(", isEnabled=");
        sb.append(z2);
        sb.append(", isAwaitingTransferTypeConfirmation=");
        sb.append(z3);
        sb.append(", isLoading=");
        sb.append(z4);
        sb.append(", lastConfirmedTypeId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.selectedTypeId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isExpanded);
        int hashCode4 = java.lang.Boolean.hashCode(this.isEnabled);
        int hashCode5 = java.lang.Boolean.hashCode(this.isAwaitingTransferTypeConfirmation);
        int hashCode6 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str2 = this.lastConfirmedTypeId;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState paymentTypeAccordionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, paymentTypeAccordionUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedTypeId, paymentTypeAccordionUiState.selectedTypeId) && this.isExpanded == paymentTypeAccordionUiState.isExpanded && this.isEnabled == paymentTypeAccordionUiState.isEnabled && this.isAwaitingTransferTypeConfirmation == paymentTypeAccordionUiState.isAwaitingTransferTypeConfirmation && this.isLoading == paymentTypeAccordionUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.lastConfirmedTypeId, paymentTypeAccordionUiState.lastConfirmedTypeId);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState copy(java.lang.String name2, java.lang.String selectedTypeId, boolean isExpanded, boolean isEnabled, boolean isAwaitingTransferTypeConfirmation, boolean isLoading, java.lang.String lastConfirmedTypeId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState(name2, selectedTypeId, isExpanded, isEnabled, isAwaitingTransferTypeConfirmation, isLoading, lastConfirmedTypeId);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastConfirmedTypeId() {
        return this.lastConfirmedTypeId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAwaitingTransferTypeConfirmation() {
        return this.isAwaitingTransferTypeConfirmation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSelectedTypeId() {
        return this.selectedTypeId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState copy$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState paymentTypeAccordionUiState, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentTypeAccordionUiState.name;
        }
        if ((i & 2) != 0) {
            str2 = paymentTypeAccordionUiState.selectedTypeId;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            z = paymentTypeAccordionUiState.isExpanded;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = paymentTypeAccordionUiState.isEnabled;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = paymentTypeAccordionUiState.isAwaitingTransferTypeConfirmation;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = paymentTypeAccordionUiState.isLoading;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            str3 = paymentTypeAccordionUiState.lastConfirmedTypeId;
        }
        return paymentTypeAccordionUiState.copy(str, str4, z5, z6, z7, z8, str3);
    }

    public PaymentTypeAccordionUiState() {
        this(null, null, false, false, false, false, null, 127, null);
    }
}
