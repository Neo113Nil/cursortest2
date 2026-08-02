package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class TypeAdapters {
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> ATOMIC_BOOLEAN;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> ATOMIC_INTEGER;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.math.BigDecimal> BIG_DECIMAL;
    public static final com.google.gson.TypeAdapter<java.math.BigInteger> BIG_INTEGER;
    public static final com.google.gson.TypeAdapter<java.util.BitSet> BIT_SET;
    public static final com.google.gson.TypeAdapterFactory BIT_SET_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN_AS_STRING;
    public static final com.google.gson.TypeAdapterFactory BOOLEAN_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> BYTE;
    public static final com.google.gson.TypeAdapterFactory BYTE_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.Calendar> CALENDAR;
    public static final com.google.gson.TypeAdapterFactory CALENDAR_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Character> CHARACTER;
    public static final com.google.gson.TypeAdapterFactory CHARACTER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Class> CLASS;
    public static final com.google.gson.TypeAdapterFactory CLASS_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.Currency> CURRENCY;
    public static final com.google.gson.TypeAdapterFactory CURRENCY_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> DOUBLE;
    public static final com.google.gson.TypeAdapterFactory ENUM_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> FLOAT;
    public static final com.google.gson.TypeAdapter<java.net.InetAddress> INET_ADDRESS;
    public static final com.google.gson.TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> INTEGER;
    public static final com.google.gson.TypeAdapterFactory INTEGER_FACTORY;
    public static final com.google.gson.TypeAdapter<com.google.gson.JsonElement> JSON_ELEMENT;
    public static final com.google.gson.TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final com.google.gson.TypeAdapter<com.google.gson.internal.LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final com.google.gson.TypeAdapter<java.util.Locale> LOCALE;
    public static final com.google.gson.TypeAdapterFactory LOCALE_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> LONG;
    public static final com.google.gson.TypeAdapter<java.lang.Number> SHORT;
    public static final com.google.gson.TypeAdapterFactory SHORT_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.String> STRING;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuffer> STRING_BUFFER;
    public static final com.google.gson.TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuilder> STRING_BUILDER;
    public static final com.google.gson.TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final com.google.gson.TypeAdapterFactory STRING_FACTORY;
    public static final com.google.gson.TypeAdapter<java.net.URI> URI;
    public static final com.google.gson.TypeAdapterFactory URI_FACTORY;
    public static final com.google.gson.TypeAdapter<java.net.URL> URL;
    public static final com.google.gson.TypeAdapterFactory URL_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.UUID> UUID;
    public static final com.google.gson.TypeAdapterFactory UUID_FACTORY;

    private TypeAdapters() {
        throw new java.lang.UnsupportedOperationException();
    }

    static {
        com.google.gson.TypeAdapter<java.lang.Class> nullSafe = new com.google.gson.TypeAdapter<java.lang.Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Class cls) throws java.io.IOException {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(cls.getName());
                sb.append(". Forgot to register a type adapter?\nSee ");
                sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Class read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ");
                sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("java-lang-class-unsupported"));
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(java.lang.Class.class, nullSafe);
        com.google.gson.TypeAdapter<java.util.BitSet> nullSafe2 = new com.google.gson.TypeAdapter<java.util.BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.BitSet read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.BitSet bitSet = new java.util.BitSet();
                jsonReader.beginArray();
                com.google.gson.stream.JsonToken peek = jsonReader.peek();
                int i = 0;
                while (peek != com.google.gson.stream.JsonToken.END_ARRAY) {
                    int i2 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass33.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt != 0) {
                            if (nextInt != 1) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid bitset value ");
                                sb.append(nextInt);
                                sb.append(", expected 0 or 1; at path ");
                                sb.append(jsonReader.getPreviousPath());
                                throw new com.google.gson.JsonSyntaxException(sb.toString());
                            }
                            bitSet.set(i);
                            i++;
                            peek = jsonReader.peek();
                        } else {
                            continue;
                            i++;
                            peek = jsonReader.peek();
                        }
                    } else if (i2 == 3) {
                        if (!jsonReader.nextBoolean()) {
                            i++;
                            peek = jsonReader.peek();
                        }
                        bitSet.set(i);
                        i++;
                        peek = jsonReader.peek();
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid bitset value type: ");
                        sb2.append(peek);
                        sb2.append("; at path ");
                        sb2.append(jsonReader.getPath());
                        throw new com.google.gson.JsonSyntaxException(sb2.toString());
                    }
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.BitSet bitSet) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(java.util.BitSet.class, nullSafe2);
        com.google.gson.TypeAdapter<java.lang.Boolean> typeAdapter = new com.google.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Boolean read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.google.gson.stream.JsonToken peek = jsonReader.peek();
                if (peek == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == com.google.gson.stream.JsonToken.STRING) {
                    return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(jsonReader.nextString()));
                }
                return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new com.google.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Boolean read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(java.lang.Boolean.TYPE, java.lang.Boolean.class, typeAdapter);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter2 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > 255 || nextInt < -128) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lossy conversion from ");
                        sb.append(nextInt);
                        sb.append(" to byte; at path ");
                        sb.append(jsonReader.getPreviousPath());
                        throw new com.google.gson.JsonSyntaxException(sb.toString());
                    }
                    return java.lang.Byte.valueOf((byte) nextInt);
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = newFactory(java.lang.Byte.TYPE, java.lang.Byte.class, typeAdapter2);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter3 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > 65535 || nextInt < -32768) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lossy conversion from ");
                        sb.append(nextInt);
                        sb.append(" to short; at path ");
                        sb.append(jsonReader.getPreviousPath());
                        throw new com.google.gson.JsonSyntaxException(sb.toString());
                    }
                    return java.lang.Short.valueOf((short) nextInt);
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = newFactory(java.lang.Short.TYPE, java.lang.Short.class, typeAdapter3);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter4 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = newFactory(java.lang.Integer.TYPE, java.lang.Integer.class, typeAdapter4);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> nullSafe3 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicInteger read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws java.io.IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(java.util.concurrent.atomic.AtomicInteger.class, nullSafe3);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> nullSafe4 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicBoolean read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) throws java.io.IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(java.util.concurrent.atomic.AtomicBoolean.class, nullSafe4);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> nullSafe5 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicIntegerArray read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(jsonReader.nextInt()));
                    } catch (java.lang.NumberFormatException e) {
                        throw new com.google.gson.JsonSyntaxException(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray = new java.util.concurrent.atomic.AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((java.lang.Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(java.util.concurrent.atomic.AtomicIntegerArray.class, nullSafe5);
        LONG = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(jsonReader.nextLong());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        FLOAT = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(number instanceof java.lang.Float)) {
                    number = java.lang.Float.valueOf(number.floatValue());
                }
                jsonWriter.value(number);
            }
        };
        DOUBLE = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        com.google.gson.TypeAdapter<java.lang.Character> typeAdapter5 = new com.google.gson.TypeAdapter<java.lang.Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Character read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                if (nextString.length() != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expecting character, got: ");
                    sb.append(nextString);
                    sb.append("; at ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString());
                }
                return java.lang.Character.valueOf(nextString.charAt(0));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Character ch) throws java.io.IOException {
                jsonWriter.value(ch == null ? null : java.lang.String.valueOf(ch));
            }
        };
        CHARACTER = typeAdapter5;
        CHARACTER_FACTORY = newFactory(java.lang.Character.TYPE, java.lang.Character.class, typeAdapter5);
        com.google.gson.TypeAdapter<java.lang.String> typeAdapter6 = new com.google.gson.TypeAdapter<java.lang.String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.String read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.google.gson.stream.JsonToken peek = jsonReader.peek();
                if (peek == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == com.google.gson.stream.JsonToken.BOOLEAN) {
                    return java.lang.Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.String str) throws java.io.IOException {
                jsonWriter.value(str);
            }
        };
        STRING = typeAdapter6;
        BIG_DECIMAL = new com.google.gson.TypeAdapter<java.math.BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.math.BigDecimal read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return com.google.gson.internal.NumberLimits.parseBigDecimal(nextString);
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as BigDecimal; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.math.BigDecimal bigDecimal) throws java.io.IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new com.google.gson.TypeAdapter<java.math.BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.math.BigInteger read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return com.google.gson.internal.NumberLimits.parseBigInteger(nextString);
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as BigInteger; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.math.BigInteger bigInteger) throws java.io.IOException {
                jsonWriter.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new com.google.gson.TypeAdapter<com.google.gson.internal.LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public com.google.gson.internal.LazilyParsedNumber read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber) throws java.io.IOException {
                jsonWriter.value(lazilyParsedNumber);
            }
        };
        STRING_FACTORY = newFactory(java.lang.String.class, typeAdapter6);
        com.google.gson.TypeAdapter<java.lang.StringBuilder> typeAdapter7 = new com.google.gson.TypeAdapter<java.lang.StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.StringBuilder read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuilder(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.StringBuilder sb) throws java.io.IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = typeAdapter7;
        STRING_BUILDER_FACTORY = newFactory(java.lang.StringBuilder.class, typeAdapter7);
        com.google.gson.TypeAdapter<java.lang.StringBuffer> typeAdapter8 = new com.google.gson.TypeAdapter<java.lang.StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.StringBuffer read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuffer(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.StringBuffer stringBuffer) throws java.io.IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = typeAdapter8;
        STRING_BUFFER_FACTORY = newFactory(java.lang.StringBuffer.class, typeAdapter8);
        com.google.gson.TypeAdapter<java.net.URL> typeAdapter9 = new com.google.gson.TypeAdapter<java.net.URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.URL read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                if (nextString.equals("null")) {
                    return null;
                }
                return new java.net.URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.URL url) throws java.io.IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = typeAdapter9;
        URL_FACTORY = newFactory(java.net.URL.class, typeAdapter9);
        com.google.gson.TypeAdapter<java.net.URI> typeAdapter10 = new com.google.gson.TypeAdapter<java.net.URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.URI read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    java.lang.String nextString = jsonReader.nextString();
                    if (nextString.equals("null")) {
                        return null;
                    }
                    return new java.net.URI(nextString);
                } catch (java.net.URISyntaxException e) {
                    throw new com.google.gson.JsonIOException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.URI uri) throws java.io.IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = typeAdapter10;
        URI_FACTORY = newFactory(java.net.URI.class, typeAdapter10);
        com.google.gson.TypeAdapter<java.net.InetAddress> typeAdapter11 = new com.google.gson.TypeAdapter<java.net.InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.InetAddress read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.net.InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.InetAddress inetAddress) throws java.io.IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = typeAdapter11;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java.net.InetAddress.class, typeAdapter11);
        com.google.gson.TypeAdapter<java.util.UUID> typeAdapter12 = new com.google.gson.TypeAdapter<java.util.UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.UUID read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return java.util.UUID.fromString(nextString);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as UUID; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.UUID uuid) throws java.io.IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = typeAdapter12;
        UUID_FACTORY = newFactory(java.util.UUID.class, typeAdapter12);
        com.google.gson.TypeAdapter<java.util.Currency> nullSafe6 = new com.google.gson.TypeAdapter<java.util.Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Currency read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return java.util.Currency.getInstance(nextString);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as Currency; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Currency currency) throws java.io.IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(java.util.Currency.class, nullSafe6);
        com.google.gson.TypeAdapter<java.util.Calendar> typeAdapter13 = new com.google.gson.TypeAdapter<java.util.Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            private static final java.lang.String DAY_OF_MONTH = "dayOfMonth";
            private static final java.lang.String HOUR_OF_DAY = "hourOfDay";
            private static final java.lang.String MINUTE = "minute";
            private static final java.lang.String MONTH = "month";
            private static final java.lang.String SECOND = "second";
            private static final java.lang.String YEAR = "year";

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Calendar read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                char c;
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != com.google.gson.stream.JsonToken.END_OBJECT) {
                    java.lang.String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1181204563:
                            if (nextName.equals(DAY_OF_MONTH)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1074026988:
                            if (nextName.equals(MINUTE)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -906279820:
                            if (nextName.equals(SECOND)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3704893:
                            if (nextName.equals("year")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104080000:
                            if (nextName.equals(MONTH)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 985252545:
                            if (nextName.equals(HOUR_OF_DAY)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i3 = nextInt;
                    } else if (c == 1) {
                        i5 = nextInt;
                    } else if (c == 2) {
                        i6 = nextInt;
                    } else if (c == 3) {
                        i = nextInt;
                    } else if (c == 4) {
                        i2 = nextInt;
                    } else if (c == 5) {
                        i4 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new java.util.GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Calendar calendar) throws java.io.IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = typeAdapter13;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(java.util.Calendar.class, java.util.GregorianCalendar.class, typeAdapter13);
        com.google.gson.TypeAdapter<java.util.Locale> typeAdapter14 = new com.google.gson.TypeAdapter<java.util.Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Locale read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(jsonReader.nextString(), "_");
                java.lang.String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new java.util.Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new java.util.Locale(nextToken, nextToken2);
                }
                return new java.util.Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Locale locale) throws java.io.IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = typeAdapter14;
        LOCALE_FACTORY = newFactory(java.util.Locale.class, typeAdapter14);
        com.google.gson.internal.bind.JsonElementTypeAdapter jsonElementTypeAdapter = com.google.gson.internal.bind.JsonElementTypeAdapter.ADAPTER;
        JSON_ELEMENT = jsonElementTypeAdapter;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com.google.gson.JsonElement.class, jsonElementTypeAdapter);
        ENUM_FACTORY = com.google.gson.internal.bind.EnumTypeAdapter.FACTORY;
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    static /* synthetic */ class AnonymousClass33 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.STRING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final com.google.gson.reflect.TypeToken<TT> typeToken, final com.google.gson.TypeAdapter<TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken2) {
                if (typeToken2.equals(com.google.gson.reflect.TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final com.google.gson.TypeAdapter<TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final java.lang.Class<TT> cls2, final com.google.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactoryForMultipleTypes(final java.lang.Class<TT> cls, final java.lang.Class<? extends TT> cls2, final com.google.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <T1> com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(final java.lang.Class<T1> cls, final com.google.gson.TypeAdapter<T1> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public <T2> com.google.gson.TypeAdapter<T2> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T2> typeToken) {
                final java.lang.Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (com.google.gson.TypeAdapter<T2>) new com.google.gson.TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public void write(com.google.gson.stream.JsonWriter jsonWriter, T1 t1) throws java.io.IOException {
                            typeAdapter.write(jsonWriter, t1);
                        }

                        @Override // com.google.gson.TypeAdapter
                        /* renamed from: read */
                        public T1 read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                            T1 t1 = (T1) typeAdapter.read2(jsonReader);
                            if (t1 == null || rawType.isInstance(t1)) {
                                return t1;
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a ");
                            sb.append(rawType.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            sb.append("; at path ");
                            sb.append(jsonReader.getPreviousPath());
                            throw new com.google.gson.JsonSyntaxException(sb.toString());
                        }
                    };
                }
                return null;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(typeAdapter);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
