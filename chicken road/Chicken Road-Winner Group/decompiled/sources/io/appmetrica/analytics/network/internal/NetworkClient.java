package io.appmetrica.analytics.network.internal;

import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8844a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8845b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f8846c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f8847d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f8848e;
    private final int f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f8849a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f8850b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f8851c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f8852d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f8853e;
        private Integer f;

        public NetworkClient build() {
            return new NetworkClient(this.f8849a, this.f8850b, this.f8851c, this.f8852d, this.f8853e, this.f, 0);
        }

        public Builder withConnectTimeout(int i3) {
            this.f8849a = Integer.valueOf(i3);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z3) {
            this.f8853e = Boolean.valueOf(z3);
            return this;
        }

        public Builder withMaxResponseSize(int i3) {
            this.f = Integer.valueOf(i3);
            return this;
        }

        public Builder withReadTimeout(int i3) {
            this.f8850b = Integer.valueOf(i3);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f8851c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z3) {
            this.f8852d = Boolean.valueOf(z3);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i3) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f8844a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f8848e;
    }

    public int getMaxResponseSize() {
        return this.f;
    }

    public Integer getReadTimeout() {
        return this.f8845b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f8846c;
    }

    public Boolean getUseCaches() {
        return this.f8847d;
    }

    public Call newCall(Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f8844a + ", readTimeout=" + this.f8845b + ", sslSocketFactory=" + this.f8846c + ", useCaches=" + this.f8847d + ", instanceFollowRedirects=" + this.f8848e + ", maxResponseSize=" + this.f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f8844a = num;
        this.f8845b = num2;
        this.f8846c = sSLSocketFactory;
        this.f8847d = bool;
        this.f8848e = bool2;
        this.f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
