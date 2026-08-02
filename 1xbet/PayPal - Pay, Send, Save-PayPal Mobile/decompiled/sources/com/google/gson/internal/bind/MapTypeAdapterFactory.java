package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public MapTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor, boolean z) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.util.Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        java.lang.reflect.Type[] mapKeyAndValueTypes = com.google.gson.internal.GsonTypes.getMapKeyAndValueTypes(type, rawType);
        java.lang.reflect.Type type2 = mapKeyAndValueTypes[0];
        java.lang.reflect.Type type3 = mapKeyAndValueTypes[1];
        return new com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter(new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, getKeyAdapter(gson, type2), type2), new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, gson.getAdapter(com.google.gson.reflect.TypeToken.get(type3)), type3), this.constructorConstructor.get(typeToken, false));
    }

    private com.google.gson.TypeAdapter<?> getKeyAdapter(com.google.gson.Gson gson, java.lang.reflect.Type type) {
        if (type == java.lang.Boolean.TYPE || type == java.lang.Boolean.class) {
            return com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING;
        }
        return gson.getAdapter(com.google.gson.reflect.TypeToken.get(type));
    }

    final class Adapter<K, V> extends com.google.gson.TypeAdapter<java.util.Map<K, V>> {
        private final com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> constructor;
        private final com.google.gson.TypeAdapter<K> keyTypeAdapter;
        private final com.google.gson.TypeAdapter<V> valueTypeAdapter;

        Adapter(com.google.gson.TypeAdapter<K> typeAdapter, com.google.gson.TypeAdapter<V> typeAdapter2, com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = typeAdapter;
            this.valueTypeAdapter = typeAdapter2;
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final java.util.Map<K, V> read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            com.google.gson.stream.JsonToken peek = jsonReader.peek();
            if (peek == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            java.util.Map<K, V> construct = this.constructor.construct();
            if (peek == com.google.gson.stream.JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read2 = this.keyTypeAdapter.read2(jsonReader);
                    if (construct.put(read2, this.valueTypeAdapter.read2(jsonReader)) != null) {
                        throw new com.google.gson.JsonSyntaxException("duplicate key: ".concat(java.lang.String.valueOf(read2)));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
                return construct;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                com.google.gson.internal.JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                K read22 = this.keyTypeAdapter.read2(jsonReader);
                if (construct.put(read22, this.valueTypeAdapter.read2(jsonReader)) != null) {
                    throw new com.google.gson.JsonSyntaxException("duplicate key: ".concat(java.lang.String.valueOf(read22)));
                }
            }
            jsonReader.endObject();
            return construct;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Map<K, V> map) throws java.io.IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!com.google.gson.internal.bind.MapTypeAdapterFactory.this.complexMapKeySerialization) {
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
                com.google.gson.JsonElement jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (z) {
                jsonWriter.beginArray();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.beginArray();
                    com.google.gson.internal.Streams.write((com.google.gson.JsonElement) arrayList.get(i), jsonWriter);
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
                jsonWriter.name(keyToString((com.google.gson.JsonElement) arrayList.get(i)));
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i));
                i++;
            }
            jsonWriter.endObject();
        }

        private java.lang.String keyToString(com.google.gson.JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                com.google.gson.JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
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
