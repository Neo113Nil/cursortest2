package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler f3743a;

    public a(io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f3743a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater iLastKnownUpdater;
        iLastKnownUpdater = this.f3743a.f3739b;
        iLastKnownUpdater.updateLastKnown();
    }
}
