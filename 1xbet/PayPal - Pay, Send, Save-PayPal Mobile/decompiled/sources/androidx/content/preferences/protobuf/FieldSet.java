package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
final class FieldSet<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final androidx.content.preferences.protobuf.FieldSet<?> Camera2StreamConfigurationMap = new androidx.content.preferences.protobuf.FieldSet<>((byte) 0);
    boolean getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    public interface FieldDescriptorLite<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getEnumType();

        androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType();

        androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
        this.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.SmallSortedMap.getHighSpeedVideoFpsRangesFor();
    }

    private FieldSet(byte b) {
        this(androidx.content.preferences.protobuf.SmallSortedMap.getHighSpeedVideoFpsRangesFor());
        getOutputFormats();
    }

    private FieldSet(androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
        this.getHighSpeedVideoFpsRangesFor = smallSortedMap;
        getOutputFormats();
    }

    public static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> androidx.content.preferences.protobuf.FieldSet<T> getHighSpeedVideoFpsRangesFor() {
        return (androidx.content.preferences.protobuf.FieldSet<T>) Camera2StreamConfigurationMap;
    }

    public final void getOutputFormats() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        int size = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            androidx.content.preferences.protobuf.SmallSortedMap<K, java.lang.Object>.Entry entry = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i);
            if (entry.getValue() instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
                ((androidx.content.preferences.protobuf.GeneratedMessageLite) entry.getValue()).makeImmutable();
            }
        }
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.content.preferences.protobuf.FieldSet) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((androidx.content.preferences.protobuf.FieldSet) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final void getHighSpeedVideoSizes(T t, java.lang.Object obj) {
        if (t.isRepeated()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Camera2StreamConfigurationMap(t, it.next());
            }
            obj = arrayList;
        } else {
            Camera2StreamConfigurationMap(t, obj);
        }
        if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        this.getHighSpeedVideoFpsRangesFor.put(t, obj);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(T t, java.lang.Object obj) {
        java.util.List list;
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Camera2StreamConfigurationMap(t, obj);
        java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor.get(t);
        if (obj2 instanceof androidx.content.preferences.protobuf.LazyField) {
            obj2 = ((androidx.content.preferences.protobuf.LazyField) obj2).getValue();
        }
        if (obj2 == null) {
            list = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor.put(t, list);
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
    static void Camera2StreamConfigurationMap(T t, java.lang.Object obj) {
        boolean z;
        androidx.datastore.preferences.protobuf.WireFormat.FieldType liteType = t.getLiteType();
        androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(obj);
        switch (androidx.content.preferences.protobuf.FieldSet.AnonymousClass1.getHighSpeedVideoSizes[liteType.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                int number = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 2:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                int number2 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number2), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 3:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                int number22 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number22), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 4:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                int number222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 5:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                int number2222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number2222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 6:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                int number22222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number22222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof androidx.content.preferences.protobuf.ByteString) || (obj instanceof byte[])) {
                    return;
                }
                int number222222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number222222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite)) {
                    return;
                }
                int number2222222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number2222222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            case 9:
                if ((obj instanceof androidx.content.preferences.protobuf.MessageLite) || (obj instanceof androidx.content.preferences.protobuf.LazyField)) {
                    return;
                }
                int number22222222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number22222222), t.getLiteType().getJavaType(), obj.getClass().getName()));
            default:
                int number222222222 = t.getNumber();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number222222222), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public final boolean Camera2StreamConfigurationMap() {
        java.util.Set<java.util.Map.Entry<T, java.lang.Object>> entrySet;
        int size = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            if (!getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i))) {
                return false;
            }
        }
        androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.getHighSpeedVideoFpsRangesFor;
        if (smallSortedMap.getHighSpeedVideoSizes.isEmpty()) {
            entrySet = java.util.Collections.emptySet();
        } else {
            entrySet = smallSortedMap.getHighSpeedVideoSizes.entrySet();
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!getHighSpeedVideoFpsRangesFor((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> boolean getHighSpeedVideoFpsRangesFor(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            java.util.List list = (java.util.List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!Camera2StreamConfigurationMap(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return Camera2StreamConfigurationMap(entry.getValue());
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.Object obj) {
        if (obj instanceof androidx.content.preferences.protobuf.MessageLiteOrBuilder) {
            return ((androidx.content.preferences.protobuf.MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static int getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public final void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.FieldSet<T> fieldSet) {
        java.util.Set<java.util.Map.Entry<T, java.lang.Object>> entrySet;
        int size = fieldSet.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoSizes(fieldSet.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i));
        }
        androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = fieldSet.getHighSpeedVideoFpsRangesFor;
        if (smallSortedMap.getHighSpeedVideoSizes.isEmpty()) {
            entrySet = java.util.Collections.emptySet();
        } else {
            entrySet = smallSortedMap.getHighSpeedVideoSizes.entrySet();
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoSizes((java.util.Map.Entry) it.next());
        }
    }

    private void getHighSpeedVideoSizes(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z = value instanceof androidx.content.preferences.protobuf.LazyField;
        if (key.isRepeated()) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
            }
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(key);
            if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
            }
            if (obj == null) {
                obj = new java.util.ArrayList();
            }
            for (java.lang.Object obj2 : (java.util.List) value) {
                java.util.List list = (java.util.List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            this.getHighSpeedVideoFpsRangesFor.put(key, obj);
            return;
        }
        if (key.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.getHighSpeedVideoFpsRangesFor;
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            smallSortedMap.put(key, value);
            return;
        }
        java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor.get(key);
        if (obj3 instanceof androidx.content.preferences.protobuf.LazyField) {
            obj3 = ((androidx.content.preferences.protobuf.LazyField) obj3).getValue();
        }
        if (obj3 == null) {
            androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap2 = this.getHighSpeedVideoFpsRangesFor;
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                java.lang.System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            smallSortedMap2.put(key, value);
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((androidx.content.preferences.protobuf.LazyField) value).getValue();
        }
        this.getHighSpeedVideoFpsRangesFor.put(key, key.internalMergeFrom(((androidx.content.preferences.protobuf.MessageLite) obj3).toBuilder(), (androidx.content.preferences.protobuf.MessageLite) value).build());
    }

    public static java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, boolean z) throws java.io.IOException {
        if (z) {
            return androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(codedInputStream, fieldType, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.STRICT);
        }
        return androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(codedInputStream, fieldType, androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.LOOSE);
    }

    static void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (androidx.content.preferences.protobuf.MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            getHighSpeedVideoSizes(codedOutputStream, fieldType, obj);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[androidx.datastore.preferences.protobuf.WireFormat.JavaType.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    private static void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (androidx.content.preferences.protobuf.FieldSet.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
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
                codedOutputStream.writeGroupNoTag((androidx.content.preferences.protobuf.MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((androidx.content.preferences.protobuf.MessageLite) obj);
                break;
            case 11:
                if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((androidx.content.preferences.protobuf.ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeStringNoTag((java.lang.String) obj);
                    break;
                }
            case 12:
                if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((androidx.content.preferences.protobuf.ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((androidx.datastore.preferences.protobuf.Internal.EnumLite) obj).getNumber());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                    break;
                }
        }
    }

    public static void getHighSpeedVideoFpsRanges(androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            int i = 0;
            if (!fieldDescriptorLite.isPacked()) {
                while (i < size) {
                    getHighSpeedVideoSizes(codedOutputStream, liteType, number, list.get(i));
                    i++;
                }
                return;
            } else {
                if (list.isEmpty()) {
                    return;
                }
                codedOutputStream.writeTag(number, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += getHighSpeedVideoFpsRangesFor(liteType, list.get(i3));
                }
                codedOutputStream.writeUInt32NoTag(i2);
                while (i < size) {
                    getHighSpeedVideoSizes(codedOutputStream, liteType, list.get(i));
                    i++;
                }
                return;
            }
        }
        if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
            getHighSpeedVideoSizes(codedOutputStream, liteType, number, ((androidx.content.preferences.protobuf.LazyField) obj).getValue());
        } else {
            getHighSpeedVideoSizes(codedOutputStream, liteType, number, obj);
        }
    }

    public final int getHighSpeedVideoFpsRanges() {
        java.util.Set<java.util.Map.Entry<T, java.lang.Object>> entrySet;
        int size = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.content.preferences.protobuf.SmallSortedMap<K, java.lang.Object>.Entry entry = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2);
            i += getHighSpeedVideoFpsRanges((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.getHighSpeedVideoFpsRangesFor;
        if (smallSortedMap.getHighSpeedVideoSizes.isEmpty()) {
            entrySet = java.util.Collections.emptySet();
        } else {
            entrySet = smallSortedMap.getHighSpeedVideoSizes.entrySet();
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            i += getHighSpeedVideoFpsRanges((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    public final int getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Set<java.util.Map.Entry<T, java.lang.Object>> entrySet;
        int size = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i2));
        }
        androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.getHighSpeedVideoFpsRangesFor;
        if (smallSortedMap.getHighSpeedVideoSizes.isEmpty()) {
            entrySet = java.util.Collections.emptySet();
        } else {
            entrySet = smallSortedMap.getHighSpeedVideoSizes.entrySet();
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            i += getHighSpeedVideoFpsRanges((java.util.Map.Entry) it.next());
        }
        return i;
    }

    private static int getHighSpeedVideoFpsRanges(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof androidx.content.preferences.protobuf.LazyField) {
                return androidx.content.preferences.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (androidx.content.preferences.protobuf.LazyField) value);
            }
            return androidx.content.preferences.protobuf.CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (androidx.content.preferences.protobuf.MessageLite) value);
        }
        return getHighSpeedVideoFpsRanges(key, value);
    }

    static int Camera2StreamConfigurationMap(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) {
        int computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i);
        if (fieldType == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + getHighSpeedVideoFpsRangesFor(fieldType, obj);
    }

    private static int getHighSpeedVideoFpsRangesFor(androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (androidx.content.preferences.protobuf.FieldSet.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[fieldType.ordinal()]) {
            case 1:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) obj).doubleValue());
            case 2:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) obj).floatValue());
            case 3:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 4:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 5:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 6:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 7:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 8:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeGroupSizeNoTag((androidx.content.preferences.protobuf.MessageLite) obj);
            case 10:
                if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                    return androidx.content.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((androidx.content.preferences.protobuf.LazyField) obj);
                }
                return androidx.content.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag((androidx.content.preferences.protobuf.MessageLite) obj);
            case 11:
                if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                    return androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.content.preferences.protobuf.ByteString) obj);
                }
                return androidx.content.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
            case 12:
                if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
                    return androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag((androidx.content.preferences.protobuf.ByteString) obj);
                }
                return androidx.content.preferences.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 14:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 15:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 16:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 17:
                return androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
                    return androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(((androidx.datastore.preferences.protobuf.Internal.EnumLite) obj).getNumber());
                }
                return androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int getHighSpeedVideoFpsRanges(androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            int i = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i2 = 0;
                while (i < size) {
                    i2 += getHighSpeedVideoFpsRangesFor(liteType, list.get(i));
                    i++;
                }
                return androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(number) + i2 + androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(i2);
            }
            int i3 = 0;
            while (i < size) {
                java.lang.Object obj2 = list.get(i);
                int computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(number);
                if (liteType == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
                    computeTagSize *= 2;
                }
                i3 += computeTagSize + getHighSpeedVideoFpsRangesFor(liteType, obj2);
                i++;
            }
            return i3;
        }
        int computeTagSize2 = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(number);
        if (liteType == androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
            computeTagSize2 *= 2;
        }
        return computeTagSize2 + getHighSpeedVideoFpsRangesFor(liteType, obj);
    }

    /* loaded from: classes7.dex */
    static final class Builder<T extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        private Builder() {
            this(androidx.content.preferences.protobuf.SmallSortedMap.getHighSpeedVideoFpsRangesFor());
        }

        private Builder(androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
            this.Camera2StreamConfigurationMap = smallSortedMap;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final androidx.content.preferences.protobuf.FieldSet<T> clone() {
        java.util.Set<java.util.Map.Entry<T, java.lang.Object>> entrySet;
        androidx.content.preferences.protobuf.FieldSet<T> fieldSet = (androidx.content.preferences.protobuf.FieldSet<T>) new androidx.content.preferences.protobuf.FieldSet();
        int size = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            androidx.content.preferences.protobuf.SmallSortedMap<K, java.lang.Object>.Entry entry = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.get(i);
            fieldSet.getHighSpeedVideoSizes((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        androidx.content.preferences.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.getHighSpeedVideoFpsRangesFor;
        if (smallSortedMap.getHighSpeedVideoSizes.isEmpty()) {
            entrySet = java.util.Collections.emptySet();
        } else {
            entrySet = smallSortedMap.getHighSpeedVideoSizes.entrySet();
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            fieldSet.getHighSpeedVideoSizes((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        fieldSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        return fieldSet;
    }

    public final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> getInputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return new androidx.datastore.preferences.protobuf.LazyField.LazyIterator(this.getHighSpeedVideoFpsRangesFor.entrySet().iterator());
        }
        return this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
    }
}
