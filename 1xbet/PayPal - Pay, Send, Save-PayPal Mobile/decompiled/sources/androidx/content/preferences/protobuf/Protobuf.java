package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class Protobuf {
    private static final androidx.content.preferences.protobuf.Protobuf Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.Protobuf();
    static boolean getHighSpeedVideoFpsRanges = false;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, androidx.content.preferences.protobuf.Schema<?>> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap();
    private final androidx.content.preferences.protobuf.SchemaFactory getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.ManifestSchemaFactory();

    public static androidx.content.preferences.protobuf.Protobuf getHighSpeedVideoFpsRangesFor() {
        return Camera2StreamConfigurationMap;
    }

    public final <T> androidx.content.preferences.protobuf.Schema<T> getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<T> cls) {
        androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(cls, "messageType");
        androidx.content.preferences.protobuf.Schema<T> schema = (androidx.content.preferences.protobuf.Schema) this.getHighSpeedVideoSizes.get(cls);
        if (schema == null) {
            schema = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(cls);
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(cls, "messageType");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(schema, "schema");
            androidx.content.preferences.protobuf.Schema<T> schema2 = (androidx.content.preferences.protobuf.Schema) this.getHighSpeedVideoSizes.putIfAbsent(cls, schema);
            if (schema2 != null) {
                return schema2;
            }
        }
        return schema;
    }

    private Protobuf() {
    }
}
