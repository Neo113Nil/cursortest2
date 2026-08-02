package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class Protobuf {
    private static final com.google.crypto.tink.shaded.protobuf.Protobuf INSTANCE = new com.google.crypto.tink.shaded.protobuf.Protobuf();
    static boolean assumeLiteRuntime = false;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.crypto.tink.shaded.protobuf.Schema<?>> schemaCache = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.crypto.tink.shaded.protobuf.SchemaFactory schemaFactory = new com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory();

    public static com.google.crypto.tink.shaded.protobuf.Protobuf getInstance() {
        return INSTANCE;
    }

    public final <T> void writeTo(T t, com.google.crypto.tink.shaded.protobuf.Writer writer) throws java.io.IOException {
        schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t).writeTo(t, writer);
    }

    public final <T> void mergeFrom(T t, com.google.crypto.tink.shaded.protobuf.Reader reader) throws java.io.IOException {
        mergeFrom(t, reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public final <T> void mergeFrom(T t, com.google.crypto.tink.shaded.protobuf.Reader reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t).mergeFrom(t, reader, extensionRegistryLite);
    }

    public final <T> void makeImmutable(T t) {
        schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t).makeImmutable(t);
    }

    final <T> boolean isInitialized(T t) {
        return schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t).isInitialized(t);
    }

    public final <T> com.google.crypto.tink.shaded.protobuf.Schema<T> schemaFor(java.lang.Class<T> cls) {
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.crypto.tink.shaded.protobuf.Schema<T> schema = (com.google.crypto.tink.shaded.protobuf.Schema) this.schemaCache.get(cls);
        if (schema == null) {
            schema = this.schemaFactory.createSchema(cls);
            com.google.crypto.tink.shaded.protobuf.Schema<T> schema2 = (com.google.crypto.tink.shaded.protobuf.Schema<T>) registerSchema(cls, schema);
            if (schema2 != null) {
                return schema2;
            }
        }
        return schema;
    }

    public final <T> com.google.crypto.tink.shaded.protobuf.Schema<T> schemaFor(T t) {
        return schemaFor((java.lang.Class) t.getClass());
    }

    public final com.google.crypto.tink.shaded.protobuf.Schema<?> registerSchema(java.lang.Class<?> cls, com.google.crypto.tink.shaded.protobuf.Schema<?> schema) {
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    public final com.google.crypto.tink.shaded.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> cls, com.google.crypto.tink.shaded.protobuf.Schema<?> schema) {
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    private Protobuf() {
    }

    final int getTotalSchemaSize() {
        int i = 0;
        for (com.google.crypto.tink.shaded.protobuf.Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof com.google.crypto.tink.shaded.protobuf.MessageSchema) {
                i += ((com.google.crypto.tink.shaded.protobuf.MessageSchema) schema).getSchemaSize();
            }
        }
        return i;
    }
}
