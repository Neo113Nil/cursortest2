package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class FieldSet<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final com.google.crypto.tink.shaded.protobuf.FieldSet<?> DEFAULT_INSTANCE = new com.google.crypto.tink.shaded.protobuf.FieldSet<>(true);
    private final com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public interface FieldDescriptorLite<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap smallSortedMap, com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    private FieldSet() {
        this.fields = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap();
    }

    private FieldSet(boolean z) {
        this(com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap());
        makeImmutable();
    }

    private FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> newFieldSet() {
        return new com.google.crypto.tink.shaded.protobuf.FieldSet<>();
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> emptySet() {
        return (com.google.crypto.tink.shaded.protobuf.FieldSet<T>) DEFAULT_INSTANCE;
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> newBuilder() {
        return new com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<>((com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1) null);
    }

    final boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public final void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<T, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) {
                ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public final boolean isImmutable() {
        return this.isImmutable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.FieldSet) {
            return this.fields.equals(((com.google.crypto.tink.shaded.protobuf.FieldSet) obj).fields);
        }
        return false;
    }

    public final int hashCode() {
        return this.fields.hashCode();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.google.crypto.tink.shaded.protobuf.FieldSet<T> m10408clone() {
        com.google.crypto.tink.shaded.protobuf.FieldSet<T> newFieldSet = newFieldSet();
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<T, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (java.util.Map.Entry<T, java.lang.Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField(entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    public final void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public final java.util.Map<T, java.lang.Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : java.util.Collections.unmodifiableMap(this.fields);
        }
        com.google.crypto.tink.shaded.protobuf.SmallSortedMap cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false, true);
        if (this.fields.isImmutable()) {
            cloneAllFieldsMap.makeImmutable();
        }
        return cloneAllFieldsMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap, boolean z, boolean z2) {
        com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> newFieldMap = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap();
        int numArrayEntries = smallSortedMap.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            cloneFieldEntry(newFieldMap, smallSortedMap.getArrayEntryAt(i), z, z2);
        }
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z, z2);
        }
        return newFieldMap;
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> map, java.util.Map.Entry<T, java.lang.Object> entry, boolean z, boolean z2) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (z2 && (value instanceof com.google.crypto.tink.shaded.protobuf.LazyField)) {
            map.put(key, ((com.google.crypto.tink.shaded.protobuf.LazyField) value).getValue());
        } else if (z && (value instanceof java.util.List)) {
            map.put(key, new java.util.ArrayList((java.util.List) value));
        } else {
            map.put(key, value);
        }
    }

    public final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
        if (isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        if (this.hasLazyField) {
            return new com.google.crypto.tink.shaded.protobuf.LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
        if (isEmpty()) {
            return java.util.Collections.emptyIterator();
        }
        if (this.hasLazyField) {
            return new com.google.crypto.tink.shaded.protobuf.LazyField.LazyIterator(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public final boolean hasField(T t) {
        if (t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(t) != null;
    }

    public final java.lang.Object getField(T t) {
        java.lang.Object obj = this.fields.get(t);
        return obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField ? ((com.google.crypto.tink.shaded.protobuf.LazyField) obj).getValue() : obj;
    }

    public final void setField(T t, java.lang.Object obj) {
        if (t.isRepeated()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t, it.next());
            }
            obj = arrayList;
        } else {
            verifyType(t, obj);
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) t, (T) obj);
    }

    public final void clearField(T t) {
        this.fields.remove(t);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public final int getRepeatedFieldCount(T t) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            return 0;
        }
        return ((java.util.List) field).size();
    }

    public final java.lang.Object getRepeatedField(T t, int i) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return ((java.util.List) field).get(i);
    }

    public final void setRepeatedField(T t, int i, java.lang.Object obj) {
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(t);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        verifyType(t, obj);
        ((java.util.List) field).set(i, obj);
    }

    public final void addRepeatedField(T t, java.lang.Object obj) {
        java.util.List list;
        if (!t.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(t, obj);
        java.lang.Object field = getField(t);
        if (field == null) {
            list = new java.util.ArrayList();
            this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) t, (T) list);
        } else {
            list = (java.util.List) field;
        }
        list.add(obj);
    }

    private void verifyType(T t, java.lang.Object obj) {
        if (isValidType(t.getLiteType(), obj)) {
            return;
        }
        int number = t.getNumber();
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number), t.getLiteType().getJavaType(), obj.getClass().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(obj);
        switch (com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite)) {
                }
                break;
            case 9:
                if ((obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite) || (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField)) {
                }
                break;
        }
        return false;
    }

    public final boolean isInitialized() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            java.util.List list = (java.util.List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!isMessageFieldValueInitialized(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private static boolean isMessageFieldValueInitialized(java.lang.Object obj) {
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder) {
            return ((com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static int getWireFormatForFieldType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public final void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet) {
        int numArrayEntries = fieldSet.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = fieldSet.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object cloneIfMutable(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z = value instanceof com.google.crypto.tink.shaded.protobuf.LazyField;
        if (key.isRepeated()) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
            }
            java.lang.Object field = getField(key);
            if (field == null) {
                field = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) field);
            return;
        }
        if (key.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) cloneIfMutable(value));
            return;
        }
        java.lang.Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) cloneIfMutable(value));
            if (z) {
                this.hasLazyField = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((com.google.crypto.tink.shaded.protobuf.LazyField) value).getValue();
        }
        this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) key.internalMergeFrom(((com.google.crypto.tink.shaded.protobuf.MessageLite) field2).toBuilder(), (com.google.crypto.tink.shaded.protobuf.MessageLite) value).build());
    }

    public static java.lang.Object readPrimitiveField(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, boolean z) throws java.io.IOException {
        if (z) {
            return com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(codedInputStream, fieldType, com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT);
        }
        return com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(codedInputStream, fieldType, com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE);
    }

    public final void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            java.util.Map.Entry<T, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField(arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (java.util.Map.Entry<T, java.lang.Object> entry : this.fields.getOverflowEntries()) {
            writeField(entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public final void writeMessageSetTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int numArrayEntries = this.fields.getNumArrayEntries();
        for (int i = 0; i < numArrayEntries; i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }

    private void writeMessageSetTo(java.util.Map.Entry<T, java.lang.Object> entry, com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
                codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((com.google.crypto.tink.shaded.protobuf.LazyField) value).toByteString());
                return;
            } else {
                codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (com.google.crypto.tink.shaded.protobuf.MessageLite) value);
                return;
            }
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    static void writeElement(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    static void writeElementNoTag(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
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
                codedOutputStream.writeGroupNoTag((com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
                break;
            case 11:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((com.google.crypto.tink.shaded.protobuf.ByteString) obj);
                    break;
                } else {
                    codedOutputStream.writeStringNoTag((java.lang.String) obj);
                    break;
                }
            case 12:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((com.google.crypto.tink.shaded.protobuf.ByteString) obj);
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
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) obj).getNumber());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                    break;
                }
        }
    }

    public static void writeField(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            int i = 0;
            if (!fieldDescriptorLite.isPacked()) {
                while (i < size) {
                    writeElement(codedOutputStream, liteType, number, list.get(i));
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
                    i2 += computeElementSizeNoTag(liteType, list.get(i3));
                }
                codedOutputStream.writeUInt32NoTag(i2);
                while (i < size) {
                    writeElementNoTag(codedOutputStream, liteType, list.get(i));
                    i++;
                }
                return;
            }
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
            writeElement(codedOutputStream, liteType, number, ((com.google.crypto.tink.shaded.protobuf.LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public final int getSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            java.util.Map.Entry<T, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (java.util.Map.Entry<T, java.lang.Object> entry : this.fields.getOverflowEntries()) {
            i += computeFieldSize(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int getMessageSetSerializedSize() {
        int numArrayEntries = this.fields.getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i += getMessageSetSerializedSize(it.next());
        }
        return i;
    }

    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.getLiteJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (com.google.crypto.tink.shaded.protobuf.LazyField) value);
            }
            return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (com.google.crypto.tink.shaded.protobuf.MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    static int computeElementSize(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) {
        int computeTagSize = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(i);
        if (fieldType == com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSizeNoTag((com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
            case 10:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
                    return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((com.google.crypto.tink.shaded.protobuf.LazyField) obj);
                }
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag((com.google.crypto.tink.shaded.protobuf.MessageLite) obj);
            case 11:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
                    return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag((com.google.crypto.tink.shaded.protobuf.ByteString) obj);
                }
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
                    return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag((com.google.crypto.tink.shaded.protobuf.ByteString) obj);
                }
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) {
                    return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(((com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) obj).getNumber());
                }
                return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj) {
        com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            int i = 0;
            if (!fieldDescriptorLite.isPacked()) {
                int i2 = 0;
                while (i < size) {
                    i2 += computeElementSize(liteType, number, list.get(i));
                    i++;
                }
                return i2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int i3 = 0;
            while (i < size) {
                i3 += computeElementSizeNoTag(liteType, list.get(i));
                i++;
            }
            return com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(number) + i3 + com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(i3);
        }
        return computeElementSize(liteType, number, obj);
    }

    /* loaded from: classes9.dex */
    static final class Builder<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            this(com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap());
        }

        private Builder(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldSet<T> build() {
            return buildImpl(false);
        }

        public final com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildImpl(boolean z) {
            if (this.fields.isEmpty()) {
                return com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet();
            }
            this.isMutable = false;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMap = com.google.crypto.tink.shaded.protobuf.FieldSet.cloneAllFieldsMap(smallSortedMap, false, false);
                replaceBuilders(smallSortedMap, z);
            }
            com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet = new com.google.crypto.tink.shaded.protobuf.FieldSet<>(smallSortedMap, null);
            ((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> smallSortedMap, boolean z) {
            int numArrayEntries = smallSortedMap.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i), z);
            }
            java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), z);
            }
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> entry, boolean z) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T t, java.lang.Object obj, boolean z) {
            if (obj == null || t.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (t.isRepeated()) {
                if (!(obj instanceof java.util.List)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Repeated field should contains a List but actually contains type: ");
                    sb.append(obj.getClass());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                java.util.List list = (java.util.List) obj;
                for (int i = 0; i < list.size(); i++) {
                    java.lang.Object obj2 = list.get(i);
                    java.lang.Object replaceBuilder = replaceBuilder(obj2, z);
                    if (replaceBuilder != obj2) {
                        if (list == obj) {
                            list = new java.util.ArrayList(list);
                        }
                        list.set(i, replaceBuilder);
                    }
                }
                return list;
            }
            return replaceBuilder(obj, z);
        }

        private static java.lang.Object replaceBuilder(java.lang.Object obj, boolean z) {
            if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder)) {
                return obj;
            }
            com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder = (com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) obj;
            if (z) {
                return builder.buildPartial();
            }
            return builder.build();
        }

        public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> fromFieldSet(com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet) {
            com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> builder = new com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<>(com.google.crypto.tink.shaded.protobuf.FieldSet.cloneAllFieldsMap(((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).fields, true, false));
            ((com.google.crypto.tink.shaded.protobuf.FieldSet.Builder) builder).hasLazyField = ((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        public final java.util.Map<T, java.lang.Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : java.util.Collections.unmodifiableMap(this.fields);
            }
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap cloneAllFieldsMap = com.google.crypto.tink.shaded.protobuf.FieldSet.cloneAllFieldsMap(this.fields, false, true);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
                return cloneAllFieldsMap;
            }
            replaceBuilders(cloneAllFieldsMap, true);
            return cloneAllFieldsMap;
        }

        public final boolean hasField(T t) {
            if (t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(t) != null;
        }

        public final java.lang.Object getField(T t) {
            return replaceBuilders(t, getFieldAllowBuilders(t), true);
        }

        final java.lang.Object getFieldAllowBuilders(T t) {
            java.lang.Object obj = this.fields.get(t);
            return obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField ? ((com.google.crypto.tink.shaded.protobuf.LazyField) obj).getValue() : obj;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = com.google.crypto.tink.shaded.protobuf.FieldSet.cloneAllFieldsMap(this.fields, true, false);
            this.isMutable = true;
        }

        public final void setField(T t, java.lang.Object obj) {
            ensureIsMutable();
            if (t.isRepeated()) {
                if (!(obj instanceof java.util.List)) {
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                java.util.ArrayList arrayList = new java.util.ArrayList((java.util.List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj2 = arrayList.get(i);
                    verifyType(t, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder);
                }
                obj = arrayList;
            } else {
                verifyType(t, obj);
            }
            if (obj instanceof com.google.crypto.tink.shaded.protobuf.LazyField) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder);
            this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) t, (T) obj);
        }

        public final void clearField(T t) {
            ensureIsMutable();
            this.fields.remove(t);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public final int getRepeatedFieldCount(T t) {
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((java.util.List) fieldAllowBuilders).size();
        }

        public final java.lang.Object getRepeatedField(T t, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t, i), true);
        }

        final java.lang.Object getRepeatedFieldAllowBuilders(T t, int i) {
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return ((java.util.List) fieldAllowBuilders).get(i);
        }

        public final void setRepeatedField(T t, int i, java.lang.Object obj) {
            ensureIsMutable();
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            verifyType(t, obj);
            ((java.util.List) fieldAllowBuilders).set(i, obj);
        }

        public final void addRepeatedField(T t, java.lang.Object obj) {
            java.util.List list;
            ensureIsMutable();
            if (!t.isRepeated()) {
                throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder);
            verifyType(t, obj);
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(t);
            if (fieldAllowBuilders == null) {
                list = new java.util.ArrayList();
                this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) t, (T) list);
            } else {
                list = (java.util.List) fieldAllowBuilders;
            }
            list.add(obj);
        }

        private void verifyType(T t, java.lang.Object obj) {
            if (com.google.crypto.tink.shaded.protobuf.FieldSet.isValidType(t.getLiteType(), obj)) {
                return;
            }
            if (t.getLiteType().getJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE && (obj instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder)) {
                return;
            }
            int number = t.getNumber();
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(number), t.getLiteType().getJavaType(), obj.getClass().getName()));
        }

        public final boolean isInitialized() {
            int numArrayEntries = this.fields.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                if (!com.google.crypto.tink.shaded.protobuf.FieldSet.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!com.google.crypto.tink.shaded.protobuf.FieldSet.isInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> fieldSet) {
            ensureIsMutable();
            int numArrayEntries = ((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).fields.getNumArrayEntries();
            for (int i = 0; i < numArrayEntries; i++) {
                mergeFromField(((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).fields.getArrayEntryAt(i));
            }
            java.util.Iterator it = ((com.google.crypto.tink.shaded.protobuf.FieldSet) fieldSet).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((java.util.Map.Entry) it.next());
            }
        }

        private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> entry) {
            T key = entry.getKey();
            java.lang.Object value = entry.getValue();
            boolean z = value instanceof com.google.crypto.tink.shaded.protobuf.LazyField;
            if (key.isRepeated()) {
                if (z) {
                    throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
                }
                java.util.List list = (java.util.List) getFieldAllowBuilders(key);
                java.util.List list2 = (java.util.List) value;
                int size = list2.size();
                if (list == null) {
                    list = new java.util.ArrayList(size);
                    this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) list);
                }
                for (int i = 0; i < size; i++) {
                    list.add(com.google.crypto.tink.shaded.protobuf.FieldSet.cloneIfMutable(list2.get(i)));
                }
                return;
            }
            if (key.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE) {
                if (!z) {
                    this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) com.google.crypto.tink.shaded.protobuf.FieldSet.cloneIfMutable(value));
                    return;
                }
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            java.lang.Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) com.google.crypto.tink.shaded.protobuf.FieldSet.cloneIfMutable(value));
                if (z) {
                    this.hasLazyField = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((com.google.crypto.tink.shaded.protobuf.LazyField) value).getValue();
            }
            if (fieldAllowBuilders instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) {
                key.internalMergeFrom((com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) fieldAllowBuilders, (com.google.crypto.tink.shaded.protobuf.MessageLite) value);
            } else {
                this.fields.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object>) key, (T) key.internalMergeFrom(((com.google.crypto.tink.shaded.protobuf.MessageLite) fieldAllowBuilders).toBuilder(), (com.google.crypto.tink.shaded.protobuf.MessageLite) value).build());
            }
        }
    }
}
