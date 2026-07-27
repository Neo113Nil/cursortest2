package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* loaded from: classes.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f6357a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f6357a = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        LocationListener locationListener = this.f6357a;
        List list = locationResult.f5311a;
        int size = list.size();
        locationListener.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }
}
