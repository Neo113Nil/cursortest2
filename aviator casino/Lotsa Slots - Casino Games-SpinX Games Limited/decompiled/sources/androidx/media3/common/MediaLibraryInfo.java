package androidx.media3.common;

/* loaded from: classes2.dex */
public final class MediaLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final java.lang.String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final java.lang.String VERSION = "1.4.1";
    public static final int VERSION_INT = 1004001300;
    public static final java.lang.String VERSION_SLASHY = "AndroidXMedia3/1.4.1";
    private static final java.util.HashSet<java.lang.String> registeredModules = new java.util.HashSet<>();
    private static java.lang.String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static synchronized java.lang.String registeredModules() {
        java.lang.String str;
        synchronized (androidx.media3.common.MediaLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }

    public static synchronized void registerModule(java.lang.String str) {
        synchronized (androidx.media3.common.MediaLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += ", " + str;
            }
        }
    }
}
