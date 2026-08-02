package rx.internal.util;

/* loaded from: classes18.dex */
public final class PlatformDependent {
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;
    private static final int getHighSpeedVideoFpsRanges;
    private static final boolean getHighSpeedVideoSizes;

    static {
        int highSpeedVideoSizes = getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        getHighSpeedVideoSizes = highSpeedVideoSizes != 0;
    }

    private PlatformDependent() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static boolean isAndroid() {
        return getHighSpeedVideoSizes;
    }

    public static int getAndroidApiVersion() {
        return getHighSpeedVideoFpsRanges;
    }

    private static int getHighSpeedVideoSizes() {
        try {
            return ((java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
