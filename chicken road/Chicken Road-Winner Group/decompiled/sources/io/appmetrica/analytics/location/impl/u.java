package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* loaded from: classes.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8772a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f8773b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f8774c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8775d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f8772a = context;
        this.f8773b = permissionResolutionStrategy;
        this.f8774c = locationListener;
        this.f8775d = str;
    }

    public final Context a() {
        return this.f8772a;
    }

    public final LocationListener b() {
        return this.f8774c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f8773b;
    }

    public final String d() {
        return this.f8775d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        if (this.f8773b.hasNecessaryPermissions(this.f8772a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8772a, "location", "getting last known location for provider " + this.f8775d, "location manager", new F1.b(0, this));
            if (location != null) {
                this.f8774c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f8775d);
    }
}
