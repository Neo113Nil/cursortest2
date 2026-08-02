package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "", "", "chartSummaryDescription", "", "segmentDescriptions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/core/commonui/components/chart/PriceChartAccessibilityInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChartSummaryDescription", "Ljava/util/List;", "getSegmentDescriptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceChartAccessibilityInfo {
    public static final int $stable = 8;
    private final java.lang.String chartSummaryDescription;
    private final java.util.List<java.lang.String> segmentDescriptions;

    public PriceChartAccessibilityInfo(java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.chartSummaryDescription = str;
        this.segmentDescriptions = list;
    }

    public final java.lang.String getChartSummaryDescription() {
        return this.chartSummaryDescription;
    }

    public final java.util.List<java.lang.String> getSegmentDescriptions() {
        return this.segmentDescriptions;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.chartSummaryDescription;
        java.util.List<java.lang.String> list = this.segmentDescriptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PriceChartAccessibilityInfo(chartSummaryDescription=");
        sb.append(str);
        sb.append(", segmentDescriptions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.chartSummaryDescription.hashCode() * 31) + this.segmentDescriptions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo = (com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.chartSummaryDescription, priceChartAccessibilityInfo.chartSummaryDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.segmentDescriptions, priceChartAccessibilityInfo.segmentDescriptions);
    }

    public final com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo copy(java.lang.String chartSummaryDescription, java.util.List<java.lang.String> segmentDescriptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chartSummaryDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segmentDescriptions, "");
        return new com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo(chartSummaryDescription, segmentDescriptions);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.segmentDescriptions;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChartSummaryDescription() {
        return this.chartSummaryDescription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo copy$default(com.paypal.oslo.core.commonui.components.chart.PriceChartAccessibilityInfo priceChartAccessibilityInfo, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = priceChartAccessibilityInfo.chartSummaryDescription;
        }
        if ((i & 2) != 0) {
            list = priceChartAccessibilityInfo.segmentDescriptions;
        }
        return priceChartAccessibilityInfo.copy(str, list);
    }
}
