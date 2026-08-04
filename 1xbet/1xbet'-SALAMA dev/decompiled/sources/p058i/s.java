package p058i;

import D3.p;
import F.x;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import p003a.a;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13731c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f13732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, C1017n0 c1017n0) {
        super(vVar);
        this.f13732d = vVar;
        this.f13733e = c1017n0;
    }

    @Override // F.x
    public final IntentFilter g() {
        switch (this.f13731c) {
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
        Location lastKnownLocation;
        switch (this.f13731c) {
            case 0:
                return ((PowerManager) this.f13733e).isPowerSaveMode() ? 2 : 1;
            default:
                C1017n0 c1017n0 = (C1017n0) this.f13733e;
                p pVar = (p) c1017n0.f17813d;
                if (pVar.f1739c <= System.currentTimeMillis()) {
                    Context context = (Context) c1017n0.f17811b;
                    int iG = a.g(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) c1017n0.f17812c;
                    if (iG == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (a.g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z4 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (F.f13623d == null) {
                            F.f13623d = new F();
                        }
                        F f7 = F.f13623d;
                        f7.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        f7.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z4 = f7.f13626c == 1;
                        long j3 = f7.f13625b;
                        long j7 = f7.f13624a;
                        f7.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j8 = f7.f13625b;
                        if (j3 == -1 || j7 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j7) {
                                j8 = jCurrentTimeMillis > j3 ? j7 : j3;
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
                    break;
                } else {
                    z4 = pVar.f1738b;
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // F.x
    public final void o() throws IllegalAccessException {
        switch (this.f13731c) {
            case 0:
                this.f13732d.o(true, true);
                break;
            default:
                this.f13732d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f13732d = vVar;
        this.f13733e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
