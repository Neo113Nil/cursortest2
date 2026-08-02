package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends com.google.gson.internal.bind.SerializationDelegatingTypeAdapter<T> {
    private final com.google.gson.internal.bind.TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile com.google.gson.TypeAdapter<T> delegate;
    private final com.google.gson.JsonDeserializer<T> deserializer;
    final com.google.gson.Gson gson;
    private final boolean nullSafe;
    private final com.google.gson.JsonSerializer<T> serializer;
    private final com.google.gson.TypeAdapterFactory skipPastForGetDelegateAdapter;
    private final com.google.gson.reflect.TypeToken<T> typeToken;

    public TreeTypeAdapter(com.google.gson.JsonSerializer<T> jsonSerializer, com.google.gson.JsonDeserializer<T> jsonDeserializer, com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken, com.google.gson.TypeAdapterFactory typeAdapterFactory, boolean z) {
        this.context = new com.google.gson.internal.bind.TreeTypeAdapter.GsonContextImpl();
        this.serializer = jsonSerializer;
        this.deserializer = jsonDeserializer;
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = typeAdapterFactory;
        this.nullSafe = z;
    }

    public TreeTypeAdapter(com.google.gson.JsonSerializer<T> jsonSerializer, com.google.gson.JsonDeserializer<T> jsonDeserializer, com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken, com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        this(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, true);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (this.deserializer == null) {
            return delegate().read2(jsonReader);
        }
        com.google.gson.JsonElement parse = com.google.gson.internal.Streams.parse(jsonReader);
        if (this.nullSafe && parse.isJsonNull()) {
            return null;
        }
        return this.deserializer.deserialize(parse, this.typeToken.getType(), this.context);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
        com.google.gson.JsonSerializer<T> jsonSerializer = this.serializer;
        if (jsonSerializer == null) {
            delegate().write(jsonWriter, t);
        } else if (this.nullSafe && t == null) {
            jsonWriter.nullValue();
        } else {
            com.google.gson.internal.Streams.write(jsonSerializer.serialize(t, this.typeToken.getType(), this.context), jsonWriter);
        }
    }

    private com.google.gson.TypeAdapter<T> delegate() {
        com.google.gson.TypeAdapter<T> typeAdapter = this.delegate;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        com.google.gson.TypeAdapter<T> delegateAdapter = this.gson.getDelegateAdapter(this.skipPastForGetDelegateAdapter, this.typeToken);
        this.delegate = delegateAdapter;
        return delegateAdapter;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final com.google.gson.TypeAdapter<T> getSerializationDelegate() {
        return this.serializer != null ? this : delegate();
    }

    public static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.reflect.TypeToken<?> typeToken, java.lang.Object obj) {
        return new com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, typeToken, false, null);
    }

    public static com.google.gson.TypeAdapterFactory newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken<?> typeToken, java.lang.Object obj) {
        return new com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(java.lang.Class<?> cls, java.lang.Object obj) {
        return new com.google.gson.internal.bind.TreeTypeAdapter.SingleTypeFactory(obj, null, false, cls);
    }

    /* loaded from: classes9.dex */
    static final class SingleTypeFactory implements com.google.gson.TypeAdapterFactory {
        private final com.google.gson.JsonDeserializer<?> deserializer;
        private final com.google.gson.reflect.TypeToken<?> exactType;
        private final java.lang.Class<?> hierarchyType;
        private final boolean matchRawType;
        private final com.google.gson.JsonSerializer<?> serializer;

        SingleTypeFactory(java.lang.Object obj, com.google.gson.reflect.TypeToken<?> typeToken, boolean z, java.lang.Class<?> cls) {
            com.google.gson.JsonSerializer<?> jsonSerializer = obj instanceof com.google.gson.JsonSerializer ? (com.google.gson.JsonSerializer) obj : null;
            this.serializer = jsonSerializer;
            com.google.gson.JsonDeserializer<?> jsonDeserializer = obj instanceof com.google.gson.JsonDeserializer ? (com.google.gson.JsonDeserializer) obj : null;
            this.deserializer = jsonDeserializer;
            if (jsonSerializer == null && jsonDeserializer == null) {
                java.util.Objects.requireNonNull(obj);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Type adapter ");
                sb.append(obj.getClass().getName());
                sb.append(" must implement JsonSerializer or JsonDeserializer");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            com.google.gson.reflect.TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.matchRawType || this.exactType.getType() != typeToken.getRawType())) {
                    return null;
                }
            } else if (!this.hierarchyType.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return new com.google.gson.internal.bind.TreeTypeAdapter(this.serializer, this.deserializer, gson, typeToken, this);
        }
    }

    final class GsonContextImpl implements com.google.gson.JsonSerializationContext, com.google.gson.JsonDeserializationContext {
        private GsonContextImpl() {
        }

        @Override // com.google.gson.JsonSerializationContext
        public final com.google.gson.JsonElement serialize(java.lang.Object obj) {
            return com.google.gson.internal.bind.TreeTypeAdapter.this.gson.toJsonTree(obj);
        }

        @Override // com.google.gson.JsonSerializationContext
        public final com.google.gson.JsonElement serialize(java.lang.Object obj, java.lang.reflect.Type type) {
            return com.google.gson.internal.bind.TreeTypeAdapter.this.gson.toJsonTree(obj, type);
        }

        @Override // com.google.gson.JsonDeserializationContext
        public final <R> R deserialize(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type) throws com.google.gson.JsonParseException {
            return (R) com.google.gson.internal.bind.TreeTypeAdapter.this.gson.fromJson(jsonElement, type);
        }
    }
}
