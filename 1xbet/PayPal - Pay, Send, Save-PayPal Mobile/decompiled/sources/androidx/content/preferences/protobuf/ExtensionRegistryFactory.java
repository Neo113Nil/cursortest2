package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges();

    ExtensionRegistryFactory() {
    }

    private static java.lang.Class<?> getHighSpeedVideoFpsRanges() {
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static androidx.content.preferences.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI() {
        androidx.content.preferences.protobuf.ExtensionRegistryLite highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("newInstance");
        return highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI : new androidx.content.preferences.protobuf.ExtensionRegistryLite();
    }

    public static androidx.content.preferences.protobuf.ExtensionRegistryLite getHighSpeedVideoSizes() {
        androidx.content.preferences.protobuf.ExtensionRegistryLite highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("getEmptyRegistry");
        return highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI : androidx.content.preferences.protobuf.ExtensionRegistryLite.getHighSpeedVideoFpsRangesFor;
    }

    static boolean getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        java.lang.Class<?> cls;
        return (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges || (cls = getHighSpeedVideoSizes) == null || !cls.isAssignableFrom(extensionRegistryLite.getClass())) ? false : true;
    }

    private static final androidx.content.preferences.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Class<?> cls = getHighSpeedVideoSizes;
        if (cls == null) {
            return null;
        }
        try {
            return (androidx.content.preferences.protobuf.ExtensionRegistryLite) cls.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
