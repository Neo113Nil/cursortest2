package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class MapFieldSchemas {
    private static final androidx.datastore.preferences.protobuf.MapFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final androidx.datastore.preferences.protobuf.MapFieldSchema LITE_SCHEMA = new androidx.datastore.preferences.protobuf.MapFieldSchemaLite();

    static androidx.datastore.preferences.protobuf.MapFieldSchema full() {
        return FULL_SCHEMA;
    }

    static androidx.datastore.preferences.protobuf.MapFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static androidx.datastore.preferences.protobuf.MapFieldSchema loadSchemaForFullRuntime() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.MapFieldSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private MapFieldSchemas() {
    }
}
