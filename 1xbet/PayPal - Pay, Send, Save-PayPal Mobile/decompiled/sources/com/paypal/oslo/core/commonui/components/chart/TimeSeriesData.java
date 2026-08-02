package com.paypal.oslo.core.commonui.components.chart;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "", "", "timeframe", "", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "dataPoints", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTimeframe", "Ljava/util/List;", "getDataPoints", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimeSeriesData {
    private final java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> dataPoints;
    private final java.lang.String timeframe;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion INSTANCE = new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion(null);
    public static final int $stable = 8;

    public TimeSeriesData(java.lang.String str, java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.timeframe = str;
        this.dataPoints = list;
    }

    public final java.lang.String getTimeframe() {
        return this.timeframe;
    }

    public final java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> getDataPoints() {
        return this.dataPoints;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData$Companion;", "", "<init>", "()V", "", "currentTime", "", "", "Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "mockBitcoinTimeSeries", "(J)Ljava/util/Map;", "", "p0", "p1", "p2", "", "p3", "p4", "Lkotlin/random/Random;", "p5", "", "Lcom/paypal/oslo/core/commonui/components/chart/PriceDataPoint;", "getHighResolutionOutputSizeshNQ4ISI", "(JJIDLkotlin/random/Random;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ java.util.Map mockBitcoinTimeSeries$default(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData.Companion companion, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = java.lang.System.currentTimeMillis();
            }
            return companion.mockBitcoinTimeSeries(j);
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.core.commonui.components.chart.TimeSeriesData> mockBitcoinTimeSeries(long currentTime) {
            kotlin.random.Random Random = kotlin.random.RandomKt.Random(42);
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("24H", new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData("24H", getHighResolutionOutputSizeshNQ4ISI(currentTime, 3600000L, 24, 0.02d, Random))), kotlin.TuplesKt.to("1W", new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData("1W", getHighResolutionOutputSizeshNQ4ISI(currentTime, com.statsig.androidsdk.NetworkFallbackResolverKt.COOLDOWN_TIME_MS, 42, 0.05d, Random))), kotlin.TuplesKt.to("1M", new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData("1M", getHighResolutionOutputSizeshNQ4ISI(currentTime, 86400000L, 30, 0.08d, Random))));
        }

        private static java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> getHighResolutionOutputSizeshNQ4ISI(long j, long j2, int i, double d, kotlin.random.Random random) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            double d2 = 67234.56d;
            for (int i2 = 0; i2 < i; i2++) {
                d2 = java.lang.Math.max(d2 + (java.lang.Math.sqrt(java.lang.Math.log(java.lang.Math.max(random.nextDouble(), 1.0E-10d)) * (-2.0d)) * java.lang.Math.cos(random.nextDouble() * 6.283185307179586d) * d * d2) + ((67234.56d - d2) * 0.1d), 6723.456d);
                arrayList.add(new com.paypal.oslo.core.commonui.components.chart.PriceDataPoint(j - (((i - 1) - i2) * j2), d2));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.timeframe;
        java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> list = this.dataPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeSeriesData(timeframe=");
        sb.append(str);
        sb.append(", dataPoints=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.timeframe.hashCode() * 31) + this.dataPoints.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.chart.TimeSeriesData)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData = (com.paypal.oslo.core.commonui.components.chart.TimeSeriesData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.timeframe, timeSeriesData.timeframe) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataPoints, timeSeriesData.dataPoints);
    }

    public final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData copy(java.lang.String timeframe, java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> dataPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeframe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPoints, "");
        return new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData(timeframe, dataPoints);
    }

    public final java.util.List<com.paypal.oslo.core.commonui.components.chart.PriceDataPoint> component2() {
        return this.dataPoints;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTimeframe() {
        return this.timeframe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.commonui.components.chart.TimeSeriesData copy$default(com.paypal.oslo.core.commonui.components.chart.TimeSeriesData timeSeriesData, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = timeSeriesData.timeframe;
        }
        if ((i & 2) != 0) {
            list = timeSeriesData.dataPoints;
        }
        return timeSeriesData.copy(str, list);
    }
}
