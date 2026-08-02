package androidx.content.preferences.protobuf;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements androidx.content.preferences.protobuf.LazyStringList, java.util.RandomAccess {
    private final androidx.content.preferences.protobuf.LazyStringList Camera2StreamConfigurationMap;

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public androidx.content.preferences.protobuf.LazyStringList getUnmodifiableView() {
        return this;
    }

    public UnmodifiableLazyStringList(androidx.content.preferences.protobuf.LazyStringList lazyStringList) {
        this.Camera2StreamConfigurationMap = lazyStringList;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        return (java.lang.String) this.Camera2StreamConfigurationMap.get(i);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.lang.Object getRaw(int i) {
        return this.Camera2StreamConfigurationMap.getRaw(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public androidx.content.preferences.protobuf.ByteString getByteString(int i) {
        return this.Camera2StreamConfigurationMap.getByteString(i);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void add(androidx.content.preferences.protobuf.ByteString byteString) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void set(int i, androidx.content.preferences.protobuf.ByteString byteString) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends androidx.content.preferences.protobuf.ByteString> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        return this.Camera2StreamConfigurationMap.getByteArray(i);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new java.util.ListIterator<java.lang.String>(i) { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.1
            java.util.ListIterator<java.lang.String> Camera2StreamConfigurationMap;
            final /* synthetic */ int getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = i;
                this.Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.UnmodifiableLazyStringList.this.Camera2StreamConfigurationMap.listIterator(i);
            }

            @Override // java.util.ListIterator
            public /* synthetic */ void add(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public /* synthetic */ void set(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.Camera2StreamConfigurationMap.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.Camera2StreamConfigurationMap.hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.Camera2StreamConfigurationMap.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.Camera2StreamConfigurationMap.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                return this.Camera2StreamConfigurationMap.next();
            }

            @Override // java.util.ListIterator
            public /* bridge */ /* synthetic */ java.lang.String previous() {
                return this.Camera2StreamConfigurationMap.previous();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new java.util.Iterator<java.lang.String>() { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.2
            java.util.Iterator<java.lang.String> getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = androidx.content.preferences.protobuf.UnmodifiableLazyStringList.this.Camera2StreamConfigurationMap.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.getHighSpeedVideoSizes.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.String next() {
                return this.getHighSpeedVideoSizes.next();
            }
        };
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return this.Camera2StreamConfigurationMap.getUnderlyingElements();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void mergeFrom(androidx.content.preferences.protobuf.LazyStringList lazyStringList) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap.asByteArrayList());
    }

    @Override // androidx.content.preferences.protobuf.ProtocolStringList
    public java.util.List<androidx.content.preferences.protobuf.ByteString> asByteStringList() {
        return java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap.asByteStringList());
    }
}
