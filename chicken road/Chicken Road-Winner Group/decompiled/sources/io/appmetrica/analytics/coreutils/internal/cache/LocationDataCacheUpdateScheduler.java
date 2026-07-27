package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f5421a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f5422b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f5423c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5424d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f5425e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f5421a = iCommonExecutor;
        this.f5422b = iLastKnownUpdater;
        this.f5423c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f5421a.remove(this.f5424d);
        this.f5421a.executeDelayed(this.f5424d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f5421a.execute(this.f5425e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f5421a.remove(this.f5424d);
        this.f5421a.remove(this.f5425e);
    }
}
