package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\n\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u000e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a0\u0010\u0013\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/plugins/cache/HttpCache;", "plugin", "Lio/ktor/http/content/OutgoingContent;", "content", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "interceptSendLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/http/content/OutgoingContent;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", "response", "interceptReceiveLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/call/HttpClientCall;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/HttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpCacheLegacyKt {
    public static final java.lang.Object interceptSendLegacy(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry;
        java.lang.Object proceedWithMissingCache$ktor_client_core;
        io.ktor.client.request.HttpRequestBuilder context = pipelineContext.getContext();
        io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(context.getUrl());
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(outgoingContent, new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$lookup$1(context.getHeaders()), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$lookup$2(context.getHeaders()));
        java.util.Iterator it = kotlin.collections.SetsKt.plus((java.util.Set) httpCache.getPrivateStorage().findByUrl(Url), (java.lang.Iterable) httpCache.getPublicStorage().findByUrl(Url)).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                httpCacheEntry = null;
                break;
            }
            httpCacheEntry = (io.ktor.client.plugins.cache.HttpCacheEntry) it.next();
            java.util.Map<java.lang.String, java.lang.String> varyKeys = httpCacheEntry.getVaryKeys();
            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(mergedHeadersLookup.invoke(entry.getKey()), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        if (httpCacheEntry == null) {
            return (io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(pipelineContext.getContext().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl())).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core()) && (proceedWithMissingCache$ktor_client_core = io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(pipelineContext, httpClient, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? proceedWithMissingCache$ktor_client_core : kotlin.Unit.INSTANCE;
        }
        io.ktor.client.call.HttpClientCall call = httpCacheEntry.produceResponse$ktor_client_core().getCall();
        io.ktor.client.plugins.cache.ValidateStatus shouldValidate = io.ktor.client.plugins.cache.HttpCacheEntryKt.shouldValidate(httpCacheEntry.getExpires(), httpCacheEntry.getResponse().getGetHighSpeedVideoSizesFor(), pipelineContext.getContext());
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldNotValidate) {
            java.lang.Object proceedWithCache$ktor_client_core = io.ktor.client.plugins.cache.HttpCache.INSTANCE.proceedWithCache$ktor_client_core(pipelineContext, httpClient, call, continuation);
            return proceedWithCache$ktor_client_core == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? proceedWithCache$ktor_client_core : kotlin.Unit.INSTANCE;
        }
        if (shouldValidate == io.ktor.client.plugins.cache.ValidateStatus.ShouldWarn) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(pipelineContext, call, httpClient, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        java.lang.String str = httpCacheEntry.getResponseHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
        if (str != null) {
            io.ktor.client.request.UtilsKt.header(pipelineContext.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), str);
        }
        java.lang.String str2 = httpCacheEntry.getResponseHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str2 != null) {
            io.ktor.client.request.UtilsKt.header(pipelineContext.getContext(), io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r0.proceedWith((io.ktor.client.statement.HttpResponse) r2, r3) != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r2 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ca, code lost:
    
        if (r0.proceedWith(r9, r3) == r4) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1 httpCacheLegacyKt$interceptReceiveLegacy$1;
        int i;
        io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry;
        io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry2;
        io.ktor.util.pipeline.PipelineContext pipelineContext2 = pipelineContext;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1) {
            httpCacheLegacyKt$interceptReceiveLegacy$1 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1) continuation;
            if ((httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = httpCacheLegacyKt$interceptReceiveLegacy$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI;
                io.ktor.client.statement.HttpResponse httpResponse2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (io.ktor.http.HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                        httpCacheLegacyKt$interceptReceiveLegacy$1.getHighSpeedVideoSizes = pipelineContext2;
                        httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = getHighResolutionOutputSizeshNQ4ISI(httpCache, httpResponse, httpCacheLegacyKt$interceptReceiveLegacy$1);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(httpResponse.getStatus(), io.ktor.http.HttpStatusCode.INSTANCE.getNotModified())) {
                        io.ktor.client.request.HttpRequest request = httpResponse.getCall().getRequest();
                        io.ktor.http.Url getHighSpeedVideoFpsRanges = httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges();
                        io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse).contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
                        java.util.Map<java.lang.String, java.lang.String> varyKeys = io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse);
                        if (!varyKeys.isEmpty()) {
                            httpCacheEntry2 = privateStorage.find(getHighSpeedVideoFpsRanges, varyKeys);
                        } else {
                            kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> mergedHeadersLookup = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(request.getCamera2StreamConfigurationMap(), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$requestHeaders$1(request.getGetHighSpeedVideoSizesFor()), new io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$requestHeaders$2(request.getGetHighSpeedVideoSizesFor()));
                            java.util.Iterator it = kotlin.collections.CollectionsKt.sortedWith(privateStorage.findByUrl(getHighSpeedVideoFpsRanges), new java.util.Comparator() { // from class: io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$$inlined$sortedByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return kotlin.comparisons.ComparisonsKt.compareValues(((io.ktor.client.plugins.cache.HttpCacheEntry) t2).getResponse().getResponseTime(), ((io.ktor.client.plugins.cache.HttpCacheEntry) t).getResponse().getResponseTime());
                                }
                            }).iterator();
                            loop0: while (true) {
                                if (!it.hasNext()) {
                                    httpCacheEntry = 0;
                                    break;
                                }
                                httpCacheEntry = it.next();
                                java.util.Map<java.lang.String, java.lang.String> varyKeys2 = ((io.ktor.client.plugins.cache.HttpCacheEntry) httpCacheEntry).getVaryKeys();
                                if (!varyKeys2.isEmpty()) {
                                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys2.entrySet()) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(mergedHeadersLookup.invoke(entry.getKey()), entry.getValue())) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                            httpCacheEntry2 = httpCacheEntry;
                        }
                        if (httpCacheEntry2 != null) {
                            privateStorage.store(getHighSpeedVideoFpsRanges, new io.ktor.client.plugins.cache.HttpCacheEntry(io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(httpResponse, httpCache.getIsSharedClient(), null, 2, null), httpCacheEntry2.getVaryKeys(), httpCacheEntry2.getResponse(), httpCacheEntry2.getBody()));
                            httpResponse2 = httpCacheEntry2.produceResponse$ktor_client_core();
                        }
                        if (httpResponse2 == null) {
                            throw new io.ktor.client.plugins.cache.InvalidCacheStateException(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                        }
                        if (io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2).size() != io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse).size()) {
                            org.slf4j.Logger logger = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vary header mismatch on cached response for ");
                            sb.append(httpResponse.getCall().getRequest().getGetHighSpeedVideoFpsRanges());
                            sb.append(". Received 304 Not Modified with Vary: ");
                            sb.append(io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse));
                            sb.append(" but cached response has Vary: ");
                            sb.append(io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse2));
                            sb.append(". According to RFC 7232 §4.1 and RFC 9111 §4.1, the server must include the full Vary header in 304 responses. Proceeding with cached response despite mismatch. Consider reporting this issue to the server maintainers.");
                            logger.warn(sb.toString());
                        }
                        httpClient.getMonitor().raise(io.ktor.client.plugins.cache.HttpCache.INSTANCE.getHttpResponseFromCache(), httpResponse2);
                        httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) httpCacheLegacyKt$interceptReceiveLegacy$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                httpCacheLegacyKt$interceptReceiveLegacy$1.getHighSpeedVideoSizes = null;
                httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        httpCacheLegacyKt$interceptReceiveLegacy$1 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1(continuation);
        java.lang.Object obj2 = httpCacheLegacyKt$interceptReceiveLegacy$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheLegacyKt$interceptReceiveLegacy$1.getHighResolutionOutputSizeshNQ4ISI;
        io.ktor.client.statement.HttpResponse httpResponse22 = null;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.request.HttpRequestData build = pipelineContext.getContext().build();
        io.ktor.http.HttpStatusCode status = httpClientCall.getResponse().getStatus();
        io.ktor.util.date.GMTDate requestTime = httpClientCall.getResponse().getRequestTime();
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpClientCall.getResponse().getGetHighSpeedVideoSizesFor());
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
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(io.ktor.client.plugins.cache.HttpCache httpCache, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 httpCacheLegacyKt$cacheResponse$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1) {
            httpCacheLegacyKt$cacheResponse$1 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1) continuation;
            if ((httpCacheLegacyKt$cacheResponse$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpCacheLegacyKt$cacheResponse$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = httpCacheLegacyKt$cacheResponse$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheLegacyKt$cacheResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.client.request.HttpRequest request = httpResponse.getCall().getRequest();
                    java.util.List<io.ktor.http.HeaderValue> cacheControl = io.ktor.http.HttpMessagePropertiesKt.cacheControl(httpResponse);
                    java.util.List<io.ktor.http.HeaderValue> cacheControl2 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(request);
                    io.ktor.client.plugins.cache.storage.HttpCacheStorage privateStorage = cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
                    if (cacheControl.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core()) || cacheControl2.contains(io.ktor.client.plugins.cache.CacheControl.INSTANCE.getNO_STORE$ktor_client_core())) {
                        return httpResponse;
                    }
                    io.ktor.http.Url getHighSpeedVideoFpsRanges = request.getGetHighSpeedVideoFpsRanges();
                    boolean isSharedClient = httpCache.getIsSharedClient();
                    httpCacheLegacyKt$cacheResponse$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(privateStorage, getHighSpeedVideoFpsRanges, httpResponse, isSharedClient, httpCacheLegacyKt$cacheResponse$1);
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
        java.lang.Object obj2 = httpCacheLegacyKt$cacheResponse$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheLegacyKt$cacheResponse$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return ((io.ktor.client.plugins.cache.HttpCacheEntry) obj2).produceResponse$ktor_client_core();
    }
}
