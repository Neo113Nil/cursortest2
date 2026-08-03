package com.google.protobuf;

/* loaded from: classes4.dex */
public class LazyStringArrayList extends com.google.protobuf.AbstractProtobufList<java.lang.String> implements com.google.protobuf.LazyStringList, java.util.RandomAccess {

    @java.lang.Deprecated
    public static final com.google.protobuf.LazyStringList EMPTY;
    private static final com.google.protobuf.LazyStringArrayList EMPTY_LIST;
    private final java.util.List<java.lang.Object> list;

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object e) {
        return super.add((com.google.protobuf.LazyStringArrayList) e);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object o) {
        return super.remove(o);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection c) {
        return super.removeAll(c);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection c) {
        return super.retainAll(c);
    }

    static {
        com.google.protobuf.LazyStringArrayList lazyStringArrayList = new com.google.protobuf.LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public static com.google.protobuf.LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    public LazyStringArrayList() {
        this(10);
    }

    private LazyStringArrayList(boolean isMutable) {
        super(isMutable);
        this.list = java.util.Collections.emptyList();
    }

    public LazyStringArrayList(int initialCapacity) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(initialCapacity));
    }

    public LazyStringArrayList(com.google.protobuf.LazyStringList from) {
        this.list = new java.util.ArrayList(from.size());
        addAll(from);
    }

    public LazyStringArrayList(java.util.List<java.lang.String> from) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(from));
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> list) {
        this.list = list;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public com.google.protobuf.LazyStringArrayList mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(capacity);
        arrayList.addAll(this.list);
        return new com.google.protobuf.LazyStringArrayList((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int index) {
        java.lang.Object obj = this.list.get(index);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.protobuf.ByteString) {
            com.google.protobuf.ByteString byteString = (com.google.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf82 = com.google.protobuf.Internal.toStringUtf8(bArr);
        if (com.google.protobuf.Internal.isValidUtf8(bArr)) {
            this.list.set(index, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String set(int index, java.lang.String s) {
        ensureIsMutable();
        return asString(this.list.set(index, s));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, java.lang.String element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, com.google.protobuf.ByteString element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        ensureIsMutable();
        this.list.add(index, element);
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> c) {
        return addAll(size(), c);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int index, java.util.Collection<? extends java.lang.String> c) {
        ensureIsMutable();
        if (c instanceof com.google.protobuf.LazyStringList) {
            c = ((com.google.protobuf.LazyStringList) c).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(index, c);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.protobuf.ByteString> values) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(values);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> c) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(c);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int index) {
        ensureIsMutable();
        java.lang.Object remove = this.list.remove(index);
        this.modCount++;
        return asString(remove);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        this.modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(com.google.protobuf.ByteString element) {
        ensureIsMutable();
        this.list.add(element);
        this.modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] element) {
        ensureIsMutable();
        this.list.add(element);
        this.modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public java.lang.Object getRaw(int index) {
        return this.list.get(index);
    }

    @Override // com.google.protobuf.LazyStringList
    public com.google.protobuf.ByteString getByteString(int index) {
        java.lang.Object obj = this.list.get(index);
        com.google.protobuf.ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(index, asByteString);
        }
        return asByteString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int index) {
        java.lang.Object obj = this.list.get(index);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(index, asByteArray);
        }
        return asByteArray;
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, com.google.protobuf.ByteString s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int index, com.google.protobuf.ByteString s) {
        ensureIsMutable();
        return this.list.set(index, s);
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, byte[] s) {
        setAndReturn(index, s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int index, byte[] s) {
        ensureIsMutable();
        return this.list.set(index, s);
    }

    private static java.lang.String asString(java.lang.Object o) {
        if (o instanceof java.lang.String) {
            return (java.lang.String) o;
        }
        if (o instanceof com.google.protobuf.ByteString) {
            return ((com.google.protobuf.ByteString) o).toStringUtf8();
        }
        return com.google.protobuf.Internal.toStringUtf8((byte[]) o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.protobuf.ByteString asByteString(java.lang.Object o) {
        if (o instanceof com.google.protobuf.ByteString) {
            return (com.google.protobuf.ByteString) o;
        }
        if (o instanceof java.lang.String) {
            return com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) o);
        }
        return com.google.protobuf.ByteString.copyFrom((byte[]) o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(java.lang.Object o) {
        if (o instanceof byte[]) {
            return (byte[]) o;
        }
        if (o instanceof java.lang.String) {
            return com.google.protobuf.Internal.toByteArray((java.lang.String) o);
        }
        return ((com.google.protobuf.ByteString) o).toByteArray();
    }

    @Override // com.google.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(com.google.protobuf.LazyStringList other) {
        ensureIsMutable();
        for (java.lang.Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(java.util.Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    private static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final com.google.protobuf.LazyStringArrayList list;

        ByteArrayListView(com.google.protobuf.LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.list.getByteArray(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s) {
            java.lang.Object andReturn = this.list.setAndReturn(index, s);
            this.modCount++;
            return com.google.protobuf.LazyStringArrayList.asByteArray(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s) {
            this.list.add(index, s);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            java.lang.String remove = this.list.remove(index);
            this.modCount++;
            return com.google.protobuf.LazyStringArrayList.asByteArray(remove);
        }
    }

    @Override // com.google.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return new com.google.protobuf.LazyStringArrayList.ByteArrayListView(this);
    }

    private static class ByteStringListView extends java.util.AbstractList<com.google.protobuf.ByteString> implements java.util.RandomAccess {
        private final com.google.protobuf.LazyStringArrayList list;

        ByteStringListView(com.google.protobuf.LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.protobuf.ByteString get(int index) {
            return this.list.getByteString(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.protobuf.ByteString set(int index, com.google.protobuf.ByteString s) {
            java.lang.Object andReturn = this.list.setAndReturn(index, s);
            this.modCount++;
            return com.google.protobuf.LazyStringArrayList.asByteString(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, com.google.protobuf.ByteString s) {
            this.list.add(index, s);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.protobuf.ByteString remove(int index) {
            java.lang.String remove = this.list.remove(index);
            this.modCount++;
            return com.google.protobuf.LazyStringArrayList.asByteString(remove);
        }
    }

    @Override // com.google.protobuf.ProtocolStringList
    public java.util.List<com.google.protobuf.ByteString> asByteStringList() {
        return new com.google.protobuf.LazyStringArrayList.ByteStringListView(this);
    }

    @Override // com.google.protobuf.LazyStringList
    public com.google.protobuf.LazyStringList getUnmodifiableView() {
        return isModifiable() ? new com.google.protobuf.UnmodifiableLazyStringList(this) : this;
    }
}
