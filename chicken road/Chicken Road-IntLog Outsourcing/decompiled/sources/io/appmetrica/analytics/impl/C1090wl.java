package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090wl implements SimpleNetworkApi {

    /* renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f9551a = new CacheControlHttpsConnectionPerformer(((El) C1027ua.k().A()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f9551a.performConnection(str, new C0813m3(networkClientWithCacheControl));
    }
}
