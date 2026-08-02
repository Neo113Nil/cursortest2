package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
abstract class BinaryWriter extends com.google.protobuf.ByteOutput implements com.google.protobuf.Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final com.google.protobuf.BufferAllocator alloc;
    final java.util.ArrayDeque<com.google.protobuf.AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j) {
        byte b;
        if (((-128) & j) == 0) {
            return (byte) 1;
        }
        if (j < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            b = 6;
        } else {
            b = 2;
        }
        if (((-2097152) & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    abstract void requireSpace(int i);

    abstract void writeBool(boolean z);

    abstract void writeFixed32(int i);

    abstract void writeFixed64(long j);

    abstract void writeInt32(int i);

    abstract void writeSInt32(int i);

    abstract void writeSInt64(long j);

    abstract void writeString(java.lang.String str);

    abstract void writeTag(int i, int i2);

    abstract void writeVarint32(int i);

    abstract void writeVarint64(long j);

    /* synthetic */ BinaryWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i, com.google.protobuf.BinaryWriter.AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i);
    }

    public static com.google.protobuf.BinaryWriter newHeapInstance(com.google.protobuf.BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    public static com.google.protobuf.BinaryWriter newHeapInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        if (isUnsafeHeapSupported()) {
            return newUnsafeHeapInstance(bufferAllocator, i);
        }
        return newSafeHeapInstance(bufferAllocator, i);
    }

    public static com.google.protobuf.BinaryWriter newDirectInstance(com.google.protobuf.BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static com.google.protobuf.BinaryWriter newDirectInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        if (isUnsafeDirectSupported()) {
            return newUnsafeDirectInstance(bufferAllocator, i);
        }
        return newSafeDirectInstance(bufferAllocator, i);
    }

    static boolean isUnsafeHeapSupported() {
        return com.google.protobuf.BinaryWriter.UnsafeHeapWriter.isSupported();
    }

    static boolean isUnsafeDirectSupported() {
        return com.google.protobuf.BinaryWriter.UnsafeDirectWriter.isSupported();
    }

    static com.google.protobuf.BinaryWriter newSafeHeapInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        return new com.google.protobuf.BinaryWriter.SafeHeapWriter(bufferAllocator, i);
    }

    static com.google.protobuf.BinaryWriter newUnsafeHeapInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        if (!isUnsafeHeapSupported()) {
            throw new java.lang.UnsupportedOperationException("Unsafe operations not supported");
        }
        return new com.google.protobuf.BinaryWriter.UnsafeHeapWriter(bufferAllocator, i);
    }

    static com.google.protobuf.BinaryWriter newSafeDirectInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        return new com.google.protobuf.BinaryWriter.SafeDirectWriter(bufferAllocator, i);
    }

    static com.google.protobuf.BinaryWriter newUnsafeDirectInstance(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        if (!isUnsafeDirectSupported()) {
            throw new java.lang.UnsupportedOperationException("Unsafe operations not supported");
        }
        return new com.google.protobuf.BinaryWriter.UnsafeDirectWriter(bufferAllocator, i);
    }

    private BinaryWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
        this.buffers = new java.util.ArrayDeque<>(4);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (com.google.protobuf.BufferAllocator) com.google.protobuf.Internal.checkNotNull(bufferAllocator, "alloc");
        this.chunkSize = i;
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
    public final void writeSFixed32(int i, int i2) throws java.io.IOException {
        writeFixed32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i, long j) throws java.io.IOException {
        writeUInt64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i, long j) throws java.io.IOException {
        writeFixed64(i, j);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i, float f) throws java.io.IOException {
        writeFixed32(i, java.lang.Float.floatToRawIntBits(f));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i, double d) throws java.io.IOException {
        writeFixed64(i, java.lang.Double.doubleToRawLongBits(d));
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i, int i2) throws java.io.IOException {
        writeInt32(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeInt32List_Internal(i, (com.google.protobuf.IntArrayList) list, z);
        } else {
            writeInt32List_Internal(i, list, z);
        }
    }

    private void writeInt32List_Internal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(i, list.get(size2).intValue());
        }
    }

    private void writeInt32List_Internal(int i, com.google.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i, intArrayList.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeFixed32List_Internal(i, (com.google.protobuf.IntArrayList) list, z);
        } else {
            writeFixed32List_Internal(i, list, z);
        }
    }

    private void writeFixed32List_Internal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i, list.get(size2).intValue());
        }
    }

    private void writeFixed32List_Internal(int i, com.google.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i, intArrayList.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        writeUInt64List(i, list, z);
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeUInt64List_Internal(i, (com.google.protobuf.LongArrayList) list, z);
        } else {
            writeUInt64List_Internal(i, list, z);
        }
    }

    private void writeUInt64List_Internal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i, list.get(size2).longValue());
        }
    }

    private void writeUInt64List_Internal(int i, com.google.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i, longArrayList.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeFixed64List_Internal(i, (com.google.protobuf.LongArrayList) list, z);
        } else {
            writeFixed64List_Internal(i, list, z);
        }
    }

    private void writeFixed64List_Internal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i, list.get(size2).longValue());
        }
    }

    private void writeFixed64List_Internal(int i, com.google.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i, longArrayList.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.FloatArrayList) {
            writeFloatList_Internal(i, (com.google.protobuf.FloatArrayList) list, z);
        } else {
            writeFloatList_Internal(i, list, z);
        }
    }

    private void writeFloatList_Internal(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(java.lang.Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(i, list.get(size2).floatValue());
        }
    }

    private void writeFloatList_Internal(int i, com.google.protobuf.FloatArrayList floatArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(java.lang.Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i, floatArrayList.getFloat(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.DoubleArrayList) {
            writeDoubleList_Internal(i, (com.google.protobuf.DoubleArrayList) list, z);
        } else {
            writeDoubleList_Internal(i, list, z);
        }
    }

    private void writeDoubleList_Internal(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(java.lang.Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(i, list.get(size2).doubleValue());
        }
    }

    private void writeDoubleList_Internal(int i, com.google.protobuf.DoubleArrayList doubleArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(java.lang.Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i, doubleArrayList.getDouble(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        writeInt32List(i, list, z);
    }

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.BooleanArrayList) {
            writeBoolList_Internal(i, (com.google.protobuf.BooleanArrayList) list, z);
        } else {
            writeBoolList_Internal(i, list, z);
        }
    }

    private void writeBoolList_Internal(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.get(size).booleanValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(i, list.get(size2).booleanValue());
        }
    }

    private void writeBoolList_Internal(int i, com.google.protobuf.BooleanArrayList booleanArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i, booleanArrayList.getBoolean(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LazyStringList) {
            com.google.protobuf.LazyStringList lazyStringList = (com.google.protobuf.LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                writeLazyString(i, lazyStringList.getRaw(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeString(i, list.get(size2));
        }
    }

    private void writeLazyString(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            writeString(i, (java.lang.String) obj);
        } else {
            writeBytes(i, (com.google.protobuf.ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i, java.util.List<com.google.protobuf.ByteString> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeUInt32List_Internal(i, (com.google.protobuf.IntArrayList) list, z);
        } else {
            writeUInt32List_Internal(i, list, z);
        }
    }

    private void writeUInt32List_Internal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i, list.get(size2).intValue());
        }
    }

    private void writeUInt32List_Internal(int i, com.google.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i, intArrayList.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        writeFixed32List(i, list, z);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        writeFixed64List(i, list, z);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.IntArrayList) {
            writeSInt32List_Internal(i, (com.google.protobuf.IntArrayList) list, z);
        } else {
            writeSInt32List_Internal(i, list, z);
        }
    }

    private void writeSInt32List_Internal(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i, list.get(size2).intValue());
        }
    }

    private void writeSInt32List_Internal(int i, com.google.protobuf.IntArrayList intArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i, intArrayList.getInt(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (list instanceof com.google.protobuf.LongArrayList) {
            writeSInt64List_Internal(i, (com.google.protobuf.LongArrayList) list, z);
        } else {
            writeSInt64List_Internal(i, list, z);
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void writeMap(int i, com.google.protobuf.MapEntryLite.Metadata<K, V> metadata, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
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

    static final void writeMapEntryField(com.google.protobuf.Writer writer, int i, com.google.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (com.google.protobuf.BinaryWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i, ((java.lang.Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i, ((java.lang.Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i, ((java.lang.Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i, ((java.lang.Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i, ((java.lang.Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i, ((java.lang.Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i, ((java.lang.Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i, ((java.lang.Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i, ((java.lang.Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i, (java.lang.String) obj);
                return;
            case 11:
                writer.writeUInt32(i, ((java.lang.Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i, ((java.lang.Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i, ((java.lang.Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i, ((java.lang.Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i, obj);
                return;
            case 16:
                writer.writeBytes(i, (com.google.protobuf.ByteString) obj);
                return;
            case 17:
                if (obj instanceof com.google.protobuf.Internal.EnumLite) {
                    writer.writeEnum(i, ((com.google.protobuf.Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (obj instanceof java.lang.Integer) {
                        writer.writeEnum(i, ((java.lang.Integer) obj).intValue());
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new java.lang.IllegalArgumentException("Unsupported map value type for: ".concat(java.lang.String.valueOf(fieldType)));
        }
    }

    private void writeSInt64List_Internal(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i, list.get(size2).longValue());
        }
    }

    private void writeSInt64List_Internal(int i, com.google.protobuf.LongArrayList longArrayList, boolean z) throws java.io.IOException {
        if (z) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i, longArrayList.getLong(size2));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int i, java.util.List<?> list) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    @java.lang.Deprecated
    public final void writeGroupList(int i, java.util.List<?> list, com.google.protobuf.Schema schema) throws java.io.IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i, list.get(size), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i, java.lang.Object obj) throws java.io.IOException {
        writeTag(1, 4);
        if (obj instanceof com.google.protobuf.ByteString) {
            writeBytes(3, (com.google.protobuf.ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i);
        writeTag(1, 3);
    }

    final com.google.protobuf.AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    final com.google.protobuf.AllocatedBuffer newHeapBuffer(int i) {
        return this.alloc.allocateHeapBuffer(java.lang.Math.max(i, this.chunkSize));
    }

    final com.google.protobuf.AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final com.google.protobuf.AllocatedBuffer newDirectBuffer(int i) {
        return this.alloc.allocateDirectBuffer(java.lang.Math.max(i, this.chunkSize));
    }

    static final class SafeHeapWriter extends com.google.protobuf.BinaryWriter {
        private com.google.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
            super(bufferAllocator, i, null);
            nextBuffer();
        }

        @Override // com.google.protobuf.BinaryWriter
        final void finishCurrentBuffer() {
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

        private void nextBuffer(int i) {
            nextBuffer(newHeapBuffer(i));
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
        public final int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        final int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        final int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i, int i2) throws java.io.IOException {
            requireSpace(10);
            writeVarint32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i, int i2) throws java.io.IOException {
            requireSpace(15);
            writeInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i, int i2) throws java.io.IOException {
            requireSpace(10);
            writeSInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i, int i2) throws java.io.IOException {
            requireSpace(9);
            writeFixed32(i2);
            writeTag(i, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i, long j) throws java.io.IOException {
            requireSpace(15);
            writeVarint64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i, long j) throws java.io.IOException {
            requireSpace(15);
            writeSInt64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i, long j) throws java.io.IOException {
            requireSpace(13);
            writeFixed64(j);
            writeTag(i, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i, boolean z) throws java.io.IOException {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i, java.lang.String str) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBytes(int i, com.google.protobuf.ByteString byteString) throws java.io.IOException {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
            writeTag(i, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 4);
            schema.writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeStartGroup(int i) {
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeEndGroup(int i) {
            writeTag(i, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeInt32(int i) {
            if (i >= 0) {
                writeVarint32(i);
            } else {
                writeVarint64(i);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt32(int i) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt64(long j) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeTag(int i, int i2) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint32(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                writeVarint32OneByte(i);
                return;
            }
            if ((i & (-16384)) == 0) {
                writeVarint32TwoBytes(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                writeVarint32ThreeBytes(i);
            } else if (((-268435456) & i) == 0) {
                writeVarint32FourBytes(i);
            } else {
                writeVarint32FiveBytes(i);
            }
        }

        private void writeVarint32OneByte(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            bArr[i2] = (byte) i;
        }

        private void writeVarint32TwoBytes(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            bArr[i2] = (byte) (i >>> 7);
            this.pos = i2 - 2;
            bArr[i2 - 1] = (byte) ((i & 127) | 128);
        }

        private void writeVarint32ThreeBytes(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            bArr[i2] = (byte) (i >>> 14);
            bArr[i2 - 1] = (byte) (((i >>> 7) & 127) | 128);
            this.pos = i2 - 3;
            bArr[i2 - 2] = (byte) ((i & 127) | 128);
        }

        private void writeVarint32FourBytes(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            bArr[i2] = (byte) (i >>> 21);
            bArr[i2 - 1] = (byte) (((i >>> 14) & 127) | 128);
            bArr[i2 - 2] = (byte) (((i >>> 7) & 127) | 128);
            this.pos = i2 - 4;
            bArr[i2 - 3] = (byte) ((i & 127) | 128);
        }

        private void writeVarint32FiveBytes(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            bArr[i2] = (byte) (i >>> 28);
            bArr[i2 - 1] = (byte) (((i >>> 21) & 127) | 128);
            bArr[i2 - 2] = (byte) (((i >>> 14) & 127) | 128);
            bArr[i2 - 3] = (byte) (((i >>> 7) & 127) | 128);
            this.pos = i2 - 5;
            bArr[i2 - 4] = (byte) ((i & 127) | 128);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint64(long j) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(j)) {
                case 1:
                    writeVarint64OneByte(j);
                    break;
                case 2:
                    writeVarint64TwoBytes(j);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j);
                    break;
                case 4:
                    writeVarint64FourBytes(j);
                    break;
                case 5:
                    writeVarint64FiveBytes(j);
                    break;
                case 6:
                    writeVarint64SixBytes(j);
                    break;
                case 7:
                    writeVarint64SevenBytes(j);
                    break;
                case 8:
                    writeVarint64EightBytes(j);
                    break;
                case 9:
                    writeVarint64NineBytes(j);
                    break;
                case 10:
                    writeVarint64TenBytes(j);
                    break;
            }
        }

        private void writeVarint64OneByte(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            bArr[i] = (byte) j;
        }

        private void writeVarint64TwoBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 7);
            this.pos = i - 2;
            bArr[i - 1] = (byte) ((((int) j) & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (((int) j) >>> 14);
            bArr[i - 1] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 3;
            bArr[i - 2] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64FourBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 21);
            bArr[i - 1] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 4;
            bArr[i - 3] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 28);
            bArr[i - 1] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 5;
            bArr[i - 4] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64SixBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 35);
            bArr[i - 1] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 6;
            bArr[i - 5] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64SevenBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 42);
            bArr[i - 1] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 7;
            bArr[i - 6] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64EightBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 49);
            bArr[i - 1] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 8;
            bArr[i - 7] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64NineBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 56);
            bArr[i - 1] = (byte) (((j >>> 49) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 7] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 9;
            bArr[i - 8] = (byte) ((j & 127) | 128);
        }

        private void writeVarint64TenBytes(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (j >>> 63);
            bArr[i - 1] = (byte) (((j >>> 56) & 127) | 128);
            bArr[i - 2] = (byte) (((j >>> 49) & 127) | 128);
            bArr[i - 3] = (byte) (((j >>> 42) & 127) | 128);
            bArr[i - 4] = (byte) (((j >>> 35) & 127) | 128);
            bArr[i - 5] = (byte) (((j >>> 28) & 127) | 128);
            bArr[i - 6] = (byte) (((j >>> 21) & 127) | 128);
            bArr[i - 7] = (byte) (((j >>> 14) & 127) | 128);
            bArr[i - 8] = (byte) (((j >>> 7) & 127) | 128);
            this.pos = i - 10;
            bArr[i - 9] = (byte) ((j & 127) | 128);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed32(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            bArr[i2] = (byte) ((i >> 24) & 255);
            bArr[i2 - 1] = (byte) ((i >> 16) & 255);
            bArr[i2 - 2] = (byte) ((i >> 8) & 255);
            this.pos = i2 - 4;
            bArr[i2 - 3] = (byte) (i & 255);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed64(long j) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            bArr[i - 1] = (byte) (((int) (j >> 48)) & 255);
            bArr[i - 2] = (byte) (((int) (j >> 40)) & 255);
            bArr[i - 3] = (byte) (((int) (j >> 32)) & 255);
            bArr[i - 4] = (byte) (((int) (j >> 24)) & 255);
            bArr[i - 5] = (byte) (((int) (j >> 16)) & 255);
            bArr[i - 6] = (byte) (((int) (j >> 8)) & 255);
            this.pos = i - 8;
            bArr[i - 7] = (byte) (((int) j) & 255);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeString(java.lang.String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
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
                    bArr3[i - 2] = (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (java.lang.Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = java.lang.Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.buffer;
                                int i4 = this.pos;
                                bArr4[i4] = (byte) ((codePoint & 63) | 128);
                                bArr4[i4 - 1] = (byte) (((codePoint >>> 6) & 63) | 128);
                                bArr4[i4 - 2] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i4 - 4;
                                bArr4[i4 - 3] = (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
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
        public final void write(byte b) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            bArr[i] = b;
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
            int i3 = this.pos - i2;
            this.pos = i3;
            java.lang.System.arraycopy(bArr, i, this.buffer, i3 + 1, i2);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                this.totalDoneBytes += i2;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(bArr, i, i2));
                nextBuffer();
            } else {
                int i3 = this.pos - i2;
                this.pos = i3;
                java.lang.System.arraycopy(bArr, i, this.buffer, i3 + 1, i2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i = this.pos - remaining;
            this.pos = i;
            byteBuffer.get(this.buffer, i + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i = this.pos - remaining;
            this.pos = i;
            byteBuffer.get(this.buffer, i + 1, remaining);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void requireSpace(int i) {
            if (spaceLeft() < i) {
                nextBuffer(i);
            }
        }
    }

    static final class UnsafeHeapWriter extends com.google.protobuf.BinaryWriter {
        private com.google.protobuf.AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
            super(bufferAllocator, i, null);
            nextBuffer();
        }

        static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeArrayOperations();
        }

        @Override // com.google.protobuf.BinaryWriter
        final void finishCurrentBuffer() {
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

        private void nextBuffer(int i) {
            nextBuffer(newHeapBuffer(i));
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
        public final int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        final int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        final int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i, int i2) {
            requireSpace(10);
            writeVarint32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i, int i2) {
            requireSpace(15);
            writeInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i, int i2) {
            requireSpace(10);
            writeSInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i, int i2) {
            requireSpace(9);
            writeFixed32(i2);
            writeTag(i, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i, long j) {
            requireSpace(15);
            writeVarint64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i, long j) {
            requireSpace(15);
            writeSInt64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i, long j) {
            requireSpace(13);
            writeFixed64(j);
            writeTag(i, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i, java.lang.String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBytes(int i, com.google.protobuf.ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
            writeTag(i, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 4);
            schema.writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeStartGroup(int i) {
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeEndGroup(int i) {
            writeTag(i, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeInt32(int i) {
            if (i >= 0) {
                writeVarint32(i);
            } else {
                writeVarint64(i);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt32(int i) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt64(long j) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeTag(int i, int i2) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint32(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                writeVarint32OneByte(i);
                return;
            }
            if ((i & (-16384)) == 0) {
                writeVarint32TwoBytes(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                writeVarint32ThreeBytes(i);
            } else if (((-268435456) & i) == 0) {
                writeVarint32FourBytes(i);
            } else {
                writeVarint32FiveBytes(i);
            }
        }

        private void writeVarint32OneByte(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) i);
        }

        private void writeVarint32TwoBytes(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (i >>> 7));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) ((i & 127) | 128));
        }

        private void writeVarint32ThreeBytes(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (i >>> 14));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((i & 127) | 128));
        }

        private void writeVarint32FourBytes(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (i >>> 21));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) ((i & 127) | 128));
        }

        private void writeVarint32FiveBytes(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) (i >>> 28));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) (((i >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) (((i >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (((i >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j5, (byte) ((i & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint64(long j) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(j)) {
                case 1:
                    writeVarint64OneByte(j);
                    break;
                case 2:
                    writeVarint64TwoBytes(j);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j);
                    break;
                case 4:
                    writeVarint64FourBytes(j);
                    break;
                case 5:
                    writeVarint64FiveBytes(j);
                    break;
                case 6:
                    writeVarint64SixBytes(j);
                    break;
                case 7:
                    writeVarint64SevenBytes(j);
                    break;
                case 8:
                    writeVarint64EightBytes(j);
                    break;
                case 9:
                    writeVarint64NineBytes(j);
                    break;
                case 10:
                    writeVarint64TenBytes(j);
                    break;
            }
        }

        private void writeVarint64OneByte(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) j);
        }

        private void writeVarint64TwoBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 7));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) ((((int) j) & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (((int) j) >>> 14));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) ((j & 127) | 128));
        }

        private void writeVarint64FourBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 21));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) ((j & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 28));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) ((j & 127) | 128));
        }

        private void writeVarint64SixBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 35));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) ((j & 127) | 128));
        }

        private void writeVarint64SevenBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 42));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j8, (byte) ((j & 127) | 128));
        }

        private void writeVarint64EightBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 49));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j8, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j9, (byte) ((j & 127) | 128));
        }

        private void writeVarint64NineBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 56));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j8, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j9, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr9, j10, (byte) ((j & 127) | 128));
        }

        private void writeVarint64TenBytes(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (j >>> 63));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((j >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((j >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((j >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((j >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) (((j >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j8, (byte) (((j >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j9, (byte) (((j >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr9, j10, (byte) (((j >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr10, j11, (byte) ((j & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed32(int i) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) ((i >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j2, (byte) ((i >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j3, (byte) ((i >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j4, (byte) (i & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed64(long j) {
            byte[] bArr = this.buffer;
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j2, (byte) (((int) (j >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr2, j3, (byte) (((int) (j >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr3, j4, (byte) (((int) (j >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr4, j5, (byte) (((int) (j >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr5, j6, (byte) (((int) (j >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr6, j7, (byte) (((int) (j >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr7, j8, (byte) (((int) (j >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr8, j9, (byte) (((int) j) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeString(java.lang.String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j = this.pos;
                this.pos = j - 1;
                com.google.protobuf.UnsafeUtil.putByte(bArr, j, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
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
                            com.google.protobuf.UnsafeUtil.putByte(bArr7, j7, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                            length--;
                        }
                    }
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
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
                                com.google.protobuf.UnsafeUtil.putByte(bArr11, j11, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                    length--;
                }
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte b) {
            byte[] bArr = this.buffer;
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(bArr, j, b);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            requireSpace(i2);
            this.pos -= i2;
            java.lang.System.arraycopy(bArr, i, this.buffer, arrayPos() + 1, i2);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("value.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            if (spaceLeft() < i2) {
                this.totalDoneBytes += i2;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(bArr, i, i2));
                nextBuffer();
            } else {
                this.pos -= i2;
                java.lang.System.arraycopy(bArr, i, this.buffer, arrayPos() + 1, i2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            requireSpace(remaining);
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void requireSpace(int i) {
            if (spaceLeft() < i) {
                nextBuffer(i);
            }
        }
    }

    static final class SafeDirectWriter extends com.google.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
            super(bufferAllocator, i, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int i) {
            nextBuffer(newDirectBuffer(i));
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
        public final int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        @Override // com.google.protobuf.BinaryWriter
        final void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                com.google.protobuf.Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i, int i2) {
            requireSpace(10);
            writeVarint32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i, int i2) {
            requireSpace(15);
            writeInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i, int i2) {
            requireSpace(10);
            writeSInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i, int i2) {
            requireSpace(9);
            writeFixed32(i2);
            writeTag(i, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i, long j) {
            requireSpace(15);
            writeVarint64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i, long j) {
            requireSpace(15);
            writeSInt64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i, long j) {
            requireSpace(13);
            writeFixed64(j);
            writeTag(i, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i, java.lang.String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBytes(int i, com.google.protobuf.ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
            writeTag(i, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 4);
            schema.writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeStartGroup(int i) {
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeEndGroup(int i) {
            writeTag(i, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeInt32(int i) {
            if (i >= 0) {
                writeVarint32(i);
            } else {
                writeVarint64(i);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt32(int i) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt64(long j) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeTag(int i, int i2) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint32(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                writeVarint32OneByte(i);
                return;
            }
            if ((i & (-16384)) == 0) {
                writeVarint32TwoBytes(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                writeVarint32ThreeBytes(i);
            } else if (((-268435456) & i) == 0) {
                writeVarint32FourBytes(i);
            } else {
                writeVarint32FiveBytes(i);
            }
        }

        private void writeVarint32OneByte(int i) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) i);
        }

        private void writeVarint32TwoBytes(int i) {
            int i2 = this.pos;
            this.pos = i2 - 2;
            this.buffer.putShort(i2 - 1, (short) (((i & 16256) << 1) | (i & 127) | 128));
        }

        private void writeVarint32ThreeBytes(int i) {
            int i2 = this.pos - 3;
            this.pos = i2;
            this.buffer.putInt(i2, (((i & 16256) | 16384) << 9) | ((2080768 & i) << 10) | (((i & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int i) {
            int i2 = this.pos;
            this.pos = i2 - 4;
            this.buffer.putInt(i2 - 3, (((i & 16256) | 16384) << 1) | ((266338304 & i) << 3) | (((2080768 & i) | 2097152) << 2) | (i & 127) | 128);
        }

        private void writeVarint32FiveBytes(int i) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer.put(i2, (byte) (i >>> 28));
            int i3 = this.pos;
            this.pos = i3 - 4;
            this.buffer.putInt(i3 - 3, ((((i >>> 7) & 127) | 128) << 8) | ((((i >>> 21) & 127) | 128) << 24) | ((((i >>> 14) & 127) | 128) << 16) | (i & 127) | 128);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint64(long j) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(j)) {
                case 1:
                    writeVarint64OneByte(j);
                    break;
                case 2:
                    writeVarint64TwoBytes(j);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j);
                    break;
                case 4:
                    writeVarint64FourBytes(j);
                    break;
                case 5:
                    writeVarint64FiveBytes(j);
                    break;
                case 6:
                    writeVarint64SixBytes(j);
                    break;
                case 7:
                    writeVarint64SevenBytes(j);
                    break;
                case 8:
                    writeVarint64EightBytes(j);
                    break;
                case 9:
                    writeVarint64NineBytes(j);
                    break;
                case 10:
                    writeVarint64TenBytes(j);
                    break;
            }
        }

        private void writeVarint64OneByte(long j) {
            writeVarint32OneByte((int) j);
        }

        private void writeVarint64TwoBytes(long j) {
            writeVarint32TwoBytes((int) j);
        }

        private void writeVarint64ThreeBytes(long j) {
            writeVarint32ThreeBytes((int) j);
        }

        private void writeVarint64FourBytes(long j) {
            writeVarint32FourBytes((int) j);
        }

        private void writeVarint64FiveBytes(long j) {
            int i = this.pos;
            this.pos = i - 5;
            this.buffer.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 25) | ((34091302912L & j) << 28) | (((266338304 & j) | 268435456) << 27) | (((2080768 & j) | 2097152) << 26) | (((127 & j) | 128) << 24));
        }

        private void writeVarint64SixBytes(long j) {
            int i = this.pos;
            this.pos = i - 6;
            this.buffer.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 17) | ((4363686772736L & j) << 21) | (((34091302912L & j) | 34359738368L) << 20) | (((266338304 & j) | 268435456) << 19) | (((2080768 & j) | 2097152) << 18) | (((127 & j) | 128) << 16));
        }

        private void writeVarint64SevenBytes(long j) {
            int i = this.pos - 7;
            this.pos = i;
            this.buffer.putLong(i, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 9) | ((558551906910208L & j) << 14) | (((4363686772736L & j) | 4398046511104L) << 13) | (((34091302912L & j) | 34359738368L) << 12) | (((266338304 & j) | 268435456) << 11) | (((2080768 & j) | 2097152) << 10) | (((127 & j) | 128) << 8));
        }

        private void writeVarint64EightBytes(long j) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 1) | ((71494644084506624L & j) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (127 & j) | 128);
        }

        private void writeVarint64EightBytesWithSign(long j) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, (((j & 16256) | okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) << 1) | (((71494644084506624L & j) | 72057594037927936L) << 7) | (((558551906910208L & j) | 562949953421312L) << 6) | (((4363686772736L & j) | 4398046511104L) << 5) | (((34091302912L & j) | 34359738368L) << 4) | (((266338304 & j) | 268435456) << 3) | (((2080768 & j) | 2097152) << 2) | (127 & j) | 128);
        }

        private void writeVarint64NineBytes(long j) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) (j >>> 56));
            writeVarint64EightBytesWithSign(j & 72057594037927935L);
        }

        private void writeVarint64TenBytes(long j) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, (byte) (j >>> 63));
            java.nio.ByteBuffer byteBuffer2 = this.buffer;
            int i2 = this.pos;
            this.pos = i2 - 1;
            byteBuffer2.put(i2, (byte) (((j >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j & 72057594037927935L);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed32(int i) {
            int i2 = this.pos;
            this.pos = i2 - 4;
            this.buffer.putInt(i2 - 3, i);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed64(long j) {
            int i = this.pos;
            this.pos = i - 8;
            this.buffer.putLong(i - 7, j);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeString(java.lang.String str) {
            int i;
            int i2;
            int i3;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
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
                    byteBuffer6.put(i6, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
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
                                byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
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
        public final void write(byte b) {
            java.nio.ByteBuffer byteBuffer = this.buffer;
            int i = this.pos;
            this.pos = i - 1;
            byteBuffer.put(i, b);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
            int i3 = this.pos - i2;
            this.pos = i3;
            com.google.protobuf.Java8Compatibility.position(this.buffer, i3 + 1);
            this.buffer.put(bArr, i, i2);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                this.totalDoneBytes += i2;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(bArr, i, i2));
                nextBuffer();
            } else {
                int i3 = this.pos - i2;
                this.pos = i3;
                com.google.protobuf.Java8Compatibility.position(this.buffer, i3 + 1);
                this.buffer.put(bArr, i, i2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i = this.pos - remaining;
            this.pos = i;
            com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i = this.pos - remaining;
                this.pos = i;
                com.google.protobuf.Java8Compatibility.position(this.buffer, i + 1);
                this.buffer.put(byteBuffer);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void requireSpace(int i) {
            if (spaceLeft() < i) {
                nextBuffer(i);
            }
        }
    }

    static final class UnsafeDirectWriter extends com.google.protobuf.BinaryWriter {
        private java.nio.ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(com.google.protobuf.BufferAllocator bufferAllocator, int i) {
            super(bufferAllocator, i, null);
            nextBuffer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private void nextBuffer(int i) {
            nextBuffer(newDirectBuffer(i));
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
        public final int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        @Override // com.google.protobuf.BinaryWriter
        final void finishCurrentBuffer() {
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
        public final void writeUInt32(int i, int i2) {
            requireSpace(10);
            writeVarint32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i, int i2) {
            requireSpace(15);
            writeInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i, int i2) {
            requireSpace(10);
            writeSInt32(i2);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i, int i2) {
            requireSpace(9);
            writeFixed32(i2);
            writeTag(i, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i, long j) {
            requireSpace(15);
            writeVarint64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i, long j) {
            requireSpace(15);
            writeSInt64(j);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i, long j) {
            requireSpace(13);
            writeFixed64(j);
            writeTag(i, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i, boolean z) {
            requireSpace(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i, java.lang.String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeBytes(int i, com.google.protobuf.ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i, 2);
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten();
            requireSpace(10);
            writeVarint32(totalBytesWritten2 - totalBytesWritten);
            writeTag(i, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj) throws java.io.IOException {
            writeTag(i, 4);
            com.google.protobuf.Protobuf.getInstance().writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeGroup(int i, java.lang.Object obj, com.google.protobuf.Schema schema) throws java.io.IOException {
            writeTag(i, 4);
            schema.writeTo(obj, this);
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeStartGroup(int i) {
            writeTag(i, 3);
        }

        @Override // com.google.protobuf.Writer
        @java.lang.Deprecated
        public final void writeEndGroup(int i) {
            writeTag(i, 4);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeInt32(int i) {
            if (i >= 0) {
                writeVarint32(i);
            } else {
                writeVarint64(i);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt32(int i) {
            writeVarint32(com.google.protobuf.CodedOutputStream.encodeZigZag32(i));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeSInt64(long j) {
            writeVarint64(com.google.protobuf.CodedOutputStream.encodeZigZag64(j));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeBool(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeTag(int i, int i2) {
            writeVarint32(com.google.protobuf.WireFormat.makeTag(i, i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint32(int i) {
            if ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                writeVarint32OneByte(i);
                return;
            }
            if ((i & (-16384)) == 0) {
                writeVarint32TwoBytes(i);
                return;
            }
            if (((-2097152) & i) == 0) {
                writeVarint32ThreeBytes(i);
            } else if (((-268435456) & i) == 0) {
                writeVarint32FourBytes(i);
            } else {
                writeVarint32FiveBytes(i);
            }
        }

        private void writeVarint32OneByte(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) i);
        }

        private void writeVarint32TwoBytes(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (i >>> 7));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((i & 127) | 128));
        }

        private void writeVarint32ThreeBytes(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (i >>> 14));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((i >>> 7) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((i & 127) | 128));
        }

        private void writeVarint32FourBytes(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (i >>> 21));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((i >>> 14) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((i >>> 7) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((i & 127) | 128));
        }

        private void writeVarint32FiveBytes(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) (i >>> 28));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((i >>> 21) & 127) | 128));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((i >>> 14) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((i >>> 7) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) ((i & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeVarint64(long j) {
            switch (com.google.protobuf.BinaryWriter.computeUInt64SizeNoTag(j)) {
                case 1:
                    writeVarint64OneByte(j);
                    break;
                case 2:
                    writeVarint64TwoBytes(j);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j);
                    break;
                case 4:
                    writeVarint64FourBytes(j);
                    break;
                case 5:
                    writeVarint64FiveBytes(j);
                    break;
                case 6:
                    writeVarint64SixBytes(j);
                    break;
                case 7:
                    writeVarint64SevenBytes(j);
                    break;
                case 8:
                    writeVarint64EightBytes(j);
                    break;
                case 9:
                    writeVarint64NineBytes(j);
                    break;
                case 10:
                    writeVarint64TenBytes(j);
                    break;
            }
        }

        private void writeVarint64OneByte(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) j);
        }

        private void writeVarint64TwoBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 7));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((((int) j) & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((int) j) >>> 14));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 7) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) ((j & 127) | 128));
        }

        private void writeVarint64FourBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 21));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 14) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 7) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) ((j & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 28));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 21) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 14) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 7) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) ((j & 127) | 128));
        }

        private void writeVarint64SixBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 35));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 28) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 21) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 14) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((j >>> 7) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) ((j & 127) | 128));
        }

        private void writeVarint64SevenBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 42));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 35) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 28) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 21) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((j >>> 14) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((j >>> 7) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) ((j & 127) | 128));
        }

        private void writeVarint64EightBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 49));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 42) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 35) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 28) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((j >>> 21) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((j >>> 14) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((j >>> 7) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) ((j & 127) | 128));
        }

        private void writeVarint64NineBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 56));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 49) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 42) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 35) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((j >>> 28) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((j >>> 21) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((j >>> 14) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) (((j >>> 7) & 127) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j10, (byte) ((j & 127) | 128));
        }

        private void writeVarint64TenBytes(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (j >>> 63));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((j >>> 56) & 127) | 128));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((j >>> 49) & 127) | 128));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((j >>> 42) & 127) | 128));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((j >>> 35) & 127) | 128));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((j >>> 28) & 127) | 128));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((j >>> 21) & 127) | 128));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) (((j >>> 14) & 127) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j10, (byte) (((j >>> 7) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j11, (byte) ((j & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed32(int i) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, (byte) ((i >> 24) & 255));
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) ((i >> 16) & 255));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) ((i >> 8) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (i & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeFixed64(long j) {
            long j2 = this.pos;
            this.pos = j2 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.pos;
            this.pos = j3 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.pos;
            this.pos = j4 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.pos;
            this.pos = j5 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.pos;
            this.pos = j6 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.pos;
            this.pos = j7 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.pos;
            this.pos = j8 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.pos;
            this.pos = j9 - 1;
            com.google.protobuf.UnsafeUtil.putByte(j9, (byte) (((int) j) & 255));
        }

        @Override // com.google.protobuf.BinaryWriter
        final void writeString(java.lang.String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j = this.pos;
                this.pos = j - 1;
                com.google.protobuf.UnsafeUtil.putByte(j, (byte) charAt);
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
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
                            com.google.protobuf.UnsafeUtil.putByte(j7, (byte) ((charAt2 >>> '\f') | androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
                            length--;
                        }
                    }
                    if (this.pos > this.bufferOffset + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
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
                                com.google.protobuf.UnsafeUtil.putByte(j11, (byte) ((codePoint >>> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                            }
                        }
                        throw new com.google.protobuf.Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                    length--;
                }
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte b) {
            long j = this.pos;
            this.pos = j - 1;
            com.google.protobuf.UnsafeUtil.putByte(j, b);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                nextBuffer(i2);
            }
            this.pos -= i2;
            com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(bArr, i, i2);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i, int i2) {
            if (spaceLeft() < i2) {
                this.totalDoneBytes += i2;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(bArr, i, i2));
                nextBuffer();
            } else {
                this.pos -= i2;
                com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(bArr, i, i2);
            }
        }

        @Override // com.google.protobuf.ByteOutput
        public final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            this.pos -= remaining;
            com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.protobuf.ByteOutput
        public final void writeLazy(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(com.google.protobuf.AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= remaining;
                com.google.protobuf.Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        final void requireSpace(int i) {
            if (spaceLeft() < i) {
                nextBuffer(i);
            }
        }
    }
}
