package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public class u implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7252a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy f7253b;

    /* renamed from: c, reason: collision with root package name */
    public final android.location.LocationListener f7254c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f7255d;

    public u(android.content.Context context, io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy permissionResolutionStrategy, android.location.LocationListener locationListener, java.lang.String str) {
        this.f7252a = context;
        this.f7253b = permissionResolutionStrategy;
        this.f7254c = locationListener;
        this.f7255d = str;
    }

    public final android.content.Context a() {
        return this.f7252a;
    }

    public final android.location.LocationListener b() {
        return this.f7254c;
    }

    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy c() {
        return this.f7253b;
    }

    public final java.lang.String d() {
        return this.f7255d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @android.annotation.SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f7253b.hasNecessaryPermissions(this.f7252a)) {
            android.location.Location location = (android.location.Location) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceByNameSafely(this.f7252a, "location", "getting last known location for provider " + this.f7255d, "location manager", new E0.a(2, this));
            if (location != null) {
                this.f7254c.onLocationChanged(location);
            }
        }
    }

    public static final android.location.Location a(io.appmetrica.analytics.location.impl.u uVar, android.location.LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f7255d);
    }
}
