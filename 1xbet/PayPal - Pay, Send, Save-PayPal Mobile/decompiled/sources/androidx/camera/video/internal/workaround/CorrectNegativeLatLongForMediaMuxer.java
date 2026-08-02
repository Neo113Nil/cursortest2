package androidx.camera.video.internal.workaround;

/* loaded from: classes6.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
    }

    public static android.util.Pair<java.lang.Double, java.lang.Double> adjustGeoLocation(double d, double d2) {
        if (androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            if (d < 0.0d) {
                d = ((d * 10000.0d) - 1.0d) / 10000.0d;
            }
            if (d2 < 0.0d) {
                d2 = ((d2 * 10000.0d) - 1.0d) / 10000.0d;
            }
        }
        return android.util.Pair.create(java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2));
    }
}
