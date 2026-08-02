package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class ExtensionSchemas {
    private static final androidx.content.preferences.protobuf.ExtensionSchema<?> getHighSpeedVideoFpsRanges = new androidx.content.preferences.protobuf.ExtensionSchemaLite();
    private static final androidx.content.preferences.protobuf.ExtensionSchema<?> getHighResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();

    private static androidx.content.preferences.protobuf.ExtensionSchema<?> getHighResolutionOutputSizeshNQ4ISI() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return null;
        }
        try {
            return (androidx.content.preferences.protobuf.ExtensionSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static androidx.content.preferences.protobuf.ExtensionSchema<?> Camera2StreamConfigurationMap() {
        return getHighSpeedVideoFpsRanges;
    }

    static androidx.content.preferences.protobuf.ExtensionSchema<?> getHighSpeedVideoFpsRanges() {
        androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema = getHighResolutionOutputSizeshNQ4ISI;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private ExtensionSchemas() {
    }
}
