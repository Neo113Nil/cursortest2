package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class k implements io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater, io.appmetrica.analytics.locationapi.internal.LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7219a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor f7220b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.p f7221c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f7222d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.n f7223e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler f7224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7225g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f7226h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f7227i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public android.location.Location f7228j;

    public k(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, io.appmetrica.analytics.location.impl.p pVar) {
        this.f7219a = context;
        this.f7221c = pVar;
        this.f7220b = permissionExtractor;
        this.f7222d = iHandlerExecutor;
        this.f7223e = new io.appmetrica.analytics.location.impl.n(pVar);
        io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f7224f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized android.location.Location a() {
        return (android.location.Location) this.f7221c.f7239b.getData();
    }

    public final synchronized void b(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7226h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized android.location.Location c() {
        android.location.Location location;
        location = this.f7228j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f7224f.startUpdates();
            java.util.Iterator it = this.f7227i.values().iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.locationapi.internal.LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f7224f.stopUpdates();
        java.util.Iterator it = this.f7227i.values().iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.locationapi.internal.LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f7225g) {
            this.f7225g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f7225g) {
            this.f7225g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        java.util.Iterator it = this.f7226h.values().iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        io.appmetrica.analytics.locationapi.internal.LocationReceiver locationReceiver = (io.appmetrica.analytics.locationapi.internal.LocationReceiver) this.f7227i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f7225g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(io.appmetrica.analytics.location.impl.i iVar) {
        this.f7222d.execute(new io.appmetrica.analytics.location.impl.j(this, iVar));
    }

    public final synchronized void a(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f7219a, this.f7220b, this.f7222d, this.f7223e);
        this.f7226h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f7225g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized android.location.Location b() {
        return this.f7228j;
    }

    public final synchronized void a(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        try {
            io.appmetrica.analytics.locationapi.internal.LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f7219a, this.f7220b, this.f7222d, this.f7223e);
            io.appmetrica.analytics.locationapi.internal.LocationReceiver locationReceiver2 = (io.appmetrica.analytics.locationapi.internal.LocationReceiver) this.f7227i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f7225g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(android.location.Location location) {
        if (location != null) {
            this.f7228j = location;
        }
    }
}
