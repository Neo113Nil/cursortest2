package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f9704b;

    public j(k kVar, i iVar) {
        this.f9704b = kVar;
        this.f9703a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f9704b.f9707c;
        i iVar = this.f9703a;
        pVar.f9724a = iVar;
        CacheArguments cacheArguments = iVar.f9702b;
        pVar.f9725b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
