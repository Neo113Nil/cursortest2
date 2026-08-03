package io.ktor.client.plugins.cache;

/* compiled from: HttpCache.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", i = {1}, l = {174, 178, 184, 193, 198}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class HttpCache$Companion$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache $plugin;
    final /* synthetic */ io.ktor.client.HttpClient $scope;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$Companion$install$1(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$Companion$install$1> continuation) {
        super(3, continuation);
        this.$plugin = httpCache;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCache$Companion$install$1 httpCache$Companion$install$1 = new io.ktor.client.plugins.cache.HttpCache$Companion$install$1(this.$plugin, this.$scope, continuation);
        httpCache$Companion$install$1.L$0 = pipelineContext;
        httpCache$Companion$install$1.L$1 = obj;
        return httpCache$Companion$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0160  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext;
        boolean canStore;
        boolean z;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        java.lang.Object proceedWithWarning;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            java.lang.Object obj2 = this.L$1;
            if (!(obj2 instanceof io.ktor.http.content.OutgoingContent.NoContent)) {
                return kotlin.Unit.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(pipelineContext.getContext().getMethod(), io.ktor.http.HttpMethod.INSTANCE.getGet())) {
                canStore = io.ktor.client.plugins.cache.HttpCacheKt.canStore(pipelineContext.getContext().getUrl().getProtocol());
                if (canStore) {
                    if (!this.$plugin.getIsSharedClient() || !pipelineContext.getContext().getHeaders().contains(io.ktor.http.HttpHeaders.INSTANCE.getAuthorization())) {
                        z = this.$plugin.useOldStorage;
                        if (!z) {
                            this.L$0 = pipelineContext;
                            this.label = 2;
                            obj = this.$plugin.findResponse(pipelineContext.getContext(), (io.ktor.http.content.OutgoingContent) obj2, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext2 = pipelineContext;
                            cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
                            if (cachedResponseData != null) {
                            }
                        } else {
                            this.L$0 = null;
                            this.label = 1;
                            if (io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptSendLegacy(pipelineContext, this.$plugin, (io.ktor.http.content.OutgoingContent) obj2, this.$scope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
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
        pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext22 = pipelineContext;
        cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
        if (cachedResponseData != null) {
            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                logger.trace("No cached response for " + pipelineContext22.getContext().getUrl() + " found");
            }
            if (io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(pipelineContext22.getContext().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl())).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core())) {
                org.slf4j.Logger logger2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                    logger2.trace("No cache found and \"only-if-cached\" set for " + pipelineContext22.getContext().getUrl());
                }
                this.L$0 = null;
                this.label = 3;
                if (io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(pipelineContext22, this.$scope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        io.ktor.client.plugins.cache.ValidateStatus shouldValidate = io.ktor.client.plugins.cache.HttpCacheEntryKt.shouldValidate(cachedResponseData.getExpires(), cachedResponseData.getHeaders(), pipelineContext22.getContext());
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldNotValidate) {
            io.ktor.client.call.HttpClientCall call = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(cachedResponseData, this.$scope, new io.ktor.client.plugins.cache.RequestForCache(pipelineContext22.getContext().build()), pipelineContext22.getContext().getExecutionContext()).getCall();
            this.L$0 = null;
            this.label = 4;
            if (io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithCache$ktor_client_core(pipelineContext22, this.$scope, call, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldWarn) {
            this.L$0 = null;
            this.label = 5;
            proceedWithWarning = io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithWarning(pipelineContext22, cachedResponseData, this.$scope, pipelineContext22.getContext().getExecutionContext(), this);
            if (proceedWithWarning == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        java.lang.String str = cachedResponseData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
        if (str != null) {
            org.slf4j.Logger logger3 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger3)) {
                logger3.trace("Adding If-None-Match=" + str + " for " + pipelineContext22.getContext().getUrl());
            }
            io.ktor.client.request.UtilsKt.header(pipelineContext22.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), str);
        }
        java.lang.String str2 = cachedResponseData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str2 != null) {
            org.slf4j.Logger logger4 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger4)) {
                logger4.trace("Adding If-Modified-Since=" + str2 + " for " + pipelineContext22.getContext().getUrl());
            }
            io.ktor.client.request.UtilsKt.header(pipelineContext22.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), str2);
        }
        return kotlin.Unit.INSTANCE;
    }
}
