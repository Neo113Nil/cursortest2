package w1;

import android.location.Location;
import android.location.LocationManager;

/* loaded from: classes.dex */
public final class T extends G2 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17532A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17533B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17534C;

    /* renamed from: D, reason: collision with root package name */
    public Location f17535D;

    @Override // w1.G2
    public final void i(I2 i22) {
        super.i(i22);
        d(new com.flurry.android.marketing.messaging.notification.b(5, this, i22));
    }

    public final Location j() {
        if (this.f17532A && this.f17534C) {
            if (!AbstractC1706i0.l("android.permission.ACCESS_FINE_LOCATION") && !AbstractC1706i0.l("android.permission.ACCESS_COARSE_LOCATION")) {
                this.f17533B = false;
                return null;
            }
            String str = AbstractC1706i0.l("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
            this.f17533B = true;
            LocationManager locationManager = (LocationManager) AbstractC1707i1.f17743c.getSystemService("location");
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
        }
        return null;
    }
}
