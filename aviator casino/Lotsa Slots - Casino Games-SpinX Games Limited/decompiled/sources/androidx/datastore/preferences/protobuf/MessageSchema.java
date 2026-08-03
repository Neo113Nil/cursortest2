package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSchema<T> implements androidx.datastore.preferences.protobuf.Schema<T> {
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
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final androidx.datastore.preferences.protobuf.ProtoSyntax syntax;
    private final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final sun.misc.Unsafe UNSAFE = androidx.datastore.preferences.protobuf.UnsafeUtil.getUnsafe();

    private static boolean isEnforceUtf8(int value) {
        return (value & 536870912) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    private static boolean isRequired(int value) {
        return (value & 268435456) != 0;
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static int type(int value) {
        return (value & FIELD_TYPE_MASK) >>> 20;
    }

    private MessageSchema(int[] buffer, java.lang.Object[] objects, int minFieldNumber, int maxFieldNumber, androidx.datastore.preferences.protobuf.MessageLite defaultInstance, androidx.datastore.preferences.protobuf.ProtoSyntax syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema) {
        this.buffer = buffer;
        this.objects = objects;
        this.minFieldNumber = minFieldNumber;
        this.maxFieldNumber = maxFieldNumber;
        this.lite = defaultInstance instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite;
        this.syntax = syntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(defaultInstance);
        this.useCachedSizeField = useCachedSizeField;
        this.intArray = intArray;
        this.checkInitializedCount = checkInitialized;
        this.repeatedFieldOffsetStart = mapFieldPositions;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
        this.mapFieldSchema = mapFieldSchema;
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> messageClass, androidx.datastore.preferences.protobuf.MessageInfo messageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof androidx.datastore.preferences.protobuf.RawMessageInfo) {
            return newSchemaForRawMessageInfo((androidx.datastore.preferences.protobuf.RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((androidx.datastore.preferences.protobuf.StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo messageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema) {
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
        int i18;
        java.lang.String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        java.lang.reflect.Field reflectField;
        int i24;
        char charAt11;
        int i25;
        int i26;
        java.lang.Object obj;
        java.lang.reflect.Field reflectField2;
        java.lang.Object obj2;
        java.lang.reflect.Field reflectField3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        java.lang.String stringInfo = messageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (stringInfo.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt16 = stringInfo.charAt(i);
        if (charAt16 >= 55296) {
            int i33 = charAt16 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt15 = stringInfo.charAt(i32);
                if (charAt15 < 55296) {
                    break;
                }
                i33 |= (charAt15 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt16 = i33 | (charAt15 << i34);
            i32 = i30;
        }
        if (charAt16 == 0) {
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt17 = stringInfo.charAt(i32);
            if (charAt17 >= 55296) {
                int i36 = charAt17 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    charAt10 = stringInfo.charAt(i35);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i36 |= (charAt10 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                charAt17 = i36 | (charAt10 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int charAt18 = stringInfo.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    charAt9 = stringInfo.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                charAt18 = i39 | (charAt9 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            int charAt19 = stringInfo.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    charAt8 = stringInfo.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                charAt19 = i42 | (charAt8 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int charAt20 = stringInfo.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    charAt7 = stringInfo.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                charAt20 = i45 | (charAt7 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            charAt = stringInfo.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    charAt6 = stringInfo.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                charAt = i48 | (charAt6 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            charAt2 = stringInfo.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    charAt5 = stringInfo.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                charAt2 = i51 | (charAt5 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int charAt21 = stringInfo.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i8 = i53 + 1;
                    charAt4 = stringInfo.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i8;
                }
                charAt21 = i54 | (charAt4 << i55);
                i53 = i8;
            }
            int i56 = i53 + 1;
            int charAt22 = stringInfo.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i56 + 1;
                    charAt3 = stringInfo.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i7;
                }
                charAt22 = i57 | (charAt3 << i58);
                i56 = i7;
            }
            i2 = (charAt17 * 2) + charAt18;
            i3 = charAt17;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i4 = charAt22;
            i32 = i56;
            i5 = charAt19;
            i6 = charAt20;
        }
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object[] objects = messageInfo.getObjects();
        java.lang.Class<?> cls = messageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[charAt * 2];
        int i59 = i4 + charAt2;
        int i60 = i4;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i32 < length) {
            int i64 = i32 + 1;
            int charAt23 = stringInfo.charAt(i32);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i29 = i66 + 1;
                    charAt14 = stringInfo.charAt(i66);
                    if (charAt14 < c) {
                        break;
                    }
                    i65 |= (charAt14 & 8191) << i67;
                    i67 += 13;
                    i66 = i29;
                }
                charAt23 = i65 | (charAt14 << i67);
                i15 = i29;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int charAt24 = stringInfo.charAt(i15);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i28 = i70 + 1;
                    charAt13 = stringInfo.charAt(i70);
                    if (charAt13 < c) {
                        break;
                    }
                    i69 |= (charAt13 & 8191) << i71;
                    i71 += 13;
                    i70 = i28;
                }
                charAt24 = i69 | (charAt13 << i71);
                i16 = i28;
            } else {
                i16 = i68;
            }
            int i72 = charAt24 & 255;
            int i73 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = i62;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = stringInfo.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        charAt12 = stringInfo.charAt(i75);
                        if (charAt12 < c2) {
                            break;
                        }
                        i76 |= (charAt12 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i76 | (charAt12 << i77);
                    i75 = i27;
                }
                int i78 = i72 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i26 = i2 + 1;
                    objArr[((i63 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i78 == 12 && (messageInfo.getSyntax().equals(androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0)) {
                        i26 = i2 + 1;
                        objArr[((i63 / 3) * 2) + 1] = objects[i2];
                    }
                    int i80 = charAt25 * 2;
                    obj = objects[i80];
                    if (!(obj instanceof java.lang.reflect.Field)) {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        reflectField2 = reflectField(cls, (java.lang.String) obj);
                        objects[i80] = reflectField2;
                    }
                    i17 = i5;
                    i23 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i81 = i80 + 1;
                    obj2 = objects[i81];
                    if (!(obj2 instanceof java.lang.reflect.Field)) {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        reflectField3 = reflectField(cls, (java.lang.String) obj2);
                        objects[i81] = reflectField3;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField3);
                    i18 = i6;
                    i19 = i2;
                    i21 = i79;
                    str = stringInfo;
                    i20 = objectFieldOffset;
                    i22 = 0;
                }
                i2 = i26;
                int i802 = charAt25 * 2;
                obj = objects[i802];
                if (!(obj instanceof java.lang.reflect.Field)) {
                }
                i17 = i5;
                i23 = (int) unsafe.objectFieldOffset(reflectField2);
                int i812 = i802 + 1;
                obj2 = objects[i812];
                if (!(obj2 instanceof java.lang.reflect.Field)) {
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField3);
                i18 = i6;
                i19 = i2;
                i21 = i79;
                str = stringInfo;
                i20 = objectFieldOffset2;
                i22 = 0;
            } else {
                i17 = i5;
                int i82 = i2 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (java.lang.String) objects[i2]);
                if (i72 == 9 || i72 == 17) {
                    i18 = i6;
                    objArr[((i63 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i18 = i6;
                        i25 = i2 + 2;
                        objArr[((i63 / 3) * 2) + 1] = objects[i82];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        i18 = i6;
                        if (messageInfo.getSyntax() == androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i25 = i2 + 2;
                            objArr[((i63 / 3) * 2) + 1] = objects[i82];
                        }
                    } else {
                        if (i72 == 50) {
                            int i83 = i60 + 1;
                            iArr[i60] = i63;
                            int i84 = (i63 / 3) * 2;
                            int i85 = i2 + 2;
                            objArr[i84] = objects[i82];
                            if ((charAt24 & 2048) != 0) {
                                i82 = i2 + 3;
                                objArr[i84 + 1] = objects[i85];
                                i60 = i83;
                            } else {
                                i60 = i83;
                                i82 = i85;
                            }
                        }
                        i18 = i6;
                    }
                    i82 = i25;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) == 0 || i72 > 17) {
                    str = stringInfo;
                    i19 = i82;
                    i20 = 1048575;
                    i21 = i16;
                    i22 = 0;
                } else {
                    i21 = i16 + 1;
                    int charAt26 = stringInfo.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i86 = charAt26 & 8191;
                        int i87 = 13;
                        while (true) {
                            i24 = i21 + 1;
                            charAt11 = stringInfo.charAt(i21);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i86 |= (charAt11 & 8191) << i87;
                            i87 += 13;
                            i21 = i24;
                        }
                        charAt26 = i86 | (charAt11 << i87);
                        i21 = i24;
                    }
                    int i88 = (i3 * 2) + (charAt26 / 32);
                    java.lang.Object obj3 = objects[i88];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        reflectField = (java.lang.reflect.Field) obj3;
                    } else {
                        reflectField = reflectField(cls, (java.lang.String) obj3);
                        objects[i88] = reflectField;
                    }
                    str = stringInfo;
                    i19 = i82;
                    i22 = charAt26 % 32;
                    i20 = (int) unsafe.objectFieldOffset(reflectField);
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i61] = objectFieldOffset3;
                    i61++;
                }
                i23 = objectFieldOffset3;
            }
            int i89 = i63 + 1;
            iArr2[i63] = charAt23;
            int i90 = i63 + 2;
            int i91 = i3;
            iArr2[i89] = i23 | (i72 << 20) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0);
            i63 += 3;
            iArr2[i90] = i20 | (i22 << 20);
            i32 = i21;
            stringInfo = str;
            i2 = i19;
            length = i73;
            i6 = i18;
            i62 = i74;
            i3 = i91;
            i5 = i17;
            c = 55296;
        }
        return new androidx.datastore.preferences.protobuf.MessageSchema<>(iArr2, objArr, i5, i6, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), false, iArr, i4, i59, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> messageClass, java.lang.String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = messageClass.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForMessageInfo(androidx.datastore.preferences.protobuf.StructuralMessageInfo messageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        androidx.datastore.preferences.protobuf.FieldInfo[] fields = messageInfo.getFields();
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
        for (androidx.datastore.preferences.protobuf.FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == androidx.datastore.preferences.protobuf.FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            androidx.datastore.preferences.protobuf.FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == androidx.datastore.preferences.protobuf.FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
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
        return new androidx.datastore.preferences.protobuf.MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo fi, int[] buffer, int bufferIndex, java.lang.Object[] objects) {
        int objectFieldOffset;
        int id;
        long objectFieldOffset2;
        int i;
        int numberOfTrailingZeros;
        androidx.datastore.preferences.protobuf.OneofInfo oneof = fi.getOneof();
        if (oneof != null) {
            id = fi.getType().id() + 51;
            objectFieldOffset = (int) androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(oneof.getValueField());
            objectFieldOffset2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            androidx.datastore.preferences.protobuf.FieldType type = fi.getType();
            objectFieldOffset = (int) androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(fi.getField());
            id = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fi.getPresenceField();
                i = presenceField == null ? 1048575 : (int) androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(presenceField);
                numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(fi.getPresenceMask());
                buffer[bufferIndex] = fi.getFieldNumber();
                buffer[bufferIndex + 1] = (fi.isRequired() ? 268435456 : 0) | (fi.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
                buffer[bufferIndex + 2] = i | (numberOfTrailingZeros << 20);
                java.lang.Class<?> messageFieldClass = fi.getMessageFieldClass();
                if (fi.getMapDefaultEntry() == null) {
                }
            } else if (fi.getCachedSizeField() != null) {
                objectFieldOffset2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(fi.getCachedSizeField());
            } else {
                i = 0;
                numberOfTrailingZeros = 0;
                buffer[bufferIndex] = fi.getFieldNumber();
                buffer[bufferIndex + 1] = (fi.isRequired() ? 268435456 : 0) | (fi.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
                buffer[bufferIndex + 2] = i | (numberOfTrailingZeros << 20);
                java.lang.Class<?> messageFieldClass2 = fi.getMessageFieldClass();
                if (fi.getMapDefaultEntry() == null) {
                    if (messageFieldClass2 != null) {
                        objects[((bufferIndex / 3) * 2) + 1] = messageFieldClass2;
                        return;
                    } else {
                        if (fi.getEnumVerifier() != null) {
                            objects[((bufferIndex / 3) * 2) + 1] = fi.getEnumVerifier();
                            return;
                        }
                        return;
                    }
                }
                int i2 = (bufferIndex / 3) * 2;
                objects[i2] = fi.getMapDefaultEntry();
                if (messageFieldClass2 != null) {
                    objects[i2 + 1] = messageFieldClass2;
                    return;
                } else {
                    if (fi.getEnumVerifier() != null) {
                        objects[i2 + 1] = fi.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
        }
        i = (int) objectFieldOffset2;
        numberOfTrailingZeros = 0;
        buffer[bufferIndex] = fi.getFieldNumber();
        buffer[bufferIndex + 1] = (fi.isRequired() ? 268435456 : 0) | (fi.isEnforceUtf8() ? 536870912 : 0) | (id << 20) | objectFieldOffset;
        buffer[bufferIndex + 2] = i | (numberOfTrailingZeros << 20);
        java.lang.Class<?> messageFieldClass22 = fi.getMessageFieldClass();
        if (fi.getMapDefaultEntry() == null) {
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T message, T other) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(message, other, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    private boolean equals(T message, T other, int pos) {
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(message, other, pos) && java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(message, offset)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(other, offset));
            case 1:
                return arePresentForEquals(message, other, pos) && java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(message, offset)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(other, offset));
            case 2:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset);
            case 3:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset);
            case 4:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 5:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset);
            case 6:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 7:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(other, offset);
            case 8:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
            case 9:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
            case 10:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
            case 11:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 12:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 13:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 14:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset);
            case 15:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset);
            case 16:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) == androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset);
            case 17:
                return arePresentForEquals(message, other, pos) && androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
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
                return androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
            case 50:
                return androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
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
                return isOneofCaseEqual(message, other, pos) && androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
            default:
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T message) {
        int i;
        int hashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            int i4 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(message, offset)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(message, offset));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashBoolean(androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(message, offset));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((java.lang.String) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    java.lang.Object object = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset);
                    if (object != null) {
                        i4 = object.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset));
                    i2 = i + hashLong;
                    break;
                case 17:
                    java.lang.Object object2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset);
                    if (object2 != null) {
                        i4 = object2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
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
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(oneofDoubleAt(message, offset)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = java.lang.Float.floatToIntBits(oneofFloatAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(oneofLongAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(oneofLongAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(oneofLongAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashBoolean(oneofBooleanAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = ((java.lang.String) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(oneofLongAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.Internal.hashLong(oneofLongAt(message, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(message, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(message).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(message, other, i);
        }
        androidx.datastore.preferences.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    private void mergeSingleField(T message, T other, int pos) {
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(pos);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putDouble(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putFloat(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putBoolean(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
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
                this.listFieldSchema.mergeListsAt(message, other, offset);
                break;
            case 50:
                androidx.datastore.preferences.protobuf.SchemaUtil.mergeMap(this.mapFieldSchema, message, other, offset);
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
                if (isOneofPresent(other, numberAt, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
                    setOneofPresent(message, numberAt, pos);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(message, other, pos);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(other, numberAt, pos)) {
                    androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(other, offset));
                    setOneofPresent(message, numberAt, pos);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long offset = offset(typeAndOffsetAt(pos));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(sourceParent, offset);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            androidx.datastore.preferences.protobuf.Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (!isMutable(object)) {
                    unsafe.putObject(targetParent, offset, object);
                } else {
                    java.lang.Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(targetParent, offset, newInstance);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(targetParent, offset);
            if (!isMutable(object2)) {
                java.lang.Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(targetParent, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int numberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, numberAt, pos)) {
            long offset = offset(typeAndOffsetAt(pos));
            sun.misc.Unsafe unsafe = UNSAFE;
            java.lang.Object object = unsafe.getObject(sourceParent, offset);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            androidx.datastore.preferences.protobuf.Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, numberAt, pos)) {
                if (!isMutable(object)) {
                    unsafe.putObject(targetParent, offset, object);
                } else {
                    java.lang.Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(targetParent, offset, newInstance);
                }
                setOneofPresent(targetParent, numberAt, pos);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(targetParent, offset);
            if (!isMutable(object2)) {
                java.lang.Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(targetParent, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T message) {
        int i;
        int i2;
        int i3;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        sun.misc.Unsafe unsafe = UNSAFE;
        ?? r9 = 0;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i7);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i7);
            int i9 = this.buffer[i7 + 2];
            int i10 = i9 & i4;
            if (type <= 17) {
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(message, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            if (type < androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || type > androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED.id()) {
                i10 = 0;
            }
            int i11 = i10;
            switch (type) {
                case 0:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(message, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(message, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(message, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if (!isFieldPresent(message, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeDoubleSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i8 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(numberAt, true);
                        i8 += computeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        java.lang.Object object = unsafe.getObject(message, offset);
                        if (object instanceof androidx.datastore.preferences.protobuf.ByteString) {
                            computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(numberAt, (androidx.datastore.preferences.protobuf.ByteString) object);
                        } else {
                            computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(numberAt, (java.lang.String) object);
                        }
                        i8 += computeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(numberAt, (androidx.datastore.preferences.protobuf.ByteString) unsafe.getObject(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        i8 += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(numberAt, 0);
                    }
                    break;
                case 14:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(message, i7, i, i2, i3)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(numberAt, (androidx.datastore.preferences.protobuf.MessageLite) unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolList(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeStringList(numberAt, (java.util.List) unsafe.getObject(message, offset));
                    i8 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessageList(numberAt, (java.util.List) unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                    i8 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeByteStringList(numberAt, (java.util.List) unsafe.getObject(message, offset));
                    i8 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumList(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64List(numberAt, (java.util.List) unsafe.getObject(message, offset), r9);
                    i8 += computeBoolSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64ListNoTag((java.util.List) unsafe.getObject(message, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(message, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeBoolSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeBoolSize;
                    }
                    break;
                case 49:
                    computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeGroupList(numberAt, (java.util.List) unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                    i8 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(message, offset), getMapFieldDefaultEntry(i7));
                    i8 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i8 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i8 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(numberAt, r9);
                        i8 += computeBoolSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(numberAt, true);
                        i8 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(message, numberAt, i7)) {
                        java.lang.Object object2 = unsafe.getObject(message, offset);
                        if (object2 instanceof androidx.datastore.preferences.protobuf.ByteString) {
                            computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(numberAt, (androidx.datastore.preferences.protobuf.ByteString) object2);
                        } else {
                            computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(numberAt, (java.lang.String) object2);
                        }
                        i8 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(numberAt, (androidx.datastore.preferences.protobuf.ByteString) unsafe.getObject(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(numberAt, r9);
                        i8 += computeBoolSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(message, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(message, numberAt, i7)) {
                        computeBoolSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(numberAt, (androidx.datastore.preferences.protobuf.MessageLite) unsafe.getObject(message, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            r9 = 0;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i8 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, message);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(message).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSize(schema.getFromMessage(message));
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (writer.fieldOrder() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        int length;
        int i;
        int i2;
        java.util.Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        java.util.Map.Entry<?, ?> entry3;
        java.util.Map.Entry<?, ?> entry4;
        if (this.hasExtensions) {
            androidx.datastore.preferences.protobuf.FieldSet<?> extensions = this.extensionSchema.getExtensions(message);
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
                        if (i9 != i6) {
                            if (i9 == i5) {
                                entry4 = entry;
                                i7 = 0;
                            } else {
                                entry4 = entry;
                                i7 = unsafe.getInt(message, i9);
                            }
                            i6 = i9;
                        } else {
                            entry4 = entry;
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
                            if (!isFieldPresent(message, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(message, offset));
                                continue;
                            }
                        case 1:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeFloat(numberAt, floatAt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeInt64(numberAt, unsafe.getLong(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeUInt64(numberAt, unsafe.getLong(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeInt32(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeFixed64(numberAt, unsafe.getLong(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeFixed32(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeBool(numberAt, booleanAt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writeString(numberAt, unsafe.getObject(message, offset), writer);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeMessage(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeBytes(numberAt, (androidx.datastore.preferences.protobuf.ByteString) unsafe.getObject(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeUInt32(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeEnum(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeSFixed32(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeSFixed64(numberAt, unsafe.getLong(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeSInt32(numberAt, unsafe.getInt(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            i4 = length;
                            entry3 = entry2;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeSInt64(numberAt, unsafe.getLong(message, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry2;
                            i4 = length;
                            if (isFieldPresent(message, i, i2, i11, i3)) {
                                writer.writeGroup(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 19:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 20:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 21:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 22:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 23:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 24:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 25:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 26:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer);
                            break;
                        case 27:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 28:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer);
                            break;
                        case 29:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 30:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 31:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 32:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 33:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 34:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, false);
                            break;
                        case 35:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 36:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 37:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 38:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 39:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 40:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 41:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 42:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 43:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 44:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 45:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 46:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 47:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 48:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, true);
                            break;
                        case 49:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(numberAt(i), (java.util.List) unsafe.getObject(message, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, unsafe.getObject(message, offset), i);
                            break;
                        case 51:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(message, offset));
                                break;
                            }
                            break;
                        case 52:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(message, offset));
                                break;
                            }
                            break;
                        case 53:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(message, offset));
                                break;
                            }
                            break;
                        case 54:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(message, offset));
                                break;
                            }
                            break;
                        case 55:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 56:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(message, offset));
                                break;
                            }
                            break;
                        case 57:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 58:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(message, offset));
                                break;
                            }
                            break;
                        case 59:
                            if (isOneofPresent(message, numberAt, i)) {
                                writeString(numberAt, unsafe.getObject(message, offset), writer);
                                break;
                            }
                            break;
                        case 60:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                        case 61:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeBytes(numberAt, (androidx.datastore.preferences.protobuf.ByteString) unsafe.getObject(message, offset));
                                break;
                            }
                            break;
                        case 62:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 63:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 64:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 65:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(message, offset));
                                break;
                            }
                            break;
                        case 66:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(message, offset));
                                break;
                            }
                            break;
                        case 67:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(message, offset));
                                break;
                            }
                            break;
                        case 68:
                            if (isOneofPresent(message, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(message, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                    }
                    i4 = length;
                    entry3 = entry2;
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
                writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
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
        writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        java.util.Map.Entry<?, ?> entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, message, writer);
        if (this.hasExtensions) {
            androidx.datastore.preferences.protobuf.FieldSet<?> extensions = this.extensionSchema.getExtensions(message);
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
                            if (isFieldPresent(message, length)) {
                                writer.writeDouble(numberAt, doubleAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(message, length)) {
                                writer.writeFloat(numberAt, floatAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(message, length)) {
                                writer.writeInt64(numberAt, longAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(message, length)) {
                                writer.writeUInt64(numberAt, longAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(message, length)) {
                                writer.writeInt32(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(message, length)) {
                                writer.writeFixed64(numberAt, longAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(message, length)) {
                                writer.writeFixed32(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(message, length)) {
                                writer.writeBool(numberAt, booleanAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(message, length)) {
                                writeString(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(message, length)) {
                                writer.writeMessage(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(message, length)) {
                                writer.writeBytes(numberAt, (androidx.datastore.preferences.protobuf.ByteString) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(message, length)) {
                                writer.writeUInt32(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(message, length)) {
                                writer.writeEnum(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(message, length)) {
                                writer.writeSFixed32(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(message, length)) {
                                writer.writeSFixed64(numberAt, longAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(message, length)) {
                                writer.writeSInt32(numberAt, intAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(message, length)) {
                                writer.writeSInt64(numberAt, longAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(message, length)) {
                                writer.writeGroup(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(numberAt(length), (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), length);
                            break;
                        case 51:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeFloat(numberAt, oneofFloatAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeInt64(numberAt, oneofLongAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeUInt64(numberAt, oneofLongAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeInt32(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeFixed64(numberAt, oneofLongAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeFixed32(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeBool(numberAt, oneofBooleanAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(message, numberAt, length)) {
                                writeString(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeMessage(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeBytes(numberAt, (androidx.datastore.preferences.protobuf.ByteString) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeUInt32(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeEnum(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeSInt32(numberAt, oneofIntAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeSInt64(numberAt, oneofLongAt(message, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(message, numberAt, length)) {
                                writer.writeGroup(numberAt, androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
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

    private <K, V> void writeMapHelper(androidx.datastore.preferences.protobuf.Writer writer, int number, java.lang.Object mapField, int pos) throws java.io.IOException {
        if (mapField != null) {
            writer.writeMap(number, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(pos)), this.mapFieldSchema.forMapData(mapField));
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        schema.writeTo(schema.getFromMessage(message), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0642 A[Catch: all -> 0x069a, TRY_LEAVE, TryCatch #9 {all -> 0x069a, blocks: (B:17:0x0613, B:35:0x063c, B:37:0x0642, B:50:0x066a, B:51:0x066f), top: B:16:0x0613 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06ab A[LOOP:4: B:65:0x06a7->B:67:0x06ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x06c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> extensionSchema, T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        T t;
        androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema2;
        int i;
        java.lang.Object obj;
        T t2;
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite;
        java.lang.Object obj2;
        androidx.datastore.preferences.protobuf.UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        T t3 = message;
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite2 = extensionRegistry;
        java.lang.Object obj3 = null;
        androidx.datastore.preferences.protobuf.FieldSet<ET> fieldSet = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int positionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (positionForFieldNumber >= 0) {
                    t = t3;
                    try {
                        int typeAndOffsetAt = typeAndOffsetAt(positionForFieldNumber);
                        switch (type(typeAndOffsetAt)) {
                            case 0:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putDouble(t, offset(typeAndOffsetAt), reader.readDouble());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 1:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putFloat(t, offset(typeAndOffsetAt), reader.readFloat());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 2:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(t, offset(typeAndOffsetAt), reader.readInt64());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 3:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(t, offset(typeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 4:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), reader.readInt32());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 5:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(t, offset(typeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 6:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 7:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putBoolean(t, offset(typeAndOffsetAt), reader.readBool());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 8:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readString(t, typeAndOffsetAt, reader);
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 9:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.MessageLite messageLite = (androidx.datastore.preferences.protobuf.MessageLite) mutableMessageFieldForMerge(t, positionForFieldNumber);
                                reader.mergeMessageField(messageLite, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                storeMessageField(t, positionForFieldNumber, messageLite);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 10:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), reader.readBytes());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 11:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 12:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                int readEnum = reader.readEnum();
                                androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(readEnum)) {
                                    obj3 = androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(t, fieldNumber, readEnum, obj2, unknownFieldSchema2);
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                    break;
                                }
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), readEnum);
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 13:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 14:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(t, offset(typeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 15:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(t, offset(typeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 16:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(t, offset(typeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(t, positionForFieldNumber);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 17:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                androidx.datastore.preferences.protobuf.MessageLite messageLite2 = (androidx.datastore.preferences.protobuf.MessageLite) mutableMessageFieldForMerge(t, positionForFieldNumber);
                                reader.mergeGroupField(messageLite2, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                storeMessageField(t, positionForFieldNumber, messageLite2);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 18:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 19:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 20:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 21:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 22:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 23:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 24:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 25:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 26:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readStringList(t, typeAndOffsetAt, reader);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 27:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readMessageList(message, typeAndOffsetAt, reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistry);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 28:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBytesList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 29:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 30:
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                java.util.List<java.lang.Integer> mutableListAt = this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt);
                                obj3 = androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList(message, fieldNumber, mutableListAt, getEnumFieldVerifier(positionForFieldNumber), obj3, unknownFieldSchema);
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 31:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 32:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 33:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 34:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 35:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 36:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 37:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 38:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 39:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 40:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 41:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 42:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 43:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 44:
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                java.util.List<java.lang.Integer> mutableListAt2 = this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt2);
                                obj3 = androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList(message, fieldNumber, mutableListAt2, getEnumFieldVerifier(positionForFieldNumber), obj3, unknownFieldSchema);
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 45:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 46:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 47:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 48:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(typeAndOffsetAt)));
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 49:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readGroupList(message, offset(typeAndOffsetAt), reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistry);
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 50:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                try {
                                    mergeMap(message, positionForFieldNumber, getMapFieldDefaultEntry(positionForFieldNumber), extensionRegistry, reader);
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj3 = obj2;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj3 = obj2;
                                    if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj3 = obj2;
                                    obj = obj3;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 51:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Double.valueOf(reader.readDouble()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 52:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Float.valueOf(reader.readFloat()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 53:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readInt64()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 54:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readUInt64()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 55:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readInt32()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 56:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readFixed64()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 57:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 58:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Boolean.valueOf(reader.readBool()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 59:
                                readString(t, typeAndOffsetAt, reader);
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 60:
                                androidx.datastore.preferences.protobuf.MessageLite messageLite3 = (androidx.datastore.preferences.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t, fieldNumber, positionForFieldNumber);
                                reader.mergeMessageField(messageLite3, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                storeOneofMessageField(t, fieldNumber, positionForFieldNumber, messageLite3);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 61:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), reader.readBytes());
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 62:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 63:
                                int readEnum2 = reader.readEnum();
                                androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(readEnum2)) {
                                    obj3 = androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(t, fieldNumber, readEnum2, obj3, unknownFieldSchema3);
                                    extensionRegistryLite = extensionRegistryLite2;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                    break;
                                }
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(readEnum2));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 64:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 65:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 66:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 67:
                                androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(t, offset(typeAndOffsetAt), java.lang.Long.valueOf(reader.readSInt64()));
                                setOneofPresent(t, fieldNumber, positionForFieldNumber);
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj2;
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            case 68:
                                try {
                                    androidx.datastore.preferences.protobuf.MessageLite messageLite4 = (androidx.datastore.preferences.protobuf.MessageLite) mutableOneofMessageFieldForMerge(t, fieldNumber, positionForFieldNumber);
                                    reader.mergeGroupField(messageLite4, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                    storeOneofMessageField(t, fieldNumber, positionForFieldNumber, messageLite4);
                                    obj2 = obj3;
                                    extensionRegistryLite = extensionRegistryLite2;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj3 = obj2;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    extensionRegistryLite = extensionRegistryLite2;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj = obj3;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                t3 = t;
                                break;
                            default:
                                obj2 = obj3;
                                extensionRegistryLite = extensionRegistryLite2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                if (obj2 == null) {
                                    try {
                                        obj3 = unknownFieldSchema2.getBuilderFromMessage(t);
                                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        obj3 = obj2;
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t3 = t;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        obj3 = obj2;
                                        obj = obj3;
                                        while (i < this.repeatedFieldOffsetStart) {
                                        }
                                        if (obj != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj3 = obj2;
                                }
                                try {
                                    try {
                                        if (!unknownFieldSchema2.mergeOneFieldFrom(obj3, reader, 0)) {
                                            java.lang.Object obj4 = obj3;
                                            for (int i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                obj4 = filterMapUnknownEnumValues(message, this.intArray[i2], obj4, unknownFieldSchema, message);
                                            }
                                            if (obj4 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t, obj4);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        if (unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                            if (obj3 == null) {
                                                obj3 = unknownFieldSchema2.getBuilderFromMessage(t);
                                            }
                                            if (!unknownFieldSchema2.mergeOneFieldFrom(obj3, reader, 0)) {
                                                java.lang.Object obj5 = obj3;
                                                for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                    obj5 = filterMapUnknownEnumValues(message, this.intArray[i3], obj5, unknownFieldSchema, message);
                                                }
                                                if (obj5 != null) {
                                                    unknownFieldSchema2.setBuilderToMessage(t, obj5);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!reader.skipField()) {
                                            java.lang.Object obj6 = obj3;
                                            for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                                obj6 = filterMapUnknownEnumValues(message, this.intArray[i4], obj6, unknownFieldSchema, message);
                                            }
                                            if (obj6 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(t, obj6);
                                                return;
                                            }
                                            return;
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        t3 = t;
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    t3 = t;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj = obj3;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        java.lang.Object obj7 = obj3;
                        for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                            obj7 = filterMapUnknownEnumValues(message, this.intArray[i5], obj7, unknownFieldSchema, message);
                        }
                        if (obj7 != null) {
                            unknownFieldSchema3.setBuilderToMessage(t3, obj7);
                            return;
                        }
                        return;
                    }
                    try {
                        java.lang.Object findExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite2, this.defaultInstance, fieldNumber);
                        if (findExtensionByNumber != null) {
                            if (fieldSet == null) {
                                fieldSet = extensionSchema.getMutableExtensions(message);
                            }
                            androidx.datastore.preferences.protobuf.FieldSet<ET> fieldSet2 = fieldSet;
                            t2 = t3;
                            try {
                                obj3 = extensionSchema.parseExtension(message, reader, findExtensionByNumber, extensionRegistry, fieldSet2, obj3, unknownFieldSchema);
                                fieldSet = fieldSet2;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                t = t2;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj = obj3;
                                for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                    obj = filterMapUnknownEnumValues(message, this.intArray[i], obj, unknownFieldSchema, message);
                                }
                                if (obj != null) {
                                    unknownFieldSchema2.setBuilderToMessage(t, obj);
                                }
                                throw th;
                            }
                        } else {
                            t2 = t3;
                            if (!unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                if (obj3 == null) {
                                    obj3 = unknownFieldSchema3.getBuilderFromMessage(t2);
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(obj3, reader, 0)) {
                                }
                            } else if (!reader.skipField()) {
                            }
                        }
                        t3 = t2;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        t = t3;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj = obj3;
                        while (i < this.repeatedFieldOffsetStart) {
                        }
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        int i6 = this.checkInitializedCount;
        java.lang.Object obj8 = obj3;
        while (i6 < this.repeatedFieldOffsetStart) {
            obj8 = filterMapUnknownEnumValues(message, this.intArray[i6], obj8, unknownFieldSchema, message);
            i6++;
            t2 = t2;
        }
        T t4 = t2;
        if (obj8 != null) {
            unknownFieldSchema3.setBuilderToMessage(t4, obj8);
        }
    }

    static androidx.datastore.preferences.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object message) {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) message;
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite newInstance = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> messageType, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        switch (androidx.datastore.preferences.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = java.lang.Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytes(data, position, registers);
            case 3:
                registers.object1 = java.lang.Double.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeDouble(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.object1 = java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed32(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.object1 = java.lang.Long.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed64(data, position));
                return position + 8;
            case 8:
                registers.object1 = java.lang.Float.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFloat(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = java.lang.Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = java.lang.Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageField(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) messageType), data, position, limit, registers);
            case 15:
                int decodeVarint322 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = java.lang.Long.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeStringRequireUtf8(data, position, registers);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> target, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i;
        int decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
        int i2 = registers.int1;
        if (i2 < 0 || i2 > limit - decodeVarint32) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        int i3 = decodeVarint32 + i2;
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i3) {
            int i4 = decodeVarint32 + 1;
            byte b = data[decodeVarint32];
            if (b < 0) {
                i = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(b, data, i4, registers);
                b = registers.int1;
            } else {
                i = i4;
            }
            int i5 = b >>> 3;
            int i6 = b & 7;
            if (i5 == 1) {
                if (i6 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(data, i, limit, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(b, data, i, limit, registers);
                }
            } else {
                if (i5 == 2 && i6 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(data, i, limit, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(b, data, i, limit, registers);
            }
        }
        if (decodeVarint32 != i3) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        target.put(obj, obj2);
        return i3;
    }

    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int decodeVarint32List;
        sun.misc.Unsafe unsafe = UNSAFE;
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) unsafe.getObject(message, fieldOffset);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, protobufList);
        }
        switch (fieldType) {
            case 18:
            case 35:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedDoubleList(data, position, protobufList, registers);
                }
                if (wireType == 1) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeDoubleList(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedFloatList(data, position, protobufList, registers);
                }
                if (wireType == 5) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFloatList(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedVarint64List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedVarint32List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedFixed64List(data, position, protobufList, registers);
                }
                if (wireType == 1) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed64List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedFixed32List(data, position, protobufList, registers);
                }
                if (wireType == 5) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed32List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedBoolList(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBoolList(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 26:
                if (wireType == 2) {
                    if ((typeAndOffset & 536870912) == 0) {
                        return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeStringList(tag, data, position, limit, protobufList, registers);
                    }
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeStringListRequireUtf8(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 27:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList, registers);
                }
                break;
            case 28:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytesList(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (wireType == 2) {
                    decodeVarint32List = androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedVarint32List(data, position, protobufList, registers);
                } else if (wireType == 0) {
                    decodeVarint32List = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList, registers);
                }
                androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) message, number, (java.util.List<java.lang.Integer>) protobufList, getEnumFieldVerifier(bufferPosition), (java.lang.Object) null, (androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, java.lang.Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedSInt32List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeSInt32List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (wireType == 2) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodePackedSInt64List(data, position, protobufList, registers);
                }
                if (wireType == 0) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeSInt64List(tag, data, position, limit, protobufList, registers);
                }
                break;
            case 49:
                if (wireType == 3) {
                    return androidx.datastore.preferences.protobuf.ArrayDecoders.decodeGroupList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList, registers);
                }
                break;
        }
        return position;
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        java.lang.Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        java.lang.Object object = unsafe.getObject(message, fieldOffset);
        if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(message, fieldOffset, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(data, position, limit, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = UNSAFE;
        long j = this.buffer[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType == 1) {
                    unsafe.putObject(message, fieldOffset, java.lang.Double.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeDouble(data, position)));
                    int i = position + 8;
                    unsafe.putInt(message, j, number);
                    return i;
                }
                break;
            case 52:
                if (wireType == 5) {
                    unsafe.putObject(message, fieldOffset, java.lang.Float.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFloat(data, position)));
                    int i2 = position + 4;
                    unsafe.putInt(message, j, number);
                    return i2;
                }
                break;
            case 53:
            case 54:
                if (wireType == 0) {
                    int decodeVarint64 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, java.lang.Long.valueOf(registers.long1));
                    unsafe.putInt(message, j, number);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (wireType == 0) {
                    int decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                    unsafe.putObject(message, fieldOffset, java.lang.Integer.valueOf(registers.int1));
                    unsafe.putInt(message, j, number);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (wireType == 1) {
                    unsafe.putObject(message, fieldOffset, java.lang.Long.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed64(data, position)));
                    int i3 = position + 8;
                    unsafe.putInt(message, j, number);
                    return i3;
                }
                break;
            case 57:
            case 64:
                if (wireType == 5) {
                    unsafe.putObject(message, fieldOffset, java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed32(data, position)));
                    int i4 = position + 4;
                    unsafe.putInt(message, j, number);
                    return i4;
                }
                break;
            case 58:
                if (wireType == 0) {
                    int decodeVarint642 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, java.lang.Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(message, j, number);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (wireType == 2) {
                    int decodeVarint322 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                    int i5 = registers.int1;
                    if (i5 == 0) {
                        unsafe.putObject(message, fieldOffset, "");
                    } else {
                        if ((typeAndOffset & 536870912) != 0 && !androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(data, decodeVarint322, decodeVarint322 + i5)) {
                            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(message, fieldOffset, new java.lang.String(data, decodeVarint322, i5, androidx.datastore.preferences.protobuf.Internal.UTF_8));
                        decodeVarint322 += i5;
                    }
                    unsafe.putInt(message, j, number);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (wireType == 2) {
                    java.lang.Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int mergeMessageField = androidx.datastore.preferences.protobuf.ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                    storeOneofMessageField(message, number, bufferPosition, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                break;
            case 61:
                if (wireType == 2) {
                    int decodeBytes = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytes(data, position, registers);
                    unsafe.putObject(message, fieldOffset, registers.object1);
                    unsafe.putInt(message, j, number);
                    return decodeBytes;
                }
                break;
            case 63:
                if (wireType == 0) {
                    int decodeVarint323 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                    int i6 = registers.int1;
                    androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i6)) {
                        unsafe.putObject(message, fieldOffset, java.lang.Integer.valueOf(i6));
                        unsafe.putInt(message, j, number);
                    } else {
                        getMutableUnknownFields(message).storeField(tag, java.lang.Long.valueOf(i6));
                    }
                    return decodeVarint323;
                }
                break;
            case 66:
                if (wireType == 0) {
                    int decodeVarint324 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
                    unsafe.putObject(message, fieldOffset, java.lang.Integer.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(message, j, number);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (wireType == 0) {
                    int decodeVarint643 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(data, position, registers);
                    unsafe.putObject(message, fieldOffset, java.lang.Long.valueOf(androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(message, j, number);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (wireType == 3) {
                    java.lang.Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int mergeGroupField = androidx.datastore.preferences.protobuf.ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                    storeOneofMessageField(message, number, bufferPosition, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return position;
    }

    private androidx.datastore.preferences.protobuf.Schema getMessageFieldSchema(int pos) {
        int i = (pos / 3) * 2;
        androidx.datastore.preferences.protobuf.Schema schema = (androidx.datastore.preferences.protobuf.Schema) this.objects[i];
        if (schema != null) {
            return schema;
        }
        androidx.datastore.preferences.protobuf.Schema<T> schemaFor = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) this.objects[i + 1]);
        this.objects[i] = schemaFor;
        return schemaFor;
    }

    private java.lang.Object getMapFieldDefaultEntry(int pos) {
        return this.objects[(pos / 3) * 2];
    }

    private androidx.datastore.preferences.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int pos) {
        return (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.objects[((pos / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x0097. Please report as an issue. */
    int parseMessage(T message, byte[] data, int position, int limit, int endDelimited, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i;
        androidx.datastore.preferences.protobuf.MessageSchema<T> messageSchema;
        int i2;
        int i3;
        int i4;
        int i5;
        T t;
        int i6;
        int positionForFieldNumber;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        byte[] bArr2;
        int decodeVarint64;
        int i15;
        int i16;
        androidx.datastore.preferences.protobuf.MessageSchema<T> messageSchema2 = this;
        T t2 = message;
        byte[] bArr3 = data;
        int i17 = limit;
        int i18 = endDelimited;
        androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers2 = registers;
        checkMutable(message);
        sun.misc.Unsafe unsafe2 = UNSAFE;
        int i19 = position;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1048575;
        while (true) {
            if (i19 < i17) {
                int i25 = i19 + 1;
                byte b = bArr3[i19];
                if (b < 0) {
                    int decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(b, bArr3, i25, registers2);
                    i6 = registers2.int1;
                    i25 = decodeVarint32;
                } else {
                    i6 = b;
                }
                int i26 = i6 >>> 3;
                int i27 = i6 & 7;
                if (i26 > i20) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i26, i21 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i26);
                }
                int i28 = positionForFieldNumber;
                if (i28 == -1) {
                    i7 = i26;
                    i8 = i25;
                    i3 = i6;
                    i9 = i23;
                    i10 = i24;
                    unsafe = unsafe2;
                    i = i18;
                    i11 = 0;
                } else {
                    int i29 = messageSchema2.buffer[i28 + 1];
                    int type = type(i29);
                    long offset = offset(i29);
                    int i30 = i6;
                    if (type <= 17) {
                        int i31 = messageSchema2.buffer[i28 + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = 1048575;
                        int i34 = i31 & 1048575;
                        if (i34 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(t2, i24, i23);
                                i33 = 1048575;
                            }
                            i10 = i34;
                            i12 = i34 == i33 ? 0 : unsafe2.getInt(t2, i34);
                        } else {
                            i12 = i23;
                            i10 = i24;
                        }
                        switch (type) {
                            case 0:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 1) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putDouble(t2, offset, androidx.datastore.preferences.protobuf.ArrayDecoders.decodeDouble(bArr, i25));
                                    i19 = i25 + 8;
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 1:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 5) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putFloat(t2, offset, androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFloat(bArr, i25));
                                    i19 = i25 + 4;
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 2:
                            case 3:
                                bArr2 = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    decodeVarint64 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(bArr2, i25, registers2);
                                    unsafe2.putLong(message, offset, registers2.long1);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr2;
                                    i19 = decodeVarint64;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 4:
                            case 11:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(bArr, i25, registers2);
                                    unsafe2.putInt(t2, offset, registers2.int1);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 5:
                            case 14:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 1) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    unsafe2.putLong(message, offset, androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed64(bArr, i25));
                                    i19 = i25 + 8;
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 6:
                            case 13:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 5) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    unsafe2.putInt(t2, offset, androidx.datastore.preferences.protobuf.ArrayDecoders.decodeFixed32(bArr, i25));
                                    i19 = i25 + 4;
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 7:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(bArr, i25, registers2);
                                    androidx.datastore.preferences.protobuf.UnsafeUtil.putBoolean(t2, offset, registers2.long1 != 0);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 8:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 2) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    if (isEnforceUtf8(i29)) {
                                        i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeStringRequireUtf8(bArr, i25, registers2);
                                    } else {
                                        i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeString(bArr, i25, registers2);
                                    }
                                    unsafe2.putObject(t2, offset, registers2.object1);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 9:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 2) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    java.lang.Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t2, i13);
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i13), data, i25, limit, registers);
                                    messageSchema2.storeMessageField(t2, i13, mutableMessageFieldForMerge);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 10:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 2) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytes(bArr, i25, registers2);
                                    unsafe2.putObject(t2, offset, registers2.object1);
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 12:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(bArr, i25, registers2);
                                    int i35 = registers2.int1;
                                    androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i13);
                                    if (!isLegacyEnumIsClosed(i29) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i35)) {
                                        unsafe2.putInt(t2, offset, i35);
                                        i23 = i12 | i32;
                                        i18 = endDelimited;
                                        i21 = i13;
                                        bArr3 = bArr;
                                        i22 = i14;
                                        i24 = i10;
                                        i20 = i7;
                                        i17 = limit;
                                    } else {
                                        getMutableUnknownFields(message).storeField(i14, java.lang.Long.valueOf(i35));
                                        i18 = endDelimited;
                                        i21 = i13;
                                        i23 = i12;
                                        i22 = i14;
                                        i24 = i10;
                                        i20 = i7;
                                        i17 = limit;
                                        bArr3 = bArr;
                                    }
                                }
                                break;
                            case 15:
                                bArr = data;
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(bArr, i25, registers2);
                                    unsafe2.putInt(t2, offset, androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(registers2.int1));
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 16:
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                bArr2 = data;
                                if (i27 != 0) {
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    decodeVarint64 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint64(bArr2, i25, registers2);
                                    unsafe2.putLong(message, offset, androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(registers2.long1));
                                    i23 = i12 | i32;
                                    i18 = endDelimited;
                                    i21 = i13;
                                    bArr3 = bArr2;
                                    i19 = decodeVarint64;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            case 17:
                                if (i27 != 3) {
                                    i7 = i26;
                                    i14 = i30;
                                    i13 = i28;
                                    i = endDelimited;
                                    i8 = i25;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i9 = i12;
                                    i3 = i14;
                                    break;
                                } else {
                                    java.lang.Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t2, i28);
                                    i7 = i26;
                                    i14 = i30;
                                    i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i28), data, i25, limit, (i26 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t2, i28, mutableMessageFieldForMerge2);
                                    i23 = i12 | i32;
                                    bArr3 = data;
                                    i18 = endDelimited;
                                    i21 = i28;
                                    i22 = i14;
                                    i24 = i10;
                                    i20 = i7;
                                    i17 = limit;
                                }
                            default:
                                i7 = i26;
                                i13 = i28;
                                i14 = i30;
                                i = endDelimited;
                                i8 = i25;
                                i11 = i13;
                                unsafe = unsafe2;
                                i9 = i12;
                                i3 = i14;
                                break;
                        }
                    } else {
                        i7 = i26;
                        int i36 = i24;
                        i9 = i23;
                        if (type != 27) {
                            i10 = i36;
                            if (type <= 49) {
                                int i37 = i25;
                                unsafe = unsafe2;
                                i11 = i28;
                                i16 = i30;
                                i19 = parseRepeatedField(message, data, i25, limit, i30, i7, i27, i28, i29, type, offset, registers);
                                if (i19 != i37) {
                                    messageSchema2 = this;
                                    t2 = message;
                                    bArr3 = data;
                                    i17 = limit;
                                    i18 = endDelimited;
                                    registers2 = registers;
                                    i22 = i16;
                                    i23 = i9;
                                    i21 = i11;
                                    i24 = i10;
                                    i20 = i7;
                                    unsafe2 = unsafe;
                                } else {
                                    i = endDelimited;
                                    i8 = i19;
                                    i3 = i16;
                                }
                            } else {
                                i15 = i25;
                                unsafe = unsafe2;
                                i11 = i28;
                                i16 = i30;
                                if (type != 50) {
                                    i19 = parseOneofField(message, data, i15, limit, i16, i7, i27, i29, type, offset, i11, registers);
                                    if (i19 != i15) {
                                        messageSchema2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        registers2 = registers;
                                        i22 = i16;
                                        i23 = i9;
                                        i21 = i11;
                                        i24 = i10;
                                        i20 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = i19;
                                        i3 = i16;
                                    }
                                } else if (i27 == 2) {
                                    i19 = parseMapField(message, data, i15, limit, i11, offset, registers);
                                    if (i19 != i15) {
                                        messageSchema2 = this;
                                        t2 = message;
                                        bArr3 = data;
                                        i17 = limit;
                                        i18 = endDelimited;
                                        registers2 = registers;
                                        i22 = i16;
                                        i23 = i9;
                                        i21 = i11;
                                        i24 = i10;
                                        i20 = i7;
                                        unsafe2 = unsafe;
                                    } else {
                                        i = endDelimited;
                                        i8 = i19;
                                        i3 = i16;
                                    }
                                }
                            }
                        } else if (i27 == 2) {
                            androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) unsafe2.getObject(t2, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t2, offset, protobufList);
                            }
                            i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i28), i30, data, i25, limit, protobufList, registers);
                            i18 = endDelimited;
                            i21 = i28;
                            i22 = i30;
                            i23 = i9;
                            i24 = i36;
                            i20 = i7;
                            bArr3 = data;
                            i17 = limit;
                        } else {
                            i10 = i36;
                            i15 = i25;
                            unsafe = unsafe2;
                            i11 = i28;
                            i16 = i30;
                        }
                        i = endDelimited;
                        i8 = i15;
                        i3 = i16;
                    }
                }
                if (i3 != i || i == 0) {
                    if (this.hasExtensions && registers.extensionRegistry != androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()) {
                        i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(i3, data, i8, limit, message, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i19 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeUnknownField(i3, data, i8, limit, getMutableUnknownFields(message), registers);
                    }
                    t2 = message;
                    bArr3 = data;
                    i17 = limit;
                    i22 = i3;
                    messageSchema2 = this;
                    registers2 = registers;
                    i23 = i9;
                    i21 = i11;
                    i24 = i10;
                    i20 = i7;
                    unsafe2 = unsafe;
                    i18 = i;
                } else {
                    i5 = 1048575;
                    messageSchema = this;
                    i2 = i8;
                    i23 = i9;
                    i4 = i10;
                }
            } else {
                int i38 = i24;
                unsafe = unsafe2;
                i = i18;
                messageSchema = messageSchema2;
                i2 = i19;
                i3 = i22;
                i4 = i38;
                i5 = 1048575;
            }
        }
        if (i4 != i5) {
            t = message;
            unsafe.putInt(t, i4, i23);
        } else {
            t = message;
        }
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i39 = messageSchema.checkInitializedCount; i39 < messageSchema.repeatedFieldOffsetStart; i39++) {
            unknownFieldSetLite = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) filterMapUnknownEnumValues(message, messageSchema.intArray[i39], unknownFieldSetLite, messageSchema.unknownFieldSchema, message);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t, unknownFieldSetLite);
        }
        if (i == 0) {
            if (i2 != limit) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        } else if (i2 > limit || i3 != i) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableMessageFieldForMerge(T message, int pos) {
        androidx.datastore.preferences.protobuf.Schema messageFieldSchema = getMessageFieldSchema(pos);
        long offset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(message, offset);
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeMessageField(T message, int pos, java.lang.Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        androidx.datastore.preferences.protobuf.Schema messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        java.lang.Object object = UNSAFE.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        java.lang.Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, java.lang.Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        parseMessage(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T message) {
        if (isMutable(message)) {
            if (message instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) message;
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
                        if (isOneofPresent(message, numberAt(i), i)) {
                            getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(message, offset));
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
                                this.listFieldSchema.makeImmutableListAt(message, offset);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = UNSAFE;
                                java.lang.Object object = unsafe.getObject(message, offset);
                                if (object != null) {
                                    unsafe.putObject(message, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (isFieldPresent(message, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(message, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(message);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(message);
            }
        }
    }

    private final <K, V> void mergeMap(java.lang.Object message, int pos, java.lang.Object mapDefaultEntry, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.Reader reader) throws java.io.IOException {
        long offset = offset(typeAndOffsetAt(pos));
        java.lang.Object object = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(mapDefaultEntry);
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            java.lang.Object newMapField = this.mapFieldSchema.newMapField(mapDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object obj, int i, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        java.lang.Object object = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, java.util.Map<K, V> map, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                androidx.datastore.preferences.protobuf.ByteString.CodedBuilder newCodedBuilder = androidx.datastore.preferences.protobuf.ByteString.newCodedBuilder(androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T message) {
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
                    i4 = UNSAFE.getInt(message, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(message, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type == 9 || type == 17) {
                if (isFieldPresent(message, i6, i, i2, i9) && !isInitialized(message, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(message, numberAt, i6) && !isInitialized(message, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(message, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(message, typeAndOffsetAt, i6)) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(message).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(java.lang.Object message, int typeAndOffset, androidx.datastore.preferences.protobuf.Schema schema) {
        return schema.isInitialized(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffset)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(java.lang.Object message, int typeAndOffset, int pos) {
        java.util.List list = (java.util.List) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        androidx.datastore.preferences.protobuf.Schema messageFieldSchema = getMessageFieldSchema(pos);
        for (int i = 0; i < list.size(); i++) {
            if (!messageFieldSchema.isInitialized(list.get(i))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        java.util.Map<?, ?> forMapData = this.mapFieldSchema.forMapData(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (java.lang.Object obj : forMapData.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) obj.getClass());
            }
            if (!r5.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            writer.writeString(fieldNumber, (java.lang.String) value);
        } else {
            writer.writeBytes(fieldNumber, (androidx.datastore.preferences.protobuf.ByteString) value);
        }
    }

    private void readString(java.lang.Object message, int typeAndOffset, androidx.datastore.preferences.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.lite) {
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readString());
        } else {
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(java.lang.Object message, int typeAndOffset, androidx.datastore.preferences.protobuf.Reader reader) throws java.io.IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        }
    }

    private <E> void readMessageList(java.lang.Object message, int typeAndOffset, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.Schema<E> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private <E> void readGroupList(java.lang.Object message, long offset, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.Schema<E> schema, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(message, offset), schema, extensionRegistry);
    }

    private int numberAt(int pos) {
        return this.buffer[pos];
    }

    private int typeAndOffsetAt(int pos) {
        return this.buffer[pos + 1];
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.buffer[pos + 2];
    }

    private static boolean isMutable(java.lang.Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) message).isMutable();
        }
        return true;
    }

    private static void checkMutable(java.lang.Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Mutating immutable message: " + message);
    }

    private static <T> double doubleAt(T message, long offset) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(message, offset);
    }

    private static <T> float floatAt(T message, long offset) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(message, offset);
    }

    private static <T> int intAt(T message, long offset) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset);
    }

    private static <T> long longAt(T message, long offset) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(message, offset);
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((java.lang.Double) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((java.lang.Float) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((java.lang.Integer) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((java.lang.Long) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).longValue();
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((java.lang.Boolean) androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset)).booleanValue();
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        if (presenceFieldOffset == 1048575) {
            return isFieldPresent(message, pos);
        }
        return (presenceField & presenceMask) != 0;
    }

    private boolean isFieldPresent(T message, int pos) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(message, offset)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(message, offset)) != 0;
            case 2:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) != 0;
            case 3:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) != 0;
            case 4:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 5:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) != 0;
            case 6:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 7:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(message, offset);
            case 8:
                java.lang.Object object = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset);
                if (object instanceof java.lang.String) {
                    return !((java.lang.String) object).isEmpty();
                }
                if (object instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    return !androidx.datastore.preferences.protobuf.ByteString.EMPTY.equals(object);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset) != null;
            case 10:
                return !androidx.datastore.preferences.protobuf.ByteString.EMPTY.equals(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset));
            case 11:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 12:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 13:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 14:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) != 0;
            case 15:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, offset) != 0;
            case 16:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(message, offset) != 0;
            case 17:
                return androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private void setFieldPresent(T message, int pos) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, j));
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(message, presenceMaskAndOffsetAt) == androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(other, presenceMaskAndOffsetAt);
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.buffer.length / 3) - 1;
        while (min <= length) {
            int i = (length + min) >>> 1;
            int i2 = i * 3;
            int numberAt = numberAt(i2);
            if (number == numberAt) {
                return i2;
            }
            if (number < numberAt) {
                length = i - 1;
            } else {
                min = i + 1;
            }
        }
        return -1;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }
}
