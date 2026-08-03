package io.appmetrica.analytics.network.impl;

/* loaded from: classes.dex */
public final class b extends io.appmetrica.analytics.networkapi.NetworkClient {
    public b(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
        super(networkClientSettings);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    public final io.appmetrica.analytics.networkapi.Call newCall(io.appmetrica.analytics.networkapi.Request request) {
        return new io.appmetrica.analytics.network.impl.a();
    }
}
