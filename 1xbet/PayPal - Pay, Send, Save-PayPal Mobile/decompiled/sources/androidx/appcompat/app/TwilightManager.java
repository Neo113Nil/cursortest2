package androidx.appcompat.app;

/* loaded from: classes3.dex */
class TwilightManager {
    private static androidx.appcompat.app.TwilightManager getHighSpeedVideoSizes;
    final android.content.Context Camera2StreamConfigurationMap;
    final androidx.appcompat.app.TwilightManager.TwilightState getHighResolutionOutputSizeshNQ4ISI = new androidx.appcompat.app.TwilightManager.TwilightState();
    private final android.location.LocationManager getHighSpeedVideoFpsRangesFor;

    static androidx.appcompat.app.TwilightManager getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        if (getHighSpeedVideoSizes == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            getHighSpeedVideoSizes = new androidx.appcompat.app.TwilightManager(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
        }
        return getHighSpeedVideoSizes;
    }

    private TwilightManager(android.content.Context context, android.location.LocationManager locationManager) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRangesFor = locationManager;
    }

    final android.location.Location Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            if (this.getHighSpeedVideoFpsRangesFor.isProviderEnabled(str)) {
                return this.getHighSpeedVideoFpsRangesFor.getLastKnownLocation(str);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static class TwilightState {
        long getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        TwilightState() {
        }
    }
}
