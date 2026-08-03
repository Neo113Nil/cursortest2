package coil.network;

/* compiled from: CacheStrategy.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcoil/network/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lcoil/network/CacheResponse;", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "getNetworkRequest", "()Lokhttp3/Request;", "getCacheResponse", "()Lcoil/network/CacheResponse;", "Factory", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.network.CacheStrategy.Companion INSTANCE = new coil.network.CacheStrategy.Companion(null);
    private final coil.network.CacheResponse cacheResponse;
    private final okhttp3.Request networkRequest;

    public /* synthetic */ CacheStrategy(okhttp3.Request request, coil.network.CacheResponse cacheResponse, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cacheResponse);
    }

    private CacheStrategy(okhttp3.Request request, coil.network.CacheResponse cacheResponse) {
        this.networkRequest = request;
        this.cacheResponse = cacheResponse;
    }

    public final okhttp3.Request getNetworkRequest() {
        return this.networkRequest;
    }

    public final coil.network.CacheResponse getCacheResponse() {
        return this.cacheResponse;
    }

    /* compiled from: CacheStrategy.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcoil/network/CacheStrategy$Factory;", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lcoil/network/CacheResponse;", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "servedDate", "Ljava/util/Date;", "servedDateString", "", "lastModified", "lastModifiedString", "expires", "sentRequestMillis", "", "receivedResponseMillis", "etag", "ageSeconds", "", "compute", "Lcoil/network/CacheStrategy;", "computeFreshnessLifetime", "cacheResponseAge", "hasConditions", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory {
        private int ageSeconds;
        private final coil.network.CacheResponse cacheResponse;
        private java.lang.String etag;
        private java.util.Date expires;
        private java.util.Date lastModified;
        private java.lang.String lastModifiedString;
        private long receivedResponseMillis;
        private final okhttp3.Request request;
        private long sentRequestMillis;
        private java.util.Date servedDate;
        private java.lang.String servedDateString;

        public Factory(okhttp3.Request request, coil.network.CacheResponse cacheResponse) {
            this.request = request;
            this.cacheResponse = cacheResponse;
            this.ageSeconds = -1;
            if (cacheResponse != null) {
                this.sentRequestMillis = cacheResponse.getSentRequestAtMillis();
                this.receivedResponseMillis = cacheResponse.getReceivedResponseAtMillis();
                okhttp3.Headers responseHeaders = cacheResponse.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i = 0; i < size; i++) {
                    java.lang.String name = responseHeaders.name(i);
                    if (kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.DATE, true)) {
                        this.servedDate = responseHeaders.getDate(com.google.common.net.HttpHeaders.DATE);
                        this.servedDateString = responseHeaders.value(i);
                    } else if (kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.EXPIRES, true)) {
                        this.expires = responseHeaders.getDate(com.google.common.net.HttpHeaders.EXPIRES);
                    } else if (kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.LAST_MODIFIED, true)) {
                        this.lastModified = responseHeaders.getDate(com.google.common.net.HttpHeaders.LAST_MODIFIED);
                        this.lastModifiedString = responseHeaders.value(i);
                    } else if (kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.ETAG, true)) {
                        this.etag = responseHeaders.value(i);
                    } else if (kotlin.text.StringsKt.equals(name, com.google.common.net.HttpHeaders.AGE, true)) {
                        this.ageSeconds = coil.util.Utils.toNonNegativeInt(responseHeaders.value(i), -1);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final coil.network.CacheStrategy compute() {
            java.lang.String str;
            coil.network.CacheResponse cacheResponse = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            java.lang.Object[] objArr5 = 0;
            java.lang.Object[] objArr6 = 0;
            java.lang.Object[] objArr7 = 0;
            java.lang.Object[] objArr8 = 0;
            java.lang.Object[] objArr9 = 0;
            java.lang.Object[] objArr10 = 0;
            java.lang.Object[] objArr11 = 0;
            java.lang.Object[] objArr12 = 0;
            if (this.cacheResponse == null) {
                return new coil.network.CacheStrategy(this.request, cacheResponse, objArr12 == true ? 1 : 0);
            }
            if (this.request.isHttps() && !this.cacheResponse.getIsTls()) {
                return new coil.network.CacheStrategy(this.request, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            okhttp3.CacheControl cacheControl = this.cacheResponse.getCacheControl();
            if (!coil.network.CacheStrategy.INSTANCE.isCacheable(this.request, this.cacheResponse)) {
                return new coil.network.CacheStrategy(this.request, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            okhttp3.CacheControl cacheControl2 = this.request.cacheControl();
            if (cacheControl2.noCache() || hasConditions(this.request)) {
                return new coil.network.CacheStrategy(this.request, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long cacheResponseAge = cacheResponseAge();
            long computeFreshnessLifetime = computeFreshnessLifetime();
            if (cacheControl2.maxAgeSeconds() != -1) {
                computeFreshnessLifetime = java.lang.Math.min(computeFreshnessLifetime, java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl2.maxAgeSeconds()));
            }
            long j = 0;
            long millis = cacheControl2.minFreshSeconds() != -1 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl2.minFreshSeconds()) : 0L;
            if (!cacheControl.mustRevalidate() && cacheControl2.maxStaleSeconds() != -1) {
                j = java.util.concurrent.TimeUnit.SECONDS.toMillis(cacheControl2.maxStaleSeconds());
            }
            if (!cacheControl.noCache() && cacheResponseAge + millis < computeFreshnessLifetime + j) {
                return new coil.network.CacheStrategy(objArr7 == true ? 1 : 0, this.cacheResponse, objArr6 == true ? 1 : 0);
            }
            java.lang.String str2 = this.etag;
            if (str2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                str = com.google.common.net.HttpHeaders.IF_NONE_MATCH;
            } else {
                java.util.Date date = this.lastModified;
                str = com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE;
                if (date != null) {
                    str2 = this.lastModifiedString;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                } else if (this.servedDate != null) {
                    str2 = this.servedDateString;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                } else {
                    return new coil.network.CacheStrategy(this.request, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                }
            }
            return new coil.network.CacheStrategy(this.request.newBuilder().addHeader(str, str2).build(), this.cacheResponse, objArr5 == true ? 1 : 0);
        }

        private final long computeFreshnessLifetime() {
            coil.network.CacheResponse cacheResponse = this.cacheResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cacheResponse);
            if (cacheResponse.getCacheControl().maxAgeSeconds() != -1) {
                return java.util.concurrent.TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            java.util.Date date = this.expires;
            if (date != null) {
                java.util.Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.request.url().query() != null) {
                return 0L;
            }
            java.util.Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            java.util.Date date4 = this.lastModified;
            kotlin.jvm.internal.Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final long cacheResponseAge() {
            java.util.Date date = this.servedDate;
            long max = date != null ? java.lang.Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            if (this.ageSeconds != -1) {
                max = java.lang.Math.max(max, java.util.concurrent.TimeUnit.SECONDS.toMillis(this.ageSeconds));
            }
            return max + (this.receivedResponseMillis - this.sentRequestMillis) + (coil.util.Time.INSTANCE.currentMillis() - this.receivedResponseMillis);
        }

        private final boolean hasConditions(okhttp3.Request request) {
            return (request.header(com.google.common.net.HttpHeaders.IF_MODIFIED_SINCE) == null && request.header(com.google.common.net.HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0013"}, d2 = {"Lcoil/network/CacheStrategy$Companion;", "", "<init>", "()V", "isCacheable", "", "request", "Lokhttp3/Request;", com.ironsource.Ve.n, "Lokhttp3/Response;", "Lcoil/network/CacheResponse;", "combineHeaders", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isEndToEnd", "name", "", "isContentSpecificHeader", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isCacheable(okhttp3.Request request, okhttp3.Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || kotlin.jvm.internal.Intrinsics.areEqual(response.headers().get(com.google.common.net.HttpHeaders.VARY), "*")) ? false : true;
        }

        public final boolean isCacheable(okhttp3.Request request, coil.network.CacheResponse response) {
            return (request.cacheControl().noStore() || response.getCacheControl().noStore() || kotlin.jvm.internal.Intrinsics.areEqual(response.getResponseHeaders().get(com.google.common.net.HttpHeaders.VARY), "*")) ? false : true;
        }

        public final okhttp3.Headers combineHeaders(okhttp3.Headers cachedHeaders, okhttp3.Headers networkHeaders) {
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            int size = cachedHeaders.size();
            for (int i = 0; i < size; i++) {
                java.lang.String name = cachedHeaders.name(i);
                java.lang.String value = cachedHeaders.value(i);
                if ((!kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.WARNING, name, true) || !kotlin.text.StringsKt.startsWith$default(value, "1", false, 2, (java.lang.Object) null)) && (isContentSpecificHeader(name) || !isEndToEnd(name) || networkHeaders.get(name) == null)) {
                    builder.addUnsafeNonAscii(name, value);
                }
            }
            int size2 = networkHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                java.lang.String name2 = networkHeaders.name(i2);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addUnsafeNonAscii(name2, networkHeaders.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isEndToEnd(java.lang.String name) {
            return (kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONNECTION, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.KEEP_ALIVE, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHENTICATE, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TE, name, true) || kotlin.text.StringsKt.equals("Trailers", name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.UPGRADE, name, true)) ? false : true;
        }

        private final boolean isContentSpecificHeader(java.lang.String name) {
            return kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONTENT_LENGTH, name, true) || kotlin.text.StringsKt.equals(com.google.common.net.HttpHeaders.CONTENT_ENCODING, name, true) || kotlin.text.StringsKt.equals("Content-Type", name, true);
        }
    }
}
