package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class Android {
    private static final boolean Camera2StreamConfigurationMap;
    private static final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("libcore.io.Memory");
    private static boolean getHighSpeedVideoSizes;

    private Android() {
    }

    static {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes || getHighResolutionOutputSizeshNQ4ISI("org.robolectric.Robolectric") == null) ? false : true;
    }

    static boolean getHighSpeedVideoFpsRangesFor() {
        if (getHighSpeedVideoSizes) {
            return true;
        }
        return (getHighResolutionOutputSizeshNQ4ISI == null || Camera2StreamConfigurationMap) ? false : true;
    }

    static java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static <T> java.lang.Class<T> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
