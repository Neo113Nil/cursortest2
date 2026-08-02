package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor, com.google.gson.FieldNamingStrategy fieldNamingStrategy, com.google.gson.internal.Excluder excluder, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, java.util.List<com.google.gson.ReflectionAccessFilter> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    private boolean includeField(java.lang.reflect.Field field, boolean z) {
        return !this.excluder.excludeField(field, z);
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field field) {
        java.lang.String str;
        java.util.List<java.lang.String> list;
        com.google.gson.annotations.SerializedName serializedName = (com.google.gson.annotations.SerializedName) field.getAnnotation(com.google.gson.annotations.SerializedName.class);
        if (serializedName == null) {
            str = this.fieldNamingPolicy.translateName(field);
            list = this.fieldNamingPolicy.alternateNames(field);
        } else {
            java.lang.String value = serializedName.value();
            java.util.List<java.lang.String> asList = java.util.Arrays.asList(serializedName.alternate());
            str = value;
            list = asList;
        }
        if (list.isEmpty()) {
            return java.util.Collections.singletonList(str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
        arrayList.add(str);
        arrayList.addAll(list);
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        if (!java.lang.Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (com.google.gson.internal.reflect.ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new com.google.gson.TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                /* renamed from: read */
                public T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
                    jsonWriter.nullValue();
                }

                public java.lang.String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }
            };
        }
        com.google.gson.ReflectionAccessFilter.FilterResult filterResult = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
            sb.append(rawType);
            sb.append(". Register a TypeAdapter for this type or adjust the access filter.");
            throw new com.google.gson.JsonIOException(sb.toString());
        }
        boolean z = filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
        if (com.google.gson.internal.reflect.ReflectionHelper.isRecord(rawType)) {
            return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter(rawType, getBoundFields(gson, typeToken, rawType, z, true), z);
        }
        return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldReflectionAdapter(this.constructorConstructor.get(typeToken, true), getBoundFields(gson, typeToken, rawType, z, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> void checkAccessible(java.lang.Object obj, M m) {
        if (java.lang.reflect.Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(m, obj)) {
            return;
        }
        java.lang.String accessibleObjectDescription = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(m, true);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(accessibleObjectDescription);
        sb.append(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        throw new com.google.gson.JsonIOException(sb.toString());
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson gson, java.lang.reflect.Field field, final java.lang.reflect.Method method, java.lang.String str, com.google.gson.reflect.TypeToken<?> typeToken, boolean z, final boolean z2) {
        final boolean isPrimitive = com.google.gson.internal.Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z3 = java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers);
        com.google.gson.annotations.JsonAdapter jsonAdapter = (com.google.gson.annotations.JsonAdapter) field.getAnnotation(com.google.gson.annotations.JsonAdapter.class);
        com.google.gson.TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter, false) : null;
        boolean z4 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final com.google.gson.TypeAdapter<?> typeAdapter2 = typeAdapter;
        final com.google.gson.TypeAdapter<?> typeAdapterRuntimeTypeWrapper = (!z || z4) ? typeAdapter2 : new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType());
        final boolean z5 = z3;
        return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField(str, field) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.2
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                java.lang.Object obj2;
                if (z2) {
                    java.lang.reflect.Method method2 = method;
                    if (method2 == null) {
                        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                    } else {
                        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                    }
                }
                java.lang.reflect.Method method3 = method;
                if (method3 != null) {
                    try {
                        obj2 = method3.invoke(obj, new java.lang.Object[0]);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        java.lang.String accessibleObjectDescription = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(method, false);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Accessor ");
                        sb.append(accessibleObjectDescription);
                        sb.append(" threw exception");
                        throw new com.google.gson.JsonIOException(sb.toString(), e.getCause());
                    }
                } else {
                    obj2 = this.field.get(obj);
                }
                if (obj2 == obj) {
                    return;
                }
                jsonWriter.name(this.serializedName);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void readIntoArray(com.google.gson.stream.JsonReader jsonReader, int i, java.lang.Object[] objArr) throws java.io.IOException, com.google.gson.JsonParseException {
                java.lang.Object read2 = typeAdapter2.read2(jsonReader);
                if (read2 == null && isPrimitive) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("null is not allowed as value for record component '");
                    sb.append(this.fieldName);
                    sb.append("' of primitive type; at path ");
                    sb.append(jsonReader.getPath());
                    throw new com.google.gson.JsonParseException(sb.toString());
                }
                objArr[i] = read2;
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void readIntoField(com.google.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException {
                java.lang.Object read2 = typeAdapter2.read2(jsonReader);
                if (read2 == null && isPrimitive) {
                    return;
                }
                if (z2) {
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z5) {
                    throw new com.google.gson.JsonIOException("Cannot set value of 'static final' ".concat(java.lang.String.valueOf(com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(this.field, false))));
                }
                this.field.set(obj, read2);
            }
        };
    }

    static class FieldsData {
        static final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData EMPTY = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData(java.util.Collections.emptyMap(), java.util.Collections.emptyList());
        final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> deserializedFields;
        final java.util.List<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> serializedFields;

        FieldsData(java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map, java.util.List<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    private static java.lang.IllegalArgumentException createDuplicateFieldException(java.lang.Class<?> cls, java.lang.String str, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
        sb.append(cls.getName());
        sb.append(" declares multiple JSON fields named '");
        sb.append(str);
        sb.append("'; conflict is caused by fields ");
        sb.append(com.google.gson.internal.reflect.ReflectionHelper.fieldToString(field));
        sb.append(" and ");
        sb.append(com.google.gson.internal.reflect.ReflectionHelper.fieldToString(field2));
        sb.append("\nSee ");
        sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("duplicate-fields"));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData getBoundFields(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<?> typeToken, java.lang.Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        java.lang.reflect.Method method;
        java.lang.String str;
        int i;
        int i2;
        boolean z5;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField;
        if (cls.isInterface()) {
            return com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData.EMPTY;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        com.google.gson.reflect.TypeToken<?> typeToken2 = typeToken;
        boolean z6 = z;
        java.lang.Class<?> cls2 = cls;
        while (cls2 != java.lang.Object.class) {
            java.lang.reflect.Field[] declaredFields = cls2.getDeclaredFields();
            boolean z7 = true;
            ?? r7 = 0;
            if (cls2 == cls || declaredFields.length <= 0) {
                z3 = z6;
            } else {
                com.google.gson.ReflectionAccessFilter.FilterResult filterResult = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, cls2);
                if (filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectionAccessFilter does not permit using reflection for ");
                    sb.append(cls2);
                    sb.append(" (supertype of ");
                    sb.append(cls);
                    sb.append("). Register a TypeAdapter for this type or adjust the access filter.");
                    throw new com.google.gson.JsonIOException(sb.toString());
                }
                z3 = filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                java.lang.reflect.Field field = declaredFields[i3];
                boolean includeField = includeField(field, z7);
                boolean includeField2 = includeField(field, r7);
                if (includeField || includeField2) {
                    java.lang.reflect.Method method2 = null;
                    if (z2) {
                        if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                            method2 = com.google.gson.internal.reflect.ReflectionHelper.getAccessor(cls2, field);
                            if (!z3) {
                                com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(method2);
                            }
                            if (method2.getAnnotation(com.google.gson.annotations.SerializedName.class) != null && field.getAnnotation(com.google.gson.annotations.SerializedName.class) == null) {
                                java.lang.String accessibleObjectDescription = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(method2, r7);
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("@SerializedName on ");
                                sb2.append(accessibleObjectDescription);
                                sb2.append(" is not supported");
                                throw new com.google.gson.JsonIOException(sb2.toString());
                            }
                        } else {
                            method = null;
                            z4 = r7;
                            if (!z3 && method == null) {
                                com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(field);
                            }
                            java.lang.reflect.Type resolve = com.google.gson.internal.GsonTypes.resolve(typeToken2.getType(), cls2, field.getGenericType());
                            java.util.List<java.lang.String> fieldNames = getFieldNames(field);
                            str = fieldNames.get(r7);
                            i = i3;
                            i2 = length;
                            z5 = r7;
                            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField = createBoundField(gson, field, method, str, com.google.gson.reflect.TypeToken.get(resolve), includeField, z3);
                            if (z4) {
                                for (java.lang.String str2 : fieldNames) {
                                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField2 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) linkedHashMap.put(str2, createBoundField);
                                    if (boundField2 != null) {
                                        throw createDuplicateFieldException(cls, str2, boundField2.field, field);
                                    }
                                }
                            }
                            if (includeField && (boundField = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) linkedHashMap2.put(str, createBoundField)) != null) {
                                throw createDuplicateFieldException(cls, str, boundField.field, field);
                            }
                        }
                    }
                    z4 = includeField2;
                    method = method2;
                    if (!z3) {
                        com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(field);
                    }
                    java.lang.reflect.Type resolve2 = com.google.gson.internal.GsonTypes.resolve(typeToken2.getType(), cls2, field.getGenericType());
                    java.util.List<java.lang.String> fieldNames2 = getFieldNames(field);
                    str = fieldNames2.get(r7);
                    i = i3;
                    i2 = length;
                    z5 = r7;
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField2 = createBoundField(gson, field, method, str, com.google.gson.reflect.TypeToken.get(resolve2), includeField, z3);
                    if (z4) {
                    }
                    if (includeField) {
                        throw createDuplicateFieldException(cls, str, boundField.field, field);
                    }
                    continue;
                } else {
                    i = i3;
                    i2 = length;
                    z5 = r7;
                }
                i3 = i + 1;
                length = i2;
                r7 = z5;
                z7 = true;
            }
            typeToken2 = com.google.gson.reflect.TypeToken.get(com.google.gson.internal.GsonTypes.resolve(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
            z6 = z3;
        }
        return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData(linkedHashMap, new java.util.ArrayList(linkedHashMap2.values()));
    }

    static abstract class BoundField {
        final java.lang.reflect.Field field;
        final java.lang.String fieldName;
        final java.lang.String serializedName;

        abstract void readIntoArray(com.google.gson.stream.JsonReader jsonReader, int i, java.lang.Object[] objArr) throws java.io.IOException, com.google.gson.JsonParseException;

        abstract void readIntoField(com.google.gson.stream.JsonReader jsonReader, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException, java.lang.IllegalAccessException;

        protected BoundField(java.lang.String str, java.lang.reflect.Field field) {
            this.serializedName = str;
            this.field = field;
            this.fieldName = field.getName();
        }
    }

    public static abstract class Adapter<T, A> extends com.google.gson.TypeAdapter<T> {
        private final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData fieldsData;

        abstract A createAccumulator();

        abstract T finalize(A a2);

        abstract void readField(A a2, com.google.gson.stream.JsonReader jsonReader, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.lang.IllegalAccessException, java.io.IOException;

        Adapter(com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData fieldsData) {
            this.fieldsData = fieldsData;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                java.util.Iterator<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> it = this.fieldsData.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (java.lang.IllegalAccessException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A createAccumulator = createAccumulator();
            java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> map = this.fieldsData.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(createAccumulator, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return finalize(createAccumulator);
            } catch (java.lang.IllegalAccessException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (java.lang.IllegalStateException e2) {
                throw new com.google.gson.JsonSyntaxException(e2);
            }
        }
    }

    static final class FieldReflectionAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, T> {
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T finalize(T t) {
            return t;
        }

        FieldReflectionAdapter(com.google.gson.internal.ObjectConstructor<T> objectConstructor, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData fieldsData) {
            super(fieldsData);
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final void readField(T t, com.google.gson.stream.JsonReader jsonReader, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.lang.IllegalAccessException, java.io.IOException {
            boundField.readIntoField(jsonReader, t);
        }
    }

    static final class RecordAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, java.lang.Object[]> {
        static final java.util.Map<java.lang.Class<?>, java.lang.Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final java.util.Map<java.lang.String, java.lang.Integer> componentIndices;
        private final java.lang.reflect.Constructor<T> constructor;
        private final java.lang.Object[] constructorArgsDefaults;

        RecordAdapter(java.lang.Class<T> cls, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData fieldsData, boolean z) {
            super(fieldsData);
            this.componentIndices = new java.util.HashMap();
            java.lang.reflect.Constructor<T> canonicalRecordConstructor = com.google.gson.internal.reflect.ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z) {
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            java.lang.String[] recordComponentNames = com.google.gson.internal.reflect.ReflectionHelper.getRecordComponentNames(cls);
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
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final java.lang.Object[] createAccumulator() {
            return (java.lang.Object[]) this.constructorArgsDefaults.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void readField(java.lang.Object[] objArr, com.google.gson.stream.JsonReader jsonReader, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField boundField) throws java.io.IOException {
            java.lang.Integer num = this.componentIndices.get(boundField.fieldName);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find the index in the constructor '");
                sb.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb.append("' for field with name '");
                sb.append(boundField.fieldName);
                sb.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            boundField.readIntoArray(jsonReader, num.intValue(), objArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final T finalize(java.lang.Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (java.lang.IllegalAccessException e) {
                throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
            } catch (java.lang.IllegalArgumentException e2) {
                e = e2;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb.append("' with args ");
                sb.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb.toString(), e);
            } catch (java.lang.InstantiationException e3) {
                e = e3;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb2.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb2.append("' with args ");
                sb2.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb2.toString(), e);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to invoke constructor '");
                sb3.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(this.constructor));
                sb3.append("' with args ");
                sb3.append(java.util.Arrays.toString(objArr));
                throw new java.lang.RuntimeException(sb3.toString(), e4.getCause());
            }
        }
    }
}
