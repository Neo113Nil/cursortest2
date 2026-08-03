package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler f3744a;

    public b(io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f3744a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker updateConditionsChecker;
        io.appmetrica.analytics.coreutils.internal.cache.a aVar;
        io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater iLastKnownUpdater;
        updateConditionsChecker = this.f3744a.f3740c;
        if (updateConditionsChecker.shouldUpdate()) {
            aVar = this.f3744a.f3741d;
            iLastKnownUpdater = aVar.f3743a.f3739b;
            iLastKnownUpdater.updateLastKnown();
        }
    }
}
