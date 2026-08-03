package androidx.core.location;

/* loaded from: classes.dex */
public interface LocationListenerCompat extends android.location.LocationListener {
    @Override // android.location.LocationListener
    void onFlushComplete(int i);

    @Override // android.location.LocationListener
    void onLocationChanged(java.util.List<android.location.Location> list);

    @Override // android.location.LocationListener
    void onProviderDisabled(java.lang.String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(java.lang.String str);

    @Override // android.location.LocationListener
    void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle);

    /* renamed from: androidx.core.location.LocationListenerCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onFlushComplete(androidx.core.location.LocationListenerCompat _this, int i) {
        }

        public static void $default$onProviderDisabled(androidx.core.location.LocationListenerCompat _this, java.lang.String str) {
        }

        public static void $default$onProviderEnabled(androidx.core.location.LocationListenerCompat _this, java.lang.String str) {
        }

        public static void $default$onStatusChanged(androidx.core.location.LocationListenerCompat _this, java.lang.String str, int i, android.os.Bundle bundle) {
        }

        public static void $default$onLocationChanged(androidx.core.location.LocationListenerCompat _this, java.util.List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                _this.onLocationChanged((android.location.Location) list.get(i));
            }
        }
    }
}
