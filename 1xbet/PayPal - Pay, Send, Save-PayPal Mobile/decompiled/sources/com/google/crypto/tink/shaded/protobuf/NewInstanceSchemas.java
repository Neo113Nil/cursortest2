package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class NewInstanceSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema LITE_SCHEMA = new com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaLite();

    static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema loadSchemaForFullRuntime() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.NewInstanceSchema) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private NewInstanceSchemas() {
    }
}
