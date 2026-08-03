package io.appmetrica.analytics.networkokhttp.internal;

/* loaded from: classes.dex */
public final class OkHttpNetworkClientBuilder extends io.appmetrica.analytics.networkapi.NetworkClient.Builder {
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public io.appmetrica.analytics.networkapi.NetworkClient build() {
        return new io.appmetrica.analytics.networkokhttp.impl.e(getSettings(), null, 2, null);
    }

    public java.lang.String toString() {
        return "OkHttp Network Client Builder";
    }
}
