package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class Protobuf {
    private static final com.google.protobuf.Protobuf INSTANCE = new com.google.protobuf.Protobuf();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.protobuf.Schema<?>> schemaCache = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.protobuf.SchemaFactory schemaFactory = new com.google.protobuf.ManifestSchemaFactory();

    public static com.google.protobuf.Protobuf getInstance() {
        return INSTANCE;
    }

    public <T> void writeTo(T message, com.google.protobuf.Writer writer) throws java.io.IOException {
        schemaFor((com.google.protobuf.Protobuf) message).writeTo(message, writer);
    }

    public <T> void mergeFrom(T message, com.google.protobuf.Reader reader) throws java.io.IOException {
        mergeFrom(message, reader, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public <T> void mergeFrom(T message, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        schemaFor((com.google.protobuf.Protobuf) message).mergeFrom(message, reader, extensionRegistry);
    }

    public <T> void makeImmutable(T message) {
        schemaFor((com.google.protobuf.Protobuf) message).makeImmutable(message);
    }

    <T> boolean isInitialized(T message) {
        return schemaFor((com.google.protobuf.Protobuf) message).isInitialized(message);
    }

    public <T> com.google.protobuf.Schema<T> schemaFor(java.lang.Class<T> cls) {
        com.google.protobuf.Internal.checkNotNull(cls, "messageType");
        com.google.protobuf.Schema<T> schema = (com.google.protobuf.Schema) this.schemaCache.get(cls);
        if (schema != null) {
            return schema;
        }
        com.google.protobuf.Schema<T> createSchema = this.schemaFactory.createSchema(cls);
        com.google.protobuf.Schema<T> schema2 = (com.google.protobuf.Schema<T>) registerSchema(cls, createSchema);
        return schema2 != null ? schema2 : createSchema;
    }

    public <T> com.google.protobuf.Schema<T> schemaFor(T message) {
        return schemaFor((java.lang.Class) message.getClass());
    }

    public com.google.protobuf.Schema<?> registerSchema(java.lang.Class<?> messageType, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(messageType, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(messageType, schema);
    }

    public com.google.protobuf.Schema<?> registerSchemaOverride(java.lang.Class<?> messageType, com.google.protobuf.Schema<?> schema) {
        com.google.protobuf.Internal.checkNotNull(messageType, "messageType");
        com.google.protobuf.Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(messageType, schema);
    }

    private Protobuf() {
    }

    int getTotalSchemaSize() {
        int i = 0;
        for (com.google.protobuf.Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof com.google.protobuf.MessageSchema) {
                i += ((com.google.protobuf.MessageSchema) schema).getSchemaSize();
            }
        }
        return i;
    }
}
