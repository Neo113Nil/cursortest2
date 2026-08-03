package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class FieldType {
    private static final /* synthetic */ com.fyber.inneractive.sdk.protobuf.FieldType[] $VALUES;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType BOOL;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType BOOL_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType BOOL_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType BYTES;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType BYTES_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType DOUBLE;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType DOUBLE_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType ENUM;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType ENUM_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType ENUM_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED32;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED32_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED32_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED64;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED64_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FIXED64_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FLOAT;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FLOAT_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType FLOAT_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType GROUP;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType GROUP_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT32;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT32_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT32_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT64;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT64_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType INT64_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType MAP;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType MESSAGE;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType MESSAGE_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED32;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED32_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED32_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED64;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED64_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SFIXED64_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT32;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT32_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT32_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT64;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT64_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType SINT64_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType STRING;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType STRING_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT32;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT32_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT32_LIST_PACKED;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT64;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT64_LIST;
    public static final com.fyber.inneractive.sdk.protobuf.FieldType UINT64_LIST_PACKED;
    private static final com.fyber.inneractive.sdk.protobuf.FieldType[] VALUES;
    private final com.fyber.inneractive.sdk.protobuf.p0 collection;
    private final java.lang.Class<?> elementType;
    private final int id;
    private final com.fyber.inneractive.sdk.protobuf.JavaType javaType;
    private final boolean primitiveScalar;

    private static /* synthetic */ com.fyber.inneractive.sdk.protobuf.FieldType[] $values() {
        return new com.fyber.inneractive.sdk.protobuf.FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        com.fyber.inneractive.sdk.protobuf.p0 p0Var = com.fyber.inneractive.sdk.protobuf.p0.SCALAR;
        com.fyber.inneractive.sdk.protobuf.JavaType javaType = com.fyber.inneractive.sdk.protobuf.JavaType.DOUBLE;
        DOUBLE = new com.fyber.inneractive.sdk.protobuf.FieldType("DOUBLE", 0, 0, p0Var, javaType);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType2 = com.fyber.inneractive.sdk.protobuf.JavaType.FLOAT;
        FLOAT = new com.fyber.inneractive.sdk.protobuf.FieldType("FLOAT", 1, 1, p0Var, javaType2);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType3 = com.fyber.inneractive.sdk.protobuf.JavaType.LONG;
        INT64 = new com.fyber.inneractive.sdk.protobuf.FieldType("INT64", 2, 2, p0Var, javaType3);
        UINT64 = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT64", 3, 3, p0Var, javaType3);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType4 = com.fyber.inneractive.sdk.protobuf.JavaType.INT;
        INT32 = new com.fyber.inneractive.sdk.protobuf.FieldType("INT32", 4, 4, p0Var, javaType4);
        FIXED64 = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED64", 5, 5, p0Var, javaType3);
        FIXED32 = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED32", 6, 6, p0Var, javaType4);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType5 = com.fyber.inneractive.sdk.protobuf.JavaType.BOOLEAN;
        BOOL = new com.fyber.inneractive.sdk.protobuf.FieldType("BOOL", 7, 7, p0Var, javaType5);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType6 = com.fyber.inneractive.sdk.protobuf.JavaType.STRING;
        STRING = new com.fyber.inneractive.sdk.protobuf.FieldType("STRING", 8, 8, p0Var, javaType6);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType7 = com.fyber.inneractive.sdk.protobuf.JavaType.MESSAGE;
        MESSAGE = new com.fyber.inneractive.sdk.protobuf.FieldType("MESSAGE", 9, 9, p0Var, javaType7);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType8 = com.fyber.inneractive.sdk.protobuf.JavaType.BYTE_STRING;
        BYTES = new com.fyber.inneractive.sdk.protobuf.FieldType("BYTES", 10, 10, p0Var, javaType8);
        UINT32 = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT32", 11, 11, p0Var, javaType4);
        com.fyber.inneractive.sdk.protobuf.JavaType javaType9 = com.fyber.inneractive.sdk.protobuf.JavaType.ENUM;
        ENUM = new com.fyber.inneractive.sdk.protobuf.FieldType("ENUM", 12, 12, p0Var, javaType9);
        SFIXED32 = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED32", 13, 13, p0Var, javaType4);
        SFIXED64 = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED64", 14, 14, p0Var, javaType3);
        SINT32 = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT32", 15, 15, p0Var, javaType4);
        SINT64 = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT64", 16, 16, p0Var, javaType3);
        GROUP = new com.fyber.inneractive.sdk.protobuf.FieldType("GROUP", 17, 17, p0Var, javaType7);
        com.fyber.inneractive.sdk.protobuf.p0 p0Var2 = com.fyber.inneractive.sdk.protobuf.p0.VECTOR;
        DOUBLE_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("DOUBLE_LIST", 18, 18, p0Var2, javaType);
        FLOAT_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("FLOAT_LIST", 19, 19, p0Var2, javaType2);
        INT64_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("INT64_LIST", 20, 20, p0Var2, javaType3);
        UINT64_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT64_LIST", 21, 21, p0Var2, javaType3);
        INT32_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("INT32_LIST", 22, 22, p0Var2, javaType4);
        FIXED64_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED64_LIST", 23, 23, p0Var2, javaType3);
        FIXED32_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED32_LIST", 24, 24, p0Var2, javaType4);
        BOOL_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("BOOL_LIST", 25, 25, p0Var2, javaType5);
        STRING_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("STRING_LIST", 26, 26, p0Var2, javaType6);
        MESSAGE_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("MESSAGE_LIST", 27, 27, p0Var2, javaType7);
        BYTES_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("BYTES_LIST", 28, 28, p0Var2, javaType8);
        UINT32_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT32_LIST", 29, 29, p0Var2, javaType4);
        ENUM_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("ENUM_LIST", 30, 30, p0Var2, javaType9);
        SFIXED32_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED32_LIST", 31, 31, p0Var2, javaType4);
        SFIXED64_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED64_LIST", 32, 32, p0Var2, javaType3);
        SINT32_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT32_LIST", 33, 33, p0Var2, javaType4);
        SINT64_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT64_LIST", 34, 34, p0Var2, javaType3);
        com.fyber.inneractive.sdk.protobuf.p0 p0Var3 = com.fyber.inneractive.sdk.protobuf.p0.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("DOUBLE_LIST_PACKED", 35, 35, p0Var3, javaType);
        FLOAT_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("FLOAT_LIST_PACKED", 36, 36, p0Var3, javaType2);
        INT64_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("INT64_LIST_PACKED", 37, 37, p0Var3, javaType3);
        UINT64_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT64_LIST_PACKED", 38, 38, p0Var3, javaType3);
        INT32_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("INT32_LIST_PACKED", 39, 39, p0Var3, javaType4);
        FIXED64_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED64_LIST_PACKED", 40, 40, p0Var3, javaType3);
        FIXED32_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("FIXED32_LIST_PACKED", 41, 41, p0Var3, javaType4);
        BOOL_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("BOOL_LIST_PACKED", 42, 42, p0Var3, javaType5);
        UINT32_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("UINT32_LIST_PACKED", 43, 43, p0Var3, javaType4);
        ENUM_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("ENUM_LIST_PACKED", 44, 44, p0Var3, javaType9);
        SFIXED32_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED32_LIST_PACKED", 45, 45, p0Var3, javaType4);
        SFIXED64_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("SFIXED64_LIST_PACKED", 46, 46, p0Var3, javaType3);
        SINT32_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT32_LIST_PACKED", 47, 47, p0Var3, javaType4);
        SINT64_LIST_PACKED = new com.fyber.inneractive.sdk.protobuf.FieldType("SINT64_LIST_PACKED", 48, 48, p0Var3, javaType3);
        GROUP_LIST = new com.fyber.inneractive.sdk.protobuf.FieldType("GROUP_LIST", 49, 49, p0Var2, javaType7);
        MAP = new com.fyber.inneractive.sdk.protobuf.FieldType("MAP", 50, 50, com.fyber.inneractive.sdk.protobuf.p0.MAP, com.fyber.inneractive.sdk.protobuf.JavaType.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        com.fyber.inneractive.sdk.protobuf.FieldType[] values = values();
        VALUES = new com.fyber.inneractive.sdk.protobuf.FieldType[values.length];
        for (com.fyber.inneractive.sdk.protobuf.FieldType fieldType : values) {
            VALUES[fieldType.id] = fieldType;
        }
    }

    private FieldType(java.lang.String str, int i, int i2, com.fyber.inneractive.sdk.protobuf.p0 p0Var, com.fyber.inneractive.sdk.protobuf.JavaType javaType) {
        int i3;
        this.id = i2;
        this.collection = p0Var;
        this.javaType = javaType;
        int i4 = com.fyber.inneractive.sdk.protobuf.o0.f4209a[p0Var.ordinal()];
        if (i4 == 1) {
            this.elementType = javaType.getBoxedType();
        } else if (i4 != 2) {
            this.elementType = null;
        } else {
            this.elementType = javaType.getBoxedType();
        }
        this.primitiveScalar = (p0Var != com.fyber.inneractive.sdk.protobuf.p0.SCALAR || (i3 = com.fyber.inneractive.sdk.protobuf.o0.b[javaType.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static com.fyber.inneractive.sdk.protobuf.FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        com.fyber.inneractive.sdk.protobuf.FieldType[] fieldTypeArr = VALUES;
        if (i >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[i];
    }

    private static java.lang.reflect.Type getGenericSuperList(java.lang.Class<?> cls) {
        for (java.lang.reflect.Type type : cls.getGenericInterfaces()) {
            if ((type instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls == java.util.List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new java.lang.RuntimeException("Unable to identify parameter type for List<T>");
            }
            java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof java.lang.reflect.ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    java.lang.Class<?> cls2 = interfaces[i];
                    if (java.util.List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperList;
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    java.lang.reflect.Type type = actualTypeArguments[i2];
                    if (type instanceof java.lang.reflect.TypeVariable) {
                        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new java.lang.RuntimeException("Type array mismatch");
                        }
                        for (int i3 = 0; i3 < typeParameters.length; i3++) {
                            if (type == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                            }
                        }
                        throw new java.lang.RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (java.lang.Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
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

    public static com.fyber.inneractive.sdk.protobuf.FieldType valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.protobuf.FieldType) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.protobuf.FieldType.class, str);
    }

    public static com.fyber.inneractive.sdk.protobuf.FieldType[] values() {
        return (com.fyber.inneractive.sdk.protobuf.FieldType[]) $VALUES.clone();
    }

    public com.fyber.inneractive.sdk.protobuf.JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.a();
    }

    public boolean isMap() {
        return this.collection == com.fyber.inneractive.sdk.protobuf.p0.MAP;
    }

    public boolean isPacked() {
        return com.fyber.inneractive.sdk.protobuf.p0.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == com.fyber.inneractive.sdk.protobuf.p0.SCALAR;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        return com.fyber.inneractive.sdk.protobuf.p0.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
