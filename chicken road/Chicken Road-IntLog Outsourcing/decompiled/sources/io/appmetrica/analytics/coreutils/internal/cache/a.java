package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f6246a;

    public a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f6246a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILastKnownUpdater iLastKnownUpdater;
        iLastKnownUpdater = this.f6246a.f6242b;
        iLastKnownUpdater.updateLastKnown();
    }
}
