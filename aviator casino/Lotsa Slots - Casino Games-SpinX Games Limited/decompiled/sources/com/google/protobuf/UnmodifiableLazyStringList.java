package com.google.protobuf;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements com.google.protobuf.LazyStringList, java.util.RandomAccess {
    private final com.google.protobuf.LazyStringList list;

    @Override // com.google.protobuf.LazyStringList
    public com.google.protobuf.LazyStringList getUnmodifiableView() {
        return this;
    }

    public UnmodifiableLazyStringList(com.google.protobuf.LazyStringList list) {
        this.list = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int index) {
        return (java.lang.String) this.list.get(index);
    }

    @Override // com.google.protobuf.LazyStringList
    public java.lang.Object getRaw(int index) {
        return this.list.getRaw(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.LazyStringList
    public com.google.protobuf.ByteString getByteString(int index) {
        return this.list.getByteString(index);
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(com.google.protobuf.ByteString element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, com.google.protobuf.ByteString element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.protobuf.ByteString> element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int index) {
        return this.list.getByteArray(index);
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, byte[] element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(final int index) {
        return new java.util.ListIterator<java.lang.String>(index) { // from class: com.google.protobuf.UnmodifiableLazyStringList.1
            java.util.ListIterator<java.lang.String> iter;
            final /* synthetic */ int val$index;

            {
                this.val$index = index;
                this.iter = com.google.protobuf.UnmodifiableLazyStringList.this.list.listIterator(index);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public java.lang.String next() {
                return this.iter.next();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.iter.hasPrevious();
            }

            @Override // java.util.ListIterator
            public java.lang.String previous() {
                return this.iter.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.iter.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.iter.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void set(java.lang.String o) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void add(java.lang.String o) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new java.util.Iterator<java.lang.String>() { // from class: com.google.protobuf.UnmodifiableLazyStringList.2
            java.util.Iterator<java.lang.String> iter;

            {
                this.iter = com.google.protobuf.UnmodifiableLazyStringList.this.list.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.Iterator
            public java.lang.String next() {
                return this.iter.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // com.google.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(com.google.protobuf.LazyStringList other) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return java.util.Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.ProtocolStringList
    public java.util.List<com.google.protobuf.ByteString> asByteStringList() {
        return java.util.Collections.unmodifiableList(this.list.asByteStringList());
    }
}
