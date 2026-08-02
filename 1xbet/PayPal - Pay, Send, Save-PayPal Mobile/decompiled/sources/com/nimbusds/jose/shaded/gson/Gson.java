package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final java.lang.String DEFAULT_DATE_PATTERN = null;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> builderFactories;
    final java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor;
    final java.lang.String datePattern;
    final int dateStyle;
    final com.nimbusds.jose.shaded.gson.internal.Excluder excluder;
    final java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> factories;
    final com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final java.util.Map<java.lang.reflect.Type, com.nimbusds.jose.shaded.gson.InstanceCreator<?>> instanceCreators;
    private final com.nimbusds.jose.shaded.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final com.nimbusds.jose.shaded.gson.LongSerializationPolicy longSerializationPolicy;
    final com.nimbusds.jose.shaded.gson.ToNumberStrategy numberToNumberStrategy;
    final com.nimbusds.jose.shaded.gson.ToNumberStrategy objectToNumberStrategy;
    final boolean prettyPrinting;
    final java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    private final java.lang.ThreadLocal<java.util.Map<com.nimbusds.jose.shaded.gson.reflect.TypeToken<?>, com.nimbusds.jose.shaded.gson.TypeAdapter<?>>> threadLocalAdapterResults;
    final int timeStyle;
    private final java.util.concurrent.ConcurrentMap<com.nimbusds.jose.shaded.gson.reflect.TypeToken<?>, com.nimbusds.jose.shaded.gson.TypeAdapter<?>> typeTokenCache;
    final boolean useJdkUnsafe;
    static final com.nimbusds.jose.shaded.gson.FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = com.nimbusds.jose.shaded.gson.FieldNamingPolicy.IDENTITY;
    static final com.nimbusds.jose.shaded.gson.ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = com.nimbusds.jose.shaded.gson.ToNumberPolicy.DOUBLE;
    static final com.nimbusds.jose.shaded.gson.ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = com.nimbusds.jose.shaded.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER;

    public Gson() {
        this(com.nimbusds.jose.shaded.gson.internal.Excluder.DEFAULT, DEFAULT_FIELD_NAMING_STRATEGY, java.util.Collections.emptyMap(), false, false, false, true, false, false, false, true, com.nimbusds.jose.shaded.gson.LongSerializationPolicy.DEFAULT, DEFAULT_DATE_PATTERN, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList(), DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, java.util.Collections.emptyList());
    }

    Gson(com.nimbusds.jose.shaded.gson.internal.Excluder excluder, com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingStrategy, java.util.Map<java.lang.reflect.Type, com.nimbusds.jose.shaded.gson.InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, com.nimbusds.jose.shaded.gson.LongSerializationPolicy longSerializationPolicy, java.lang.String str, int i, int i2, java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> list, java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> list2, java.util.List<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> list3, com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy, com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy2, java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> list4) {
        this.threadLocalAdapterResults = new java.lang.ThreadLocal<>();
        this.typeTokenCache = new java.util.concurrent.ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor = new com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor(map, z8, list4);
        this.constructorConstructor = constructorConstructor;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.useJdkUnsafe = z8;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = toNumberStrategy;
        this.numberToNumberStrategy = toNumberStrategy2;
        this.reflectionFilters = list4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.ObjectTypeAdapter.getFactory(toNumberStrategy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.STRING_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.INTEGER_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BYTE_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.SHORT_FACTORY);
        com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> longAdapter = longAdapter(longSerializationPolicy);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.lang.Long.TYPE, java.lang.Long.class, longAdapter));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.lang.Double.TYPE, java.lang.Double.class, doubleAdapter(z7)));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.lang.Float.TYPE, java.lang.Float.class, floatAdapter(z7)));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter.getFactory(toNumberStrategy2));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.util.concurrent.atomic.AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.util.concurrent.atomic.AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.math.BigDecimal.class, com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BIG_DECIMAL));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(java.math.BigInteger.class, com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BIG_INTEGER));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber.class, com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.URL_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.URI_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.UUID_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.LOCALE_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.DateTypeAdapter.FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY);
        if (com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.TIME_FACTORY);
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.DATE_FACTORY);
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.ArrayTypeAdapter.FACTORY);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.CLASS_FACTORY);
        arrayList.add(new com.nimbusds.jose.shaded.gson.internal.bind.CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new com.nimbusds.jose.shaded.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor, z2));
        com.nimbusds.jose.shaded.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new com.nimbusds.jose.shaded.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.ENUM_FACTORY);
        arrayList.add(new com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = java.util.Collections.unmodifiableList(arrayList);
    }

    public final com.nimbusds.jose.shaded.gson.GsonBuilder newBuilder() {
        return new com.nimbusds.jose.shaded.gson.GsonBuilder(this);
    }

    @java.lang.Deprecated
    public final com.nimbusds.jose.shaded.gson.internal.Excluder excluder() {
        return this.excluder;
    }

    public final com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public final boolean serializeNulls() {
        return this.serializeNulls;
    }

    public final boolean htmlSafe() {
        return this.htmlSafe;
    }

    private com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> doubleAdapter(boolean z) {
        if (z) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.DOUBLE;
        }
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.Gson.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: merged with bridge method [inline-methods] */
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
                    return;
                }
                double doubleValue = number.doubleValue();
                com.nimbusds.jose.shaded.gson.Gson.checkValidFloatingPoint(doubleValue);
                jsonWriter.value(doubleValue);
            }
        };
    }

    private com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> floatAdapter(boolean z) {
        if (z) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.FLOAT;
        }
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.Gson.2
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
                float floatValue = number.floatValue();
                com.nimbusds.jose.shaded.gson.Gson.checkValidFloatingPoint(floatValue);
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

    private static com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> longAdapter(com.nimbusds.jose.shaded.gson.LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == com.nimbusds.jose.shaded.gson.LongSerializationPolicy.DEFAULT) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.LONG;
        }
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number>() { // from class: com.nimbusds.jose.shaded.gson.Gson.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read */
            public java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Long.valueOf(jsonReader.nextLong());
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }
        };
    }

    private static com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong> atomicLongAdapter(final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong>() { // from class: com.nimbusds.jose.shaded.gson.Gson.4
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicLong atomicLong) throws java.io.IOException {
                com.nimbusds.jose.shaded.gson.TypeAdapter.this.write(jsonWriter, java.lang.Long.valueOf(atomicLong.get()));
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicLong read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) com.nimbusds.jose.shaded.gson.TypeAdapter.this.read2(jsonReader)).longValue());
            }
        }.nullSafe();
    }

    private static com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray> atomicLongArrayAdapter(final com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> typeAdapter) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray>() { // from class: com.nimbusds.jose.shaded.gson.Gson.5
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicLongArray atomicLongArray) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    com.nimbusds.jose.shaded.gson.TypeAdapter.this.write(jsonWriter, java.lang.Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            /* renamed from: read, reason: avoid collision after fix types in other method */
            public java.util.concurrent.atomic.AtomicLongArray read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((java.lang.Number) com.nimbusds.jose.shaded.gson.TypeAdapter.this.read2(jsonReader)).longValue()));
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r2.setDelegate(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        boolean z;
        java.util.Objects.requireNonNull(typeToken, "type must not be null");
        com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter = (com.nimbusds.jose.shaded.gson.TypeAdapter) this.typeTokenCache.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        java.util.Map<? extends com.nimbusds.jose.shaded.gson.reflect.TypeToken<?>, ? extends com.nimbusds.jose.shaded.gson.TypeAdapter<?>> map = this.threadLocalAdapterResults.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.threadLocalAdapterResults.set(map);
            z = true;
        } else {
            com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter2 = (com.nimbusds.jose.shaded.gson.TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z = false;
        }
        try {
            com.nimbusds.jose.shaded.gson.Gson.FutureTypeAdapter futureTypeAdapter = new com.nimbusds.jose.shaded.gson.Gson.FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            java.util.Iterator<com.nimbusds.jose.shaded.gson.TypeAdapterFactory> it = this.factories.iterator();
            com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter3 = null;
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
                throw new java.lang.IllegalArgumentException("GSON (2.10.1) cannot handle ".concat(java.lang.String.valueOf(typeToken)));
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

    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> getDelegateAdapter(com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        if (!this.factories.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (com.nimbusds.jose.shaded.gson.TypeAdapterFactory typeAdapterFactory2 : this.factories) {
            if (z) {
                com.nimbusds.jose.shaded.gson.TypeAdapter<T> create = typeAdapterFactory2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        throw new java.lang.IllegalArgumentException("GSON cannot serialize ".concat(java.lang.String.valueOf(typeToken)));
    }

    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> getAdapter(java.lang.Class<T> cls) {
        return getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get((java.lang.Class) cls));
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement toJsonTree(java.lang.Object obj) {
        if (obj == null) {
            return com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
        }
        return toJsonTree(obj, obj.getClass());
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement toJsonTree(java.lang.Object obj, java.lang.reflect.Type type) {
        com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter jsonTreeWriter = new com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter();
        toJson(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public final java.lang.String toJson(java.lang.Object obj) {
        if (obj == null) {
            return toJson((com.nimbusds.jose.shaded.gson.JsonElement) com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE);
        }
        return toJson(obj, obj.getClass());
    }

    public final java.lang.String toJson(java.lang.Object obj, java.lang.reflect.Type type) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public final void toJson(java.lang.Object obj, java.lang.Appendable appendable) throws com.nimbusds.jose.shaded.gson.JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((com.nimbusds.jose.shaded.gson.JsonElement) com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE, appendable);
        }
    }

    public final void toJson(java.lang.Object obj, java.lang.reflect.Type type, java.lang.Appendable appendable) throws com.nimbusds.jose.shaded.gson.JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(com.nimbusds.jose.shaded.gson.internal.Streams.writerForAppendable(appendable)));
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
        }
    }

    public final void toJson(java.lang.Object obj, java.lang.reflect.Type type, com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter) throws com.nimbusds.jose.shaded.gson.JsonIOException {
        com.nimbusds.jose.shaded.gson.TypeAdapter adapter = getAdapter(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                adapter.write(jsonWriter, obj);
            } catch (java.io.IOException e) {
                throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10.1): ");
                sb.append(e2.getMessage());
                throw new java.lang.AssertionError(sb.toString(), e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final java.lang.String toJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        toJson(jsonElement, (java.lang.Appendable) stringWriter);
        return stringWriter.toString();
    }

    public final void toJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, java.lang.Appendable appendable) throws com.nimbusds.jose.shaded.gson.JsonIOException {
        try {
            toJson(jsonElement, newJsonWriter(com.nimbusds.jose.shaded.gson.internal.Streams.writerForAppendable(appendable)));
        } catch (java.io.IOException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
        }
    }

    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter newJsonWriter(java.io.Writer writer) throws java.io.IOException {
        if (this.generateNonExecutableJson) {
            writer.write(")]}'\n");
        }
        com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter = new com.nimbusds.jose.shaded.gson.stream.JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setLenient(this.lenient);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public final com.nimbusds.jose.shaded.gson.stream.JsonReader newJsonReader(java.io.Reader reader) {
        com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader = new com.nimbusds.jose.shaded.gson.stream.JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public final void toJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter) throws com.nimbusds.jose.shaded.gson.JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                com.nimbusds.jose.shaded.gson.internal.Streams.write(jsonElement, jsonWriter);
            } catch (java.io.IOException e) {
                throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
            } catch (java.lang.AssertionError e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10.1): ");
                sb.append(e2.getMessage());
                throw new java.lang.AssertionError(sb.toString(), e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final <T> T fromJson(java.lang.String str, java.lang.Class<T> cls) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) com.nimbusds.jose.shaded.gson.internal.Primitives.wrap(cls).cast(fromJson(str, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get((java.lang.Class) cls)));
    }

    public final <T> T fromJson(java.lang.String str, java.lang.reflect.Type type) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) fromJson(str, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
    }

    public final <T> T fromJson(java.lang.String str, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new java.io.StringReader(str), typeToken);
    }

    public final <T> T fromJson(java.io.Reader reader, java.lang.Class<T> cls) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException, com.nimbusds.jose.shaded.gson.JsonIOException {
        return (T) com.nimbusds.jose.shaded.gson.internal.Primitives.wrap(cls).cast(fromJson(reader, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get((java.lang.Class) cls)));
    }

    public final <T> T fromJson(java.io.Reader reader, java.lang.reflect.Type type) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) fromJson(reader, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
    }

    public final <T> T fromJson(java.io.Reader reader, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        com.nimbusds.jose.shaded.gson.stream.JsonReader newJsonReader = newJsonReader(reader);
        T t = (T) fromJson(newJsonReader, typeToken);
        assertFullConsumption(t, newJsonReader);
        return t;
    }

    private static void assertFullConsumption(java.lang.Object obj, com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT) {
                } else {
                    throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (com.nimbusds.jose.shaded.gson.stream.MalformedJsonException e) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
            } catch (java.io.IOException e2) {
                throw new com.nimbusds.jose.shaded.gson.JsonIOException(e2);
            }
        }
    }

    public final <T> T fromJson(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, java.lang.reflect.Type type) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) fromJson(jsonReader, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
    }

    public final <T> T fromJson(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    return getAdapter(typeToken).read2(jsonReader);
                } catch (java.io.EOFException e) {
                    if (!z) {
                        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
                    }
                    jsonReader.setLenient(isLenient);
                    return null;
                } catch (java.lang.AssertionError e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("AssertionError (GSON 2.10.1): ");
                    sb.append(e2.getMessage());
                    throw new java.lang.AssertionError(sb.toString(), e2);
                }
            } catch (java.io.IOException e3) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e3);
            } catch (java.lang.IllegalStateException e4) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e4);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public final <T> T fromJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, java.lang.Class<T> cls) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) com.nimbusds.jose.shaded.gson.internal.Primitives.wrap(cls).cast(fromJson(jsonElement, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get((java.lang.Class) cls)));
    }

    public final <T> T fromJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, java.lang.reflect.Type type) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return (T) fromJson(jsonElement, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(type));
    }

    public final <T> T fromJson(com.nimbusds.jose.shaded.gson.JsonElement jsonElement, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return (T) fromJson(new com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader(jsonElement), typeToken);
    }

    static class FutureTypeAdapter<T> extends com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter<T> {
        private com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegate = null;

        FutureTypeAdapter() {
        }

        public void setDelegate(com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter) {
            if (this.delegate != null) {
                throw new java.lang.AssertionError("Delegate is already set");
            }
            this.delegate = typeAdapter;
        }

        private com.nimbusds.jose.shaded.gson.TypeAdapter<T> delegate() {
            com.nimbusds.jose.shaded.gson.TypeAdapter<T> typeAdapter = this.delegate;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new java.lang.IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.SerializationDelegatingTypeAdapter
        public com.nimbusds.jose.shaded.gson.TypeAdapter<T> getSerializationDelegate() {
            return delegate();
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /* renamed from: read */
        public T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return delegate().read2(jsonReader);
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            delegate().write(jsonWriter, t);
        }
    }

    public final java.lang.String toString() {
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
