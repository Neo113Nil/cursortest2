package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", i = {1}, l = {174, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 193, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HttpCache$Companion$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.HttpClient getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0158, code lost:
    
        if (io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(r9, r14.getHighSpeedVideoFpsRanges, r14) != r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a9, code lost:
    
        if (io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithCache$ktor_client_core(r9, r14.getHighSpeedVideoFpsRanges, r15, r14) != r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ce, code lost:
    
        if (io.ktor.client.plugins.cache.HttpCache.Companion.access$proceedWithWarning(io.ktor.client.plugins.cache.HttpCache.INSTANCE, r9, r10, r14.getHighSpeedVideoFpsRanges, r9.getContext().getExecutionContext(), r14) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b3, code lost:
    
        if (io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptSendLegacy(r1, r14.Camera2StreamConfigurationMap, (io.ktor.http.content.OutgoingContent) r15, r14.getHighSpeedVideoFpsRanges, r14) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cd, code lost:
    
        if (r15 == r0) goto L64;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            if (!(obj2 instanceof io.ktor.http.content.OutgoingContent.NoContent)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(pipelineContext.getContext().getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet()) || !io.ktor.client.plugins.cache.HttpCacheKt.access$canStore(pipelineContext.getContext().getUrl().getProtocol())) {
                return kotlin.Unit.INSTANCE;
            }
            if (!this.Camera2StreamConfigurationMap.getIsSharedClient() || !pipelineContext.getContext().getHeaders().contains(io.ktor.http.HttpHeaders.INSTANCE.getAuthorization())) {
                z = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                if (z) {
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = pipelineContext;
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    obj = io.ktor.client.plugins.cache.HttpCache.access$findResponse(this.Camera2StreamConfigurationMap, pipelineContext.getContext(), (io.ktor.http.content.OutgoingContent) obj2, this);
                }
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        if (i != 2) {
            if (i == 3) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i == 4) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext2 = pipelineContext;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
        if (cachedResponseData == null) {
            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No cached response for ");
                sb.append(pipelineContext2.getContext().getUrl());
                sb.append(" found");
                logger.trace(sb.toString());
            }
            if (io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(pipelineContext2.getContext().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl())).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core())) {
                org.slf4j.Logger logger2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No cache found and \"only-if-cached\" set for ");
                    sb2.append(pipelineContext2.getContext().getUrl());
                    logger2.trace(sb2.toString());
                }
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
            }
            return kotlin.Unit.INSTANCE;
        }
        io.ktor.client.plugins.cache.ValidateStatus shouldValidate = io.ktor.client.plugins.cache.HttpCacheEntryKt.shouldValidate(cachedResponseData.getExpires(), cachedResponseData.getHeaders(), pipelineContext2.getContext());
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldNotValidate) {
            io.ktor.client.call.HttpClientCall call = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(cachedResponseData, this.getHighSpeedVideoFpsRanges, new io.ktor.client.plugins.cache.RequestForCache(pipelineContext2.getContext().build()), pipelineContext2.getContext().getExecutionContext()).getCall();
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 4;
        } else {
            if (shouldValidate != io.ktor.client.plugins.cache.ValidateStatus.ShouldWarn) {
                java.lang.String str = cachedResponseData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
                if (str != null) {
                    org.slf4j.Logger logger3 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger3)) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Adding If-None-Match=");
                        sb3.append(str);
                        sb3.append(" for ");
                        sb3.append(pipelineContext2.getContext().getUrl());
                        logger3.trace(sb3.toString());
                    }
                    io.ktor.client.request.UtilsKt.header(pipelineContext2.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), str);
                }
                java.lang.String str2 = cachedResponseData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
                if (str2 != null) {
                    org.slf4j.Logger logger4 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                    if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger4)) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Adding If-Modified-Since=");
                        sb4.append(str2);
                        sb4.append(" for ");
                        sb4.append(pipelineContext2.getContext().getUrl());
                        logger4.trace(sb4.toString());
                    }
                    io.ktor.client.request.UtilsKt.header(pipelineContext2.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), str2);
                }
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 5;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCache$Companion$install$1 httpCache$Companion$install$1 = new io.ktor.client.plugins.cache.HttpCache$Companion$install$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        httpCache$Companion$install$1.getHighSpeedVideoFpsRangesFor = pipelineContext;
        httpCache$Companion$install$1.getHighSpeedVideoSizes = obj;
        return httpCache$Companion$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$Companion$install$1(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$Companion$install$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = httpCache;
        this.getHighSpeedVideoFpsRanges = httpClient;
    }
}
