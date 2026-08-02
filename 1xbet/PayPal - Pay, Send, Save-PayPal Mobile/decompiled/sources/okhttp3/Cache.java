package okhttp3;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0004KLMJB)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0019¢\u0006\u0004\b#\u0010!J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020(¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010-J\u000f\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010!J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u0010!J\u000f\u00100\u001a\u00020\u000eH\u0007¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0000¢\u0006\u0004\b6\u0010!J\r\u00107\u001a\u00020(¢\u0006\u0004\b7\u0010*J\r\u00108\u001a\u00020(¢\u0006\u0004\b8\u0010*J\r\u00109\u001a\u00020(¢\u0006\u0004\b9\u0010*R\u001a\u0010;\u001a\u00020:8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010+\u001a\u00020(8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010*\"\u0004\bA\u0010BR\"\u0010)\u001a\u00020(8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010?\u001a\u0004\bC\u0010*\"\u0004\bD\u0010BR\u0016\u00107\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010?R\u0016\u00108\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010?R\u0016\u00109\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010?R\u0011\u0010F\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\u0004\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0004\u00101R\u0011\u0010H\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bH\u0010I"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokio/Path;", "directory", "", "maxSize", "Lokio/FileSystem;", "fileSystem", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokio/Path;JLokio/FileSystem;Lokhttp3/internal/concurrent/TaskRunner;)V", "(Lokio/FileSystem;Lokio/Path;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "", "remove$okhttp", "(Lokhttp3/Request;)V", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "initialize", "()V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "evictAll", "", "", "urls", "()Ljava/util/Iterator;", "", "writeAbortCount", "()I", "writeSuccessCount", io.ktor.http.ContentDisposition.Parameters.Size, "()J", "flush", "close", "-deprecated_directory", "()Ljava/io/File;", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackConditionalCacheHit$okhttp", "networkCount", "hitCount", "requestCount", "Lokhttp3/internal/cache/DiskLruCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", com.visa.cbp.getEncExpo.warmup, "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "directoryPath", "()Lokio/Path;", "Companion", "RealCacheRequest", "Entry", "CacheResponseBody"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cache implements java.io.Closeable, java.io.Flushable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Cache.Companion INSTANCE = new okhttp3.Cache.Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public Cache(okio.Path path, long j, okio.FileSystem fileSystem, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        this.cache = new okhttp3.internal.cache.DiskLruCache(fileSystem, path, VERSION, 2, j, taskRunner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(okio.FileSystem fileSystem, okio.Path path, long j) {
        this(path, j, fileSystem, okhttp3.internal.concurrent.TaskRunner.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(java.io.File file, long j) {
        this(okio.FileSystem.SYSTEM, okio.Path.Companion.get$default(okio.Path.INSTANCE, file, false, 1, (java.lang.Object) null), j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
    }

    /* renamed from: getCache$okhttp, reason: from getter */
    public final okhttp3.internal.cache.DiskLruCache getCache() {
        return this.cache;
    }

    /* renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    /* renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final okhttp3.Response get$okhttp(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        okhttp3.Cache.Companion companion = INSTANCE;
        try {
            okhttp3.internal.cache.DiskLruCache.Snapshot snapshot = this.cache.get(companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(snapshot.getSource(0));
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshot, "");
                java.lang.String str = entry.getInputFormats.get("Content-Type");
                java.lang.String str2 = entry.getInputFormats.get("Content-Length");
                okhttp3.Response build = new okhttp3.Response.Builder().request(new okhttp3.Request(entry.getHighSpeedVideoFpsRangesFor, entry.getHighSpeedVideoSizes, entry.getHighResolutionOutputSizeshNQ4ISI, null, 8, null)).protocol(entry.Camera2StreamConfigurationMap).code(entry.getHighSpeedVideoFpsRanges).message(entry.getInputSizeshNQ4ISI).headers(entry.getInputFormats).body(new okhttp3.Cache.CacheResponseBody(snapshot, str, str2)).handshake(entry.getOutputFormats).sentRequestAtMillis(entry.getOutputMinFrameDuration).receivedResponseAtMillis(entry.getHighSpeedVideoSizesFor).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(build, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getHighSpeedVideoFpsRangesFor, request.url()) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getHighResolutionOutputSizeshNQ4ISI, request.method()) && companion.varyMatches(build, entry.getHighSpeedVideoSizes, request)) {
                    return build;
                }
                okhttp3.internal._UtilCommonKt.closeQuietly(build.body());
                return null;
            } catch (java.io.IOException unused) {
                okhttp3.internal._UtilCommonKt.closeQuietly(snapshot);
                return null;
            }
        } catch (java.io.IOException unused2) {
            return null;
        }
    }

    public final okhttp3.internal.cache.CacheRequest put$okhttp(okhttp3.Response response) {
        okhttp3.internal.cache.DiskLruCache.Editor editor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String method = response.request().method();
        if (okhttp3.internal.http.HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (java.io.IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(method, "GET")) {
            return null;
        }
        okhttp3.Cache.Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(response);
        try {
            editor = okhttp3.internal.cache.DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.getHighSpeedVideoFpsRangesFor(editor);
                return new okhttp3.Cache.RealCacheRequest(this, editor);
            } catch (java.io.IOException unused2) {
                if (editor != null) {
                    try {
                        editor.abort();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return null;
            }
        } catch (java.io.IOException unused4) {
            editor = null;
        }
    }

    public final void remove$okhttp(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final void update$okhttp(okhttp3.Response cached, okhttp3.Response network) {
        okhttp3.internal.cache.DiskLruCache.Editor editor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cached, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        okhttp3.Cache.Entry entry = new okhttp3.Cache.Entry(network);
        okhttp3.ResponseBody body = cached.body();
        kotlin.jvm.internal.Intrinsics.checkNotNull(body, "");
        try {
            editor = ((okhttp3.Cache.CacheResponseBody) body).getHighSpeedVideoFpsRanges.edit();
            if (editor == null) {
                return;
            }
            try {
                entry.getHighSpeedVideoFpsRangesFor(editor);
                editor.commit();
            } catch (java.io.IOException unused) {
                if (editor != null) {
                    try {
                        editor.abort();
                    } catch (java.io.IOException unused2) {
                    }
                }
            }
        } catch (java.io.IOException unused3) {
            editor = null;
        }
    }

    public final void initialize() throws java.io.IOException {
        this.cache.initialize();
    }

    public final void delete() throws java.io.IOException {
        this.cache.delete();
    }

    public final void evictAll() throws java.io.IOException {
        this.cache.evictAll();
    }

    public final java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
        return new okhttp3.Cache$urls$1(this);
    }

    public final int writeAbortCount() {
        int i;
        synchronized (this) {
            i = this.writeAbortCount;
        }
        return i;
    }

    public final int writeSuccessCount() {
        int i;
        synchronized (this) {
            i = this.writeSuccessCount;
        }
        return i;
    }

    public final long size() throws java.io.IOException {
        return this.cache.size();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.cache.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.cache.close();
    }

    public final java.io.File directory() {
        return this.cache.getDirectory().toFile();
    }

    public final okio.Path directoryPath() {
        return this.cache.getDirectory();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "directory", imports = {}))
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m24283deprecated_directory() {
        return this.cache.getDirectory().toFile();
    }

    public final void trackResponse$okhttp(okhttp3.internal.cache.CacheStrategy cacheStrategy) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheStrategy, "");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        }
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    public final int networkCount() {
        int i;
        synchronized (this) {
            i = this.networkCount;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int requestCount() {
        int i;
        synchronized (this) {
            i = this.requestCount;
        }
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00148\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "abort", "()V", "Lokio/Sink;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "()Lokio/Sink;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lokio/Sink;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final okio.Sink getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        boolean getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ okhttp3.Cache getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okhttp3.internal.cache.DiskLruCache.Editor getHighSpeedVideoFpsRanges;
        private final okio.Sink getHighSpeedVideoSizes;

        public RealCacheRequest(final okhttp3.Cache cache, okhttp3.internal.cache.DiskLruCache.Editor editor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editor, "");
            this.getHighSpeedVideoFpsRanges = cache;
            this.getHighSpeedVideoFpsRanges = editor;
            okio.Sink newSink = editor.newSink(1);
            this.getHighResolutionOutputSizeshNQ4ISI = newSink;
            this.getHighSpeedVideoSizes = new okio.ForwardingSink(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws java.io.IOException {
                    okhttp3.Cache cache2 = okhttp3.Cache.this;
                    okhttp3.Cache.RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getHighSpeedVideoFpsRangesFor) {
                            return;
                        }
                        realCacheRequest.getHighSpeedVideoFpsRangesFor = true;
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.getHighSpeedVideoFpsRanges.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            okhttp3.Cache cache = this.getHighSpeedVideoFpsRanges;
            synchronized (cache) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                okhttp3.internal._UtilCommonKt.closeQuietly(this.getHighResolutionOutputSizeshNQ4ISI);
                try {
                    this.getHighSpeedVideoFpsRanges.abort();
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: body, reason: from getter */
        public final okio.Sink getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u00060\bR\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\u0014\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010%\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0014\u0010&\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\u001a\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Lokio/Source;", "p0", "<init>", "(Lokio/Source;)V", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "", "getHighSpeedVideoFpsRangesFor", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokio/BufferedSource;", "", "Ljava/security/cert/Certificate;", "getHighResolutionOutputSizeshNQ4ISI", "(Lokio/BufferedSource;)Ljava/util/List;", "Lokio/BufferedSink;", "p1", "getHighSpeedVideoFpsRanges", "(Lokio/BufferedSink;Ljava/util/List;)V", "Lokhttp3/HttpUrl;", "getInputFormats", "Lokhttp3/HttpUrl;", "Lokhttp3/Headers;", "getHighSpeedVideoSizesFor", "Lokhttp3/Headers;", "getHighSpeedVideoSizes", "", "getOutputFormats", "Ljava/lang/String;", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", "Camera2StreamConfigurationMap", "", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "Lokhttp3/Handshake;", "Lokhttp3/Handshake;", "", "J", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class Entry {
        private static final java.lang.String getOutputMinFrameDurationlomOqCM;
        private static final java.lang.String getOutputSizeshNQ4ISI;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getInputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final okhttp3.Handshake getOutputFormats;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final okhttp3.Protocol Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final long getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        final okhttp3.Headers getHighSpeedVideoSizes;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        final okhttp3.HttpUrl getHighSpeedVideoFpsRangesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        final long getOutputMinFrameDuration;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        final okhttp3.Headers getInputFormats;

        public Entry(okio.Source source) throws java.io.IOException {
            okhttp3.TlsVersion tlsVersion;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            okio.Source source2 = source;
            try {
                okio.Source source3 = source2;
                okio.BufferedSource buffer = okio.Okio.buffer(source);
                java.lang.String readUtf8LineStrict = buffer.readUtf8LineStrict();
                okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(readUtf8LineStrict);
                if (parse == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cache corruption for ");
                    sb.append(readUtf8LineStrict);
                    java.io.IOException iOException = new java.io.IOException(sb.toString());
                    okhttp3.internal.platform.Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.getHighSpeedVideoFpsRangesFor = parse;
                this.getHighResolutionOutputSizeshNQ4ISI = buffer.readUtf8LineStrict();
                okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
                int readInt$okhttp = okhttp3.Cache.INSTANCE.readInt$okhttp(buffer);
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(buffer.readUtf8LineStrict());
                }
                this.getHighSpeedVideoSizes = builder.build();
                okhttp3.internal.http.StatusLine parse2 = okhttp3.internal.http.StatusLine.INSTANCE.parse(buffer.readUtf8LineStrict());
                this.Camera2StreamConfigurationMap = parse2.protocol;
                this.getHighSpeedVideoFpsRanges = parse2.code;
                this.getInputSizeshNQ4ISI = parse2.message;
                okhttp3.Headers.Builder builder2 = new okhttp3.Headers.Builder();
                int readInt$okhttp2 = okhttp3.Cache.INSTANCE.readInt$okhttp(buffer);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(buffer.readUtf8LineStrict());
                }
                java.lang.String str = getOutputSizeshNQ4ISI;
                java.lang.String str2 = builder2.get(str);
                java.lang.String str3 = getOutputMinFrameDurationlomOqCM;
                java.lang.String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.getOutputMinFrameDuration = str2 != null ? java.lang.Long.parseLong(str2) : 0L;
                this.getHighSpeedVideoSizesFor = str4 != null ? java.lang.Long.parseLong(str4) : 0L;
                this.getInputFormats = builder2.build();
                if (this.getHighSpeedVideoFpsRangesFor.isHttps()) {
                    java.lang.String readUtf8LineStrict2 = buffer.readUtf8LineStrict();
                    if (readUtf8LineStrict2.length() > 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("expected \"\" but was \"");
                        sb2.append(readUtf8LineStrict2);
                        sb2.append('\"');
                        throw new java.io.IOException(sb2.toString());
                    }
                    okhttp3.CipherSuite forJavaName = okhttp3.CipherSuite.INSTANCE.forJavaName(buffer.readUtf8LineStrict());
                    java.util.List<java.security.cert.Certificate> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(buffer);
                    java.util.List<java.security.cert.Certificate> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(buffer);
                    if (!buffer.exhausted()) {
                        tlsVersion = okhttp3.TlsVersion.INSTANCE.forJavaName(buffer.readUtf8LineStrict());
                    } else {
                        tlsVersion = okhttp3.TlsVersion.SSL_3_0;
                    }
                    this.getOutputFormats = okhttp3.Handshake.INSTANCE.get(tlsVersion, forJavaName, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2);
                } else {
                    this.getOutputFormats = null;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(source2, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    kotlin.io.CloseableKt.closeFinally(source2, th);
                    throw th2;
                }
            }
        }

        public Entry(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            this.getHighSpeedVideoFpsRangesFor = response.request().url();
            this.getHighSpeedVideoSizes = okhttp3.Cache.INSTANCE.varyHeaders(response);
            this.getHighResolutionOutputSizeshNQ4ISI = response.request().method();
            this.Camera2StreamConfigurationMap = response.protocol();
            this.getHighSpeedVideoFpsRanges = response.code();
            this.getInputSizeshNQ4ISI = response.message();
            this.getInputFormats = response.headers();
            this.getOutputFormats = response.handshake();
            this.getOutputMinFrameDuration = response.sentRequestAtMillis();
            this.getHighSpeedVideoSizesFor = response.receivedResponseAtMillis();
        }

        public final void getHighSpeedVideoFpsRangesFor(okhttp3.internal.cache.DiskLruCache.Editor p0) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            okio.BufferedSink buffer = okio.Okio.buffer(p0.newSink(0));
            try {
                okio.BufferedSink bufferedSink = buffer;
                bufferedSink.writeUtf8(this.getHighSpeedVideoFpsRangesFor.toString()).writeByte(10);
                bufferedSink.writeUtf8(this.getHighResolutionOutputSizeshNQ4ISI).writeByte(10);
                bufferedSink.writeDecimalLong(this.getHighSpeedVideoSizes.size()).writeByte(10);
                int size = this.getHighSpeedVideoSizes.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(this.getHighSpeedVideoSizes.name(i)).writeUtf8(": ").writeUtf8(this.getHighSpeedVideoSizes.value(i)).writeByte(10);
                }
                bufferedSink.writeUtf8(new okhttp3.internal.http.StatusLine(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI).toString()).writeByte(10);
                bufferedSink.writeDecimalLong(this.getInputFormats.size() + 2).writeByte(10);
                int size2 = this.getInputFormats.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.writeUtf8(this.getInputFormats.name(i2)).writeUtf8(": ").writeUtf8(this.getInputFormats.value(i2)).writeByte(10);
                }
                bufferedSink.writeUtf8(getOutputSizeshNQ4ISI).writeUtf8(": ").writeDecimalLong(this.getOutputMinFrameDuration).writeByte(10);
                bufferedSink.writeUtf8(getOutputMinFrameDurationlomOqCM).writeUtf8(": ").writeDecimalLong(this.getHighSpeedVideoSizesFor).writeByte(10);
                if (this.getHighSpeedVideoFpsRangesFor.isHttps()) {
                    bufferedSink.writeByte(10);
                    okhttp3.Handshake handshake = this.getOutputFormats;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(handshake);
                    bufferedSink.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    getHighSpeedVideoFpsRanges(bufferedSink, this.getOutputFormats.peerCertificates());
                    getHighSpeedVideoFpsRanges(bufferedSink, this.getOutputFormats.localCertificates());
                    bufferedSink.writeUtf8(this.getOutputFormats.tlsVersion().javaName()).writeByte(10);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(buffer, null);
            } finally {
            }
        }

        private static java.util.List<java.security.cert.Certificate> getHighResolutionOutputSizeshNQ4ISI(okio.BufferedSource p0) throws java.io.IOException {
            int readInt$okhttp = okhttp3.Cache.INSTANCE.readInt$okhttp(p0);
            if (readInt$okhttp == -1) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            try {
                java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
                java.util.ArrayList arrayList = new java.util.ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    java.lang.String readUtf8LineStrict = p0.readUtf8LineStrict();
                    okio.Buffer buffer = new okio.Buffer();
                    okio.ByteString decodeBase64 = okio.ByteString.INSTANCE.decodeBase64(readUtf8LineStrict);
                    if (decodeBase64 == null) {
                        throw new java.io.IOException("Corrupt certificate in cache entry");
                    }
                    buffer.write(decodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (java.security.cert.CertificateException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        private static void getHighSpeedVideoFpsRanges(okio.BufferedSink p0, java.util.List<? extends java.security.cert.Certificate> p1) throws java.io.IOException {
            try {
                p0.writeDecimalLong(p1.size()).writeByte(10);
                java.util.Iterator<? extends java.security.cert.Certificate> it = p1.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    okio.ByteString.Companion companion = okio.ByteString.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(encoded);
                    p0.writeUtf8(okio.ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (java.security.cert.CertificateEncodingException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        static {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(okhttp3.internal.platform.Platform.INSTANCE.get().getPrefix());
            sb.append("-Sent-Millis");
            getOutputSizeshNQ4ISI = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(okhttp3.internal.platform.Platform.INSTANCE.get().getPrefix());
            sb2.append("-Received-Millis");
            getOutputMinFrameDurationlomOqCM = sb2.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0015\u001a\u00060\u0002R\u00020\u00038\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "", "p1", "p2", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lokio/BufferedSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class CacheResponseBody extends okhttp3.ResponseBody {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final okhttp3.internal.cache.DiskLruCache.Snapshot getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot snapshot, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshot, "");
            this.getHighSpeedVideoFpsRanges = snapshot;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = okio.Okio.buffer(new okio.ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws java.io.IOException {
                    this.getHighSpeedVideoFpsRanges.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null) {
                return okhttp3.MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getGetHighResolutionOutputSizeshNQ4ISI() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            if (str != null) {
                return okhttp3.internal._UtilCommonKt.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0014*\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019*\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0010*\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001f"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "key", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lokio/BufferedSource;", "source", "", "readInt$okhttp", "(Lokio/BufferedSource;)I", "Lokhttp3/Response;", "cachedResponse", "Lokhttp3/Headers;", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lokhttp3/Headers;)Ljava/util/Set;", "varyHeaders", "(Lokhttp3/Response;)Lokhttp3/Headers;", "VERSION", com.visa.cbp.getEncExpo.warmup, "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String key(okhttp3.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return okio.ByteString.INSTANCE.encodeUtf8(url.toString()).md5().hex();
        }

        public final int readInt$okhttp(okio.BufferedSource source) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            try {
                long readDecimalLong = source.readDecimalLong();
                java.lang.String readUtf8LineStrict = source.readUtf8LineStrict();
                if (readDecimalLong >= 0 && readDecimalLong <= androidx.collection.SieveCacheKt.NodeLinkMask && readUtf8LineStrict.length() <= 0) {
                    return (int) readDecimalLong;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("expected an int but was \"");
                sb.append(readDecimalLong);
                sb.append(readUtf8LineStrict);
                sb.append('\"');
                throw new java.io.IOException(sb.toString());
            } catch (java.lang.NumberFormatException e) {
                throw new java.io.IOException(e.getMessage());
            }
        }

        public final boolean varyMatches(okhttp3.Response cachedResponse, okhttp3.Headers cachedRequest, okhttp3.Request newRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedResponse, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newRequest, "");
            java.util.Set<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cachedResponse.headers());
            if ((highResolutionOutputSizeshNQ4ISI instanceof java.util.Collection) && highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                return true;
            }
            for (java.lang.String str : highResolutionOutputSizeshNQ4ISI) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean hasVaryAll(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return getHighResolutionOutputSizeshNQ4ISI(response.headers()).contains("*");
        }

        private static java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(okhttp3.Headers headers) {
            int size = headers.size();
            java.util.TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.VARY, headers.name(i), true)) {
                    java.lang.String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new java.util.TreeSet(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
                    }
                    java.util.Iterator it = kotlin.text.StringsKt.split$default((java.lang.CharSequence) value, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA}, false, 0, 6, (java.lang.Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? kotlin.collections.SetsKt.emptySet() : treeSet;
        }

        public final okhttp3.Headers varyHeaders(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            okhttp3.Response networkResponse = response.networkResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNull(networkResponse);
            okhttp3.Headers headers = networkResponse.request().headers();
            java.util.Set<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(response.headers());
            if (highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                return okhttp3.Headers.EMPTY;
            }
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                java.lang.String name2 = headers.name(i);
                if (highResolutionOutputSizeshNQ4ISI.contains(name2)) {
                    builder.add(name2, headers.value(i));
                }
            }
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String key(okhttp3.HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }
}
