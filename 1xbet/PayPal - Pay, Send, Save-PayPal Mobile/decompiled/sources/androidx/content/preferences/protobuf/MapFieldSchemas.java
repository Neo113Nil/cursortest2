package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class MapFieldSchemas {
    private static final androidx.content.preferences.protobuf.MapFieldSchema getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI();
    private static final androidx.content.preferences.protobuf.MapFieldSchema Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.MapFieldSchemaLite();

    static androidx.content.preferences.protobuf.MapFieldSchema Camera2StreamConfigurationMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    static androidx.content.preferences.protobuf.MapFieldSchema getHighSpeedVideoFpsRangesFor() {
        return Camera2StreamConfigurationMap;
    }

    private static androidx.content.preferences.protobuf.MapFieldSchema getHighResolutionOutputSizeshNQ4ISI() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return (androidx.content.preferences.protobuf.MapFieldSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private MapFieldSchemas() {
    }
}
