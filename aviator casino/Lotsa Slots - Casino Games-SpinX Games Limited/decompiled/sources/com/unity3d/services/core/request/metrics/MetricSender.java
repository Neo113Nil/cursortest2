package com.unity3d.services.core.request.metrics;

/* compiled from: MetricSender.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020!0$H\u0016J\u0006\u0010%\u001a\u00020\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSender;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/di/IServiceComponent;", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "initializationStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/services/core/configuration/Configuration;Lcom/unity3d/services/core/properties/InitializationStatusReader;Lcom/unity3d/ads/core/log/Logger;)V", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "metricSampleRate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sessionToken", "kotlin.jvm.PlatformType", "sendEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "value", "tags", "", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "sendMetrics", "metrics", "", "shutdown", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class MetricSender extends com.unity3d.services.core.request.metrics.MetricSenderBase implements com.unity3d.services.core.di.IServiceComponent {
    private final com.unity3d.services.core.request.metrics.MetricCommonTags commonTags;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
    private final com.unity3d.ads.core.log.Logger logger;
    private final java.lang.String metricEndPoint;
    private final java.lang.String metricSampleRate;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final java.lang.String sessionToken;

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.properties.InitializationStatusReader initializationStatusReader, com.unity3d.ads.core.log.Logger logger) {
        super(initializationStatusReader);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        com.unity3d.services.core.request.metrics.MetricCommonTags metricCommonTags = new com.unity3d.services.core.request.metrics.MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        com.unity3d.services.core.request.metrics.MetricSender metricSender = this;
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers = (com.unity3d.services.core.domain.ISDKDispatchers) metricSender.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (com.unity3d.ads.core.domain.HttpClientProvider) metricSender.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class));
        this.scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public java.lang.String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(java.lang.String event, java.lang.String value, java.util.Map<java.lang.String, java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() == 0) {
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: " + event, null, 2, null);
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
    public void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty()) {
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        java.lang.String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint == null || kotlin.text.StringsKt.isBlank(metricEndPoint)) {
            com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this, metrics), null, new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1(this, metrics, null), 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
