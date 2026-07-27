package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import i1.InterfaceC0333c;

/* loaded from: classes.dex */
class GplOnSuccessListener implements InterfaceC0333c {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f5536a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f5536a = locationListener;
    }

    @Override // i1.InterfaceC0333c
    public void onSuccess(Location location) {
        this.f5536a.onLocationChanged(location);
    }
}
