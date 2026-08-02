package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends com.nimbusds.jose.shaded.gson.TypeAdapter<T> {
    private final com.nimbusds.jose.shaded.gson.Gson context;
    private final com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegate;
    private final java.lang.reflect.Type type;

    TypeAdapterRuntimeTypeWrapper(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter, java.lang.reflect.Type type) {
        this.context = gson;
        this.delegate = typeAdapter;
        this.type = type;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read */
    public final T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        return this.delegate.read2(jsonReader);
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter = this.delegate;
        java.lang.reflect.Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            typeAdapter = this.context.getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((typeAdapter instanceof com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                typeAdapter = this.delegate;
            }
        }
        typeAdapter.write(jsonWriter, t);
    }

    private static boolean isReflective(com.nimbusds.jose.shaded.gson.TypeAdapter<?> typeAdapter) {
        com.nimbusds.jose.shaded.gson.TypeAdapter<?> serializationDelegate;
        while ((typeAdapter instanceof com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter) && (serializationDelegate = ((com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
            typeAdapter = serializationDelegate;
        }
        return typeAdapter instanceof com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter;
    }

    private static java.lang.reflect.Type getRuntimeTypeIfMoreSpecific(java.lang.reflect.Type type, java.lang.Object obj) {
        return obj != null ? ((type instanceof java.lang.Class) || (type instanceof java.lang.reflect.TypeVariable)) ? obj.getClass() : type : type;
    }
}
