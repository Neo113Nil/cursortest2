package com.paypal.oslo.feature.balance.ui.autoReload.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/XSellInfo;", "", "", "amount", "", "currencyCode", "transferSpeed", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "copy", "(DLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/XSellInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "D", "getAmount", "Ljava/lang/String;", "getCurrencyCode", "getTransferSpeed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class XSellInfo {
    public static final int $stable = 0;
    private final double amount;
    private final java.lang.String currencyCode;
    private final java.lang.String transferSpeed;

    public XSellInfo(double d, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = d;
        this.currencyCode = str;
        this.transferSpeed = str2;
    }

    public /* synthetic */ XSellInfo(double d, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, (i & 4) != 0 ? null : str2);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getTransferSpeed() {
        return this.transferSpeed;
    }

    public final java.lang.String toString() {
        double d = this.amount;
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.transferSpeed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XSellInfo(amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", transferSpeed=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Double.hashCode(this.amount);
        int hashCode2 = this.currencyCode.hashCode();
        java.lang.String str = this.transferSpeed;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo = (com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo) other;
        return java.lang.Double.compare(this.amount, xSellInfo.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, xSellInfo.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSpeed, xSellInfo.transferSpeed);
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo copy(double amount, java.lang.String currencyCode, java.lang.String transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo(amount, currencyCode, transferSpeed);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTransferSpeed() {
        return this.transferSpeed;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo, double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = xSellInfo.amount;
        }
        if ((i & 2) != 0) {
            str = xSellInfo.currencyCode;
        }
        if ((i & 4) != 0) {
            str2 = xSellInfo.transferSpeed;
        }
        return xSellInfo.copy(d, str, str2);
    }
}
