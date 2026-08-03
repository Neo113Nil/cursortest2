package io.appmetrica.analytics.networkapi;

/* loaded from: classes.dex */
public final class NetworkClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f7328a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f7329b;

    /* renamed from: c, reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f7330c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Boolean f7331d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Boolean f7332e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7333f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.Integer f7334a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Integer f7335b;

        /* renamed from: c, reason: collision with root package name */
        private javax.net.ssl.SSLSocketFactory f7336c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Boolean f7337d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Boolean f7338e;

        /* renamed from: f, reason: collision with root package name */
        private int f7339f = Integer.MAX_VALUE;

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings build() {
            return new io.appmetrica.analytics.networkapi.NetworkClientSettings(this.f7334a, this.f7335b, this.f7336c, this.f7337d, this.f7338e, this.f7339f, null);
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withConnectTimeout(int i2) {
            this.f7334a = java.lang.Integer.valueOf(i2);
            return this;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withInstanceFollowRedirects(boolean z2) {
            this.f7338e = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withMaxResponseSize(int i2) {
            this.f7339f = i2;
            return this;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withReadTimeout(int i2) {
            this.f7335b = java.lang.Integer.valueOf(i2);
            return this;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withSslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            this.f7336c = sSLSocketFactory;
            return this;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withUseCaches(boolean z2) {
            this.f7337d = java.lang.Boolean.valueOf(z2);
            return this;
        }
    }

    public /* synthetic */ NetworkClientSettings(java.lang.Integer num, java.lang.Integer num2, javax.net.ssl.SSLSocketFactory sSLSocketFactory, java.lang.Boolean bool, java.lang.Boolean bool2, int i2, kotlin.jvm.internal.e eVar) {
        this(num, num2, sSLSocketFactory, bool, bool2, i2);
    }

    public final java.lang.Integer getConnectTimeout() {
        return this.f7328a;
    }

    public final java.lang.Boolean getInstanceFollowRedirects() {
        return this.f7332e;
    }

    public final int getMaxResponseSize() {
        return this.f7333f;
    }

    public final java.lang.Integer getReadTimeout() {
        return this.f7329b;
    }

    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.f7330c;
    }

    public final java.lang.Boolean getUseCaches() {
        return this.f7331d;
    }

    public java.lang.String toString() {
        return "NetworkClientSettings(connectTimeout=" + this.f7328a + ", readTimeout=" + this.f7329b + ", sslSocketFactory=" + this.f7330c + ", useCaches=" + this.f7331d + ", instanceFollowRedirects=" + this.f7332e + ", maxResponseSize=" + this.f7333f + ')';
    }

    private NetworkClientSettings(java.lang.Integer num, java.lang.Integer num2, javax.net.ssl.SSLSocketFactory sSLSocketFactory, java.lang.Boolean bool, java.lang.Boolean bool2, int i2) {
        this.f7328a = num;
        this.f7329b = num2;
        this.f7330c = sSLSocketFactory;
        this.f7331d = bool;
        this.f7332e = bool2;
        this.f7333f = i2;
    }
}
