package io.appmetrica.analytics.gpllibrary.internal;

/* loaded from: classes.dex */
class GplLocationCallback extends com.google.android.gms.location.LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    private final android.location.LocationListener f3856a;

    public GplLocationCallback(android.location.LocationListener locationListener) {
        this.f3856a = locationListener;
    }

    public void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
        this.f3856a.onLocationChanged(locationResult.getLastLocation());
    }
}
