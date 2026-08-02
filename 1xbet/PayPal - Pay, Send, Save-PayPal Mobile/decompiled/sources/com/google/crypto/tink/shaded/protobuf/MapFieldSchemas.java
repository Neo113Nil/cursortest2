package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class MapFieldSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldSchema LITE_SCHEMA = new com.google.crypto.tink.shaded.protobuf.MapFieldSchemaLite();

    static com.google.crypto.tink.shaded.protobuf.MapFieldSchema full() {
        return FULL_SCHEMA;
    }

    static com.google.crypto.tink.shaded.protobuf.MapFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static com.google.crypto.tink.shaded.protobuf.MapFieldSchema loadSchemaForFullRuntime() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.MapFieldSchema) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private MapFieldSchemas() {
    }
}
