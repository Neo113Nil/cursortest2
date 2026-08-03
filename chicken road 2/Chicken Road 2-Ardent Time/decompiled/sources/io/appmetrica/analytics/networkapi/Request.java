package io.appmetrica.analytics.networkapi;

/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7340a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.networkapi.Request.Method f7341b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7342c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.Map f7343d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f7344a;

        /* renamed from: b, reason: collision with root package name */
        private io.appmetrica.analytics.networkapi.Request.Method f7345b = io.appmetrica.analytics.networkapi.Request.Method.GET;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f7346c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        private final java.util.LinkedHashMap f7347d = new java.util.LinkedHashMap();

        public Builder(java.lang.String str) {
            this.f7344a = str;
        }

        public final io.appmetrica.analytics.networkapi.Request.Builder addHeader(java.lang.String str, java.lang.String str2) {
            this.f7347d.put(str, str2);
            return this;
        }

        public final io.appmetrica.analytics.networkapi.Request build() {
            return new io.appmetrica.analytics.networkapi.Request(this.f7344a, this.f7345b, this.f7346c, i1.AbstractC0202u.K(this.f7347d), null);
        }

        public final io.appmetrica.analytics.networkapi.Request.Builder withBody(byte[] bArr) {
            this.f7346c = bArr;
            return this;
        }

        public final io.appmetrica.analytics.networkapi.Request.Builder withMethod(io.appmetrica.analytics.networkapi.Request.Method method) {
            this.f7345b = method;
            return this;
        }
    }

    public enum Method {
        GET("GET"),
        POST("POST");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f7349a;

        Method(java.lang.String str) {
            this.f7349a = str;
        }

        public final java.lang.String getMethodName() {
            return this.f7349a;
        }
    }

    public /* synthetic */ Request(java.lang.String str, io.appmetrica.analytics.networkapi.Request.Method method, byte[] bArr, java.util.Map map, kotlin.jvm.internal.e eVar) {
        this(str, method, bArr, map);
    }

    public final byte[] getBody() {
        return this.f7342c;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.f7343d;
    }

    public final io.appmetrica.analytics.networkapi.Request.Method getMethod() {
        return this.f7341b;
    }

    public final java.lang.String getUrl() {
        return this.f7340a;
    }

    public java.lang.String toString() {
        return "Request(url='" + this.f7340a + "', method='" + this.f7341b + "', bodyLength=" + this.f7342c.length + ", headers=" + this.f7343d + ')';
    }

    private Request(java.lang.String str, io.appmetrica.analytics.networkapi.Request.Method method, byte[] bArr, java.util.Map map) {
        this.f7340a = str;
        this.f7341b = method;
        this.f7342c = bArr;
        this.f7343d = map;
    }
}
