package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends com.google.gson.TypeAdapter<T> {
    private final com.google.gson.Gson context;
    private final com.google.gson.TypeAdapter<T> delegate;
    private final java.lang.reflect.Type type;

    TypeAdapterRuntimeTypeWrapper(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter, java.lang.reflect.Type type) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.type = type;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        return this.delegate.read2(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
        com.google.gson.TypeAdapter<T> typeAdapter = this.delegate;
        java.lang.reflect.Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            typeAdapter = this.context.getAdapter(com.google.gson.reflect.TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((typeAdapter instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                typeAdapter = this.delegate;
            }
        }
        typeAdapter.write(jsonWriter, t);
    }

    private static boolean isReflective(com.google.gson.TypeAdapter<?> typeAdapter) {
        com.google.gson.TypeAdapter<?> serializationDelegate;
        while ((typeAdapter instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) && (serializationDelegate = ((com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
            typeAdapter = serializationDelegate;
        }
        return typeAdapter instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter;
    }

    private static java.lang.reflect.Type getRuntimeTypeIfMoreSpecific(java.lang.reflect.Type type, java.lang.Object obj) {
        return obj != null ? ((type instanceof java.lang.Class) || (type instanceof java.lang.reflect.TypeVariable)) ? obj.getClass() : type : type;
    }
}
