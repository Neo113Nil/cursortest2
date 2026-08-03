package com.vungle.ads.internal.network;

/* compiled from: TpatRequest.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 &2\u00020\u0001:\u0002%&Bm\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/network/TpatRequest;", "", "url", "", "method", "Lcom/vungle/ads/internal/network/HttpMethod;", "headers", "", "body", "priorityRetry", "", "priorityRetryCount", "", "regularRetry", "regularRetryCount", "tpatKey", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "(Ljava/lang/String;Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;IZILjava/lang/String;Lcom/vungle/ads/internal/util/LogEntry;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "getMethod", "()Lcom/vungle/ads/internal/network/HttpMethod;", "getPriorityRetry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPriorityRetryCount", "()I", "getRegularRetry", "()Z", "getRegularRetryCount", "getTpatKey", "getUrl", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class TpatRequest {
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;
    private final java.lang.String body;
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final com.vungle.ads.internal.util.LogEntry logEntry;
    private final com.vungle.ads.internal.network.HttpMethod method;
    private final java.lang.Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;
    private final java.lang.String tpatKey;
    private final java.lang.String url;

    public /* synthetic */ TpatRequest(java.lang.String str, com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map map, java.lang.String str2, java.lang.Boolean bool, int i, boolean z, int i2, java.lang.String str3, com.vungle.ads.internal.util.LogEntry logEntry, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, httpMethod, map, str2, bool, i, z, i2, str3, logEntry);
    }

    private TpatRequest(java.lang.String str, com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.Boolean bool, int i, boolean z, int i2, java.lang.String str3, com.vungle.ads.internal.util.LogEntry logEntry) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i;
        this.regularRetry = z;
        this.regularRetryCount = i2;
        this.tpatKey = str3;
        this.logEntry = logEntry;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final com.vungle.ads.internal.network.HttpMethod getMethod() {
        return this.method;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    public final java.lang.String getTpatKey() {
        return this.tpatKey;
    }

    public final com.vungle.ads.internal.util.LogEntry getLogEntry() {
        return this.logEntry;
    }

    /* compiled from: TpatRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0000J\u001c\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/network/TpatRequest$Builder;", "", "url", "", "(Ljava/lang/String;)V", "body", "headers", "", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "method", "Lcom/vungle/ads/internal/network/HttpMethod;", "priorityRetry", "", "Ljava/lang/Boolean;", "priorityRetryCount", "", "regularRetry", "regularRetryCount", "tpatKey", "getUrl", "()Ljava/lang/String;", "build", "Lcom/vungle/ads/internal/network/TpatRequest;", "get", "post", "withLogEntry", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private java.lang.String body;
        private java.util.Map<java.lang.String, java.lang.String> headers;
        private com.vungle.ads.internal.util.LogEntry logEntry;
        private com.vungle.ads.internal.network.HttpMethod method;
        private java.lang.Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;
        private java.lang.String tpatKey;
        private final java.lang.String url;

        public Builder(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.method = com.vungle.ads.internal.network.HttpMethod.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder get() {
            this.method = com.vungle.ads.internal.network.HttpMethod.GET;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder post() {
            this.method = com.vungle.ads.internal.network.HttpMethod.POST;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder method(com.vungle.ads.internal.network.HttpMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder headers(java.util.Map<java.lang.String, java.lang.String> headers) {
            this.headers = headers;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder body(java.lang.String body) {
            this.body = body;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder priorityRetry(boolean priorityRetry) {
            this.priorityRetry = java.lang.Boolean.valueOf(priorityRetry);
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder priorityRetryCount(int priorityRetryCount) {
            this.priorityRetryCount = priorityRetryCount;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder regularRetry(boolean regularRetry) {
            this.regularRetry = regularRetry;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder regularRetryCount(int regularRetryCount) {
            this.regularRetryCount = regularRetryCount;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder withLogEntry(com.vungle.ads.internal.util.LogEntry logEntry) {
            this.logEntry = logEntry;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest.Builder tpatKey(java.lang.String tpatKey) {
            this.tpatKey = tpatKey;
            return this;
        }

        public final com.vungle.ads.internal.network.TpatRequest build() {
            return new com.vungle.ads.internal.network.TpatRequest(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }
    }
}
