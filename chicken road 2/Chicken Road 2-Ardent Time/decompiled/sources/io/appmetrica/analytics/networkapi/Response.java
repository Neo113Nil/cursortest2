package io.appmetrica.analytics.networkapi;

/* loaded from: classes.dex */
public final class Response {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7350a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7351b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7352c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.Map f7353d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Throwable f7354e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f7355f;

    public /* synthetic */ Response(boolean z2, int i2, byte[] bArr, java.util.Map map, java.lang.Throwable th, java.lang.String str, kotlin.jvm.internal.e eVar) {
        this(z2, i2, bArr, map, th, str);
    }

    public final int getCode() {
        return this.f7351b;
    }

    public final java.lang.Throwable getException() {
        return this.f7354e;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.f7353d;
    }

    public final byte[] getResponseData() {
        return this.f7352c;
    }

    public final java.lang.String getUrl() {
        return this.f7355f;
    }

    public final boolean isCompleted() {
        return this.f7350a;
    }

    public java.lang.String toString() {
        return "Response(isCompleted=" + this.f7350a + ", code=" + this.f7351b + ", responseDataLength=" + this.f7352c.length + ", headers=" + this.f7353d + ", exception=" + this.f7354e + ", url=" + this.f7355f + ')';
    }

    private Response(boolean z2, int i2, byte[] bArr, java.util.Map map, java.lang.Throwable th, java.lang.String str) {
        this.f7350a = z2;
        this.f7351b = i2;
        this.f7352c = bArr;
        this.f7353d = map;
        this.f7354e = th;
        this.f7355f = str;
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f7356a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7357b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7358c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.Throwable f7359d;

        /* renamed from: e, reason: collision with root package name */
        private java.util.Map f7360e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f7361f;

        private Builder(boolean z2, int i2, byte[] bArr, java.lang.Throwable th) {
            this.f7356a = z2;
            this.f7357b = i2;
            this.f7358c = bArr;
            this.f7359d = th;
            this.f7360e = i1.C0200s.f3326a;
        }

        public final io.appmetrica.analytics.networkapi.Response build() {
            return new io.appmetrica.analytics.networkapi.Response(this.f7356a, this.f7357b, this.f7358c, this.f7360e, this.f7359d, this.f7361f, null);
        }

        public final io.appmetrica.analytics.networkapi.Response.Builder withHeaders(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
            this.f7360e = i1.AbstractC0202u.K(map);
            return this;
        }

        public final io.appmetrica.analytics.networkapi.Response.Builder withUrl(java.lang.String str) {
            this.f7361f = str;
            return this;
        }

        public Builder(java.lang.Throwable th) {
            this(false, 0, new byte[0], th);
        }

        public Builder(boolean z2, int i2, byte[] bArr) {
            this(z2, i2, bArr, null);
        }
    }
}
