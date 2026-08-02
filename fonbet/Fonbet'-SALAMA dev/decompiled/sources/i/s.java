package i;

import a.AbstractC0603a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class s extends F.x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13725c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f13726d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, C1726n0 c1726n0) {
        super(vVar);
        this.f13726d = vVar;
        this.f13727e = c1726n0;
    }

    @Override // F.x
    public final IntentFilter g() {
        switch (this.f13725c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // F.x
    public final int j() {
        Location location;
        boolean z4;
        long j;
        Location location2;
        switch (this.f13725c) {
            case 0:
                return ((PowerManager) this.f13727e).isPowerSaveMode() ? 2 : 1;
            default:
                C1726n0 c1726n0 = (C1726n0) this.f13727e;
                D3.p pVar = (D3.p) c1726n0.f17807d;
                if (pVar.f1739c > System.currentTimeMillis()) {
                    z4 = pVar.f1738b;
                } else {
                    Context context = (Context) c1726n0.f17805b;
                    int g3 = AbstractC0603a.g(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c1726n0.f17806c;
                    if (g3 == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
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
                    if (AbstractC0603a.g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C1219F.f13617d == null) {
                            C1219F.f13617d = new C1219F();
                        }
                        C1219F c1219f = C1219F.f13617d;
                        c1219f.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c1219f.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z4 = c1219f.f13620c == 1;
                        long j3 = c1219f.f13619b;
                        long j7 = c1219f.f13618a;
                        c1219f.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j8 = c1219f.f13619b;
                        if (j3 == -1 || j7 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j7) {
                                j8 = currentTimeMillis > j3 ? j7 : j3;
                            }
                            j = j8 + 60000;
                        }
                        pVar.f1738b = z4;
                        pVar.f1739c = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // F.x
    public final void o() {
        switch (this.f13725c) {
            case 0:
                this.f13726d.o(true, true);
                break;
            default:
                this.f13726d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f13726d = vVar;
        this.f13727e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
