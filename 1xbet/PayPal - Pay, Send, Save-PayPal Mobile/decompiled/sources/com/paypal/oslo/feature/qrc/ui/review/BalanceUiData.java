package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/BalanceUiData;", "", "", "amount", "currencyCode", "", "isSelected", "isInsufficient", "shouldShowBalanceInsufficientBadge", "isOptedOut", "isEffectiveOptedOut", "chargeableAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/BalanceUiData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getCurrencyCode", "Z", "getShouldShowBalanceInsufficientBadge", "getChargeableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BalanceUiData {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String chargeableAmount;
    private final java.lang.String currencyCode;
    private final boolean isEffectiveOptedOut;
    private final boolean isInsufficient;
    private final boolean isOptedOut;
    private final boolean isSelected;
    private final boolean shouldShowBalanceInsufficientBadge;

    public BalanceUiData(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.currencyCode = str2;
        this.isSelected = z;
        this.isInsufficient = z2;
        this.shouldShowBalanceInsufficientBadge = z3;
        this.isOptedOut = z4;
        this.isEffectiveOptedOut = z5;
        this.chargeableAmount = str3;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isInsufficient() {
        return this.isInsufficient;
    }

    public final boolean getShouldShowBalanceInsufficientBadge() {
        return this.shouldShowBalanceInsufficientBadge;
    }

    public final boolean isOptedOut() {
        return this.isOptedOut;
    }

    public final boolean isEffectiveOptedOut() {
        return this.isEffectiveOptedOut;
    }

    public /* synthetic */ BalanceUiData(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, (i & 16) != 0 ? false : z3, z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? "" : str3);
    }

    public final java.lang.String getChargeableAmount() {
        return this.chargeableAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.currencyCode;
        boolean z = this.isSelected;
        boolean z2 = this.isInsufficient;
        boolean z3 = this.shouldShowBalanceInsufficientBadge;
        boolean z4 = this.isOptedOut;
        boolean z5 = this.isEffectiveOptedOut;
        java.lang.String str3 = this.chargeableAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceUiData(amount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", isInsufficient=");
        sb.append(z2);
        sb.append(", shouldShowBalanceInsufficientBadge=");
        sb.append(z3);
        sb.append(", isOptedOut=");
        sb.append(z4);
        sb.append(", isEffectiveOptedOut=");
        sb.append(z5);
        sb.append(", chargeableAmount=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.amount.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSelected)) * 31) + java.lang.Boolean.hashCode(this.isInsufficient)) * 31) + java.lang.Boolean.hashCode(this.shouldShowBalanceInsufficientBadge)) * 31) + java.lang.Boolean.hashCode(this.isOptedOut)) * 31) + java.lang.Boolean.hashCode(this.isEffectiveOptedOut)) * 31) + this.chargeableAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.BalanceUiData)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.review.BalanceUiData balanceUiData = (com.paypal.oslo.feature.qrc.ui.review.BalanceUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, balanceUiData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceUiData.currencyCode) && this.isSelected == balanceUiData.isSelected && this.isInsufficient == balanceUiData.isInsufficient && this.shouldShowBalanceInsufficientBadge == balanceUiData.shouldShowBalanceInsufficientBadge && this.isOptedOut == balanceUiData.isOptedOut && this.isEffectiveOptedOut == balanceUiData.isEffectiveOptedOut && kotlin.jvm.internal.Intrinsics.areEqual(this.chargeableAmount, balanceUiData.chargeableAmount);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.BalanceUiData copy(java.lang.String amount, java.lang.String currencyCode, boolean isSelected, boolean isInsufficient, boolean shouldShowBalanceInsufficientBadge, boolean isOptedOut, boolean isEffectiveOptedOut, java.lang.String chargeableAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chargeableAmount, "");
        return new com.paypal.oslo.feature.qrc.ui.review.BalanceUiData(amount, currencyCode, isSelected, isInsufficient, shouldShowBalanceInsufficientBadge, isOptedOut, isEffectiveOptedOut, chargeableAmount);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getChargeableAmount() {
        return this.chargeableAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEffectiveOptedOut() {
        return this.isEffectiveOptedOut;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOptedOut() {
        return this.isOptedOut;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldShowBalanceInsufficientBadge() {
        return this.shouldShowBalanceInsufficientBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInsufficient() {
        return this.isInsufficient;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }
}
