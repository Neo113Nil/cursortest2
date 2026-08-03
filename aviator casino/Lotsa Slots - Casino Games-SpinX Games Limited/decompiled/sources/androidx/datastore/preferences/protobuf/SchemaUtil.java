package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final java.lang.Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new androidx.datastore.preferences.protobuf.UnknownFieldSetLiteSchema();

    public static boolean shouldUseTableSwitch(int lo, int hi, int numFields) {
        if (hi < 40) {
            return true;
        }
        long j = hi - lo;
        long j2 = numFields;
        return j + 10 <= ((2 * j2) + 3) + ((j2 + 3) * 3);
    }

    private SchemaUtil() {
    }

    public static void requireGeneratedMessage(java.lang.Class<?> messageType) {
        java.lang.Class<?> cls;
        if (!androidx.datastore.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(messageType) && !androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime && (cls = GENERATED_MESSAGE_CLASS) != null && !cls.isAssignableFrom(messageType)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void writeDouble(int fieldNumber, double value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (java.lang.Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeFloat(int fieldNumber, float value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (java.lang.Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeFixed64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64(int fieldNumber, long value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeFixed32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeEnum(int fieldNumber, int value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeBool(int fieldNumber, boolean value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeString(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            writeStringInternal(fieldNumber, (java.lang.String) value, writer);
        } else {
            writeBytes(fieldNumber, (androidx.datastore.preferences.protobuf.ByteString) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, java.lang.String value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeBytes(int fieldNumber, androidx.datastore.preferences.protobuf.ByteString value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    public static void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> value, androidx.datastore.preferences.protobuf.Writer writer, boolean packed) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeStringList(int fieldNumber, java.util.List<java.lang.String> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeMessageList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static void writeLazyFieldList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        java.util.Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((androidx.datastore.preferences.protobuf.LazyFieldLite) it.next()).writeTo(writer, fieldNumber);
        }
    }

    public static void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeGroupList(int fieldNumber, java.util.List<?> value, androidx.datastore.preferences.protobuf.Writer writer, androidx.datastore.preferences.protobuf.Schema schema) throws java.io.IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    static int computeSizeInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag);
        }
        return computeSizeInt64ListNoTag + (list.size() * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeUInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeUInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag);
        }
        return computeSizeUInt64ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeSInt64ListNoTag(java.util.List<java.lang.Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.LongArrayList) {
            androidx.datastore.preferences.protobuf.LongArrayList longArrayList = (androidx.datastore.preferences.protobuf.LongArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeSInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag);
        }
        return computeSizeSInt64ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeEnumListNoTag(java.util.List<java.lang.Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeEnumList(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag);
        }
        return computeSizeEnumListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag);
        }
        return computeSizeInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeUInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag);
        }
        return computeSizeUInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeSInt32ListNoTag(java.util.List<java.lang.Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.IntArrayList) {
            androidx.datastore.preferences.protobuf.IntArrayList intArrayList = (androidx.datastore.preferences.protobuf.IntArrayList) list;
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int computeSizeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag);
        }
        return computeSizeSInt32ListNoTag + (size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber));
    }

    static int computeSizeFixed32ListNoTag(java.util.List<?> list) {
        return list.size() * 4;
    }

    static int computeSizeFixed32List(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(fieldNumber, 0);
    }

    static int computeSizeFixed64ListNoTag(java.util.List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeFixed64List(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(fieldNumber, 0L);
    }

    static int computeSizeBoolListNoTag(java.util.List<?> list) {
        return list.size();
    }

    static int computeSizeBoolList(int fieldNumber, java.util.List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (packed) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) + androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(fieldNumber, true);
    }

    static int computeSizeStringList(int fieldNumber, java.util.List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        if (list instanceof androidx.datastore.preferences.protobuf.LazyStringList) {
            androidx.datastore.preferences.protobuf.LazyStringList lazyStringList = (androidx.datastore.preferences.protobuf.LazyStringList) list;
            while (i < size) {
                java.lang.Object raw = lazyStringList.getRaw(i);
                if (raw instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    computeStringSizeNoTag2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) raw);
                }
                computeTagSize += computeStringSizeNoTag2;
                i++;
            }
        } else {
            while (i < size) {
                java.lang.Object obj = list.get(i);
                if (obj instanceof androidx.datastore.preferences.protobuf.ByteString) {
                    computeStringSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.datastore.preferences.protobuf.ByteString) obj);
                } else {
                    computeStringSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i++;
            }
        }
        return computeTagSize;
    }

    static int computeSizeMessage(int fieldNumber, java.lang.Object value, androidx.datastore.preferences.protobuf.Schema schema) {
        if (value instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
            return androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSize(fieldNumber, (androidx.datastore.preferences.protobuf.LazyFieldLite) value);
        }
        return androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSize(fieldNumber, (androidx.datastore.preferences.protobuf.MessageLite) value, schema);
    }

    static int computeSizeMessageList(int fieldNumber, java.util.List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
                computeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.datastore.preferences.protobuf.LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) obj);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    static int computeSizeMessageList(int fieldNumber, java.util.List<?> list, androidx.datastore.preferences.protobuf.Schema schema) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (obj instanceof androidx.datastore.preferences.protobuf.LazyFieldLite) {
                computeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.datastore.preferences.protobuf.LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.datastore.preferences.protobuf.MessageLite) obj, schema);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    static int computeSizeByteStringList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(fieldNumber);
        for (int i = 0; i < list.size(); i++) {
            computeTagSize += androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(list.get(i));
        }
        return computeTagSize;
    }

    static int computeSizeGroupList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(fieldNumber, list.get(i2));
        }
        return i;
    }

    static int computeSizeGroupList(int fieldNumber, java.util.List<androidx.datastore.preferences.protobuf.MessageLite> list, androidx.datastore.preferences.protobuf.Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(fieldNumber, list.get(i2), schema);
        }
        return i;
    }

    public static boolean shouldUseTableSwitch(androidx.datastore.preferences.protobuf.FieldInfo[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    private static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            java.lang.Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (androidx.datastore.preferences.protobuf.UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getGeneratedMessageClass() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> getUnknownFieldSetSchemaClass() {
        if (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static java.lang.Object getMapDefaultEntry(java.lang.Class<?> clazz, java.lang.String name) {
        try {
            java.lang.reflect.Field[] declaredFields = java.lang.Class.forName(clazz.getName() + "$" + toCamelCase(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length != 1) {
                throw new java.lang.IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
            }
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getStaticObject(declaredFields[0]);
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException(th);
        }
    }

    static java.lang.String toCamelCase(java.lang.String name, boolean capNext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char charAt = name.charAt(i);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb.append(charAt);
                    }
                    capNext = true;
                } else if (i == 0 && !capNext) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else if (capNext) {
                sb.append((char) (charAt - ' '));
            } else {
                sb.append(charAt);
            }
            capNext = false;
        }
        return sb.toString();
    }

    static boolean safeEquals(java.lang.Object a2, java.lang.Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    static <T> void mergeMap(androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema, T message, T o, long offset) {
        androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(message, offset, mapFieldSchema.mergeFrom(androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(message, offset), androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(o, offset)));
    }

    static <T, FT extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(androidx.datastore.preferences.protobuf.ExtensionSchema<FT> schema, T message, T other) {
        androidx.datastore.preferences.protobuf.FieldSet<FT> extensions = schema.getExtensions(other);
        if (extensions.isEmpty()) {
            return;
        }
        schema.getMutableExtensions(message).mergeFrom(extensions);
    }

    static <T, UT, UB> void mergeUnknownFields(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message, T other) {
        schema.setToMessage(message, schema.merge(schema.getFromMessage(message), schema.getFromMessage(other)));
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Integer num = list.get(i3);
                int intValue = num.intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(intValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB filterUnknownEnumList(java.lang.Object obj, int i, java.util.List<java.lang.Integer> list, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Integer num = list.get(i3);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, intValue, ub, unknownFieldSchema);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB storeUnknownEnum(java.lang.Object obj, int i, int i2, UB ub, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i, i2);
        return ub;
    }
}
