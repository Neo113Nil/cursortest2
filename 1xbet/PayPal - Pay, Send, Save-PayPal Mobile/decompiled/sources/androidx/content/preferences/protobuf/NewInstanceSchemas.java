package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class NewInstanceSchemas {
    private static final androidx.content.preferences.protobuf.NewInstanceSchema getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap();
    private static final androidx.content.preferences.protobuf.NewInstanceSchema getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.NewInstanceSchemaLite();

    static androidx.content.preferences.protobuf.NewInstanceSchema getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRanges;
    }

    static androidx.content.preferences.protobuf.NewInstanceSchema getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static androidx.content.preferences.protobuf.NewInstanceSchema Camera2StreamConfigurationMap() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return (androidx.content.preferences.protobuf.NewInstanceSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private NewInstanceSchemas() {
    }
}
