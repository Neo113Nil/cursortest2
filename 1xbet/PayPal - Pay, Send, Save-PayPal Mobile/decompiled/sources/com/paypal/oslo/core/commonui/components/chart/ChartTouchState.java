package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/ChartTouchState;", "", "", "touchXPx", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "dataPoint", "", "dataPointIndex", "<init>", "(FLcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;I)V", "component1", "()F", "component2", "()Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "component3", "()I", "copy", "(FLcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;I)Lcom/paypal/oslo/core/commonui/components/chart/ChartTouchState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTouchXPx", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "getDataPoint", com.visa.cbp.getEncExpo.warmup, "getDataPointIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChartTouchState {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.commonui.components.chart.PriceDataPoint dataPoint;
    private final int dataPointIndex;
    private final float touchXPx;

    public ChartTouchState(float f, com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceDataPoint, "");
        this.touchXPx = f;
        this.dataPoint = priceDataPoint;
        this.dataPointIndex = i;
    }

    public final float getTouchXPx() {
        return this.touchXPx;
    }

    public final com.paypal.oslo.core.commonui.components.chart.PriceDataPoint getDataPoint() {
        return this.dataPoint;
    }

    public final int getDataPointIndex() {
        return this.dataPointIndex;
    }

    public final java.lang.String toString() {
        float f = this.touchXPx;
        com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint = this.dataPoint;
        int i = this.dataPointIndex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChartTouchState(touchXPx=");
        sb.append(f);
        sb.append(", dataPoint=");
        sb.append(priceDataPoint);
        sb.append(", dataPointIndex=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.touchXPx) * 31) + this.dataPoint.hashCode()) * 31) + java.lang.Integer.hashCode(this.dataPointIndex);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.chart.ChartTouchState)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.chart.ChartTouchState chartTouchState = (com.paypal.oslo.core.commonui.components.chart.ChartTouchState) other;
        return java.lang.Float.compare(this.touchXPx, chartTouchState.touchXPx) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.dataPoint, chartTouchState.dataPoint) && this.dataPointIndex == chartTouchState.dataPointIndex;
    }

    public final com.paypal.oslo.core.commonui.components.chart.ChartTouchState copy(float touchXPx, com.paypal.oslo.core.commonui.components.chart.PriceDataPoint dataPoint, int dataPointIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPoint, "");
        return new com.paypal.oslo.core.commonui.components.chart.ChartTouchState(touchXPx, dataPoint, dataPointIndex);
    }

    /* renamed from: component3, reason: from getter */
    public final int getDataPointIndex() {
        return this.dataPointIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.components.chart.PriceDataPoint getDataPoint() {
        return this.dataPoint;
    }

    /* renamed from: component1, reason: from getter */
    public final float getTouchXPx() {
        return this.touchXPx;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.components.chart.ChartTouchState copy$default(com.paypal.oslo.core.commonui.components.chart.ChartTouchState chartTouchState, float f, com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            f = chartTouchState.touchXPx;
        }
        if ((i2 & 2) != 0) {
            priceDataPoint = chartTouchState.dataPoint;
        }
        if ((i2 & 4) != 0) {
            i = chartTouchState.dataPointIndex;
        }
        return chartTouchState.copy(f, priceDataPoint, i);
    }
}
