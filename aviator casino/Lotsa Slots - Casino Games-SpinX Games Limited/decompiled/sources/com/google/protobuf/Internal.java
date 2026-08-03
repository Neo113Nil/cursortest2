package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER;
    public static final com.google.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final java.nio.charset.Charset US_ASCII = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends com.google.protobuf.Internal.EnumLite> {
        T findValueByNumber(int number);
    }

    public interface EnumVerifier {
        boolean isInRange(int number);
    }

    public interface ProtobufList<E> extends java.util.List<E>, java.util.RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        com.google.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity(int capacity);
    }

    public static int hashBoolean(boolean b) {
        return b ? 1231 : 1237;
    }

    public static int hashLong(long n) {
        return (int) (n ^ (n >>> 32));
    }

    private Internal() {
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = java.nio.ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = com.google.protobuf.CodedInputStream.newInstance(bArr);
    }

    static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    static <T> T checkNotNull(T obj, java.lang.String message) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(message);
    }

    public static java.lang.String stringDefaultValue(java.lang.String bytes) {
        return new java.lang.String(bytes.getBytes(ISO_8859_1), UTF_8);
    }

    public static com.google.protobuf.ByteString bytesDefaultValue(java.lang.String bytes) {
        return com.google.protobuf.ByteString.copyFrom(bytes.getBytes(ISO_8859_1));
    }

    public static byte[] byteArrayDefaultValue(java.lang.String bytes) {
        return bytes.getBytes(ISO_8859_1);
    }

    public static java.nio.ByteBuffer byteBufferDefaultValue(java.lang.String bytes) {
        return java.nio.ByteBuffer.wrap(byteArrayDefaultValue(bytes));
    }

    public static java.nio.ByteBuffer copyByteBuffer(java.nio.ByteBuffer source) {
        java.nio.ByteBuffer duplicate = source.duplicate();
        duplicate.clear();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean isValidUtf8(com.google.protobuf.ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] byteArray) {
        return com.google.protobuf.Utf8.isValidUtf8(byteArray);
    }

    public static byte[] toByteArray(java.lang.String value) {
        return value.getBytes(UTF_8);
    }

    public static java.lang.String toStringUtf8(byte[] bytes) {
        return new java.lang.String(bytes, UTF_8);
    }

    public static int hashEnum(com.google.protobuf.Internal.EnumLite e) {
        return e.getNumber();
    }

    public static int hashEnumList(java.util.List<? extends com.google.protobuf.Internal.EnumLite> list) {
        java.util.Iterator<? extends com.google.protobuf.Internal.EnumLite> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashEnum(it.next());
        }
        return i;
    }

    public static boolean equals(java.util.List<byte[]> a2, java.util.List<byte[]> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!java.util.Arrays.equals(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(java.util.List<byte[]> list) {
        java.util.Iterator<byte[]> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashCode(it.next());
        }
        return i;
    }

    public static int hashCode(byte[] bytes) {
        return hashCode(bytes, 0, bytes.length);
    }

    static int hashCode(byte[] bytes, int offset, int length) {
        int partialHash = partialHash(length, bytes, offset, length);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }

    static int partialHash(int h, byte[] bytes, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + bytes[i];
        }
        return h;
    }

    public static boolean equalsByteBuffer(java.nio.ByteBuffer a2, java.nio.ByteBuffer b) {
        if (a2.capacity() != b.capacity()) {
            return false;
        }
        java.nio.ByteBuffer duplicate = a2.duplicate();
        com.google.protobuf.Java8Compatibility.clear(duplicate);
        java.nio.ByteBuffer duplicate2 = b.duplicate();
        com.google.protobuf.Java8Compatibility.clear(duplicate2);
        return duplicate.equals(duplicate2);
    }

    public static boolean equalsByteBuffer(java.util.List<java.nio.ByteBuffer> a2, java.util.List<java.nio.ByteBuffer> b) {
        if (a2.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!equalsByteBuffer(a2.get(i), b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeByteBuffer(java.util.List<java.nio.ByteBuffer> list) {
        java.util.Iterator<java.nio.ByteBuffer> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashCodeByteBuffer(it.next());
        }
        return i;
    }

    public static int hashCodeByteBuffer(java.nio.ByteBuffer bytes) {
        if (bytes.hasArray()) {
            int partialHash = partialHash(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        java.nio.ByteBuffer duplicate = bytes.duplicate();
        com.google.protobuf.Java8Compatibility.clear(duplicate);
        int capacity2 = bytes.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static <T extends com.google.protobuf.MessageLite> T getDefaultInstance(java.lang.Class<T> clazz) {
        try {
            java.lang.reflect.Method method = clazz.getMethod("getDefaultInstance", new java.lang.Class[0]);
            return (T) method.invoke(method, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to get default instance for " + clazz, e);
        }
    }

    static java.lang.Object mergeMessage(java.lang.Object destination, java.lang.Object source) {
        return ((com.google.protobuf.MessageLite) destination).toBuilder().mergeFrom((com.google.protobuf.MessageLite) source).buildPartial();
    }

    public static class ListAdapter<F, T> extends java.util.AbstractList<T> {
        private final com.google.protobuf.Internal.ListAdapter.Converter<F, T> converter;
        private final java.util.List<F> fromList;

        public interface Converter<F, T> {
            T convert(F from);
        }

        public ListAdapter(java.util.List<F> fromList, com.google.protobuf.Internal.ListAdapter.Converter<F, T> converter) {
            this.fromList = fromList;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.converter.convert(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class MapAdapter<K, V, RealValue> extends java.util.AbstractMap<K, V> {
        private final java.util.Map<K, RealValue> realMap;
        private final com.google.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter;

        public interface Converter<A, B> {
            A doBackward(B object);

            B doForward(A object);
        }

        public static <T extends com.google.protobuf.Internal.EnumLite> com.google.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T> newEnumConverter(final com.google.protobuf.Internal.EnumLiteMap<T> enumLiteMap, final T t) {
            return (com.google.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>) new com.google.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>() { // from class: com.google.protobuf.Internal.MapAdapter.1
                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public com.google.protobuf.Internal.EnumLite doForward(java.lang.Integer value) {
                    com.google.protobuf.Internal.EnumLite findValueByNumber = com.google.protobuf.Internal.EnumLiteMap.this.findValueByNumber(value.intValue());
                    return findValueByNumber == null ? t : findValueByNumber;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // com.google.protobuf.Internal.MapAdapter.Converter
                public java.lang.Integer doBackward(com.google.protobuf.Internal.EnumLite value) {
                    return java.lang.Integer.valueOf(value.getNumber());
                }
            };
        }

        public MapAdapter(java.util.Map<K, RealValue> realMap, com.google.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter) {
            this.realMap = realMap;
            this.valueConverter = valueConverter;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object key) {
            RealValue realvalue = this.realMap.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            java.lang.Object put = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (put == null) {
                return null;
            }
            return (V) this.valueConverter.doForward(put);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return new com.google.protobuf.Internal.MapAdapter.SetAdapter(this.realMap.entrySet());
        }

        private class SetAdapter extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
            private final java.util.Set<java.util.Map.Entry<K, RealValue>> realSet;

            public SetAdapter(java.util.Set<java.util.Map.Entry<K, RealValue>> realSet) {
                this.realSet = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                return new com.google.protobuf.Internal.MapAdapter.IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        private class IteratorAdapter implements java.util.Iterator<java.util.Map.Entry<K, V>> {
            private final java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator) {
                this.realIterator = realIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                return new com.google.protobuf.Internal.MapAdapter.EntryAdapter(this.realIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }
        }

        private class EntryAdapter implements java.util.Map.Entry<K, V> {
            private final java.util.Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(java.util.Map.Entry<K, RealValue> realEntry) {
                this.realEntry = realEntry;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) com.google.protobuf.Internal.MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v) {
                java.lang.Object value = this.realEntry.setValue(com.google.protobuf.Internal.MapAdapter.this.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) com.google.protobuf.Internal.MapAdapter.this.valueConverter.doForward(value);
            }

            @Override // java.util.Map.Entry
            public boolean equals(java.lang.Object o) {
                if (o == this) {
                    return true;
                }
                return (o instanceof java.util.Map.Entry) && getKey().equals(((java.util.Map.Entry) o).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }
        }
    }

    public interface IntList extends com.google.protobuf.Internal.ProtobufList<java.lang.Integer> {
        void addInt(int element);

        int getInt(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        com.google.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity(int capacity);

        int setInt(int index, int element);

        /* renamed from: com.google.protobuf.Internal$IntList$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public interface BooleanList extends com.google.protobuf.Internal.ProtobufList<java.lang.Boolean> {
        void addBoolean(boolean element);

        boolean getBoolean(int index);

        @Override // 
        com.google.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity(int capacity);

        boolean setBoolean(int index, boolean element);

        /* renamed from: com.google.protobuf.Internal$BooleanList$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public interface LongList extends com.google.protobuf.Internal.ProtobufList<java.lang.Long> {
        void addLong(long element);

        long getLong(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        com.google.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity(int capacity);

        long setLong(int index, long element);

        /* renamed from: com.google.protobuf.Internal$LongList$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public interface DoubleList extends com.google.protobuf.Internal.ProtobufList<java.lang.Double> {
        void addDouble(double element);

        double getDouble(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        com.google.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity(int capacity);

        double setDouble(int index, double element);

        /* renamed from: com.google.protobuf.Internal$DoubleList$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public interface FloatList extends com.google.protobuf.Internal.ProtobufList<java.lang.Float> {
        void addFloat(float element);

        float getFloat(int index);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        com.google.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity(int capacity);

        float setFloat(int index, float element);

        /* renamed from: com.google.protobuf.Internal$FloatList$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }
}
