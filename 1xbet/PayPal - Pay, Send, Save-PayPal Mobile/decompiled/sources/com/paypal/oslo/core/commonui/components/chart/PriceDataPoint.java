package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "", "", "timestamp", "", "price", "<init>", "(JD)V", "component1", "()J", "component2", "()D", "copy", "(JD)Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getTimestamp", "D", "getPrice"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceDataPoint {
    public static final int $stable = 0;
    private final double price;
    private final long timestamp;

    public PriceDataPoint(long j, double d) {
        this.timestamp = j;
        this.price = d;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final double getPrice() {
        return this.price;
    }

    public final java.lang.String toString() {
        long j = this.timestamp;
        double d = this.price;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PriceDataPoint(timestamp=");
        sb.append(j);
        sb.append(", price=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.timestamp) * 31) + java.lang.Double.hashCode(this.price);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.chart.PriceDataPoint)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint = (com.paypal.oslo.core.commonui.components.chart.PriceDataPoint) other;
        return this.timestamp == priceDataPoint.timestamp && java.lang.Double.compare(this.price, priceDataPoint.price) == 0;
    }

    public final com.paypal.oslo.core.commonui.components.chart.PriceDataPoint copy(long timestamp, double price) {
        return new com.paypal.oslo.core.commonui.components.chart.PriceDataPoint(timestamp, price);
    }

    /* renamed from: component2, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.components.chart.PriceDataPoint copy$default(com.paypal.oslo.core.commonui.components.chart.PriceDataPoint priceDataPoint, long j, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = priceDataPoint.timestamp;
        }
        if ((i & 2) != 0) {
            d = priceDataPoint.price;
        }
        return priceDataPoint.copy(j, d);
    }
}
