package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
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
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
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

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
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

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
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
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
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
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r18, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r19, T r20, androidx.datastore.preferences.protobuf.Reader r21, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
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
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.reflect.Field reflectField;
        char charAt10;
        int i26;
        int i27;
        Object obj;
        java.lang.reflect.Field reflectField2;
        Object obj2;
        java.lang.reflect.Field reflectField3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (stringInfo.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = stringInfo.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt14 = stringInfo.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i31;
        }
        if (charAt15 == 0) {
            i4 = 0;
            charAt = 0;
            i3 = 0;
            i7 = 0;
            i2 = 0;
            i6 = 0;
            iArr = EMPTY_INT_ARRAY;
            i5 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = stringInfo.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    charAt9 = stringInfo.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int charAt17 = stringInfo.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt8 = stringInfo.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = stringInfo.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt7 = stringInfo.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = stringInfo.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt6 = stringInfo.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = stringInfo.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt5 = stringInfo.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt20 = stringInfo.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt4 = stringInfo.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int charAt21 = stringInfo.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt3 = stringInfo.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = stringInfo.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt2 = stringInfo.charAt(i57);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt2 << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            i2 = (charAt16 * 2) + charAt17;
            int i60 = charAt20;
            i3 = charAt18;
            i4 = i60;
            i5 = charAt16;
            iArr = iArr2;
            i6 = charAt22;
            i33 = i57;
            i7 = charAt19;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i61 = i6 + i4;
        int i62 = i61;
        int i63 = i6;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt23 = stringInfo.charAt(i33);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    charAt13 = stringInfo.charAt(i68);
                    if (charAt13 < c) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                charAt23 = i67 | (charAt13 << i69);
                i16 = i30;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int charAt24 = stringInfo.charAt(i16);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt12 = stringInfo.charAt(i72);
                    if (charAt12 < c) {
                        break;
                    }
                    i71 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                }
                charAt24 = i71 | (charAt12 << i73);
                i17 = i29;
            } else {
                i17 = i70;
            }
            int i74 = charAt24 & 255;
            int i75 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i17 + 1;
                int charAt25 = stringInfo.charAt(i17);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i28 = i76 + 1;
                        charAt11 = stringInfo.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i28;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i28;
                }
                int i79 = i74 - 51;
                int i80 = i76;
                if (i79 == 9 || i79 == 17) {
                    i27 = i2 + 1;
                    objArr[((i65 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i79 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0)) {
                        i27 = i2 + 1;
                        objArr[((i65 / 3) * 2) + 1] = objects[i2];
                    }
                    int i81 = charAt25 * 2;
                    obj = objects[i81];
                    if (obj instanceof java.lang.reflect.Field) {
                        reflectField2 = reflectField(cls, (String) obj);
                        objects[i81] = reflectField2;
                    } else {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i82 = i81 + 1;
                    obj2 = objects[i82];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        reflectField3 = reflectField(cls, (String) obj2);
                        objects[i82] = reflectField3;
                    } else {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    }
                    i20 = i2;
                    i23 = 0;
                    str = stringInfo;
                    i24 = (int) unsafe.objectFieldOffset(reflectField3);
                    i25 = objectFieldOffset2;
                    i18 = charAt23;
                    i33 = i80;
                }
                i2 = i27;
                int i812 = charAt25 * 2;
                obj = objects[i812];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(reflectField2);
                int i822 = i812 + 1;
                obj2 = objects[i822];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i20 = i2;
                i23 = 0;
                str = stringInfo;
                i24 = (int) unsafe.objectFieldOffset(reflectField3);
                i25 = objectFieldOffset22;
                i18 = charAt23;
                i33 = i80;
            } else {
                int i83 = i2 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (String) objects[i2]);
                if (i74 == 9 || i74 == 17) {
                    i18 = charAt23;
                    objArr[((i65 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = charAt23;
                        i26 = i2 + 2;
                        objArr[((i65 / 3) * 2) + 1] = objects[i83];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = charAt23;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i26 = i2 + 2;
                            objArr[((i65 / 3) * 2) + 1] = objects[i83];
                        }
                    } else if (i74 == 50) {
                        int i84 = i63 + 1;
                        iArr[i63] = i65;
                        int i85 = (i65 / 3) * 2;
                        int i86 = i2 + 2;
                        objArr[i85] = objects[i83];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i2 + 3;
                            objArr[i85 + 1] = objects[i86];
                            i18 = charAt23;
                            i63 = i84;
                        } else {
                            i19 = i86;
                            i63 = i84;
                            i18 = charAt23;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            str = stringInfo;
                            i20 = i19;
                            i21 = 1048575;
                            i22 = i17;
                            i23 = 0;
                        } else {
                            int i87 = i17 + 1;
                            int charAt26 = stringInfo.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i88 = charAt26 & 8191;
                                int i89 = 13;
                                while (true) {
                                    i22 = i87 + 1;
                                    charAt10 = stringInfo.charAt(i87);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i88 |= (charAt10 & 8191) << i89;
                                    i89 += 13;
                                    i87 = i22;
                                }
                                charAt26 = i88 | (charAt10 << i89);
                            } else {
                                i22 = i87;
                            }
                            int i90 = (charAt26 / 32) + (i5 * 2);
                            Object obj3 = objects[i90];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                reflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                reflectField = reflectField(cls, (String) obj3);
                                objects[i90] = reflectField;
                            }
                            str = stringInfo;
                            i20 = i19;
                            i21 = (int) unsafe.objectFieldOffset(reflectField);
                            i23 = charAt26 % 32;
                        }
                        int i91 = i21;
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i62] = objectFieldOffset;
                            i62++;
                        }
                        i24 = i91;
                        i25 = objectFieldOffset;
                        i33 = i22;
                    } else {
                        i18 = charAt23;
                    }
                    i19 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = stringInfo;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i17;
                    i23 = 0;
                    int i912 = i21;
                    if (i74 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                    i24 = i912;
                    i25 = objectFieldOffset;
                    i33 = i22;
                }
                i19 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) != 0) {
                }
                str = stringInfo;
                i20 = i19;
                i21 = 1048575;
                i22 = i17;
                i23 = 0;
                int i9122 = i21;
                if (i74 >= 18) {
                }
                i24 = i9122;
                i25 = objectFieldOffset;
                i33 = i22;
            }
            int i92 = i65 + 1;
            iArr4[i65] = i18;
            int i93 = i65 + 2;
            int i94 = i24;
            iArr4[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i25;
            i65 += 3;
            iArr4[i93] = (i23 << 20) | i94;
            stringInfo = str;
            i2 = i20;
            length = i75;
            iArr3 = iArr4;
            c = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i3, i7, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i6, i61, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(T t, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        boolean z;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<?> extensions = messageSchema.extensionSchema.getExtensions(t);
            if (!extensions.isEmpty()) {
                Iterator<Map.Entry<?, Object>> it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
                length = messageSchema.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < length) {
                    int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i);
                    int numberAt = messageSchema.numberAt(i);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i7 = messageSchema.buffer[i + 2];
                        z = true;
                        int i8 = i7 & 1048575;
                        if (i8 != i5) {
                            i6 = i8 == 1048575 ? 0 : unsafe.getInt(t, i8);
                            i5 = i8;
                        }
                        int i9 = 1 << (i7 >>> 20);
                        entry2 = entry;
                        i2 = i5;
                        i3 = i6;
                        i4 = i9;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i5;
                        i3 = i6;
                        i4 = 0;
                    }
                    while (entry2 != null && messageSchema.extensionSchema.extensionNumber(entry2) <= numberAt) {
                        messageSchema.extensionSchema.serializeExtension(writer, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            if (!messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(t, offset));
                                break;
                            }
                        case 1:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeFloat(numberAt, floatAt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 2:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeInt64(numberAt, unsafe.getLong(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 3:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeUInt64(numberAt, unsafe.getLong(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 4:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeInt32(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 5:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeFixed64(numberAt, unsafe.getLong(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 6:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeFixed32(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 7:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeBool(numberAt, booleanAt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 8:
                            if (!messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                break;
                            } else {
                                messageSchema.writeString(numberAt, unsafe.getObject(t, offset), writer);
                                break;
                            }
                        case 9:
                            if (!messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                break;
                            } else {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), messageSchema.getMessageFieldSchema(i));
                                break;
                            }
                        case 10:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 11:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeUInt32(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 12:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeEnum(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 13:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeSFixed32(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 14:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeSFixed64(numberAt, unsafe.getLong(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 15:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeSInt32(numberAt, unsafe.getInt(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 16:
                            if (messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                writer.writeSInt64(numberAt, unsafe.getLong(t, offset));
                            }
                            messageSchema = this;
                            break;
                        case 17:
                            if (!messageSchema.isFieldPresent(t, i, i2, i3, i4)) {
                                break;
                            } else {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), messageSchema.getMessageFieldSchema(i));
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, messageSchema.getMessageFieldSchema(i));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer);
                            break;
                        case 29:
                            z2 = false;
                            SchemaUtil.writeUInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 30:
                            z2 = false;
                            SchemaUtil.writeEnumList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 31:
                            z2 = false;
                            SchemaUtil.writeSFixed32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 32:
                            z2 = false;
                            SchemaUtil.writeSFixed64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 33:
                            z2 = false;
                            SchemaUtil.writeSInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 34:
                            z2 = false;
                            SchemaUtil.writeSInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, z);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            SchemaUtil.writeGroupList(messageSchema.numberAt(i), (List) unsafe.getObject(t, offset), writer, messageSchema.getMessageFieldSchema(i));
                            break;
                        case 50:
                            messageSchema.writeMapHelper(writer, numberAt, unsafe.getObject(t, offset), i);
                            break;
                        case 51:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(t, offset));
                            }
                            break;
                        case 52:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(t, offset));
                            }
                            break;
                        case 53:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(t, offset));
                            }
                            break;
                        case 54:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(t, offset));
                            }
                            break;
                        case 55:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 56:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(t, offset));
                            }
                            break;
                        case 57:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 58:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(t, offset));
                            }
                            break;
                        case 59:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                messageSchema.writeString(numberAt, unsafe.getObject(t, offset), writer);
                            }
                            break;
                        case 60:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(t, offset), messageSchema.getMessageFieldSchema(i));
                            }
                            break;
                        case 61:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(t, offset));
                            }
                            break;
                        case 62:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 63:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 64:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 65:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(t, offset));
                            }
                            break;
                        case 66:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(t, offset));
                            }
                            break;
                        case 67:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(t, offset));
                            }
                            break;
                        case 68:
                            if (messageSchema.isOneofPresent(t, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(t, offset), messageSchema.getMessageFieldSchema(i));
                            }
                            break;
                    }
                    i += 3;
                    i6 = i3;
                    i5 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    messageSchema.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t, writer);
            }
        }
        entry = null;
        it = null;
        length = messageSchema.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i52 = 1048575;
        i = 0;
        int i62 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t, writer);
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

    @Override // androidx.datastore.preferences.protobuf.Schema
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t) {
        int i;
        int computeDoubleSize;
        int computeFloatSize;
        int computeInt64Size;
        int computeSizeMessage;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t2 = t;
        Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < messageSchema.buffer.length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i3);
            int type = type(typeAndOffsetAt);
            int numberAt = messageSchema.numberAt(i3);
            int i7 = messageSchema.buffer[i3 + 2];
            int i8 = i7 & i2;
            if (type <= 17) {
                if (i8 != i6) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(t2, i8);
                    i6 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = i5;
            long offset = offset(typeAndOffsetAt);
            if (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) {
                i8 = 0;
            }
            switch (type) {
                case 0:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, offset);
                        i5 = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object)) + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 = computeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                        break;
                    }
                    messageSchema = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeInt64Size = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t2, offset));
                        i5 = computeInt64Size + i9;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i5 = i9;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t2, i3, i6, i4, i)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 18:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 19:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 20:
                    computeSizeMessage = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 21:
                    computeSizeMessage = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 22:
                    computeSizeMessage = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 23:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 24:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 25:
                    computeSizeMessage = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 26:
                    computeSizeMessage = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t2, offset));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 27:
                    computeSizeMessage = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 28:
                    computeSizeMessage = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t2, offset));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 29:
                    computeSizeMessage = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 30:
                    computeSizeMessage = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 31:
                    computeSizeMessage = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 32:
                    computeSizeMessage = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 33:
                    computeSizeMessage = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 34:
                    computeSizeMessage = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t2, offset), false);
                    i5 = i9 + computeSizeMessage;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i5 = computeUInt32SizeNoTag + computeTagSize + computeSizeFixed64ListNoTag + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    computeSizeMessage = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 50:
                    computeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t2, offset), messageSchema.getMapFieldDefaultEntry(i3));
                    i5 = i9 + computeSizeMessage;
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        Object object2 = unsafe.getObject(t2, offset);
                        i5 = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(numberAt, (String) object2)) + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeSizeMessage = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = i9 + computeSizeMessage;
                        break;
                    }
                    i5 = i9;
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t2, offset));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t2, numberAt, i3)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t2, offset), messageSchema.getMessageFieldSchema(i3));
                        i5 = computeDoubleSize + i9;
                        break;
                    }
                    i5 = i9;
                    break;
                default:
                    i5 = i9;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        int unknownFieldsSerializedSize = i5 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t2);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
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

    @Override // androidx.datastore.preferences.protobuf.Schema
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
    @Override // androidx.datastore.preferences.protobuf.Schema
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
                    if (type != 60 && type != 68) {
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
                    } else if (isOneofPresent(t, numberAt(i), i)) {
                        getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, offset));
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

    @Override // androidx.datastore.preferences.protobuf.Schema
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

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseMessage(T t, byte[] bArr, int i, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        T t2;
        int i4;
        int i5;
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayDecoders.Registers registers2;
        T t3;
        int decodeUnknownField;
        int i12;
        long j;
        ArrayDecoders.Registers registers3;
        int i13;
        Unsafe unsafe2;
        int i14;
        byte[] bArr2;
        int i15;
        Unsafe unsafe3;
        ArrayDecoders.Registers registers4;
        T t4;
        byte[] bArr3;
        int i16;
        int i17;
        byte[] bArr4;
        int i18;
        ArrayDecoders.Registers registers5;
        int i19;
        int i20;
        MessageSchema<T> messageSchema2 = this;
        T t5 = t;
        byte[] bArr5 = bArr;
        int i21 = i2;
        ArrayDecoders.Registers registers6 = registers;
        checkMutable(t5);
        Unsafe unsafe4 = UNSAFE;
        int i22 = -1;
        int i23 = i;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                int i30 = bArr5[i23];
                if (i30 < 0) {
                    i29 = ArrayDecoders.decodeVarint32(i30, bArr5, i29, registers6);
                    i30 = registers6.int1;
                }
                int i31 = i29;
                i27 = i30;
                int i32 = i27 >>> 3;
                int i33 = i27 & 7;
                int positionForFieldNumber = i32 > i24 ? messageSchema2.positionForFieldNumber(i32, i25 / 3) : messageSchema2.positionForFieldNumber(i32);
                if (positionForFieldNumber == i22) {
                    i7 = i31;
                    i5 = i28;
                    unsafe = unsafe4;
                    i8 = i22;
                    i9 = i32;
                    i10 = 0;
                    messageSchema = messageSchema2;
                    i11 = i27;
                } else {
                    int i34 = messageSchema2.buffer[positionForFieldNumber + 1];
                    int i35 = i22;
                    int type = type(i34);
                    long offset = offset(i34);
                    if (type <= 17) {
                        int i36 = messageSchema2.buffer[positionForFieldNumber + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i28) {
                            i9 = i32;
                            j = offset;
                            if (i28 != 1048575) {
                                unsafe4.putInt(t5, i28, i26);
                            }
                            i26 = i38 == 1048575 ? 0 : unsafe4.getInt(t5, i38);
                        } else {
                            j = offset;
                            i9 = i32;
                            i38 = i28;
                        }
                        switch (type) {
                            case 0:
                                registers3 = registers;
                                i13 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i14 = i31;
                                long j2 = j;
                                bArr2 = bArr;
                                if (i33 == 1) {
                                    UnsafeUtil.putDouble(t5, j2, ArrayDecoders.decodeDouble(bArr2, i14));
                                    i15 = i14 + 8;
                                    i26 |= i37;
                                    Unsafe unsafe5 = unsafe2;
                                    i23 = i15;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe5;
                                    i21 = i2;
                                    registers6 = registers3;
                                    i28 = i38;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3 && i3 != 0) {
                                        t2 = t;
                                        i4 = i2;
                                        i27 = i11;
                                        i6 = i7;
                                        break;
                                    } else {
                                        if (messageSchema.hasExtensions || registers2.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) {
                                            t3 = t;
                                            decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                            i12 = i2;
                                        } else {
                                            decodeUnknownField = ArrayDecoders.decodeExtensionOrUnknownField(i11, bArr, i7, i2, t, messageSchema.defaultInstance, messageSchema.unknownFieldSchema, registers2);
                                            t3 = t;
                                            i12 = i2;
                                        }
                                        i23 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i27 = i11;
                                        t5 = t3;
                                        i21 = i12;
                                        i25 = i10;
                                        messageSchema2 = messageSchema;
                                        i28 = i5;
                                        i22 = i8;
                                        i24 = i9;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                            case 1:
                                registers3 = registers;
                                i13 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i14 = i31;
                                long j3 = j;
                                bArr2 = bArr;
                                if (i33 == 5) {
                                    UnsafeUtil.putFloat(t5, j3, ArrayDecoders.decodeFloat(bArr2, i14));
                                    i15 = i14 + 4;
                                    i26 |= i37;
                                    Unsafe unsafe52 = unsafe2;
                                    i23 = i15;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe52;
                                    i21 = i2;
                                    registers6 = registers3;
                                    i28 = i38;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                        break;
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                registers3 = registers;
                                i13 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i14 = i31;
                                long j4 = j;
                                if (i33 == 0) {
                                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i14, registers3);
                                    T t6 = t5;
                                    unsafe3.putLong(t6, j4, registers3.long1);
                                    t5 = t6;
                                    i26 |= i37;
                                    i21 = i2;
                                    bArr5 = bArr;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    unsafe4 = unsafe3;
                                    i23 = decodeVarint64;
                                    registers6 = registers3;
                                    i28 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                registers3 = registers;
                                i13 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i14 = i31;
                                long j5 = j;
                                if (i33 == 0) {
                                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i14, registers3);
                                    unsafe3.putInt(t5, j5, registers3.int1);
                                    i26 |= i37;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr;
                                    i21 = i2;
                                    i23 = decodeVarint32;
                                    registers6 = registers3;
                                    i28 = i38;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                T t7 = t5;
                                i13 = positionForFieldNumber;
                                i14 = i31;
                                long j6 = j;
                                if (i33 == 1) {
                                    Unsafe unsafe6 = unsafe4;
                                    registers3 = registers;
                                    unsafe6.putLong(t7, j6, ArrayDecoders.decodeFixed64(bArr, i14));
                                    t5 = t7;
                                    i23 = i14 + 8;
                                    i26 |= i37;
                                    unsafe4 = unsafe6;
                                    bArr5 = bArr;
                                    i21 = i2;
                                    registers6 = registers3;
                                    i28 = i38;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    registers3 = registers;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                registers4 = registers;
                                t4 = t5;
                                i13 = positionForFieldNumber;
                                i14 = i31;
                                long j7 = j;
                                bArr3 = bArr;
                                if (i33 == 5) {
                                    unsafe4.putInt(t4, j7, ArrayDecoders.decodeFixed32(bArr3, i14));
                                    i16 = i14 + 4;
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers4;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    i23 = i16;
                                    bArr5 = bArr3;
                                    t5 = t4;
                                    i28 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 7:
                                registers4 = registers;
                                t4 = t5;
                                i13 = positionForFieldNumber;
                                i17 = i31;
                                long j8 = j;
                                bArr3 = bArr;
                                if (i33 == 0) {
                                    i16 = ArrayDecoders.decodeVarint64(bArr3, i17, registers4);
                                    UnsafeUtil.putBoolean(t4, j8, registers4.long1 != 0);
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers4;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    i23 = i16;
                                    bArr5 = bArr3;
                                    t5 = t4;
                                    i28 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i14 = i17;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 8:
                                registers4 = registers;
                                t4 = t5;
                                i13 = positionForFieldNumber;
                                i17 = i31;
                                long j9 = j;
                                bArr3 = bArr;
                                if (i33 == 2) {
                                    i16 = isEnforceUtf8(i34) ? ArrayDecoders.decodeStringRequireUtf8(bArr3, i17, registers4) : ArrayDecoders.decodeString(bArr3, i17, registers4);
                                    unsafe4.putObject(t4, j9, registers4.object1);
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers4;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    i23 = i16;
                                    bArr5 = bArr3;
                                    t5 = t4;
                                    i28 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i14 = i17;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 9:
                                i13 = positionForFieldNumber;
                                Unsafe unsafe7 = unsafe4;
                                if (i33 == 2) {
                                    T t8 = t5;
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t8, i13);
                                    t4 = t8;
                                    unsafe4 = unsafe7;
                                    i16 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i13), bArr, i31, i2, registers);
                                    bArr3 = bArr;
                                    registers4 = registers;
                                    messageSchema2.storeMessageField(t4, i13, mutableMessageFieldForMerge);
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers4;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    i23 = i16;
                                    bArr5 = bArr3;
                                    t5 = t4;
                                    i28 = i38;
                                    break;
                                } else {
                                    t4 = t5;
                                    bArr3 = bArr;
                                    unsafe4 = unsafe7;
                                    i17 = i31;
                                    registers4 = registers;
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i14 = i17;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i13 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i18 = i31;
                                long j10 = j;
                                registers5 = registers;
                                if (i33 == 2) {
                                    i23 = ArrayDecoders.decodeBytes(bArr4, i18, registers5);
                                    unsafe3.putObject(t5, j10, registers5.object1);
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers5;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i28 = i38;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i14 = i18;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i13 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i18 = i31;
                                long j11 = j;
                                registers5 = registers;
                                if (i33 != 0) {
                                    registers3 = registers5;
                                    i14 = i18;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                } else {
                                    i23 = ArrayDecoders.decodeVarint32(bArr4, i18, registers5);
                                    int i39 = registers5.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i13);
                                    if (!isLegacyEnumIsClosed(i34) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i39)) {
                                        unsafe3.putInt(t5, j11, i39);
                                        i26 |= i37;
                                        i21 = i2;
                                        registers6 = registers5;
                                        i25 = i13;
                                        i22 = i35;
                                        i24 = i9;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i28 = i38;
                                        break;
                                    } else {
                                        getMutableUnknownFields(t5).storeField(i27, Long.valueOf(i39));
                                        i21 = i2;
                                        registers6 = registers5;
                                        i25 = i13;
                                        i22 = i35;
                                        i24 = i9;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i28 = i38;
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i13 = positionForFieldNumber;
                                unsafe3 = unsafe4;
                                i18 = i31;
                                long j12 = j;
                                registers5 = registers;
                                if (i33 == 0) {
                                    i23 = ArrayDecoders.decodeVarint32(bArr4, i18, registers5);
                                    unsafe3.putInt(t5, j12, CodedInputStream.decodeZigZag32(registers5.int1));
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers5;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i28 = i38;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i14 = i18;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i13 = positionForFieldNumber;
                                i18 = i31;
                                if (i33 == 0) {
                                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr4, i18, registers);
                                    T t9 = t5;
                                    Unsafe unsafe8 = unsafe4;
                                    registers5 = registers;
                                    unsafe8.putLong(t9, j, CodedInputStream.decodeZigZag64(registers.long1));
                                    unsafe3 = unsafe8;
                                    t5 = t9;
                                    i26 |= i37;
                                    i21 = i2;
                                    i23 = decodeVarint642;
                                    registers6 = registers5;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i28 = i38;
                                    break;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    registers5 = registers;
                                    unsafe3 = unsafe9;
                                    registers3 = registers5;
                                    i14 = i18;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            case 17:
                                if (i33 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t5, positionForFieldNumber);
                                    i13 = positionForFieldNumber;
                                    i23 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(positionForFieldNumber), bArr, i31, i2, (i9 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t5, i13, mutableMessageFieldForMerge2);
                                    i26 |= i37;
                                    i21 = i2;
                                    registers6 = registers;
                                    bArr5 = bArr;
                                    i28 = i38;
                                    i25 = i13;
                                    i22 = i35;
                                    i24 = i9;
                                    break;
                                } else {
                                    i13 = positionForFieldNumber;
                                    registers3 = registers;
                                    unsafe2 = unsafe4;
                                    i14 = i31;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i5 = i38;
                                    i11 = i27;
                                    i7 = i14;
                                    i8 = i35;
                                    registers2 = registers3;
                                    i10 = i13;
                                    if (i11 != i3) {
                                    }
                                    if (messageSchema.hasExtensions) {
                                    }
                                    t3 = t;
                                    decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                    i12 = i2;
                                    i23 = decodeUnknownField;
                                    bArr5 = bArr;
                                    i27 = i11;
                                    t5 = t3;
                                    i21 = i12;
                                    i25 = i10;
                                    messageSchema2 = messageSchema;
                                    i28 = i5;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                    break;
                                }
                                break;
                            default:
                                registers3 = registers;
                                i13 = positionForFieldNumber;
                                unsafe2 = unsafe4;
                                i14 = i31;
                                messageSchema = messageSchema2;
                                unsafe = unsafe2;
                                i5 = i38;
                                i11 = i27;
                                i7 = i14;
                                i8 = i35;
                                registers2 = registers3;
                                i10 = i13;
                                if (i11 != i3) {
                                }
                                if (messageSchema.hasExtensions) {
                                }
                                t3 = t;
                                decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                i12 = i2;
                                i23 = decodeUnknownField;
                                bArr5 = bArr;
                                i27 = i11;
                                t5 = t3;
                                i21 = i12;
                                i25 = i10;
                                messageSchema2 = messageSchema;
                                i28 = i5;
                                i22 = i8;
                                i24 = i9;
                                unsafe4 = unsafe;
                                registers6 = registers;
                                break;
                        }
                    } else {
                        int i40 = i28;
                        i9 = i32;
                        i10 = positionForFieldNumber;
                        Unsafe unsafe10 = unsafe4;
                        if (type != 27) {
                            i19 = i31;
                            if (type <= 49) {
                                unsafe = unsafe10;
                                i5 = i40;
                                i8 = i35;
                                i20 = i26;
                                int parseRepeatedField = messageSchema2.parseRepeatedField(t, bArr, i19, i2, i27, i9, i33, i10, i34, type, offset, registers);
                                i27 = i27;
                                if (parseRepeatedField != i19) {
                                    messageSchema2 = this;
                                    t5 = t;
                                    bArr5 = bArr;
                                    i21 = i2;
                                    i23 = parseRepeatedField;
                                    i25 = i10;
                                    i28 = i5;
                                    i26 = i20;
                                    i22 = i8;
                                    i24 = i9;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                } else {
                                    messageSchema = this;
                                    i7 = parseRepeatedField;
                                }
                            } else {
                                i27 = i27;
                                unsafe = unsafe10;
                                i5 = i40;
                                i8 = i35;
                                i20 = i26;
                                if (type != 50) {
                                    registers2 = registers;
                                    int parseOneofField = parseOneofField(t, bArr, i19, i2, i27, i9, i33, i34, type, offset, i10, registers2);
                                    messageSchema = this;
                                    i11 = i27;
                                    i10 = i10;
                                    if (parseOneofField != i19) {
                                        t5 = t;
                                        bArr5 = bArr;
                                        i21 = i2;
                                        i23 = parseOneofField;
                                        i25 = i10;
                                        registers6 = registers2;
                                        i28 = i5;
                                        i26 = i20;
                                        i22 = i8;
                                        i24 = i9;
                                        i27 = i11;
                                        messageSchema2 = messageSchema;
                                    } else {
                                        i7 = parseOneofField;
                                        i26 = i20;
                                        if (i11 != i3) {
                                        }
                                        if (messageSchema.hasExtensions) {
                                        }
                                        t3 = t;
                                        decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                                        i12 = i2;
                                        i23 = decodeUnknownField;
                                        bArr5 = bArr;
                                        i27 = i11;
                                        t5 = t3;
                                        i21 = i12;
                                        i25 = i10;
                                        messageSchema2 = messageSchema;
                                        i28 = i5;
                                        i22 = i8;
                                        i24 = i9;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                    }
                                } else if (i33 == 2) {
                                    int parseMapField = parseMapField(t, bArr, i19, i2, i10, offset, registers);
                                    i10 = i10;
                                    if (parseMapField != i19) {
                                        messageSchema2 = this;
                                        t5 = t;
                                        bArr5 = bArr;
                                        i21 = i2;
                                        registers6 = registers;
                                        i23 = parseMapField;
                                        i25 = i10;
                                        i28 = i5;
                                        i26 = i20;
                                        i22 = i8;
                                        i24 = i9;
                                    } else {
                                        messageSchema = this;
                                        i7 = parseMapField;
                                    }
                                } else {
                                    messageSchema = this;
                                    i7 = i19;
                                }
                                unsafe4 = unsafe;
                            }
                        } else if (i33 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe10.getObject(t5, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(t5, offset, protobufList);
                            }
                            unsafe4 = unsafe10;
                            registers6 = registers;
                            i21 = i2;
                            i23 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i10), i27, bArr, i31, i2, protobufList, registers6);
                            i25 = i10;
                            i28 = i40;
                            i22 = i35;
                            i24 = i9;
                            t5 = t;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe10;
                            i5 = i40;
                            i19 = i31;
                            i8 = i35;
                            i20 = i26;
                            messageSchema = this;
                            i7 = i19;
                        }
                        i11 = i27;
                        i26 = i20;
                    }
                }
                registers2 = registers;
                if (i11 != i3) {
                }
                if (messageSchema.hasExtensions) {
                }
                t3 = t;
                decodeUnknownField = ArrayDecoders.decodeUnknownField(i11, bArr, i7, i2, getMutableUnknownFields(t3), registers);
                i12 = i2;
                i23 = decodeUnknownField;
                bArr5 = bArr;
                i27 = i11;
                t5 = t3;
                i21 = i12;
                i25 = i10;
                messageSchema2 = messageSchema;
                i28 = i5;
                i22 = i8;
                i24 = i9;
                unsafe4 = unsafe;
                registers6 = registers;
            } else {
                t2 = t5;
                i4 = i21;
                i5 = i28;
                unsafe = unsafe4;
                messageSchema = messageSchema2;
                i6 = i23;
            }
        }
        int i41 = i5;
        if (i41 != 1048575) {
            unsafe.putInt(t2, i41, i26);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i42 = messageSchema.checkInitializedCount; i42 < messageSchema.repeatedFieldOffsetStart; i42++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t2, messageSchema.intArray[i42], unknownFieldSetLite, messageSchema.unknownFieldSchema, t);
        }
        T t10 = t2;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (unknownFieldSetLite != null) {
            messageSchema3.unknownFieldSchema.setBuilderToMessage(t10, unknownFieldSetLite);
        }
        if (i3 == 0) {
            if (i6 != i4) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i6 > i4 || i27 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i6;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else {
            writeFieldsInAscendingOrder(t, writer);
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

    @Override // androidx.datastore.preferences.protobuf.Schema
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

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t, bArr, i, i2, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
