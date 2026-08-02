package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements com.nimbusds.jose.shaded.gson.TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor;

    public MapTypeAdapterFactory(com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor, boolean z) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.util.Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        java.lang.reflect.Type[] mapKeyAndValueTypes = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.getMapKeyAndValueTypes(type, rawType);
        return new com.nimbusds.jose.shaded.gson.internal.bind.MapTypeAdapterFactory.Adapter(gson, mapKeyAndValueTypes[0], getKeyAdapter(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(typeToken));
    }

    private com.nimbusds.jose.shaded.gson.TypeAdapter<?> getKeyAdapter(com.nimbusds.jose.shaded.gson.Gson gson, java.lang.reflect.Type type) {
        if (type == java.lang.Boolean.TYPE || type == java.lang.Boolean.class) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING;
        }
        return gson.getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
    }

    final class Adapter<K, V> extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Map<K, V>> {
        private final com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> constructor;
        private final com.nimbusds.jose.shaded.gson.TypeAdapter<K> keyTypeAdapter;
        private final com.nimbusds.jose.shaded.gson.TypeAdapter<V> valueTypeAdapter;

        public Adapter(com.nimbusds.jose.shaded.gson.Gson gson, java.lang.reflect.Type type, com.nimbusds.jose.shaded.gson.TypeAdapter<K> typeAdapter, java.lang.reflect.Type type2, com.nimbusds.jose.shaded.gson.TypeAdapter<V> typeAdapter2, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.valueTypeAdapter = new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.constructor = objectConstructor;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /* renamed from: read */
        public final java.util.Map<K, V> read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
            if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            java.util.Map<K, V> construct = this.constructor.construct();
            if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read2 = this.keyTypeAdapter.read2(jsonReader);
                    if (construct.put(read2, this.valueTypeAdapter.read2(jsonReader)) != null) {
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException("duplicate key: ".concat(java.lang.String.valueOf(read2)));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
                return construct;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                com.nimbusds.jose.shaded.gson.internal.JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                K read22 = this.keyTypeAdapter.read2(jsonReader);
                if (construct.put(read22, this.valueTypeAdapter.read2(jsonReader)) != null) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException("duplicate key: ".concat(java.lang.String.valueOf(read22)));
                }
            }
            jsonReader.endObject();
            return construct;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Map<K, V> map) throws java.io.IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!com.nimbusds.jose.shaded.gson.internal.bind.MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(java.lang.String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (java.util.Map.Entry<K, V> entry2 : map.entrySet()) {
                com.nimbusds.jose.shaded.gson.JsonElement jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (z) {
                jsonWriter.beginArray();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.beginArray();
                    com.nimbusds.jose.shaded.gson.internal.Streams.write((com.nimbusds.jose.shaded.gson.JsonElement) arrayList.get(i), jsonWriter);
                    this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i));
                    jsonWriter.endArray();
                    i++;
                }
                jsonWriter.endArray();
                return;
            }
            jsonWriter.beginObject();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.name(keyToString((com.nimbusds.jose.shaded.gson.JsonElement) arrayList.get(i)));
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i));
                i++;
            }
            jsonWriter.endObject();
        }

        private java.lang.String keyToString(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                com.nimbusds.jose.shaded.gson.JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return java.lang.String.valueOf(asJsonPrimitive.getAsNumber());
                }
                if (asJsonPrimitive.isBoolean()) {
                    return java.lang.Boolean.toString(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                throw new java.lang.AssertionError();
            }
            if (jsonElement.isJsonNull()) {
                return "null";
            }
            throw new java.lang.AssertionError();
        }
    }
}
