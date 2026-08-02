package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes7.dex */
final class ArrayDecoders {
    private static volatile int getHighSpeedVideoFpsRanges = 100;

    private ArrayDecoders() {
    }

    static final class Registers {
        public long Camera2StreamConfigurationMap;
        public final androidx.content.preferences.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI;
        public int getHighSpeedVideoFpsRanges;
        public java.lang.Object getHighSpeedVideoFpsRangesFor;
        public int getHighSpeedVideoSizes;

        Registers() {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry();
        }

        Registers(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            this.getHighResolutionOutputSizeshNQ4ISI = extensionRegistryLite;
        }
    }

    static int Camera2StreamConfigurationMap(byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
            return i2;
        }
        return getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
    }

    static int getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.getHighSpeedVideoSizes = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.getHighSpeedVideoSizes = i7 | (b3 << com.google.common.base.Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.getHighSpeedVideoSizes = i9 | (b4 << com.google.common.base.Ascii.FS);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                registers.getHighSpeedVideoSizes = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            registers.Camera2StreamConfigurationMap = j;
            return i2;
        }
        return getHighSpeedVideoFpsRangesFor(j, bArr, i2, registers);
    }

    private static int getHighSpeedVideoFpsRangesFor(long j, byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
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
        registers.Camera2StreamConfigurationMap = j2;
        return i2;
    }

    static int getHighSpeedVideoSizes(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static double getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(getHighSpeedVideoFpsRanges(bArr, i));
    }

    static float Camera2StreamConfigurationMap(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(getHighSpeedVideoSizes(bArr, i));
    }

    static int getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Schema schema, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(Camera2StreamConfigurationMap, schema, bArr, i, i2, registers);
        schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        registers.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        return highSpeedVideoSizes;
    }

    private static int getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object Camera2StreamConfigurationMap = schema.Camera2StreamConfigurationMap();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, schema, bArr, i, i2, i3, registers);
        schema.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        registers.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        return highSpeedVideoFpsRangesFor;
    }

    static int getHighSpeedVideoSizes(java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = getHighSpeedVideoFpsRangesFor(i4, bArr, i3, registers);
            i4 = registers.getHighSpeedVideoSizes;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
        registers.getHighSpeedVideoFpsRanges++;
        if (registers.getHighSpeedVideoFpsRanges < getHighSpeedVideoFpsRanges) {
            int i6 = i4 + i5;
            schema.getHighSpeedVideoFpsRangesFor(obj, bArr, i5, i6, registers);
            registers.getHighSpeedVideoFpsRanges--;
            registers.getHighSpeedVideoFpsRangesFor = obj;
            return i6;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
    }

    static int getHighSpeedVideoFpsRangesFor(java.lang.Object obj, androidx.content.preferences.protobuf.Schema schema, byte[] bArr, int i, int i2, int i3, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.MessageSchema messageSchema = (androidx.content.preferences.protobuf.MessageSchema) schema;
        registers.getHighSpeedVideoFpsRanges++;
        if (registers.getHighSpeedVideoFpsRanges < getHighSpeedVideoFpsRanges) {
            int highResolutionOutputSizeshNQ4ISI = messageSchema.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.MessageSchema) obj, bArr, i, i2, i3, registers);
            registers.getHighSpeedVideoFpsRanges--;
            registers.getHighSpeedVideoFpsRangesFor = obj;
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
    }

    static int getOutputSizes(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
        }
        intArrayList.addInt(registers.getHighSpeedVideoSizes);
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            i4 = i5 + 1;
            byte b3 = bArr[i5];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i4, registers);
            }
            intArrayList.addInt(registers.getHighSpeedVideoSizes);
        }
        return i4;
    }

    static int getOutputStallDuration(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
        longArrayList.addLong(registers.Camera2StreamConfigurationMap);
        while (highSpeedVideoFpsRanges < i3) {
            int i4 = highSpeedVideoFpsRanges + 1;
            byte b = bArr[highSpeedVideoFpsRanges];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i4, registers);
            longArrayList.addLong(registers.Camera2StreamConfigurationMap);
        }
        return highSpeedVideoFpsRanges;
    }

    static int Camera2StreamConfigurationMap(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        intArrayList.addInt(getHighSpeedVideoSizes(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            intArrayList.addInt(getHighSpeedVideoSizes(bArr, i5));
            i4 = i5 + 4;
        }
        return i4;
    }

    static int getHighSpeedVideoSizes(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        longArrayList.addLong(getHighSpeedVideoFpsRanges(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            longArrayList.addLong(getHighSpeedVideoFpsRanges(bArr, i5));
            i4 = i5 + 8;
        }
        return i4;
    }

    static int getOutputMinFrameDuration(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) protobufList;
        floatArrayList.addFloat(java.lang.Float.intBitsToFloat(getHighSpeedVideoSizes(bArr, i2)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            floatArrayList.addFloat(java.lang.Float.intBitsToFloat(getHighSpeedVideoSizes(bArr, i5)));
            i4 = i5 + 4;
        }
        return i4;
    }

    static int getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) protobufList;
        doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(getHighSpeedVideoFpsRanges(bArr, i2)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(getHighSpeedVideoFpsRanges(bArr, i5)));
            i4 = i5 + 8;
        }
        return i4;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) protobufList;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
        booleanArrayList.addBoolean(registers.Camera2StreamConfigurationMap != 0);
        while (highSpeedVideoFpsRanges < i3) {
            int i4 = highSpeedVideoFpsRanges + 1;
            byte b = bArr[highSpeedVideoFpsRanges];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i4, registers);
            booleanArrayList.addBoolean(registers.Camera2StreamConfigurationMap != 0);
        }
        return highSpeedVideoFpsRanges;
    }

    static int getHighSpeedVideoSizesFor(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
        }
        intArrayList.addInt(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes));
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i5, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            i4 = i5 + 1;
            byte b3 = bArr[i5];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i4, registers);
            }
            intArrayList.addInt(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes));
        }
        return i4;
    }

    static int getOutputFormats(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
        longArrayList.addLong(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap));
        while (highSpeedVideoFpsRanges < i3) {
            int i4 = highSpeedVideoFpsRanges + 1;
            byte b = bArr[highSpeedVideoFpsRanges];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i4, registers);
            longArrayList.addLong(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap));
        }
        return highSpeedVideoFpsRanges;
    }

    static int getOutputMinFrameDuration(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
                i2 = i4;
            } else {
                i2 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i4, registers);
            }
            intArrayList.addInt(registers.getHighSpeedVideoSizes);
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getOutputFormats(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            i2 = getHighSpeedVideoFpsRanges(bArr, i2, registers);
            longArrayList.addLong(registers.Camera2StreamConfigurationMap);
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int Camera2StreamConfigurationMap(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            intArrayList.addInt(getHighSpeedVideoSizes(bArr, i2));
            i2 += 4;
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighSpeedVideoSizes(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            longArrayList.addLong(getHighSpeedVideoFpsRanges(bArr, i2));
            i2 += 8;
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.FloatArrayList floatArrayList = (androidx.content.preferences.protobuf.FloatArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            floatArrayList.addFloat(java.lang.Float.intBitsToFloat(getHighSpeedVideoSizes(bArr, i2)));
            i2 += 4;
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = (androidx.content.preferences.protobuf.DoubleArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(getHighSpeedVideoFpsRanges(bArr, i2)));
            i2 += 8;
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = (androidx.content.preferences.protobuf.BooleanArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            i2 = getHighSpeedVideoFpsRanges(bArr, i2, registers);
            booleanArrayList.addBoolean(registers.Camera2StreamConfigurationMap != 0);
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getInputSizeshNQ4ISI(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.IntArrayList intArrayList = (androidx.content.preferences.protobuf.IntArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
                i2 = i4;
            } else {
                i2 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i4, registers);
            }
            intArrayList.addInt(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes));
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighSpeedVideoSizesFor(byte[] bArr, int i, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.LongArrayList longArrayList = (androidx.content.preferences.protobuf.LongArrayList) protobufList;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes + i2;
        while (i2 < i3) {
            i2 = getHighSpeedVideoFpsRanges(bArr, i2, registers);
            longArrayList.addLong(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap));
        }
        if (i2 == i3) {
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
    }

    static int getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Schema<?> schema, int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(schema, bArr, i2, i3, registers);
        protobufList.add(registers.getHighSpeedVideoFpsRangesFor);
        while (highSpeedVideoSizes < i3) {
            int i4 = highSpeedVideoSizes + 1;
            byte b = bArr[highSpeedVideoSizes];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            highSpeedVideoSizes = getHighSpeedVideoSizes(schema, bArr, i4, i3, registers);
            protobufList.add(registers.getHighSpeedVideoFpsRangesFor);
        }
        return highSpeedVideoSizes;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Schema schema, int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int i4 = (i & (-8)) | 4;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(schema, bArr, i2, i3, i4, registers);
        protobufList.add(registers.getHighSpeedVideoFpsRangesFor);
        while (highSpeedVideoFpsRanges < i3) {
            int i5 = highSpeedVideoFpsRanges + 1;
            byte b = bArr[highSpeedVideoFpsRanges];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i5 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i5, registers);
            }
            int i6 = i5;
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(schema, bArr, i6, i3, i4, registers);
            protobufList.add(registers.getHighSpeedVideoFpsRangesFor);
        }
        return highSpeedVideoFpsRanges;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3, java.lang.Object obj, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.UnknownFieldSchema<androidx.content.preferences.protobuf.UnknownFieldSetLite, androidx.content.preferences.protobuf.UnknownFieldSetLite> unknownFieldSchema, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        java.lang.Object valueOf;
        java.lang.Object valueOf2;
        int highSpeedVideoFpsRanges;
        int highSpeedVideoFpsRangesFor;
        int i4 = i >>> 3;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = registers.getHighResolutionOutputSizeshNQ4ISI.findLiteExtensionByNumber(messageLite, i4);
        if (findLiteExtensionByNumber == null) {
            return getHighResolutionOutputSizeshNQ4ISI(i, bArr, i2, i3, androidx.content.preferences.protobuf.MessageSchema.getHighResolutionOutputSizeshNQ4ISI(obj), registers);
        }
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.getOutputMinFrameDurationlomOqCM();
        androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (findLiteExtensionByNumber.Camera2StreamConfigurationMap.isRepeated() && findLiteExtensionByNumber.Camera2StreamConfigurationMap.isPacked()) {
            switch (androidx.content.preferences.protobuf.ArrayDecoders.AnonymousClass1.getHighSpeedVideoFpsRangesFor[findLiteExtensionByNumber.getLiteType().ordinal()]) {
                case 1:
                    androidx.content.preferences.protobuf.DoubleArrayList doubleArrayList = new androidx.content.preferences.protobuf.DoubleArrayList();
                    int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr, i2, doubleArrayList, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, doubleArrayList);
                    return highSpeedVideoFpsRanges2;
                case 2:
                    androidx.content.preferences.protobuf.FloatArrayList floatArrayList = new androidx.content.preferences.protobuf.FloatArrayList();
                    int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr, i2, floatArrayList, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, floatArrayList);
                    return highSpeedVideoFpsRangesFor2;
                case 3:
                case 4:
                    androidx.content.preferences.protobuf.LongArrayList longArrayList = new androidx.content.preferences.protobuf.LongArrayList();
                    int outputFormats = getOutputFormats(bArr, i2, longArrayList, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, longArrayList);
                    return outputFormats;
                case 5:
                case 6:
                    androidx.content.preferences.protobuf.IntArrayList intArrayList = new androidx.content.preferences.protobuf.IntArrayList();
                    int outputMinFrameDuration = getOutputMinFrameDuration(bArr, i2, intArrayList, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, intArrayList);
                    return outputMinFrameDuration;
                case 7:
                case 8:
                    androidx.content.preferences.protobuf.LongArrayList longArrayList2 = new androidx.content.preferences.protobuf.LongArrayList();
                    int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, i2, longArrayList2, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, longArrayList2);
                    return highSpeedVideoSizes;
                case 9:
                case 10:
                    androidx.content.preferences.protobuf.IntArrayList intArrayList2 = new androidx.content.preferences.protobuf.IntArrayList();
                    int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr, i2, intArrayList2, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, intArrayList2);
                    return Camera2StreamConfigurationMap;
                case 11:
                    androidx.content.preferences.protobuf.BooleanArrayList booleanArrayList = new androidx.content.preferences.protobuf.BooleanArrayList();
                    int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i2, booleanArrayList, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, booleanArrayList);
                    return highResolutionOutputSizeshNQ4ISI;
                case 12:
                    androidx.content.preferences.protobuf.IntArrayList intArrayList3 = new androidx.content.preferences.protobuf.IntArrayList();
                    int inputSizeshNQ4ISI = getInputSizeshNQ4ISI(bArr, i2, intArrayList3, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, intArrayList3);
                    return inputSizeshNQ4ISI;
                case 13:
                    androidx.content.preferences.protobuf.LongArrayList longArrayList3 = new androidx.content.preferences.protobuf.LongArrayList();
                    int highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(bArr, i2, longArrayList3, registers);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, longArrayList3);
                    return highSpeedVideoSizesFor;
                case 14:
                    androidx.content.preferences.protobuf.IntArrayList intArrayList4 = new androidx.content.preferences.protobuf.IntArrayList();
                    int outputMinFrameDuration2 = getOutputMinFrameDuration(bArr, i2, intArrayList4, registers);
                    androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(extendableMessage, i4, intArrayList4, findLiteExtensionByNumber.Camera2StreamConfigurationMap.getEnumType(), null, unknownFieldSchema);
                    fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, intArrayList4);
                    return outputMinFrameDuration2;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type cannot be packed: ");
                    sb.append(findLiteExtensionByNumber.Camera2StreamConfigurationMap.getLiteType());
                    throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        java.lang.Object obj2 = null;
        if (findLiteExtensionByNumber.getLiteType() != androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
            switch (androidx.content.preferences.protobuf.ArrayDecoders.AnonymousClass1.getHighSpeedVideoFpsRangesFor[findLiteExtensionByNumber.getLiteType().ordinal()]) {
                case 1:
                    valueOf = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(getHighSpeedVideoFpsRanges(bArr, i2)));
                    obj2 = valueOf;
                    highSpeedVideoFpsRanges = i2 + 8;
                    break;
                case 2:
                    valueOf2 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(getHighSpeedVideoSizes(bArr, i2)));
                    obj2 = valueOf2;
                    highSpeedVideoFpsRanges = i2 + 4;
                    break;
                case 3:
                case 4:
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
                    obj2 = java.lang.Long.valueOf(registers.Camera2StreamConfigurationMap);
                    break;
                case 5:
                case 6:
                    highSpeedVideoFpsRanges = i2 + 1;
                    byte b = bArr[i2];
                    if (b >= 0) {
                        registers.getHighSpeedVideoSizes = b;
                    } else {
                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor((int) b, bArr, highSpeedVideoFpsRanges, registers);
                    }
                    obj2 = java.lang.Integer.valueOf(registers.getHighSpeedVideoSizes);
                    break;
                case 7:
                case 8:
                    valueOf = java.lang.Long.valueOf(getHighSpeedVideoFpsRanges(bArr, i2));
                    obj2 = valueOf;
                    highSpeedVideoFpsRanges = i2 + 8;
                    break;
                case 9:
                case 10:
                    valueOf2 = java.lang.Integer.valueOf(getHighSpeedVideoSizes(bArr, i2));
                    obj2 = valueOf2;
                    highSpeedVideoFpsRanges = i2 + 4;
                    break;
                case 11:
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
                    obj2 = java.lang.Boolean.valueOf(registers.Camera2StreamConfigurationMap != 0);
                    break;
                case 12:
                    highSpeedVideoFpsRanges = i2 + 1;
                    byte b2 = bArr[i2];
                    if (b2 >= 0) {
                        registers.getHighSpeedVideoSizes = b2;
                    } else {
                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor((int) b2, bArr, highSpeedVideoFpsRanges, registers);
                    }
                    obj2 = java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes));
                    break;
                case 13:
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
                    obj2 = java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap));
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    highSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI(bArr, i2, registers);
                    obj2 = registers.getHighSpeedVideoFpsRangesFor;
                    break;
                case 16:
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(bArr, i2, registers);
                    obj2 = registers.getHighSpeedVideoFpsRangesFor;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI2 = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(findLiteExtensionByNumber.getMessageDefaultInstance().getClass());
                    if (findLiteExtensionByNumber.isRepeated()) {
                        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI2, bArr, i2, i3, i5, registers);
                        fieldSet.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) findLiteExtensionByNumber.Camera2StreamConfigurationMap, registers.getHighSpeedVideoFpsRangesFor);
                        return highSpeedVideoFpsRanges3;
                    }
                    java.lang.Object obj3 = fieldSet.getHighSpeedVideoFpsRangesFor.get(findLiteExtensionByNumber.Camera2StreamConfigurationMap);
                    if (obj3 instanceof androidx.content.preferences.protobuf.LazyField) {
                        obj3 = ((androidx.content.preferences.protobuf.LazyField) obj3).getValue();
                    }
                    if (obj3 == null) {
                        obj3 = highResolutionOutputSizeshNQ4ISI2.Camera2StreamConfigurationMap();
                        fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, obj3);
                    }
                    return getHighSpeedVideoFpsRangesFor(obj3, highResolutionOutputSizeshNQ4ISI2, bArr, i2, i3, i5, registers);
                case 18:
                    androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI3 = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(findLiteExtensionByNumber.getMessageDefaultInstance().getClass());
                    if (findLiteExtensionByNumber.isRepeated()) {
                        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3, bArr, i2, i3, registers);
                        fieldSet.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) findLiteExtensionByNumber.Camera2StreamConfigurationMap, registers.getHighSpeedVideoFpsRangesFor);
                        return highSpeedVideoSizes2;
                    }
                    java.lang.Object obj4 = fieldSet.getHighSpeedVideoFpsRangesFor.get(findLiteExtensionByNumber.Camera2StreamConfigurationMap);
                    if (obj4 instanceof androidx.content.preferences.protobuf.LazyField) {
                        obj4 = ((androidx.content.preferences.protobuf.LazyField) obj4).getValue();
                    }
                    if (obj4 == null) {
                        obj4 = highResolutionOutputSizeshNQ4ISI3.Camera2StreamConfigurationMap();
                        fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, obj4);
                    }
                    return getHighSpeedVideoSizes(obj4, highResolutionOutputSizeshNQ4ISI3, bArr, i2, i3, registers);
                default:
                    highSpeedVideoFpsRanges = i2;
                    break;
            }
        } else {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
                highSpeedVideoFpsRangesFor = i6;
            } else {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i6, registers);
            }
            if (findLiteExtensionByNumber.Camera2StreamConfigurationMap.getEnumType().findValueByNumber(registers.getHighSpeedVideoSizes) == null) {
                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(extendableMessage, i4, registers.getHighSpeedVideoSizes, null, unknownFieldSchema);
                return highSpeedVideoFpsRangesFor;
            }
            obj2 = java.lang.Integer.valueOf(registers.getHighSpeedVideoSizes);
            highSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        }
        if (findLiteExtensionByNumber.isRepeated()) {
            fieldSet.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) findLiteExtensionByNumber.Camera2StreamConfigurationMap, obj2);
            return highSpeedVideoFpsRanges;
        }
        fieldSet.getHighSpeedVideoSizes(findLiteExtensionByNumber.Camera2StreamConfigurationMap, obj2);
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int highSpeedVideoFpsRangesFor;
        if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
        }
        int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2, registers);
            unknownFieldSetLite.getHighSpeedVideoSizes(i, java.lang.Long.valueOf(registers.Camera2StreamConfigurationMap));
            return highSpeedVideoFpsRanges;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.getHighSpeedVideoSizes(i, java.lang.Long.valueOf(getHighSpeedVideoFpsRanges(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            int i5 = registers.getHighSpeedVideoSizes;
            if (i5 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            if (i5 > bArr.length - i4) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (i5 == 0) {
                unknownFieldSetLite.getHighSpeedVideoSizes(i, androidx.content.preferences.protobuf.ByteString.EMPTY);
            } else {
                unknownFieldSetLite.getHighSpeedVideoSizes(i, androidx.content.preferences.protobuf.ByteString.copyFrom(bArr, i4, i5));
            }
            return i4 + i5;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                unknownFieldSetLite.getHighSpeedVideoSizes(i, java.lang.Integer.valueOf(getHighSpeedVideoSizes(bArr, i2)));
                return i2 + 4;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
        }
        androidx.content.preferences.protobuf.UnknownFieldSetLite highSpeedVideoSizes = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
        int i6 = (i & (-8)) | 4;
        registers.getHighSpeedVideoFpsRanges++;
        if (registers.getHighSpeedVideoFpsRanges < getHighSpeedVideoFpsRanges) {
            int i7 = 0;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i8 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    registers.getHighSpeedVideoSizes = b2;
                    highSpeedVideoFpsRangesFor = i8;
                } else {
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i8, registers);
                }
                int i9 = registers.getHighSpeedVideoSizes;
                if (i9 == i6) {
                    i7 = i9;
                    i2 = highSpeedVideoFpsRangesFor;
                    break;
                }
                i7 = i9;
                i2 = getHighResolutionOutputSizeshNQ4ISI(i9, bArr, highSpeedVideoFpsRangesFor, i3, highSpeedVideoSizes, registers);
            }
            registers.getHighSpeedVideoFpsRanges--;
            if (i2 > i3 || i7 != i6) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            unknownFieldSetLite.getHighSpeedVideoSizes(i, highSpeedVideoSizes);
            return i2;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
    }

    static int getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i) == 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
        }
        int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return getHighSpeedVideoFpsRanges(bArr, i2, registers);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                registers.getHighSpeedVideoSizes = b;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
            }
            return i4 + registers.getHighSpeedVideoSizes;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int i7 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
                i2 = i7;
            } else {
                i2 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i7, registers);
            }
            i6 = registers.getHighSpeedVideoSizes;
            if (i6 == i5) {
                break;
            }
            i2 = getHighSpeedVideoFpsRangesFor(i6, bArr, i2, i3, registers);
        }
        if (i2 > i3 || i6 != i5) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        return i2;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes;
        if (i3 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i3 > bArr.length - i2) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
        if (i3 == 0) {
            registers.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.ByteString.EMPTY;
            return i2;
        }
        registers.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.ByteString.copyFrom(bArr, i2, i3);
        return i2 + i3;
    }

    static int getHighSpeedVideoFpsRanges(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
        }
        int i5 = registers.getHighSpeedVideoSizes;
        if (i5 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i5 > bArr.length - i4) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
        if (i5 == 0) {
            protobufList.add(androidx.content.preferences.protobuf.ByteString.EMPTY);
        } else {
            protobufList.add(androidx.content.preferences.protobuf.ByteString.copyFrom(bArr, i4, i5));
            i4 += i5;
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
            } else {
                i6 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i6, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            i4 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i4, registers);
            }
            int i7 = registers.getHighSpeedVideoSizes;
            if (i7 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            if (i7 > bArr.length - i4) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (i7 == 0) {
                protobufList.add(androidx.content.preferences.protobuf.ByteString.EMPTY);
            } else {
                protobufList.add(androidx.content.preferences.protobuf.ByteString.copyFrom(bArr, i4, i7));
                i4 += i7;
            }
        }
        return i4;
    }

    static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes;
        if (i3 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i3 == 0) {
            registers.getHighSpeedVideoFpsRangesFor = "";
            return i2;
        }
        registers.getHighSpeedVideoFpsRangesFor = new java.lang.String(bArr, i2, i3, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
        return i2 + i3;
    }

    static int getInputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
        }
        int i5 = registers.getHighSpeedVideoSizes;
        if (i5 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i5 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new java.lang.String(bArr, i4, i5, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
            i4 += i5;
        }
        while (i4 < i3) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
            } else {
                i6 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i6, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            i4 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i4, registers);
            }
            int i7 = registers.getHighSpeedVideoSizes;
            if (i7 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            if (i7 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new java.lang.String(bArr, i4, i7, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
                i4 += i7;
            }
        }
        return i4;
    }

    static int getInputFormats(int i, byte[] bArr, int i2, int i3, androidx.datastore.preferences.protobuf.Internal.ProtobufList<?> protobufList, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i4 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i4, registers);
        }
        int i5 = registers.getHighSpeedVideoSizes;
        if (i5 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i5 == 0) {
            protobufList.add("");
        } else {
            int i6 = i4 + i5;
            if (!androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(bArr, i4, i6)) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
            }
            protobufList.add(new java.lang.String(bArr, i4, i5, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
            i4 = i6;
        }
        while (i4 < i3) {
            int i7 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                registers.getHighSpeedVideoSizes = b2;
            } else {
                i7 = getHighSpeedVideoFpsRangesFor((int) b2, bArr, i7, registers);
            }
            if (i != registers.getHighSpeedVideoSizes) {
                break;
            }
            i4 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                registers.getHighSpeedVideoSizes = b3;
            } else {
                i4 = getHighSpeedVideoFpsRangesFor((int) b3, bArr, i4, registers);
            }
            int i8 = registers.getHighSpeedVideoSizes;
            if (i8 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            if (i8 == 0) {
                protobufList.add("");
            } else {
                int i9 = i4 + i8;
                if (!androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(bArr, i4, i9)) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                }
                protobufList.add(new java.lang.String(bArr, i4, i8, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
                i4 = i9;
            }
        }
        return i4;
    }

    static int getHighSpeedVideoSizes(byte[] bArr, int i, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            registers.getHighSpeedVideoSizes = b;
        } else {
            i2 = getHighSpeedVideoFpsRangesFor((int) b, bArr, i2, registers);
        }
        int i3 = registers.getHighSpeedVideoSizes;
        if (i3 < 0) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
        if (i3 == 0) {
            registers.getHighSpeedVideoFpsRangesFor = "";
            return i2;
        }
        registers.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(bArr, i2, i3);
        return i2 + i3;
    }
}
