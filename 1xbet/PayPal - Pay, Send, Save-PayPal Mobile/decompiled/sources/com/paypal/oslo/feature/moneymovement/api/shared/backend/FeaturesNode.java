package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;", "", "", "showRequestButton", "enableCurrencyToggle", "showExchangeRate", "showNetworkFee", "showPreselectedAmounts", "showAmountLimits", "<init>", "(ZZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZZZZ)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowRequestButton", "getEnableCurrencyToggle", "getShowExchangeRate", "getShowNetworkFee", "getShowPreselectedAmounts", "getShowAmountLimits"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeaturesNode {
    public static final int $stable = 0;
    private final boolean enableCurrencyToggle;
    private final boolean showAmountLimits;
    private final boolean showExchangeRate;
    private final boolean showNetworkFee;
    private final boolean showPreselectedAmounts;
    private final boolean showRequestButton;

    public FeaturesNode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.showRequestButton = z;
        this.enableCurrencyToggle = z2;
        this.showExchangeRate = z3;
        this.showNetworkFee = z4;
        this.showPreselectedAmounts = z5;
        this.showAmountLimits = z6;
    }

    public /* synthetic */ FeaturesNode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6);
    }

    public final boolean getShowRequestButton() {
        return this.showRequestButton;
    }

    public final boolean getEnableCurrencyToggle() {
        return this.enableCurrencyToggle;
    }

    public final boolean getShowExchangeRate() {
        return this.showExchangeRate;
    }

    public final boolean getShowNetworkFee() {
        return this.showNetworkFee;
    }

    public final boolean getShowPreselectedAmounts() {
        return this.showPreselectedAmounts;
    }

    public final boolean getShowAmountLimits() {
        return this.showAmountLimits;
    }

    public final java.lang.String toString() {
        boolean z = this.showRequestButton;
        boolean z2 = this.enableCurrencyToggle;
        boolean z3 = this.showExchangeRate;
        boolean z4 = this.showNetworkFee;
        boolean z5 = this.showPreselectedAmounts;
        boolean z6 = this.showAmountLimits;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeaturesNode(showRequestButton=");
        sb.append(z);
        sb.append(", enableCurrencyToggle=");
        sb.append(z2);
        sb.append(", showExchangeRate=");
        sb.append(z3);
        sb.append(", showNetworkFee=");
        sb.append(z4);
        sb.append(", showPreselectedAmounts=");
        sb.append(z5);
        sb.append(", showAmountLimits=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.showRequestButton) * 31) + java.lang.Boolean.hashCode(this.enableCurrencyToggle)) * 31) + java.lang.Boolean.hashCode(this.showExchangeRate)) * 31) + java.lang.Boolean.hashCode(this.showNetworkFee)) * 31) + java.lang.Boolean.hashCode(this.showPreselectedAmounts)) * 31) + java.lang.Boolean.hashCode(this.showAmountLimits);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode = (com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode) other;
        return this.showRequestButton == featuresNode.showRequestButton && this.enableCurrencyToggle == featuresNode.enableCurrencyToggle && this.showExchangeRate == featuresNode.showExchangeRate && this.showNetworkFee == featuresNode.showNetworkFee && this.showPreselectedAmounts == featuresNode.showPreselectedAmounts && this.showAmountLimits == featuresNode.showAmountLimits;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode copy(boolean showRequestButton, boolean enableCurrencyToggle, boolean showExchangeRate, boolean showNetworkFee, boolean showPreselectedAmounts, boolean showAmountLimits) {
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode(showRequestButton, enableCurrencyToggle, showExchangeRate, showNetworkFee, showPreselectedAmounts, showAmountLimits);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowAmountLimits() {
        return this.showAmountLimits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowPreselectedAmounts() {
        return this.showPreselectedAmounts;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNetworkFee() {
        return this.showNetworkFee;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowExchangeRate() {
        return this.showExchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableCurrencyToggle() {
        return this.enableCurrencyToggle;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowRequestButton() {
        return this.showRequestButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode copy$default(com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = featuresNode.showRequestButton;
        }
        if ((i & 2) != 0) {
            z2 = featuresNode.enableCurrencyToggle;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = featuresNode.showExchangeRate;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = featuresNode.showNetworkFee;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = featuresNode.showPreselectedAmounts;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            z6 = featuresNode.showAmountLimits;
        }
        return featuresNode.copy(z, z7, z8, z9, z10, z6);
    }

    public FeaturesNode() {
        this(false, false, false, false, false, false, 63, null);
    }
}
