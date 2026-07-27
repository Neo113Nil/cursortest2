package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941wl implements SimpleNetworkApi {

    /* renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f8592a = new CacheControlHttpsConnectionPerformer(((El) C0878ua.k().A()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f8592a.performConnection(str, new C0664m3(networkClientWithCacheControl));
    }
}
