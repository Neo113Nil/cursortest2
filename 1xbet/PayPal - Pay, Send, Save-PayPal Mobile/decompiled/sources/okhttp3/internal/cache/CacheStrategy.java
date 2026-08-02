package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", "Lokhttp3/Response;", "getCacheResponse", "()Lokhttp3/Response;", "Companion", "Factory"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.cache.CacheStrategy.Companion INSTANCE = new okhttp3.internal.cache.CacheStrategy.Companion(null);
    private final okhttp3.Response cacheResponse;
    private final okhttp3.Request networkRequest;

    public CacheStrategy(okhttp3.Request request, okhttp3.Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final okhttp3.Request getNetworkRequest() {
        return this.networkRequest;
    }

    public final okhttp3.Response getCacheResponse() {
        return this.cacheResponse;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\""}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "", "nowMillis", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "Lokhttp3/internal/cache/CacheStrategy;", "compute", "()Lokhttp3/internal/cache/CacheStrategy;", "getOutputFormats", "J", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "getHighSpeedVideoFpsRanges", "Lokhttp3/Response;", "getHighSpeedVideoSizes", "Ljava/util/Date;", "getInputFormats", "Ljava/util/Date;", "", "getOutputStallDurationlomOqCM", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "", com.visa.cbp.getEncExpo.warmup, "getOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Factory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getOutputMinFrameDuration;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.util.Date getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final okhttp3.Response getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.Date Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoSizesFor;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private java.util.Date getHighSpeedVideoFpsRanges;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private long getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private long getOutputFormats;

        /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private final okhttp3.Request request;

        public Factory(long j, okhttp3.Request request, okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.request = request;
            this.getHighSpeedVideoSizes = response;
            this.getOutputSizeshNQ4ISI = -1;
            if (response != null) {
                this.getOutputFormats = response.sentRequestAtMillis();
                this.getInputFormats = response.receivedResponseAtMillis();
                okhttp3.Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    java.lang.String name2 = headers.name(i);
                    java.lang.String value = headers.value(i);
                    if (kotlin.text.StringsKt.equals(name2, com.google.common.net.HttpHeaders.DATE, true)) {
                        this.getHighSpeedVideoFpsRanges = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(value);
                        this.getHighSpeedVideoFpsRangesFor = value;
                    } else if (kotlin.text.StringsKt.equals(name2, com.google.common.net.HttpHeaders.EXPIRES, true)) {
                        this.getInputSizeshNQ4ISI = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(value);
                    } else if (kotlin.text.StringsKt.equals(name2, "Last-Modified", true)) {
                        this.Camera2StreamConfigurationMap = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(value);
                        this.getHighSpeedVideoSizesFor = value;
                    } else if (kotlin.text.StringsKt.equals(name2, "ETag", true)) {
                        this.getOutputMinFrameDuration = value;
                    } else if (kotlin.text.StringsKt.equals(name2, "Age", true)) {
                        this.getOutputSizeshNQ4ISI = okhttp3.internal._UtilCommonKt.toNonNegativeInt(value, -1);
                    }
                }
            }
        }

        /* renamed from: getRequest$okhttp, reason: from getter */
        public final okhttp3.Request getRequest() {
            return this.request;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x00cb, code lost:
        
            if (r11 > 0) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okhttp3.internal.cache.CacheStrategy compute() {
            okhttp3.internal.cache.CacheStrategy cacheStrategy;
            long j;
            okhttp3.internal.cache.CacheStrategy cacheStrategy2;
            if (this.getHighSpeedVideoSizes == null) {
                cacheStrategy = new okhttp3.internal.cache.CacheStrategy(this.request, null);
            } else if (this.request.isHttps() && this.getHighSpeedVideoSizes.handshake() == null) {
                cacheStrategy = new okhttp3.internal.cache.CacheStrategy(this.request, null);
            } else if (!okhttp3.internal.cache.CacheStrategy.INSTANCE.isCacheable(this.getHighSpeedVideoSizes, this.request)) {
                cacheStrategy = new okhttp3.internal.cache.CacheStrategy(this.request, null);
            } else {
                okhttp3.CacheControl cacheControl = this.request.cacheControl();
                if (!cacheControl.noCache()) {
                    okhttp3.Request request = this.request;
                    java.lang.String str = "If-Modified-Since";
                    if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                        okhttp3.CacheControl cacheControl2 = this.getHighSpeedVideoSizes.cacheControl();
                        java.util.Date date = this.getHighSpeedVideoFpsRanges;
                        long j2 = 0;
                        long max = date != null ? java.lang.Math.max(0L, this.getInputFormats - date.getTime()) : 0L;
                        if (this.getOutputSizeshNQ4ISI != -1) {
                            max = java.lang.Math.max(max, java.util.concurrent.TimeUnit.SECONDS.toMillis(this.getOutputSizeshNQ4ISI));
                        }
                        long max2 = max + java.lang.Math.max(0L, this.getInputFormats - this.getOutputFormats) + java.lang.Math.max(0L, this.getHighResolutionOutputSizeshNQ4ISI - this.getInputFormats);
                        okhttp3.Response response = this.getHighSpeedVideoSizes;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(response);
                        if (response.cacheControl().maxAgeSeconds() != -1) {
                            j = java.util.concurrent.TimeUnit.SECONDS.toMillis(r5.maxAgeSeconds());
                        } else {
                            java.util.Date date2 = this.getInputSizeshNQ4ISI;
                            if (date2 != null) {
                                java.util.Date date3 = this.getHighSpeedVideoFpsRanges;
                                j = date2.getTime() - (date3 != null ? date3.getTime() : this.getInputFormats);
                            } else {
                                if (this.Camera2StreamConfigurationMap != null && this.getHighSpeedVideoSizes.request().url().query() == null) {
                                    java.util.Date date4 = this.getHighSpeedVideoFpsRanges;
                                    long time = date4 != null ? date4.getTime() : this.getOutputFormats;
                                    java.util.Date date5 = this.Camera2StreamConfigurationMap;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(date5);
                                    long time2 = time - date5.getTime();
                                    if (time2 > 0) {
                                        j = time2 / 10;
                                    }
                                }
                                j = 0;
                            }
                        }
                        if (cacheControl.maxAgeSeconds() != -1) {
                            j = java.lang.Math.min(j, java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                        }
                        long millis = cacheControl.minFreshSeconds() != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
                        if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                            j2 = java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                        }
                        if (!cacheControl2.noCache()) {
                            long j3 = millis + max2;
                            if (j3 < j2 + j) {
                                okhttp3.Response.Builder newBuilder = this.getHighSpeedVideoSizes.newBuilder();
                                if (j3 >= j) {
                                    newBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (max2 > 86400000) {
                                    okhttp3.Response response2 = this.getHighSpeedVideoSizes;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(response2);
                                    if (response2.cacheControl().maxAgeSeconds() == -1 && this.getInputSizeshNQ4ISI == null) {
                                        newBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                cacheStrategy2 = new okhttp3.internal.cache.CacheStrategy(null, newBuilder.build());
                                cacheStrategy = cacheStrategy2;
                            }
                        }
                        java.lang.String str2 = this.getOutputMinFrameDuration;
                        if (str2 != null) {
                            str = "If-None-Match";
                        } else if (this.Camera2StreamConfigurationMap != null) {
                            str2 = this.getHighSpeedVideoSizesFor;
                        } else if (this.getHighSpeedVideoFpsRanges != null) {
                            str2 = this.getHighSpeedVideoFpsRangesFor;
                        } else {
                            cacheStrategy = new okhttp3.internal.cache.CacheStrategy(this.request, null);
                        }
                        okhttp3.Headers.Builder newBuilder2 = this.request.headers().newBuilder();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                        newBuilder2.addLenient$okhttp(str, str2);
                        cacheStrategy2 = new okhttp3.internal.cache.CacheStrategy(this.request.newBuilder().headers(newBuilder2.build()).build(), this.getHighSpeedVideoSizes);
                        cacheStrategy = cacheStrategy2;
                    }
                }
                cacheStrategy = new okhttp3.internal.cache.CacheStrategy(this.request, null);
            }
            return (cacheStrategy.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? cacheStrategy : new okhttp3.internal.cache.CacheStrategy(null, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "isCacheable", "(Lokhttp3/Response;Lokhttp3/Request;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean isCacheable(okhttp3.Response response, okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            int code = response.code();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.EXPIRES, null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
                    return false;
                }
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
