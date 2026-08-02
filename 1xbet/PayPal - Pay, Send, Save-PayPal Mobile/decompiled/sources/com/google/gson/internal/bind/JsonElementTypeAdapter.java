package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
class JsonElementTypeAdapter extends com.google.gson.TypeAdapter<com.google.gson.JsonElement> {
    static final com.google.gson.internal.bind.JsonElementTypeAdapter ADAPTER = new com.google.gson.internal.bind.JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    /* renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private com.google.gson.JsonElement tryBeginNesting(com.google.gson.stream.JsonReader jsonReader, com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        int i = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new com.google.gson.JsonArray();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new com.google.gson.JsonObject();
    }

    private com.google.gson.JsonElement readTerminal(com.google.gson.stream.JsonReader jsonReader, com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        int i = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i == 3) {
            return new com.google.gson.JsonPrimitive(jsonReader.nextString());
        }
        if (i == 4) {
            return new com.google.gson.JsonPrimitive(new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString()));
        }
        if (i == 5) {
            return new com.google.gson.JsonPrimitive(java.lang.Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.nextNull();
            return com.google.gson.JsonNull.INSTANCE;
        }
        throw new java.lang.IllegalStateException("Unexpected token: ".concat(java.lang.String.valueOf(jsonToken)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public com.google.gson.JsonElement read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader instanceof com.google.gson.internal.bind.JsonTreeReader) {
            return ((com.google.gson.internal.bind.JsonTreeReader) jsonReader).nextJsonElement();
        }
        com.google.gson.stream.JsonToken peek = jsonReader.peek();
        com.google.gson.JsonElement tryBeginNesting = tryBeginNesting(jsonReader, peek);
        if (tryBeginNesting == null) {
            return readTerminal(jsonReader, peek);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                java.lang.String nextName = tryBeginNesting instanceof com.google.gson.JsonObject ? jsonReader.nextName() : null;
                com.google.gson.stream.JsonToken peek2 = jsonReader.peek();
                com.google.gson.JsonElement tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                boolean z = tryBeginNesting2 != null;
                com.google.gson.JsonElement readTerminal = tryBeginNesting2 == null ? readTerminal(jsonReader, peek2) : tryBeginNesting2;
                if (tryBeginNesting instanceof com.google.gson.JsonArray) {
                    ((com.google.gson.JsonArray) tryBeginNesting).add(readTerminal);
                } else {
                    ((com.google.gson.JsonObject) tryBeginNesting).add(nextName, readTerminal);
                }
                if (z) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = readTerminal;
                }
            } else {
                if (tryBeginNesting instanceof com.google.gson.JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = (com.google.gson.JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, com.google.gson.JsonElement jsonElement) throws java.io.IOException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            jsonWriter.nullValue();
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            com.google.gson.JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                jsonWriter.value(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                jsonWriter.value(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                jsonWriter.value(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement.isJsonArray()) {
            jsonWriter.beginArray();
            java.util.Iterator<com.google.gson.JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (jsonElement.isJsonObject()) {
            jsonWriter.beginObject();
            for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                jsonWriter.name(entry.getKey());
                write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't write ");
        sb.append(jsonElement.getClass());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
