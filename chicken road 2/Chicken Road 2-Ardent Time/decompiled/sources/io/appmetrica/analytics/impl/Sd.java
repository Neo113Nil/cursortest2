package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sd implements io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0348f5 f4964a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4965b = new io.appmetrica.analytics.impl.C0290co().a();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0700sl f4966c = new io.appmetrica.analytics.impl.C0700sl();

    public Sd(android.content.Context context) {
        this.f4964a = new io.appmetrica.analytics.impl.C0348f5(new io.appmetrica.analytics.impl.C0607p5(context), new io.appmetrica.analytics.impl.C0620pi(io.appmetrica.analytics.impl.C0560na.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy getExecutionPolicy() {
        return this.f4964a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi getNetworkApi() {
        return this.f4966c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return io.appmetrica.analytics.impl.C0560na.f6484I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final java.lang.String getUserAgent() {
        return this.f4965b;
    }
}
