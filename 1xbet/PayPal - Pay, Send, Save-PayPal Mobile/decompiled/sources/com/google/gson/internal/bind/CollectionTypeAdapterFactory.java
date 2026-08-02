package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public CollectionTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.util.Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        java.lang.reflect.Type collectionElementType = com.google.gson.internal.GsonTypes.getCollectionElementType(type, rawType);
        return new com.google.gson.internal.bind.CollectionTypeAdapterFactory.Adapter(new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, gson.getAdapter(com.google.gson.reflect.TypeToken.get(collectionElementType)), collectionElementType), this.constructorConstructor.get(typeToken, false));
    }

    static final class Adapter<E> extends com.google.gson.TypeAdapter<java.util.Collection<E>> {
        private final com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> constructor;
        private final com.google.gson.TypeAdapter<E> elementTypeAdapter;

        Adapter(com.google.gson.TypeAdapter<E> typeAdapter, com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> objectConstructor) {
            this.elementTypeAdapter = typeAdapter;
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final java.util.Collection<E> read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            java.util.Collection<E> construct = this.constructor.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                construct.add(this.elementTypeAdapter.read2(jsonReader));
            }
            jsonReader.endArray();
            return construct;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Collection<E> collection) throws java.io.IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }
}
