package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public class LazyStringArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.String> implements com.google.crypto.tink.shaded.protobuf.LazyStringList, java.util.RandomAccess {

    @java.lang.Deprecated
    public static final com.google.crypto.tink.shaded.protobuf.LazyStringList EMPTY;
    private static final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList EMPTY_LIST;
    private final java.util.List<java.lang.Object> list;

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    static {
        com.google.crypto.tink.shaded.protobuf.LazyStringArrayList lazyStringArrayList = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public static com.google.crypto.tink.shaded.protobuf.LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    public LazyStringArrayList() {
        this(10);
    }

    private LazyStringArrayList(boolean z) {
        super(z);
        this.list = java.util.Collections.emptyList();
    }

    public LazyStringArrayList(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    public LazyStringArrayList(com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList) {
        this.list = new java.util.ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    public LazyStringArrayList(java.util.List<java.lang.String> list) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(list));
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> arrayList) {
        this.list = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public com.google.crypto.tink.shaded.protobuf.LazyStringArrayList mutableCopyWithCapacity2(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.list);
        return new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        java.lang.Object obj = this.list.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            com.google.crypto.tink.shaded.protobuf.ByteString byteString = (com.google.crypto.tink.shaded.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf82 = com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8(bArr);
        if (com.google.crypto.tink.shaded.protobuf.Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String set(int i, java.lang.String str) {
        ensureIsMutable();
        return asString(this.list.set(i, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, java.lang.String str) {
        ensureIsMutable();
        this.list.add(i, str);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        ensureIsMutable();
        this.list.add(i, byteString);
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i, bArr);
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.String str) {
        ensureIsMutable();
        this.list.add(str);
        this.modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        ensureIsMutable();
        this.list.add(byteString);
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        ensureIsMutable();
        if (collection instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList) {
            collection = ((com.google.crypto.tink.shaded.protobuf.LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int i) {
        ensureIsMutable();
        java.lang.Object remove = this.list.remove(i);
        this.modCount++;
        return asString(remove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        this.modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.lang.Object getRaw(int i) {
        return this.list.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int i) {
        java.lang.Object obj = this.list.get(i);
        com.google.crypto.tink.shaded.protobuf.ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        java.lang.Object obj = this.list.get(i);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i, asByteArray);
        }
        return asByteArray;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        setAndReturn(i, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        ensureIsMutable();
        return this.list.set(i, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        setAndReturn(i, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object setAndReturn(int i, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i, bArr);
    }

    private static java.lang.String asString(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            return ((com.google.crypto.tink.shaded.protobuf.ByteString) obj).toStringUtf8();
        }
        return com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.shaded.protobuf.ByteString asByteString(java.lang.Object obj) {
        if (obj instanceof com.google.crypto.tink.shaded.protobuf.ByteString) {
            return (com.google.crypto.tink.shaded.protobuf.ByteString) obj;
        }
        if (obj instanceof java.lang.String) {
            return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8((java.lang.String) obj);
        }
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof java.lang.String) {
            return com.google.crypto.tink.shaded.protobuf.Internal.toByteArray((java.lang.String) obj);
        }
        return ((com.google.crypto.tink.shaded.protobuf.ByteString) obj).toByteArray();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList) {
        ensureIsMutable();
        for (java.lang.Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(java.util.Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteArrayListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i) {
            return this.list.getByteArray(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i, byte[] bArr) {
            java.lang.Object andReturn = this.list.setAndReturn(i, bArr);
            this.modCount++;
            return com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.asByteArray(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, byte[] bArr) {
            this.list.add(i, bArr);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i) {
            java.lang.String remove = this.list.remove(i);
            this.modCount++;
            return com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.asByteArray(remove);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
        return new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.ByteArrayListView(this);
    }

    static class ByteStringListView extends java.util.AbstractList<com.google.crypto.tink.shaded.protobuf.ByteString> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteStringListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString get(int i) {
            return this.list.getByteString(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString set(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            java.lang.Object andReturn = this.list.setAndReturn(i, byteString);
            this.modCount++;
            return com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.asByteString(andReturn);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            this.list.add(i, byteString);
            this.modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString remove(int i) {
            java.lang.String remove = this.list.remove(i);
            this.modCount++;
            return com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.asByteString(remove);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> asByteStringList() {
        return new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.ByteStringListView(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView() {
        return isModifiable() ? new com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList(this) : this;
    }
}
