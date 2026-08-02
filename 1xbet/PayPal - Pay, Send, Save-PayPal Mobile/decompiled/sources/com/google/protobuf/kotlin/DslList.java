package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010$J&\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010.\u001a\u00020\u00138\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/google/protobuf/kotlin/DslList;", "E", "Lcom/google/protobuf/kotlin/DslProxy;", "P", "", "delegate", "<init>", "(Ljava/util/List;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "other", "equals", "", "index", "get", "(I)Ljava/lang/Object;", "hashCode", "()I", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DslList<E, P extends com.google.protobuf.kotlin.DslProxy> implements java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.List<E> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DslList(java.util.List<? extends E> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.delegate = list;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new com.google.protobuf.kotlin.UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator() {
        return new com.google.protobuf.kotlin.UnmodifiableListIterator(this.delegate.listIterator());
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        return new com.google.protobuf.kotlin.UnmodifiableListIterator(this.delegate.listIterator(index));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.delegate, other);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.delegate.hashCode();
    }

    public final java.lang.String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final java.util.List<E> subList(int fromIndex, int toIndex) {
        return this.delegate.subList(fromIndex, toIndex);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super E> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<E> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object element) {
        return this.delegate.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object element) {
        return this.delegate.indexOf(element);
    }

    public final int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.List
    public final E get(int index) {
        return this.delegate.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.delegate.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object element) {
        return this.delegate.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
