package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class r extends io.appmetrica.analytics.location.impl.u implements io.appmetrica.analytics.locationapi.internal.LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Looper f7245e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7246f;

    public r(android.content.Context context, android.os.Looper looper, io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy permissionResolutionStrategy, android.location.LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f7245e = looper;
        this.f7246f = java.util.concurrent.TimeUnit.SECONDS.toMillis(1L);
    }

    public static final h1.C0177i a(io.appmetrica.analytics.location.impl.r rVar, android.location.LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f7255d, rVar.f7246f, 0.0f, rVar.f7254c, rVar.f7245e);
        return h1.C0177i.f3302a;
    }

    public static final h1.C0177i b(io.appmetrica.analytics.location.impl.r rVar, android.location.LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f7254c);
        return h1.C0177i.f3302a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f7253b.hasNecessaryPermissions(this.f7252a)) {
            io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f7252a, "location", B1.a.j(new java.lang.StringBuilder("request location updates for "), this.f7255d, " provider"), "location manager", new M0.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f7252a, "location", "stop location updates for passive provider", "location manager", new M0.a(this, 0));
    }
}
