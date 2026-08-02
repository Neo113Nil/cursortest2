package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/model/AmountOptionItem;", "", "", "amount", "currencyCode", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/model/AmountOptionItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getCurrencyCode", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AmountOptionItem {
    public static final int $stable = 0;
    private final java.lang.String amount;
    private final java.lang.String currencyCode;
    private final boolean isSelected;

    public AmountOptionItem(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currencyCode = str2;
        this.isSelected = z;
    }

    public /* synthetic */ AmountOptionItem(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
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

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.currencyCode;
        boolean z = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountOptionItem(amount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountOptionItem.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountOptionItem.currencyCode) && this.isSelected == amountOptionItem.isSelected;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem copy(java.lang.String amount, java.lang.String currencyCode, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem(amount, currencyCode, isSelected);
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

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = amountOptionItem.amount;
        }
        if ((i & 2) != 0) {
            str2 = amountOptionItem.currencyCode;
        }
        if ((i & 4) != 0) {
            z = amountOptionItem.isSelected;
        }
        return amountOptionItem.copy(str, str2, z);
    }
}
