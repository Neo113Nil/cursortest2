package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ub implements io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy, io.appmetrica.analytics.locationapi.internal.LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Tb f5068b = new io.appmetrica.analytics.impl.Tb();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f5069c = i1.AbstractC0191j.H("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5070a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(java.lang.String str) {
        if (f5069c.contains(str)) {
            return !this.f5070a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f5070a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f5070a = false;
    }

    public final java.lang.String toString() {
        return "LocationFlagStrategy(enabled=" + this.f5070a + ", locationPermissions=" + f5069c + ')';
    }
}
