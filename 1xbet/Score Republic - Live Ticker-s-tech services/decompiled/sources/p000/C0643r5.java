package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0643r5 extends AbstractC0717t5 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f6710l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f6711m;

    /* JADX INFO: renamed from: n */
    public final Object f6712n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643r5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, Context context) {
        super(layoutInflaterFactory2C0828w5);
        this.f6711m = layoutInflaterFactory2C0828w5;
        this.f6712n = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p000.AbstractC0717t5
    /* JADX INFO: renamed from: d */
    public final IntentFilter mo4245d() {
        switch (this.f6710l) {
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

    @Override // p000.AbstractC0717t5
    /* JADX INFO: renamed from: e */
    public final int mo4246e() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.f6710l;
        Object obj = this.f6712n;
        switch (i) {
            case 0:
                return AbstractC0458m5.m3325a((PowerManager) obj) ? 2 : 1;
            default:
                oq0 oq0Var = (oq0) obj;
                c31 c31Var = (c31) oq0Var.f5842m;
                LocationManager locationManager = (LocationManager) oq0Var.f5841l;
                if (c31Var.f1081b <= System.currentTimeMillis()) {
                    Context context = (Context) oq0Var.f5840k;
                    Location lastKnownLocation2 = null;
                    if (n80.m3492a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (n80.m3492a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (we1.f8524d == null) {
                            we1.f8524d = new we1();
                        }
                        we1 we1Var = we1.f8524d;
                        we1Var.m5322a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        we1Var.m5322a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = we1Var.f8527c == 1;
                        long j2 = we1Var.f8526b;
                        long j3 = we1Var.f8525a;
                        we1Var.m5322a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = we1Var.f8526b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        c31Var.f1080a = z;
                        c31Var.f1081b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = c31Var.f1080a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // p000.AbstractC0717t5
    /* JADX INFO: renamed from: g */
    public final void mo4247g() {
        int i = this.f6710l;
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f6711m;
        switch (i) {
            case 0:
                layoutInflaterFactory2C0828w5.m5245m(true, true);
                break;
            default:
                layoutInflaterFactory2C0828w5.m5245m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643r5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, oq0 oq0Var) {
        super(layoutInflaterFactory2C0828w5);
        this.f6711m = layoutInflaterFactory2C0828w5;
        this.f6712n = oq0Var;
    }
}
