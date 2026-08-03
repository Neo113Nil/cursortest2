package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class CodedOutputStreamWriter implements com.google.protobuf.Writer {
    private final com.google.protobuf.CodedOutputStream output;

    public static com.google.protobuf.CodedOutputStreamWriter forCodedOutput(com.google.protobuf.CodedOutputStream output) {
        if (output.wrapper != null) {
            return output.wrapper;
        }
        return new com.google.protobuf.CodedOutputStreamWriter(output);
    }

    private CodedOutputStreamWriter(com.google.protobuf.CodedOutputStream output) {
        com.google.protobuf.CodedOutputStream codedOutputStream = (com.google.protobuf.CodedOutputStream) com.google.protobuf.Internal.checkNotNull(output, "output");
        this.output = codedOutputStream;
        codedOutputStream.wrapper = this;
    }

    @Override // com.google.protobuf.Writer
    public com.google.protobuf.Writer.FieldOrder fieldOrder() {
        return com.google.protobuf.Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeSFixed32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeInt64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeSFixed64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeFloat(int fieldNumber, float value) throws java.io.IOException {
        this.output.writeFloat(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeDouble(int fieldNumber, double value) throws java.io.IOException {
        this.output.writeDouble(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeEnum(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeEnum(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeUInt64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeInt32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeFixed64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeFixed32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeBool(int fieldNumber, boolean value) throws java.io.IOException {
        this.output.writeBool(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException {
        this.output.writeString(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeBytes(int fieldNumber, com.google.protobuf.ByteString value) throws java.io.IOException {
        this.output.writeBytes(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeUInt32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32(int fieldNumber, int value) throws java.io.IOException {
        this.output.writeSInt32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64(int fieldNumber, long value) throws java.io.IOException {
        this.output.writeSInt64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        this.output.writeMessage(fieldNumber, (com.google.protobuf.MessageLite) value);
    }

    @Override // com.google.protobuf.Writer
    public void writeMessage(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeMessage(fieldNumber, (com.google.protobuf.MessageLite) value, schema);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        this.output.writeGroup(fieldNumber, (com.google.protobuf.MessageLite) value);
    }

    @Override // com.google.protobuf.Writer
    public void writeGroup(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
        this.output.writeGroup(fieldNumber, (com.google.protobuf.MessageLite) value, schema);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeStartGroup(int fieldNumber) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 3);
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeEndGroup(int fieldNumber) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        if (value instanceof com.google.protobuf.ByteString) {
            this.output.writeRawMessageSetExtension(fieldNumber, (com.google.protobuf.ByteString) value);
        } else {
            this.output.writeMessageSetExtension(fieldNumber, (com.google.protobuf.MessageLite) value);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeFixed32SizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeInt64SizeNoTag(value.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(value.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeUInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeFixed64SizeNoTag(value.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeFloatSizeNoTag(value.get(i3).floatValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeFloatNoTag(value.get(i).floatValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeFloat(fieldNumber, value.get(i).floatValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeDoubleSizeNoTag(value.get(i3).doubleValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeDoubleNoTag(value.get(i).doubleValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeDouble(fieldNumber, value.get(i).doubleValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeEnumNoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeEnum(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeBoolSizeNoTag(value.get(i3).booleanValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeBoolNoTag(value.get(i).booleanValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeBool(fieldNumber, value.get(i).booleanValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeStringList(int fieldNumber, java.util.List<java.lang.String> value) throws java.io.IOException {
        int i = 0;
        if (value instanceof com.google.protobuf.LazyStringList) {
            com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) value;
            while (i < value.size()) {
                writeLazyString(fieldNumber, lazyStringList.getRaw(i));
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeString(fieldNumber, value.get(i));
            i++;
        }
    }

    private void writeLazyString(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            this.output.writeString(fieldNumber, (java.lang.String) value);
        } else {
            this.output.writeBytes(fieldNumber, (com.google.protobuf.ByteString) value);
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeBytesList(int fieldNumber, java.util.List<com.google.protobuf.ByteString> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            this.output.writeBytes(fieldNumber, value.get(i));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeUInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeUInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeSFixed32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(value.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeSFixed64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSFixed64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeSInt32SizeNoTag(value.get(i3).intValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeSInt32NoTag(value.get(i).intValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt32(fieldNumber, value.get(i).intValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> value, boolean packed) throws java.io.IOException {
        int i = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i2 = 0;
            for (int i3 = 0; i3 < value.size(); i3++) {
                i2 += com.google.protobuf.CodedOutputStream.computeSInt64SizeNoTag(value.get(i3).longValue());
            }
            this.output.writeUInt32NoTag(i2);
            while (i < value.size()) {
                this.output.writeSInt64NoTag(value.get(i).longValue());
                i++;
            }
            return;
        }
        while (i < value.size()) {
            this.output.writeSInt64(fieldNumber, value.get(i).longValue());
            i++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int fieldNumber, java.util.List<?> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeMessageList(int fieldNumber, java.util.List<?> value, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeMessage(fieldNumber, value.get(i), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroupList(int fieldNumber, java.util.List<?> value) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i));
        }
    }

    @Override // com.google.protobuf.Writer
    public void writeGroupList(int fieldNumber, java.util.List<?> value, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int i = 0; i < value.size(); i++) {
            writeGroup(fieldNumber, value.get(i), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(fieldNumber, metadata, map);
            return;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private <K, V> void writeDeterministicMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        switch (com.google.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v = map.get(java.lang.Boolean.FALSE);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, false, v, metadata);
                }
                V v2 = map.get(java.lang.Boolean.TRUE);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, true, v2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(fieldNumber, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(fieldNumber, metadata, map);
                return;
            default:
                throw new java.lang.IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int fieldNumber, boolean key, V value, com.google.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> metadata) throws java.io.IOException {
        this.output.writeTag(fieldNumber, 2);
        this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Boolean.valueOf(key), value));
        com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Boolean.valueOf(key), value);
    }

    private <V> void writeDeterministicIntegerMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> metadata, java.util.Map<java.lang.Integer, V> map) throws java.io.IOException {
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        java.util.Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            V v = map.get(java.lang.Integer.valueOf(i3));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Integer.valueOf(i3), v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Integer.valueOf(i3), v);
        }
    }

    private <V> void writeDeterministicLongMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<java.lang.Long, V> metadata, java.util.Map<java.lang.Long, V> map) throws java.io.IOException {
        int size = map.size();
        long[] jArr = new long[size];
        java.util.Iterator<java.lang.Long> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        java.util.Arrays.sort(jArr);
        for (int i2 = 0; i2 < size; i2++) {
            long j = jArr[i2];
            V v = map.get(java.lang.Long.valueOf(j));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, java.lang.Long.valueOf(j), v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, java.lang.Long.valueOf(j), v);
        }
    }

    private <V> void writeDeterministicStringMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<java.lang.String, V> metadata, java.util.Map<java.lang.String, V> map) throws java.io.IOException {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        java.util.Arrays.sort(strArr);
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String str = strArr[i2];
            V v = map.get(str);
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(com.google.protobuf.MapEntryLite.computeSerializedSize(metadata, str, v));
            com.google.protobuf.MapEntryLite.writeTo(this.output, metadata, str, v);
        }
    }
}
