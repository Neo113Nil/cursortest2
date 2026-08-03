package io.ktor.client.plugins.cache;

/* compiled from: HttpCacheLegacy.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\n\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u000e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a0\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u0004\u0018\u00010\f*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aA\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#\u001a%\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00032\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/plugins/cache/HttpCache;", com.ironsource.M6.L, "Lio/ktor/http/content/OutgoingContent;", "content", "Lio/ktor/client/HttpClient;", "scope", "", "interceptSendLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/http/content/OutgoingContent;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "interceptReceiveLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/call/HttpClientCall;", "cachedCall", "proceedWithWarning", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheResponse", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "findAndRefresh", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", com.ironsource.X3.a.k, "", "", "varyKeys", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "findResponse", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "context", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCacheLegacyKt {
    public static final java.lang.Object interceptSendLegacy(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object proceedWithMissingCache$ktor_client_core;
        io.ktor.client.plugins.cache.HttpCacheEntry findResponse = findResponse(httpCache, pipelineContext.getContext(), outgoingContent);
        if (findResponse == null) {
            return (io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(pipelineContext.getContext().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl())).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core()) && (proceedWithMissingCache$ktor_client_core = io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(pipelineContext, httpClient, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? proceedWithMissingCache$ktor_client_core : kotlin.Unit.INSTANCE;
        }
        io.ktor.client.call.HttpClientCall call = findResponse.produceResponse$ktor_client_core().getCall();
        io.ktor.client.plugins.cache.ValidateStatus shouldValidate = io.ktor.client.plugins.cache.HttpCacheEntryKt.shouldValidate(findResponse.getExpires(), findResponse.getResponse().getHeaders(), pipelineContext.getContext());
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldNotValidate) {
            java.lang.Object proceedWithCache$ktor_client_core = io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithCache$ktor_client_core(pipelineContext, httpClient, call, continuation);
            return proceedWithCache$ktor_client_core == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWithCache$ktor_client_core : kotlin.Unit.INSTANCE;
        }
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldWarn) {
            java.lang.Object proceedWithWarning = proceedWithWarning(pipelineContext, call, httpClient, continuation);
            return proceedWithWarning == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWithWarning : kotlin.Unit.INSTANCE;
        }
        java.lang.String str = findResponse.getResponseHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
        if (str != null) {
            io.ktor.client.request.UtilsKt.header(pipelineContext.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), str);
        }
        java.lang.String str2 = findResponse.getResponseHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str2 != null) {
            io.ktor.client.request.UtilsKt.header(pipelineContext.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1 httpCacheLegacyKt$interceptReceiveLegacy$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1) {
            httpCacheLegacyKt$interceptReceiveLegacy$1 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1) continuation;
            if ((httpCacheLegacyKt$interceptReceiveLegacy$1.label & Integer.MIN_VALUE) != 0) {
                httpCacheLegacyKt$interceptReceiveLegacy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCacheLegacyKt$interceptReceiveLegacy$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheLegacyKt$interceptReceiveLegacy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
                            return kotlin.Unit.INSTANCE;
                        }
                        io.ktor.client.statement.HttpResponse findAndRefresh = findAndRefresh(httpCache, httpResponse.getCall().getRequest(), httpResponse);
                        if (findAndRefresh == null) {
                            throw new io.ktor.client.plugins.cache.InvalidCacheStateException(httpResponse.getCall().getRequest().getUrl());
                        }
                        if (io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(findAndRefresh).size() != io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse).size()) {
                            io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER().warn("Vary header mismatch on cached response for " + httpResponse.getCall().getRequest().getUrl() + ". Received 304 Not Modified with Vary: " + io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse) + " but cached response has Vary: " + io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(findAndRefresh) + ". According to RFC 7232 §4.1 and RFC 9111 §4.1, the server must include the full Vary header in 304 responses. Proceeding with cached response despite mismatch. Consider reporting this issue to the server maintainers.");
                        }
                        httpClient.getMonitor().raise(io.ktor.client.plugins.cache.HttpCache.INSTANCE.getHttpResponseFromCache(), findAndRefresh);
                        httpCacheLegacyKt$interceptReceiveLegacy$1.label = 3;
                        if (pipelineContext.proceedWith(findAndRefresh, httpCacheLegacyKt$interceptReceiveLegacy$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    httpCacheLegacyKt$interceptReceiveLegacy$1.L$0 = pipelineContext;
                    httpCacheLegacyKt$interceptReceiveLegacy$1.label = 1;
                    obj = cacheResponse(httpCache, httpResponse, httpCacheLegacyKt$interceptReceiveLegacy$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpCacheLegacyKt$interceptReceiveLegacy$1.L$0 = null;
                    httpCacheLegacyKt$interceptReceiveLegacy$1.label = 2;
                    if (pipelineContext.proceedWith((io.ktor.client.statement.HttpResponse) obj, httpCacheLegacyKt$interceptReceiveLegacy$1) == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    pipelineContext = (io.ktor.util.pipeline.PipelineContext) httpCacheLegacyKt$interceptReceiveLegacy$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpCacheLegacyKt$interceptReceiveLegacy$1.L$0 = null;
                    httpCacheLegacyKt$interceptReceiveLegacy$1.label = 2;
                    if (pipelineContext.proceedWith((io.ktor.client.statement.HttpResponse) obj, httpCacheLegacyKt$interceptReceiveLegacy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCacheLegacyKt$interceptReceiveLegacy$1 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1(continuation);
        java.lang.Object obj2 = httpCacheLegacyKt$interceptReceiveLegacy$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheLegacyKt$interceptReceiveLegacy$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object proceedWithWarning(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.request.HttpRequestData build = pipelineContext.getContext().build();
        io.ktor.http.HttpStatusCode status = httpClientCall.getResponse().getStatus();
        io.ktor.util.date.GMTDate requestTime = httpClientCall.getResponse().getRequestTime();
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpClientCall.getResponse().getHeaders());
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getWarning(), "110");
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        io.ktor.client.call.HttpClientCall httpClientCall2 = new io.ktor.client.call.HttpClientCall(httpClient, build, new io.ktor.client.request.HttpResponseData(status, requestTime, headersBuilder.build(), httpClientCall.getResponse().getVersion(), httpClientCall.getResponse().getRawContent(), httpClientCall.getResponse().getCoroutineContext()));
        pipelineContext.finish();
        httpClient.getMonitor().raise(io.ktor.client.plugins.cache.HttpCache.INSTANCE.getHttpResponseFromCache(), httpClientCall2.getResponse());
        java.lang.Object proceedWith = pipelineContext.proceedWith(httpClientCall2, continuation);
        return proceedWith == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWith : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object cacheResponse(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 httpCacheLegacyKt$cacheResponse$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1) {
            httpCacheLegacyKt$cacheResponse$1 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1) continuation;
            if ((httpCacheLegacyKt$cacheResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpCacheLegacyKt$cacheResponse$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCacheLegacyKt$cacheResponse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheLegacyKt$cacheResponse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.request.HttpRequest request = httpResponse.getCall().getRequest();
                    java.util.List<io.ktor.http.HeaderValue> cacheControl = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse);
                    java.util.List<io.ktor.http.HeaderValue> cacheControl2 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(request);
                    io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage = cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
                    if (cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core()) || cacheControl2.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core())) {
                        return httpResponse;
                    }
                    io.ktor.http.Url url = request.getUrl();
                    boolean isSharedClient = httpCache.getIsSharedClient();
                    httpCacheLegacyKt$cacheResponse$1.label = 1;
                    obj = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(privateStorage, url, httpResponse, isSharedClient, httpCacheLegacyKt$cacheResponse$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((io.ktor.client.plugins.cache.HttpCacheEntry) obj).produceResponse$ktor_client_core();
            }
        }
        httpCacheLegacyKt$cacheResponse$1 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1(continuation);
        java.lang.Object obj2 = httpCacheLegacyKt$cacheResponse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheLegacyKt$cacheResponse$1.label;
        if (i != 0) {
        }
        return ((io.ktor.client.plugins.cache.HttpCacheEntry) obj2).produceResponse$ktor_client_core();
    }

    private static final io.ktor.client.statement.HttpResponse findAndRefresh(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse) {
        io.ktor.http.Url url = httpResponse.getCall().getRequest().getUrl();
        io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
        io.ktor.client.plugins.cache.HttpCacheEntry findResponse = findResponse(httpCache, privateStorage, io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse), url, httpRequest);
        if (findResponse == null) {
            return null;
        }
        privateStorage.store(url, new io.ktor.client.plugins.cache.HttpCacheEntry(io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(httpResponse, httpCache.getIsSharedClient(), null, 2, null), findResponse.getVaryKeys(), findResponse.getResponse(), findResponse.getBody()));
        return findResponse.produceResponse$ktor_client_core();
    }

    private static final io.ktor.client.plugins.cache.HttpCacheEntry findResponse(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage, java.util.Map<java.lang.String, java.lang.String> map, io.ktor.http.Url url, io.ktor.client.request.HttpRequest httpRequest) {
        java.lang.Object obj;
        if (!map.isEmpty()) {
            return httpCacheStorage.find(url, map);
        }
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$requestHeaders$1(httpRequest.getHeaders()), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$requestHeaders$2(httpRequest.getHeaders()));
        java.util.Iterator it = kotlin.collections.CollectionsKt.sortedWith(httpCacheStorage.findByUrl(url), new java.util.Comparator() { // from class: io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((io.ktor.client.plugins.cache.HttpCacheEntry) t2).getResponse().getResponseTime(), ((io.ktor.client.plugins.cache.HttpCacheEntry) t).getResponse().getResponseTime());
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.util.Map<java.lang.String, java.lang.String> varyKeys = ((io.ktor.client.plugins.cache.HttpCacheEntry) obj).getVaryKeys();
            if (!varyKeys.isEmpty()) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(mergedHeadersLookup.invoke(entry.getKey()), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (io.ktor.client.plugins.cache.HttpCacheEntry) obj;
    }

    private static final io.ktor.client.plugins.cache.HttpCacheEntry findResponse(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent) {
        io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(httpRequestBuilder.getUrl());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(outgoingContent, new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
        for (io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry : kotlin.collections.SetsKt.plus((java.util.Set) httpCache.getPrivateStorage().findByUrl(Url), (java.lang.Iterable) httpCache.getPublicStorage().findByUrl(Url))) {
            java.util.Map<java.lang.String, java.lang.String> varyKeys = httpCacheEntry.getVaryKeys();
            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                    java.lang.String key = entry.getKey();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(mergedHeadersLookup.invoke(key), entry.getValue())) {
                        break;
                    }
                }
            }
            return httpCacheEntry;
        }
        return null;
    }
}
