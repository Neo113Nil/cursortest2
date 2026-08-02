package androidx.media3.common;

/* loaded from: classes7.dex */
public final class MediaLibraryInfo {
    public static final java.lang.String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final java.lang.String VERSION = "1.9.0";
    public static final int VERSION_INT = 1009000300;
    public static final java.lang.String VERSION_SLASHY = "AndroidXMedia3/1.9.0";
    private static final java.util.HashSet<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.HashSet<>();
    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI = "media3.common";

    private MediaLibraryInfo() {
    }

    public static java.lang.String registeredModules() {
        java.lang.String str;
        synchronized (androidx.media3.common.MediaLibraryInfo.class) {
            str = getHighResolutionOutputSizeshNQ4ISI;
        }
        return str;
    }

    public static void registerModule(java.lang.String str) {
        synchronized (androidx.media3.common.MediaLibraryInfo.class) {
            if (getHighSpeedVideoFpsRangesFor.add(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighResolutionOutputSizeshNQ4ISI);
                sb.append(", ");
                sb.append(str);
                getHighResolutionOutputSizeshNQ4ISI = sb.toString();
            }
        }
    }
}
