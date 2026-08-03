package coil.fetch;

/* compiled from: HttpUriFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u0001:\u000212B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0002\b\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010$\u001a\u0004\u0018\u00010\u001b*\u00020\u0013H\u0002J\f\u0010%\u001a\u00020&*\u00020\u0013H\u0002J\f\u0010%\u001a\u00020&*\u00020'H\u0002J\f\u0010(\u001a\u00020)*\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "url", "", "options", "Lcoil/request/Options;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "<init>", "(Ljava/lang/String;Lcoil/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFromDiskCache", "Lcoil/disk/DiskCache$Snapshot;", "writeToDiskCache", "snapshot", "request", "Lokhttp3/Request;", com.ironsource.Ve.n, "Lokhttp3/Response;", "cacheResponse", "Lcoil/network/CacheResponse;", "newRequest", "executeNetworkRequest", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lokhttp3/MediaType;", "getMimeType$coil_base_release", "isCacheable", "toCacheResponse", "toImageSource", "Lcoil/decode/ImageSource;", "Lokhttp3/ResponseBody;", "toDataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "getDiskCacheKey", "()Ljava/lang/String;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Factory", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpUriFetcher implements coil.fetch.Fetcher {
    private static final java.lang.String MIME_TYPE_TEXT_PLAIN = "text/plain";
    private final kotlin.Lazy<okhttp3.Call.Factory> callFactory;
    private final kotlin.Lazy<coil.disk.DiskCache> diskCache;
    private final coil.request.Options options;
    private final boolean respectCacheHeaders;
    private final java.lang.String url;
    private static final okhttp3.CacheControl CACHE_CONTROL_FORCE_NETWORK_NO_CACHE = new okhttp3.CacheControl.Builder().noCache().noStore().build();
    private static final okhttp3.CacheControl CACHE_CONTROL_NO_NETWORK_NO_CACHE = new okhttp3.CacheControl.Builder().noCache().onlyIfCached().build();

    /* JADX WARN: Multi-variable type inference failed */
    public HttpUriFetcher(java.lang.String str, coil.request.Options options, kotlin.Lazy<? extends okhttp3.Call.Factory> lazy, kotlin.Lazy<? extends coil.disk.DiskCache> lazy2, boolean z) {
        this.url = str;
        this.options = options;
        this.callFactory = lazy;
        this.diskCache = lazy2;
        this.respectCacheHeaders = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0128 A[Catch: Exception -> 0x01a2, TryCatch #4 {Exception -> 0x01a2, blocks: (B:15:0x0186, B:30:0x011a, B:32:0x0128, B:34:0x0136, B:35:0x013a, B:37:0x0144, B:39:0x0150, B:41:0x0168), top: B:29:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144 A[Catch: Exception -> 0x01a2, TryCatch #4 {Exception -> 0x01a2, blocks: (B:15:0x0186, B:30:0x011a, B:32:0x0128, B:34:0x0136, B:35:0x013a, B:37:0x0144, B:39:0x0150, B:41:0x0168), top: B:29:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // coil.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        coil.fetch.HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        ?? r2;
        coil.disk.DiskCache.Snapshot snapshot;
        coil.network.CacheStrategy compute;
        coil.fetch.HttpUriFetcher httpUriFetcher;
        coil.disk.DiskCache.Snapshot snapshot2;
        coil.network.CacheStrategy cacheStrategy;
        okhttp3.Response response;
        okhttp3.Response response2;
        java.lang.Exception e;
        coil.disk.DiskCache.Snapshot writeToDiskCache;
        coil.fetch.HttpUriFetcher httpUriFetcher2;
        try {
            try {
                if (continuation instanceof coil.fetch.HttpUriFetcher$fetch$1) {
                    httpUriFetcher$fetch$1 = (coil.fetch.HttpUriFetcher$fetch$1) continuation;
                    if ((httpUriFetcher$fetch$1.label & Integer.MIN_VALUE) != 0) {
                        httpUriFetcher$fetch$1.label -= Integer.MIN_VALUE;
                        java.lang.Object obj = httpUriFetcher$fetch$1.result;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r2 = httpUriFetcher$fetch$1.label;
                        if (r2 != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            coil.disk.DiskCache.Snapshot readFromDiskCache = readFromDiskCache();
                            try {
                                if (readFromDiskCache != null) {
                                    java.lang.Long size = getFileSystem().metadata(readFromDiskCache.getMetadata()).getSize();
                                    if (size != null && size.longValue() == 0) {
                                        return new coil.fetch.SourceResult(toImageSource(readFromDiskCache), getMimeType$coil_base_release(this.url, null), coil.decode.DataSource.DISK);
                                    }
                                    if (this.respectCacheHeaders) {
                                        compute = new coil.network.CacheStrategy.Factory(newRequest(), toCacheResponse(readFromDiskCache)).compute();
                                        if (compute.getNetworkRequest() == null && compute.getCacheResponse() != null) {
                                            return new coil.fetch.SourceResult(toImageSource(readFromDiskCache), getMimeType$coil_base_release(this.url, compute.getCacheResponse().getContentType()), coil.decode.DataSource.DISK);
                                        }
                                    } else {
                                        coil.decode.ImageSource imageSource = toImageSource(readFromDiskCache);
                                        java.lang.String str = this.url;
                                        coil.network.CacheResponse cacheResponse = toCacheResponse(readFromDiskCache);
                                        return new coil.fetch.SourceResult(imageSource, getMimeType$coil_base_release(str, cacheResponse != null ? cacheResponse.getContentType() : null), coil.decode.DataSource.DISK);
                                    }
                                } else {
                                    compute = new coil.network.CacheStrategy.Factory(newRequest(), null).compute();
                                }
                                okhttp3.Request networkRequest = compute.getNetworkRequest();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(networkRequest);
                                httpUriFetcher$fetch$1.L$0 = this;
                                httpUriFetcher$fetch$1.L$1 = readFromDiskCache;
                                httpUriFetcher$fetch$1.L$2 = compute;
                                httpUriFetcher$fetch$1.label = 1;
                                java.lang.Object executeNetworkRequest = executeNetworkRequest(networkRequest, httpUriFetcher$fetch$1);
                                if (executeNetworkRequest == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                httpUriFetcher = this;
                                coil.network.CacheStrategy cacheStrategy2 = compute;
                                snapshot2 = readFromDiskCache;
                                obj = executeNetworkRequest;
                                cacheStrategy = cacheStrategy2;
                            } catch (java.lang.Exception e2) {
                                snapshot = readFromDiskCache;
                                e = e2;
                                if (snapshot != null) {
                                    coil.util.Utils.closeQuietly(snapshot);
                                }
                                throw e;
                            }
                        } else {
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                response2 = (okhttp3.Response) httpUriFetcher$fetch$1.L$2;
                                httpUriFetcher2 = (coil.fetch.HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    okhttp3.Response response3 = (okhttp3.Response) obj;
                                    okhttp3.ResponseBody requireBody = coil.util.Utils.requireBody(response3);
                                    return new coil.fetch.SourceResult(httpUriFetcher2.toImageSource(requireBody), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, requireBody.get$contentType()), httpUriFetcher2.toDataSource(response3));
                                } catch (java.lang.Exception e3) {
                                    e = e3;
                                    coil.util.Utils.closeQuietly(response2);
                                    throw e;
                                }
                            }
                            coil.network.CacheStrategy cacheStrategy3 = (coil.network.CacheStrategy) httpUriFetcher$fetch$1.L$2;
                            snapshot = (coil.disk.DiskCache.Snapshot) httpUriFetcher$fetch$1.L$1;
                            httpUriFetcher = (coil.fetch.HttpUriFetcher) httpUriFetcher$fetch$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                cacheStrategy = cacheStrategy3;
                                snapshot2 = snapshot;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                if (snapshot != null) {
                                }
                                throw e;
                            }
                        }
                        response = (okhttp3.Response) obj;
                        okhttp3.ResponseBody requireBody2 = coil.util.Utils.requireBody(response);
                        writeToDiskCache = httpUriFetcher.writeToDiskCache(snapshot2, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                        if (writeToDiskCache == null) {
                            coil.decode.ImageSource imageSource2 = httpUriFetcher.toImageSource(writeToDiskCache);
                            java.lang.String str2 = httpUriFetcher.url;
                            coil.network.CacheResponse cacheResponse2 = httpUriFetcher.toCacheResponse(writeToDiskCache);
                            return new coil.fetch.SourceResult(imageSource2, httpUriFetcher.getMimeType$coil_base_release(str2, cacheResponse2 != null ? cacheResponse2.getContentType() : null), coil.decode.DataSource.NETWORK);
                        }
                        if (requireBody2.getSource().request(1L)) {
                            return new coil.fetch.SourceResult(httpUriFetcher.toImageSource(requireBody2), httpUriFetcher.getMimeType$coil_base_release(httpUriFetcher.url, requireBody2.get$contentType()), httpUriFetcher.toDataSource(response));
                        }
                        coil.util.Utils.closeQuietly(response);
                        okhttp3.Request newRequest = httpUriFetcher.newRequest();
                        httpUriFetcher$fetch$1.L$0 = httpUriFetcher;
                        httpUriFetcher$fetch$1.L$1 = writeToDiskCache;
                        httpUriFetcher$fetch$1.L$2 = response;
                        httpUriFetcher$fetch$1.label = 2;
                        java.lang.Object executeNetworkRequest2 = httpUriFetcher.executeNetworkRequest(newRequest, httpUriFetcher$fetch$1);
                        if (executeNetworkRequest2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        response2 = response;
                        obj = executeNetworkRequest2;
                        httpUriFetcher2 = httpUriFetcher;
                        okhttp3.Response response32 = (okhttp3.Response) obj;
                        okhttp3.ResponseBody requireBody3 = coil.util.Utils.requireBody(response32);
                        return new coil.fetch.SourceResult(httpUriFetcher2.toImageSource(requireBody3), httpUriFetcher2.getMimeType$coil_base_release(httpUriFetcher2.url, requireBody3.get$contentType()), httpUriFetcher2.toDataSource(response32));
                    }
                }
                writeToDiskCache = httpUriFetcher.writeToDiskCache(snapshot2, cacheStrategy.getNetworkRequest(), response, cacheStrategy.getCacheResponse());
                if (writeToDiskCache == null) {
                }
            } catch (java.lang.Exception e5) {
                response2 = response;
                e = e5;
                coil.util.Utils.closeQuietly(response2);
                throw e;
            }
            if (r2 != 0) {
            }
            response = (okhttp3.Response) obj;
            okhttp3.ResponseBody requireBody22 = coil.util.Utils.requireBody(response);
        } catch (java.lang.Exception e6) {
            e = e6;
            snapshot = r2;
        }
        httpUriFetcher$fetch$1 = new coil.fetch.HttpUriFetcher$fetch$1(this, continuation);
        java.lang.Object obj2 = httpUriFetcher$fetch$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = httpUriFetcher$fetch$1.label;
    }

    private final coil.disk.DiskCache.Snapshot readFromDiskCache() {
        coil.disk.DiskCache value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.openSnapshot(getDiskCacheKey());
    }

    private final coil.disk.DiskCache.Snapshot writeToDiskCache(coil.disk.DiskCache.Snapshot snapshot, okhttp3.Request request, okhttp3.Response response, coil.network.CacheResponse cacheResponse) {
        coil.disk.DiskCache.Editor openEditor;
        java.lang.Throwable th;
        java.lang.Throwable th2 = null;
        if (!isCacheable(request, response)) {
            if (snapshot != null) {
                coil.util.Utils.closeQuietly(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            openEditor = snapshot.closeAndOpenEditor();
        } else {
            coil.disk.DiskCache value = this.diskCache.getValue();
            openEditor = value != null ? value.openEditor(getDiskCacheKey()) : null;
        }
        try {
            if (openEditor == null) {
                return null;
            }
            try {
                if (response.code() == 304 && cacheResponse != null) {
                    okhttp3.Response build = response.newBuilder().headers(coil.network.CacheStrategy.INSTANCE.combineHeaders(cacheResponse.getResponseHeaders(), response.headers())).build();
                    okio.BufferedSink buffer = okio.Okio.buffer(getFileSystem().sink(openEditor.getMetadata(), false));
                    try {
                        new coil.network.CacheResponse(build).writeTo(buffer);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (java.lang.Throwable th3) {
                                th2 = th3;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th2 = th4;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (java.lang.Throwable th5) {
                                kotlin.ExceptionsKt.addSuppressed(th2, th5);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                } else {
                    okio.BufferedSink buffer2 = okio.Okio.buffer(getFileSystem().sink(openEditor.getMetadata(), false));
                    try {
                        new coil.network.CacheResponse(response).writeTo(buffer2);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        }
                        th = null;
                    } catch (java.lang.Throwable th7) {
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (java.lang.Throwable th8) {
                                kotlin.ExceptionsKt.addSuppressed(th7, th8);
                            }
                        }
                        th = th7;
                    }
                    if (th != null) {
                        throw th;
                    }
                    okio.BufferedSink buffer3 = okio.Okio.buffer(getFileSystem().sink(openEditor.getData(), false));
                    try {
                        okhttp3.ResponseBody body = response.body();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(body);
                        java.lang.Long.valueOf(body.getSource().readAll(buffer3));
                        if (buffer3 != null) {
                            try {
                                buffer3.close();
                            } catch (java.lang.Throwable th9) {
                                th2 = th9;
                            }
                        }
                    } catch (java.lang.Throwable th10) {
                        th2 = th10;
                        if (buffer3 != null) {
                            try {
                                buffer3.close();
                            } catch (java.lang.Throwable th11) {
                                kotlin.ExceptionsKt.addSuppressed(th2, th11);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                }
                return openEditor.commitAndOpenSnapshot();
            } catch (java.lang.Exception e) {
                coil.util.Utils.abortQuietly(openEditor);
                throw e;
            }
        } finally {
            coil.util.Utils.closeQuietly(response);
        }
    }

    private final okhttp3.Request newRequest() {
        okhttp3.Request.Builder headers = new okhttp3.Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (java.util.Map.Entry<java.lang.Class<?>, java.lang.Object> entry : this.options.getTags().asMap().entrySet()) {
            java.lang.Class<?> key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(okhttp3.CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                headers.cacheControl(CACHE_CONTROL_NO_NETWORK_NO_CACHE);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            headers.cacheControl(okhttp3.CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(CACHE_CONTROL_FORCE_NETWORK_NO_CACHE);
        }
        return headers.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeNetworkRequest(okhttp3.Request request, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
        coil.fetch.HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        int i;
        okhttp3.Response execute;
        if (continuation instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) continuation;
            if ((httpUriFetcher$executeNetworkRequest$1.label & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpUriFetcher$executeNetworkRequest$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpUriFetcher$executeNetworkRequest$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (coil.util.Utils.isMainThread()) {
                        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
                            throw new android.os.NetworkOnMainThreadException();
                        }
                        execute = this.callFactory.getValue().newCall(request).execute();
                        if (!execute.isSuccessful() || execute.code() == 304) {
                            return execute;
                        }
                        okhttp3.ResponseBody body = execute.body();
                        if (body != null) {
                            coil.util.Utils.closeQuietly(body);
                        }
                        throw new coil.network.HttpException(execute);
                    }
                    okhttp3.Call newCall = this.callFactory.getValue().newCall(request);
                    httpUriFetcher$executeNetworkRequest$1.label = 1;
                    obj = coil.util.Calls.await(newCall, httpUriFetcher$executeNetworkRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                execute = (okhttp3.Response) obj;
                if (execute.isSuccessful()) {
                }
                return execute;
            }
        }
        httpUriFetcher$executeNetworkRequest$1 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1(this, continuation);
        java.lang.Object obj2 = httpUriFetcher$executeNetworkRequest$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpUriFetcher$executeNetworkRequest$1.label;
        if (i != 0) {
        }
        execute = (okhttp3.Response) obj2;
        if (execute.isSuccessful()) {
        }
        return execute;
    }

    public final java.lang.String getMimeType$coil_base_release(java.lang.String url, okhttp3.MediaType contentType) {
        java.lang.String mimeTypeFromUrl;
        java.lang.String mediaType = contentType != null ? contentType.getMediaType() : null;
        if ((mediaType == null || kotlin.text.StringsKt.startsWith$default(mediaType, "text/plain", false, 2, (java.lang.Object) null)) && (mimeTypeFromUrl = coil.util.Utils.getMimeTypeFromUrl(android.webkit.MimeTypeMap.getSingleton(), url)) != null) {
            return mimeTypeFromUrl;
        }
        if (mediaType != null) {
            return kotlin.text.StringsKt.substringBefore$default(mediaType, ';', (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return null;
    }

    private final boolean isCacheable(okhttp3.Request request, okhttp3.Response response) {
        return this.options.getDiskCachePolicy().getWriteEnabled() && (!this.respectCacheHeaders || coil.network.CacheStrategy.INSTANCE.isCacheable(request, response));
    }

    private final coil.network.CacheResponse toCacheResponse(coil.disk.DiskCache.Snapshot snapshot) {
        coil.network.CacheResponse cacheResponse;
        java.lang.Throwable th;
        try {
            okio.BufferedSource buffer = okio.Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                cacheResponse = new coil.network.CacheResponse(buffer);
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th4) {
                        kotlin.ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                cacheResponse = null;
                th = th3;
            }
            if (th == null) {
                return cacheResponse;
            }
            throw th;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private final coil.decode.ImageSource toImageSource(coil.disk.DiskCache.Snapshot snapshot) {
        return coil.decode.ImageSources.create(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot);
    }

    private final coil.decode.ImageSource toImageSource(okhttp3.ResponseBody responseBody) {
        return coil.decode.ImageSources.create(responseBody.getSource(), this.options.getContext());
    }

    private final coil.decode.DataSource toDataSource(okhttp3.Response response) {
        return response.networkResponse() != null ? coil.decode.DataSource.NETWORK : coil.decode.DataSource.DISK;
    }

    private final java.lang.String getDiskCacheKey() {
        java.lang.String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final okio.FileSystem getFileSystem() {
        coil.disk.DiskCache value = this.diskCache.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
        return value.getFileSystem();
    }

    /* compiled from: HttpUriFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "diskCache", "Lcoil/disk/DiskCache;", "respectCacheHeaders", "", "<init>", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.fetch.Fetcher.Factory<android.net.Uri> {
        private final kotlin.Lazy<okhttp3.Call.Factory> callFactory;
        private final kotlin.Lazy<coil.disk.DiskCache> diskCache;
        private final boolean respectCacheHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(kotlin.Lazy<? extends okhttp3.Call.Factory> lazy, kotlin.Lazy<? extends coil.disk.DiskCache> lazy2, boolean z) {
            this.callFactory = lazy;
            this.diskCache = lazy2;
            this.respectCacheHeaders = z;
        }

        @Override // coil.fetch.Fetcher.Factory
        public coil.fetch.Fetcher create(android.net.Uri data, coil.request.Options options, coil.ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new coil.fetch.HttpUriFetcher(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }

        private final boolean isApplicable(android.net.Uri data) {
            return kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), androidx.webkit.ProxyConfig.MATCH_HTTP) || kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "https");
        }
    }
}
