package androidx.glance.appwidget.protobuf;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.appwidget.protobuf.ArrayDecoders;
import androidx.glance.appwidget.protobuf.ByteString;
import androidx.glance.appwidget.protobuf.Internal;
import androidx.glance.appwidget.protobuf.MapEntryLite;
import androidx.glance.appwidget.protobuf.WireFormat;
import androidx.glance.appwidget.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: androidx.glance.appwidget.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
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

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i3 = registers.int1;
        if (i3 < 0 || i3 > i2 - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = decodeVarint32 + i3;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i4) {
            int i5 = decodeVarint32 + 1;
            int i6 = bArr[decodeVarint32];
            if (i6 < 0) {
                i5 = ArrayDecoders.decodeVarint32(i6, bArr, i5, registers);
                i6 = registers.int1;
            }
            int i7 = i5;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i7, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i2, registers);
            } else if (i9 == metadata.keyType.getWireType()) {
                decodeVarint32 = decodeMapEntryValue(bArr, i7, i2, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                decodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i2, registers);
            }
        }
        if (decodeVarint32 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i2, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getSerializedSizeProto2(T t) {
        int i;
        int i2;
        int computeDoubleSize;
        int computeBoolSize;
        int computeBytesSize;
        int computeSizeMessage;
        boolean z;
        int computeSizeFixed32List;
        Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            int numberAt = numberAt(i5);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i = this.buffer[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
            } else {
                i = (!this.useCachedSizeField || type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i5 + 2] & i3;
                i2 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, offset);
                        computeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object);
                        i6 = computeBytesSize + i6;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                        i6 += computeSizeMessage;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeBoolSize;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeMessage;
                    break;
                case 19:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 20:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 21:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 22:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 23:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 24:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 25:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 26:
                    computeSizeMessage = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t, offset));
                    i6 += computeSizeMessage;
                    break;
                case 27:
                    computeSizeMessage = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                    i6 += computeSizeMessage;
                    break;
                case 28:
                    computeSizeMessage = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t, offset));
                    i6 += computeSizeMessage;
                    break;
                case 29:
                    computeSizeMessage = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeMessage;
                    break;
                case 30:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 31:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 32:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 33:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 34:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t, offset), false);
                    i6 += computeSizeFixed32List;
                    break;
                case 35:
                    int computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag);
                        }
                        i6 = a.a(computeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag, i6);
                    }
                    break;
                case 36:
                    int computeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed32ListNoTag);
                        }
                        i6 = a.a(computeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag, i6);
                    }
                    break;
                case 37:
                    int computeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeInt64ListNoTag);
                        }
                        i6 = a.a(computeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeInt64ListNoTag, i6);
                    }
                    break;
                case 38:
                    int computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeUInt64ListNoTag);
                        }
                        i6 = a.a(computeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeUInt64ListNoTag, i6);
                    }
                    break;
                case 39:
                    int computeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeInt32ListNoTag);
                        }
                        i6 = a.a(computeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeInt32ListNoTag, i6);
                    }
                    break;
                case 40:
                    int computeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag2);
                        }
                        i6 = a.a(computeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag2, i6);
                    }
                    break;
                case 41:
                    int computeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed32ListNoTag2);
                        }
                        i6 = a.a(computeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag2, i6);
                    }
                    break;
                case 42:
                    int computeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeBoolListNoTag);
                        }
                        i6 = a.a(computeSizeBoolListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeBoolListNoTag, i6);
                    }
                    break;
                case 43:
                    int computeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeUInt32ListNoTag);
                        }
                        i6 = a.a(computeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeUInt32ListNoTag, i6);
                    }
                    break;
                case 44:
                    int computeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeEnumListNoTag);
                        }
                        i6 = a.a(computeSizeEnumListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeEnumListNoTag, i6);
                    }
                    break;
                case 45:
                    int computeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed32ListNoTag3);
                        }
                        i6 = a.a(computeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag3, i6);
                    }
                    break;
                case 46:
                    int computeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeFixed64ListNoTag3);
                        }
                        i6 = a.a(computeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag3, i6);
                    }
                    break;
                case 47:
                    int computeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeSInt32ListNoTag);
                        }
                        i6 = a.a(computeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeSInt32ListNoTag, i6);
                    }
                    break;
                case 48:
                    int computeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, computeSizeSInt64ListNoTag);
                        }
                        i6 = a.a(computeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeSInt64ListNoTag, i6);
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    computeSizeMessage = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                    i6 += computeSizeMessage;
                    break;
                case 50:
                    computeSizeMessage = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t, offset), getMapFieldDefaultEntry(i5));
                    i6 += computeSizeMessage;
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i6 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i6 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i6 += computeBoolSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i6 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, numberAt, i5)) {
                        Object object2 = unsafe.getObject(t, offset);
                        computeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        i6 = computeBytesSize + i6;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                        i6 += computeSizeMessage;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i6 += computeBoolSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i6 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        i6 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, numberAt, i5)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t, offset), getMessageFieldSchema(i5));
                        i6 += computeBoolSize;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = i6 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t) {
        int computeDoubleSize;
        int computeBytesSize;
        int computeSizeMessage;
        Unsafe unsafe = UNSAFE;
        int i = 0;
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i2);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i2);
            long offset = offset(typeAndOffsetAt);
            int i3 = (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i2 + 2] & 1048575;
            switch (type) {
                case 0:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t, i2)) {
                        Object object = UnsafeUtil.getObject(t, offset);
                        computeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object);
                        i = computeBytesSize + i;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t, i2)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        i += computeSizeMessage;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 19:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 20:
                    computeSizeMessage = SchemaUtil.computeSizeInt64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 21:
                    computeSizeMessage = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 22:
                    computeSizeMessage = SchemaUtil.computeSizeInt32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 23:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 24:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 25:
                    computeSizeMessage = SchemaUtil.computeSizeBoolList(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 26:
                    computeSizeMessage = SchemaUtil.computeSizeStringList(numberAt, listAt(t, offset));
                    i += computeSizeMessage;
                    break;
                case 27:
                    computeSizeMessage = SchemaUtil.computeSizeMessageList(numberAt, listAt(t, offset), getMessageFieldSchema(i2));
                    i += computeSizeMessage;
                    break;
                case 28:
                    computeSizeMessage = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t, offset));
                    i += computeSizeMessage;
                    break;
                case 29:
                    computeSizeMessage = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 30:
                    computeSizeMessage = SchemaUtil.computeSizeEnumList(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 31:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 32:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 33:
                    computeSizeMessage = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 34:
                    computeSizeMessage = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t, offset), false);
                    i += computeSizeMessage;
                    break;
                case 35:
                    int computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag);
                        }
                        i = a.a(computeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag, i);
                        break;
                    }
                case 36:
                    int computeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed32ListNoTag);
                        }
                        i = a.a(computeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag, i);
                        break;
                    }
                case 37:
                    int computeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeInt64ListNoTag);
                        }
                        i = a.a(computeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeInt64ListNoTag, i);
                        break;
                    }
                case 38:
                    int computeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeUInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeUInt64ListNoTag);
                        }
                        i = a.a(computeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeUInt64ListNoTag, i);
                        break;
                    }
                case 39:
                    int computeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeInt32ListNoTag);
                        }
                        i = a.a(computeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeInt32ListNoTag, i);
                        break;
                    }
                case 40:
                    int computeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag2);
                        }
                        i = a.a(computeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag2, i);
                        break;
                    }
                case 41:
                    int computeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed32ListNoTag2);
                        }
                        i = a.a(computeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag2, i);
                        break;
                    }
                case 42:
                    int computeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeBoolListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeBoolListNoTag);
                        }
                        i = a.a(computeSizeBoolListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeBoolListNoTag, i);
                        break;
                    }
                case 43:
                    int computeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeUInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeUInt32ListNoTag);
                        }
                        i = a.a(computeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeUInt32ListNoTag, i);
                        break;
                    }
                case 44:
                    int computeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeEnumListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeEnumListNoTag);
                        }
                        i = a.a(computeSizeEnumListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeEnumListNoTag, i);
                        break;
                    }
                case 45:
                    int computeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed32ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed32ListNoTag3);
                        }
                        i = a.a(computeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed32ListNoTag3, i);
                        break;
                    }
                case 46:
                    int computeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeFixed64ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeFixed64ListNoTag3);
                        }
                        i = a.a(computeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(numberAt), computeSizeFixed64ListNoTag3, i);
                        break;
                    }
                case 47:
                    int computeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeSInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeSInt32ListNoTag);
                        }
                        i = a.a(computeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeSInt32ListNoTag, i);
                        break;
                    }
                case 48:
                    int computeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t, offset));
                    if (computeSizeSInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i3, computeSizeSInt64ListNoTag);
                        }
                        i = a.a(computeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(numberAt), computeSizeSInt64ListNoTag, i);
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    computeSizeMessage = SchemaUtil.computeSizeGroupList(numberAt, listAt(t, offset), getMessageFieldSchema(i2));
                    i += computeSizeMessage;
                    break;
                case 50:
                    computeSizeMessage = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t, offset), getMapFieldDefaultEntry(i2));
                    i += computeSizeMessage;
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i2)) {
                        Object object2 = UnsafeUtil.getObject(t, offset);
                        computeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        i = computeBytesSize + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        i += computeSizeMessage;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t, offset));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i2)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t, offset), getMessageFieldSchema(i2));
                        i += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? isFieldPresent(t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
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
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.glance.appwidget.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r5 = 0;
        for (Object obj : forMapData.values()) {
            r5 = r5;
            if (r5 == 0) {
                r5 = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!r5.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t2, presenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return UnsafeUtil.getInt(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.getLong(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends androidx.glance.appwidget.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.glance.appwidget.protobuf.UnknownFieldSchema<UT, UB> r17, androidx.glance.appwidget.protobuf.ExtensionSchema<ET> r18, T r19, androidx.glance.appwidget.protobuf.Reader r20, androidx.glance.appwidget.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.protobuf.MessageSchema.mergeFromHelper(androidx.glance.appwidget.protobuf.UnknownFieldSchema, androidx.glance.appwidget.protobuf.ExtensionSchema, java.lang.Object, androidx.glance.appwidget.protobuf.Reader, androidx.glance.appwidget.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (isFieldPresent(t2, i)) {
            long offset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                } else {
                    unsafe.putObject(t, offset, object);
                }
                setFieldPresent(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
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
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, numberAt, i)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t, offset, newInstance);
                } else {
                    unsafe.putObject(t, offset, object);
                }
                setOneofPresent(t, numberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putDouble(t, offset, UnsafeUtil.getDouble(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putFloat(t, offset, UnsafeUtil.getFloat(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putBoolean(t, offset, UnsafeUtil.getBoolean(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(t, t2, i);
                break;
            case 10:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putInt(t, offset, UnsafeUtil.getInt(t2, offset));
                    setFieldPresent(t, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.putLong(t, offset, UnsafeUtil.getLong(t2, offset));
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
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                this.listFieldSchema.mergeListsAt(t, t2, offset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, offset);
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
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
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
                    UnsafeUtil.putObject(t, offset, UnsafeUtil.getObject(t2, offset));
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
    private Object mutableMessageFieldForMerge(T t, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        boolean z = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
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
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
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
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char charAt5;
        int i6;
        char charAt6;
        int i7;
        char charAt7;
        int i8;
        char charAt8;
        int i9;
        char charAt9;
        int i10;
        char charAt10;
        int i11;
        char charAt11;
        int i12;
        char charAt12;
        int i13;
        int i14;
        int i15;
        int objectFieldOffset;
        int i16;
        int i17;
        int i18;
        java.lang.reflect.Field reflectField;
        char charAt13;
        int i19;
        Object obj;
        java.lang.reflect.Field reflectField2;
        Object obj2;
        java.lang.reflect.Field reflectField3;
        int i20;
        char charAt14;
        int i21;
        char charAt15;
        int i22;
        char charAt16;
        int i23;
        char charAt17;
        boolean z = rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i24 = 1;
            while (true) {
                i = i24 + 1;
                if (stringInfo.charAt(i24) < 55296) {
                    break;
                }
                i24 = i;
            }
        } else {
            i = 1;
        }
        int i25 = i + 1;
        int charAt18 = stringInfo.charAt(i);
        if (charAt18 >= 55296) {
            int i26 = charAt18 & 8191;
            int i27 = 13;
            while (true) {
                i23 = i25 + 1;
                charAt17 = stringInfo.charAt(i25);
                if (charAt17 < 55296) {
                    break;
                }
                i26 |= (charAt17 & 8191) << i27;
                i27 += 13;
                i25 = i23;
            }
            charAt18 = i26 | (charAt17 << i27);
            i25 = i23;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i3 = 0;
            charAt4 = 0;
            i2 = 0;
            iArr = EMPTY_INT_ARRAY;
            i4 = 0;
        } else {
            int i28 = i25 + 1;
            int charAt19 = stringInfo.charAt(i25);
            if (charAt19 >= 55296) {
                int i29 = charAt19 & 8191;
                int i30 = 13;
                while (true) {
                    i12 = i28 + 1;
                    charAt12 = stringInfo.charAt(i28);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i29 |= (charAt12 & 8191) << i30;
                    i30 += 13;
                    i28 = i12;
                }
                charAt19 = i29 | (charAt12 << i30);
                i28 = i12;
            }
            int i31 = i28 + 1;
            int charAt20 = stringInfo.charAt(i28);
            if (charAt20 >= 55296) {
                int i32 = charAt20 & 8191;
                int i33 = 13;
                while (true) {
                    i11 = i31 + 1;
                    charAt11 = stringInfo.charAt(i31);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i32 |= (charAt11 & 8191) << i33;
                    i33 += 13;
                    i31 = i11;
                }
                charAt20 = i32 | (charAt11 << i33);
                i31 = i11;
            }
            int i34 = i31 + 1;
            charAt = stringInfo.charAt(i31);
            if (charAt >= 55296) {
                int i35 = charAt & 8191;
                int i36 = 13;
                while (true) {
                    i10 = i34 + 1;
                    charAt10 = stringInfo.charAt(i34);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i35 |= (charAt10 & 8191) << i36;
                    i36 += 13;
                    i34 = i10;
                }
                charAt = i35 | (charAt10 << i36);
                i34 = i10;
            }
            int i37 = i34 + 1;
            charAt2 = stringInfo.charAt(i34);
            if (charAt2 >= 55296) {
                int i38 = charAt2 & 8191;
                int i39 = 13;
                while (true) {
                    i9 = i37 + 1;
                    charAt9 = stringInfo.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i9;
                }
                charAt2 = i38 | (charAt9 << i39);
                i37 = i9;
            }
            int i40 = i37 + 1;
            charAt3 = stringInfo.charAt(i37);
            if (charAt3 >= 55296) {
                int i41 = charAt3 & 8191;
                int i42 = 13;
                while (true) {
                    i8 = i40 + 1;
                    charAt8 = stringInfo.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i8;
                }
                charAt3 = i41 | (charAt8 << i42);
                i40 = i8;
            }
            int i43 = i40 + 1;
            int charAt21 = stringInfo.charAt(i40);
            if (charAt21 >= 55296) {
                int i44 = charAt21 & 8191;
                int i45 = 13;
                while (true) {
                    i7 = i43 + 1;
                    charAt7 = stringInfo.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i7;
                }
                charAt21 = i44 | (charAt7 << i45);
                i43 = i7;
            }
            int i46 = i43 + 1;
            int charAt22 = stringInfo.charAt(i43);
            if (charAt22 >= 55296) {
                int i47 = charAt22 & 8191;
                int i48 = 13;
                while (true) {
                    i6 = i46 + 1;
                    charAt6 = stringInfo.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i6;
                }
                charAt22 = i47 | (charAt6 << i48);
                i46 = i6;
            }
            int i49 = i46 + 1;
            charAt4 = stringInfo.charAt(i46);
            if (charAt4 >= 55296) {
                int i50 = charAt4 & 8191;
                int i51 = 13;
                while (true) {
                    i5 = i49 + 1;
                    charAt5 = stringInfo.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i5;
                }
                charAt4 = i50 | (charAt5 << i51);
                i49 = i5;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i2 = (charAt19 * 2) + charAt20;
            i3 = charAt21;
            iArr = iArr2;
            i4 = charAt19;
            i25 = i49;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i52 = i3 + charAt4;
        int i53 = i52;
        int i54 = charAt4;
        int i55 = 0;
        int i56 = 0;
        while (i25 < length) {
            int i57 = i25 + 1;
            int charAt23 = stringInfo.charAt(i25);
            if (charAt23 >= c) {
                int i58 = charAt23 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i22 = i59 + 1;
                    charAt16 = stringInfo.charAt(i59);
                    if (charAt16 < c) {
                        break;
                    }
                    i58 |= (charAt16 & 8191) << i60;
                    i60 += 13;
                    i59 = i22;
                }
                charAt23 = i58 | (charAt16 << i60);
                i13 = i22;
            } else {
                i13 = i57;
            }
            int i61 = i13 + 1;
            int charAt24 = stringInfo.charAt(i13);
            if (charAt24 >= c) {
                int i62 = charAt24 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i21 = i63 + 1;
                    charAt15 = stringInfo.charAt(i63);
                    i14 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i62 |= (charAt15 & 8191) << i64;
                    i64 += 13;
                    i63 = i21;
                    length = i14;
                }
                charAt24 = i62 | (charAt15 << i64);
                i15 = i21;
            } else {
                i14 = length;
                i15 = i61;
            }
            int i65 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i55] = i56;
                i55++;
            }
            int i66 = charAt23;
            if (i65 >= 51) {
                int i67 = i15 + 1;
                int charAt25 = stringInfo.charAt(i15);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i68 = charAt25 & 8191;
                    int i69 = 13;
                    while (true) {
                        i20 = i67 + 1;
                        charAt14 = stringInfo.charAt(i67);
                        if (charAt14 < c2) {
                            break;
                        }
                        i68 |= (charAt14 & 8191) << i69;
                        i69 += 13;
                        i67 = i20;
                        c2 = 55296;
                    }
                    charAt25 = i68 | (charAt14 << i69);
                    i67 = i20;
                }
                int i70 = i65 - 51;
                int i71 = charAt25;
                if (i70 == 9 || i70 == 17) {
                    i19 = i2 + 1;
                    objArr[((i56 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i70 == 12 && !z) {
                        i19 = i2 + 1;
                        objArr[((i56 / 3) * 2) + 1] = objects[i2];
                    }
                    int i72 = i71 * 2;
                    obj = objects[i72];
                    if (obj instanceof java.lang.reflect.Field) {
                        reflectField2 = reflectField(cls, (String) obj);
                        objects[i72] = reflectField2;
                    } else {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    }
                    int i73 = i67;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i74 = i72 + 1;
                    obj2 = objects[i74];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        reflectField3 = reflectField(cls, (String) obj2);
                        objects[i74] = reflectField3;
                    } else {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    }
                    i16 = (int) unsafe.objectFieldOffset(reflectField3);
                    i25 = i73;
                    objectFieldOffset = objectFieldOffset2;
                    i18 = 0;
                }
                i2 = i19;
                int i722 = i71 * 2;
                obj = objects[i722];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int i732 = i67;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(reflectField2);
                int i742 = i722 + 1;
                obj2 = objects[i742];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i16 = (int) unsafe.objectFieldOffset(reflectField3);
                i25 = i732;
                objectFieldOffset = objectFieldOffset22;
                i18 = 0;
            } else {
                int i75 = i2 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (String) objects[i2]);
                if (i65 == 9 || i65 == 17) {
                    objArr[((i56 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i65 == 27 || i65 == 49) {
                        i2 += 2;
                        objArr[((i56 / 3) * 2) + 1] = objects[i75];
                    } else if (i65 == 12 || i65 == 30 || i65 == 44) {
                        if (!z) {
                            i2 += 2;
                            objArr[((i56 / 3) * 2) + 1] = objects[i75];
                        }
                    } else if (i65 == 50) {
                        int i76 = i54 + 1;
                        iArr[i54] = i56;
                        int i77 = (i56 / 3) * 2;
                        int i78 = i2 + 2;
                        objArr[i77] = objects[i75];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i77 + 1] = objects[i78];
                            i2 += 3;
                        } else {
                            i2 = i78;
                        }
                        i54 = i76;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) == 4096 || i65 > 17) {
                        i16 = 1048575;
                        i17 = i15;
                        i18 = 0;
                    } else {
                        int i79 = i15 + 1;
                        int charAt26 = stringInfo.charAt(i15);
                        if (charAt26 >= 55296) {
                            int i80 = charAt26 & 8191;
                            int i81 = 13;
                            while (true) {
                                i17 = i79 + 1;
                                charAt13 = stringInfo.charAt(i79);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i80 |= (charAt13 & 8191) << i81;
                                i81 += 13;
                                i79 = i17;
                            }
                            charAt26 = i80 | (charAt13 << i81);
                        } else {
                            i17 = i79;
                        }
                        int i82 = (charAt26 / 32) + (i4 * 2);
                        Object obj3 = objects[i82];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            reflectField = (java.lang.reflect.Field) obj3;
                        } else {
                            reflectField = reflectField(cls, (String) obj3);
                            objects[i82] = reflectField;
                        }
                        i16 = (int) unsafe.objectFieldOffset(reflectField);
                        i18 = charAt26 % 32;
                    }
                    if (i65 >= 18 && i65 <= 49) {
                        iArr[i53] = objectFieldOffset;
                        i53++;
                    }
                    i25 = i17;
                }
                i2 = i75;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) == 4096) {
                }
                i16 = 1048575;
                i17 = i15;
                i18 = 0;
                if (i65 >= 18) {
                    iArr[i53] = objectFieldOffset;
                    i53++;
                }
                i25 = i17;
            }
            int i83 = i56 + 1;
            iArr4[i56] = i66;
            int i84 = i56 + 2;
            String str = stringInfo;
            iArr4[i83] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i65 << 20) | objectFieldOffset;
            i56 += 3;
            iArr4[i84] = (i18 << 20) | i16;
            iArr3 = iArr4;
            length = i14;
            stringInfo = str;
            c = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, charAt, charAt2, rawMessageInfo.getDefaultInstance(), z, false, iArr, charAt4, i52, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, Long.valueOf(registers.long1));
                unsafe.putInt(t, j2, i4);
                return decodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, Integer.valueOf(registers.int1));
                unsafe.putInt(t, j2, i4);
                return decodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t, j2, i4);
                return decodeVarint642;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i13 = registers.int1;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, decodeVarint322, i13, Internal.UTF_8));
                    decodeVarint322 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return decodeVarint322;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge);
                return mergeMessageField;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int decodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t, j, registers.object1);
                unsafe.putInt(t, j2, i4);
                return decodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i14 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                    getMutableUnknownFields(t).storeField(i3, Long.valueOf(i14));
                    return decodeVarint323;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return decodeVarint323;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t, j2, i4);
                return decodeVarint324;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t, j2, i4);
                return decodeVarint643;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    storeOneofMessageField(t, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i;
    }

    @CanIgnoreReturnValue
    private int parseProto3Message(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
        T t2;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        ArrayDecoders.Registers registers2;
        int i8;
        int i9;
        int decodeVarint32;
        T t3;
        Unsafe unsafe2;
        int i10;
        ArrayDecoders.Registers registers3;
        byte[] bArr3;
        int decodeVarint64;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        MessageSchema<T> messageSchema = this;
        T t4 = t;
        byte[] bArr4 = bArr;
        int i17 = i2;
        ArrayDecoders.Registers registers4 = registers;
        checkMutable(t4);
        Unsafe unsafe3 = UNSAFE;
        int i18 = -1;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1048575;
        while (i19 < i17) {
            int i24 = i19 + 1;
            int i25 = bArr4[i19];
            if (i25 < 0) {
                i24 = ArrayDecoders.decodeVarint32(i25, bArr4, i24, registers4);
                i25 = registers4.int1;
            }
            int i26 = i25 >>> 3;
            int i27 = i25 & 7;
            int positionForFieldNumber = i26 > i20 ? messageSchema.positionForFieldNumber(i26, i21 / 3) : messageSchema.positionForFieldNumber(i26);
            if (positionForFieldNumber == i18) {
                t2 = t4;
                unsafe = unsafe3;
                i3 = i25;
                i4 = i24;
                i5 = i18;
                i6 = i26;
                i7 = 0;
            } else {
                int i28 = messageSchema.buffer[positionForFieldNumber + 1];
                int type = type(i28);
                i3 = i25;
                int i29 = positionForFieldNumber;
                long offset = offset(i28);
                if (type <= 17) {
                    int i30 = messageSchema.buffer[i29 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i23) {
                        if (i23 != 1048575) {
                            unsafe3.putInt(t4, i23, i22);
                            i12 = i32;
                            i11 = 1048575;
                        } else {
                            i11 = 1048575;
                            i12 = i32;
                        }
                        if (i12 != i11) {
                            i22 = unsafe3.getInt(t4, i12);
                        }
                        i23 = i12;
                    }
                    switch (type) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i8 = i24;
                            i9 = i29;
                            if (i27 != 1) {
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                UnsafeUtil.putDouble(t4, offset, ArrayDecoders.decodeDouble(bArr5, i8));
                                i19 = i8 + 8;
                                i22 |= i31;
                                i17 = i2;
                                i21 = i9;
                                i20 = i26;
                                bArr4 = bArr5;
                                i18 = -1;
                                registers4 = registers;
                                break;
                            }
                        case 1:
                            ArrayDecoders.Registers registers5 = registers4;
                            bArr2 = bArr4;
                            registers2 = registers5;
                            i8 = i24;
                            i9 = i29;
                            if (i27 != 5) {
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                UnsafeUtil.putFloat(t4, offset, ArrayDecoders.decodeFloat(bArr2, i8));
                                i19 = i8 + 4;
                                i22 |= i31;
                                byte[] bArr6 = bArr2;
                                registers4 = registers2;
                                bArr4 = bArr6;
                                i17 = i2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            ArrayDecoders.Registers registers6 = registers4;
                            byte[] bArr7 = bArr4;
                            i8 = i24;
                            i9 = i29;
                            if (i27 != 0) {
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr7, i8, registers6);
                                Unsafe unsafe4 = unsafe3;
                                T t5 = t4;
                                unsafe4.putLong(t5, offset, registers6.long1);
                                unsafe3 = unsafe4;
                                t4 = t5;
                                i22 |= i31;
                                registers4 = registers6;
                                bArr4 = bArr7;
                                i19 = decodeVarint642;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                i17 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            ArrayDecoders.Registers registers7 = registers4;
                            byte[] bArr8 = bArr4;
                            i8 = i24;
                            i9 = i29;
                            if (i27 != 0) {
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint32 = ArrayDecoders.decodeVarint32(bArr8, i8, registers7);
                                unsafe3.putInt(t4, offset, registers7.int1);
                                i22 |= i31;
                                registers4 = registers7;
                                bArr4 = bArr8;
                                i17 = i2;
                                i19 = decodeVarint32;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            T t6 = t4;
                            ArrayDecoders.Registers registers8 = registers4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i33 = i24;
                            i9 = i29;
                            if (i27 != 1) {
                                t4 = t6;
                                i8 = i33;
                                unsafe3 = unsafe5;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                registers2 = registers8;
                                unsafe5.putLong(t6, offset, ArrayDecoders.decodeFixed64(bArr2, i33));
                                unsafe3 = unsafe5;
                                t4 = t6;
                                i19 = i33 + 8;
                                i22 |= i31;
                                byte[] bArr62 = bArr2;
                                registers4 = registers2;
                                bArr4 = bArr62;
                                i17 = i2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            byte[] bArr10 = bArr4;
                            t3 = t4;
                            ArrayDecoders.Registers registers9 = registers4;
                            unsafe2 = unsafe3;
                            i10 = i24;
                            i9 = i29;
                            if (i27 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe6;
                                t4 = t3;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                unsafe2.putInt(t3, offset, ArrayDecoders.decodeFixed32(bArr10, i10));
                                i19 = i10 + 4;
                                i22 |= i31;
                                registers4 = registers9;
                                t4 = t3;
                                bArr4 = bArr10;
                                unsafe3 = unsafe2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                i17 = i2;
                                break;
                            }
                        case 7:
                            byte[] bArr11 = bArr4;
                            t3 = t4;
                            registers3 = registers4;
                            bArr3 = bArr11;
                            unsafe2 = unsafe3;
                            i10 = i24;
                            i9 = i29;
                            if (i27 != 0) {
                                Unsafe unsafe62 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe62;
                                t4 = t3;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i10, registers3);
                                UnsafeUtil.putBoolean(t3, offset, registers3.long1 != 0);
                                i22 |= i31;
                                byte[] bArr12 = bArr3;
                                registers4 = registers3;
                                t4 = t3;
                                bArr4 = bArr12;
                                i19 = decodeVarint64;
                                unsafe3 = unsafe2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                i17 = i2;
                                break;
                            }
                        case 8:
                            byte[] bArr13 = bArr4;
                            t3 = t4;
                            registers3 = registers4;
                            bArr3 = bArr13;
                            unsafe2 = unsafe3;
                            i10 = i24;
                            i9 = i29;
                            if (i27 != 2) {
                                Unsafe unsafe622 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe622;
                                t4 = t3;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint64 = (i28 & 536870912) == 0 ? ArrayDecoders.decodeString(bArr3, i10, registers3) : ArrayDecoders.decodeStringRequireUtf8(bArr3, i10, registers3);
                                unsafe2.putObject(t3, offset, registers3.object1);
                                i22 |= i31;
                                byte[] bArr122 = bArr3;
                                registers4 = registers3;
                                t4 = t3;
                                bArr4 = bArr122;
                                i19 = decodeVarint64;
                                unsafe3 = unsafe2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                i17 = i2;
                                break;
                            }
                        case 9:
                            i9 = i29;
                            if (i27 != 2) {
                                t4 = t4;
                                i8 = i24;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                T t7 = t4;
                                Object mutableMessageFieldForMerge = messageSchema.mutableMessageFieldForMerge(t7, i9);
                                byte[] bArr14 = bArr4;
                                t3 = t7;
                                int i34 = i17;
                                unsafe2 = unsafe3;
                                int i35 = i24;
                                ArrayDecoders.Registers registers10 = registers4;
                                decodeVarint64 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema.getMessageFieldSchema(i9), bArr14, i35, i34, registers10);
                                bArr3 = bArr14;
                                registers3 = registers10;
                                messageSchema.storeMessageField(t3, i9, mutableMessageFieldForMerge);
                                i22 |= i31;
                                byte[] bArr1222 = bArr3;
                                registers4 = registers3;
                                t4 = t3;
                                bArr4 = bArr1222;
                                i19 = decodeVarint64;
                                unsafe3 = unsafe2;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                i17 = i2;
                                break;
                            }
                        case 10:
                            i9 = i29;
                            if (i27 != 2) {
                                i8 = i24;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint32 = ArrayDecoders.decodeBytes(bArr4, i24, registers4);
                                unsafe3.putObject(t4, offset, registers4.object1);
                                i22 |= i31;
                                i19 = decodeVarint32;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 12:
                            i9 = i29;
                            if (i27 != 0) {
                                i8 = i24;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint32 = ArrayDecoders.decodeVarint32(bArr4, i24, registers4);
                                unsafe3.putInt(t4, offset, registers4.int1);
                                i22 |= i31;
                                i19 = decodeVarint32;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 15:
                            i9 = i29;
                            if (i27 != 0) {
                                i8 = i24;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                decodeVarint32 = ArrayDecoders.decodeVarint32(bArr4, i24, registers4);
                                unsafe3.putInt(t4, offset, CodedInputStream.decodeZigZag32(registers4.int1));
                                i22 |= i31;
                                i19 = decodeVarint32;
                                i21 = i9;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                i8 = i24;
                                i9 = i29;
                                unsafe = unsafe3;
                                i4 = i8;
                                i7 = i9;
                                i6 = i26;
                                i5 = -1;
                                t2 = t4;
                                break;
                            } else {
                                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr4, i24, registers4);
                                Unsafe unsafe7 = unsafe3;
                                T t8 = t4;
                                unsafe7.putLong(t8, offset, CodedInputStream.decodeZigZag64(registers4.long1));
                                unsafe3 = unsafe7;
                                t4 = t8;
                                i22 |= i31;
                                i19 = decodeVarint643;
                                i20 = i26;
                                i21 = i29;
                                i18 = -1;
                                break;
                            }
                        default:
                            i8 = i24;
                            i9 = i29;
                            unsafe = unsafe3;
                            i4 = i8;
                            i7 = i9;
                            i6 = i26;
                            i5 = -1;
                            t2 = t4;
                            break;
                    }
                } else {
                    int i36 = i24;
                    byte[] bArr15 = bArr4;
                    if (type != 27) {
                        Unsafe unsafe8 = unsafe3;
                        if (type <= 49) {
                            i14 = i22;
                            unsafe = unsafe8;
                            i5 = -1;
                            i16 = i23;
                            int parseRepeatedField = messageSchema.parseRepeatedField(t, bArr, i36, i2, i3, i26, i27, i29, i28, type, offset, registers);
                            i15 = i26;
                            i7 = i29;
                            if (parseRepeatedField != i36) {
                                messageSchema = this;
                                t4 = t;
                                i17 = i2;
                                registers4 = registers;
                                i19 = parseRepeatedField;
                                i20 = i15;
                                i23 = i16;
                                i18 = -1;
                                i21 = i7;
                                i22 = i14;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                t2 = t;
                                i4 = parseRepeatedField;
                                i6 = i15;
                            }
                        } else {
                            unsafe = unsafe8;
                            i14 = i22;
                            i7 = i29;
                            i5 = -1;
                            i16 = i23;
                            i15 = i26;
                            i13 = i36;
                            if (type != 50) {
                                i6 = i15;
                                int parseOneofField = parseOneofField(t, bArr, i13, i2, i3, i6, i27, i28, type, offset, i7, registers);
                                t2 = t;
                                if (parseOneofField != i13) {
                                    messageSchema = this;
                                    registers4 = registers;
                                    i20 = i6;
                                    i19 = parseOneofField;
                                    t4 = t2;
                                    i23 = i16;
                                    i18 = -1;
                                    i21 = i7;
                                    i22 = i14;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i17 = i2;
                                } else {
                                    i4 = parseOneofField;
                                }
                            } else if (i27 == 2) {
                                int parseMapField = parseMapField(t, bArr, i13, i2, i7, offset, registers);
                                if (parseMapField != i13) {
                                    messageSchema = this;
                                    t4 = t;
                                    bArr4 = bArr;
                                    i17 = i2;
                                    registers4 = registers;
                                    i19 = parseMapField;
                                    i20 = i15;
                                    i23 = i16;
                                    i18 = -1;
                                    i21 = i7;
                                    i22 = i14;
                                    unsafe3 = unsafe;
                                } else {
                                    t2 = t;
                                    i4 = parseMapField;
                                    i6 = i15;
                                }
                            } else {
                                t2 = t;
                                i4 = i13;
                                i6 = i15;
                            }
                        }
                    } else if (i27 == 2) {
                        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe3.getObject(t4, offset);
                        if (!protobufList.isModifiable()) {
                            int size = protobufList.size();
                            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t4, offset, protobufList);
                        }
                        int decodeMessageList = ArrayDecoders.decodeMessageList(messageSchema.getMessageFieldSchema(i29), i3, bArr15, i36, i2, protobufList, registers);
                        bArr4 = bArr;
                        registers4 = registers;
                        i19 = decodeMessageList;
                        unsafe3 = unsafe3;
                        i20 = i26;
                        i21 = i29;
                        i18 = -1;
                        t4 = t;
                        i17 = i2;
                    } else {
                        i13 = i36;
                        unsafe = unsafe3;
                        i14 = i22;
                        i15 = i26;
                        i7 = i29;
                        i5 = -1;
                        i16 = i23;
                        t2 = t;
                        i4 = i13;
                        i6 = i15;
                    }
                    i23 = i16;
                    i22 = i14;
                }
            }
            int decodeUnknownField = ArrayDecoders.decodeUnknownField(i3, bArr, i4, i2, getMutableUnknownFields(t2), registers);
            bArr4 = bArr;
            registers4 = registers;
            i20 = i6;
            t4 = t2;
            i18 = i5;
            i21 = i7;
            unsafe3 = unsafe;
            i17 = i2;
            i19 = decodeUnknownField;
            messageSchema = this;
        }
        Unsafe unsafe9 = unsafe3;
        int i37 = i17;
        int i38 = i23;
        int i39 = i22;
        T t9 = t4;
        if (i38 != 1048575) {
            unsafe9.putInt(t9, i38, i39);
        }
        if (i19 == i37) {
            return i19;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList2, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList2, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufList2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        decodeVarint32List = ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList2, registers);
                    }
                    return i;
                }
                decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList2, registers);
                SchemaUtil.filterUnknownEnumList((Object) t, i4, (List<Integer>) protobufList2, getEnumFieldVerifier(i6), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList2, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (i5 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList2, registers);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder a = androidx.appcompat.view.a.a("Field ", str, " for ");
            a.append(cls.getName());
            a.append(" not found. Known fields are ");
            a.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a.toString());
        }
    }

    private void setFieldPresent(T t, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t, j));
    }

    private void setOneofPresent(T t, int i, int i2) {
        UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int objectFieldOffset;
        int id2;
        long objectFieldOffset2;
        int i2;
        int i3;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            id2 = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                i2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                i3 = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                i2 = 0;
                i3 = 0;
            } else {
                objectFieldOffset2 = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i] = fieldInfo.getFieldNumber();
            iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id2 << 20) | objectFieldOffset;
            iArr[i + 2] = i2 | (i3 << 20);
            Class<?> messageFieldClass = fieldInfo.getMessageFieldClass();
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
        id2 = fieldInfo.getType().id() + 51;
        objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        objectFieldOffset2 = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        i2 = (int) objectFieldOffset2;
        i3 = 0;
        iArr[i] = fieldInfo.getFieldNumber();
        if (!fieldInfo.isEnforceUtf8()) {
        }
        iArr[i + 1] = (fieldInfo.isRequired() ? 268435456 : 0) | (!fieldInfo.isEnforceUtf8() ? 536870912 : 0) | (id2 << 20) | objectFieldOffset;
        iArr[i + 2] = i2 | (i3 << 20);
        Class<?> messageFieldClass2 = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
        }
    }

    private void storeMessageField(T t, int i, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    private void storeOneofMessageField(T t, int i, int i2, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrderProto2(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        int i2;
        if (this.hasExtensions) {
            FieldSet<?> extensions = this.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i5 = this.buffer[i + 2];
                        int i6 = i5 & 1048575;
                        if (i6 != i3) {
                            i4 = unsafe.getInt(t, i6);
                            i3 = i6;
                        }
                        i2 = 1 << (i5 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.extensionSchema.extensionNumber(entry) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            if ((i2 & i4) == 0) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(t, offset));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                writer.writeFloat(numberAt, floatAt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                writer.writeInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                writer.writeUInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                writer.writeInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                writer.writeFixed64(numberAt, unsafe.getLong(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                writer.writeFixed32(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                writer.writeBool(numberAt, booleanAt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                writeString(numberAt, unsafe.getObject(t, offset), writer);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                writer.writeUInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                writer.writeEnum(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                writer.writeSFixed32(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                writer.writeSFixed64(numberAt, unsafe.getLong(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                writer.writeSInt32(numberAt, unsafe.getInt(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                writer.writeSInt64(numberAt, unsafe.getLong(t, offset));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(i), (List) unsafe.getObject(t, offset), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(i), (List) unsafe.getObject(t, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(i), (List) unsafe.getObject(t, offset), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            continue;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(t, offset), writer, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            SchemaUtil.writeGroupList(numberAt(i), (List) unsafe.getObject(t, offset), writer, getMessageFieldSchema(i));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, unsafe.getObject(t, offset), i);
                            break;
                        case 51:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t, offset));
                                break;
                            }
                            break;
                        case 52:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t, offset));
                                break;
                            }
                            break;
                        case 53:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(t, offset));
                                break;
                            }
                            break;
                        case 54:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t, offset));
                                break;
                            }
                            break;
                        case 55:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 56:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t, offset));
                                break;
                            }
                            break;
                        case 57:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 58:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t, offset));
                                break;
                            }
                            break;
                        case 59:
                            if (isOneofPresent(t, numberAt, i)) {
                                writeString(numberAt, unsafe.getObject(t, offset), writer);
                                break;
                            }
                            break;
                        case 60:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                        case 61:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t, offset));
                                break;
                            }
                            break;
                        case 62:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 63:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 64:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 65:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t, offset));
                                break;
                            }
                            break;
                        case 66:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t, offset));
                                break;
                            }
                            break;
                        case 67:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t, offset));
                                break;
                            }
                            break;
                        case 68:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), getMessageFieldSchema(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrderProto3(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        if (this.hasExtensions) {
            FieldSet<?> extensions = this.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
                length = this.buffer.length;
                for (i = 0; i < length; i += 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(t, i)) {
                                writer.writeDouble(numberAt, doubleAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(t, i)) {
                                writer.writeFloat(numberAt, floatAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(t, i)) {
                                writer.writeInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(t, i)) {
                                writer.writeUInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(t, i)) {
                                writer.writeInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(t, i)) {
                                writer.writeFixed64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(t, i)) {
                                writer.writeFixed32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(t, i)) {
                                writer.writeBool(numberAt, booleanAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(t, i)) {
                                writeString(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(t, i)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(t, i)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(t, i)) {
                                writer.writeUInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(t, i)) {
                                writer.writeEnum(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(t, i)) {
                                writer.writeSFixed32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(t, i)) {
                                writer.writeSFixed64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(t, i)) {
                                writer.writeSInt32(numberAt, intAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(t, i)) {
                                writer.writeSInt64(numberAt, longAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(t, i)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(i));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            SchemaUtil.writeGroupList(numberAt(i), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(i));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), i);
                            break;
                        case 51:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(t, numberAt, i)) {
                                writeString(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(t, numberAt, i)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
            }
        }
        it = null;
        entry = null;
        length = this.buffer.length;
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
    private void writeFieldsInDescendingOrder(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
        if (this.hasExtensions) {
            FieldSet<?> extensions = this.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                it = extensions.descendingIterator();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
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
                                writeString(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(t, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(t, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
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
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), length);
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
                                writeString(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(t, numberAt, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(t, offset(typeAndOffsetAt)));
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
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(t, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
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

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public boolean equals(T t, T t2) {
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

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public int getSerializedSize(T t) {
        return this.proto3 ? getSerializedSizeProto3(t) : getSerializedSizeProto2(t);
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public int hashCode(T t) {
        int i;
        int hashLong;
        int i2;
        int i3;
        int length = this.buffer.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i5);
            int numberAt = numberAt(i5);
            long offset = offset(typeAndOffsetAt);
            int i6 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)));
                    i4 = hashLong + i;
                    break;
                case 1:
                    i = i4 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t, offset));
                    i4 = hashLong + i;
                    break;
                case 2:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 3:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 4:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 5:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 6:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 7:
                    i = i4 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t, offset));
                    i4 = hashLong + i;
                    break;
                case 8:
                    i = i4 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                    i4 = hashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t, offset);
                    if (object != null) {
                        i6 = object.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 10:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 11:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 12:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 13:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 14:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 15:
                    i2 = i4 * 53;
                    i3 = UnsafeUtil.getInt(t, offset);
                    i4 = i2 + i3;
                    break;
                case 16:
                    i = i4 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t, offset));
                    i4 = hashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t, offset);
                    if (object2 != null) {
                        i6 = object2.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 50:
                    i = i4 * 53;
                    hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                    i4 = hashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, offset)));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t, offset)).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i2 = i4 * 53;
                        i3 = oneofIntAt(t, offset);
                        i4 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t, offset));
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t, numberAt, i5)) {
                        i = i4 * 53;
                        hashLong = UnsafeUtil.getObject(t, offset).hashCode();
                        i4 = hashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(t).hashCode() + (i4 * 53);
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : hashCode;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.checkInitializedCount) {
            int i6 = this.intArray[i4];
            int numberAt = numberAt(i6);
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = UNSAFE.getInt(t, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            T t2 = t;
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t2, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t2, numberAt, i6) && !isInitialized(t2, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t2, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t2, typeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (isFieldPresent(t2, i6, i, i2, i9) && !isInitialized(t2, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                return false;
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.appwidget.protobuf.Schema
    public void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
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
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            this.listFieldSchema.makeImmutableListAt(t, offset);
                            break;
                        case 50:
                            Unsafe unsafe = UNSAFE;
                            Object object = unsafe.getObject(t, offset);
                            if (object != null) {
                                unsafe.putObject(t, offset, this.mapFieldSchema.toImmutable(object));
                                break;
                            } else {
                                break;
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

    @Override // androidx.glance.appwidget.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ff  */
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseProto2Message(T t, byte[] bArr, int i, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        T t2;
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        MessageSchema<T> messageSchema;
        int i7;
        int i8;
        ArrayDecoders.Registers registers2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        T t3;
        int decodeUnknownField;
        int i16;
        int i17;
        Unsafe unsafe2;
        int i18;
        ArrayDecoders.Registers registers3;
        byte[] bArr2;
        Unsafe unsafe3;
        ArrayDecoders.Registers registers4;
        T t4;
        Unsafe unsafe4;
        int i19;
        int decodeVarint64;
        byte[] bArr3;
        ArrayDecoders.Registers registers5;
        int i20;
        T t5;
        int decodeBytes;
        byte[] bArr4;
        int i21;
        int i22;
        MessageSchema<T> messageSchema2 = this;
        T t6 = t;
        byte[] bArr5 = bArr;
        int i23 = i2;
        ArrayDecoders.Registers registers6 = registers;
        checkMutable(t6);
        Unsafe unsafe5 = UNSAFE;
        int i24 = -1;
        int i25 = i;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                int i32 = bArr5[i25];
                if (i32 < 0) {
                    i31 = ArrayDecoders.decodeVarint32(i32, bArr5, i31, registers6);
                    i32 = registers6.int1;
                }
                int i33 = i31;
                i29 = i32;
                int i34 = i29 >>> 3;
                int i35 = i29 & 7;
                int positionForFieldNumber = i34 > i26 ? messageSchema2.positionForFieldNumber(i34, i27 / 3) : messageSchema2.positionForFieldNumber(i34);
                if (positionForFieldNumber == i24) {
                    registers2 = registers;
                    i9 = i33;
                    unsafe = unsafe5;
                    i10 = i24;
                    i11 = i28;
                    i12 = i34;
                    i13 = 0;
                    i5 = 1048575;
                    i6 = i3;
                    i14 = i30;
                    messageSchema = messageSchema2;
                } else {
                    int i36 = messageSchema2.buffer[positionForFieldNumber + 1];
                    int i37 = i24;
                    int type = type(i36);
                    long offset = offset(i36);
                    if (type <= 17) {
                        int i38 = messageSchema2.buffer[positionForFieldNumber + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        i12 = i34;
                        if (i40 != i30) {
                            if (i30 != 1048575) {
                                unsafe5.putInt(t6, i30, i28);
                            }
                            i28 = unsafe5.getInt(t6, i40);
                        } else {
                            i40 = i30;
                        }
                        switch (type) {
                            case 0:
                                bArr4 = bArr;
                                i17 = positionForFieldNumber;
                                i18 = i33;
                                unsafe4 = unsafe5;
                                registers3 = registers;
                                if (i35 == 1) {
                                    UnsafeUtil.putDouble(t6, offset, ArrayDecoders.decodeDouble(bArr4, i18));
                                    i21 = i18 + 8;
                                    i28 |= i39;
                                    i23 = i2;
                                    registers6 = registers3;
                                    i30 = i40;
                                    i27 = i17;
                                    i26 = i12;
                                    unsafe5 = unsafe4;
                                    i25 = i21;
                                    bArr5 = bArr4;
                                    i24 = i37;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6 && i6 != 0) {
                                        t2 = t;
                                        i4 = i2;
                                        i29 = i15;
                                        i7 = i9;
                                        i8 = i14;
                                        i28 = i11;
                                        break;
                                    } else {
                                        if (messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) {
                                            t3 = t;
                                            decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                            i16 = i2;
                                        } else {
                                            decodeUnknownField = ArrayDecoders.decodeExtensionOrUnknownField(i15, bArr, i9, i2, t, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers);
                                            t3 = t;
                                            i16 = i2;
                                        }
                                        i25 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i29 = i15;
                                        t6 = t3;
                                        i23 = i16;
                                        messageSchema2 = messageSchema;
                                        i27 = i13;
                                        i30 = i14;
                                        i28 = i11;
                                        unsafe5 = unsafe;
                                        i24 = i10;
                                        i26 = i12;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                            case 1:
                                bArr4 = bArr;
                                i17 = positionForFieldNumber;
                                i18 = i33;
                                unsafe4 = unsafe5;
                                registers3 = registers;
                                if (i35 == 5) {
                                    UnsafeUtil.putFloat(t6, offset, ArrayDecoders.decodeFloat(bArr4, i18));
                                    i21 = i18 + 4;
                                    i28 |= i39;
                                    i23 = i2;
                                    registers6 = registers3;
                                    i30 = i40;
                                    i27 = i17;
                                    i26 = i12;
                                    unsafe5 = unsafe4;
                                    i25 = i21;
                                    bArr5 = bArr4;
                                    i24 = i37;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                        break;
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                i17 = positionForFieldNumber;
                                unsafe2 = unsafe5;
                                i18 = i33;
                                registers3 = registers;
                                if (i35 == 0) {
                                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i18, registers3);
                                    T t7 = t6;
                                    unsafe2.putLong(t7, offset, registers3.long1);
                                    t6 = t7;
                                    i28 |= i39;
                                    unsafe5 = unsafe2;
                                    i25 = decodeVarint642;
                                    registers6 = registers3;
                                    i23 = i2;
                                    i30 = i40;
                                    bArr5 = bArr;
                                    i27 = i17;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr4 = bArr;
                                i17 = positionForFieldNumber;
                                unsafe2 = unsafe5;
                                i18 = i33;
                                registers3 = registers;
                                if (i35 == 0) {
                                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr4, i18, registers3);
                                    unsafe2.putInt(t6, offset, registers3.int1);
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeVarint32;
                                    registers6 = registers3;
                                    i30 = i40;
                                    i27 = i17;
                                    i26 = i12;
                                    unsafe5 = unsafe2;
                                    bArr5 = bArr4;
                                    i24 = i37;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr4 = bArr;
                                i17 = positionForFieldNumber;
                                Unsafe unsafe6 = unsafe5;
                                T t8 = t6;
                                if (i35 == 1) {
                                    registers3 = registers;
                                    unsafe6.putLong(t8, offset, ArrayDecoders.decodeFixed64(bArr4, i33));
                                    unsafe2 = unsafe6;
                                    t6 = t8;
                                    i25 = i33 + 8;
                                    i28 |= i39;
                                    i23 = i2;
                                    registers6 = registers3;
                                    i30 = i40;
                                    i27 = i17;
                                    i26 = i12;
                                    unsafe5 = unsafe2;
                                    bArr5 = bArr4;
                                    i24 = i37;
                                    break;
                                } else {
                                    unsafe2 = unsafe6;
                                    i18 = i33;
                                    registers3 = registers;
                                    unsafe4 = unsafe2;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                registers4 = registers;
                                t4 = t6;
                                if (i35 == 5) {
                                    unsafe3.putInt(t4, offset, ArrayDecoders.decodeFixed32(bArr2, i33));
                                    i25 = i33 + 4;
                                    i28 |= i39;
                                    i23 = i2;
                                    registers6 = registers4;
                                    t6 = t4;
                                    i30 = i40;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    i18 = i33;
                                    registers3 = registers4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                i19 = i33;
                                registers4 = registers;
                                t4 = t6;
                                if (i35 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i19, registers4);
                                    UnsafeUtil.putBoolean(t4, offset, registers4.long1 != 0);
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeVarint64;
                                    registers6 = registers4;
                                    t6 = t4;
                                    i30 = i40;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    registers3 = registers4;
                                    i18 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                i19 = i33;
                                registers4 = registers;
                                t4 = t6;
                                if (i35 == 2) {
                                    decodeVarint64 = (536870912 & i36) == 0 ? ArrayDecoders.decodeString(bArr2, i19, registers4) : ArrayDecoders.decodeStringRequireUtf8(bArr2, i19, registers4);
                                    unsafe3.putObject(t4, offset, registers4.object1);
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeVarint64;
                                    registers6 = registers4;
                                    t6 = t4;
                                    i30 = i40;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    registers3 = registers4;
                                    i18 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                            case 9:
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                t4 = t6;
                                if (i35 == 2) {
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t4, i17);
                                    int mergeMessageField = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i17), bArr, i33, i2, registers);
                                    bArr2 = bArr;
                                    registers4 = registers;
                                    messageSchema2.storeMessageField(t4, i17, mutableMessageFieldForMerge);
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = mergeMessageField;
                                    registers6 = registers4;
                                    t6 = t4;
                                    i30 = i40;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    i19 = i33;
                                    registers4 = registers;
                                    unsafe4 = unsafe3;
                                    registers3 = registers4;
                                    i18 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 10:
                                bArr3 = bArr;
                                registers5 = registers;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                i20 = i33;
                                t5 = t6;
                                if (i35 == 2) {
                                    decodeBytes = ArrayDecoders.decodeBytes(bArr3, i20, registers5);
                                    unsafe3.putObject(t5, offset, registers5.object1);
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeBytes;
                                    bArr5 = bArr3;
                                    t6 = t5;
                                    i30 = i40;
                                    registers6 = registers5;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    unsafe4 = unsafe3;
                                    i18 = i20;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                registers5 = registers;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                i20 = i33;
                                t5 = t6;
                                if (i35 != 0) {
                                    registers3 = registers5;
                                    unsafe4 = unsafe3;
                                    i18 = i20;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                } else {
                                    decodeBytes = ArrayDecoders.decodeVarint32(bArr3, i20, registers5);
                                    int i41 = registers5.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i17);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i41)) {
                                        unsafe3.putInt(t5, offset, i41);
                                        i28 |= i39;
                                        i23 = i2;
                                        i25 = decodeBytes;
                                        bArr5 = bArr3;
                                        t6 = t5;
                                        i30 = i40;
                                        registers6 = registers5;
                                        i27 = i17;
                                        unsafe5 = unsafe3;
                                        i24 = i37;
                                        i26 = i12;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t5).storeField(i29, Long.valueOf(i41));
                                        i23 = i2;
                                        i25 = decodeBytes;
                                        bArr5 = bArr3;
                                        t6 = t5;
                                        i30 = i40;
                                        registers6 = registers5;
                                        i27 = i17;
                                        unsafe5 = unsafe3;
                                        i24 = i37;
                                        i26 = i12;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                registers5 = registers;
                                i17 = positionForFieldNumber;
                                unsafe3 = unsafe5;
                                i20 = i33;
                                t5 = t6;
                                if (i35 == 0) {
                                    decodeBytes = ArrayDecoders.decodeVarint32(bArr3, i20, registers5);
                                    unsafe3.putInt(t5, offset, CodedInputStream.decodeZigZag32(registers5.int1));
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeBytes;
                                    bArr5 = bArr3;
                                    t6 = t5;
                                    i30 = i40;
                                    registers6 = registers5;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    unsafe4 = unsafe3;
                                    i18 = i20;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 16:
                                bArr3 = bArr;
                                registers5 = registers;
                                i17 = positionForFieldNumber;
                                if (i35 == 0) {
                                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr3, i33, registers5);
                                    T t9 = t6;
                                    Unsafe unsafe7 = unsafe5;
                                    unsafe7.putLong(t9, offset, CodedInputStream.decodeZigZag64(registers5.long1));
                                    unsafe3 = unsafe7;
                                    t5 = t9;
                                    i28 |= i39;
                                    i23 = i2;
                                    i25 = decodeVarint643;
                                    bArr5 = bArr3;
                                    t6 = t5;
                                    i30 = i40;
                                    registers6 = registers5;
                                    i27 = i17;
                                    unsafe5 = unsafe3;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    i18 = i33;
                                    unsafe4 = unsafe5;
                                    registers3 = registers5;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t6, positionForFieldNumber);
                                    i17 = positionForFieldNumber;
                                    i25 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(positionForFieldNumber), bArr, i33, i2, (i12 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t6, i17, mutableMessageFieldForMerge2);
                                    i28 |= i39;
                                    i23 = i2;
                                    bArr5 = bArr;
                                    i30 = i40;
                                    registers6 = registers;
                                    i27 = i17;
                                    i24 = i37;
                                    i26 = i12;
                                    break;
                                } else {
                                    i17 = positionForFieldNumber;
                                    unsafe4 = unsafe5;
                                    i18 = i33;
                                    registers3 = registers;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe4;
                                    registers2 = registers3;
                                    i14 = i40;
                                    i15 = i29;
                                    i9 = i18;
                                    i10 = i37;
                                    i5 = 1048575;
                                    i6 = i3;
                                    i11 = i28;
                                    i13 = i17;
                                    if (i15 != i6) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                    i16 = i2;
                                    i25 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i29 = i15;
                                    t6 = t3;
                                    i23 = i16;
                                    messageSchema2 = messageSchema;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            default:
                                i17 = positionForFieldNumber;
                                unsafe4 = unsafe5;
                                i18 = i33;
                                registers3 = registers;
                                messageSchema = messageSchema2;
                                unsafe = unsafe4;
                                registers2 = registers3;
                                i14 = i40;
                                i15 = i29;
                                i9 = i18;
                                i10 = i37;
                                i5 = 1048575;
                                i6 = i3;
                                i11 = i28;
                                i13 = i17;
                                if (i15 != i6) {
                                }
                                if (messageSchema.hasExtensions) {
                                }
                                t3 = t;
                                decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                i16 = i2;
                                i25 = decodeUnknownField;
                                bArr5 = bArr;
                                i29 = i15;
                                t6 = t3;
                                i23 = i16;
                                messageSchema2 = messageSchema;
                                i27 = i13;
                                i30 = i14;
                                i28 = i11;
                                unsafe5 = unsafe;
                                i24 = i10;
                                i26 = i12;
                                registers6 = registers;
                                break;
                        }
                    } else {
                        i12 = i34;
                        int i42 = positionForFieldNumber;
                        Unsafe unsafe8 = unsafe5;
                        if (type != 27) {
                            i22 = i33;
                            if (type <= 49) {
                                i14 = i30;
                                unsafe = unsafe8;
                                i10 = i37;
                                i5 = 1048575;
                                i11 = i28;
                                int parseRepeatedField = messageSchema2.parseRepeatedField(t, bArr, i22, i2, i29, i12, i35, i42, i36, type, offset, registers);
                                i29 = i29;
                                i13 = i42;
                                if (parseRepeatedField != i22) {
                                    messageSchema2 = this;
                                    t6 = t;
                                    bArr5 = bArr;
                                    i23 = i2;
                                    i25 = parseRepeatedField;
                                    i27 = i13;
                                    i30 = i14;
                                    i28 = i11;
                                    unsafe5 = unsafe;
                                    i24 = i10;
                                    i26 = i12;
                                    registers6 = registers;
                                } else {
                                    messageSchema = this;
                                    i6 = i3;
                                    registers2 = registers;
                                    i9 = parseRepeatedField;
                                }
                            } else {
                                i29 = i29;
                                i14 = i30;
                                unsafe = unsafe8;
                                i10 = i37;
                                i5 = 1048575;
                                i11 = i28;
                                i13 = i42;
                                if (type != 50) {
                                    int parseOneofField = parseOneofField(t, bArr, i22, i2, i29, i12, i35, i36, type, offset, i13, registers);
                                    messageSchema = this;
                                    i15 = i29;
                                    registers2 = registers;
                                    if (parseOneofField != i22) {
                                        t6 = t;
                                        bArr5 = bArr;
                                        i23 = i2;
                                        i29 = i15;
                                        i25 = parseOneofField;
                                        messageSchema2 = messageSchema;
                                        i27 = i13;
                                        i30 = i14;
                                        i28 = i11;
                                        unsafe5 = unsafe;
                                        i24 = i10;
                                        registers6 = registers2;
                                    } else {
                                        i6 = i3;
                                        i9 = parseOneofField;
                                        if (i15 != i6) {
                                        }
                                        if (messageSchema.hasExtensions) {
                                        }
                                        t3 = t;
                                        decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                                        i16 = i2;
                                        i25 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i29 = i15;
                                        t6 = t3;
                                        i23 = i16;
                                        messageSchema2 = messageSchema;
                                        i27 = i13;
                                        i30 = i14;
                                        i28 = i11;
                                        unsafe5 = unsafe;
                                        i24 = i10;
                                        i26 = i12;
                                        registers6 = registers;
                                    }
                                } else if (i35 == 2) {
                                    int parseMapField = parseMapField(t, bArr, i22, i2, i13, offset, registers);
                                    if (parseMapField != i22) {
                                        messageSchema2 = this;
                                        t6 = t;
                                        bArr5 = bArr;
                                        i23 = i2;
                                        registers6 = registers;
                                        i25 = parseMapField;
                                        i27 = i13;
                                        i30 = i14;
                                        i28 = i11;
                                        unsafe5 = unsafe;
                                        i24 = i10;
                                    } else {
                                        messageSchema = this;
                                        i6 = i3;
                                        registers2 = registers;
                                        i9 = parseMapField;
                                    }
                                }
                                i26 = i12;
                            }
                        } else if (i35 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe8.getObject(t6, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe8.putObject(t6, offset, protobufList);
                            }
                            i23 = i2;
                            registers6 = registers;
                            i25 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i42), i29, bArr, i33, i2, protobufList, registers);
                            i27 = i42;
                            unsafe5 = unsafe8;
                            i24 = i37;
                            i26 = i12;
                            t6 = t;
                            bArr5 = bArr;
                        } else {
                            i22 = i33;
                            i14 = i30;
                            unsafe = unsafe8;
                            i10 = i37;
                            i5 = 1048575;
                            i11 = i28;
                            i13 = i42;
                        }
                        messageSchema = this;
                        i6 = i3;
                        registers2 = registers;
                        i9 = i22;
                    }
                }
                i15 = i29;
                if (i15 != i6) {
                }
                if (messageSchema.hasExtensions) {
                }
                t3 = t;
                decodeUnknownField = ArrayDecoders.decodeUnknownField(i15, bArr, i9, i2, getMutableUnknownFields(t3), registers);
                i16 = i2;
                i25 = decodeUnknownField;
                bArr5 = bArr;
                i29 = i15;
                t6 = t3;
                i23 = i16;
                messageSchema2 = messageSchema;
                i27 = i13;
                i30 = i14;
                i28 = i11;
                unsafe5 = unsafe;
                i24 = i10;
                i26 = i12;
                registers6 = registers;
            } else {
                t2 = t6;
                i4 = i23;
                int i43 = i30;
                unsafe = unsafe5;
                i5 = 1048575;
                i6 = i3;
                messageSchema = messageSchema2;
                i7 = i25;
                i8 = i43;
            }
        }
        if (i8 != i5) {
            unsafe.putInt(t2, i8, i28);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i44 = messageSchema.checkInitializedCount; i44 < messageSchema.repeatedFieldOffsetStart; i44++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t2, messageSchema.intArray[i44], unknownFieldSetLite, messageSchema.unknownFieldSchema, t);
        }
        T t10 = t2;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (unknownFieldSetLite != null) {
            messageSchema3.unknownFieldSchema.setBuilderToMessage(t10, unknownFieldSetLite);
        }
        if (i6 == 0) {
            if (i7 != i4) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i7 > i4 || i29 != i6) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i7;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t, writer);
        }
    }

    private boolean isFieldPresent(T t, int i) {
        boolean equals;
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(t, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t, offset);
                if (object instanceof String) {
                    equals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    equals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return UnsafeUtil.getObject(t, offset) != null;
            case 10:
                equals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t, offset));
                break;
            case 11:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    private boolean equals(T t, T t2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t, t2, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(t, offset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t2, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t, t2, i) || Float.floatToIntBits(UnsafeUtil.getFloat(t, offset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t2, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getBoolean(t, offset) != UnsafeUtil.getBoolean(t2, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getInt(t, offset) != UnsafeUtil.getInt(t2, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t, t2, i) || UnsafeUtil.getLong(t, offset) != UnsafeUtil.getLong(t2, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
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
                if (!isOneofCaseEqual(t, t2, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t, offset), UnsafeUtil.getObject(t2, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
        if (this.proto3) {
            parseProto3Message(t, bArr, i, i2, registers);
        } else {
            parseProto2Message(t, bArr, i, i2, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
