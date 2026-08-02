package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Calendar;

/* loaded from: classes8.dex */
final class D {

    /* renamed from: d, reason: collision with root package name */
    private static D f37069d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f37070a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f37071b;

    /* renamed from: c, reason: collision with root package name */
    private final a f37072c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f37073a;

        /* renamed from: b, reason: collision with root package name */
        long f37074b;
    }

    D(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f37070a = context;
        this.f37071b = locationManager;
    }

    static D a(@NonNull Context context) {
        if (f37069d == null) {
            Context applicationContext = context.getApplicationContext();
            f37069d = new D(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f37069d;
    }

    final boolean b() {
        Location location;
        long j11;
        Location location2;
        a aVar = this.f37072c;
        if (aVar.f37074b > System.currentTimeMillis()) {
            return aVar.f37073a;
        }
        Context context = this.f37070a;
        int a11 = androidx.core.content.e.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationManager locationManager = this.f37071b;
        Location location3 = null;
        if (a11 == 0) {
            try {
            } catch (Exception e11) {
                Log.d("TwilightManager", "Failed to get last known location", e11);
            }
            if (locationManager.isProviderEnabled("network")) {
                location2 = locationManager.getLastKnownLocation("network");
                location = location2;
            }
            location2 = null;
            location = location2;
        } else {
            location = null;
        }
        if (androidx.core.content.e.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    location3 = locationManager.getLastKnownLocation("gps");
                }
            } catch (Exception e12) {
                Log.d("TwilightManager", "Failed to get last known location", e12);
            }
        }
        if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
            location = location3;
        }
        if (location == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i11 = Calendar.getInstance().get(11);
            return i11 < 6 || i11 >= 22;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C b11 = C.b();
        b11.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
        b11.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
        boolean z11 = b11.f37068c == 1;
        long j12 = b11.f37067b;
        long j13 = b11.f37066a;
        b11.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
        long j14 = b11.f37067b;
        if (j12 == -1 || j13 == -1) {
            j11 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j13) {
                j12 = j14;
            } else if (currentTimeMillis > j12) {
                j12 = j13;
            }
            j11 = j12 + 60000;
        }
        aVar.f37073a = z11;
        aVar.f37074b = j11;
        return z11;
    }
}
