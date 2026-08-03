package io.appmetrica.analytics.networkokhttp.impl;

/* loaded from: classes.dex */
public final class e extends io.appmetrica.analytics.networkapi.NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final I1.s f7367a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
        this(networkClientSettings, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    public final io.appmetrica.analytics.networkapi.Call newCall(io.appmetrica.analytics.networkapi.Request request) {
        return new io.appmetrica.analytics.networkokhttp.impl.c(this.f7367a, request, getSettings());
    }

    public final java.lang.String toString() {
        return "OkHttpNetworkClient(settings=" + getSettings() + ')';
    }

    public /* synthetic */ e(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings, I1.s sVar, int i2, kotlin.jvm.internal.e eVar) {
        this(networkClientSettings, (i2 & 2) != 0 ? io.appmetrica.analytics.networkokhttp.impl.d.a(networkClientSettings) : sVar);
    }

    public e(io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings, I1.s sVar) {
        super(networkClientSettings);
        this.f7367a = sVar;
    }
}
