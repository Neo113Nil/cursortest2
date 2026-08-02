package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private ArrayDecoders() {
    }

    static final class Registers {
        public final com.google.protobuf.ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public java.lang.Object object1;
        public int recursionDepth;

        Registers() {
            this.extensionRegistry = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    static int decodeVarint32(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.int1 = b;
            return i2;
        }
        return decodeVarint32(b, bArr, i2, registers);
    }

    static int decodeVarint32(int i, byte[] bArr, int i2, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.int1 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.int1 = i7 | (b3 << com.google.common.base.Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.int1 = i9 | (b4 << com.google.common.base.Ascii.FS);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                registers.int1 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    static int decodeVarint64(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            registers.long1 = j;
            return i2;
        }
        return decodeVarint64(j, bArr, i2, registers);
    }

    static int decodeVarint64(long j, byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            b = bArr[i2];
            i3 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i3;
            i2++;
        }
        registers.long1 = j2;
        return i2;
    }

    static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long decodeFixed64(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static double decodeDouble(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    static float decodeFloat(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    static int decodeString(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return decodeVarint32;
        }
        registers.object1 = new java.lang.String(bArr, decodeVarint32, i2, com.google.protobuf.Internal.UTF_8);
        return decodeVarint32 + i2;
    }

    static int decodeStringRequireUtf8(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            registers.object1 = "";
            return decodeVarint32;
        }
        registers.object1 = com.google.protobuf.Utf8.decodeUtf8(bArr, decodeVarint32, i2);
        return decodeVarint32 + i2;
    }

    static int decodeBytes(byte[] bArr, int i, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - decodeVarint32) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            registers.object1 = com.google.protobuf.ByteString.EMPTY;
            return decodeVarint32;
        }
        registers.object1 = com.google.protobuf.ByteString.copyFrom(bArr, decodeVarint32, i2);
        return decodeVarint32 + i2;
    }

    static int decodeMessageField(com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object newInstance = schema.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, schema, bArr, i, i2, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeMessageField;
    }

    static int decodeGroupField(com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object newInstance = schema.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, schema, bArr, i, i2, i3, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeGroupField;
    }

    static int mergeMessageField(java.lang.Object obj, com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = decodeVarint32(i4, bArr, i3, registers);
            i4 = registers.int1;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i6 = i4 + i5;
        schema.mergeFrom(obj, bArr, i5, i6, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i6;
    }

    static int mergeGroupField(java.lang.Object obj, com.google.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int parseMessage = ((com.google.protobuf.MessageSchema) schema).parseMessage(obj, bArr, i, i2, i3, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return parseMessage;
    }

    static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i2, registers);
        intArrayList.addInt(registers.int1);
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return decodeVarint32;
    }

    static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i2, registers);
        longArrayList.addLong(registers.long1);
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return decodeVarint64;
    }

    static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            i4 = decodeVarint32 + 4;
        }
        return i4;
    }

    static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            i4 = decodeVarint32 + 8;
        }
        return i4;
    }

    static int decodeFloatList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            i4 = decodeVarint32 + 4;
        }
        return i4;
    }

    static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, i4, registers);
            if (i != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            i4 = decodeVarint32 + 8;
        }
        return i4;
    }

    static int decodeBoolList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.BooleanArrayList booleanArrayList = (com.google.protobuf.BooleanArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i2, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return decodeVarint64;
    }

    static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i2, registers);
        intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        return decodeVarint32;
    }

    static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i2, registers);
        longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        while (decodeVarint64 < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        return decodeVarint64;
    }

    static int decodePackedVarint32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedVarint64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFixed64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedFloatList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.FloatArrayList floatArrayList = (com.google.protobuf.FloatArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedDoubleList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.DoubleArrayList doubleArrayList = (com.google.protobuf.DoubleArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedBoolList(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.BooleanArrayList booleanArrayList = (com.google.protobuf.BooleanArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt32List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.IntArrayList intArrayList = (com.google.protobuf.IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodePackedSInt64List(byte[] bArr, int i, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.LongArrayList longArrayList = (com.google.protobuf.LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i, registers);
        int i2 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i2) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (decodeVarint32 == i2) {
            return decodeVarint32;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
    }

    static int decodeStringList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new java.lang.String(bArr, decodeVarint32, i4, com.google.protobuf.Internal.UTF_8));
            decodeVarint32 += i4;
        }
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            int i5 = registers.int1;
            if (i5 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new java.lang.String(bArr, decodeVarint32, i5, com.google.protobuf.Internal.UTF_8));
                decodeVarint32 += i5;
            }
        }
        return decodeVarint32;
    }

    static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = decodeVarint32 + i4;
            if (!com.google.protobuf.Utf8.isValidUtf8(bArr, decodeVarint32, i5)) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new java.lang.String(bArr, decodeVarint32, i4, com.google.protobuf.Internal.UTF_8));
            decodeVarint32 = i5;
        }
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            int i6 = registers.int1;
            if (i6 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = decodeVarint32 + i6;
                if (!com.google.protobuf.Utf8.isValidUtf8(bArr, decodeVarint32, i7)) {
                    throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new java.lang.String(bArr, decodeVarint32, i6, com.google.protobuf.Internal.UTF_8));
                decodeVarint32 = i7;
            }
        }
        return decodeVarint32;
    }

    static int decodeBytesList(int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - decodeVarint32) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(com.google.protobuf.ByteString.EMPTY);
        } else {
            protobufList.add(com.google.protobuf.ByteString.copyFrom(bArr, decodeVarint32, i4));
            decodeVarint32 += i4;
        }
        while (decodeVarint32 < i3) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            int i5 = registers.int1;
            if (i5 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - decodeVarint32) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(com.google.protobuf.ByteString.EMPTY);
            } else {
                protobufList.add(com.google.protobuf.ByteString.copyFrom(bArr, decodeVarint32, i5));
                decodeVarint32 += i5;
            }
        }
        return decodeVarint32;
    }

    static int decodeMessageList(com.google.protobuf.Schema<?> schema, int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int decodeMessageField = decodeMessageField(schema, bArr, i2, i3, registers);
        protobufList.add(registers.object1);
        while (decodeMessageField < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, registers);
            if (i != registers.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(schema, bArr, decodeVarint32, i3, registers);
            protobufList.add(registers.object1);
        }
        return decodeMessageField;
    }

    static int decodeGroupList(com.google.protobuf.Schema schema, int i, byte[] bArr, int i2, int i3, com.google.protobuf.Internal.ProtobufList<?> protobufList, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i4 = (i & (-8)) | 4;
        int decodeGroupField = decodeGroupField(schema, bArr, i2, i3, i4, registers);
        protobufList.add(registers.object1);
        while (decodeGroupField < i3) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, registers);
            if (i != registers.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(schema, bArr, decodeVarint32, i3, i4, registers);
            protobufList.add(registers.object1);
        }
        return decodeGroupField;
    }

    static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, java.lang.Object obj, com.google.protobuf.MessageLite messageLite, com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> unknownFieldSchema, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, com.google.protobuf.MessageSchema.getMutableUnknownFields(obj), registers);
        }
        com.google.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, extendableMessage, findLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int decodeExtension(int i, byte[] bArr, int i2, int i3, com.google.protobuf.GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> unknownFieldSchema, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object valueOf;
        java.lang.Object valueOf2;
        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (com.google.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    com.google.protobuf.DoubleArrayList doubleArrayList = new com.google.protobuf.DoubleArrayList();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i2, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return decodePackedDoubleList;
                case 2:
                    com.google.protobuf.FloatArrayList floatArrayList = new com.google.protobuf.FloatArrayList();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i2, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    com.google.protobuf.LongArrayList longArrayList = new com.google.protobuf.LongArrayList();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i2, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    com.google.protobuf.IntArrayList intArrayList = new com.google.protobuf.IntArrayList();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i2, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    com.google.protobuf.LongArrayList longArrayList2 = new com.google.protobuf.LongArrayList();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i2, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    com.google.protobuf.IntArrayList intArrayList2 = new com.google.protobuf.IntArrayList();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i2, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return decodePackedFixed32List;
                case 11:
                    com.google.protobuf.BooleanArrayList booleanArrayList = new com.google.protobuf.BooleanArrayList();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i2, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return decodePackedBoolList;
                case 12:
                    com.google.protobuf.IntArrayList intArrayList3 = new com.google.protobuf.IntArrayList();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i2, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return decodePackedSInt32List;
                case 13:
                    com.google.protobuf.LongArrayList longArrayList3 = new com.google.protobuf.LongArrayList();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i2, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return decodePackedSInt64List;
                case 14:
                    com.google.protobuf.IntArrayList intArrayList4 = new com.google.protobuf.IntArrayList();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, intArrayList4, registers);
                    com.google.protobuf.SchemaUtil.filterUnknownEnumList((java.lang.Object) extendableMessage, i4, (java.util.List<java.lang.Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (java.lang.Object) null, (com.google.protobuf.UnknownFieldSchema<UT, java.lang.Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return decodePackedVarint32List2;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type cannot be packed: ");
                    sb.append(generatedExtension.descriptor.getLiteType());
                    throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        java.lang.Object obj = null;
        if (generatedExtension.getLiteType() == com.google.protobuf.WireFormat.FieldType.ENUM) {
            i2 = decodeVarint32(bArr, i2, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                com.google.protobuf.SchemaUtil.storeUnknownEnum(extendableMessage, i4, registers.int1, null, unknownFieldSchema);
                return i2;
            }
            obj = java.lang.Integer.valueOf(registers.int1);
        } else {
            switch (com.google.protobuf.ArrayDecoders.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    valueOf = java.lang.Double.valueOf(decodeDouble(bArr, i2));
                    obj = valueOf;
                    i2 += 8;
                    break;
                case 2:
                    valueOf2 = java.lang.Float.valueOf(decodeFloat(bArr, i2));
                    obj = valueOf2;
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, registers);
                    obj = java.lang.Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, registers);
                    obj = java.lang.Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    valueOf = java.lang.Long.valueOf(decodeFixed64(bArr, i2));
                    obj = valueOf;
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    valueOf2 = java.lang.Integer.valueOf(decodeFixed32(bArr, i2));
                    obj = valueOf2;
                    i2 += 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, registers);
                    obj = java.lang.Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, registers);
                    obj = java.lang.Integer.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, registers);
                    obj = java.lang.Long.valueOf(com.google.protobuf.CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = decodeBytes(bArr, i2, registers);
                    obj = registers.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, registers);
                    obj = registers.object1;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    com.google.protobuf.Schema schemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, bArr, i2, i3, i5, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return decodeGroupField;
                    }
                    java.lang.Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, bArr, i2, i3, i5, registers);
                case 18:
                    com.google.protobuf.Schema schemaFor2 = com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, bArr, i2, i3, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return decodeMessageField;
                    }
                    java.lang.Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, bArr, i2, i3, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, obj);
            return i2;
        }
        fieldSet.setField(generatedExtension.descriptor, obj);
        return i2;
    }

    /* renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        if (com.google.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int decodeVarint64 = decodeVarint64(bArr, i2, registers);
            unknownFieldSetLite.storeField(i, java.lang.Long.valueOf(registers.long1));
            return decodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, java.lang.Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int decodeVarint32 = decodeVarint32(bArr, i2, registers);
            int i4 = registers.int1;
            if (i4 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - decodeVarint32) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, com.google.protobuf.ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, com.google.protobuf.ByteString.copyFrom(bArr, decodeVarint32, i4));
            }
            return decodeVarint32 + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                unknownFieldSetLite.storeField(i, java.lang.Integer.valueOf(decodeFixed32(bArr, i2)));
                return i2 + 4;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        com.google.protobuf.UnknownFieldSetLite newInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        registers.recursionDepth++;
        checkRecursionLimit(registers.recursionDepth);
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int decodeVarint322 = decodeVarint32(bArr, i2, registers);
            int i7 = registers.int1;
            if (i7 == i5) {
                i6 = i7;
                i2 = decodeVarint322;
                break;
            }
            i6 = i7;
            i2 = decodeUnknownField(i7, bArr, decodeVarint322, i3, newInstance, registers);
        }
        registers.recursionDepth--;
        if (i2 > i3 || i6 != i5) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, newInstance);
        return i2;
    }

    static int skipField(int i, byte[] bArr, int i2, int i3, com.google.protobuf.ArrayDecoders.Registers registers) throws com.google.protobuf.InvalidProtocolBufferException {
        if (com.google.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i2, registers);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i2, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = decodeVarint32(bArr, i2, registers);
            i5 = registers.int1;
            if (i5 == i4) {
                break;
            }
            i2 = skipField(i5, bArr, i2, i3, registers);
        }
        if (i2 > i3 || i5 != i4) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    private static void checkRecursionLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i >= recursionLimit) {
            throw com.google.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }
}
