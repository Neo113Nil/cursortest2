package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public final class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER;
    public static final androidx.content.preferences.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI = java.nio.charset.Charset.forName("US-ASCII");
    static final java.nio.charset.Charset getHighSpeedVideoSizes = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset getHighSpeedVideoFpsRangesFor = java.nio.charset.Charset.forName("ISO-8859-1");

    public interface BooleanList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Boolean> mutableCopyWithCapacity2(int i);

        boolean setBoolean(int i, boolean z);
    }

    public interface DoubleList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> {
        void addDouble(double d);

        double getDouble(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Double> mutableCopyWithCapacity2(int i);

        double setDouble(int i, double d);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends androidx.datastore.preferences.protobuf.Internal.EnumLite> {
        T findValueByNumber(int i);
    }

    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    public interface FloatList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> {
        void addFloat(float f);

        float getFloat(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int i);

        float setFloat(int i, float f);
    }

    public interface IntList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> {
        void addInt(int i);

        int getInt(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Integer> mutableCopyWithCapacity2(int i);

        int setInt(int i, int i2);
    }

    public interface LongList extends androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> {
        void addLong(long j);

        long getLong(int i);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.Long> mutableCopyWithCapacity2(int i);

        long setLong(int i, long j);
    }

    public interface ProtobufList<E> extends java.util.List<E>, java.util.RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* renamed from: mutableCopyWithCapacity */
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity2(int i);
    }

    static <T> T Camera2StreamConfigurationMap(T t) {
        return t;
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private Internal() {
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = java.nio.ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = androidx.content.preferences.protobuf.CodedInputStream.newInstance(bArr);
    }

    static <T> T getHighSpeedVideoSizes(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.String stringDefaultValue(java.lang.String str) {
        return new java.lang.String(str.getBytes(getHighSpeedVideoFpsRangesFor), getHighSpeedVideoSizes);
    }

    public static androidx.content.preferences.protobuf.ByteString bytesDefaultValue(java.lang.String str) {
        return androidx.content.preferences.protobuf.ByteString.copyFrom(str.getBytes(getHighSpeedVideoFpsRangesFor));
    }

    public static byte[] byteArrayDefaultValue(java.lang.String str) {
        return str.getBytes(getHighSpeedVideoFpsRangesFor);
    }

    public static java.nio.ByteBuffer byteBufferDefaultValue(java.lang.String str) {
        return java.nio.ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static java.nio.ByteBuffer copyByteBuffer(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean isValidUtf8(androidx.content.preferences.protobuf.ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return androidx.content.preferences.protobuf.Utf8.Camera2StreamConfigurationMap(bArr);
    }

    public static byte[] toByteArray(java.lang.String str) {
        return str.getBytes(getHighSpeedVideoSizes);
    }

    public static java.lang.String toStringUtf8(byte[] bArr) {
        return new java.lang.String(bArr, getHighSpeedVideoSizes);
    }

    public static int hashEnum(androidx.datastore.preferences.protobuf.Internal.EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(java.util.List<? extends androidx.datastore.preferences.protobuf.Internal.EnumLite> list) {
        java.util.Iterator<? extends androidx.datastore.preferences.protobuf.Internal.EnumLite> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + hashEnum(it.next());
        }
        return i;
    }

    public static boolean equals(java.util.List<byte[]> list, java.util.List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals(list.get(i), list2.get(i))) {
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

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static boolean equalsByteBuffer(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
        java.nio.ByteBuffer duplicate2 = byteBuffer2.duplicate();
        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate2);
        return duplicate.equals(duplicate2);
    }

    public static boolean equalsByteBuffer(java.util.List<java.nio.ByteBuffer> list, java.util.List<java.nio.ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!equalsByteBuffer(list.get(i), list2.get(i))) {
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

    public static int hashCodeByteBuffer(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int capacity = byteBuffer.capacity();
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset();
            int capacity2 = byteBuffer.capacity();
            for (int i = arrayOffset; i < arrayOffset + capacity2; i++) {
                capacity = (capacity * 31) + array[i];
            }
            if (capacity == 0) {
                return 1;
            }
            return capacity;
        }
        int capacity3 = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity3];
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoSizes(duplicate);
        int capacity4 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity3 ? duplicate.remaining() : capacity3;
            duplicate.get(bArr, 0, remaining);
            for (int i2 = 0; i2 < remaining; i2++) {
                capacity4 = (capacity4 * 31) + bArr[i2];
            }
        }
        if (capacity4 == 0) {
            return 1;
        }
        return capacity4;
    }

    public static <T extends androidx.content.preferences.protobuf.MessageLite> T getDefaultInstance(java.lang.Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", new java.lang.Class[0]);
            return (T) method.invoke(method, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to get default instance for ".concat(java.lang.String.valueOf(cls)), e);
        }
    }

    static java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.content.preferences.protobuf.MessageLite) obj).toBuilder().mergeFrom((androidx.content.preferences.protobuf.MessageLite) obj2).buildPartial();
    }

    /* loaded from: classes7.dex */
    public static class IntListAdapter<T> extends java.util.AbstractList<T> {
        private final androidx.datastore.preferences.protobuf.Internal.IntList getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.datastore.preferences.protobuf.Internal.IntListAdapter.IntConverter<T> getHighSpeedVideoFpsRanges;

        public interface IntConverter<T> {
            T convert(int i);
        }

        public IntListAdapter(androidx.datastore.preferences.protobuf.Internal.IntList intList, androidx.datastore.preferences.protobuf.Internal.IntListAdapter.IntConverter<T> intConverter) {
            this.getHighResolutionOutputSizeshNQ4ISI = intList;
            this.getHighSpeedVideoFpsRanges = intConverter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.getHighSpeedVideoFpsRanges.convert(this.getHighResolutionOutputSizeshNQ4ISI.getInt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }
    }

    /* loaded from: classes7.dex */
    public static class ListAdapter<F, T> extends java.util.AbstractList<T> {
        private final java.util.List<F> getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.datastore.preferences.protobuf.Internal.ListAdapter.Converter<F, T> getHighSpeedVideoSizes;

        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(java.util.List<F> list, androidx.datastore.preferences.protobuf.Internal.ListAdapter.Converter<F, T> converter) {
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoSizes = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return (T) this.getHighSpeedVideoSizes.convert(this.getHighResolutionOutputSizeshNQ4ISI.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }
    }

    /* loaded from: classes7.dex */
    public static class MapAdapter<K, V, RealValue> extends java.util.AbstractMap<K, V> {
        private final androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<RealValue, V> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.Map<K, RealValue> getHighSpeedVideoFpsRangesFor;

        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a2);
        }

        public static <T extends androidx.datastore.preferences.protobuf.Internal.EnumLite> androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T> newEnumConverter(final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<T> enumLiteMap, final T t) {
            return (androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>) new androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T>() { // from class: androidx.datastore.preferences.protobuf.Internal.MapAdapter.1
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public /* synthetic */ java.lang.Integer doBackward(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) obj).getNumber());
                }

                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public /* synthetic */ java.lang.Object doForward(java.lang.Integer num) {
                    androidx.datastore.preferences.protobuf.Internal.EnumLite findValueByNumber = androidx.datastore.preferences.protobuf.Internal.EnumLiteMap.this.findValueByNumber(num.intValue());
                    return findValueByNumber == null ? t : findValueByNumber;
                }
            };
        }

        public MapAdapter(java.util.Map<K, RealValue> map, androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter<RealValue, V> converter) {
            this.getHighSpeedVideoFpsRangesFor = map;
            this.getHighResolutionOutputSizeshNQ4ISI = converter;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(java.lang.Object obj) {
            RealValue realvalue = this.getHighSpeedVideoFpsRangesFor.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            java.lang.Object put = this.getHighSpeedVideoFpsRangesFor.put(k, this.getHighResolutionOutputSizeshNQ4ISI.doBackward(v));
            if (put == null) {
                return null;
            }
            return (V) this.getHighResolutionOutputSizeshNQ4ISI.doForward(put);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.SetAdapter(this.getHighSpeedVideoFpsRangesFor.entrySet());
        }

        class SetAdapter extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
            private final java.util.Set<java.util.Map.Entry<K, RealValue>> getHighSpeedVideoSizes;

            public SetAdapter(java.util.Set<java.util.Map.Entry<K, RealValue>> set) {
                this.getHighSpeedVideoSizes = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.IteratorAdapter(this.getHighSpeedVideoSizes.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.getHighSpeedVideoSizes.size();
            }
        }

        class IteratorAdapter implements java.util.Iterator<java.util.Map.Entry<K, V>> {
            private final java.util.Iterator<java.util.Map.Entry<K, RealValue>> getHighSpeedVideoSizes;

            public IteratorAdapter(java.util.Iterator<java.util.Map.Entry<K, RealValue>> it) {
                this.getHighSpeedVideoSizes = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.getHighSpeedVideoSizes.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.getHighSpeedVideoSizes.remove();
            }

            @Override // java.util.Iterator
            public /* synthetic */ java.lang.Object next() {
                return new androidx.datastore.preferences.protobuf.Internal.MapAdapter.EntryAdapter(this.getHighSpeedVideoSizes.next());
            }
        }

        class EntryAdapter implements java.util.Map.Entry<K, V> {
            private final java.util.Map.Entry<K, RealValue> getHighSpeedVideoSizes;

            public EntryAdapter(java.util.Map.Entry<K, RealValue> entry) {
                this.getHighSpeedVideoSizes = entry;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.getHighSpeedVideoSizes.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.getHighResolutionOutputSizeshNQ4ISI.doForward(this.getHighSpeedVideoSizes.getValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v) {
                java.lang.Object value = this.getHighSpeedVideoSizes.setValue(androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.getHighResolutionOutputSizeshNQ4ISI.doBackward(v));
                if (value == null) {
                    return null;
                }
                return (V) androidx.datastore.preferences.protobuf.Internal.MapAdapter.this.getHighResolutionOutputSizeshNQ4ISI.doForward(value);
            }

            @Override // java.util.Map.Entry
            public boolean equals(java.lang.Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof java.util.Map.Entry) && getKey().equals(((java.util.Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.getHighSpeedVideoSizes.hashCode();
            }
        }
    }
}
