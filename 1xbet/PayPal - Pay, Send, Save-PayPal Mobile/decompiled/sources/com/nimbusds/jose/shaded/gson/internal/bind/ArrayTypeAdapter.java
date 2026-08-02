package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Object> {
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            java.lang.reflect.Type type = typeToken.getType();
            if (!(type instanceof java.lang.reflect.GenericArrayType) && (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isArray())) {
                return null;
            }
            java.lang.reflect.Type arrayComponentType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getArrayComponentType(type);
            return new com.nimbusds.jose.shaded.gson.internal.bind.ArrayTypeAdapter(gson, gson.getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(arrayComponentType)), com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getRawType(arrayComponentType));
        }
    };
    private final java.lang.Class<E> componentType;
    private final com.nimbusds.jose.shaded.gson.TypeAdapter<E> componentTypeAdapter;

    public ArrayTypeAdapter(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.TypeAdapter<E> typeAdapter, java.lang.Class<E> cls) {
        this.componentTypeAdapter = new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.componentType = cls;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read2(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (this.componentType.isPrimitive()) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.componentType, size);
            for (int i = 0; i < size; i++) {
                java.lang.reflect.Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.componentType, size));
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.componentTypeAdapter.write(jsonWriter, java.lang.reflect.Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
