package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.location.impl.i f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.location.impl.k f7218b;

    public j(io.appmetrica.analytics.location.impl.k kVar, io.appmetrica.analytics.location.impl.i iVar) {
        this.f7218b = kVar;
        this.f7217a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.location.impl.p pVar = this.f7218b.f7221c;
        io.appmetrica.analytics.location.impl.i iVar = this.f7217a;
        pVar.f7238a = iVar;
        io.appmetrica.analytics.locationapi.internal.CacheArguments cacheArguments = iVar.f7216b;
        pVar.f7239b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
