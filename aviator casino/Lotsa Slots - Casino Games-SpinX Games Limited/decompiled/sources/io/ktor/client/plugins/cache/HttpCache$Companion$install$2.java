package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 240, 256}, m = "invokeSuspend", n = {"$this$intercept", com.ironsource.Ve.n, "$this$intercept", com.ironsource.Ve.n}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class HttpCache$Companion$install$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache $plugin;
    final /* synthetic */ io.ktor.client.HttpClient $scope;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$Companion$install$2(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$Companion$install$2> continuation) {
        super(3, continuation);
        this.$plugin = httpCache;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCache$Companion$install$2 httpCache$Companion$install$2 = new io.ktor.client.plugins.cache.HttpCache$Companion$install$2(this.$plugin, this.$scope, continuation);
        httpCache$Companion$install$2.L$0 = pipelineContext;
        httpCache$Companion$install$2.L$1 = httpResponse;
        return httpCache$Companion$install$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.client.statement.HttpResponse httpResponse;
        boolean z;
        java.lang.Object cacheResponse;
        io.ktor.util.pipeline.PipelineContext pipelineContext2;
        java.lang.Object findAndRefresh;
        io.ktor.util.pipeline.PipelineContext pipelineContext3;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getCall().getRequest().getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet())) {
                return kotlin.Unit.INSTANCE;
            }
            z = this.$plugin.useOldStorage;
            if (z) {
                this.L$0 = null;
                this.label = 1;
                if (io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptReceiveLegacy(pipelineContext, httpResponse, this.$plugin, this.$scope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Caching response for " + httpResponse.getCall().getRequest().getUrl());
                }
                this.L$0 = pipelineContext;
                this.L$1 = httpResponse;
                this.label = 2;
                cacheResponse = this.$plugin.cacheResponse(httpResponse, this);
                if (cacheResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext2 = pipelineContext;
                obj = cacheResponse;
                cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                if (cachedResponseData == null) {
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
            }
        } else {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i == 2) {
                httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
                pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                if (cachedResponseData == null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (pipelineContext2.proceedWith(io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(cachedResponseData, this.$scope, io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse), httpResponse.getCoroutineContext()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                pipelineContext = pipelineContext2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
                    org.slf4j.Logger logger2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                        logger2.trace("Not modified response for " + httpResponse.getCall().getRequest().getUrl() + ", replying from cache");
                    }
                    this.L$0 = pipelineContext;
                    this.L$1 = httpResponse;
                    this.label = 4;
                    findAndRefresh = this.$plugin.findAndRefresh(httpResponse.getCall().getRequest(), httpResponse, this);
                    if (findAndRefresh == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext3 = pipelineContext;
                    obj = findAndRefresh;
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                    if (httpResponse2 != null) {
                    }
                }
            } else {
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 4) {
                    httpResponse = (io.ktor.client.statement.HttpResponse) this.L$1;
                    pipelineContext3 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                    if (httpResponse2 != null) {
                        throw new io.ktor.client.plugins.cache.InvalidCacheStateException(httpResponse.getCall().getRequest().getUrl());
                    }
                    if (io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2).size() != io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse).size()) {
                        io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER().warn("Vary header mismatch on cached response for " + httpResponse.getCall().getRequest().getUrl() + ". Received 304 Not Modified with Vary: " + io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse) + " but cached response has Vary: " + io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2) + ". According to RFC 7232 §4.1 and RFC 9111 §4.1, the server must include the full Vary header in 304 responses. Falling back to missing cache logic. Consider reporting this issue to the server maintainers.");
                    }
                    this.$scope.getMonitor().raise(io.ktor.client.plugins.cache.HttpCache.INSTANCE.getHttpResponseFromCache(), httpResponse2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                    if (pipelineContext3.proceedWith(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
