package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J0\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u001a\u0010(\u001a\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "config", "<init>", "(Lio/ktor/client/engine/okhttp/OkHttpConfig;)V", "Lio/ktor/client/request/HttpRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "Lokhttp3/OkHttpClient;", "p0", "Lokhttp3/Request;", "p1", "Lkotlin/coroutines/CoroutineContext;", "p2", "Camera2StreamConfigurationMap", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "p3", "getHighSpeedVideoFpsRanges", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Response;", "Lio/ktor/util/date/GMTDate;", "", "(Lokhttp3/Response;Lio/ktor/util/date/GMTDate;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/client/request/HttpResponseData;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "getConfig", "()Lio/ktor/client/engine/okhttp/OkHttpConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpEngine extends io.ktor.client.engine.HttpClientEngineBase {
    private static final io.ktor.client.engine.okhttp.OkHttpEngine.Companion Companion = new io.ktor.client.engine.okhttp.OkHttpEngine.Companion(null);
    private static final kotlin.Lazy<okhttp3.OkHttpClient> getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            okhttp3.OkHttpClient build;
            build = new okhttp3.OkHttpClient.Builder().build();
            return build;
        }
    });
    private final io.ktor.client.engine.okhttp.OkHttpConfig config;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<io.ktor.client.plugins.HttpTimeoutConfig, okhttp3.OkHttpClient> getHighSpeedVideoFpsRanges;
    private final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> supportedCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngine(io.ktor.client.engine.okhttp.OkHttpConfig okHttpConfig) {
        super("ktor-okhttp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpConfig, "");
        this.config = okHttpConfig;
        this.supportedCapabilities = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new io.ktor.client.engine.HttpClientEngineCapability[]{io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, io.ktor.client.plugins.websocket.WebSocketCapability.INSTANCE, io.ktor.client.plugins.sse.SSECapability.INSTANCE});
        this.getHighSpeedVideoFpsRanges = io.ktor.util.CacheKt.createLRUCache(new io.ktor.client.engine.okhttp.OkHttpEngine$clientCache$1(this), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.okhttp.OkHttpEngine.$r8$lambda$s8HnBhlJb3mH_xf6R1ypHQkJgEo((okhttp3.OkHttpClient) obj);
            }
        }, getConfig().getClientCacheSize());
        kotlin.coroutines.CoroutineContext.Element element = super.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        kotlin.coroutines.CoroutineContext SilentSupervisor = io.ktor.util.CoroutinesUtilsKt.SilentSupervisor((kotlinx.coroutines.Job) element);
        this.Camera2StreamConfigurationMap = SilentSupervisor;
        this.coroutineContext = super.getCoroutineContext().plus(SilentSupervisor);
        kotlinx.coroutines.BuildersKt.launch(kotlinx.coroutines.GlobalScope.INSTANCE, super.getCoroutineContext(), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.client.engine.okhttp.OkHttpEngine.AnonymousClass1(null));
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public final io.ktor.client.engine.okhttp.OkHttpConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.Iterator it;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.coroutines.CoroutineContext.Element element = io.ktor.client.engine.okhttp.OkHttpEngine.this.Camera2StreamConfigurationMap.get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (((kotlinx.coroutines.Job) element).join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) ((java.util.Map.Entry) it.next()).getValue();
                    okHttpClient.connectionPool().evictAll();
                    okHttpClient.dispatcher().executorService().shutdown();
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                it = io.ktor.client.engine.okhttp.OkHttpEngine.this.getHighSpeedVideoFpsRanges.entrySet().iterator();
                while (it.hasNext()) {
                    okhttp3.OkHttpClient okHttpClient2 = (okhttp3.OkHttpClient) ((java.util.Map.Entry) it.next()).getValue();
                    okHttpClient2.connectionPool().evictAll();
                    okHttpClient2.dispatcher().executorService().shutdown();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.client.engine.okhttp.OkHttpEngine.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return io.ktor.client.engine.okhttp.OkHttpEngine.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngine.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0057, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngine$execute$1 okHttpEngine$execute$1;
        int i;
        okhttp3.OkHttpClient okHttpClient;
        if (continuation instanceof io.ktor.client.engine.okhttp.OkHttpEngine$execute$1) {
            okHttpEngine$execute$1 = (io.ktor.client.engine.okhttp.OkHttpEngine$execute$1) continuation;
            if ((okHttpEngine$execute$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                okHttpEngine$execute$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                io.ktor.client.engine.okhttp.OkHttpEngine$execute$1 okHttpEngine$execute$12 = okHttpEngine$execute$1;
                java.lang.Object obj = okHttpEngine$execute$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okHttpEngine$execute$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    okHttpEngine$execute$12.getHighResolutionOutputSizeshNQ4ISI = httpRequestData;
                    okHttpEngine$execute$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = io.ktor.client.engine.UtilsKt.callContext(okHttpEngine$execute$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        if (i == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    httpRequestData = (io.ktor.client.request.HttpRequestData) okHttpEngine$execute$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.request.HttpRequestData httpRequestData2 = httpRequestData;
                kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) obj;
                okhttp3.Request access$convertToOkHttpRequest = io.ktor.client.engine.okhttp.OkHttpEngineKt.access$convertToOkHttpRequest(httpRequestData2, coroutineContext);
                okHttpClient = this.getHighSpeedVideoFpsRanges.get(httpRequestData2.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE));
                if (okHttpClient != null) {
                    throw new java.lang.IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed".toString());
                }
                if (io.ktor.client.request.HttpRequestKt.isUpgradeRequest(httpRequestData2)) {
                    okHttpEngine$execute$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    okHttpEngine$execute$12.getHighSpeedVideoFpsRangesFor = 2;
                    java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(okHttpClient, access$convertToOkHttpRequest, coroutineContext, okHttpEngine$execute$12);
                    if (Camera2StreamConfigurationMap != coroutine_suspended) {
                        return Camera2StreamConfigurationMap;
                    }
                } else if (io.ktor.client.request.HttpRequestKt.isSseRequest(httpRequestData2)) {
                    okHttpEngine$execute$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    okHttpEngine$execute$12.getHighSpeedVideoFpsRangesFor = 3;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(okHttpClient, access$convertToOkHttpRequest, coroutineContext, okHttpEngine$execute$12);
                    if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                        return highSpeedVideoFpsRangesFor;
                    }
                } else {
                    okHttpEngine$execute$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    okHttpEngine$execute$12.getHighSpeedVideoFpsRangesFor = 4;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(okHttpClient, access$convertToOkHttpRequest, coroutineContext, httpRequestData2, okHttpEngine$execute$12);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        return highSpeedVideoFpsRanges;
                    }
                }
                return coroutine_suspended;
            }
        }
        okHttpEngine$execute$1 = new io.ktor.client.engine.okhttp.OkHttpEngine$execute$1(this, continuation);
        io.ktor.client.engine.okhttp.OkHttpEngine$execute$1 okHttpEngine$execute$122 = okHttpEngine$execute$1;
        java.lang.Object obj2 = okHttpEngine$execute$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttpEngine$execute$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        io.ktor.client.request.HttpRequestData httpRequestData22 = httpRequestData;
        kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) obj2;
        okhttp3.Request access$convertToOkHttpRequest2 = io.ktor.client.engine.okhttp.OkHttpEngineKt.access$convertToOkHttpRequest(httpRequestData22, coroutineContext2);
        okHttpClient = this.getHighSpeedVideoFpsRanges.get(httpRequestData22.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE));
        if (okHttpClient != null) {
        }
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        kotlin.coroutines.CoroutineContext.Element element = this.Camera2StreamConfigurationMap.get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
        ((kotlinx.coroutines.CompletableJob) element).complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1 okHttpEngine$executeWebSocketRequest$1;
        int i;
        io.ktor.util.date.GMTDate gMTDate;
        io.ktor.client.engine.okhttp.OkHttpWebsocketSession okHttpWebsocketSession;
        if (continuation instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1) {
            okHttpEngine$executeWebSocketRequest$1 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1) continuation;
            if ((okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.util.date.GMTDate GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                    okhttp3.OkHttpClient webSocketFactory = getConfig().getWebSocketFactory();
                    if (webSocketFactory == null) {
                        webSocketFactory = okHttpClient;
                    }
                    io.ktor.client.engine.okhttp.OkHttpWebsocketSession okHttpWebsocketSession2 = new io.ktor.client.engine.okhttp.OkHttpWebsocketSession(okHttpClient, webSocketFactory, request, coroutineContext);
                    okHttpWebsocketSession2.start();
                    kotlinx.coroutines.CompletableDeferred<okhttp3.Response> originResponse$ktor_client_okhttp = okHttpWebsocketSession2.getOriginResponse$ktor_client_okhttp();
                    okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRangesFor = coroutineContext;
                    okHttpEngine$executeWebSocketRequest$1.getHighResolutionOutputSizeshNQ4ISI = GMTDate$default;
                    okHttpEngine$executeWebSocketRequest$1.Camera2StreamConfigurationMap = okHttpWebsocketSession2;
                    okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object await = originResponse$ktor_client_okhttp.await(okHttpEngine$executeWebSocketRequest$1);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gMTDate = GMTDate$default;
                    obj = await;
                    okHttpWebsocketSession = okHttpWebsocketSession2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    okHttpWebsocketSession = (io.ktor.client.engine.okhttp.OkHttpWebsocketSession) okHttpEngine$executeWebSocketRequest$1.Camera2StreamConfigurationMap;
                    gMTDate = (io.ktor.util.date.GMTDate) okHttpEngine$executeWebSocketRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutineContext = (kotlin.coroutines.CoroutineContext) okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return Camera2StreamConfigurationMap((okhttp3.Response) obj, gMTDate, okHttpWebsocketSession, coroutineContext);
            }
        }
        okHttpEngine$executeWebSocketRequest$1 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1(this, continuation);
        java.lang.Object obj2 = okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttpEngine$executeWebSocketRequest$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return Camera2StreamConfigurationMap((okhttp3.Response) obj2, gMTDate, okHttpWebsocketSession, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1 okHttpEngine$executeServerSendEventsRequest$1;
        int i;
        io.ktor.util.date.GMTDate gMTDate;
        io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession;
        if (continuation instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1) {
            okHttpEngine$executeServerSendEventsRequest$1 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1) continuation;
            if ((okHttpEngine$executeServerSendEventsRequest$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                okHttpEngine$executeServerSendEventsRequest$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okHttpEngine$executeServerSendEventsRequest$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.util.date.GMTDate GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                    io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession2 = new io.ktor.client.engine.okhttp.OkHttpSSESession(okHttpClient, request, coroutineContext);
                    kotlinx.coroutines.CompletableDeferred<okhttp3.Response> originResponse$ktor_client_okhttp = okHttpSSESession2.getOriginResponse$ktor_client_okhttp();
                    okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoFpsRangesFor = coroutineContext;
                    okHttpEngine$executeServerSendEventsRequest$1.getHighResolutionOutputSizeshNQ4ISI = GMTDate$default;
                    okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoFpsRanges = okHttpSSESession2;
                    okHttpEngine$executeServerSendEventsRequest$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object await = originResponse$ktor_client_okhttp.await(okHttpEngine$executeServerSendEventsRequest$1);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gMTDate = GMTDate$default;
                    obj = await;
                    okHttpSSESession = okHttpSSESession2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    okHttpSSESession = (io.ktor.client.engine.okhttp.OkHttpSSESession) okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoFpsRanges;
                    gMTDate = (io.ktor.util.date.GMTDate) okHttpEngine$executeServerSendEventsRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutineContext = (kotlin.coroutines.CoroutineContext) okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return Camera2StreamConfigurationMap((okhttp3.Response) obj, gMTDate, okHttpSSESession, coroutineContext);
            }
        }
        okHttpEngine$executeServerSendEventsRequest$1 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1(this, continuation);
        java.lang.Object obj2 = okHttpEngine$executeServerSendEventsRequest$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttpEngine$executeServerSendEventsRequest$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return Camera2StreamConfigurationMap((okhttp3.Response) obj2, gMTDate, okHttpSSESession, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r7 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, r8, false, (kotlin.jvm.functions.Function2) new io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1(r7, r8, r9, null), 2, (java.lang.Object) null).getChannel();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1 okHttpEngine$executeHttpRequest$1;
        int i;
        io.ktor.util.date.GMTDate gMTDate;
        final okhttp3.ResponseBody body;
        io.ktor.utils.io.ByteReadChannel empty;
        if (continuation instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1) {
            okHttpEngine$executeHttpRequest$1 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1) continuation;
            if ((okHttpEngine$executeHttpRequest$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                okHttpEngine$executeHttpRequest$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = okHttpEngine$executeHttpRequest$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okHttpEngine$executeHttpRequest$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.util.date.GMTDate GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                    okHttpEngine$executeHttpRequest$1.getHighSpeedVideoFpsRanges = coroutineContext;
                    okHttpEngine$executeHttpRequest$1.getHighSpeedVideoSizes = httpRequestData;
                    okHttpEngine$executeHttpRequest$1.getHighResolutionOutputSizeshNQ4ISI = GMTDate$default;
                    okHttpEngine$executeHttpRequest$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object execute = io.ktor.client.engine.okhttp.OkUtilsKt.execute(okHttpClient, request, httpRequestData, coroutineContext, okHttpEngine$executeHttpRequest$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = execute;
                    gMTDate = GMTDate$default;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gMTDate = (io.ktor.util.date.GMTDate) okHttpEngine$executeHttpRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    httpRequestData = (io.ktor.client.request.HttpRequestData) okHttpEngine$executeHttpRequest$1.getHighSpeedVideoSizes;
                    coroutineContext = (kotlin.coroutines.CoroutineContext) okHttpEngine$executeHttpRequest$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                okhttp3.Response response = (okhttp3.Response) obj;
                body = response.body();
                kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
                kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                ((kotlinx.coroutines.Job) element).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.engine.okhttp.OkHttpEngine.$r8$lambda$RyoJKydJ_ODk5jukjvpWVCxFYeM(okhttp3.ResponseBody.this, (java.lang.Throwable) obj2);
                    }
                });
                if (body != null || (r7 = body.getGetHighResolutionOutputSizeshNQ4ISI()) == null || empty == null) {
                    empty = io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
                }
                return Camera2StreamConfigurationMap(response, gMTDate, empty, coroutineContext);
            }
        }
        okHttpEngine$executeHttpRequest$1 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1(this, continuation);
        java.lang.Object obj2 = okHttpEngine$executeHttpRequest$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttpEngine$executeHttpRequest$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        okhttp3.Response response2 = (okhttp3.Response) obj2;
        body = response2.body();
        kotlin.coroutines.CoroutineContext.Element element2 = coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element2);
        ((kotlinx.coroutines.Job) element2).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return io.ktor.client.engine.okhttp.OkHttpEngine.$r8$lambda$RyoJKydJ_ODk5jukjvpWVCxFYeM(okhttp3.ResponseBody.this, (java.lang.Throwable) obj22);
            }
        });
        if (body != null) {
        }
        empty = io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
        return Camera2StreamConfigurationMap(response2, gMTDate, empty, coroutineContext);
    }

    private static io.ktor.client.request.HttpResponseData Camera2StreamConfigurationMap(okhttp3.Response p0, io.ktor.util.date.GMTDate p1, java.lang.Object p2, kotlin.coroutines.CoroutineContext p3) {
        return new io.ktor.client.request.HttpResponseData(new io.ktor.http.HttpStatusCode(p0.code(), p0.message()), p1, io.ktor.client.engine.okhttp.OkUtilsKt.fromOkHttp(p0.headers()), io.ktor.client.engine.okhttp.OkUtilsKt.fromOkHttp(p0.protocol()), p2, p3);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine$Companion;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "()Lokhttp3/OkHttpClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static okhttp3.OkHttpClient getHighSpeedVideoFpsRangesFor() {
            return (okhttp3.OkHttpClient) io.ktor.client.engine.okhttp.OkHttpEngine.getHighResolutionOutputSizeshNQ4ISI.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RyoJKydJ_ODk5jukjvpWVCxFYeM(okhttp3.ResponseBody responseBody, java.lang.Throwable th) {
        if (responseBody != null) {
            responseBody.close();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s8HnBhlJb3mH_xf6R1ypHQkJgEo(okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ okhttp3.OkHttpClient access$createOkHttpClient(io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine, io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        okhttp3.OkHttpClient preconfigured = okHttpEngine.getConfig().getPreconfigured();
        if (preconfigured == null) {
            preconfigured = io.ktor.client.engine.okhttp.OkHttpEngine.Companion.getHighSpeedVideoFpsRangesFor();
        }
        okhttp3.OkHttpClient.Builder newBuilder = preconfigured.newBuilder();
        newBuilder.dispatcher(new okhttp3.Dispatcher());
        okHttpEngine.getConfig().getConfig$ktor_client_okhttp().invoke(newBuilder);
        java.net.Proxy proxy = okHttpEngine.getConfig().getProxy();
        if (proxy != null) {
            newBuilder.proxy(proxy);
        }
        if (httpTimeoutConfig != null) {
            io.ktor.client.engine.okhttp.OkHttpEngineKt.access$setupTimeoutAttributes(newBuilder, httpTimeoutConfig);
        }
        return newBuilder.build();
    }
}
