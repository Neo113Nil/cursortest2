package com.paypal.oslo.feature.cryptocurrency.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;", "", "", "selectedPrice", "changeAmountWithIndicator", "changePercentage", "", "isPositiveChange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedPrice", "getChangeAmountWithIndicator", "getChangePercentage", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChartInteractionData {
    public static final int $stable = 0;
    private final java.lang.String changeAmountWithIndicator;
    private final java.lang.String changePercentage;
    private final boolean isPositiveChange;
    private final java.lang.String selectedPrice;

    public ChartInteractionData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.selectedPrice = str;
        this.changeAmountWithIndicator = str2;
        this.changePercentage = str3;
        this.isPositiveChange = z;
    }

    public final java.lang.String getSelectedPrice() {
        return this.selectedPrice;
    }

    public final java.lang.String getChangeAmountWithIndicator() {
        return this.changeAmountWithIndicator;
    }

    public final java.lang.String getChangePercentage() {
        return this.changePercentage;
    }

    public final boolean isPositiveChange() {
        return this.isPositiveChange;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.selectedPrice;
        java.lang.String str2 = this.changeAmountWithIndicator;
        java.lang.String str3 = this.changePercentage;
        boolean z = this.isPositiveChange;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChartInteractionData(selectedPrice=");
        sb.append(str);
        sb.append(", changeAmountWithIndicator=");
        sb.append(str2);
        sb.append(", changePercentage=");
        sb.append(str3);
        sb.append(", isPositiveChange=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.selectedPrice.hashCode() * 31) + this.changeAmountWithIndicator.hashCode()) * 31) + this.changePercentage.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isPositiveChange);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPrice, chartInteractionData.selectedPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.changeAmountWithIndicator, chartInteractionData.changeAmountWithIndicator) && kotlin.jvm.internal.Intrinsics.areEqual(this.changePercentage, chartInteractionData.changePercentage) && this.isPositiveChange == chartInteractionData.isPositiveChange;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData copy(java.lang.String selectedPrice, java.lang.String changeAmountWithIndicator, java.lang.String changePercentage, boolean isPositiveChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedPrice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeAmountWithIndicator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePercentage, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData(selectedPrice, changeAmountWithIndicator, changePercentage, isPositiveChange);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPositiveChange() {
        return this.isPositiveChange;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getChangePercentage() {
        return this.changePercentage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChangeAmountWithIndicator() {
        return this.changeAmountWithIndicator;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSelectedPrice() {
        return this.selectedPrice;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = chartInteractionData.selectedPrice;
        }
        if ((i & 2) != 0) {
            str2 = chartInteractionData.changeAmountWithIndicator;
        }
        if ((i & 4) != 0) {
            str3 = chartInteractionData.changePercentage;
        }
        if ((i & 8) != 0) {
            z = chartInteractionData.isPositiveChange;
        }
        return chartInteractionData.copy(str, str2, str3, z);
    }
}
