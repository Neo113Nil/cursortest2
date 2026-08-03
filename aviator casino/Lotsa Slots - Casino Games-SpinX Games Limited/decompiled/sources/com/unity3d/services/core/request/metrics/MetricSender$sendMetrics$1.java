package com.unity3d.services.core.request.metrics;

/* compiled from: MetricSender.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", i = {0}, l = {66, 66}, m = "invokeSuspend", n = {"request"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class MetricSender$sendMetrics$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.unity3d.services.core.request.metrics.Metric> $metrics;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.services.core.request.metrics.MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MetricSender$sendMetrics$1(com.unity3d.services.core.request.metrics.MetricSender metricSender, java.util.List<com.unity3d.services.core.request.metrics.Metric> list, kotlin.coroutines.Continuation<? super com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1> continuation) {
        super(2, continuation);
        this.this$0 = metricSender;
        this.$metrics = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1(this.this$0, this.$metrics, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.unity3d.services.core.request.metrics.MetricCommonTags metricCommonTags;
        java.lang.String str2;
        com.unity3d.services.core.network.model.HttpRequest httpRequest;
        com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
        java.lang.Object invoke;
        java.lang.Object execute$default;
        com.unity3d.services.core.network.model.HttpResponse httpResponse;
        com.unity3d.ads.core.log.Logger logger;
        com.unity3d.ads.core.log.Logger logger2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.this$0.metricSampleRate;
            metricCommonTags = this.this$0.commonTags;
            java.util.List<com.unity3d.services.core.request.metrics.Metric> list = this.$metrics;
            str2 = this.this$0.sessionToken;
            java.lang.String jSONObject = new org.json.JSONObject(new com.unity3d.services.core.request.metrics.MetricsContainer(str, metricCommonTags, list, str2).toMap()).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(container.toMap()).toString()");
            java.lang.String metricEndPoint = this.this$0.getMetricEndPoint();
            if (metricEndPoint == null) {
                metricEndPoint = "";
            }
            httpRequest = new com.unity3d.services.core.network.model.HttpRequest(metricEndPoint, null, com.unity3d.services.core.network.model.RequestType.POST, jSONObject, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131058, null);
            httpClientProvider = this.this$0.httpClientProvider;
            this.L$0 = httpRequest;
            this.label = 1;
            invoke = httpClientProvider.invoke(this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                execute$default = obj;
                httpResponse = (com.unity3d.services.core.network.model.HttpResponse) execute$default;
                if (httpResponse.getStatusCode() / 100 != 2) {
                    logger2 = this.this$0.logger;
                    logger2.debug("Metric " + this.$metrics + " sent to " + this.this$0.getMetricEndPoint());
                } else {
                    logger = this.this$0.logger;
                    com.unity3d.ads.core.log.Logger.DefaultImpls.trace$default(logger, "Metric " + this.$metrics + " failed to send with response code: " + httpResponse.getStatusCode(), null, 2, null);
                }
                return kotlin.Unit.INSTANCE;
            }
            httpRequest = (com.unity3d.services.core.network.model.HttpRequest) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        com.unity3d.services.core.network.model.HttpRequest httpRequest2 = httpRequest;
        this.L$0 = null;
        this.label = 2;
        execute$default = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default((com.unity3d.services.core.network.core.HttpClient) invoke, httpRequest2, false, this, 2, null);
        if (execute$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        httpResponse = (com.unity3d.services.core.network.model.HttpResponse) execute$default;
        if (httpResponse.getStatusCode() / 100 != 2) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
