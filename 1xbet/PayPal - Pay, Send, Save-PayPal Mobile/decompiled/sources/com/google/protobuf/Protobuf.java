package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class Protobuf {
    private static final com.google.protobuf.Protobuf INSTANCE = new com.google.protobuf.Protobuf();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.protobuf.Schema<?>> schemaCache = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.protobuf.SchemaFactory schemaFactory = new com.google.protobuf.ManifestSchemaFactory();

    public static com.google.protobuf.Protobuf getInstance() {
        return INSTANCE;
    }

    public final <T> void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        schemaFor((com.google.protobuf.Protobuf) t).writeTo(t, writer);
    }

    public final <T> void mergeFrom(T t, com.google.protobuf.Reader reader) throws java.io.IOException {
        mergeFrom(t, reader, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public final <T> void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        schemaFor((com.google.protobuf.Protobuf) t).mergeFrom(t, reader, extensionRegistryLite);
    }

    public final <T> void makeImmutable(T t) {
        schemaFor((com.google.protobuf.Protobuf) t).makeImmutable(t);
    }

    final <T> boolean isInitialized(T t) {
        return schemaFor((com.google.protobuf.Protobuf) t).isInitialized(t);
    }

    public final <T> com.google.protobuf.Schema<T> schemaFor(java.lang.Class<T> cls) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Schema<T> schema = (com.google.protobuf.Schema) this.schemaCache.get(cls);
        if (schema == null) {
            schema = this.schemaFactory.createSchema(cls);
            com.google.protobuf.Schema<T> schema2 = (com.google.protobuf.Schema<T>) registerSchema(cls, schema);
            if (schema2 != null) {
                return schema2;
            }
        }
        return schema;
    }

    public final <T> com.google.protobuf.Schema<T> schemaFor(T t) {
        return schemaFor((java.lang.Class) t.getClass());
    }

    public final com.google.protobuf.Schema<?> registerSchema(java.lang.Class<?> cls, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    public final com.google.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> cls, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    private Protobuf() {
    }

    final int getTotalSchemaSize() {
        int i = 0;
        for (com.google.protobuf.Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof com.google.protobuf.MessageSchema) {
                i += ((com.google.protobuf.MessageSchema) schema).getSchemaSize();
            }
        }
        return i;
    }
}
