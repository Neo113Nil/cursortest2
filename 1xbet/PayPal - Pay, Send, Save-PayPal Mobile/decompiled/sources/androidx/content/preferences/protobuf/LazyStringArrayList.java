package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public class LazyStringArrayList extends androidx.content.preferences.protobuf.AbstractProtobufList<java.lang.String> implements androidx.content.preferences.protobuf.LazyStringList, java.util.RandomAccess {
    private static final androidx.content.preferences.protobuf.LazyStringArrayList Camera2StreamConfigurationMap;

    @java.lang.Deprecated
    public static final androidx.content.preferences.protobuf.LazyStringList EMPTY;
    private final java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    static {
        androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList = new androidx.content.preferences.protobuf.LazyStringArrayList((byte) 0);
        Camera2StreamConfigurationMap = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public static androidx.content.preferences.protobuf.LazyStringArrayList emptyList() {
        return Camera2StreamConfigurationMap;
    }

    public LazyStringArrayList() {
        this(10);
    }

    private LazyStringArrayList(byte b) {
        super(false);
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
    }

    public LazyStringArrayList(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    public LazyStringArrayList(androidx.content.preferences.protobuf.LazyStringList lazyStringList) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    public LazyStringArrayList(java.util.List<java.lang.String> list) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(list));
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> arrayList) {
        this.getHighSpeedVideoFpsRangesFor = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public androidx.content.preferences.protobuf.LazyStringArrayList mutableCopyWithCapacity2(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.getHighSpeedVideoFpsRangesFor);
        return new androidx.content.preferences.protobuf.LazyStringArrayList((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            androidx.content.preferences.protobuf.ByteString byteString = (androidx.content.preferences.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.getHighSpeedVideoFpsRangesFor.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf82 = androidx.content.preferences.protobuf.Internal.toStringUtf8(bArr);
        if (androidx.content.preferences.protobuf.Internal.isValidUtf8(bArr)) {
            this.getHighSpeedVideoFpsRangesFor.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String set(int i, java.lang.String str) {
        ensureIsMutable();
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.set(i, str));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, java.lang.String str) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.add(i, str);
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.String str) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.add(str);
        this.modCount++;
        return true;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void add(androidx.content.preferences.protobuf.ByteString byteString) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.add(byteString);
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.add(bArr);
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        ensureIsMutable();
        if (collection instanceof androidx.content.preferences.protobuf.LazyStringList) {
            collection = ((androidx.content.preferences.protobuf.LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.getHighSpeedVideoFpsRangesFor.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends androidx.content.preferences.protobuf.ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.getHighSpeedVideoFpsRangesFor.addAll(collection);
        this.modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.getHighSpeedVideoFpsRangesFor.addAll(collection);
        this.modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int i) {
        ensureIsMutable();
        java.lang.Object remove = this.getHighSpeedVideoFpsRangesFor.remove(i);
        this.modCount++;
        return getHighResolutionOutputSizeshNQ4ISI(remove);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.lang.Object getRaw(int i) {
        return this.getHighSpeedVideoFpsRangesFor.get(i);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public androidx.content.preferences.protobuf.ByteString getByteString(int i) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(i);
        androidx.content.preferences.protobuf.ByteString highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
        if (highSpeedVideoFpsRanges != obj) {
            this.getHighSpeedVideoFpsRangesFor.set(i, highSpeedVideoFpsRanges);
        }
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(i);
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(obj);
        if (Camera2StreamConfigurationMap2 != obj) {
            this.getHighSpeedVideoFpsRangesFor.set(i, Camera2StreamConfigurationMap2);
        }
        return Camera2StreamConfigurationMap2;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            return ((androidx.content.preferences.protobuf.ByteString) obj).toStringUtf8();
        }
        return androidx.content.preferences.protobuf.Internal.toStringUtf8((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.content.preferences.protobuf.ByteString getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        if (obj instanceof androidx.content.preferences.protobuf.ByteString) {
            return (androidx.content.preferences.protobuf.ByteString) obj;
        }
        if (obj instanceof java.lang.String) {
            return androidx.content.preferences.protobuf.ByteString.copyFromUtf8((java.lang.String) obj);
        }
        return androidx.content.preferences.protobuf.ByteString.copyFrom((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] Camera2StreamConfigurationMap(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof java.lang.String) {
            return androidx.content.preferences.protobuf.Internal.toByteArray((java.lang.String) obj);
        }
        return ((androidx.content.preferences.protobuf.ByteString) obj).toByteArray();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void mergeFrom(androidx.content.preferences.protobuf.LazyStringList lazyStringList) {
        ensureIsMutable();
        for (java.lang.Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.getHighSpeedVideoFpsRangesFor.add(java.util.Arrays.copyOf(bArr, bArr.length));
            } else {
                this.getHighSpeedVideoFpsRangesFor.add(obj);
            }
        }
    }

    static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final androidx.content.preferences.protobuf.LazyStringArrayList Camera2StreamConfigurationMap;

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ void add(int i, java.lang.Object obj) {
            androidx.content.preferences.protobuf.LazyStringArrayList.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, i, (byte[]) obj);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
            java.lang.Object Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.LazyStringArrayList.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, i, (byte[]) obj);
            this.modCount++;
            return androidx.content.preferences.protobuf.LazyStringArrayList.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap);
        }

        ByteArrayListView(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList) {
            this.Camera2StreamConfigurationMap = lazyStringArrayList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Camera2StreamConfigurationMap.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object get(int i) {
            return this.Camera2StreamConfigurationMap.getByteArray(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object remove(int i) {
            java.lang.String remove = this.Camera2StreamConfigurationMap.remove(i);
            this.modCount++;
            return androidx.content.preferences.protobuf.LazyStringArrayList.Camera2StreamConfigurationMap(remove);
        }
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return new androidx.datastore.preferences.protobuf.LazyStringArrayList.ByteArrayListView(this);
    }

    static class ByteStringListView extends java.util.AbstractList<androidx.content.preferences.protobuf.ByteString> implements java.util.RandomAccess {
        private final androidx.content.preferences.protobuf.LazyStringArrayList getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ void add(int i, java.lang.Object obj) {
            androidx.content.preferences.protobuf.LazyStringArrayList.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, i, (androidx.content.preferences.protobuf.ByteString) obj);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
            java.lang.Object Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.LazyStringArrayList.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, i, (androidx.content.preferences.protobuf.ByteString) obj);
            this.modCount++;
            return androidx.content.preferences.protobuf.LazyStringArrayList.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        }

        ByteStringListView(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList) {
            this.getHighResolutionOutputSizeshNQ4ISI = lazyStringArrayList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object get(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getByteString(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public /* synthetic */ java.lang.Object remove(int i) {
            java.lang.String remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(i);
            this.modCount++;
            return androidx.content.preferences.protobuf.LazyStringArrayList.getHighSpeedVideoFpsRanges(remove);
        }
    }

    @Override // androidx.content.preferences.protobuf.ProtocolStringList
    public java.util.List<androidx.content.preferences.protobuf.ByteString> asByteStringList() {
        return new androidx.datastore.preferences.protobuf.LazyStringArrayList.ByteStringListView(this);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public androidx.content.preferences.protobuf.LazyStringList getUnmodifiableView() {
        return isModifiable() ? new androidx.content.preferences.protobuf.UnmodifiableLazyStringList(this) : this;
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
        lazyStringArrayList.ensureIsMutable();
        return lazyStringArrayList.getHighSpeedVideoFpsRangesFor.set(i, bArr);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList, int i, byte[] bArr) {
        lazyStringArrayList.ensureIsMutable();
        lazyStringArrayList.getHighSpeedVideoFpsRangesFor.add(i, bArr);
        lazyStringArrayList.modCount++;
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList, int i, androidx.content.preferences.protobuf.ByteString byteString) {
        lazyStringArrayList.ensureIsMutable();
        return lazyStringArrayList.getHighSpeedVideoFpsRangesFor.set(i, byteString);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.LazyStringArrayList lazyStringArrayList, int i, androidx.content.preferences.protobuf.ByteString byteString) {
        lazyStringArrayList.ensureIsMutable();
        lazyStringArrayList.getHighSpeedVideoFpsRangesFor.add(i, byteString);
        lazyStringArrayList.modCount++;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void set(int i, androidx.content.preferences.protobuf.ByteString byteString) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.set(i, byteString);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        ensureIsMutable();
        this.getHighSpeedVideoFpsRangesFor.set(i, bArr);
    }
}
