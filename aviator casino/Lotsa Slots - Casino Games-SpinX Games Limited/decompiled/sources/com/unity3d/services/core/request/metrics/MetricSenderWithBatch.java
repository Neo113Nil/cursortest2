package com.unity3d.services.core.request.metrics;

/* compiled from: MetricSenderWithBatch.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0003R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSenderWithBatch;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "_original", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "initializationStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "(Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;Lcom/unity3d/services/core/properties/InitializationStatusReader;)V", "_logger", "Lcom/unity3d/ads/core/log/Logger;", "get_logger", "()Lcom/unity3d/ads/core/log/Logger;", "_logger$delegate", "Lkotlin/Lazy;", "_queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/unity3d/services/core/request/metrics/Metric;", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "sendEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "value", "tags", "", "sendMetric", "metric", "sendMetrics", "metrics", "", "sendQueueIfNeeded", "updateOriginal", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MetricSenderWithBatch extends com.unity3d.services.core.request.metrics.MetricSenderBase {

    /* renamed from: _logger$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy _logger;
    private com.unity3d.services.core.request.metrics.SDKMetricsSender _original;
    private final java.util.concurrent.LinkedBlockingQueue<com.unity3d.services.core.request.metrics.Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(com.unity3d.services.core.request.metrics.SDKMetricsSender _original, com.unity3d.services.core.properties.InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_original, "_original");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new java.util.concurrent.LinkedBlockingQueue<>();
        this._logger = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.log.Logger>() { // from class: com.unity3d.services.core.request.metrics.MetricSenderWithBatch$_logger$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.core.log.Logger invoke() {
                return (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.log.Logger.class);
            }
        });
    }

    private final com.unity3d.ads.core.log.Logger get_logger() {
        java.lang.Object value = this._logger.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-_logger>(...)");
        return (com.unity3d.ads.core.log.Logger) value;
    }

    public final void updateOriginal(com.unity3d.services.core.request.metrics.SDKMetricsSender metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._original = metrics;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(java.lang.String event, java.lang.String value, java.util.Map<java.lang.String, java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() == 0) {
            get_logger().debug("Metric event not sent due to being empty: " + event);
            return;
        }
        sendMetrics(kotlin.collections.CollectionsKt.listOf(new com.unity3d.services.core.request.metrics.Metric(event, value, tags)));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "metric");
        sendMetrics(kotlin.collections.CollectionsKt.listOf(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!android.text.TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public java.lang.String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(kotlin.collections.CollectionsKt.emptyList());
    }
}
