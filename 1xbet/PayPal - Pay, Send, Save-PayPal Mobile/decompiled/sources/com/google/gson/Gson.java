package com.google.gson;

/* loaded from: classes.dex */
public class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    public static final com.google.gson.Strictness DEFAULT_STRICTNESS = null;
    public static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    public static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    public final java.util.List<com.google.gson.TypeAdapterFactory> builderFactories;
    public final java.util.List<com.google.gson.TypeAdapterFactory> builderHierarchyFactories;
    public final boolean complexMapKeySerialization;
    public final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    public final java.lang.String datePattern;
    public final int dateStyle;
    public final com.google.gson.internal.Excluder excluder;
    public final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    public final com.google.gson.FieldNamingStrategy fieldNamingStrategy;
    public final com.google.gson.FormattingStyle formattingStyle;
    public final boolean generateNonExecutableJson;
    public final boolean htmlSafe;
    public final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    public final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    public final com.google.gson.LongSerializationPolicy longSerializationPolicy;
    public final com.google.gson.ToNumberStrategy numberToNumberStrategy;
    public final com.google.gson.ToNumberStrategy objectToNumberStrategy;
    public final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    public final boolean serializeNulls;
    public final boolean serializeSpecialFloatingPointValues;
    public final com.google.gson.Strictness strictness;
    public final java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> threadLocalAdapterResults;
    public final int timeStyle;
    public final java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> typeTokenCache;
    public final boolean useJdkUnsafe;
    public static final com.google.gson.FormattingStyle DEFAULT_FORMATTING_STYLE = com.google.gson.FormattingStyle.COMPACT;
    public static final java.lang.String DEFAULT_DATE_PATTERN = null;
    public static final com.google.gson.FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = com.google.gson.FieldNamingPolicy.IDENTITY;
    public static final com.google.gson.ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = com.google.gson.ToNumberPolicy.DOUBLE;
    public static final com.google.gson.ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public Gson() {
        this(com.google.gson.internal.Excluder.DEFAULT, DEFAULT_FIELD_NAMING_STRATEGY, java.util.Collections.emptyMap(), false, false, false, true, DEFAULT_FORMATTING_STYLE, DEFAULT_STRICTNESS, false, true, com.google.gson.LongSerializationPolicy.DEFAULT, DEFAULT_DATE_PATTERN, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, java.util.Collections.emptyList());
    }

    Gson(com.google.gson.internal.Excluder excluder, com.google.gson.FieldNamingStrategy fieldNamingStrategy, java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, com.google.gson.FormattingStyle formattingStyle, com.google.gson.Strictness strictness, boolean z5, boolean z6, com.google.gson.LongSerializationPolicy longSerializationPolicy, java.lang.String str, int i, int i2, java.util.List<com.google.gson.TypeAdapterFactory> list, java.util.List<com.google.gson.TypeAdapterFactory> list2, java.util.List<com.google.gson.TypeAdapterFactory> list3, com.google.gson.ToNumberStrategy toNumberStrategy, com.google.gson.ToNumberStrategy toNumberStrategy2, java.util.List<com.google.gson.ReflectionAccessFilter> list4) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list3);
        arrayList.add(new o.getInputFormats());
        this.threadLocalAdapterResults = new java.lang.ThreadLocal<>();
        this.typeTokenCache = new java.util.concurrent.ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        com.google.gson.internal.ConstructorConstructor constructorConstructor = new com.google.gson.internal.ConstructorConstructor(map, z6, list4);
        this.constructorConstructor = constructorConstructor;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.formattingStyle = formattingStyle;
        this.strictness = strictness;
        this.serializeSpecialFloatingPointValues = z5;
        this.useJdkUnsafe = z6;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = toNumberStrategy;
        this.numberToNumberStrategy = toNumberStrategy2;
        this.reflectionFilters = list4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.ObjectTypeAdapter.getFactory(toNumberStrategy));
        arrayList2.add(excluder);
        arrayList2.addAll(arrayList);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY);
        com.google.gson.TypeAdapter<java.lang.Number> longAdapter = longAdapter(longSerializationPolicy);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.lang.Long.TYPE, java.lang.Long.class, longAdapter));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.lang.Double.TYPE, java.lang.Double.class, doubleAdapter(z5)));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.lang.Float.TYPE, java.lang.Float.class, floatAdapter(z5)));
        arrayList2.add(com.google.gson.internal.bind.NumberTypeAdapter.getFactory(toNumberStrategy2));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.util.concurrent.atomic.AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.util.concurrent.atomic.AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.math.BigDecimal.class, com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(java.math.BigInteger.class, com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.newFactory(com.google.gson.internal.LazilyParsedNumber.class, com.google.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.URL_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.URI_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY);
        if (com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList2.add(com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY);
            arrayList2.add(com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY);
            arrayList2.add(com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList2.add(com.google.gson.internal.bind.ArrayTypeAdapter.FACTORY);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY);
        arrayList2.add(new com.google.gson.internal.bind.CollectionTypeAdapterFactory(constructorConstructor));
        arrayList2.add(new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor, z2));
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList2.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList2.add(com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY);
        arrayList2.add(new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = java.util.Collections.unmodifiableList(arrayList2);
    }

    public com.google.gson.GsonBuilder newBuilder() {
        return new com.google.gson.GsonBuilder(this);
    }

    @java.lang.Deprecated
    public com.google.gson.internal.Excluder excluder() {
        return this.excluder;
    }

    public com.google.gson.FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    private com.google.gson.TypeAdapter<java.lang.Number> doubleAdapter(boolean z) {
        if (z) {
            return com.google.gson.internal.bind.TypeAdapters.DOUBLE;
        }
        return new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: merged with bridge method [inline-methods] */
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
                    return;
                }
                double doubleValue = number.doubleValue();
                com.google.gson.Gson.checkValidFloatingPoint(doubleValue);
                jsonWriter.value(doubleValue);
            }
        };
    }

    private com.google.gson.TypeAdapter<java.lang.Number> floatAdapter(boolean z) {
        if (z) {
            return com.google.gson.internal.bind.TypeAdapters.FLOAT;
        }
        return new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.Gson.2
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
                float floatValue = number.floatValue();
                com.google.gson.Gson.checkValidFloatingPoint(floatValue);
                if (!(number instanceof java.lang.Float)) {
                    number = java.lang.Float.valueOf(floatValue);
                }
                jsonWriter.value(number);
            }
        };
    }

    static void checkValidFloatingPoint(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private static com.google.gson.TypeAdapter<java.lang.Number> longAdapter(com.google.gson.LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == com.google.gson.LongSerializationPolicy.DEFAULT) {
            return com.google.gson.internal.bind.TypeAdapters.LONG;
        }
        return new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.Gson.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Long.valueOf(jsonReader.nextLong());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong> atomicLongAdapter(final com.google.gson.TypeAdapter<java.lang.Number> typeAdapter) {
        return new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicLong atomicLong) throws java.io.IOException {
                com.google.gson.TypeAdapter.this.write(jsonWriter, java.lang.Long.valueOf(atomicLong.get()));
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicLong read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) com.google.gson.TypeAdapter.this.read2(jsonReader)).longValue());
            }
        }.nullSafe();
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray> atomicLongArrayAdapter(final com.google.gson.TypeAdapter<java.lang.Number> typeAdapter) {
        return new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicLongArray atomicLongArray) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    com.google.gson.TypeAdapter.this.write(jsonWriter, java.lang.Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicLongArray read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((java.lang.Number) com.google.gson.TypeAdapter.this.read2(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((java.lang.Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.nullSafe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r2.setDelegate(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> com.google.gson.TypeAdapter<T> getAdapter(com.google.gson.reflect.TypeToken<T> typeToken) {
        boolean z;
        java.util.Objects.requireNonNull(typeToken, "type must not be null");
        com.google.gson.TypeAdapter<T> typeAdapter = (com.google.gson.TypeAdapter) this.typeTokenCache.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        java.util.Map<? extends com.google.gson.reflect.TypeToken<?>, ? extends com.google.gson.TypeAdapter<?>> map = this.threadLocalAdapterResults.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.threadLocalAdapterResults.set(map);
            z = true;
        } else {
            com.google.gson.TypeAdapter<T> typeAdapter2 = (com.google.gson.TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z = false;
        }
        try {
            com.google.gson.Gson.FutureTypeAdapter futureTypeAdapter = new com.google.gson.Gson.FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            java.util.Iterator<com.google.gson.TypeAdapterFactory> it = this.factories.iterator();
            com.google.gson.TypeAdapter<T> typeAdapter3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                typeAdapter3 = it.next().create(this, typeToken);
                if (typeAdapter3 != null) {
                    break;
                }
            }
            if (typeAdapter3 == null) {
                throw new java.lang.IllegalArgumentException("GSON (2.13.2) cannot handle ".concat(java.lang.String.valueOf(typeToken)));
            }
            if (z) {
                this.typeTokenCache.putAll(map);
            }
            return typeAdapter3;
        } finally {
            if (z) {
                this.threadLocalAdapterResults.remove();
            }
        }
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(java.lang.Class<T> cls) {
        return getAdapter(com.google.gson.reflect.TypeToken.get((java.lang.Class) cls));
    }

    public <T> com.google.gson.TypeAdapter<T> getDelegateAdapter(com.google.gson.TypeAdapterFactory typeAdapterFactory, com.google.gson.reflect.TypeToken<T> typeToken) {
        java.util.Objects.requireNonNull(typeAdapterFactory, "skipPast must not be null");
        java.util.Objects.requireNonNull(typeToken, "type must not be null");
        if (this.jsonAdapterFactory.isClassJsonAdapterFactory(typeToken, typeAdapterFactory)) {
            typeAdapterFactory = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (com.google.gson.TypeAdapterFactory typeAdapterFactory2 : this.factories) {
            if (z) {
                com.google.gson.TypeAdapter<T> create = typeAdapterFactory2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        if (z) {
            throw new java.lang.IllegalArgumentException("GSON cannot serialize or deserialize ".concat(java.lang.String.valueOf(typeToken)));
        }
        return getAdapter(typeToken);
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object obj) {
        if (obj == null) {
            return com.google.gson.JsonNull.INSTANCE;
        }
        return toJsonTree(obj, obj.getClass());
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object obj, java.lang.reflect.Type type) {
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter = new com.google.gson.internal.bind.JsonTreeWriter();
        toJson(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public java.lang.String toJson(java.lang.Object obj) {
        if (obj == null) {
            return toJson((com.google.gson.JsonElement) com.google.gson.JsonNull.INSTANCE);
        }
        return toJson(obj, obj.getClass());
    }

    public java.lang.String toJson(java.lang.Object obj, java.lang.reflect.Type type) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        toJson(obj, type, sb);
        return sb.toString();
    }

    public void toJson(java.lang.Object obj, java.lang.Appendable appendable) throws com.google.gson.JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((com.google.gson.JsonElement) com.google.gson.JsonNull.INSTANCE, appendable);
        }
    }

    public void toJson(java.lang.Object obj, java.lang.reflect.Type type, java.lang.Appendable appendable) throws com.google.gson.JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(com.google.gson.internal.Streams.writerForAppendable(appendable)));
        } catch (java.io.IOException e) {
            throw new com.google.gson.JsonIOException(e);
        }
    }

    public void toJson(java.lang.Object obj, java.lang.reflect.Type type, com.google.gson.stream.JsonWriter jsonWriter) throws com.google.gson.JsonIOException {
        com.google.gson.TypeAdapter adapter = getAdapter(com.google.gson.reflect.TypeToken.get(type));
        com.google.gson.Strictness strictness = jsonWriter.getStrictness();
        com.google.gson.Strictness strictness2 = this.strictness;
        if (strictness2 != null) {
            jsonWriter.setStrictness(strictness2);
        } else if (jsonWriter.getStrictness() == com.google.gson.Strictness.LEGACY_STRICT) {
            jsonWriter.setStrictness(com.google.gson.Strictness.LENIENT);
        }
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                try {
                    adapter.write(jsonWriter, obj);
                } catch (java.lang.AssertionError e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.13.2): ");
                    sb.append(e.getMessage());
                    throw new java.lang.AssertionError(sb.toString(), e);
                }
            } catch (java.io.IOException e2) {
                throw new com.google.gson.JsonIOException(e2);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public java.lang.String toJson(com.google.gson.JsonElement jsonElement) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        toJson(jsonElement, (java.lang.Appendable) sb);
        return sb.toString();
    }

    public void toJson(com.google.gson.JsonElement jsonElement, java.lang.Appendable appendable) throws com.google.gson.JsonIOException {
        try {
            toJson(jsonElement, newJsonWriter(com.google.gson.internal.Streams.writerForAppendable(appendable)));
        } catch (java.io.IOException e) {
            throw new com.google.gson.JsonIOException(e);
        }
    }

    public void toJson(com.google.gson.JsonElement jsonElement, com.google.gson.stream.JsonWriter jsonWriter) throws com.google.gson.JsonIOException {
        com.google.gson.Strictness strictness = jsonWriter.getStrictness();
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        com.google.gson.Strictness strictness2 = this.strictness;
        if (strictness2 != null) {
            jsonWriter.setStrictness(strictness2);
        } else if (jsonWriter.getStrictness() == com.google.gson.Strictness.LEGACY_STRICT) {
            jsonWriter.setStrictness(com.google.gson.Strictness.LENIENT);
        }
        try {
            try {
                com.google.gson.internal.Streams.write(jsonElement, jsonWriter);
            } catch (java.io.IOException e) {
                throw new com.google.gson.JsonIOException(e);
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.13.2): ");
                sb.append(e2.getMessage());
                throw new java.lang.AssertionError(sb.toString(), e2);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public com.google.gson.stream.JsonWriter newJsonWriter(java.io.Writer writer) throws java.io.IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.formattingStyle);
        jsonWriter.setHtmlSafe(this.htmlSafe);
        com.google.gson.Strictness strictness = this.strictness;
        if (strictness == null) {
            strictness = com.google.gson.Strictness.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(strictness);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public com.google.gson.stream.JsonReader newJsonReader(java.io.Reader reader) {
        com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(reader);
        com.google.gson.Strictness strictness = this.strictness;
        if (strictness == null) {
            strictness = com.google.gson.Strictness.LEGACY_STRICT;
        }
        jsonReader.setStrictness(strictness);
        return jsonReader;
    }

    public <T> T fromJson(java.lang.String str, java.lang.Class<T> cls) throws com.google.gson.JsonSyntaxException {
        return (T) fromJson(str, com.google.gson.reflect.TypeToken.get((java.lang.Class) cls));
    }

    public <T> T fromJson(java.lang.String str, java.lang.reflect.Type type) throws com.google.gson.JsonSyntaxException {
        return (T) fromJson(str, com.google.gson.reflect.TypeToken.get(type));
    }

    public <T> T fromJson(java.lang.String str, com.google.gson.reflect.TypeToken<T> typeToken) throws com.google.gson.JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new java.io.StringReader(str), typeToken);
    }

    public <T> T fromJson(java.io.Reader reader, java.lang.Class<T> cls) throws com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException {
        return (T) fromJson(reader, com.google.gson.reflect.TypeToken.get((java.lang.Class) cls));
    }

    public <T> T fromJson(java.io.Reader reader, java.lang.reflect.Type type) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        return (T) fromJson(reader, com.google.gson.reflect.TypeToken.get(type));
    }

    public <T> T fromJson(java.io.Reader reader, com.google.gson.reflect.TypeToken<T> typeToken) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        com.google.gson.stream.JsonReader newJsonReader = newJsonReader(reader);
        T t = (T) fromJson(newJsonReader, typeToken);
        assertFullConsumption(t, newJsonReader);
        return t;
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader jsonReader, java.lang.reflect.Type type) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        return (T) fromJson(jsonReader, com.google.gson.reflect.TypeToken.get(type));
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader jsonReader, com.google.gson.reflect.TypeToken<T> typeToken) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        boolean z;
        com.google.gson.Strictness strictness = jsonReader.getStrictness();
        com.google.gson.Strictness strictness2 = this.strictness;
        if (strictness2 != null) {
            jsonReader.setStrictness(strictness2);
        } else if (jsonReader.getStrictness() == com.google.gson.Strictness.LEGACY_STRICT) {
            jsonReader.setStrictness(com.google.gson.Strictness.LENIENT);
        }
        try {
            try {
                try {
                    jsonReader.peek();
                    try {
                        com.google.gson.TypeAdapter<T> adapter = getAdapter(typeToken);
                        T read2 = adapter.read2(jsonReader);
                        java.lang.Class wrap = com.google.gson.internal.Primitives.wrap(typeToken.getRawType());
                        if (read2 != null && !wrap.isInstance(read2)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Type adapter '");
                            sb.append(adapter);
                            sb.append("' returned wrong type; requested ");
                            sb.append(typeToken.getRawType());
                            sb.append(" but got instance of ");
                            sb.append(read2.getClass());
                            sb.append("\nVerify that the adapter was registered for the correct type.");
                            throw new java.lang.ClassCastException(sb.toString());
                        }
                        return read2;
                    } catch (java.io.EOFException e) {
                        e = e;
                        z = false;
                        if (!z) {
                            throw new com.google.gson.JsonSyntaxException(e);
                        }
                        jsonReader.setStrictness(strictness);
                        return null;
                    }
                } finally {
                    jsonReader.setStrictness(strictness);
                }
            } catch (java.io.EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (java.io.IOException e3) {
            throw new com.google.gson.JsonSyntaxException(e3);
        } catch (java.lang.AssertionError e4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("AssertionError (GSON 2.13.2): ");
            sb2.append(e4.getMessage());
            throw new java.lang.AssertionError(sb2.toString(), e4);
        } catch (java.lang.IllegalStateException e5) {
            throw new com.google.gson.JsonSyntaxException(e5);
        }
    }

    public <T> T fromJson(com.google.gson.JsonElement jsonElement, java.lang.Class<T> cls) throws com.google.gson.JsonSyntaxException {
        return (T) fromJson(jsonElement, com.google.gson.reflect.TypeToken.get((java.lang.Class) cls));
    }

    public <T> T fromJson(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type) throws com.google.gson.JsonSyntaxException {
        return (T) fromJson(jsonElement, com.google.gson.reflect.TypeToken.get(type));
    }

    public <T> T fromJson(com.google.gson.JsonElement jsonElement, com.google.gson.reflect.TypeToken<T> typeToken) throws com.google.gson.JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.JsonTreeReader(jsonElement), typeToken);
    }

    private static void assertFullConsumption(java.lang.Object obj, com.google.gson.stream.JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.END_DOCUMENT) {
                } else {
                    throw new com.google.gson.JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (com.google.gson.stream.MalformedJsonException e) {
                throw new com.google.gson.JsonSyntaxException(e);
            } catch (java.io.IOException e2) {
                throw new com.google.gson.JsonIOException(e2);
            }
        }
    }

    /* loaded from: classes4.dex */
    static class FutureTypeAdapter<T> extends com.google.gson.internal.bind.SerializationDelegatingTypeAdapter<T> {
        private com.google.gson.TypeAdapter<T> delegate = null;

        FutureTypeAdapter() {
        }

        public void setDelegate(com.google.gson.TypeAdapter<T> typeAdapter) {
            if (this.delegate != null) {
                throw new java.lang.AssertionError("Delegate is already set");
            }
            this.delegate = typeAdapter;
        }

        private com.google.gson.TypeAdapter<T> delegate() {
            com.google.gson.TypeAdapter<T> typeAdapter = this.delegate;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new java.lang.IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public com.google.gson.TypeAdapter<T> getSerializationDelegate() {
            return delegate();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return delegate().read2(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            delegate().write(jsonWriter, t);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{serializeNulls:");
        sb.append(this.serializeNulls);
        sb.append(",factories:");
        sb.append(this.factories);
        sb.append(",instanceCreators:");
        sb.append(this.constructorConstructor);
        sb.append("}");
        return sb.toString();
    }
}
