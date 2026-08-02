package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter<T> {
    private final com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegate;
    private final com.nimbusds.jose.shaded.gson.JsonDeserializer<T> deserializer;
    final com.nimbusds.jose.shaded.gson.Gson gson;
    private final boolean nullSafe;
    private final com.nimbusds.jose.shaded.gson.JsonSerializer<T> serializer;
    private final com.nimbusds.jose.shaded.gson.TypeAdapterFactory skipPast;
    private final com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken;

    public TreeTypeAdapter(com.nimbusds.jose.shaded.gson.JsonSerializer<T> jsonSerializer, com.nimbusds.jose.shaded.gson.JsonDeserializer<T> jsonDeserializer, com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken, com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory, boolean z) {
        this.context = new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.GsonContextImpl();
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
        this.nullSafe = z;
    }

    public TreeTypeAdapter(com.nimbusds.jose.shaded.gson.JsonSerializer<T> jsonSerializer, com.nimbusds.jose.shaded.gson.JsonDeserializer<T> jsonDeserializer, com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken, com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read */
    public final T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (this.deserializer == null) {
            return delegate().read2(jsonReader);
        }
        com.nimbusds.jose.shaded.gson.JsonElement parse = com.nimbusds.jose.shaded.gson.internal.Streams.parse(jsonReader);
        if (this.nullSafe && parse.isJsonNull()) {
            return null;
        }
        return this.deserializer.deserialize(parse, this.typeToken.getType(), this.context);
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.JsonSerializer<T> jsonSerializer = this.serializer;
        if (jsonSerializer == null) {
            delegate().write(jsonWriter, t);
        } else if (this.nullSafe && t == null) {
            jsonWriter.nullValue();
        } else {
            com.nimbusds.jose.shaded.gson.internal.Streams.write(jsonSerializer.serialize(t, this.typeToken.getType(), this.context), jsonWriter);
        }
    }

    private com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegate() {
        com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter = this.delegate;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegateAdapter = this.gson.getDelegateAdapter(this.skipPast, this.typeToken);
        this.delegate = delegateAdapter;
        return delegateAdapter;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final com.nimbusds.jose.shaded.gson.TypeAdapter<T> getSerializationDelegate() {
        return this.serializer != null ? this : delegate();
    }

    public static com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactory(com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, java.lang.Object obj) {
        return new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, typeToken, false, null);
    }

    public static com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactoryWithMatchRawType(com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, java.lang.Object obj) {
        return new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static com.nimbusds.jose.shaded.gson.TypeAdapterFactory newTypeHierarchyFactory(java.lang.Class<?> cls, java.lang.Object obj) {
        return new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, null, false, cls);
    }

    /* loaded from: classes10.dex */
    static final class SingleTypeFactory implements com.nimbusds.jose.shaded.gson.TypeAdapterFactory {
        private final com.nimbusds.jose.shaded.gson.JsonDeserializer<?> deserializer;
        private final com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> exactType;
        private final java.lang.Class<?> hierarchyType;
        private final boolean matchRawType;
        private final com.nimbusds.jose.shaded.gson.JsonSerializer<?> serializer;

        SingleTypeFactory(java.lang.Object obj, com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, boolean z, java.lang.Class<?> cls) {
            com.nimbusds.jose.shaded.gson.JsonSerializer<?> jsonSerializer = obj instanceof com.nimbusds.jose.shaded.gson.JsonSerializer ? (com.nimbusds.jose.shaded.gson.JsonSerializer) obj : null;
            this.serializer = jsonSerializer;
            com.nimbusds.jose.shaded.gson.JsonDeserializer<?> jsonDeserializer = obj instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer ? (com.nimbusds.jose.shaded.gson.JsonDeserializer) obj : null;
            this.deserializer = jsonDeserializer;
            com.nimbusds.jose.shaded.gson.internal.C$Gson$Preconditions.checkArgument((jsonSerializer == null && jsonDeserializer == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.matchRawType || this.exactType.getType() != typeToken.getRawType())) {
                    return null;
                }
            } else if (!this.hierarchyType.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter(this.serializer, this.deserializer, gson, typeToken, this);
        }
    }

    final class GsonContextImpl implements com.nimbusds.jose.shaded.gson.JsonSerializationContext, com.nimbusds.jose.shaded.gson.JsonDeserializationContext {
        private GsonContextImpl() {
        }

        @Override // com.nimbusds.jose.shaded.gson.JsonSerializationContext
        public final com.nimbusds.jose.shaded.gson.JsonElement serialize(java.lang.Object obj) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.this.gson.toJsonTree(obj);
        }

        @Override // com.nimbusds.jose.shaded.gson.JsonSerializationContext
        public final com.nimbusds.jose.shaded.gson.JsonElement serialize(java.lang.Object obj, java.lang.reflect.Type type) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.this.gson.toJsonTree(obj, type);
        }

        @Override // com.nimbusds.jose.shaded.gson.JsonDeserializationContext
        public final <R> R deserialize(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, java.lang.reflect.Type type) throws com.nimbusds.jose.shaded.gson.JsonParseException {
            return (R) com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter.this.gson.fromJson(jsonElement, type);
        }
    }
}
