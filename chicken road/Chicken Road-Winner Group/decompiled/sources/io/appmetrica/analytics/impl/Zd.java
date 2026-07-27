package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* loaded from: classes.dex */
public final class Zd implements ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0666m5 f6903a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6904b = new C0478eo().a();

    /* renamed from: c, reason: collision with root package name */
    public final C0941wl f6905c = new C0941wl();

    public Zd(Context context) {
        this.f6903a = new C0666m5(new C0925w5(context), new C0886ui(C0878ua.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f6903a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f6905c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C0878ua.f8414H.A();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f6904b;
    }
}
