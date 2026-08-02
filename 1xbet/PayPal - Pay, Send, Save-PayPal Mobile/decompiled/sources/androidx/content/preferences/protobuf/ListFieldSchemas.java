package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class ListFieldSchemas {
    private static final androidx.content.preferences.protobuf.ListFieldSchema Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges();
    private static final androidx.content.preferences.protobuf.ListFieldSchema getHighSpeedVideoFpsRanges = new androidx.content.preferences.protobuf.ListFieldSchemaLite();

    static androidx.content.preferences.protobuf.ListFieldSchema getHighResolutionOutputSizeshNQ4ISI() {
        return Camera2StreamConfigurationMap;
    }

    static androidx.content.preferences.protobuf.ListFieldSchema Camera2StreamConfigurationMap() {
        return getHighSpeedVideoFpsRanges;
    }

    private static androidx.content.preferences.protobuf.ListFieldSchema getHighSpeedVideoFpsRanges() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return (androidx.content.preferences.protobuf.ListFieldSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private ListFieldSchemas() {
    }
}
