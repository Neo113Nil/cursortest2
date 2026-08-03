package com.google.protobuf;

/* loaded from: classes4.dex */
public enum FieldType {
    DOUBLE(0, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.DOUBLE),
    FLOAT(1, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.FLOAT),
    INT64(2, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.LONG),
    UINT64(3, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.LONG),
    INT32(4, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.INT),
    FIXED64(5, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.LONG),
    FIXED32(6, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.INT),
    BOOL(7, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.BOOLEAN),
    STRING(8, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.STRING),
    MESSAGE(9, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.MESSAGE),
    BYTES(10, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.BYTE_STRING),
    UINT32(11, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.INT),
    ENUM(12, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.ENUM),
    SFIXED32(13, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.INT),
    SFIXED64(14, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.LONG),
    SINT32(15, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.INT),
    SINT64(16, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.LONG),
    GROUP(17, com.google.protobuf.FieldType.Collection.SCALAR, com.google.protobuf.JavaType.MESSAGE),
    DOUBLE_LIST(18, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.DOUBLE),
    FLOAT_LIST(19, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.FLOAT),
    INT64_LIST(20, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.LONG),
    UINT64_LIST(21, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.LONG),
    INT32_LIST(22, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.INT),
    FIXED64_LIST(23, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.LONG),
    FIXED32_LIST(24, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.INT),
    BOOL_LIST(25, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.BOOLEAN),
    STRING_LIST(26, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.STRING),
    MESSAGE_LIST(27, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.MESSAGE),
    BYTES_LIST(28, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.BYTE_STRING),
    UINT32_LIST(29, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.INT),
    ENUM_LIST(30, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.ENUM),
    SFIXED32_LIST(31, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.INT),
    SFIXED64_LIST(32, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.LONG),
    SINT32_LIST(33, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.INT),
    SINT64_LIST(34, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.LONG),
    DOUBLE_LIST_PACKED(35, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.DOUBLE),
    FLOAT_LIST_PACKED(36, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.FLOAT),
    INT64_LIST_PACKED(37, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.LONG),
    UINT64_LIST_PACKED(38, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.LONG),
    INT32_LIST_PACKED(39, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.INT),
    FIXED64_LIST_PACKED(40, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.LONG),
    FIXED32_LIST_PACKED(41, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.INT),
    BOOL_LIST_PACKED(42, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.BOOLEAN),
    UINT32_LIST_PACKED(43, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.INT),
    ENUM_LIST_PACKED(44, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.ENUM),
    SFIXED32_LIST_PACKED(45, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.INT),
    SFIXED64_LIST_PACKED(46, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.LONG),
    SINT32_LIST_PACKED(47, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.INT),
    SINT64_LIST_PACKED(48, com.google.protobuf.FieldType.Collection.PACKED_VECTOR, com.google.protobuf.JavaType.LONG),
    GROUP_LIST(49, com.google.protobuf.FieldType.Collection.VECTOR, com.google.protobuf.JavaType.MESSAGE),
    MAP(50, com.google.protobuf.FieldType.Collection.MAP, com.google.protobuf.JavaType.VOID);

    private static final java.lang.reflect.Type[] EMPTY_TYPES = new java.lang.reflect.Type[0];
    private static final com.google.protobuf.FieldType[] VALUES;
    private final com.google.protobuf.FieldType.Collection collection;
    private final java.lang.Class<?> elementType;
    private final int id;
    private final com.google.protobuf.JavaType javaType;
    private final boolean primitiveScalar;

    static {
        com.google.protobuf.FieldType[] values = values();
        VALUES = new com.google.protobuf.FieldType[values.length];
        for (com.google.protobuf.FieldType fieldType : values) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    FieldType(int id, com.google.protobuf.FieldType.Collection collection, com.google.protobuf.JavaType javaType) {
        int i;
        this.id = id;
        this.collection = collection;
        this.javaType = javaType;
        int i2 = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection[collection.ordinal()];
        if (i2 == 1) {
            this.elementType = javaType.getBoxedType();
        } else if (i2 == 2) {
            this.elementType = javaType.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (collection != com.google.protobuf.FieldType.Collection.SCALAR || (i = com.google.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType[javaType.ordinal()]) == 1 || i == 2 || i == 3) ? false : true;
    }

    /* renamed from: com.google.protobuf.FieldType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[com.google.protobuf.JavaType.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr;
            try {
                iArr[com.google.protobuf.JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[com.google.protobuf.JavaType.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[com.google.protobuf.JavaType.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.protobuf.FieldType.Collection.values().length];
            $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
            try {
                iArr2[com.google.protobuf.FieldType.Collection.MAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[com.google.protobuf.FieldType.Collection.VECTOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[com.google.protobuf.FieldType.Collection.SCALAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public int id() {
        return this.id;
    }

    public com.google.protobuf.JavaType getJavaType() {
        return this.javaType;
    }

    public boolean isPacked() {
        return com.google.protobuf.FieldType.Collection.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == com.google.protobuf.FieldType.Collection.SCALAR;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == com.google.protobuf.FieldType.Collection.MAP;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (com.google.protobuf.FieldType.Collection.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        java.lang.Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof java.lang.reflect.ParameterizedType) {
            typeArr = ((java.lang.reflect.ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        java.lang.reflect.Type listParameter = getListParameter(type, typeArr);
        if (listParameter instanceof java.lang.Class) {
            return this.elementType.isAssignableFrom((java.lang.Class) listParameter);
        }
        return true;
    }

    public static com.google.protobuf.FieldType forId(int id) {
        if (id < 0) {
            return null;
        }
        com.google.protobuf.FieldType[] fieldTypeArr = VALUES;
        if (id >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[id];
    }

    private static java.lang.reflect.Type getGenericSuperList(java.lang.Class<?> clazz) {
        for (java.lang.reflect.Type type : clazz.getGenericInterfaces()) {
            if ((type instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = clazz.getGenericSuperclass();
        if ((genericSuperclass instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(java.lang.Class<?> clazz, java.lang.reflect.Type[] realTypes) {
        while (true) {
            int i = 0;
            if (clazz != java.util.List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(clazz);
                if (genericSuperList instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        java.lang.reflect.Type type = actualTypeArguments[i2];
                        if (type instanceof java.lang.reflect.TypeVariable) {
                            java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = clazz.getTypeParameters();
                            if (realTypes.length != typeParameters.length) {
                                throw new java.lang.RuntimeException("Type array mismatch");
                            }
                            for (int i3 = 0; i3 < typeParameters.length; i3++) {
                                if (type == typeParameters[i3]) {
                                    actualTypeArguments[i2] = realTypes[i3];
                                }
                            }
                            throw new java.lang.RuntimeException("Unable to find replacement for " + type);
                        }
                    }
                    clazz = (java.lang.Class) parameterizedType.getRawType();
                    realTypes = actualTypeArguments;
                } else {
                    realTypes = EMPTY_TYPES;
                    java.lang.Class<?>[] interfaces = clazz.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            java.lang.Class<?> cls = interfaces[i];
                            if (java.util.List.class.isAssignableFrom(cls)) {
                                clazz = cls;
                                break;
                            }
                            i++;
                        } else {
                            clazz = clazz.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (realTypes.length != 1) {
                    throw new java.lang.RuntimeException("Unable to identify parameter type for List<T>");
                }
                return realTypes[0];
            }
        }
    }

    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        Collection(boolean isList) {
            this.isList = isList;
        }

        public boolean isList() {
            return this.isList;
        }
    }
}
