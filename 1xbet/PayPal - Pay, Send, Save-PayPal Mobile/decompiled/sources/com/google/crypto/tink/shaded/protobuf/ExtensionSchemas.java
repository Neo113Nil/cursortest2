package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class ExtensionSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> LITE_SCHEMA = new com.google.crypto.tink.shaded.protobuf.ExtensionSchemaLite();
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    private static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> loadSchemaForFullRuntime() {
        if (com.google.crypto.tink.shaded.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (com.google.crypto.tink.shaded.protobuf.ExtensionSchema) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> full() {
        com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private ExtensionSchemas() {
    }
}
