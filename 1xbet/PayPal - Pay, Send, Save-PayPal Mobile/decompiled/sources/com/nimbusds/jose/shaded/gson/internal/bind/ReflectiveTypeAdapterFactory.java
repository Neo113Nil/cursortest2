package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements com.nimbusds.jose.shaded.gson.TypeAdapterFactory {
    private final com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.nimbusds.jose.shaded.gson.internal.Excluder excluder;
    private final com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.nimbusds.jose.shaded.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> reflectionFilters;

    public ReflectiveTypeAdapterFactory(com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor, com.nimbusds.jose.shaded.gson.FieldNamingStrategy fieldNamingStrategy, com.nimbusds.jose.shaded.gson.internal.Excluder excluder, com.nimbusds.jose.shaded.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    private boolean includeField(java.lang.reflect.Field field, boolean z) {
        return (this.excluder.excludeClass(field.getType(), z) || this.excluder.excludeField(field, z)) ? false : true;
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field field) {
        com.nimbusds.jose.shaded.gson.annotations.SerializedName serializedName = (com.nimbusds.jose.shaded.gson.annotations.SerializedName) field.getAnnotation(com.nimbusds.jose.shaded.gson.annotations.SerializedName.class);
        if (serializedName == null) {
            return java.util.Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        java.lang.String value = serializedName.value();
        java.lang.String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return java.util.Collections.singletonList(value);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(alternate.length + 1);
        arrayList.add(value);
        java.util.Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.lang.Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult filterResult = com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
            sb.append(rawType);
            sb.append(". Register a TypeAdapter for this type or adjust the access filter.");
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString());
        }
        boolean z = filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
        if (com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.isRecord(rawType)) {
            return new com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter(rawType, getBoundFields(gson, typeToken, rawType, z, true), z);
        }
        return new com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldReflectionAdapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType, z, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> void checkAccessible(java.lang.Object obj, M m) {
        if (java.lang.reflect.Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.canAccess(m, obj)) {
            return;
        }
        java.lang.String accessibleObjectDescription = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(m, true);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(accessibleObjectDescription);
        sb.append(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString());
    }

    private com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(final com.nimbusds.jose.shaded.gson.Gson gson, java.lang.reflect.Field field, final java.lang.reflect.Method method, java.lang.String str, final com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, boolean z, boolean z2, final boolean z3) {
        final boolean isPrimitive = com.nimbusds.jose.shaded.gson.internal.Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z4 = java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers);
        com.nimbusds.jose.shaded.gson.annotations.JsonAdapter jsonAdapter = (com.nimbusds.jose.shaded.gson.annotations.JsonAdapter) field.getAnnotation(com.nimbusds.jose.shaded.gson.annotations.JsonAdapter.class);
        com.nimbusds.jose.shaded.gson.TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
        final boolean z5 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final com.nimbusds.jose.shaded.gson.TypeAdapter<?> typeAdapter2 = typeAdapter;
        return new com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField(str, field, z, z2) { // from class: com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                java.lang.Object obj2;
                if (this.serialized) {
                    if (z3) {
                        java.lang.reflect.Method method2 = method;
                        if (method2 == null) {
                            com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                        } else {
                            com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                        }
                    }
                    java.lang.reflect.Method method3 = method;
                    if (method3 != null) {
                        try {
                            obj2 = method3.invoke(obj, new java.lang.Object[0]);
                        } catch (java.lang.reflect.InvocationTargetException e) {
                            java.lang.String accessibleObjectDescription = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(method, false);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Accessor ");
                            sb.append(accessibleObjectDescription);
                            sb.append(" threw exception");
                            throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString(), e.getCause());
                        }
                    } else {
                        obj2 = this.field.get(obj);
                    }
                    if (obj2 == obj) {
                        return;
                    }
                    jsonWriter.name(this.f4223name);
                    (z5 ? typeAdapter2 : new com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType())).write(jsonWriter, obj2);
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void readIntoArray(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, int i, java.lang.Object[] objArr) throws java.io.IOException, com.nimbusds.jose.shaded.gson.JsonParseException {
                java.lang.Object read2 = typeAdapter2.read2(jsonReader);
                if (read2 == null && isPrimitive) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("null is not allowed as value for record component '");
                    sb.append(this.fieldName);
                    sb.append("' of primitive type; at path ");
                    sb.append(jsonReader.getPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonParseException(sb.toString());
                }
                objArr[i] = read2;
            }

            @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void readIntoField(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                java.lang.Object read2 = typeAdapter2.read2(jsonReader);
                if (read2 == null && isPrimitive) {
                    return;
                }
                if (z3) {
                    com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z4) {
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException("Cannot set value of 'static final' ".concat(java.lang.String.valueOf(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(this.field, false))));
                }
                this.field.set(obj, read2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, java.lang.Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        java.lang.reflect.Method method;
        int size;
        ?? r1;
        com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField;
        int i;
        int i2;
        boolean z5;
        com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!cls.isInterface()) {
            com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken2 = typeToken;
            boolean z6 = z;
            java.lang.Class<?> cls2 = cls;
            while (cls2 != java.lang.Object.class) {
                java.lang.reflect.Field[] declaredFields = cls2.getDeclaredFields();
                boolean z7 = true;
                boolean z8 = false;
                if (cls2 == cls || declaredFields.length <= 0) {
                    z3 = z6;
                } else {
                    com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult filterResult = com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.getFilterResult(reflectiveTypeAdapterFactory.reflectionFilters, cls2);
                    if (filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
                        sb.append(cls2);
                        sb.append(" (supertype of ");
                        sb.append(cls);
                        sb.append("). Register a TypeAdapter for this type or adjust the access filter.");
                        throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString());
                    }
                    z3 = filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                }
                int length = declaredFields.length;
                int i3 = 0;
                while (i3 < length) {
                    java.lang.reflect.Field field = declaredFields[i3];
                    boolean includeField = reflectiveTypeAdapterFactory.includeField(field, z7);
                    boolean includeField2 = reflectiveTypeAdapterFactory.includeField(field, z8);
                    if (includeField || includeField2) {
                        com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField2 = null;
                        if (z2) {
                            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                                includeField2 = z8;
                            } else {
                                java.lang.reflect.Method accessor = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getAccessor(cls2, field);
                                if (!z3) {
                                    com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.makeAccessible(accessor);
                                }
                                if (accessor.getAnnotation(com.nimbusds.jose.shaded.gson.annotations.SerializedName.class) != null && field.getAnnotation(com.nimbusds.jose.shaded.gson.annotations.SerializedName.class) == null) {
                                    java.lang.String accessibleObjectDescription = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(accessor, z8);
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("@SerializedName on ");
                                    sb2.append(accessibleObjectDescription);
                                    sb2.append(" is not supported");
                                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb2.toString());
                                }
                                z4 = includeField2;
                                method = accessor;
                                if (!z3 && method == null) {
                                    com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.makeAccessible(field);
                                }
                                java.lang.reflect.Type resolve = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.resolve(typeToken2.getType(), cls2, field.getGenericType());
                                java.util.List<java.lang.String> fieldNames = reflectiveTypeAdapterFactory.getFieldNames(field);
                                size = fieldNames.size();
                                r1 = z8;
                                while (r1 < size) {
                                    java.lang.String str = fieldNames.get(r1);
                                    boolean z9 = r1 != 0 ? z8 : includeField;
                                    int i4 = r1;
                                    com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField3 = boundField2;
                                    int i5 = size;
                                    java.util.List<java.lang.String> list = fieldNames;
                                    java.lang.reflect.Field field2 = field;
                                    int i6 = i3;
                                    int i7 = length;
                                    boolean z10 = z8;
                                    boundField2 = boundField3 == null ? (com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) linkedHashMap.put(str, createBoundField(gson, field, method, str, com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(resolve), z9, z4, z3)) : boundField3;
                                    includeField = z9;
                                    i3 = i6;
                                    size = i5;
                                    fieldNames = list;
                                    field = field2;
                                    length = i7;
                                    z8 = z10;
                                    r1 = i4 + 1;
                                }
                                boundField = boundField2;
                                java.lang.reflect.Field field3 = field;
                                i = i3;
                                i2 = length;
                                z5 = z8;
                                if (boundField == null) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Class ");
                                    sb3.append(cls.getName());
                                    sb3.append(" declares multiple JSON fields named '");
                                    sb3.append(boundField.f4223name);
                                    sb3.append("'; conflict is caused by fields ");
                                    sb3.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.fieldToString(boundField.field));
                                    sb3.append(" and ");
                                    sb3.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.fieldToString(field3));
                                    throw new java.lang.IllegalArgumentException(sb3.toString());
                                }
                            }
                        }
                        z4 = includeField2;
                        method = null;
                        if (!z3) {
                            com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.makeAccessible(field);
                        }
                        java.lang.reflect.Type resolve2 = com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.resolve(typeToken2.getType(), cls2, field.getGenericType());
                        java.util.List<java.lang.String> fieldNames2 = reflectiveTypeAdapterFactory.getFieldNames(field);
                        size = fieldNames2.size();
                        r1 = z8;
                        while (r1 < size) {
                        }
                        boundField = boundField2;
                        java.lang.reflect.Field field32 = field;
                        i = i3;
                        i2 = length;
                        z5 = z8;
                        if (boundField == null) {
                        }
                    } else {
                        i = i3;
                        i2 = length;
                        z5 = z8;
                    }
                    i3 = i + 1;
                    z7 = true;
                    reflectiveTypeAdapterFactory = this;
                    length = i2;
                    z8 = z5;
                }
                typeToken2 = com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(com.nimbusds.jose.shaded.gson.internal.C$Gson$Types.resolve(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
                cls2 = typeToken2.getRawType();
                reflectiveTypeAdapterFactory = this;
                z6 = z3;
            }
        }
        return linkedHashMap;
    }

    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.reflect.Field field;
        final java.lang.String fieldName;

        /* renamed from: name, reason: collision with root package name */
        final java.lang.String f4223name;
        final boolean serialized;

        abstract void readIntoArray(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, int i, java.lang.Object[] objArr) throws java.io.IOException, com.nimbusds.jose.shaded.gson.JsonParseException;

        abstract void readIntoField(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        protected BoundField(java.lang.String str, java.lang.reflect.Field field, boolean z, boolean z2) {
            this.f4223name = str;
            this.field = field;
            this.fieldName = field.getName();
            this.serialized = z;
            this.deserialized = z2;
        }
    }

    public static abstract class Adapter<T, A> extends com.nimbusds.jose.shaded.gson.TypeAdapter<T> {
        final java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;

        abstract A createAccumulator();

        abstract T finalize(A a2);

        abstract void readField(A a2, com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.lang.IllegalAccessException, java.io.IOException;

        Adapter(java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map) {
            this.boundFields = map;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                java.util.Iterator<com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> it = this.boundFields.values().iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (java.lang.IllegalAccessException e) {
                throw com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            }
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /* renamed from: read */
        public T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A createAccumulator = createAccumulator();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField != null && boundField.deserialized) {
                        readField(createAccumulator, jsonReader, boundField);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return finalize(createAccumulator);
            } catch (java.lang.IllegalAccessException e) {
                throw com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e2);
            }
        }
    }

    static final class FieldReflectionAdapter<T> extends com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, T> {
        private final com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> constructor;

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T finalize(T t) {
            return t;
        }

        FieldReflectionAdapter(com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> objectConstructor, java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map) {
            super(map);
            this.constructor = objectConstructor;
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final void readField(T t, com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.lang.IllegalAccessException, java.io.IOException {
            boundField.readIntoField(jsonReader, t);
        }
    }

    static final class RecordAdapter<T> extends com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, java.lang.Object[]> {
        static final java.util.Map<java.lang.Class<?>, java.lang.Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final java.util.Map<java.lang.String, java.lang.Integer> componentIndices;
        private final java.lang.reflect.Constructor<T> constructor;
        private final java.lang.Object[] constructorArgsDefaults;

        RecordAdapter(java.lang.Class<T> cls, java.util.Map<java.lang.String, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map, boolean z) {
            super(map);
            this.componentIndices = new java.util.HashMap();
            java.lang.reflect.Constructor<T> canonicalRecordConstructor = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z) {
                com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            java.lang.String[] recordComponentNames = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.getRecordComponentNames(cls);
            for (int i = 0; i < recordComponentNames.length; i++) {
                this.componentIndices.put(recordComponentNames[i], java.lang.Integer.valueOf(i));
            }
            java.lang.Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new java.lang.Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.constructorArgsDefaults[i2] = PRIMITIVE_DEFAULTS.get(parameterTypes[i2]);
            }
        }

        private static java.util.Map<java.lang.Class<?>, java.lang.Object> primitiveDefaults() {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(java.lang.Byte.TYPE, (byte) 0);
            hashMap.put(java.lang.Short.TYPE, (short) 0);
            hashMap.put(java.lang.Integer.TYPE, 0);
            hashMap.put(java.lang.Long.TYPE, 0L);
            hashMap.put(java.lang.Float.TYPE, java.lang.Float.valueOf(0.0f));
            hashMap.put(java.lang.Double.TYPE, java.lang.Double.valueOf(0.0d));
            hashMap.put(java.lang.Character.TYPE, (char) 0);
            hashMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.FALSE);
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final java.lang.Object[] createAccumulator() {
            return (java.lang.Object[]) this.constructorArgsDefaults.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void readField(java.lang.Object[] objArr, com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader, com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.io.IOException {
            java.lang.Integer num = this.componentIndices.get(boundField.fieldName);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find the index in the constructor '");
                sb.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb.append("' for field with name '");
                sb.append(boundField.fieldName);
                sb.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            boundField.readIntoArray(jsonReader, num.intValue(), objArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final T finalize(java.lang.Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (java.lang.IllegalAccessException e) {
                throw com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (java.lang.IllegalArgumentException e2) {
                e = e2;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb.append("' with args ");
                sb.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb.toString(), e);
            } catch (java.lang.InstantiationException e3) {
                e = e3;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb2.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb2.append("' with args ");
                sb2.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb2.toString(), e);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb3.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb3.append("' with args ");
                sb3.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb3.toString(), e4.getCause());
            }
        }
    }
}
