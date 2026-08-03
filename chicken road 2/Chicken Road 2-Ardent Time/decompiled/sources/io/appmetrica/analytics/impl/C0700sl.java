package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700sl implements io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer f6823a = new io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer(((io.appmetrica.analytics.impl.Al) io.appmetrica.analytics.impl.C0560na.k().z()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(java.lang.String str, io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f6823a.performConnection(str, new io.appmetrica.analytics.impl.C0320e3(networkClientWithCacheControl));
    }
}
