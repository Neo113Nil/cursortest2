package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class LazyStringArrayList extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList {
    public static final kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList EMPTY = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList().getUnmodifiableView();
    private final java.util.List<java.lang.Object> getHighSpeedVideoFpsRanges;

    public LazyStringArrayList() {
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public LazyStringArrayList(kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList lazyStringList) {
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.getHighSpeedVideoFpsRanges.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf82 = kotlin.reflect.jvm.internal.impl.protobuf.Internal.toStringUtf8(bArr);
        if (kotlin.reflect.jvm.internal.impl.protobuf.Internal.isValidUtf8(bArr)) {
            this.getHighSpeedVideoFpsRanges.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String set(int i, java.lang.String str) {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.set(i, str));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        if (collection instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList) {
            collection = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.getHighSpeedVideoFpsRanges.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String remove(int i) {
        java.lang.Object remove = this.getHighSpeedVideoFpsRanges.remove(i);
        this.modCount++;
        return getHighSpeedVideoFpsRanges(remove);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.getHighSpeedVideoFpsRanges.clear();
        this.modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        this.getHighSpeedVideoFpsRanges.add(byteString);
        this.modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString getByteString(int i) {
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString copyFrom;
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(i);
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            copyFrom = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
        } else if (obj instanceof java.lang.String) {
            copyFrom = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFromUtf8((java.lang.String) obj);
        } else {
            copyFrom = kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom((byte[]) obj);
        }
        if (copyFrom != obj) {
            this.getHighSpeedVideoFpsRanges.set(i, copyFrom);
        }
        return copyFrom;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj).toStringUtf8();
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.Internal.toStringUtf8((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getUnmodifiableView() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList(this);
    }
}
