package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public enum FieldType {
    DOUBLE(0, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.DOUBLE),
    FLOAT(1, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.FLOAT),
    INT64(2, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.LONG),
    UINT64(3, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.LONG),
    INT32(4, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.INT),
    FIXED64(5, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.LONG),
    FIXED32(6, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.INT),
    BOOL(7, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.BOOLEAN),
    STRING(8, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.STRING),
    MESSAGE(9, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.MESSAGE),
    BYTES(10, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.BYTE_STRING),
    UINT32(11, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.INT),
    ENUM(12, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.ENUM),
    SFIXED32(13, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.INT),
    SFIXED64(14, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.LONG),
    SINT32(15, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.INT),
    SINT64(16, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.LONG),
    GROUP(17, androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR, androidx.content.preferences.protobuf.JavaType.MESSAGE),
    DOUBLE_LIST(18, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.DOUBLE),
    FLOAT_LIST(19, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.FLOAT),
    INT64_LIST(20, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    UINT64_LIST(21, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    INT32_LIST(22, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    FIXED64_LIST(23, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    FIXED32_LIST(24, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    BOOL_LIST(25, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.BOOLEAN),
    STRING_LIST(26, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.STRING),
    MESSAGE_LIST(27, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.MESSAGE),
    BYTES_LIST(28, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.BYTE_STRING),
    UINT32_LIST(29, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    ENUM_LIST(30, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.ENUM),
    SFIXED32_LIST(31, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    SFIXED64_LIST(32, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    SINT32_LIST(33, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    SINT64_LIST(34, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    DOUBLE_LIST_PACKED(35, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.DOUBLE),
    FLOAT_LIST_PACKED(36, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.FLOAT),
    INT64_LIST_PACKED(37, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    UINT64_LIST_PACKED(38, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    INT32_LIST_PACKED(39, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    FIXED64_LIST_PACKED(40, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    FIXED32_LIST_PACKED(41, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    BOOL_LIST_PACKED(42, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.BOOLEAN),
    UINT32_LIST_PACKED(43, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    ENUM_LIST_PACKED(44, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.ENUM),
    SFIXED32_LIST_PACKED(45, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    SFIXED64_LIST_PACKED(46, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    SINT32_LIST_PACKED(47, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.INT),
    SINT64_LIST_PACKED(48, androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR, androidx.content.preferences.protobuf.JavaType.LONG),
    GROUP_LIST(49, androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR, androidx.content.preferences.protobuf.JavaType.MESSAGE),
    MAP(50, androidx.datastore.preferences.protobuf.FieldType.Collection.MAP, androidx.content.preferences.protobuf.JavaType.VOID);

    private static final androidx.content.preferences.protobuf.FieldType[] Camera2StreamConfigurationMap;
    private static final java.lang.reflect.Type[] getHighSpeedVideoFpsRanges = new java.lang.reflect.Type[0];
    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.datastore.preferences.protobuf.FieldType.Collection getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final androidx.content.preferences.protobuf.JavaType getInputSizeshNQ4ISI;
    private final boolean getOutputMinFrameDuration;

    static {
        androidx.content.preferences.protobuf.FieldType[] values = values();
        Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.FieldType[values.length];
        for (androidx.content.preferences.protobuf.FieldType fieldType : values) {
            Camera2StreamConfigurationMap[fieldType.getInputFormats] = fieldType;
        }
    }

    FieldType(int i, androidx.datastore.preferences.protobuf.FieldType.Collection collection, androidx.content.preferences.protobuf.JavaType javaType) {
        int i2;
        this.getInputFormats = i;
        this.getHighSpeedVideoSizes = collection;
        this.getInputSizeshNQ4ISI = javaType;
        int i3 = androidx.content.preferences.protobuf.FieldType.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[collection.ordinal()];
        if (i3 == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = javaType.getBoxedType();
        } else if (i3 == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = javaType.getBoxedType();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        this.getOutputMinFrameDuration = (collection != androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR || (i2 = androidx.content.preferences.protobuf.FieldType.AnonymousClass1.getHighSpeedVideoFpsRangesFor[javaType.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.content.preferences.protobuf.JavaType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.content.preferences.protobuf.JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.content.preferences.protobuf.JavaType.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.content.preferences.protobuf.JavaType.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.FieldType.Collection.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr2;
            try {
                iArr2[androidx.datastore.preferences.protobuf.FieldType.Collection.MAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public final int id() {
        return this.getInputFormats;
    }

    public final androidx.content.preferences.protobuf.JavaType getJavaType() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isPacked() {
        return androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR.equals(this.getHighSpeedVideoSizes);
    }

    public final boolean isPrimitiveScalar() {
        return this.getOutputMinFrameDuration;
    }

    public final boolean isScalar() {
        return this.getHighSpeedVideoSizes == androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR;
    }

    public final boolean isList() {
        return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isMap() {
        return this.getHighSpeedVideoSizes == androidx.datastore.preferences.protobuf.FieldType.Collection.MAP;
    }

    public final boolean isValidForField(java.lang.reflect.Field field) {
        java.lang.reflect.Type genericSuperclass;
        if (!androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR.equals(this.getHighSpeedVideoSizes)) {
            return this.getInputSizeshNQ4ISI.getType().isAssignableFrom(field.getType());
        }
        java.lang.Class<?> type = field.getType();
        if (!this.getInputSizeshNQ4ISI.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] typeArr = getHighSpeedVideoFpsRanges;
        if (field.getGenericType() instanceof java.lang.reflect.ParameterizedType) {
            typeArr = ((java.lang.reflect.ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        while (type != java.util.List.class) {
            java.lang.reflect.Type[] genericInterfaces = type.getGenericInterfaces();
            int length = genericInterfaces.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    genericSuperclass = genericInterfaces[i];
                    if ((genericSuperclass instanceof java.lang.reflect.ParameterizedType) && java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getRawType())) {
                        break;
                    }
                    i++;
                } else {
                    genericSuperclass = type.getGenericSuperclass();
                    if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType) || !java.util.List.class.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getRawType())) {
                        genericSuperclass = null;
                    }
                }
            }
            if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    java.lang.reflect.Type type2 = actualTypeArguments[i2];
                    if (type2 instanceof java.lang.reflect.TypeVariable) {
                        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = type.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new java.lang.RuntimeException("Type array mismatch");
                        }
                        for (int i3 = 0; i3 < typeParameters.length; i3++) {
                            if (type2 == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                            }
                        }
                        throw new java.lang.RuntimeException("Unable to find replacement for ".concat(java.lang.String.valueOf(type2)));
                    }
                }
                type = (java.lang.Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            } else {
                typeArr = getHighSpeedVideoFpsRanges;
                java.lang.Class<?>[] interfaces = type.getInterfaces();
                int length2 = interfaces.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        java.lang.Class<?> cls = interfaces[i4];
                        if (java.util.List.class.isAssignableFrom(cls)) {
                            type = cls;
                            break;
                        }
                        i4++;
                    } else {
                        type = type.getSuperclass();
                        break;
                    }
                }
            }
        }
        if (typeArr.length != 1) {
            throw new java.lang.RuntimeException("Unable to identify parameter type for List<T>");
        }
        java.lang.reflect.Type type3 = typeArr[0];
        if (type3 instanceof java.lang.Class) {
            return this.getHighResolutionOutputSizeshNQ4ISI.isAssignableFrom((java.lang.Class) type3);
        }
        return true;
    }

    public static androidx.content.preferences.protobuf.FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        androidx.content.preferences.protobuf.FieldType[] fieldTypeArr = Camera2StreamConfigurationMap;
        if (i < fieldTypeArr.length) {
            return fieldTypeArr[i];
        }
        return null;
    }

    enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        final boolean getHighResolutionOutputSizeshNQ4ISI;

        Collection(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }
}
