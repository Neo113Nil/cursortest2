package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
public final class InternalNano {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName("ISO-8859-1");
    public static final java.lang.Object LAZY_INIT_LOCK = new java.lang.Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(java.lang.String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(com.yandex.varioqub.protobuf.nano.ExtendableMessageNano extendableMessageNano, com.yandex.varioqub.protobuf.nano.ExtendableMessageNano extendableMessageNano2) {
        com.yandex.varioqub.protobuf.nano.FieldArray fieldArray = extendableMessageNano.unknownFieldData;
        if (fieldArray != null) {
            extendableMessageNano2.unknownFieldData = fieldArray.m1clone();
        }
    }

    public static <K, V> int computeMapFieldSize(java.util.Map<K, V> map, int i2, int i3, int i4) {
        int computeTagSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeTagSize(i2);
        int i5 = 0;
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new java.lang.IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeFieldSize(2, i4, value) + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeFieldSize(1, i3, key);
            i5 += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeRawVarint32Size(computeFieldSize) + computeTagSize + computeFieldSize;
        }
        return i5;
    }

    public static byte[] copyFromUtf8(java.lang.String str) {
        return str.getBytes(UTF_8);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : java.util.Arrays.equals(iArr, iArr2);
    }

    private static boolean equalsMapValue(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null || obj2 == null) {
            throw new java.lang.IllegalStateException("keys and values in maps cannot be null");
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(iArr);
    }

    private static int hashCodeForMap(java.lang.Object obj) {
        return obj instanceof byte[] ? java.util.Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> mergeMapEntry(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano, java.util.Map<K, V> map, com.yandex.varioqub.protobuf.nano.MapFactories.MapFactory mapFactory, int i2, int i3, V v2, int i4, int i5) {
        java.util.Map<K, V> forMap = mapFactory.forMap(map);
        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        java.lang.Object obj = null;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == i4) {
                obj = codedInputByteBufferNano.readPrimitiveField(i2);
            } else if (readTag == i5) {
                if (i3 == 11) {
                    codedInputByteBufferNano.readMessage(v2);
                } else {
                    v2 = (V) codedInputByteBufferNano.readPrimitiveField(i3);
                }
            } else if (!codedInputByteBufferNano.skipField(readTag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(pushLimit);
        if (obj == null) {
            obj = primitiveDefaultValue(i2);
        }
        if (v2 == 0) {
            v2 = primitiveDefaultValue(i3);
        }
        forMap.put(obj, v2);
        return forMap;
    }

    private static java.lang.Object primitiveDefaultValue(int i2) {
        switch (i2) {
            case 1:
                return java.lang.Double.valueOf(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
            case 2:
                return java.lang.Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return java.lang.Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Type: ", " is not a primitive type."));
            case 12:
                return com.yandex.varioqub.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        }
    }

    public static <K, V> void serializeMapField(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano, java.util.Map<K, V> map, int i2, int i3, int i4) {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new java.lang.IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeFieldSize(2, i4, value) + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeFieldSize(1, i3, key);
            codedOutputByteBufferNano.writeTag(i2, 2);
            codedOutputByteBufferNano.writeRawVarint32(computeFieldSize);
            codedOutputByteBufferNano.writeField(1, i3, key);
            codedOutputByteBufferNano.writeField(2, i4, value);
        }
    }

    public static java.lang.String stringDefaultValue(java.lang.String str) {
        return new java.lang.String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(jArr);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(fArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return java.util.Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(dArr);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int i2;
        if (bArr == null) {
            length = 0;
            i2 = 0;
        } else {
            length = bArr.length;
            i2 = 0;
        }
        for (int i3 = 0; i3 < length; i3++) {
            byte[] bArr2 = bArr[i3];
            if (bArr2 != null) {
                i2 = java.util.Arrays.hashCode(bArr2) + (i2 * 31);
            }
        }
        return i2;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return java.util.Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(java.lang.Object[] objArr) {
        int length;
        int i2;
        if (objArr == null) {
            length = 0;
            i2 = 0;
        } else {
            length = objArr.length;
            i2 = 0;
        }
        for (int i3 = 0; i3 < length; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != null) {
                i2 = obj.hashCode() + (i2 * 31);
            }
        }
        return i2;
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return java.util.Arrays.equals(dArr, dArr2);
    }

    public static <K, V> int hashCode(java.util.Map<K, V> map) {
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            i2 += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return i2;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        }
        return java.util.Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int i2;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            i2 = 0;
        } else {
            length = bArr2.length;
            i2 = 0;
        }
        int i3 = i2;
        while (true) {
            if (i2 >= length2 || bArr[i2] != null) {
                while (i3 < length && bArr2[i3] == null) {
                    i3++;
                }
                boolean z2 = i2 >= length2;
                boolean z3 = i3 >= length;
                if (z2 && z3) {
                    return true;
                }
                if (z2 != z3 || !java.util.Arrays.equals(bArr[i2], bArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    public static boolean equals(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length;
        int i2;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            i2 = 0;
        } else {
            length = objArr2.length;
            i2 = 0;
        }
        int i3 = i2;
        while (true) {
            if (i2 >= length2 || objArr[i2] != null) {
                while (i3 < length && objArr2[i3] == null) {
                    i3++;
                }
                boolean z2 = i2 >= length2;
                boolean z3 = i3 >= length;
                if (z2 && z3) {
                    return true;
                }
                if (z2 != z3 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    public static <K, V> boolean equals(java.util.Map<K, V> map, java.util.Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        }
        if (map2 == null) {
            return map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equalsMapValue(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
