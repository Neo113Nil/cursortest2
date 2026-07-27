package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f8740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8741b;

    public j(k kVar, i iVar) {
        this.f8741b = kVar;
        this.f8740a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f8741b.f8744c;
        i iVar = this.f8740a;
        pVar.f8759a = iVar;
        CacheArguments cacheArguments = iVar.f8739b;
        pVar.f8760b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
