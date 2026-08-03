package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class BinaryWriter extends com.google.protobuf.ByteOutput implements com.google.protobuf.Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final com.google.protobuf.BufferAllocator alloc;
    final java.util.ArrayDeque<com.google.protobuf.AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long value) {
        byte b;
        if (((-128) & value) == 0) {
            return (byte) 1;
        }
        if (value < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & value) != 0) {
            b = (byte) 6;
            value >>>= 28;
        } else {
            b = 2;
        }
        if (((-2097152) & value) != 0) {
            b = (byte) (b + 2);
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    abstract void requireSpace(int size);

    abstract void writeBool(boolean value);

    abstract void writeFixed32(int value);

    abstract void writeFixed64(long value);

    abstract void writeInt32(int value);

    abstract void writeSInt32(int value);

    abstract void writeSInt64(long value);

    abstract void writeString(java.lang.String in);

    abstract void writeTag(int fieldNumber, int wireType);

    abstract void writeVarint32(int value);

    abstract void writeVarint64(long value);

    /* synthetic */ BinaryWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i, com.google.protobuf.BinaryWriter.AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i);
    }

    public static com.google.protobuf.BinaryWriter newHeapInstance(com.google.protobuf.BufferAllocator alloc) {
        return newHeapInstance(alloc, 4096);
    }

    public static com.google.protobuf.BinaryWriter newHeapInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        if (isUnsafeHeapSupported()) {
            return newUnsafeHeapInstance(alloc, chunkSize);
        }
        return newSafeHeapInstance(alloc, chunkSize);
    }

    public static com.google.protobuf.BinaryWriter newDirectInstance(com.google.protobuf.BufferAllocator alloc) {
        return newDirectInstance(alloc, 4096);
    }

    public static com.google.protobuf.BinaryWriter newDirectInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        if (isUnsafeDirectSupported()) {
            return newUnsafeDirectInstance(alloc, chunkSize);
        }
        return newSafeDirectInstance(alloc, chunkSize);
    }

    static boolean isUnsafeHeapSupported() {
        return com.google.protobuf.BinaryWriter.UnsafeHeapWriter.isSupported();
    }

    static boolean isUnsafeDirectSupported() {
        return com.google.protobuf.BinaryWriter.UnsafeDirectWriter.isSupported();
    }

    static com.google.protobuf.BinaryWriter newSafeHeapInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        return new com.google.protobuf.BinaryWriter.SafeHeapWriter(alloc, chunkSize);
    }

    static com.google.protobuf.BinaryWriter newUnsafeHeapInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        if (!isUnsafeHeapSupported()) {
            throw new java.lang.UnsupportedOperationException("Unsafe operations not supported");
        }
        return new com.google.protobuf.BinaryWriter.UnsafeHeapWriter(alloc, chunkSize);
    }

    static com.google.protobuf.BinaryWriter newSafeDirectInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        return new com.google.protobuf.BinaryWriter.SafeDirectWriter(alloc, chunkSize);
    }

    static com.google.protobuf.BinaryWriter newUnsafeDirectInstance(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        if (!isUnsafeDirectSupported()) {
            throw new java.lang.UnsupportedOperationException("Unsafe operations not supported");
        }
        return new com.google.protobuf.BinaryWriter.UnsafeDirectWriter(alloc, chunkSize);
    }

    private BinaryWriter(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
        this.buffers = new java.util.ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new java.lang.IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (com.google.protobuf.BufferAllocator) com.google.protobuf.Internal.checkNotNull(alloc, "alloc");
        this.chunkSize = chunkSize;
    }

    @Override // com.google.protobuf.Writer
    public final com.google.protobuf.Writer.FieldOrder fieldOrder() {
        return com.google.protobuf.Writer.FieldOrder.DESCENDING;
    }

    public final java.util.Queue<com.google.protobuf.AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int fieldNumber, int value) throws java.io.IOException {
        writeFixed32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int fieldNumber, long value) throws java.io.IOException {
        writeUInt64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int fieldNumber, long value) throws java.io.IOException {
        writeFixed64(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int fieldNumber, float value) throws java.io.IOException {
        writeFixed32(fieldNumber, java.lang.Float.floatToRawIntBits(value));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int fieldNumber, double value) throws java.io.IOException {
        writeFixed64(fieldNumber, java.lang.Double.doubleToRawLongBits(value));
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int fieldNumber, int value) throws java.io.IOException {
        writeInt32(fieldNumber, value);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeInt32List_Internal(fieldNumber, (com.google.protobuf.IntArrayList) list, packed);
        } else {
            writeInt32List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeInt32List_Internal(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(fieldNumber, list.get(size2).intValue());
        }
    }

    private void writeInt32List_Internal(int fieldNumber, com.google.protobuf.IntArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(fieldNumber, list.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeFixed32List_Internal(fieldNumber, (com.google.protobuf.IntArrayList) list, packed);
        } else {
            writeFixed32List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeFixed32List_Internal(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(fieldNumber, list.get(size2).intValue());
        }
    }

    private void writeFixed32List_Internal(int fieldNumber, com.google.protobuf.IntArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(fieldNumber, list.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        writeUInt64List(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeUInt64List_Internal(fieldNumber, (com.google.protobuf.LongArrayList) list, packed);
        } else {
            writeUInt64List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeUInt64List_Internal(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(fieldNumber, list.get(size2).longValue());
        }
    }

    private void writeUInt64List_Internal(int fieldNumber, com.google.protobuf.LongArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(fieldNumber, list.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeFixed64List_Internal(fieldNumber, (com.google.protobuf.LongArrayList) list, packed);
        } else {
            writeFixed64List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeFixed64List_Internal(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(fieldNumber, list.get(size2).longValue());
        }
    }

    private void writeFixed64List_Internal(int fieldNumber, com.google.protobuf.LongArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(fieldNumber, list.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int fieldNumber, java.util.List<java.lang.Float> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.FloatArrayList) {
            writeFloatList_Internal(fieldNumber, (com.google.protobuf.FloatArrayList) list, packed);
        } else {
            writeFloatList_Internal(fieldNumber, list, packed);
        }
    }

    private void writeFloatList_Internal(int fieldNumber, java.util.List<java.lang.Float> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(java.lang.Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(fieldNumber, list.get(size2).floatValue());
        }
    }

    private void writeFloatList_Internal(int fieldNumber, com.google.protobuf.FloatArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(java.lang.Float.floatToRawIntBits(list.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(fieldNumber, list.getFloat(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int fieldNumber, java.util.List<java.lang.Double> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.DoubleArrayList) {
            writeDoubleList_Internal(fieldNumber, (com.google.protobuf.DoubleArrayList) list, packed);
        } else {
            writeDoubleList_Internal(fieldNumber, list, packed);
        }
    }

    private void writeDoubleList_Internal(int fieldNumber, java.util.List<java.lang.Double> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(java.lang.Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(fieldNumber, list.get(size2).doubleValue());
        }
    }

    private void writeDoubleList_Internal(int fieldNumber, com.google.protobuf.DoubleArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(java.lang.Double.doubleToRawLongBits(list.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(fieldNumber, list.getDouble(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        writeInt32List(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int fieldNumber, java.util.List<java.lang.Boolean> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.BooleanArrayList) {
            writeBoolList_Internal(fieldNumber, (com.google.protobuf.BooleanArrayList) list, packed);
        } else {
            writeBoolList_Internal(fieldNumber, list, packed);
        }
    }

    private void writeBoolList_Internal(int fieldNumber, java.util.List<java.lang.Boolean> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.get(size).booleanValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(fieldNumber, list.get(size2).booleanValue());
        }
    }

    private void writeBoolList_Internal(int fieldNumber, com.google.protobuf.BooleanArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(fieldNumber, list.getBoolean(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int fieldNumber, java.util.List<java.lang.String> list) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LazyStringList) {
            com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                writeLazyString(fieldNumber, lazyStringList.getRaw(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeString(fieldNumber, list.get(size2));
        }
    }

    private void writeLazyString(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        if (value instanceof java.lang.String) {
            writeString(fieldNumber, (java.lang.String) value);
        } else {
            writeBytes(fieldNumber, (com.google.protobuf.ByteString) value);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int fieldNumber, java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeUInt32List_Internal(fieldNumber, (com.google.protobuf.IntArrayList) list, packed);
        } else {
            writeUInt32List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeUInt32List_Internal(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(fieldNumber, list.get(size2).intValue());
        }
    }

    private void writeUInt32List_Internal(int fieldNumber, com.google.protobuf.IntArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(fieldNumber, list.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        writeFixed32List(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        writeFixed64List(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeSInt32List_Internal(fieldNumber, (com.google.protobuf.IntArrayList) list, packed);
        } else {
            writeSInt32List_Internal(fieldNumber, list, packed);
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, java.util.List<java.lang.Integer> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(fieldNumber, list.get(size2).intValue());
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, com.google.protobuf.IntArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(fieldNumber, list.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeSInt64List_Internal(fieldNumber, (com.google.protobuf.LongArrayList) list, packed);
        } else {
            writeSInt64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
        }
    }

    /* renamed from: com.google.protobuf.BinaryWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    static final void writeMapEntryField(com.google.protobuf.Writer writer, int fieldNumber, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Object object) throws java.io.IOException {
        switch (com.google.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(fieldNumber, ((java.lang.Boolean) object).booleanValue());
                return;
            case 2:
                writer.writeFixed32(fieldNumber, ((java.lang.Integer) object).intValue());
                return;
            case 3:
                writer.writeFixed64(fieldNumber, ((java.lang.Long) object).longValue());
                return;
            case 4:
                writer.writeInt32(fieldNumber, ((java.lang.Integer) object).intValue());
                return;
            case 5:
                writer.writeInt64(fieldNumber, ((java.lang.Long) object).longValue());
                return;
            case 6:
                writer.writeSFixed32(fieldNumber, ((java.lang.Integer) object).intValue());
                return;
            case 7:
                writer.writeSFixed64(fieldNumber, ((java.lang.Long) object).longValue());
                return;
            case 8:
                writer.writeSInt32(fieldNumber, ((java.lang.Integer) object).intValue());
                return;
            case 9:
                writer.writeSInt64(fieldNumber, ((java.lang.Long) object).longValue());
                return;
            case 10:
                writer.writeString(fieldNumber, (java.lang.String) object);
                return;
            case 11:
                writer.writeUInt32(fieldNumber, ((java.lang.Integer) object).intValue());
                return;
            case 12:
                writer.writeUInt64(fieldNumber, ((java.lang.Long) object).longValue());
                return;
            case 13:
                writer.writeFloat(fieldNumber, ((java.lang.Float) object).floatValue());
                return;
            case 14:
                writer.writeDouble(fieldNumber, ((java.lang.Double) object).doubleValue());
                return;
            case 15:
                writer.writeMessage(fieldNumber, object);
                return;
            case 16:
                writer.writeBytes(fieldNumber, (com.google.protobuf.ByteString) object);
                return;
            case 17:
                if (object instanceof com.google.protobuf.Internal.EnumLite) {
                    writer.writeEnum(fieldNumber, ((com.google.protobuf.Internal.EnumLite) object).getNumber());
                    return;
                } else {
                    if (object instanceof java.lang.Integer) {
                        writer.writeEnum(fieldNumber, ((java.lang.Integer) object).intValue());
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new java.lang.IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeSInt64List_Internal(int fieldNumber, java.util.List<java.lang.Long> list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(fieldNumber, list.get(size2).longValue());
        }
    }

    private void writeSInt64List_Internal(int fieldNumber, com.google.protobuf.LongArrayList list, boolean packed) throws java.io.IOException {
        if (packed) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(fieldNumber, list.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int fieldNumber, java.util.List<?> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int fieldNumber, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int fieldNumber, java.util.List<?> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int fieldNumber, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, java.lang.Object value) throws java.io.IOException {
        writeTag(1, 4);
        if (value instanceof com.google.protobuf.ByteString) {
            writeBytes(3, (com.google.protobuf.ByteString) value);
        } else {
            writeMessage(3, value);
        }
        writeUInt32(2, fieldNumber);
        writeTag(1, 3);
    }

    final com.google.protobuf.AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    final com.google.protobuf.AllocatedBuffer newHeapBuffer(int capacity) {
        return this.alloc.allocateHeapBuffer(java.lang.Math.max(capacity, this.chunkSize));
    }

    final com.google.protobuf.AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final com.google.protobuf.AllocatedBuffer newDirectBuffer(int capacity) {
        return this.alloc.allocateDirectBuffer(java.lang.Math.max(capacity, this.chunkSize));
    }

    private static final class SafeHeapWriter extends com.google.protobuf.BinaryWriter {
        private com.google.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                com.google.protobuf.AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        private void nextBuffer(com.google.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasArray()) {
                throw new java.lang.RuntimeException("Allocator returned non-heap buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.allocatedBuffer = allocatedBuffer;
            this.buffer = allocatedBuffer.array();
            int arrayOffset = allocatedBuffer.arrayOffset();
            this.limit = allocatedBuffer.limit() + arrayOffset;
            int position = arrayOffset + allocatedBuffer.position();
            this.offset = position;
            this.offsetMinusOne = position - 1;
            int i = this.limit - 1;
            this.limitMinusOne = i;
            this.pos = i;
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) throws java.io.IOException {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) throws java.io.IOException {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) throws java.io.IOException {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) throws java.io.IOException {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) throws java.io.IOException {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) throws java.io.IOException {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) throws java.io.IOException {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) throws java.io.IOException {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int fieldNumber, java.lang.String value) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int fieldNumber, com.google.protobuf.ByteString value) throws java.io.IOException {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 7);
            this.pos = i - 2;
            bArr[i - 1] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 14);
            bArr[i - 1] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 3;
            bArr[i - 2] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 21);
            bArr[i - 1] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 4;
            bArr[i - 3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 28);
            bArr[i - 1] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 5;
            bArr[i - 4] = (byte) ((value & 127) | 128);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 7);
            this.pos = i - 2;
            bArr[i - 1] = (byte) ((((int) value) & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (((int) value) >>> 14);
            bArr[i - 1] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 3;
            bArr[i - 2] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 21);
            bArr[i - 1] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 4;
            bArr[i - 3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 28);
            bArr[i - 1] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 5;
            bArr[i - 4] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 35);
            bArr[i - 1] = (byte) (((value >>> 28) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 4] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 6;
            bArr[i - 5] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 42);
            bArr[i - 1] = (byte) (((value >>> 35) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 28) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 4] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 5] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 7;
            bArr[i - 6] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 49);
            bArr[i - 1] = (byte) (((value >>> 42) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 35) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 28) & 127) | 128);
            bArr[i - 4] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 5] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 6] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 8;
            bArr[i - 7] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 56);
            bArr[i - 1] = (byte) (((value >>> 49) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 42) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 35) & 127) | 128);
            bArr[i - 4] = (byte) (((value >>> 28) & 127) | 128);
            bArr[i - 5] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 6] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 7] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 9;
            bArr[i - 8] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (value >>> 63);
            bArr[i - 1] = (byte) (((value >>> 56) & 127) | 128);
            bArr[i - 2] = (byte) (((value >>> 49) & 127) | 128);
            bArr[i - 3] = (byte) (((value >>> 42) & 127) | 128);
            bArr[i - 4] = (byte) (((value >>> 35) & 127) | 128);
            bArr[i - 5] = (byte) (((value >>> 28) & 127) | 128);
            bArr[i - 6] = (byte) (((value >>> 21) & 127) | 128);
            bArr[i - 7] = (byte) (((value >>> 14) & 127) | 128);
            bArr[i - 8] = (byte) (((value >>> 7) & 127) | 128);
            this.pos = i - 10;
            bArr[i - 9] = (byte) ((value & 127) | 128);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) ((value >> 24) & 255);
            bArr[i - 1] = (byte) ((value >> 16) & 255);
            bArr[i - 2] = (byte) ((value >> 8) & 255);
            this.pos = i - 4;
            bArr[i - 3] = (byte) (value & 255);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (((int) (value >> 56)) & 255);
            bArr[i - 1] = (byte) (((int) (value >> 48)) & 255);
            bArr[i - 2] = (byte) (((int) (value >> 40)) & 255);
            bArr[i - 3] = (byte) (((int) (value >> 32)) & 255);
            bArr[i - 4] = (byte) (((int) (value >> 24)) & 255);
            bArr[i - 5] = (byte) (((int) (value >> 16)) & 255);
            bArr[i - 6] = (byte) (((int) (value >> 8)) & 255);
            this.pos = i - 8;
            bArr[i - 7] = (byte) (((int) value) & 255);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(java.lang.String in) {
            int i;
            int i2;
            int i3;
            char charAt;
            requireSpace(in.length());
            int length = in.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = in.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = in.charAt(length);
                if (charAt2 < 128 && (i3 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i3 - 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i2 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    bArr2[i2] = (byte) ((charAt2 & '?') | 128);
                    this.pos = i2 - 2;
                    bArr2[i2 - 1] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    bArr3[i] = (byte) ((charAt2 & '?') | 128);
                    bArr3[i - 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.pos = i - 3;
                    bArr3[i - 2] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = in.charAt(length - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.buffer;
                                int i4 = this.pos;
                                bArr4[i4] = (byte) ((codePoint & 63) | 128);
                                bArr4[i4 - 1] = (byte) (((codePoint >>> 6) & 63) | 128);
                                bArr4[i4 - 2] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i4 - 4;
                                bArr4[i4 - 3] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            bArr[i] = value;
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.pos - length;
            this.pos = i;
            java.lang.System.arraycopy(value, offset, this.buffer, i + 1, length);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.pos - length;
                this.pos = i;
                java.lang.System.arraycopy(value, offset, this.buffer, i + 1, length);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i = this.pos - remaining;
            this.pos = i;
            value.get(this.buffer, i + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            int i = this.pos - remaining;
            this.pos = i;
            value.get(this.buffer, i + 1, remaining);
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }
    }

    private static final class UnsafeHeapWriter extends com.google.protobuf.BinaryWriter {
        private com.google.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations();
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newHeapBuffer(capacity));
        }

        private void nextBuffer(com.google.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasArray()) {
                throw new java.lang.RuntimeException("Allocator returned non-heap buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.allocatedBuffer = allocatedBuffer;
            this.buffer = allocatedBuffer.array();
            long arrayOffset = allocatedBuffer.arrayOffset();
            this.limit = allocatedBuffer.limit() + arrayOffset;
            long position = arrayOffset + allocatedBuffer.position();
            this.offset = position;
            this.offsetMinusOne = position - 1;
            long j = this.limit - 1;
            this.limitMinusOne = j;
            this.pos = j;
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int fieldNumber, java.lang.String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int fieldNumber, com.google.protobuf.ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) value);
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 14));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) ((value & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) value);
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) ((((int) value) & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 35));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 42));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 49));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 56));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j8, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr9, j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (value >>> 63));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((value >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j8, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr9, j9, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr10, j10, (byte) ((value & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) ((value >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) ((value >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((value >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (value & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (((int) (value >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((int) (value >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((int) (value >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) (((int) (value >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((int) (value >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) (((int) (value >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j8, (byte) (((int) value) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(java.lang.String in) {
            char charAt;
            requireSpace(in.length());
            int length = in.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = in.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j = this.pos;
                this.pos = j - 1;
                com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = in.charAt(length);
                if (charAt2 < 128) {
                    long j2 = this.pos;
                    if (j2 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j2 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j3 = this.pos;
                    if (j3 > this.offset) {
                        byte[] bArr3 = this.buffer;
                        this.pos = j3 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr4 = this.buffer;
                        long j4 = this.pos;
                        this.pos = j4 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j5 = this.pos;
                    if (j5 > this.offset + 1) {
                        byte[] bArr5 = this.buffer;
                        this.pos = j5 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr6 = this.buffer;
                        long j6 = this.pos;
                        this.pos = j6 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr6, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byte[] bArr7 = this.buffer;
                        long j7 = this.pos;
                        this.pos = j7 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.offset + 2) {
                    if (length != 0) {
                        char charAt3 = in.charAt(length - 1);
                        if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.buffer;
                            long j8 = this.pos;
                            this.pos = j8 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(bArr8, j8, (byte) ((codePoint & 63) | 128));
                            byte[] bArr9 = this.buffer;
                            long j9 = this.pos;
                            this.pos = j9 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(bArr9, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                            byte[] bArr10 = this.buffer;
                            long j10 = this.pos;
                            this.pos = j10 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(bArr10, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                            byte[] bArr11 = this.buffer;
                            long j11 = this.pos;
                            this.pos = j11 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(bArr11, j11, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte value) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, value);
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(value.length), java.lang.Integer.valueOf(offset), java.lang.Integer.valueOf(length)));
            }
            requireSpace(length);
            this.pos -= length;
            java.lang.System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(value.length), java.lang.Integer.valueOf(offset), java.lang.Integer.valueOf(length)));
            }
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.pos -= length;
                java.lang.System.arraycopy(value, offset, this.buffer, arrayPos() + 1, length);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            requireSpace(remaining);
            this.pos -= remaining;
            value.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value));
                nextBuffer();
            }
            this.pos -= remaining;
            value.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }
    }

    private static final class SafeDirectWriter extends com.google.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        private void nextBuffer(com.google.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasNioBuffer()) {
                throw new java.lang.RuntimeException("Allocated buffer does not have NIO buffer");
            }
            java.nio.ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
            if (!nioBuffer.isDirect()) {
                throw new java.lang.RuntimeException("Allocator returned non-direct buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.buffer = nioBuffer;
            com.google.protobuf.Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
            com.google.protobuf.Java8Compatibility.position(this.buffer, 0);
            this.buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            int limit = this.buffer.limit() - 1;
            this.limitMinusOne = limit;
            this.pos = limit;
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                com.google.protobuf.Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int fieldNumber, java.lang.String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int fieldNumber, com.google.protobuf.ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        private void writeVarint32OneByte(int value) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) value);
        }

        private void writeVarint32TwoBytes(int value) {
            int i = this.pos;
            this.pos = i - 2;
            this.buffer.putShort(i - 1, (short) ((value & 127) | 128 | ((value & 16256) << 1)));
        }

        private void writeVarint32ThreeBytes(int value) {
            int i = this.pos - 3;
            this.pos = i;
            this.buffer.putInt(i, (((value & 127) | 128) << 8) | ((2080768 & value) << 10) | (((value & 16256) | 16384) << 9));
        }

        private void writeVarint32FourBytes(int value) {
            int i = this.pos;
            this.pos = i - 4;
            this.buffer.putInt(i - 3, (value & 127) | 128 | ((266338304 & value) << 3) | (((2080768 & value) | 2097152) << 2) | (((value & 16256) | 16384) << 1));
        }

        private void writeVarint32FiveBytes(int value) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) (value >>> 28));
            int i2 = this.pos;
            this.pos = i2 - 4;
            this.buffer.putInt(i2 - 3, (value & 127) | 128 | ((((value >>> 21) & 127) | 128) << 24) | ((((value >>> 14) & 127) | 128) << 16) | ((((value >>> 7) & 127) | 128) << 8));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void writeVarint64OneByte(long value) {
            writeVarint32OneByte((int) value);
        }

        private void writeVarint64TwoBytes(long value) {
            writeVarint32TwoBytes((int) value);
        }

        private void writeVarint64ThreeBytes(long value) {
            writeVarint32ThreeBytes((int) value);
        }

        private void writeVarint64FourBytes(long value) {
            writeVarint32FourBytes((int) value);
        }

        private void writeVarint64FiveBytes(long value) {
            int i = this.pos;
            this.pos = i - 5;
            this.buffer.putLong(i - 7, (((value & 127) | 128) << 24) | ((34091302912L & value) << 28) | (((266338304 & value) | 268435456) << 27) | (((2080768 & value) | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 26) | (((16256 & value) | 16384) << 25));
        }

        private void writeVarint64SixBytes(long value) {
            int i = this.pos;
            this.pos = i - 6;
            this.buffer.putLong(i - 7, (((value & 127) | 128) << 16) | ((4363686772736L & value) << 21) | (((34091302912L & value) | 34359738368L) << 20) | (((266338304 & value) | 268435456) << 19) | (((2080768 & value) | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 18) | (((16256 & value) | 16384) << 17));
        }

        private void writeVarint64SevenBytes(long value) {
            int i = this.pos - 7;
            this.pos = i;
            this.buffer.putLong(i, (((value & 127) | 128) << 8) | ((558551906910208L & value) << 14) | (((4363686772736L & value) | 4398046511104L) << 13) | (((34091302912L & value) | 34359738368L) << 12) | (((266338304 & value) | 268435456) << 11) | (((2080768 & value) | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 10) | (((16256 & value) | 16384) << 9));
        }

        private void writeVarint64EightBytes(long value) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, (value & 127) | 128 | ((71494644084506624L & value) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long value) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, (value & 127) | 128 | (((71494644084506624L & value) | 72057594037927936L) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64NineBytes(long value) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) (value >>> 56));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64TenBytes(long value) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) (value >>> 63));
            java.nio.ByteBuffer byteBuffer2 = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer2.put(i2, (byte) (((value >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int value) {
            int i = this.pos;
            this.pos = i - 4;
            this.buffer.putInt(i - 3, value);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long value) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, value);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(java.lang.String in) {
            int i;
            int i2;
            int i3;
            char charAt;
            requireSpace(in.length());
            int length = in.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = in.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = in.charAt(length);
                if (charAt2 < 128 && (i3 = this.pos) >= 0) {
                    java.nio.ByteBuffer byteBuffer = this.buffer;
                    this.pos = i3 - 1;
                    byteBuffer.put(i3, (byte) charAt2);
                } else if (charAt2 < 2048 && (i2 = this.pos) > 0) {
                    java.nio.ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((charAt2 & '?') | 128));
                    java.nio.ByteBuffer byteBuffer3 = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i = this.pos) > 1) {
                    java.nio.ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i - 1;
                    byteBuffer4.put(i, (byte) ((charAt2 & '?') | 128));
                    java.nio.ByteBuffer byteBuffer5 = this.buffer;
                    int i5 = this.pos;
                    this.pos = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((charAt2 >>> 6) & 63) | 128));
                    java.nio.ByteBuffer byteBuffer6 = this.buffer;
                    int i6 = this.pos;
                    this.pos = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char charAt3 = in.charAt(length - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                java.nio.ByteBuffer byteBuffer7 = this.buffer;
                                int i7 = this.pos;
                                this.pos = i7 - 1;
                                byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                                java.nio.ByteBuffer byteBuffer8 = this.buffer;
                                int i8 = this.pos;
                                this.pos = i8 - 1;
                                byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                java.nio.ByteBuffer byteBuffer9 = this.buffer;
                                int i9 = this.pos;
                                this.pos = i9 - 1;
                                byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                                java.nio.ByteBuffer byteBuffer10 = this.buffer;
                                int i10 = this.pos;
                                this.pos = i10 - 1;
                                byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte value) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, value);
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.pos - length;
            this.pos = i;
            com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
            this.buffer.put(value, offset, length);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.pos - length;
                this.pos = i;
                com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i = this.pos - remaining;
            this.pos = i;
            com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
            this.buffer.put(value);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                int i = this.pos - remaining;
                this.pos = i;
                com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
                this.buffer.put(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }
    }

    private static final class UnsafeDirectWriter extends com.google.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(com.google.protobuf.BufferAllocator alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int capacity) {
            nextBuffer(newDirectBuffer(capacity));
        }

        private void nextBuffer(com.google.protobuf.AllocatedBuffer allocatedBuffer) {
            if (!allocatedBuffer.hasNioBuffer()) {
                throw new java.lang.RuntimeException("Allocated buffer does not have NIO buffer");
            }
            java.nio.ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
            if (!nioBuffer.isDirect()) {
                throw new java.lang.RuntimeException("Allocator returned non-direct buffer");
            }
            finishCurrentBuffer();
            this.buffers.addFirst(allocatedBuffer);
            this.buffer = nioBuffer;
            com.google.protobuf.Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
            com.google.protobuf.Java8Compatibility.position(this.buffer, 0);
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(this.buffer);
            this.bufferOffset = addressOffset;
            long limit = addressOffset + (this.buffer.limit() - 1);
            this.limitMinusOne = limit;
            this.pos = limit;
        }

        @Override // com.google.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        @Override // com.google.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeVarint32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeInt32(int fieldNumber, int value) {
            requireSpace(15);
            writeInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt32(int fieldNumber, int value) {
            requireSpace(10);
            writeSInt32(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed32(int fieldNumber, int value) {
            requireSpace(9);
            writeFixed32(value);
            writeTag(fieldNumber, 5);
        }

        @Override // com.google.protobuf.Writer
        public void writeUInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeVarint64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeSInt64(int fieldNumber, long value) {
            requireSpace(15);
            writeSInt64(value);
            writeTag(fieldNumber, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeFixed64(int fieldNumber, long value) {
            requireSpace(13);
            writeFixed64(value);
            writeTag(fieldNumber, 1);
        }

        @Override // com.google.protobuf.Writer
        public void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public void writeString(int fieldNumber, java.lang.String value) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeBytes(int fieldNumber, com.google.protobuf.ByteString value) {
            try {
                value.writeToReverse(this);
                requireSpace(10);
                writeVarint32(value.size());
                writeTag(fieldNumber, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeMessage(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        public void writeGroup(int fieldNumber, java.lang.Object value, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeInt32(int value) {
            if (value >= 0) {
                writeVarint32(value);
            } else {
                writeVarint64(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt32(int value) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeSInt64(long value) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(value));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeTag(int fieldNumber, int wireType) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint32(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        private void writeVarint32OneByte(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) value);
        }

        private void writeVarint32TwoBytes(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 7));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint32ThreeBytes(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 14));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 21));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FiveBytes(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 28));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) ((value & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeVarint64(long value) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        private void writeVarint64OneByte(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) value);
        }

        private void writeVarint64TwoBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 7));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((((int) value) & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (((int) value) >>> 14));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 21));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 28));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 35));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 28) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 21) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 14) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((value >>> 7) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SevenBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 42));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 35) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 28) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 21) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((value >>> 14) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((value >>> 7) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 49));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 42) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 35) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 28) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((value >>> 21) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((value >>> 14) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((value >>> 7) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 56));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 49) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 42) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 35) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((value >>> 28) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((value >>> 21) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((value >>> 14) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((value >>> 7) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (value >>> 63));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((value >>> 56) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((value >>> 49) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((value >>> 42) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((value >>> 35) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((value >>> 28) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((value >>> 21) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((value >>> 14) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) (((value >>> 7) & 127) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j10, (byte) ((value & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed32(int value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) ((value >> 24) & 255));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((value >> 16) & 255));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((value >> 8) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (value & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeFixed64(long value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (((int) (value >> 56)) & 255));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((int) (value >> 48)) & 255));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((int) (value >> 40)) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((int) (value >> 32)) & 255));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((int) (value >> 24)) & 255));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((int) (value >> 16)) & 255));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((int) (value >> 8)) & 255));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((int) value) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        void writeString(java.lang.String in) {
            char charAt;
            requireSpace(in.length());
            int length = in.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = in.charAt(length)) >= 128) {
                    break;
                }
                long j = this.pos;
                this.pos = j - 1;
                com.google.protobuf.UnsafeUtil.putByte(j, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = in.charAt(length);
                if (charAt2 < 128) {
                    long j2 = this.pos;
                    if (j2 >= this.bufferOffset) {
                        this.pos = j2 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j2, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j3 = this.pos;
                    if (j3 > this.bufferOffset) {
                        this.pos = j3 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((charAt2 & '?') | 128));
                        long j4 = this.pos;
                        this.pos = j4 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j5 = this.pos;
                    if (j5 > this.bufferOffset + 1) {
                        this.pos = j5 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j5, (byte) ((charAt2 & '?') | 128));
                        long j6 = this.pos;
                        this.pos = j6 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j7 = this.pos;
                        this.pos = j7 - 1;
                        com.google.protobuf.UnsafeUtil.putByte(j7, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.bufferOffset + 2) {
                    if (length != 0) {
                        char charAt3 = in.charAt(length - 1);
                        if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                            long j8 = this.pos;
                            this.pos = j8 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) ((codePoint & 63) | 128));
                            long j9 = this.pos;
                            this.pos = j9 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j10 = this.pos;
                            this.pos = j10 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(j10, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j11 = this.pos;
                            this.pos = j11 - 1;
                            com.google.protobuf.UnsafeUtil.putByte(j11, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte value) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, value);
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            this.pos -= length;
            com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(value, offset, length);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.totalDoneBytes += length;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.pos -= length;
                com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(value, offset, length);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public void write(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            this.pos -= remaining;
            com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(value);
        }

        @Override // com.google.protobuf.ByteOutput
        public void writeLazy(java.nio.ByteBuffer value) {
            int remaining = value.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(value));
                nextBuffer();
            } else {
                this.pos -= remaining;
                com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(value);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        void requireSpace(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }
    }
}
