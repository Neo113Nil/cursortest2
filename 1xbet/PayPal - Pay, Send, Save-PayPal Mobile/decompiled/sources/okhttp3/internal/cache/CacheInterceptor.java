package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Cache;", com.datadog.trace.api.DDSpanTypes.CACHE, "<init>", "(Lokhttp3/Cache;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheInterceptor implements okhttp3.Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.cache.CacheInterceptor.Companion INSTANCE = new okhttp3.internal.cache.CacheInterceptor.Companion(null);
    private final okhttp3.Cache cache;

    public CacheInterceptor(okhttp3.Cache cache) {
        this.cache = cache;
    }

    /* renamed from: getCache$okhttp, reason: from getter */
    public final okhttp3.Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.EventListener eventListener;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Call call = chain.call();
        okhttp3.Cache cache = this.cache;
        okhttp3.Response response = cache != null ? cache.get$okhttp(okhttp3.internal.cache.CacheInterceptorKt.access$requestForCache(chain.request())) : null;
        okhttp3.internal.cache.CacheStrategy compute = new okhttp3.internal.cache.CacheStrategy.Factory(java.lang.System.currentTimeMillis(), chain.request(), response).compute();
        okhttp3.Request networkRequest = compute.getNetworkRequest();
        okhttp3.Response cacheResponse = compute.getCacheResponse();
        okhttp3.Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        okhttp3.internal.connection.RealCall realCall = call instanceof okhttp3.internal.connection.RealCall ? (okhttp3.internal.connection.RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = okhttp3.EventListener.NONE;
        }
        if (response != null && cacheResponse == null) {
            okhttp3.internal._UtilCommonKt.closeQuietly(response.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            okhttp3.Response build = new okhttp3.Response.Builder().request(chain.request()).protocol(okhttp3.Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        }
        if (networkRequest == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cacheResponse);
            okhttp3.Response build2 = cacheResponse.newBuilder().cacheResponse(okhttp3.internal.UnreadableResponseBodyKt.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            okhttp3.Response proceed = chain.proceed(networkRequest);
            if (proceed == null && response != null) {
            }
            if (cacheResponse != null) {
                if (proceed != null && proceed.code() == 304) {
                    okhttp3.Response build3 = cacheResponse.newBuilder().headers(okhttp3.internal.cache.CacheInterceptor.Companion.access$combine(INSTANCE, cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(okhttp3.internal.UnreadableResponseBodyKt.stripBody(cacheResponse)).networkResponse(okhttp3.internal.UnreadableResponseBodyKt.stripBody(proceed)).build();
                    proceed.body().close();
                    okhttp3.Cache cache3 = this.cache;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, build3);
                    eventListener.cacheHit(call, build3);
                    return build3;
                }
                okhttp3.internal._UtilCommonKt.closeQuietly(cacheResponse.body());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
            okhttp3.Response build4 = proceed.newBuilder().cacheResponse(cacheResponse != null ? okhttp3.internal.UnreadableResponseBodyKt.stripBody(cacheResponse) : null).networkResponse(okhttp3.internal.UnreadableResponseBodyKt.stripBody(proceed)).build();
            if (this.cache != null) {
                okhttp3.Request access$requestForCache = okhttp3.internal.cache.CacheInterceptorKt.access$requestForCache(networkRequest);
                if (okhttp3.internal.http.HttpHeaders.promisesBody(build4) && okhttp3.internal.cache.CacheStrategy.INSTANCE.isCacheable(build4, access$requestForCache)) {
                    final okhttp3.internal.cache.CacheRequest put$okhttp = this.cache.put$okhttp(build4.newBuilder().request(access$requestForCache).build());
                    if (put$okhttp != null) {
                        okio.Sink getHighSpeedVideoSizes = put$okhttp.getGetHighSpeedVideoSizes();
                        final okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = build4.body().getGetHighResolutionOutputSizeshNQ4ISI();
                        final okio.BufferedSink buffer = okio.Okio.buffer(getHighSpeedVideoSizes);
                        build4 = build4.newBuilder().body(new okhttp3.internal.http.RealResponseBody(okhttp3.Response.header$default(build4, "Content-Type", null, 2, null), build4.body().getGetHighSpeedVideoFpsRanges(), okio.Okio.buffer(new okio.Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

                            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
                            private boolean Camera2StreamConfigurationMap;

                            @Override // okio.Source
                            public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                                try {
                                    long read = okio.BufferedSource.this.read(sink, byteCount);
                                    if (read == -1) {
                                        if (!this.Camera2StreamConfigurationMap) {
                                            this.Camera2StreamConfigurationMap = true;
                                            buffer.close();
                                        }
                                        return -1L;
                                    }
                                    sink.copyTo(buffer.getBuffer(), sink.size() - read, read);
                                    buffer.emitCompleteSegments();
                                    return read;
                                } catch (java.io.IOException e) {
                                    if (!this.Camera2StreamConfigurationMap) {
                                        this.Camera2StreamConfigurationMap = true;
                                        put$okhttp.abort();
                                    }
                                    throw e;
                                }
                            }

                            @Override // okio.Source
                            /* renamed from: timeout */
                            public final okio.Timeout getGetHighResolutionOutputSizeshNQ4ISI() {
                                return okio.BufferedSource.this.getGetHighResolutionOutputSizeshNQ4ISI();
                            }

                            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() throws java.io.IOException {
                                if (!this.Camera2StreamConfigurationMap && !okhttp3.internal._UtilJvmKt.discard(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                                    this.Camera2StreamConfigurationMap = true;
                                    put$okhttp.abort();
                                }
                                okio.BufferedSource.this.close();
                            }
                        }))).build();
                    }
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return build4;
                }
                if (okhttp3.internal.http.HttpMethod.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
            return build4;
        } finally {
            if (response != null) {
                okhttp3.internal._UtilCommonKt.closeQuietly(response.body());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean getHighSpeedVideoSizes(java.lang.String p0) {
            return (kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONNECTION, p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.KEEP_ALIVE, p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TE, p0, true) || kotlin.text.StringsKt.equals("Trailers", p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, p0, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.UPGRADE, p0, true)) ? false : true;
        }

        private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
            return kotlin.text.StringsKt.equals("Content-Length", p0, true) || kotlin.text.StringsKt.equals("Content-Encoding", p0, true) || kotlin.text.StringsKt.equals("Content-Type", p0, true);
        }

        public static final /* synthetic */ okhttp3.Headers access$combine(okhttp3.internal.cache.CacheInterceptor.Companion companion, okhttp3.Headers headers, okhttp3.Headers headers2) {
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                java.lang.String name2 = headers.name(i);
                java.lang.String value = headers.value(i);
                if ((!kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.WARNING, name2, true) || !kotlin.text.StringsKt.startsWith$default(value, "1", false, 2, (java.lang.Object) null)) && (getHighResolutionOutputSizeshNQ4ISI(name2) || !getHighSpeedVideoSizes(name2) || headers2.get(name2) == null)) {
                    builder.addLenient$okhttp(name2, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.String name3 = headers2.name(i2);
                if (!getHighResolutionOutputSizeshNQ4ISI(name3) && getHighSpeedVideoSizes(name3)) {
                    builder.addLenient$okhttp(name3, headers2.value(i2));
                }
            }
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
