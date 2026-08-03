package io.ktor.client.plugins.cache.storage;

/* compiled from: HttpCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0087@¢\u0006\u0004\b\b\u0010\r\u001a:\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\u0011\u001a+\u0010\u0018\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/statement/HttpResponse;", "value", "", "isShared", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", com.ironsource.X3.i.U, "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/http/Url;Lio/ktor/client/statement/HttpResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", com.ironsource.Ve.n, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "Lio/ktor/client/request/HttpRequest;", "request", "Lkotlin/coroutines/CoroutineContext;", "responseContext", "createResponse", "(Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/client/statement/HttpResponse;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCacheStorageKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.HttpCacheStorage httpCacheStorage, io.ktor.http.Url url, io.ktor.client.statement.HttpResponse httpResponse, boolean z, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheEntry> continuation) {
        io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 httpCacheStorageKt$store$1;
        int i;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1) {
            httpCacheStorageKt$store$1 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1) continuation;
            if ((httpCacheStorageKt$store$1.label & Integer.MIN_VALUE) != 0) {
                httpCacheStorageKt$store$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCacheStorageKt$store$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheStorageKt$store$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpCacheStorageKt$store$1.L$0 = httpCacheStorage;
                    httpCacheStorageKt$store$1.L$1 = url;
                    httpCacheStorageKt$store$1.label = 1;
                    obj = io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(z, httpResponse, httpCacheStorageKt$store$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (io.ktor.http.Url) httpCacheStorageKt$store$1.L$1;
                    httpCacheStorage = (io.ktor.client.plugins.cache.storage.HttpCacheStorage) httpCacheStorageKt$store$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry = (io.ktor.client.plugins.cache.HttpCacheEntry) obj;
                httpCacheStorage.store(url, httpCacheEntry);
                return httpCacheEntry;
            }
        }
        httpCacheStorageKt$store$1 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1(continuation);
        java.lang.Object obj2 = httpCacheStorageKt$store$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheStorageKt$store$1.label;
        if (i != 0) {
        }
        io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry2 = (io.ktor.client.plugins.cache.HttpCacheEntry) obj2;
        httpCacheStorage.store(url, httpCacheEntry2);
        return httpCacheEntry2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use method with `response.varyKeys()` and `isShared` arguments", replaceWith = @kotlin.ReplaceWith(expression = "store(response, response.varyKeys(), isShared)", imports = {}))
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        return store$default(cacheStorage, httpResponse, io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(httpResponse), false, continuation, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, io.ktor.client.statement.HttpResponse httpResponse, java.util.Map<java.lang.String, java.lang.String> map, boolean z, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3 httpCacheStorageKt$store$3;
        int i;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2;
        io.ktor.client.statement.HttpResponse httpResponse2;
        io.ktor.http.Url url;
        java.util.Map<java.lang.String, java.lang.String> map2;
        boolean z2;
        if (continuation instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3) {
            httpCacheStorageKt$store$3 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3) continuation;
            if ((httpCacheStorageKt$store$3.label & Integer.MIN_VALUE) != 0) {
                httpCacheStorageKt$store$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCacheStorageKt$store$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCacheStorageKt$store$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.http.Url url2 = httpResponse.getCall().getRequest().getUrl();
                    io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                    cacheStorage2 = cacheStorage;
                    httpCacheStorageKt$store$3.L$0 = cacheStorage2;
                    httpResponse2 = httpResponse;
                    httpCacheStorageKt$store$3.L$1 = httpResponse2;
                    httpCacheStorageKt$store$3.L$2 = map;
                    httpCacheStorageKt$store$3.L$3 = url2;
                    httpCacheStorageKt$store$3.Z$0 = z;
                    httpCacheStorageKt$store$3.label = 1;
                    java.lang.Object readRemaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(rawContent, httpCacheStorageKt$store$3);
                    if (readRemaining == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    url = url2;
                    obj = readRemaining;
                    map2 = map;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) httpCacheStorageKt$store$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return cachedResponseData;
                    }
                    z2 = httpCacheStorageKt$store$3.Z$0;
                    url = (io.ktor.http.Url) httpCacheStorageKt$store$3.L$3;
                    java.util.Map<java.lang.String, java.lang.String> map3 = (java.util.Map) httpCacheStorageKt$store$3.L$2;
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) httpCacheStorageKt$store$3.L$1;
                    io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage3 = (io.ktor.client.plugins.cache.storage.CacheStorage) httpCacheStorageKt$store$3.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    map2 = map3;
                    cacheStorage2 = cacheStorage3;
                }
                io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData2 = new io.ktor.client.plugins.cache.storage.CachedResponseData(httpResponse2.getCall().getRequest().getUrl(), httpResponse2.getStatus(), httpResponse2.getRequestTime(), httpResponse2.getResponseTime(), httpResponse2.getVersion(), io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(httpResponse2, z2, null, 2, null), httpResponse2.getHeaders(), map2, io.ktor.utils.io.core.StringsKt.readBytes((kotlinx.io.Source) obj));
                httpCacheStorageKt$store$3.L$0 = cachedResponseData2;
                httpCacheStorageKt$store$3.L$1 = null;
                httpCacheStorageKt$store$3.L$2 = null;
                httpCacheStorageKt$store$3.L$3 = null;
                httpCacheStorageKt$store$3.label = 2;
                return cacheStorage2.store(url, cachedResponseData2, httpCacheStorageKt$store$3) != coroutine_suspended ? coroutine_suspended : cachedResponseData2;
            }
        }
        httpCacheStorageKt$store$3 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3(continuation);
        java.lang.Object obj2 = httpCacheStorageKt$store$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCacheStorageKt$store$3.label;
        if (i != 0) {
        }
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData22 = new io.ktor.client.plugins.cache.storage.CachedResponseData(httpResponse2.getCall().getRequest().getUrl(), httpResponse2.getStatus(), httpResponse2.getRequestTime(), httpResponse2.getResponseTime(), httpResponse2.getVersion(), io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(httpResponse2, z2, null, 2, null), httpResponse2.getHeaders(), map2, io.ktor.utils.io.core.StringsKt.readBytes((kotlinx.io.Source) obj2));
        httpCacheStorageKt$store$3.L$0 = cachedResponseData22;
        httpCacheStorageKt$store$3.L$1 = null;
        httpCacheStorageKt$store$3.L$2 = null;
        httpCacheStorageKt$store$3.L$3 = null;
        httpCacheStorageKt$store$3.label = 2;
        if (cacheStorage2.store(url, cachedResponseData22, httpCacheStorageKt$store$3) != coroutine_suspended2) {
        }
    }

    public static /* synthetic */ java.lang.Object store$default(io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage, io.ktor.client.statement.HttpResponse httpResponse, java.util.Map map, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return store(cacheStorage, httpResponse, (java.util.Map<java.lang.String, java.lang.String>) map, z, (kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData>) continuation);
    }

    public static final io.ktor.client.statement.HttpResponse createResponse(final io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, io.ktor.client.HttpClient client, io.ktor.client.request.HttpRequest request, final kotlin.coroutines.CoroutineContext responseContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponseData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseContext, "responseContext");
        return new io.ktor.client.call.SavedHttpCall(client, request, new io.ktor.client.statement.HttpResponse(cachedResponseData, responseContext) { // from class: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$createResponse$response$1
            private final kotlin.coroutines.CoroutineContext coroutineContext;
            private final io.ktor.http.Headers headers;
            private final io.ktor.util.date.GMTDate requestTime;
            private final io.ktor.util.date.GMTDate responseTime;
            private final io.ktor.http.HttpStatusCode status;
            private final io.ktor.http.HttpProtocolVersion version;

            public static /* synthetic */ void getRawContent$annotations() {
            }

            {
                this.status = cachedResponseData.getStatusCode();
                this.version = cachedResponseData.getVersion();
                this.requestTime = cachedResponseData.getRequestTime();
                this.responseTime = cachedResponseData.getResponseTime();
                this.headers = cachedResponseData.getHeaders();
                this.coroutineContext = responseContext;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.client.call.HttpClientCall getCall() {
                throw new java.lang.IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.http.HttpStatusCode getStatus() {
                return this.status;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.http.HttpProtocolVersion getVersion() {
                return this.version;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.util.date.GMTDate getRequestTime() {
                return this.requestTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.util.date.GMTDate getResponseTime() {
                return this.responseTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public io.ktor.utils.io.ByteReadChannel getRawContent() {
                throw new java.lang.IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.http.HttpMessage
            public io.ktor.http.Headers getHeaders() {
                return this.headers;
            }

            @Override // kotlinx.coroutines.CoroutineScope
            public kotlin.coroutines.CoroutineContext getCoroutineContext() {
                return this.coroutineContext;
            }
        }, cachedResponseData.getBody()).getResponse();
    }
}
