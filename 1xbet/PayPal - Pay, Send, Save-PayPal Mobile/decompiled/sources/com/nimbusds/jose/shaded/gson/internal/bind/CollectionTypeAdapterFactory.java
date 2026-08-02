package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements com.nimbusds.jose.shaded.gson.TypeAdapterFactory {
    private final com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor;

    public CollectionTypeAdapterFactory(com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.util.Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        java.lang.reflect.Type collectionElementType = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getCollectionElementType(type, rawType);
        return new com.nimbusds.jose.shaded.gson.internal.bind.CollectionTypeAdapterFactory.Adapter(gson, collectionElementType, gson.getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(collectionElementType)), this.constructorConstructor.get(typeToken));
    }

    static final class Adapter<E> extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Collection<E>> {
        private final com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> constructor;
        private final com.nimbusds.jose.shaded.gson.TypeAdapter<E> elementTypeAdapter;

        public Adapter(com.nimbusds.jose.shaded.gson.Gson gson, java.lang.reflect.Type type, com.nimbusds.jose.shaded.gson.TypeAdapter<E> typeAdapter, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.constructor = objectConstructor;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /* renamed from: read */
        public final java.util.Collection<E> read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Collection<E> collection) throws java.io.IOException {
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
