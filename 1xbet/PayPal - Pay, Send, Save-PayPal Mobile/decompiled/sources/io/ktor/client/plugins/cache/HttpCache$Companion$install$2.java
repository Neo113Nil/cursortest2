package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 225, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 256}, m = "invokeSuspend", n = {"$this$intercept", "response", "$this$intercept", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class HttpCache$Companion$install$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.HttpClient getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01bc, code lost:
    
        if (r3.proceedWith(r12, r11) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        if (r5.proceedWith(io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(r12, r11.getHighResolutionOutputSizeshNQ4ISI, io.ktor.client.statement.HttpResponseKt.getRequest(r1), r1.getCoroutineContext()), r11) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptReceiveLegacy(r12, r1, r11.getHighSpeedVideoFpsRangesFor, r11.getHighResolutionOutputSizeshNQ4ISI, r11) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.client.statement.HttpResponse httpResponse;
        boolean z;
        io.ktor.util.pipeline.PipelineContext pipelineContext2;
        io.ktor.util.pipeline.PipelineContext pipelineContext3;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
            httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizes;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getCall().getRequest().getGetHighSpeedVideoSizes(), io.ktor.http.HttpMethod.INSTANCE.getGet())) {
                return kotlin.Unit.INSTANCE;
            }
            z = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            if (z) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                    org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Caching response for ");
                        sb.append(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                        logger.trace(sb.toString());
                    }
                    this.Camera2StreamConfigurationMap = pipelineContext;
                    this.getHighSpeedVideoSizes = httpResponse;
                    this.getHighSpeedVideoFpsRanges = 2;
                    java.lang.Object access$cacheResponse = io.ktor.client.plugins.cache.HttpCache.access$cacheResponse(this.getHighSpeedVideoFpsRangesFor, httpResponse, this);
                    if (access$cacheResponse != coroutine_suspended) {
                        pipelineContext2 = pipelineContext;
                        obj = access$cacheResponse;
                        cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                        if (cachedResponseData == null) {
                        }
                    }
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        if (i == 2) {
            httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizes;
            pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
            if (cachedResponseData == null) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = 3;
            } else {
                pipelineContext = pipelineContext2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
                    org.slf4j.Logger logger2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Not modified response for ");
                        sb2.append(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                        sb2.append(", replying from cache");
                        logger2.trace(sb2.toString());
                    }
                    this.Camera2StreamConfigurationMap = pipelineContext;
                    this.getHighSpeedVideoSizes = httpResponse;
                    this.getHighSpeedVideoFpsRanges = 4;
                    java.lang.Object access$findAndRefresh = io.ktor.client.plugins.cache.HttpCache.access$findAndRefresh(this.getHighSpeedVideoFpsRangesFor, httpResponse.getCall().getRequest(), httpResponse, this);
                    if (access$findAndRefresh != coroutine_suspended) {
                        pipelineContext3 = pipelineContext;
                        obj = access$findAndRefresh;
                        httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                        if (httpResponse2 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
        } else {
            if (i == 3) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i == 4) {
                httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizes;
                pipelineContext3 = (io.ktor.util.pipeline.PipelineContext) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
                if (httpResponse2 != null) {
                    throw new io.ktor.client.plugins.cache.InvalidCacheStateException(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                }
                if (io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2).size() != io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse).size()) {
                    org.slf4j.Logger logger3 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Vary header mismatch on cached response for ");
                    sb3.append(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                    sb3.append(". Received 304 Not Modified with Vary: ");
                    sb3.append(io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse));
                    sb3.append(" but cached response has Vary: ");
                    sb3.append(io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2));
                    sb3.append(". According to RFC 7232 §4.1 and RFC 9111 §4.1, the server must include the full Vary header in 304 responses. Falling back to missing cache logic. Consider reporting this issue to the server maintainers.");
                    logger3.warn(sb3.toString());
                }
                this.getHighResolutionOutputSizeshNQ4ISI.getMonitor().raise(io.ktor.client.plugins.cache.HttpCache.INSTANCE.getHttpResponseFromCache(), httpResponse2);
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = 5;
            } else {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCache$Companion$install$2 httpCache$Companion$install$2 = new io.ktor.client.plugins.cache.HttpCache$Companion$install$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        httpCache$Companion$install$2.Camera2StreamConfigurationMap = pipelineContext;
        httpCache$Companion$install$2.getHighSpeedVideoSizes = httpResponse;
        return httpCache$Companion$install$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$Companion$install$2(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$Companion$install$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = httpCache;
        this.getHighResolutionOutputSizeshNQ4ISI = httpClient;
    }
}
