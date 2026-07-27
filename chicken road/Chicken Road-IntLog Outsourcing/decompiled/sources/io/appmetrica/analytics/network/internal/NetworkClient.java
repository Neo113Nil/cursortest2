package io.appmetrica.analytics.network.internal;

import B0.o;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f9815a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f9816b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f9817c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f9818d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f9819e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9820f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f9821a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f9822b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f9823c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f9824d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f9825e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f9826f;

        public NetworkClient build() {
            return new NetworkClient(this.f9821a, this.f9822b, this.f9823c, this.f9824d, this.f9825e, this.f9826f, 0);
        }

        public Builder withConnectTimeout(int i2) {
            this.f9821a = Integer.valueOf(i2);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z) {
            this.f9825e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxResponseSize(int i2) {
            this.f9826f = Integer.valueOf(i2);
            return this;
        }

        public Builder withReadTimeout(int i2) {
            this.f9822b = Integer.valueOf(i2);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f9823c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z) {
            this.f9824d = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i2) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f9815a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f9819e;
    }

    public int getMaxResponseSize() {
        return this.f9820f;
    }

    public Integer getReadTimeout() {
        return this.f9816b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f9817c;
    }

    public Boolean getUseCaches() {
        return this.f9818d;
    }

    public Call newCall(Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkClient{connectTimeout=");
        sb.append(this.f9815a);
        sb.append(", readTimeout=");
        sb.append(this.f9816b);
        sb.append(", sslSocketFactory=");
        sb.append(this.f9817c);
        sb.append(", useCaches=");
        sb.append(this.f9818d);
        sb.append(", instanceFollowRedirects=");
        sb.append(this.f9819e);
        sb.append(", maxResponseSize=");
        return o.k(sb, this.f9820f, '}');
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f9815a = num;
        this.f9816b = num2;
        this.f9817c = sSLSocketFactory;
        this.f9818d = bool;
        this.f9819e = bool2;
        this.f9820f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
