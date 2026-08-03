package com.vungle.ads;

/* compiled from: Metrics.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/Metric;", "", "metricType", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", com.adjust.sdk.Constants.REFERRER_API_META, "", "getMeta", "()Ljava/lang/String;", "setMeta", "(Ljava/lang/String;)V", "getMetricType", "()Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "setMetricType", "getValue", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Metric {
    private java.lang.String meta;
    private com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType;

    public abstract long getValue();

    public Metric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType metricType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    public final com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public final void setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }

    public final java.lang.String getMeta() {
        return this.meta;
    }

    public final void setMeta(java.lang.String str) {
        this.meta = str;
    }
}
