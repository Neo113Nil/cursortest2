package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class UnmodifiableLazyStringList extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList {
    private final kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getUnmodifiableView() {
        return this;
    }

    public UnmodifiableLazyStringList(kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList lazyStringList) {
        this.getHighSpeedVideoSizes = lazyStringList;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        return (java.lang.String) this.getHighSpeedVideoSizes.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString getByteString(int i) {
        return this.getHighSpeedVideoSizes.getByteString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new java.util.ListIterator<java.lang.String>(i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.1
            java.util.ListIterator<java.lang.String> getHighSpeedVideoFpsRanges;
            final /* synthetic */ int getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = i;
                this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.this.getHighSpeedVideoSizes.listIterator(i);
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
                return this.getHighSpeedVideoFpsRanges.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.getHighSpeedVideoFpsRanges.hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.getHighSpeedVideoFpsRanges.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.getHighSpeedVideoFpsRanges.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public /* bridge */ /* synthetic */ java.lang.Object next() {
                return this.getHighSpeedVideoFpsRanges.next();
            }

            @Override // java.util.ListIterator
            public /* bridge */ /* synthetic */ java.lang.String previous() {
                return this.getHighSpeedVideoFpsRanges.previous();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new java.util.Iterator<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.2
            java.util.Iterator<java.lang.String> getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.this.getHighSpeedVideoSizes.iterator();
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return this.getHighSpeedVideoSizes.getUnderlyingElements();
    }
}
