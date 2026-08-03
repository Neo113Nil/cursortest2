package com.vungle.ads;

/* compiled from: Metrics.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\u000f\u001a\u00020\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/SingleValueMetric;", "Lcom/vungle/ads/Metric;", "metricType", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "value", "", "getValue", "()Ljava/lang/Long;", "setValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "addValue", "", "add", "markTime", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class SingleValueMetric extends com.vungle.ads.Metric {
    private java.lang.Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final java.lang.Long getValue() {
        return this.value;
    }

    public final void setValue(java.lang.Long l) {
        this.value = l;
    }

    public final void markTime() {
        this.value = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }

    public final void addValue(long add) {
        java.lang.Long l = this.value;
        this.value = java.lang.Long.valueOf((l != null ? l.longValue() : 0L) + add);
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        java.lang.Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
