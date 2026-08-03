package io.appmetrica.analytics.network.impl;

/* loaded from: classes.dex */
public final class c extends io.appmetrica.analytics.networkapi.NetworkClient.Builder {
    public final io.appmetrica.analytics.network.impl.b a() {
        return new io.appmetrica.analytics.network.impl.b(getSettings());
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public final io.appmetrica.analytics.networkapi.NetworkClient build() {
        return new io.appmetrica.analytics.network.impl.b(getSettings());
    }

    public final java.lang.String toString() {
        return "Dummy Network Client Builder";
    }
}
