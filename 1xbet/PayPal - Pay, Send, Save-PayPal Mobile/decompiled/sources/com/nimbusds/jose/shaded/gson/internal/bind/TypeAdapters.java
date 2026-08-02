package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class TypeAdapters {
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> ATOMIC_BOOLEAN;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> ATOMIC_INTEGER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.math.BigDecimal> BIG_DECIMAL;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.math.BigInteger> BIG_INTEGER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.BitSet> BIT_SET;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory BIT_SET_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Boolean> BOOLEAN;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Boolean> BOOLEAN_AS_STRING;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory BOOLEAN_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> BYTE;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory BYTE_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Calendar> CALENDAR;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory CALENDAR_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Character> CHARACTER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory CHARACTER_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Class> CLASS;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory CLASS_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Currency> CURRENCY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory CURRENCY_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> DOUBLE;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory ENUM_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> FLOAT;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.InetAddress> INET_ADDRESS;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> INTEGER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory INTEGER_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<com.nimbusds.jose.shaded.gson.JsonElement> JSON_ELEMENT;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber> LAZILY_PARSED_NUMBER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Locale> LOCALE;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory LOCALE_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> LONG;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> SHORT;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory SHORT_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.String> STRING;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuffer> STRING_BUFFER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuilder> STRING_BUILDER;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory STRING_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URI> URI;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory URI_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URL> URL;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory URL_FACTORY;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.UUID> UUID;
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory UUID_FACTORY;

    private TypeAdapters() {
        throw new java.lang.UnsupportedOperationException();
    }

    static {
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Class> nullSafe = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Class>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Class cls) throws java.io.IOException {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempted to serialize java.lang.Class: ");
                sb.append(cls.getName());
                sb.append(". Forgot to register a type adapter?");
                throw new java.lang.UnsupportedOperationException(sb.toString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Class read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(java.lang.Class.class, nullSafe);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.BitSet> nullSafe2 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.BitSet>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.2
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.BitSet read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.BitSet bitSet = new java.util.BitSet();
                jsonReader.beginArray();
                com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
                int i = 0;
                while (peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY) {
                    int i2 = com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt != 0) {
                            if (nextInt != 1) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid bitset value ");
                                sb.append(nextInt);
                                sb.append(", expected 0 or 1; at path ");
                                sb.append(jsonReader.getPreviousPath());
                                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
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
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb2.toString());
                    }
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.BitSet bitSet) throws java.io.IOException {
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
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Boolean> typeAdapter = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Boolean read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
                if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING) {
                    return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(jsonReader.nextString()));
                }
                return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Boolean read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(java.lang.Boolean.TYPE, java.lang.Boolean.class, typeAdapter);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> typeAdapter2 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
                    }
                    return java.lang.Byte.valueOf((byte) nextInt);
                } catch (java.lang.NumberFormatException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = newFactory(java.lang.Byte.TYPE, java.lang.Byte.class, typeAdapter2);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> typeAdapter3 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
                    }
                    return java.lang.Short.valueOf((short) nextInt);
                } catch (java.lang.NumberFormatException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = newFactory(java.lang.Short.TYPE, java.lang.Short.class, typeAdapter3);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> typeAdapter4 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = newFactory(java.lang.Integer.TYPE, java.lang.Integer.class, typeAdapter4);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> nullSafe3 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.8
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicInteger read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws java.io.IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(java.util.concurrent.atomic.AtomicInteger.class, nullSafe3);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> nullSafe4 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.9
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicBoolean read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) throws java.io.IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(java.util.concurrent.atomic.AtomicBoolean.class, nullSafe4);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> nullSafe5 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.10
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicIntegerArray read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(jsonReader.nextInt()));
                    } catch (java.lang.NumberFormatException e) {
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
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

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) throws java.io.IOException {
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
        LONG = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(jsonReader.nextLong());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }
        };
        FLOAT = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
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
        DOUBLE = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }
        };
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Character> typeAdapter5 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Character>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Character read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                if (nextString.length() != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expecting character, got: ");
                    sb.append(nextString);
                    sb.append("; at ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
                }
                return java.lang.Character.valueOf(nextString.charAt(0));
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Character ch) throws java.io.IOException {
                jsonWriter.value(ch == null ? null : java.lang.String.valueOf(ch));
            }
        };
        CHARACTER = typeAdapter5;
        CHARACTER_FACTORY = newFactory(java.lang.Character.TYPE, java.lang.Character.class, typeAdapter5);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.String> typeAdapter6 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.String>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.15
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.String read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
                if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.BOOLEAN) {
                    return java.lang.Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.String str) throws java.io.IOException {
                jsonWriter.value(str);
            }
        };
        STRING = typeAdapter6;
        BIG_DECIMAL = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.math.BigDecimal>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.16
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.math.BigDecimal read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return new java.math.BigDecimal(nextString);
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as BigDecimal; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.math.BigDecimal bigDecimal) throws java.io.IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.math.BigInteger>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.17
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.math.BigInteger read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return new java.math.BigInteger(nextString);
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as BigInteger; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.math.BigInteger bigInteger) throws java.io.IOException {
                jsonWriter.value(bigInteger);
            }
        };
        LAZILY_PARSED_NUMBER = new com.nimbusds.jose.shaded.gson.TypeAdapter<com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber(jsonReader.nextString());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber lazilyParsedNumber) throws java.io.IOException {
                jsonWriter.value(lazilyParsedNumber);
            }
        };
        STRING_FACTORY = newFactory(java.lang.String.class, typeAdapter6);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuilder> typeAdapter7 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuilder>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.19
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.StringBuilder read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuilder(jsonReader.nextString());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.StringBuilder sb) throws java.io.IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = typeAdapter7;
        STRING_BUILDER_FACTORY = newFactory(java.lang.StringBuilder.class, typeAdapter7);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuffer> typeAdapter8 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.StringBuffer>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.20
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.lang.StringBuffer read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuffer(jsonReader.nextString());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.StringBuffer stringBuffer) throws java.io.IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = typeAdapter8;
        STRING_BUFFER_FACTORY = newFactory(java.lang.StringBuffer.class, typeAdapter8);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URL> typeAdapter9 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URL>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.21
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.URL read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new java.net.URL(nextString);
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.net.URL url) throws java.io.IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = typeAdapter9;
        URL_FACTORY = newFactory(java.net.URL.class, typeAdapter9);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URI> typeAdapter10 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.URI>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.22
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.URI read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    java.lang.String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new java.net.URI(nextString);
                } catch (java.net.URISyntaxException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.net.URI uri) throws java.io.IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = typeAdapter10;
        URI_FACTORY = newFactory(java.net.URI.class, typeAdapter10);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.InetAddress> typeAdapter11 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.net.InetAddress>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.23
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.net.InetAddress read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.net.InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.net.InetAddress inetAddress) throws java.io.IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = typeAdapter11;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java.net.InetAddress.class, typeAdapter11);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.UUID> typeAdapter12 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.UUID>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.24
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.UUID read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.UUID uuid) throws java.io.IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = typeAdapter12;
        UUID_FACTORY = newFactory(java.util.UUID.class, typeAdapter12);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Currency> nullSafe6 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Currency>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.25
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Currency read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.lang.String nextString = jsonReader.nextString();
                try {
                    return java.util.Currency.getInstance(nextString);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as Currency; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Currency currency) throws java.io.IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(java.util.Currency.class, nullSafe6);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Calendar> typeAdapter13 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Calendar>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.26
            private static final java.lang.String DAY_OF_MONTH = "dayOfMonth";
            private static final java.lang.String HOUR_OF_DAY = "hourOfDay";
            private static final java.lang.String MINUTE = "minute";
            private static final java.lang.String MONTH = "month";
            private static final java.lang.String SECOND = "second";
            private static final java.lang.String YEAR = "year";

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Calendar read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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
                while (jsonReader.peek() != com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT) {
                    java.lang.String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i = nextInt;
                    } else if (MONTH.equals(nextName)) {
                        i2 = nextInt;
                    } else if (DAY_OF_MONTH.equals(nextName)) {
                        i3 = nextInt;
                    } else if (HOUR_OF_DAY.equals(nextName)) {
                        i4 = nextInt;
                    } else if (MINUTE.equals(nextName)) {
                        i5 = nextInt;
                    } else if (SECOND.equals(nextName)) {
                        i6 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new java.util.GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Calendar calendar) throws java.io.IOException {
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
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Locale> typeAdapter14 = new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Locale>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.27
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.Locale read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
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

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Locale locale) throws java.io.IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = typeAdapter14;
        LOCALE_FACTORY = newFactory(java.util.Locale.class, typeAdapter14);
        com.nimbusds.jose.shaded.gson.TypeAdapter<com.nimbusds.jose.shaded.gson.JsonElement> typeAdapter15 = new com.nimbusds.jose.shaded.gson.TypeAdapter<com.nimbusds.jose.shaded.gson.JsonElement>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.28
            private com.nimbusds.jose.shaded.gson.JsonElement tryBeginNesting(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.stream.JsonToken jsonToken) throws java.io.IOException {
                int i = com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i == 4) {
                    jsonReader.beginArray();
                    return new com.nimbusds.jose.shaded.gson.JsonArray();
                }
                if (i != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new com.nimbusds.jose.shaded.gson.JsonObject();
            }

            private com.nimbusds.jose.shaded.gson.JsonElement readTerminal(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.stream.JsonToken jsonToken) throws java.io.IOException {
                int i = com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.AnonymousClass35.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
                if (i == 1) {
                    return new com.nimbusds.jose.shaded.gson.JsonPrimitive(new com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber(jsonReader.nextString()));
                }
                if (i == 2) {
                    return new com.nimbusds.jose.shaded.gson.JsonPrimitive(jsonReader.nextString());
                }
                if (i == 3) {
                    return new com.nimbusds.jose.shaded.gson.JsonPrimitive(java.lang.Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i == 6) {
                    jsonReader.nextNull();
                    return com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
                }
                throw new java.lang.IllegalStateException("Unexpected token: ".concat(java.lang.String.valueOf(jsonToken)));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public com.nimbusds.jose.shaded.gson.JsonElement read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader instanceof com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader) {
                    return ((com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader) jsonReader).nextJsonElement();
                }
                com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
                com.nimbusds.jose.shaded.gson.JsonElement tryBeginNesting = tryBeginNesting(jsonReader, peek);
                if (tryBeginNesting == null) {
                    return readTerminal(jsonReader, peek);
                }
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        java.lang.String nextName = tryBeginNesting instanceof com.nimbusds.jose.shaded.gson.JsonObject ? jsonReader.nextName() : null;
                        com.nimbusds.jose.shaded.gson.stream.JsonToken peek2 = jsonReader.peek();
                        com.nimbusds.jose.shaded.gson.JsonElement tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                        boolean z = tryBeginNesting2 != null;
                        com.nimbusds.jose.shaded.gson.JsonElement readTerminal = tryBeginNesting2 == null ? readTerminal(jsonReader, peek2) : tryBeginNesting2;
                        if (tryBeginNesting instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
                            ((com.nimbusds.jose.shaded.gson.JsonArray) tryBeginNesting).add(readTerminal);
                        } else {
                            ((com.nimbusds.jose.shaded.gson.JsonObject) tryBeginNesting).add(nextName, readTerminal);
                        }
                        if (z) {
                            arrayDeque.addLast(tryBeginNesting);
                            tryBeginNesting = readTerminal;
                        }
                    } else {
                        if (tryBeginNesting instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return tryBeginNesting;
                        }
                        tryBeginNesting = (com.nimbusds.jose.shaded.gson.JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, com.nimbusds.jose.shaded.gson.JsonElement jsonElement) throws java.io.IOException {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (jsonElement.isJsonPrimitive()) {
                    com.nimbusds.jose.shaded.gson.JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
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
                    java.util.Iterator<com.nimbusds.jose.shaded.gson.JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<java.lang.String, com.nimbusds.jose.shaded.gson.JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
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
        };
        JSON_ELEMENT = typeAdapter15;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com.nimbusds.jose.shaded.gson.JsonElement.class, typeAdapter15);
        ENUM_FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.29
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (!java.lang.Enum.class.isAssignableFrom(rawType) || rawType == java.lang.Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.EnumTypeAdapter(rawType);
            }
        };
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters$35, reason: invalid class name */
    static /* synthetic */ class AnonymousClass35 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.nimbusds.jose.shaded.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static final class EnumTypeAdapter<T extends java.lang.Enum<T>> extends com.nimbusds.jose.shaded.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, T> nameToConstant = new java.util.HashMap();
        private final java.util.Map<java.lang.String, T> stringToConstant = new java.util.HashMap();
        private final java.util.Map<T, java.lang.String> constantToName = new java.util.HashMap();

        public EnumTypeAdapter(final java.lang.Class<T> cls) {
            try {
                for (java.lang.reflect.Field field : (java.lang.reflect.Field[]) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.reflect.Field[]>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                    @Override // java.security.PrivilegedAction
                    public java.lang.reflect.Field[] run() {
                        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
                        java.util.ArrayList arrayList = new java.util.ArrayList(declaredFields.length);
                        for (java.lang.reflect.Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        java.lang.reflect.Field[] fieldArr = (java.lang.reflect.Field[]) arrayList.toArray(new java.lang.reflect.Field[0]);
                        java.lang.reflect.AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    java.lang.Enum r4 = (java.lang.Enum) field.get(null);
                    java.lang.String name2 = r4.name();
                    java.lang.String obj = r4.toString();
                    com.nimbusds.jose.shaded.gson.annotations.SerializedName serializedName = (com.nimbusds.jose.shaded.gson.annotations.SerializedName) field.getAnnotation(com.nimbusds.jose.shaded.gson.annotations.SerializedName.class);
                    if (serializedName != null) {
                        name2 = serializedName.value();
                        for (java.lang.String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, r4);
                        }
                    }
                    this.nameToConstant.put(name2, r4);
                    this.stringToConstant.put(obj, r4);
                    this.constantToName.put(r4, name2);
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /* renamed from: read */
        public final T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            java.lang.String nextString = jsonReader.nextString();
            T t = this.nameToConstant.get(nextString);
            return t == null ? this.stringToConstant.get(nextString) : t;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            jsonWriter.value(t == null ? null : this.constantToName.get(t));
        }
    }

    public static <TT> com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactory(final com.nimbusds.jose.shaded.gson.reflect.TypeToken<TT> typeToken, final com.nimbusds.jose.shaded.gson.TypeAdapter<TT> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.30
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken2) {
                if (typeToken2.equals(com.nimbusds.jose.shaded.gson.reflect.TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final com.nimbusds.jose.shaded.gson.TypeAdapter<TT> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.31
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
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

    public static <TT> com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final java.lang.Class<TT> cls2, final com.nimbusds.jose.shaded.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.32
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
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

    public static <TT> com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactoryForMultipleTypes(final java.lang.Class<TT> cls, final java.lang.Class<? extends TT> cls2, final com.nimbusds.jose.shaded.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.33
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
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

    public static <T1> com.nimbusds.jose.shaded.gson.TypeAdapterFactory newTypeHierarchyFactory(final java.lang.Class<T1> cls, final com.nimbusds.jose.shaded.gson.TypeAdapter<T1> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.34
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T2> com.nimbusds.jose.shaded.gson.TypeAdapter<T2> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T2> typeToken) {
                final java.lang.Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (com.nimbusds.jose.shaded.gson.TypeAdapter<T2>) new com.nimbusds.jose.shaded.gson.TypeAdapter<T1>() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
                        public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T1 t1) throws java.io.IOException {
                            typeAdapter.write(jsonWriter, t1);
                        }

                        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
                        /* renamed from: read */
                        public T1 read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
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
                            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
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
