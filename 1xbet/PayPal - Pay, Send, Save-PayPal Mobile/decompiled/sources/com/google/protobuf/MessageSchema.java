package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class MessageSchema<T> implements com.google.protobuf.Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final com.google.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final com.google.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final com.google.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final com.google.protobuf.ProtoSyntax syntax;
    private final com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final sun.misc.Unsafe UNSAFE = com.google.protobuf.UnsafeUtil.getUnsafe();

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private MessageSchema(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.protobuf.MessageLite messageLite, com.google.protobuf.ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof com.google.protobuf.GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static <T> com.google.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> cls, com.google.protobuf.MessageInfo messageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof com.google.protobuf.RawMessageInfo) {
            return newSchemaForRawMessageInfo((com.google.protobuf.RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((com.google.protobuf.StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo rawMessageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int[] iArr2;
        java.lang.Class<?> cls;
        int objectFieldOffset;
        java.lang.String str;
        int i18;
        int i19;
        int i20;
        int i21;
        java.lang.reflect.Field reflectField;
        int i22;
        char charAt11;
        int i23;
        int i24;
        java.lang.Object obj;
        java.lang.reflect.Field reflectField2;
        java.lang.Object obj2;
        java.lang.reflect.Field reflectField3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        java.lang.String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (stringInfo.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int charAt16 = stringInfo.charAt(i);
        if (charAt16 >= 55296) {
            int i31 = charAt16 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                charAt15 = stringInfo.charAt(i30);
                if (charAt15 < 55296) {
                    break;
                }
                i31 |= (charAt15 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            charAt16 = i31 | (charAt15 << i32);
            i30 = i28;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int charAt17 = stringInfo.charAt(i30);
            if (charAt17 >= 55296) {
                int i34 = charAt17 & 8191;
                int i35 = 13;
                while (true) {
                    i14 = i33 + 1;
                    charAt10 = stringInfo.charAt(i33);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i34 |= (charAt10 & 8191) << i35;
                    i35 += 13;
                    i33 = i14;
                }
                charAt17 = i34 | (charAt10 << i35);
                i33 = i14;
            }
            int i36 = i33 + 1;
            int charAt18 = stringInfo.charAt(i33);
            if (charAt18 >= 55296) {
                int i37 = charAt18 & 8191;
                int i38 = 13;
                while (true) {
                    i13 = i36 + 1;
                    charAt9 = stringInfo.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i13;
                }
                charAt18 = i37 | (charAt9 << i38);
                i36 = i13;
            }
            int i39 = i36 + 1;
            int charAt19 = stringInfo.charAt(i36);
            if (charAt19 >= 55296) {
                int i40 = charAt19 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    charAt8 = stringInfo.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                charAt19 = i40 | (charAt8 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int charAt20 = stringInfo.charAt(i39);
            if (charAt20 >= 55296) {
                int i43 = charAt20 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    charAt7 = stringInfo.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                charAt20 = i43 | (charAt7 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            charAt = stringInfo.charAt(i42);
            if (charAt >= 55296) {
                int i46 = charAt & 8191;
                int i47 = 13;
                while (true) {
                    i10 = i45 + 1;
                    charAt6 = stringInfo.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i10;
                }
                charAt = i46 | (charAt6 << i47);
                i45 = i10;
            }
            int i48 = i45 + 1;
            charAt2 = stringInfo.charAt(i45);
            if (charAt2 >= 55296) {
                int i49 = charAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    charAt5 = stringInfo.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                charAt2 = i49 | (charAt5 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            int charAt21 = stringInfo.charAt(i48);
            if (charAt21 >= 55296) {
                int i52 = charAt21 & 8191;
                int i53 = 13;
                while (true) {
                    i8 = i51 + 1;
                    charAt4 = stringInfo.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i8;
                }
                charAt21 = i52 | (charAt4 << i53);
                i51 = i8;
            }
            int i54 = i51 + 1;
            int charAt22 = stringInfo.charAt(i51);
            if (charAt22 >= 55296) {
                int i55 = charAt22 & 8191;
                int i56 = 13;
                while (true) {
                    i7 = i54 + 1;
                    charAt3 = stringInfo.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i7;
                }
                charAt22 = i55 | (charAt3 << i56);
                i54 = i7;
            }
            i2 = (charAt17 * 2) + charAt18;
            i3 = charAt17;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i4 = charAt22;
            i30 = i54;
            i5 = charAt19;
            i6 = charAt20;
        }
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object[] objects = rawMessageInfo.getObjects();
        java.lang.Class<?> cls2 = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[charAt * 2];
        int i57 = i4 + charAt2;
        int i58 = i4;
        int i59 = i57;
        int i60 = 0;
        int i61 = 0;
        while (i30 < length) {
            int i62 = i30 + 1;
            int charAt23 = stringInfo.charAt(i30);
            if (charAt23 >= c) {
                int i63 = charAt23 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    charAt14 = stringInfo.charAt(i64);
                    if (charAt14 < c) {
                        break;
                    }
                    i63 |= (charAt14 & 8191) << i65;
                    i65 += 13;
                    i64 = i27;
                }
                charAt23 = i63 | (charAt14 << i65);
                i15 = i27;
            } else {
                i15 = i62;
            }
            int i66 = i15 + 1;
            int charAt24 = stringInfo.charAt(i15);
            if (charAt24 >= c) {
                int i67 = charAt24 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    charAt13 = stringInfo.charAt(i68);
                    if (charAt13 < c) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                }
                charAt24 = i67 | (charAt13 << i69);
                i16 = i26;
            } else {
                i16 = i66;
            }
            int i70 = charAt24 & 255;
            int i71 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i61] = i60;
                i61++;
            }
            int i72 = i6;
            if (i70 >= 51) {
                int i73 = i16 + 1;
                int charAt25 = stringInfo.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i25 = i73 + 1;
                        charAt12 = stringInfo.charAt(i73);
                        if (charAt12 < c2) {
                            break;
                        }
                        i74 |= (charAt12 & 8191) << i75;
                        i75 += 13;
                        i73 = i25;
                        c2 = 55296;
                    }
                    charAt25 = i74 | (charAt12 << i75);
                    i73 = i25;
                }
                int i76 = i70 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    i24 = i2 + 1;
                    objArr[((i60 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i76 == 12 && (rawMessageInfo.getSyntax().equals(com.google.protobuf.ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0)) {
                        i24 = i2 + 1;
                        objArr[((i60 / 3) * 2) + 1] = objects[i2];
                    }
                    int i78 = charAt25 * 2;
                    obj = objects[i78];
                    if (!(obj instanceof java.lang.reflect.Field)) {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        reflectField2 = reflectField(cls2, (java.lang.String) obj);
                        objects[i78] = reflectField2;
                    }
                    i17 = i5;
                    i21 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i79 = i78 + 1;
                    obj2 = objects[i79];
                    if (!(obj2 instanceof java.lang.reflect.Field)) {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        reflectField3 = reflectField(cls2, (java.lang.String) obj2);
                        objects[i79] = reflectField3;
                    }
                    str = stringInfo;
                    iArr2 = iArr3;
                    i18 = (int) unsafe.objectFieldOffset(reflectField3);
                    cls = cls2;
                    i19 = i77;
                    i20 = 0;
                }
                i2 = i24;
                int i782 = charAt25 * 2;
                obj = objects[i782];
                if (!(obj instanceof java.lang.reflect.Field)) {
                }
                i17 = i5;
                i21 = (int) unsafe.objectFieldOffset(reflectField2);
                int i792 = i782 + 1;
                obj2 = objects[i792];
                if (!(obj2 instanceof java.lang.reflect.Field)) {
                }
                str = stringInfo;
                iArr2 = iArr3;
                i18 = (int) unsafe.objectFieldOffset(reflectField3);
                cls = cls2;
                i19 = i77;
                i20 = 0;
            } else {
                i17 = i5;
                int i80 = i2 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls2, (java.lang.String) objects[i2]);
                if (i70 == 9 || i70 == 17) {
                    iArr2 = iArr3;
                    objArr[((i60 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        iArr2 = iArr3;
                        i23 = i2 + 2;
                        objArr[((i60 / 3) * 2) + 1] = objects[i80];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        iArr2 = iArr3;
                        if (rawMessageInfo.getSyntax() == com.google.protobuf.ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i23 = i2 + 2;
                            objArr[((i60 / 3) * 2) + 1] = objects[i80];
                        }
                    } else if (i70 == 50) {
                        int i81 = i58 + 1;
                        iArr[i58] = i60;
                        int i82 = (i60 / 3) * 2;
                        int i83 = i2 + 2;
                        objArr[i82] = objects[i80];
                        if ((charAt24 & 2048) != 0) {
                            i80 = i2 + 3;
                            objArr[i82 + 1] = objects[i83];
                            iArr2 = iArr3;
                            i58 = i81;
                        } else {
                            i58 = i81;
                            i80 = i83;
                            iArr2 = iArr3;
                        }
                    } else {
                        iArr2 = iArr3;
                    }
                    cls = cls2;
                    i80 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) != 0 || i70 > 17) {
                        str = stringInfo;
                        i18 = 1048575;
                        i19 = i16;
                        i20 = 0;
                    } else {
                        i19 = i16 + 1;
                        int charAt26 = stringInfo.charAt(i16);
                        if (charAt26 >= 55296) {
                            int i84 = charAt26 & 8191;
                            int i85 = 13;
                            while (true) {
                                i22 = i19 + 1;
                                charAt11 = stringInfo.charAt(i19);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i84 |= (charAt11 & 8191) << i85;
                                i85 += 13;
                                i19 = i22;
                            }
                            charAt26 = i84 | (charAt11 << i85);
                            i19 = i22;
                        }
                        int i86 = (i3 * 2) + (charAt26 / 32);
                        java.lang.Object obj3 = objects[i86];
                        str = stringInfo;
                        if (obj3 instanceof java.lang.reflect.Field) {
                            reflectField = (java.lang.reflect.Field) obj3;
                        } else {
                            reflectField = reflectField(cls, (java.lang.String) obj3);
                            objects[i86] = reflectField;
                        }
                        i18 = (int) unsafe.objectFieldOffset(reflectField);
                        i20 = charAt26 % 32;
                    }
                    if (i70 >= 18 && i70 <= 49) {
                        iArr[i59] = objectFieldOffset;
                        i59++;
                    }
                    i2 = i80;
                    i21 = objectFieldOffset;
                }
                cls = cls2;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) != 0) {
                }
                str = stringInfo;
                i18 = 1048575;
                i19 = i16;
                i20 = 0;
                if (i70 >= 18) {
                    iArr[i59] = objectFieldOffset;
                    i59++;
                }
                i2 = i80;
                i21 = objectFieldOffset;
            }
            iArr2[i60] = charAt23;
            iArr2[i60 + 1] = i21 | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i70 << 20);
            iArr2[i60 + 2] = i18 | (i20 << 20);
            i60 += 3;
            cls2 = cls;
            i30 = i19;
            length = i71;
            iArr3 = iArr2;
            stringInfo = str;
            i6 = i72;
            i5 = i17;
            c = 55296;
        }
        return new com.google.protobuf.MessageSchema<>(iArr3, objArr, i5, i6, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i4, i57, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(java.util.Arrays.toString(declaredFields));
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    static <T> com.google.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.google.protobuf.StructuralMessageInfo structuralMessageInfo, com.google.protobuf.NewInstanceSchema newInstanceSchema, com.google.protobuf.ListFieldSchema listFieldSchema, com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        com.google.protobuf.FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        java.lang.Object[] objArr = new java.lang.Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (com.google.protobuf.FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == com.google.protobuf.FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            com.google.protobuf.FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == com.google.protobuf.FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        java.lang.System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        java.lang.System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        java.lang.System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new com.google.protobuf.MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo fieldInfo, int[] iArr, int i, java.lang.Object[] objArr) {
        int objectFieldOffset;
        int id;
        long objectFieldOffset2;
        int i2;
        int i3;
        com.google.protobuf.OneofInfo oneof = fieldInfo.getOneof();
        if (oneof != null) {
            id = fieldInfo.getType().id() + 51;
            objectFieldOffset = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(oneof.getValueField());
            objectFieldOffset2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            com.google.protobuf.FieldType type = fieldInfo.getType();
            objectFieldOffset = (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            id = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                i2 = presenceField == null ? 1048575 : (int) com.google.protobuf.UnsafeUtil.objectFieldOffset(presenceField);
                i3 = java.lang.Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                i2 = 0;
                i3 = 0;
            } else {
                objectFieldOffset2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i] = fieldInfo.getFieldNumber();
            iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
            iArr[i + 2] = i2 | (i3 << 20);
            java.lang.Class<?> messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            int i4 = (i / 3) * 2;
            objArr[i4] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i4 + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[i4 + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i2 = (int) objectFieldOffset2;
        i3 = 0;
        iArr[i] = fieldInfo.getFieldNumber();
        if (!fieldInfo.isEnforceUtf8()) {
        }
        iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
        iArr[i + 2] = i2 | (i3 << 20);
        java.lang.Class<?> messageFieldClass2 = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
        }
    }

    @Override // com.google.protobuf.Schema
    public final T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // com.google.protobuf.Schema
    public final boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    private boolean equals(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t, t2, i) || java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, offset)) != java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t2, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t, t2, i) || java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, offset)) != java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t2, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getLong(t, offset) != com.google.protobuf.UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getLong(t, offset) != com.google.protobuf.UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getLong(t, offset) != com.google.protobuf.UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getBoolean(t, offset) != com.google.protobuf.UnsafeUtil.getBoolean(t2, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t, t2, i) || !com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, offset), com.google.protobuf.UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t, t2, i) || !com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, offset), com.google.protobuf.UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t, t2, i) || !com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, offset), com.google.protobuf.UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getLong(t, offset) != com.google.protobuf.UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getInt(t, offset) != com.google.protobuf.UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t, t2, i) || com.google.protobuf.UnsafeUtil.getLong(t, offset) != com.google.protobuf.UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t, t2, i) || !com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, offset), com.google.protobuf.UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(t, t2, i) || !com.google.protobuf.SchemaUtil.safeEquals(com.google.protobuf.UnsafeUtil.getObject(t, offset), com.google.protobuf.UnsafeUtil.getObject(t2, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public final int hashCode(T t) {
        int i;
        int hashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, offset)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = java.lang.Float.floatToIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, offset));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, offset));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, offset));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, offset));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashBoolean(com.google.protobuf.UnsafeUtil.getBoolean(t, offset));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((java.lang.String) com.google.protobuf.UnsafeUtil.getObject(t, offset)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(t, offset);
                    if (object != null) {
                        hashLong = object.hashCode();
                        i = i2 * 53;
                        i2 = i + hashLong;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                    i2 = i + hashLong;
                case 10:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, offset));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getInt(t, offset);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.Internal.hashLong(com.google.protobuf.UnsafeUtil.getLong(t, offset));
                    i2 = i + hashLong;
                    break;
                case 17:
                    java.lang.Object object2 = com.google.protobuf.UnsafeUtil.getObject(t, offset);
                    if (object2 != null) {
                        hashLong = object2.hashCode();
                        i = i2 * 53;
                        i2 = i + hashLong;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                    i2 = i + hashLong;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(oneofDoubleAt(t, offset)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = java.lang.Float.floatToIntBits(oneofFloatAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashBoolean(oneofBooleanAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = ((java.lang.String) com.google.protobuf.UnsafeUtil.getObject(t, offset)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(t, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.Internal.hashLong(oneofLongAt(t, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = com.google.protobuf.UnsafeUtil.getObject(t, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public final void mergeFrom(T t, T t2) {
        checkMutable(t);
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        com.google.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            com.google.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putDouble(t, offset, com.google.protobuf.UnsafeUtil.getDouble(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putFloat(t, offset, com.google.protobuf.UnsafeUtil.getFloat(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, offset, com.google.protobuf.UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, offset, com.google.protobuf.UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, offset, com.google.protobuf.UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putBoolean(t, offset, com.google.protobuf.UnsafeUtil.getBoolean(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, offset, com.google.protobuf.UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(t, t2, i);
                break;
            case 10:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, offset, com.google.protobuf.UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, offset, com.google.protobuf.UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putInt(t, offset, com.google.protobuf.UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t2, i)) {
                    com.google.protobuf.UnsafeUtil.putLong(t, offset, com.google.protobuf.UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t, t2, offset);
                break;
            case 50:
                com.google.protobuf.SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, offset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, numberAt, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, offset, com.google.protobuf.UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, numberAt, i)) {
                    com.google.protobuf.UnsafeUtil.putObject(t, offset, com.google.protobuf.UnsafeUtil.getObject(t2, offset));
                    setOneofPresent(t, numberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (isFieldPresent(t2, i)) {
            long offset = offset(typeAndOffsetAt(i));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(t2, offset);
            if (object == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Source subfield ");
                sb.append(numberAt(i));
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    java.lang.Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setFieldPresent(t, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                java.lang.Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t, T t2, int i) {
        int numberAt = numberAt(i);
        if (isOneofPresent(t2, numberAt, i)) {
            long offset = offset(typeAndOffsetAt(i));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(t2, offset);
            if (object == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Source subfield ");
                sb.append(numberAt(i));
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, numberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t, offset, object);
                } else {
                    java.lang.Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                }
                setOneofPresent(t, numberAt, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                java.lang.Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // com.google.protobuf.Schema
    public final int getSerializedSize(T t) {
        int i;
        int i2;
        int i3;
        boolean z;
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        sun.misc.Unsafe unsafe = UNSAFE;
        ?? r9 = 0;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i6 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i6);
            int i9 = this.buffer[i6 + 2];
            int i10 = i9 & i4;
            if (type <= 17) {
                if (i10 != i8) {
                    i5 = i10 == i4 ? r9 : unsafe.getInt(t, i10);
                    i8 = i10;
                }
                i = i5;
                i2 = i8;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i8;
                i3 = r9;
            }
            long offset = offset(typeAndOffsetAt);
            if (type < com.google.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || type > com.google.protobuf.FieldType.SINT64_LIST_PACKED.id()) {
                i10 = r9;
            }
            int i11 = i10;
            switch (type) {
                case 0:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i7 += computeDoubleSize;
                        break;
                    }
                case 1:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i7 += computeDoubleSize;
                        break;
                    }
                case 2:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t, offset));
                        i7 += computeDoubleSize;
                        break;
                    }
                case 3:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t, offset));
                        i7 += computeDoubleSize;
                        break;
                    }
                case 4:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t, offset));
                        i7 += computeDoubleSize;
                        break;
                    }
                case 5:
                    z = r9;
                    if (!isFieldPresent(t, i6, i2, i, i3)) {
                        break;
                    } else {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i7 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        z = false;
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBoolSize(numberAt, true);
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        java.lang.Object object = unsafe.getObject(t, offset);
                        if (object instanceof com.google.protobuf.ByteString) {
                            computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(numberAt, (com.google.protobuf.ByteString) object);
                        } else {
                            computeDoubleSize = com.google.protobuf.CodedOutputStream.computeStringSize(numberAt, (java.lang.String) object);
                        }
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(numberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, offset));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t, offset));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t, offset));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        z = false;
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t, offset));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t, offset));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (isFieldPresent(t, i6, i2, i, i3)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeGroupSize(numberAt, (com.google.protobuf.MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        z = false;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = false;
                    break;
                case 18:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeInt64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeUInt64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeInt32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeBoolList(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeStringList(numberAt, (java.util.List) unsafe.getObject(t, offset));
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessageList(numberAt, (java.util.List) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeByteStringList(numberAt, (java.util.List) unsafe.getObject(t, offset));
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeUInt32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeEnumList(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeSInt32List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeSInt64List(numberAt, (java.util.List) unsafe.getObject(t, offset), r9);
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeInt32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeBoolListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeUInt32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeEnumListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt32ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = com.google.protobuf.SchemaUtil.computeSizeSInt64ListNoTag((java.util.List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = com.google.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i7 += computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                    }
                    z = r9;
                    break;
                case 49:
                    computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeGroupList(numberAt, (java.util.List) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t, offset), getMapFieldDefaultEntry(i6));
                    z = r9;
                    i7 += computeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 52:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 53:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 54:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 55:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 56:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 57:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeFixed32Size(numberAt, r9);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 58:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBoolSize(numberAt, true);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 59:
                    if (isOneofPresent(t, numberAt, i6)) {
                        java.lang.Object object2 = unsafe.getObject(t, offset);
                        if (object2 instanceof com.google.protobuf.ByteString) {
                            computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(numberAt, (com.google.protobuf.ByteString) object2);
                        } else {
                            computeDoubleSize = com.google.protobuf.CodedOutputStream.computeStringSize(numberAt, (java.lang.String) object2);
                        }
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 60:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 61:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeBytesSize(numberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 62:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 63:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 64:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed32Size(numberAt, r9);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 65:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 66:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 67:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                case 68:
                    if (isOneofPresent(t, numberAt, i6)) {
                        computeDoubleSize = com.google.protobuf.CodedOutputStream.computeGroupSize(numberAt, (com.google.protobuf.MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i6));
                        z = r9;
                        i7 += computeDoubleSize;
                        break;
                    }
                    z = r9;
                    break;
                default:
                    z = r9;
                    break;
            }
            i6 += 3;
            i5 = i;
            r9 = z;
            i8 = i2;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i7 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    @Override // com.google.protobuf.Schema
    public final void writeTo(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else {
            writeFieldsInAscendingOrder(t, writer);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        int length;
        int i;
        int i2;
        java.util.Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        java.util.Map.Entry<?, ?> entry3;
        boolean z;
        if (this.hasExtensions) {
            com.google.protobuf.FieldSet<?> extensions = this.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it2 = extensions.iterator();
                entry = (java.util.Map.Entry) it2.next();
                it = it2;
                length = this.buffer.length;
                sun.misc.Unsafe unsafe = UNSAFE;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < length) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i8 = this.buffer[i + 2];
                        int i9 = i8 & i5;
                        java.util.Map.Entry<?, ?> entry4 = entry;
                        if (i9 != i6) {
                            i7 = i9 == i5 ? 0 : unsafe.getInt(t, i9);
                            i6 = i9;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = i6;
                        i3 = i10;
                        entry2 = entry4;
                    } else {
                        i2 = i6;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i11 = i7;
                    while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry2);
                        entry2 = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(t, offset));
                                break;
                            }
                        case 1:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFloat(numberAt, floatAt(t, offset));
                                break;
                            }
                        case 2:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            }
                        case 3:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeUInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            }
                        case 4:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 5:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFixed64(numberAt, unsafe.getLong(t, offset));
                                break;
                            }
                        case 6:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFixed32(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 7:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeBool(numberAt, booleanAt(t, offset));
                                break;
                            }
                        case 8:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writeString(numberAt, unsafe.getObject(t, offset), writer);
                                break;
                            }
                        case 9:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            }
                        case 10:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeBytes(numberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, offset));
                                break;
                            }
                        case 11:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeUInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 12:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeEnum(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 13:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSFixed32(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 14:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSFixed64(numberAt, unsafe.getLong(t, offset));
                                break;
                            }
                        case 15:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            }
                        case 16:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            }
                        case 17:
                            entry3 = entry2;
                            i4 = length;
                            if (!isFieldPresent(t, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            }
                        case 18:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 19:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 20:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 21:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 22:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 23:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 24:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 25:
                            z = false;
                            com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 26:
                            com.google.protobuf.SchemaUtil.writeStringList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 27:
                            com.google.protobuf.SchemaUtil.writeMessageList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, getMessageFieldSchema(i));
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 28:
                            com.google.protobuf.SchemaUtil.writeBytesList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 29:
                            com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 30:
                            com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 31:
                            com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 32:
                            com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 33:
                            com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 34:
                            com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 35:
                            com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 36:
                            com.google.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 37:
                            com.google.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 38:
                            com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 39:
                            com.google.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 40:
                            com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 41:
                            com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 42:
                            com.google.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 43:
                            com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 44:
                            com.google.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 45:
                            com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 46:
                            com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 47:
                            com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 48:
                            com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 49:
                            com.google.protobuf.SchemaUtil.writeGroupList(numberAt(i), (java.util.List) unsafe.getObject(t, offset), writer, getMessageFieldSchema(i));
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, unsafe.getObject(t, offset), i);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (isOneofPresent(t, numberAt, i)) {
                                writeString(numberAt, unsafe.getObject(t, offset), writer);
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBytes(numberAt, (com.google.protobuf.ByteString) unsafe.getObject(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        default:
                            i4 = length;
                            entry3 = entry2;
                            break;
                    }
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i11;
                    length = i4;
                    i5 = 1048575;
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
            }
        }
        entry = null;
        it = null;
        length = this.buffer.length;
        sun.misc.Unsafe unsafe2 = UNSAFE;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        java.util.Map.Entry<?, ?> entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
        if (this.hasExtensions) {
            com.google.protobuf.FieldSet<?> extensions = this.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                it = extensions.descendingIterator();
                entry = (java.util.Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(t, length)) {
                                writer.writeDouble(numberAt, doubleAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(t, length)) {
                                writer.writeFloat(numberAt, floatAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(t, length)) {
                                writer.writeInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(t, length)) {
                                writer.writeUInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(t, length)) {
                                writer.writeInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(t, length)) {
                                writer.writeFixed64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(t, length)) {
                                writer.writeFixed32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(t, length)) {
                                writer.writeBool(numberAt, booleanAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(t, length)) {
                                writeString(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(t, length)) {
                                writer.writeMessage(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(t, length)) {
                                writer.writeBytes(numberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(t, length)) {
                                writer.writeUInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(t, length)) {
                                writer.writeEnum(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(t, length)) {
                                writer.writeSFixed32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(t, length)) {
                                writer.writeSFixed64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(t, length)) {
                                writer.writeSInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(t, length)) {
                                writer.writeSInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(t, length)) {
                                writer.writeGroup(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            com.google.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            com.google.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            com.google.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            com.google.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            com.google.protobuf.SchemaUtil.writeStringList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            com.google.protobuf.SchemaUtil.writeMessageList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            com.google.protobuf.SchemaUtil.writeBytesList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            com.google.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            com.google.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            com.google.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            com.google.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            com.google.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            com.google.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            com.google.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            com.google.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            com.google.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            com.google.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            com.google.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            com.google.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            com.google.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            com.google.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            com.google.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            com.google.protobuf.SchemaUtil.writeGroupList(numberAt(length), (java.util.List) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), length);
                            break;
                        case 51:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(t, numberAt, length)) {
                                writeString(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeMessage(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeBytes(numberAt, (com.google.protobuf.ByteString) com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeEnum(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeGroup(numberAt, com.google.protobuf.UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private <K, V> void writeMapHelper(com.google.protobuf.Writer writer, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, com.google.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.Schema
    public final void mergeFrom(T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x06b4 A[LOOP:2: B:36:0x06b0->B:38:0x06b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x064b A[Catch: all -> 0x06a1, TRY_LEAVE, TryCatch #1 {all -> 0x06a1, blocks: (B:17:0x0621, B:44:0x0645, B:46:0x064b, B:57:0x0670, B:58:0x0675), top: B:16:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x066e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, com.google.protobuf.ExtensionSchema<ET> extensionSchema, T t, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        java.lang.Object obj;
        T t2;
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema2;
        int i;
        java.lang.Object obj2;
        T t3;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite2;
        java.lang.Object obj3;
        java.lang.Object filterUnknownEnumList;
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        T t4 = t;
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        java.lang.Object obj4 = null;
        com.google.protobuf.FieldSet<ET> fieldSet = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int positionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (positionForFieldNumber >= 0) {
                    t2 = t4;
                    try {
                        int typeAndOffsetAt = typeAndOffsetAt(positionForFieldNumber);
                        try {
                        } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            obj = obj4;
                            extensionRegistryLite2 = extensionRegistryLite3;
                        }
                        switch (type(typeAndOffsetAt)) {
                            case 0:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putDouble(t2, offset(typeAndOffsetAt), reader.readDouble());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 1:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putFloat(t2, offset(typeAndOffsetAt), reader.readFloat());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 2:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putLong(t2, offset(typeAndOffsetAt), reader.readInt64());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 3:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putLong(t2, offset(typeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 4:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), reader.readInt32());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 5:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putLong(t2, offset(typeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 6:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 7:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putBoolean(t2, offset(typeAndOffsetAt), reader.readBool());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 8:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readString(t2, typeAndOffsetAt, reader);
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 9:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.MessageLite messageLite = (com.google.protobuf.MessageLite) mutableMessageFieldForMerge(t2, positionForFieldNumber);
                                reader.mergeMessageField(messageLite, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                storeMessageField(t2, positionForFieldNumber, messageLite);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 10:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), reader.readBytes());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 11:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 12:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                int readEnum = reader.readEnum();
                                com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(readEnum)) {
                                    obj4 = com.google.protobuf.SchemaUtil.storeUnknownEnum(t2, fieldNumber, readEnum, obj, unknownFieldSchema2);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t4 = t2;
                                    break;
                                }
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), readEnum);
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 13:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 14:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putLong(t2, offset(typeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 15:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putInt(t2, offset(typeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 16:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.UnsafeUtil.putLong(t2, offset(typeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(t2, positionForFieldNumber);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 17:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                com.google.protobuf.MessageLite messageLite2 = (com.google.protobuf.MessageLite) mutableMessageFieldForMerge(t2, positionForFieldNumber);
                                reader.mergeGroupField(messageLite2, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                storeMessageField(t2, positionForFieldNumber, messageLite2);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 18:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 19:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 20:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 21:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 22:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 23:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 24:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 25:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 26:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readStringList(t2, typeAndOffsetAt, reader);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 27:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readMessageList(t, typeAndOffsetAt, reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 28:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBytesList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 29:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 30:
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                java.util.List<java.lang.Integer> mutableListAt = this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt);
                                filterUnknownEnumList = com.google.protobuf.SchemaUtil.filterUnknownEnumList(t, fieldNumber, mutableListAt, getEnumFieldVerifier(positionForFieldNumber), obj4, unknownFieldSchema);
                                obj4 = filterUnknownEnumList;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 31:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 32:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 33:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 34:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 35:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 36:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 37:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 38:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 39:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 40:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 41:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 42:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 43:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 44:
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                java.util.List<java.lang.Integer> mutableListAt2 = this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt2);
                                filterUnknownEnumList = com.google.protobuf.SchemaUtil.filterUnknownEnumList(t, fieldNumber, mutableListAt2, getEnumFieldVerifier(positionForFieldNumber), obj4, unknownFieldSchema);
                                obj4 = filterUnknownEnumList;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 45:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 46:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 47:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 48:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t2, offset(typeAndOffsetAt)));
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 49:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                try {
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    readGroupList(t, offset(typeAndOffsetAt), reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                    obj4 = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t4 = t2;
                                    break;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj4 = obj;
                                    obj2 = obj4;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                try {
                                    obj = obj4;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    try {
                                        try {
                                            mergeMap(t, positionForFieldNumber, getMapFieldDefaultEntry(positionForFieldNumber), extensionRegistryLite, reader);
                                            unknownFieldSchema2 = unknownFieldSchema3;
                                            obj4 = obj;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            unknownFieldSchema2 = unknownFieldSchema3;
                                            obj4 = obj;
                                            obj2 = obj4;
                                            while (i < this.repeatedFieldOffsetStart) {
                                            }
                                            if (obj2 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        obj4 = obj;
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t4 = t2;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    obj = obj4;
                                }
                                break;
                            case 51:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Double.valueOf(reader.readDouble()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 52:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Float.valueOf(reader.readFloat()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 53:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readInt64()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 54:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readUInt64()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 55:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readInt32()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 56:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readFixed64()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 57:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 58:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Boolean.valueOf(reader.readBool()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 59:
                                readString(t2, typeAndOffsetAt, reader);
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 60:
                                com.google.protobuf.MessageLite messageLite3 = (com.google.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t2, fieldNumber, positionForFieldNumber);
                                reader.mergeMessageField(messageLite3, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite3);
                                storeOneofMessageField(t2, fieldNumber, positionForFieldNumber, messageLite3);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 61:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), reader.readBytes());
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 62:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 63:
                                int readEnum2 = reader.readEnum();
                                com.google.protobuf.Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(readEnum2)) {
                                    obj4 = com.google.protobuf.SchemaUtil.storeUnknownEnum(t2, fieldNumber, readEnum2, obj4, unknownFieldSchema3);
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t4 = t2;
                                    break;
                                }
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(readEnum2));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 64:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 65:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 66:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 67:
                                com.google.protobuf.UnsafeUtil.putObject(t2, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readSInt64()));
                                setOneofPresent(t2, fieldNumber, positionForFieldNumber);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            case 68:
                                com.google.protobuf.MessageLite messageLite4 = (com.google.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t2, fieldNumber, positionForFieldNumber);
                                reader.mergeGroupField(messageLite4, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite3);
                                storeOneofMessageField(t2, fieldNumber, positionForFieldNumber, messageLite4);
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj4 = obj;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                                break;
                            default:
                                obj = obj4;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                if (obj == null) {
                                    try {
                                        obj4 = unknownFieldSchema2.getBuilderFromMessage(t2);
                                    } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        obj4 = obj;
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        obj4 = obj;
                                        obj2 = obj4;
                                        while (i < this.repeatedFieldOffsetStart) {
                                        }
                                        if (obj2 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj4 = obj;
                                }
                                try {
                                    try {
                                        if (!unknownFieldSchema2.mergeOneFieldFrom(obj4, reader, 0)) {
                                            obj3 = obj4;
                                            for (int i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                obj3 = filterMapUnknownEnumValues(t, this.intArray[i2], obj3, unknownFieldSchema, t);
                                            }
                                            if (obj3 == null) {
                                                return;
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        obj2 = obj4;
                                        for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                            obj2 = filterMapUnknownEnumValues(t, this.intArray[i], obj2, unknownFieldSchema, t);
                                        }
                                        if (obj2 != null) {
                                            unknownFieldSchema2.setBuilderToMessage(t2, obj2);
                                        }
                                        throw th;
                                    }
                                } catch (com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        if (!reader.skipField()) {
                                            obj3 = obj4;
                                            for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                obj3 = filterMapUnknownEnumValues(t, this.intArray[i3], obj3, unknownFieldSchema, t);
                                            }
                                            if (obj3 == null) {
                                                return;
                                            }
                                            unknownFieldSchema2.setBuilderToMessage(t2, obj3);
                                            return;
                                        }
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t4 = t2;
                                    } else {
                                        if (obj4 == null) {
                                            obj4 = unknownFieldSchema2.getBuilderFromMessage(t2);
                                        }
                                        if (!unknownFieldSchema2.mergeOneFieldFrom(obj4, reader, 0)) {
                                            obj3 = obj4;
                                            for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                                obj3 = filterMapUnknownEnumValues(t, this.intArray[i4], obj3, unknownFieldSchema, t);
                                            }
                                            if (obj3 == null) {
                                                return;
                                            }
                                            unknownFieldSchema2.setBuilderToMessage(t2, obj3);
                                            return;
                                        }
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t4 = t2;
                                    }
                                }
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t4 = t2;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obj = obj4;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj4 = obj;
                        obj2 = obj4;
                        while (i < this.repeatedFieldOffsetStart) {
                        }
                        if (obj2 != null) {
                        }
                        throw th;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        java.lang.Object obj5 = obj4;
                        for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                            obj5 = filterMapUnknownEnumValues(t, this.intArray[i5], obj5, unknownFieldSchema, t);
                        }
                        if (obj5 != null) {
                            unknownFieldSchema3.setBuilderToMessage(t4, obj5);
                            return;
                        }
                        return;
                    }
                    try {
                        java.lang.Object findExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite3, this.defaultInstance, fieldNumber);
                        if (findExtensionByNumber != null) {
                            if (fieldSet == null) {
                                try {
                                    fieldSet = extensionSchema.getMutableExtensions(t);
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    t2 = t4;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj2 = obj4;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            com.google.protobuf.FieldSet<ET> fieldSet2 = fieldSet;
                            t3 = t4;
                            try {
                                obj4 = extensionSchema.parseExtension(t, reader, findExtensionByNumber, extensionRegistryLite, fieldSet2, obj4, unknownFieldSchema);
                                fieldSet = fieldSet2;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                t2 = t3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj2 = obj4;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj2 != null) {
                                }
                                throw th;
                            }
                        } else {
                            t3 = t4;
                            try {
                                if (!unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                    if (obj4 == null) {
                                        obj4 = unknownFieldSchema3.getBuilderFromMessage(t3);
                                    }
                                    if (!unknownFieldSchema3.mergeOneFieldFrom(obj4, reader, 0)) {
                                    }
                                } else if (reader.skipField()) {
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                t2 = t3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj2 = obj4;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj2 != null) {
                                }
                                throw th;
                            }
                        }
                        t4 = t3;
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        t2 = t4;
                        obj = obj4;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj4 = obj;
                        obj2 = obj4;
                        while (i < this.repeatedFieldOffsetStart) {
                        }
                        if (obj2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                obj = obj4;
                t2 = t4;
            }
        }
        int i6 = this.checkInitializedCount;
        java.lang.Object obj6 = obj4;
        while (i6 < this.repeatedFieldOffsetStart) {
            obj6 = filterMapUnknownEnumValues(t, this.intArray[i6], obj6, unknownFieldSchema, t);
            i6++;
            t3 = t3;
        }
        T t5 = t3;
        if (obj6 != null) {
            unknownFieldSchema3.setBuilderToMessage(t5, obj6);
        }
    }

    static com.google.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object obj) {
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) obj;
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        com.google.protobuf.UnknownFieldSetLite newInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        switch (com.google.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return com.google.protobuf.ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = java.lang.Double.valueOf(com.google.protobuf.ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = java.lang.Integer.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = java.lang.Long.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = java.lang.Float.valueOf(com.google.protobuf.ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = java.lang.Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), bArr, i, i2, registers);
            case 15:
                int decodeVarint322 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i3;
        int decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i4 = registers.int1;
        if (i4 < 0 || i4 > i2 - decodeVarint32) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = decodeVarint32 + i4;
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i5) {
            int i6 = decodeVarint32 + 1;
            byte b = bArr[decodeVarint32];
            if (b < 0) {
                i3 = com.google.protobuf.ArrayDecoders.decodeVarint32(b, bArr, i6, registers);
                b = registers.int1;
            } else {
                i3 = i6;
            }
            int i7 = b >>> 3;
            int i8 = b & 7;
            if (i7 == 1) {
                if (i8 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    decodeVarint32 = com.google.protobuf.ArrayDecoders.skipField(b, bArr, i3, i2, registers);
                }
            } else {
                if (i7 == 2 && i8 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = com.google.protobuf.ArrayDecoders.skipField(b, bArr, i3, i2, registers);
            }
        }
        if (decodeVarint32 != i5) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int decodeVarint32List;
        sun.misc.Unsafe unsafe = UNSAFE;
        com.google.protobuf.Internal.ProtobufList protobufList = (com.google.protobuf.Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return com.google.protobuf.ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFloatList(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return com.google.protobuf.ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return com.google.protobuf.ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return com.google.protobuf.ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedBoolList(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE) == 0) {
                        return com.google.protobuf.ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufList, registers);
                    }
                    return com.google.protobuf.ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        decodeVarint32List = com.google.protobuf.ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                    }
                    return i;
                }
                decodeVarint32List = com.google.protobuf.ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                com.google.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) t, i4, (java.util.List<java.lang.Integer>) protobufList, getEnumFieldVerifier(i6), (java.lang.Object) null, (com.google.protobuf.UnknownFieldSchema<UT, java.lang.Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return com.google.protobuf.ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return com.google.protobuf.ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return com.google.protobuf.ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            default:
                return i;
        }
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.protobuf.ArrayDecoders.decodeDouble(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.protobuf.ArrayDecoders.decodeFloat(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int decodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(registers.long1));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(registers.int1));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed64(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.protobuf.ArrayDecoders.decodeFixed32(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int decodeVarint642 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int decodeVarint322 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i10 = registers.int1;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !com.google.protobuf.Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i10)) {
                            throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(t, j, new java.lang.String(bArr, decodeVarint322, i10, com.google.protobuf.Internal.UTF_8));
                        decodeVarint322 += i10;
                    }
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (i5 == 2) {
                    java.lang.Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeMessageField = com.google.protobuf.ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int decodeBytes = com.google.protobuf.ArrayDecoders.decodeBytes(bArr, i, registers);
                    unsafe.putObject(t, j, registers.object1);
                    unsafe.putInt(t, j2, i4);
                    return decodeBytes;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int decodeVarint323 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i11 = registers.int1;
                    com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i11)) {
                        unsafe.putObject(t, j, java.lang.Integer.valueOf(i11));
                        unsafe.putInt(t, j2, i4);
                        return decodeVarint323;
                    }
                    getMutableUnknownFields(t).storeField(i3, java.lang.Long.valueOf(i11));
                    return decodeVarint323;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int decodeVarint324 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int decodeVarint643 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t, j2, i4);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (i5 == 3) {
                    java.lang.Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeGroupField = com.google.protobuf.ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i;
    }

    private com.google.protobuf.Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        com.google.protobuf.Schema schema = (com.google.protobuf.Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        com.google.protobuf.Schema<T> schemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    private java.lang.Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private com.google.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (com.google.protobuf.Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x009a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int parseMessage(T t, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        com.google.protobuf.MessageSchema<T> messageSchema;
        int i5;
        int i6;
        int i7;
        int i8;
        T t2;
        int i9;
        int positionForFieldNumber;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        com.google.protobuf.ArrayDecoders.Registers registers2;
        com.google.protobuf.MessageSchema<T> messageSchema2;
        int i16;
        int i17;
        int i18;
        int i19;
        char c;
        byte[] bArr2;
        int i20;
        int i21;
        int decodeBytes;
        int i22;
        com.google.protobuf.MessageSchema<T> messageSchema3 = this;
        T t3 = t;
        byte[] bArr3 = bArr;
        int i23 = i2;
        int i24 = i3;
        com.google.protobuf.ArrayDecoders.Registers registers3 = registers;
        checkMutable(t);
        sun.misc.Unsafe unsafe2 = UNSAFE;
        int i25 = i;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b = bArr3[i25];
                if (b < 0) {
                    int decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(b, bArr3, i31, registers3);
                    i9 = registers3.int1;
                    i31 = decodeVarint32;
                } else {
                    i9 = b;
                }
                int i32 = i9 >>> 3;
                int i33 = i9 & 7;
                if (i32 > i29) {
                    positionForFieldNumber = messageSchema3.positionForFieldNumber(i32, i26 / 3);
                } else {
                    positionForFieldNumber = messageSchema3.positionForFieldNumber(i32);
                }
                int i34 = positionForFieldNumber;
                if (i34 == -1) {
                    i10 = i32;
                    i11 = i9;
                    i12 = i28;
                    i13 = i30;
                    unsafe = unsafe2;
                    i14 = 0;
                } else {
                    int i35 = messageSchema3.buffer[i34 + 1];
                    int type = type(i35);
                    long offset = offset(i35);
                    int i36 = i9;
                    if (type <= 17) {
                        int i37 = messageSchema3.buffer[i34 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = 1048575;
                        int i40 = i37 & 1048575;
                        if (i40 != i30) {
                            if (i30 != 1048575) {
                                unsafe2.putInt(t3, i30, i28);
                                i39 = 1048575;
                            }
                            if (i40 == i39) {
                                i13 = i40;
                                i17 = 0;
                            } else {
                                i13 = i40;
                                i17 = unsafe2.getInt(t3, i40);
                            }
                        } else {
                            i17 = i28;
                            i13 = i30;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 1) {
                                    com.google.protobuf.UnsafeUtil.putDouble(t3, offset, com.google.protobuf.ArrayDecoders.decodeDouble(bArr2, i31));
                                    i20 = i31 + 8;
                                    i21 = i17 | i38;
                                    i25 = i20;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4 && i4 != 0) {
                                        i8 = 1048575;
                                        messageSchema = this;
                                        i5 = i16;
                                        i28 = i12;
                                        i7 = i13;
                                        break;
                                    } else {
                                        messageSchema2 = this;
                                        registers2 = registers;
                                        if (!messageSchema2.hasExtensions && registers2.extensionRegistry != com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()) {
                                            i25 = com.google.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(i6, bArr, i16, i2, t, messageSchema2.defaultInstance, messageSchema2.unknownFieldSchema, registers);
                                        } else {
                                            i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                        }
                                        i28 = i12;
                                        i26 = i15;
                                        i30 = i13;
                                        t3 = t;
                                        bArr3 = bArr;
                                        i23 = i2;
                                        i27 = i6;
                                        messageSchema3 = messageSchema2;
                                        registers3 = registers2;
                                        i29 = i10;
                                        unsafe2 = unsafe;
                                        i24 = i4;
                                    }
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 5) {
                                    com.google.protobuf.UnsafeUtil.putFloat(t3, offset, com.google.protobuf.ArrayDecoders.decodeFloat(bArr2, i31));
                                    i20 = i31 + 4;
                                    i21 = i17 | i38;
                                    i25 = i20;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                        break;
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    int decodeVarint64 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i31, registers3);
                                    unsafe2.putLong(t, offset, registers3.long1);
                                    i28 = i17 | i38;
                                    i25 = decodeVarint64;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    i25 = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i31, registers3);
                                    unsafe2.putInt(t3, offset, registers3.int1);
                                    i21 = i17 | i38;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 1) {
                                    unsafe2.putLong(t, offset, com.google.protobuf.ArrayDecoders.decodeFixed64(bArr2, i31));
                                    i20 = i31 + 8;
                                    i21 = i17 | i38;
                                    i25 = i20;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 5) {
                                    unsafe2.putInt(t3, offset, com.google.protobuf.ArrayDecoders.decodeFixed32(bArr2, i31));
                                    i25 = i31 + 4;
                                    i21 = i17 | i38;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    i25 = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i31, registers3);
                                    com.google.protobuf.UnsafeUtil.putBoolean(t3, offset, registers3.long1 != 0);
                                    i21 = i17 | i38;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 2) {
                                    if (isEnforceUtf8(i35)) {
                                        i25 = com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr2, i31, registers3);
                                    } else {
                                        i25 = com.google.protobuf.ArrayDecoders.decodeString(bArr2, i31, registers3);
                                    }
                                    unsafe2.putObject(t3, offset, registers3.object1);
                                    i21 = i17 | i38;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 2) {
                                    java.lang.Object mutableMessageFieldForMerge = messageSchema3.mutableMessageFieldForMerge(t3, i18);
                                    i25 = com.google.protobuf.ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema3.getMessageFieldSchema(i18), bArr, i31, i2, registers);
                                    messageSchema3.storeMessageField(t3, i18, mutableMessageFieldForMerge);
                                    i21 = i17 | i38;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 2) {
                                    decodeBytes = com.google.protobuf.ArrayDecoders.decodeBytes(bArr2, i31, registers3);
                                    unsafe2.putObject(t3, offset, registers3.object1);
                                    i17 |= i38;
                                    i25 = decodeBytes;
                                    i28 = i17;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    decodeBytes = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i31, registers3);
                                    int i41 = registers3.int1;
                                    com.google.protobuf.Internal.EnumVerifier enumFieldVerifier = messageSchema3.getEnumFieldVerifier(i18);
                                    if (!isLegacyEnumIsClosed(i35) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i41)) {
                                        unsafe2.putInt(t3, offset, i41);
                                        i17 |= i38;
                                        i25 = decodeBytes;
                                        i28 = i17;
                                        i24 = i3;
                                        bArr3 = bArr2;
                                        i26 = i18;
                                        i27 = i19;
                                        i30 = i13;
                                        i29 = i10;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t).storeField(i19, java.lang.Long.valueOf(i41));
                                        i25 = decodeBytes;
                                        i28 = i17;
                                        i24 = i3;
                                        bArr3 = bArr2;
                                        i26 = i18;
                                        i27 = i19;
                                        i30 = i13;
                                        i29 = i10;
                                    }
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    decodeBytes = com.google.protobuf.ArrayDecoders.decodeVarint32(bArr2, i31, registers3);
                                    unsafe2.putInt(t3, offset, com.google.protobuf.CodedInputStream.decodeZigZag32(registers3.int1));
                                    i17 |= i38;
                                    i25 = decodeBytes;
                                    i28 = i17;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 16:
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                if (i33 == 0) {
                                    bArr2 = bArr;
                                    decodeBytes = com.google.protobuf.ArrayDecoders.decodeVarint64(bArr2, i31, registers3);
                                    unsafe2.putLong(t, offset, com.google.protobuf.CodedInputStream.decodeZigZag64(registers3.long1));
                                    i17 |= i38;
                                    i25 = decodeBytes;
                                    i28 = i17;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            case 17:
                                if (i33 == 3) {
                                    java.lang.Object mutableMessageFieldForMerge2 = messageSchema3.mutableMessageFieldForMerge(t3, i34);
                                    i10 = i32;
                                    i18 = i34;
                                    i19 = i36;
                                    i25 = com.google.protobuf.ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema3.getMessageFieldSchema(i34), bArr, i31, i2, (i32 << 3) | 4, registers);
                                    messageSchema3.storeMessageField(t3, i18, mutableMessageFieldForMerge2);
                                    i21 = i17 | i38;
                                    bArr2 = bArr;
                                    i28 = i21;
                                    i24 = i3;
                                    bArr3 = bArr2;
                                    i26 = i18;
                                    i27 = i19;
                                    i30 = i13;
                                    i29 = i10;
                                    break;
                                } else {
                                    i10 = i32;
                                    i18 = i34;
                                    i19 = i36;
                                    c = 65535;
                                    i16 = i31;
                                    i15 = i18;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i6 = i19;
                                    i4 = i3;
                                    if (i6 != i4) {
                                    }
                                    messageSchema2 = this;
                                    registers2 = registers;
                                    if (!messageSchema2.hasExtensions) {
                                    }
                                    i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                                break;
                            default:
                                i10 = i32;
                                i18 = i34;
                                i19 = i36;
                                c = 65535;
                                i16 = i31;
                                i15 = i18;
                                unsafe = unsafe2;
                                i12 = i17;
                                i6 = i19;
                                i4 = i3;
                                if (i6 != i4) {
                                }
                                messageSchema2 = this;
                                registers2 = registers;
                                if (!messageSchema2.hasExtensions) {
                                }
                                i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                i28 = i12;
                                i26 = i15;
                                i30 = i13;
                                t3 = t;
                                bArr3 = bArr;
                                i23 = i2;
                                i27 = i6;
                                messageSchema3 = messageSchema2;
                                registers3 = registers2;
                                i29 = i10;
                                unsafe2 = unsafe;
                                i24 = i4;
                                break;
                        }
                    } else {
                        i10 = i32;
                        int i42 = i30;
                        i12 = i28;
                        if (type != 27) {
                            i13 = i42;
                            if (type <= 49) {
                                int i43 = i31;
                                unsafe = unsafe2;
                                i15 = i34;
                                i11 = i36;
                                i25 = parseRepeatedField(t, bArr, i31, i2, i36, i10, i33, i34, i35, type, offset, registers);
                                if (i25 != i43) {
                                    messageSchema2 = this;
                                    i4 = i3;
                                    registers2 = registers;
                                    i6 = i11;
                                    i28 = i12;
                                    i26 = i15;
                                    i30 = i13;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i27 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i29 = i10;
                                    unsafe2 = unsafe;
                                    i24 = i4;
                                }
                            } else {
                                i22 = i31;
                                unsafe = unsafe2;
                                i15 = i34;
                                i11 = i36;
                                if (type != 50) {
                                    i25 = parseOneofField(t, bArr, i22, i2, i11, i10, i33, i35, type, offset, i15, registers);
                                    if (i25 == i22) {
                                        i4 = i3;
                                        i16 = i25;
                                        i6 = i11;
                                        if (i6 != i4) {
                                        }
                                        messageSchema2 = this;
                                        registers2 = registers;
                                        if (!messageSchema2.hasExtensions) {
                                        }
                                        i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                                        i28 = i12;
                                        i26 = i15;
                                        i30 = i13;
                                        t3 = t;
                                        bArr3 = bArr;
                                        i23 = i2;
                                        i27 = i6;
                                        messageSchema3 = messageSchema2;
                                        registers3 = registers2;
                                        i29 = i10;
                                        unsafe2 = unsafe;
                                        i24 = i4;
                                    }
                                } else if (i33 == 2) {
                                    i25 = parseMapField(t, bArr, i22, i2, i15, offset, registers);
                                    if (i25 == i22) {
                                    }
                                }
                                messageSchema3 = this;
                                t3 = t;
                                bArr3 = bArr;
                                i23 = i2;
                                i24 = i3;
                                registers3 = registers;
                                i27 = i11;
                                i28 = i12;
                                i26 = i15;
                                i30 = i13;
                                i29 = i10;
                                unsafe2 = unsafe;
                            }
                            i31 = i25;
                            i14 = i15;
                        } else if (i33 == 2) {
                            com.google.protobuf.Internal.ProtobufList protobufList = (com.google.protobuf.Internal.ProtobufList) unsafe2.getObject(t3, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t3, offset, protobufList);
                            }
                            i25 = com.google.protobuf.ArrayDecoders.decodeMessageList(messageSchema3.getMessageFieldSchema(i34), i36, bArr, i31, i2, protobufList, registers);
                            i24 = i3;
                            i26 = i34;
                            i27 = i36;
                            i28 = i12;
                            i30 = i42;
                            i29 = i10;
                            bArr3 = bArr;
                        } else {
                            i13 = i42;
                            i22 = i31;
                            unsafe = unsafe2;
                            i15 = i34;
                            i11 = i36;
                        }
                        i31 = i22;
                        i14 = i15;
                    }
                    i23 = i2;
                }
                i4 = i3;
                i15 = i14;
                i16 = i31;
                i6 = i11;
                if (i6 != i4) {
                }
                messageSchema2 = this;
                registers2 = registers;
                if (!messageSchema2.hasExtensions) {
                }
                i25 = com.google.protobuf.ArrayDecoders.decodeUnknownField(i6, bArr, i16, i2, getMutableUnknownFields(t), registers);
                i28 = i12;
                i26 = i15;
                i30 = i13;
                t3 = t;
                bArr3 = bArr;
                i23 = i2;
                i27 = i6;
                messageSchema3 = messageSchema2;
                registers3 = registers2;
                i29 = i10;
                unsafe2 = unsafe;
                i24 = i4;
            } else {
                int i44 = i30;
                unsafe = unsafe2;
                i4 = i24;
                messageSchema = messageSchema3;
                i5 = i25;
                i6 = i27;
                i7 = i44;
                i8 = 1048575;
            }
        }
        if (i7 != i8) {
            t2 = t;
            unsafe.putInt(t2, i7, i28);
        } else {
            t2 = t;
        }
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i45 = messageSchema.checkInitializedCount; i45 < messageSchema.repeatedFieldOffsetStart; i45++) {
            unknownFieldSetLite = (com.google.protobuf.UnknownFieldSetLite) filterMapUnknownEnumValues(t, messageSchema.intArray[i45], unknownFieldSetLite, messageSchema.unknownFieldSchema, t);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableMessageFieldForMerge(T t, int i) {
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(t, offset);
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeMessageField(T t, int i, java.lang.Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeOneofMessageField(T t, int i, int i2, java.lang.Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    @Override // com.google.protobuf.Schema
    public final void mergeFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        parseMessage(t, bArr, i, i2, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public final void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof com.google.protobuf.GeneratedMessageLite) {
                com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) t;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i);
                long offset = offset(typeAndOffsetAt);
                int type = type(typeAndOffsetAt);
                if (type != 9) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t, numberAt(i), i)) {
                            getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
                        }
                    } else {
                        switch (type) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t, offset);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = UNSAFE;
                                java.lang.Object object = unsafe.getObject(t, offset);
                                if (object != null) {
                                    unsafe.putObject(t, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (isFieldPresent(t, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t);
            }
        }
    }

    private final <K, V> void mergeMap(java.lang.Object obj, int i, java.lang.Object obj2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.Reader reader) throws java.io.IOException {
        long offset = offset(typeAndOffsetAt(i));
        java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            com.google.protobuf.UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            com.google.protobuf.UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object obj, int i, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj2) {
        com.google.protobuf.Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, java.util.Map<K, V> map, com.google.protobuf.Internal.EnumVerifier enumVerifier, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj) {
        com.google.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                com.google.protobuf.ByteString.CodedBuilder newCodedBuilder = com.google.protobuf.ByteString.newCodedBuilder(com.google.protobuf.MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    com.google.protobuf.MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int numberAt = numberAt(i6);
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type == 9 || type == 17) {
                if (isFieldPresent(t, i6, i, i2, i9) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t, numberAt, i6) && !isInitialized(t, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t, typeAndOffsetAt, i6)) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(java.lang.Object obj, int i, com.google.protobuf.Schema schema) {
        return schema.isInitialized(com.google.protobuf.UnsafeUtil.getObject(obj, offset(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(java.lang.Object obj, int i, int i2) {
        java.util.List list = (java.util.List) com.google.protobuf.UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        com.google.protobuf.Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        java.util.Map<?, ?> forMapData = this.mapFieldSchema.forMapData(com.google.protobuf.UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (java.lang.Object obj : forMapData.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) obj.getClass());
            }
            if (!r5.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int i, java.lang.Object obj, com.google.protobuf.Writer writer) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            writer.writeString(i, (java.lang.String) obj);
        } else {
            writer.writeBytes(i, (com.google.protobuf.ByteString) obj);
        }
    }

    private void readString(java.lang.Object obj, int i, com.google.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(i)) {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            com.google.protobuf.UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(java.lang.Object obj, int i, com.google.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private <E> void readMessageList(java.lang.Object obj, int i, com.google.protobuf.Reader reader, com.google.protobuf.Schema<E> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private <E> void readGroupList(java.lang.Object obj, long j, com.google.protobuf.Reader reader, com.google.protobuf.Schema<E> schema, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static boolean isMutable(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.protobuf.GeneratedMessageLite) {
            return ((com.google.protobuf.GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private static void checkMutable(java.lang.Object obj) {
        if (!isMutable(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getDouble(t, j);
    }

    private static <T> float floatAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getFloat(t, j);
    }

    private static <T> int intAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getInt(t, j);
    }

    private static <T> long longAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getLong(t, j);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return com.google.protobuf.UnsafeUtil.getBoolean(t, j);
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((java.lang.Double) com.google.protobuf.UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((java.lang.Float) com.google.protobuf.UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((java.lang.Integer) com.google.protobuf.UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((java.lang.Long) com.google.protobuf.UnsafeUtil.getObject(t, j)).longValue();
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((java.lang.Boolean) com.google.protobuf.UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    private boolean isFieldPresent(T t, int i) {
        boolean equals;
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (com.google.protobuf.UnsafeUtil.getInt(t, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.protobuf.UnsafeUtil.getDouble(t, offset)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.protobuf.UnsafeUtil.getFloat(t, offset)) != 0;
            case 2:
                return com.google.protobuf.UnsafeUtil.getLong(t, offset) != 0;
            case 3:
                return com.google.protobuf.UnsafeUtil.getLong(t, offset) != 0;
            case 4:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 5:
                return com.google.protobuf.UnsafeUtil.getLong(t, offset) != 0;
            case 6:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 7:
                return com.google.protobuf.UnsafeUtil.getBoolean(t, offset);
            case 8:
                java.lang.Object object = com.google.protobuf.UnsafeUtil.getObject(t, offset);
                if (object instanceof java.lang.String) {
                    equals = ((java.lang.String) object).isEmpty();
                    break;
                } else if (object instanceof com.google.protobuf.ByteString) {
                    equals = com.google.protobuf.ByteString.EMPTY.equals(object);
                    break;
                } else {
                    throw new java.lang.IllegalArgumentException();
                }
            case 9:
                return com.google.protobuf.UnsafeUtil.getObject(t, offset) != null;
            case 10:
                equals = com.google.protobuf.ByteString.EMPTY.equals(com.google.protobuf.UnsafeUtil.getObject(t, offset));
                break;
            case 11:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 12:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 13:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 14:
                return com.google.protobuf.UnsafeUtil.getLong(t, offset) != 0;
            case 15:
                return com.google.protobuf.UnsafeUtil.getInt(t, offset) != 0;
            case 16:
                return com.google.protobuf.UnsafeUtil.getLong(t, offset) != 0;
            case 17:
                return com.google.protobuf.UnsafeUtil.getObject(t, offset) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
        return !equals;
    }

    private void setFieldPresent(T t, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        com.google.protobuf.UnsafeUtil.putInt(t, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | com.google.protobuf.UnsafeUtil.getInt(t, j));
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return com.google.protobuf.UnsafeUtil.getInt(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return com.google.protobuf.UnsafeUtil.getInt(t, presenceMaskAndOffsetAt) == com.google.protobuf.UnsafeUtil.getInt(t2, presenceMaskAndOffsetAt);
    }

    private void setOneofPresent(T t, int i, int i2) {
        com.google.protobuf.UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    final int getSchemaSize() {
        return this.buffer.length * 3;
    }
}
