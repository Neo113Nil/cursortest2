package androidx.core.location;

import android.location.LocationManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class b {

    private static class a {
        static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    static {
        new WeakHashMap();
    }

    public static boolean a(@NonNull LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? a.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
