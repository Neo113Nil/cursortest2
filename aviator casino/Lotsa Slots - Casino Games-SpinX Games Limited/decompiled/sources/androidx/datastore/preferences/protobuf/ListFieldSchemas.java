package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class ListFieldSchemas {
    private static final androidx.datastore.preferences.protobuf.ListFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final androidx.datastore.preferences.protobuf.ListFieldSchema LITE_SCHEMA = new androidx.datastore.preferences.protobuf.ListFieldSchemaLite();

    static androidx.datastore.preferences.protobuf.ListFieldSchema full() {
        return FULL_SCHEMA;
    }

    static androidx.datastore.preferences.protobuf.ListFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static androidx.datastore.preferences.protobuf.ListFieldSchema loadSchemaForFullRuntime() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.ListFieldSchema) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private ListFieldSchemas() {
    }
}
