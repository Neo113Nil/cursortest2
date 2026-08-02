package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "", "", "showBuyButton", "showSellButton", "showReceiveButtonInHoldingsCard", "showReceiveButtonAsATransferAction", "showSendButton", "showConvertButton", "<init>", "(ZZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZZZZ)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowBuyButton", "getShowSellButton", "getShowReceiveButtonInHoldingsCard", "getShowReceiveButtonAsATransferAction", "getShowSendButton", "getShowConvertButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HoldingsCardActionsUiState {
    public static final int $stable = 0;
    private final boolean showBuyButton;
    private final boolean showConvertButton;
    private final boolean showReceiveButtonAsATransferAction;
    private final boolean showReceiveButtonInHoldingsCard;
    private final boolean showSellButton;
    private final boolean showSendButton;

    public HoldingsCardActionsUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.showBuyButton = z;
        this.showSellButton = z2;
        this.showReceiveButtonInHoldingsCard = z3;
        this.showReceiveButtonAsATransferAction = z4;
        this.showSendButton = z5;
        this.showConvertButton = z6;
    }

    public /* synthetic */ HoldingsCardActionsUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
    }

    public final boolean getShowBuyButton() {
        return this.showBuyButton;
    }

    public final boolean getShowSellButton() {
        return this.showSellButton;
    }

    public final boolean getShowReceiveButtonInHoldingsCard() {
        return this.showReceiveButtonInHoldingsCard;
    }

    public final boolean getShowReceiveButtonAsATransferAction() {
        return this.showReceiveButtonAsATransferAction;
    }

    public final boolean getShowSendButton() {
        return this.showSendButton;
    }

    public final boolean getShowConvertButton() {
        return this.showConvertButton;
    }

    public final java.lang.String toString() {
        boolean z = this.showBuyButton;
        boolean z2 = this.showSellButton;
        boolean z3 = this.showReceiveButtonInHoldingsCard;
        boolean z4 = this.showReceiveButtonAsATransferAction;
        boolean z5 = this.showSendButton;
        boolean z6 = this.showConvertButton;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HoldingsCardActionsUiState(showBuyButton=");
        sb.append(z);
        sb.append(", showSellButton=");
        sb.append(z2);
        sb.append(", showReceiveButtonInHoldingsCard=");
        sb.append(z3);
        sb.append(", showReceiveButtonAsATransferAction=");
        sb.append(z4);
        sb.append(", showSendButton=");
        sb.append(z5);
        sb.append(", showConvertButton=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.showBuyButton) * 31) + java.lang.Boolean.hashCode(this.showSellButton)) * 31) + java.lang.Boolean.hashCode(this.showReceiveButtonInHoldingsCard)) * 31) + java.lang.Boolean.hashCode(this.showReceiveButtonAsATransferAction)) * 31) + java.lang.Boolean.hashCode(this.showSendButton)) * 31) + java.lang.Boolean.hashCode(this.showConvertButton);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState) other;
        return this.showBuyButton == holdingsCardActionsUiState.showBuyButton && this.showSellButton == holdingsCardActionsUiState.showSellButton && this.showReceiveButtonInHoldingsCard == holdingsCardActionsUiState.showReceiveButtonInHoldingsCard && this.showReceiveButtonAsATransferAction == holdingsCardActionsUiState.showReceiveButtonAsATransferAction && this.showSendButton == holdingsCardActionsUiState.showSendButton && this.showConvertButton == holdingsCardActionsUiState.showConvertButton;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState copy(boolean showBuyButton, boolean showSellButton, boolean showReceiveButtonInHoldingsCard, boolean showReceiveButtonAsATransferAction, boolean showSendButton, boolean showConvertButton) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState(showBuyButton, showSellButton, showReceiveButtonInHoldingsCard, showReceiveButtonAsATransferAction, showSendButton, showConvertButton);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowConvertButton() {
        return this.showConvertButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowSendButton() {
        return this.showSendButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowReceiveButtonAsATransferAction() {
        return this.showReceiveButtonAsATransferAction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowReceiveButtonInHoldingsCard() {
        return this.showReceiveButtonInHoldingsCard;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowSellButton() {
        return this.showSellButton;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowBuyButton() {
        return this.showBuyButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = holdingsCardActionsUiState.showBuyButton;
        }
        if ((i & 2) != 0) {
            z2 = holdingsCardActionsUiState.showSellButton;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = holdingsCardActionsUiState.showReceiveButtonInHoldingsCard;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = holdingsCardActionsUiState.showReceiveButtonAsATransferAction;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = holdingsCardActionsUiState.showSendButton;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            z6 = holdingsCardActionsUiState.showConvertButton;
        }
        return holdingsCardActionsUiState.copy(z, z7, z8, z9, z10, z6);
    }
}
