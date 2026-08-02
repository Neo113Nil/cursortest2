package androidx.core.location;

/* loaded from: classes7.dex */
public final /* synthetic */ class LocationManagerCompat$$ExternalSyntheticLambda2 implements java.util.concurrent.Callable {
    public final /* synthetic */ android.location.LocationManager f$0;
    public final /* synthetic */ androidx.core.location.LocationManagerCompat.GpsStatusTransport f$1;

    public /* synthetic */ LocationManagerCompat$$ExternalSyntheticLambda2(android.location.LocationManager locationManager, androidx.core.location.LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f$0 = locationManager;
        this.f$1 = gpsStatusTransport;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Boolean valueOf;
        valueOf = java.lang.Boolean.valueOf(this.f$0.addGpsStatusListener(this.f$1));
        return valueOf;
    }
}
