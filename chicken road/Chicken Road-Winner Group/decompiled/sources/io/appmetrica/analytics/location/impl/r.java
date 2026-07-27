package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import d2.C0279i;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f8766e;
    public final long f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f8766e = looper;
        this.f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C0279i a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f8775d, rVar.f, 0.0f, rVar.f8774c, rVar.f8766e);
        return C0279i.f4852a;
    }

    public static final C0279i b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f8774c);
        return C0279i.f4852a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f8773b.hasNecessaryPermissions(this.f8772a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f8772a, "location", B0.c.l(new StringBuilder("request location updates for "), this.f8775d, " provider"), "location manager", new F1.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f8772a, "location", "stop location updates for passive provider", "location manager", new F1.a(this, 0));
    }
}
