package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class JsonParser {
    private static final com.google.crypto.tink.internal.JsonParser.JsonElementTypeAdapter JSON_ELEMENT = new com.google.crypto.tink.internal.JsonParser.JsonElementTypeAdapter(null);

    public static boolean isValidString(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i2 = i + 1;
            if (!java.lang.Character.isSurrogate(charAt)) {
                i = i2;
            } else {
                if (java.lang.Character.isLowSurrogate(charAt) || i2 == length || !java.lang.Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    static final class LazilyParsedNumber extends java.lang.Number {
        private final java.lang.String value;

        public LazilyParsedNumber(java.lang.String str) {
            this.value = str;
        }

        @Override // java.lang.Number
        public final int intValue() {
            try {
                try {
                    return java.lang.Integer.parseInt(this.value);
                } catch (java.lang.NumberFormatException unused) {
                    return (int) java.lang.Long.parseLong(this.value);
                }
            } catch (java.lang.NumberFormatException unused2) {
                return new java.math.BigDecimal(this.value).intValue();
            }
        }

        @Override // java.lang.Number
        public final long longValue() {
            try {
                return java.lang.Long.parseLong(this.value);
            } catch (java.lang.NumberFormatException unused) {
                return new java.math.BigDecimal(this.value).longValue();
            }
        }

        @Override // java.lang.Number
        public final float floatValue() {
            return java.lang.Float.parseFloat(this.value);
        }

        @Override // java.lang.Number
        public final double doubleValue() {
            return java.lang.Double.parseDouble(this.value);
        }

        public final java.lang.String toString() {
            return this.value;
        }

        private java.lang.Object writeReplace() throws java.io.NotSerializableException {
            throw new java.io.NotSerializableException("serialization is not supported");
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.NotSerializableException {
            throw new java.io.NotSerializableException("serialization is not supported");
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber) {
                return this.value.equals(((com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber) obj).value);
            }
            return false;
        }
    }

    static final class JsonElementTypeAdapter extends com.google.gson.TypeAdapter<com.google.gson.JsonElement> {
        private static final int RECURSION_LIMIT = 100;

        private JsonElementTypeAdapter() {
        }

        /* synthetic */ JsonElementTypeAdapter(com.google.crypto.tink.internal.JsonParser.AnonymousClass1 anonymousClass1) {
            this();
        }

        @javax.annotation.Nullable
        private com.google.gson.JsonElement tryBeginNesting(com.google.gson.stream.JsonReader jsonReader, com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
            int i = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
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
            int i = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
            if (i == 3) {
                java.lang.String nextString = jsonReader.nextString();
                if (!com.google.crypto.tink.internal.JsonParser.isValidString(nextString)) {
                    throw new java.io.IOException("illegal characters in string");
                }
                return new com.google.gson.JsonPrimitive(nextString);
            }
            if (i == 4) {
                return new com.google.gson.JsonPrimitive(new com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber(jsonReader.nextString()));
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
        public final com.google.gson.JsonElement read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            java.lang.String str;
            com.google.gson.stream.JsonToken peek = jsonReader.peek();
            com.google.gson.JsonElement tryBeginNesting = tryBeginNesting(jsonReader, peek);
            if (tryBeginNesting == null) {
                return readTerminal(jsonReader, peek);
            }
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (tryBeginNesting instanceof com.google.gson.JsonObject) {
                        str = jsonReader.nextName();
                        if (!com.google.crypto.tink.internal.JsonParser.isValidString(str)) {
                            throw new java.io.IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    com.google.gson.stream.JsonToken peek2 = jsonReader.peek();
                    com.google.gson.JsonElement tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                    boolean z = tryBeginNesting2 != null;
                    com.google.gson.JsonElement readTerminal = tryBeginNesting2 == null ? readTerminal(jsonReader, peek2) : tryBeginNesting2;
                    if (tryBeginNesting instanceof com.google.gson.JsonArray) {
                        ((com.google.gson.JsonArray) tryBeginNesting).add(readTerminal);
                    } else {
                        com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) tryBeginNesting;
                        if (jsonObject.has(str)) {
                            throw new java.io.IOException("duplicate key: ".concat(java.lang.String.valueOf(str)));
                        }
                        jsonObject.add(str, readTerminal);
                    }
                    if (z) {
                        arrayDeque.addLast(tryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new java.io.IOException("too many recursions");
                        }
                        tryBeginNesting = readTerminal;
                    } else {
                        continue;
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
        public final void write(com.google.gson.stream.JsonWriter jsonWriter, com.google.gson.JsonElement jsonElement) {
            throw new java.lang.UnsupportedOperationException("write is not supported");
        }
    }

    /* renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
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

    public static com.google.gson.JsonElement parse(java.lang.String str) throws java.io.IOException {
        try {
            com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(new java.io.StringReader(str));
            jsonReader.setLenient(false);
            return JSON_ELEMENT.read2(jsonReader);
        } catch (java.lang.NumberFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long getParsedNumberAsLongOrThrow(java.lang.Number number) {
        if (!(number instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber)) {
            throw new java.lang.IllegalArgumentException("does not contain a parsed number.");
        }
        return java.lang.Long.parseLong(number.toString());
    }

    private JsonParser() {
    }
}
