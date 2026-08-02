package com.paypal.oslo.feature.cryptocurrency.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;", "", "", "showBuyButton", "showSellButton", "showReceiveButton", "showSendButton", "showConvertButton", "<init>", "(ZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowBuyButton", "getShowSellButton", "getShowReceiveButton", "getShowSendButton", "getShowConvertButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AssetPriceDetailsCardActionsUiState {
    public static final int $stable = 0;
    private final boolean showBuyButton;
    private final boolean showConvertButton;
    private final boolean showReceiveButton;
    private final boolean showSellButton;
    private final boolean showSendButton;

    public AssetPriceDetailsCardActionsUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.showBuyButton = z;
        this.showSellButton = z2;
        this.showReceiveButton = z3;
        this.showSendButton = z4;
        this.showConvertButton = z5;
    }

    public /* synthetic */ AssetPriceDetailsCardActionsUiState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }

    public final boolean getShowBuyButton() {
        return this.showBuyButton;
    }

    public final boolean getShowSellButton() {
        return this.showSellButton;
    }

    public final boolean getShowReceiveButton() {
        return this.showReceiveButton;
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
        boolean z3 = this.showReceiveButton;
        boolean z4 = this.showSendButton;
        boolean z5 = this.showConvertButton;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPriceDetailsCardActionsUiState(showBuyButton=");
        sb.append(z);
        sb.append(", showSellButton=");
        sb.append(z2);
        sb.append(", showReceiveButton=");
        sb.append(z3);
        sb.append(", showSendButton=");
        sb.append(z4);
        sb.append(", showConvertButton=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.showBuyButton) * 31) + java.lang.Boolean.hashCode(this.showSellButton)) * 31) + java.lang.Boolean.hashCode(this.showReceiveButton)) * 31) + java.lang.Boolean.hashCode(this.showSendButton)) * 31) + java.lang.Boolean.hashCode(this.showConvertButton);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState assetPriceDetailsCardActionsUiState = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState) other;
        return this.showBuyButton == assetPriceDetailsCardActionsUiState.showBuyButton && this.showSellButton == assetPriceDetailsCardActionsUiState.showSellButton && this.showReceiveButton == assetPriceDetailsCardActionsUiState.showReceiveButton && this.showSendButton == assetPriceDetailsCardActionsUiState.showSendButton && this.showConvertButton == assetPriceDetailsCardActionsUiState.showConvertButton;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState copy(boolean showBuyButton, boolean showSellButton, boolean showReceiveButton, boolean showSendButton, boolean showConvertButton) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState(showBuyButton, showSellButton, showReceiveButton, showSendButton, showConvertButton);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowConvertButton() {
        return this.showConvertButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSendButton() {
        return this.showSendButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowReceiveButton() {
        return this.showReceiveButton;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowSellButton() {
        return this.showSellButton;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowBuyButton() {
        return this.showBuyButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState assetPriceDetailsCardActionsUiState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = assetPriceDetailsCardActionsUiState.showBuyButton;
        }
        if ((i & 2) != 0) {
            z2 = assetPriceDetailsCardActionsUiState.showSellButton;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = assetPriceDetailsCardActionsUiState.showReceiveButton;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = assetPriceDetailsCardActionsUiState.showSendButton;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = assetPriceDetailsCardActionsUiState.showConvertButton;
        }
        return assetPriceDetailsCardActionsUiState.copy(z, z6, z7, z8, z5);
    }
}
