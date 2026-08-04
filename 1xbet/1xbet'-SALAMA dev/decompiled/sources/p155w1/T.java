package p155w1;

import android.location.Location;
import android.location.LocationManager;
import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: loaded from: classes.dex */
public final class T extends G2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17538A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17539B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17540C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Location f17541D;

    @Override // p155w1.G2
    public final void i(I2 i7) {
        super.i(i7);
        d(new b(5, this, i7));
    }

    public final Location j() {
        if (this.f17538A && this.f17540C) {
            if (!AbstractC0997i0.l("android.permission.ACCESS_FINE_LOCATION") && !AbstractC0997i0.l("android.permission.ACCESS_COARSE_LOCATION")) {
                this.f17539B = false;
                return null;
            }
            String str = AbstractC0997i0.l("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
            this.f17539B = true;
            LocationManager locationManager = (LocationManager) AbstractC0998i1.f17749c.getSystemService("location");
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
        }
        return null;
    }
}
