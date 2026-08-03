package io.appmetrica.analytics.networkapi;

/* loaded from: classes.dex */
public abstract class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networkapi.NetworkClientSettings f7326a;

    public static abstract class Builder {

        /* renamed from: a, reason: collision with root package name */
        private io.appmetrica.analytics.networkapi.NetworkClientSettings f7327a = new io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder().build();

        public abstract io.appmetrica.analytics.networkapi.NetworkClient build();

        public final io.appmetrica.analytics.networkapi.NetworkClientSettings getSettings() {
            return this.f7327a;
        }

        public final io.appmetrica.analytics.networkapi.NetworkClient.Builder withSettings(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
            this.f7327a = networkClientSettings;
            return this;
        }
    }

    public NetworkClient(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
        this.f7326a = networkClientSettings;
    }

    public final io.appmetrica.analytics.networkapi.NetworkClientSettings getSettings() {
        return this.f7326a;
    }

    public abstract io.appmetrica.analytics.networkapi.Call newCall(io.appmetrica.analytics.networkapi.Request request);
}
