package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class ObjectTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Object> {
    private static final com.google.gson.TypeAdapterFactory DOUBLE_FACTORY = newFactory(com.google.gson.ToNumberPolicy.DOUBLE);
    private final com.google.gson.Gson gson;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;

    private ObjectTypeAdapter(com.google.gson.Gson gson, com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.gson = gson;
        this.toNumberStrategy = toNumberStrategy;
    }

    private static com.google.gson.TypeAdapterFactory newFactory(final com.google.gson.ToNumberStrategy toNumberStrategy) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() == java.lang.Object.class) {
                    return new com.google.gson.internal.bind.ObjectTypeAdapter(gson, com.google.gson.ToNumberStrategy.this);
                }
                return null;
            }
        };
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == com.google.gson.ToNumberPolicy.DOUBLE) {
            return DOUBLE_FACTORY;
        }
        return newFactory(toNumberStrategy);
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
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

    private java.lang.Object tryBeginNesting(com.google.gson.stream.JsonReader jsonReader, com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        int i = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new java.util.ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new com.google.gson.internal.LinkedTreeMap();
    }

    private java.lang.Object readTerminal(com.google.gson.stream.JsonReader jsonReader, com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        int i = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.toNumberStrategy.readNumber(jsonReader);
        }
        if (i == 5) {
            return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new java.lang.IllegalStateException("Unexpected token: ".concat(java.lang.String.valueOf(jsonToken)));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        com.google.gson.stream.JsonToken peek = jsonReader.peek();
        java.lang.Object tryBeginNesting = tryBeginNesting(jsonReader, peek);
        if (tryBeginNesting == null) {
            return readTerminal(jsonReader, peek);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                java.lang.String nextName = tryBeginNesting instanceof java.util.Map ? jsonReader.nextName() : null;
                com.google.gson.stream.JsonToken peek2 = jsonReader.peek();
                java.lang.Object tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                boolean z = tryBeginNesting2 != null;
                java.lang.Object readTerminal = tryBeginNesting2 == null ? readTerminal(jsonReader, peek2) : tryBeginNesting2;
                if (tryBeginNesting instanceof java.util.List) {
                    ((java.util.List) tryBeginNesting).add(readTerminal);
                } else {
                    ((java.util.Map) tryBeginNesting).put(nextName, readTerminal);
                }
                if (z) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = readTerminal;
                }
            } else {
                if (tryBeginNesting instanceof java.util.List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.google.gson.TypeAdapter adapter = this.gson.getAdapter(obj.getClass());
        if (adapter instanceof com.google.gson.internal.bind.ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        } else {
            adapter.write(jsonWriter, obj);
        }
    }
}
