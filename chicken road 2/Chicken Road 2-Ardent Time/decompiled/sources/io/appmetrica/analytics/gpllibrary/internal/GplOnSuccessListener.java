package io.appmetrica.analytics.gpllibrary.internal;

/* loaded from: classes.dex */
class GplOnSuccessListener implements D0.b {

    /* renamed from: a, reason: collision with root package name */
    private final android.location.LocationListener f3857a;

    public GplOnSuccessListener(android.location.LocationListener locationListener) {
        this.f3857a = locationListener;
    }

    @Override // D0.b
    public void onSuccess(android.location.Location location) {
        this.f3857a.onLocationChanged(location);
    }
}
