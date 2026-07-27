package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389bc implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final C0363ac f7039b = new C0363ac();

    /* renamed from: c, reason: collision with root package name */
    public static final List f7040c = AbstractC0293h.S("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7041a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f7040c.contains(str)) {
            return !this.f7041a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f7041a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f7041a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f7041a + ", locationPermissions=" + f7040c + ')';
    }
}
