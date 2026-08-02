package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
final class FieldSet<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.FieldSet getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.protobuf.FieldSet((byte) 0);
    boolean Camera2StreamConfigurationMap;
    final kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoSizes;

    public interface FieldDescriptorLite<T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getLiteJavaType();

        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.getHighSpeedVideoSizes(16);
    }

    private FieldSet(byte b) {
        this.Camera2StreamConfigurationMap = false;
        kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> highSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.getHighSpeedVideoSizes(0);
        this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoSizes;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes = true;
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<T> Camera2StreamConfigurationMap() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<>();
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<T> getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (fielddescriptortype.isRepeated()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        } else {
            getHighResolutionOutputSizeshNQ4ISI(fielddescriptortype.getLiteType(), obj);
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            this.Camera2StreamConfigurationMap = true;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    public final void getHighSpeedVideoSizes(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        java.util.List list;
        if (!fielddescriptortype.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        getHighResolutionOutputSizeshNQ4ISI(fielddescriptortype.getLiteType(), obj);
        java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI.get(fielddescriptortype);
        if (obj2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            obj2 = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj2).getValue();
        }
        if (obj2 == null) {
            list = new java.util.ArrayList();
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) fielddescriptortype, (FieldDescriptorType) list);
        } else {
            list = (java.util.List) obj2;
        }
        list.add(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        boolean z;
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.Camera2StreamConfigurationMap[fieldType.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 3:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 4:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 5:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 6:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 9:
                if ((obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) || (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean getHighResolutionOutputSizeshNQ4ISI() {
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.size(); i++) {
            if (!getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.get(i))) {
                return false;
            }
        }
        kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> smallSortedMap = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Iterator it = (smallSortedMap.getHighSpeedVideoSizes.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighSpeedVideoSizes() : smallSortedMap.getHighSpeedVideoSizes.entrySet()).iterator();
        while (it.hasNext()) {
            if (!getHighResolutionOutputSizeshNQ4ISI((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) {
                    if (!((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    static int Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    final void Camera2StreamConfigurationMap(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            value = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) value).getValue();
        }
        if (!key.isRepeated()) {
            if (key.getLiteJavaType() != kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> smallSortedMap = this.getHighResolutionOutputSizeshNQ4ISI;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                smallSortedMap.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) value);
                return;
            }
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(key);
            if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                obj = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue();
            }
            if (obj == null) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> smallSortedMap2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                smallSortedMap2.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) value);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) key.internalMergeFrom(((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj).toBuilder(), (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) value).build());
            return;
        }
        java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI.get(key);
        if (obj2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            obj2 = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj2).getValue();
        }
        if (obj2 == null) {
            obj2 = new java.util.ArrayList();
        }
        for (java.lang.Object obj3 : (java.util.List) value) {
            java.util.List list = (java.util.List) obj2;
            if (obj3 instanceof byte[]) {
                byte[] bArr5 = (byte[]) obj3;
                byte[] bArr6 = new byte[bArr5.length];
                java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                obj3 = bArr6;
            }
            list.add(obj3);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) obj2);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                Camera2StreamConfigurationMap[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    public static java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType) throws java.io.IOException {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(codedInputStream.readDouble());
            case 2:
                return java.lang.Float.valueOf(codedInputStream.readFloat());
            case 3:
                return java.lang.Long.valueOf(codedInputStream.readInt64());
            case 4:
                return java.lang.Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return java.lang.Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return java.lang.Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return java.lang.Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return java.lang.Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return java.lang.Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return java.lang.Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return java.lang.Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return java.lang.Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            getHighSpeedVideoFpsRanges(codedOutputStream, fieldType, obj);
        }
    }

    private static void getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeStringNoTag((java.lang.String) obj);
                break;
            case 10:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                }
            case 11:
                codedOutputStream.writeUInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
                break;
            case 18:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                    break;
                }
        }
    }

    public static void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                java.util.Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += Camera2StreamConfigurationMap(liteType, it.next());
                }
                codedOutputStream.writeRawVarint32(i);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    getHighSpeedVideoFpsRanges(codedOutputStream, liteType, it2.next());
                }
                return;
            }
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                getHighResolutionOutputSizeshNQ4ISI(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            getHighResolutionOutputSizeshNQ4ISI(codedOutputStream, liteType, number, ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue());
        } else {
            getHighResolutionOutputSizeshNQ4ISI(codedOutputStream, liteType, number, obj);
        }
    }

    private static int Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
            case 1:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) obj).doubleValue());
            case 2:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) obj).floatValue());
            case 3:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 4:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 5:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 6:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 7:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 8:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
            case 10:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBytesSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj);
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 12:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 13:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 14:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 15:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 16:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeGroupSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
            case 17:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj);
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
            case 18:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSizeNoTag(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber());
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj) {
        int computeTagSize;
        int Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    i += Camera2StreamConfigurationMap(liteType, it.next());
                }
                computeTagSize = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeTagSize(number) + i;
                Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeRawVarint32Size(i);
            } else {
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    int computeTagSize2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeTagSize(number);
                    if (liteType == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
                        computeTagSize2 *= 2;
                    }
                    i += computeTagSize2 + Camera2StreamConfigurationMap(liteType, obj2);
                }
                return i;
            }
        } else {
            computeTagSize = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeTagSize(number);
            if (liteType == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
                computeTagSize *= 2;
            }
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(liteType, obj);
        }
        return computeTagSize + Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType> clone() {
        kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType> fieldSet = (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType>) new kotlin.reflect.jvm.internal.impl.protobuf.FieldSet();
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.size(); i++) {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, java.lang.Object>.Entry entry = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.get(i);
            fieldSet.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType>) entry.getKey(), entry.getValue());
        }
        kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> smallSortedMap = this.getHighResolutionOutputSizeshNQ4ISI;
        for (java.util.Map.Entry entry2 : smallSortedMap.getHighSpeedVideoSizes.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighSpeedVideoSizes() : smallSortedMap.getHighSpeedVideoSizes.entrySet()) {
            fieldSet.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType>) entry2.getKey(), entry2.getValue());
        }
        fieldSet.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        return fieldSet;
    }
}
