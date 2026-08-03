package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f3738a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater f3739b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker f3740c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.cache.a f3741d = new io.appmetrica.analytics.coreutils.internal.cache.a(this);

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.cache.b f3742e = new io.appmetrica.analytics.coreutils.internal.cache.b(this);

    public LocationDataCacheUpdateScheduler(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater iLastKnownUpdater, io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker updateConditionsChecker, java.lang.String str) {
        this.f3738a = iCommonExecutor;
        this.f3739b = iLastKnownUpdater;
        this.f3740c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f3738a.remove(this.f3741d);
        this.f3738a.executeDelayed(this.f3741d, 90L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f3738a.execute(this.f3742e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f3738a.remove(this.f3741d);
        this.f3738a.remove(this.f3742e);
    }
}
