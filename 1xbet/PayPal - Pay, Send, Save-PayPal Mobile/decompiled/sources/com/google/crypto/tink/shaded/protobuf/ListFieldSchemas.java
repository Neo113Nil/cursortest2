package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class ListFieldSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.ListFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final com.google.crypto.tink.shaded.protobuf.ListFieldSchema LITE_SCHEMA = new com.google.crypto.tink.shaded.protobuf.ListFieldSchemaLite();

    static com.google.crypto.tink.shaded.protobuf.ListFieldSchema full() {
        return FULL_SCHEMA;
    }

    static com.google.crypto.tink.shaded.protobuf.ListFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static com.google.crypto.tink.shaded.protobuf.ListFieldSchema loadSchemaForFullRuntime() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.ListFieldSchema) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private ListFieldSchemas() {
    }
}
