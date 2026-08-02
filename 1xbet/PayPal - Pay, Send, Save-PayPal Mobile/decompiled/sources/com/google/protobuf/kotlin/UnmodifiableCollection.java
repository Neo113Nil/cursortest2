package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "E", "", "delegate", "<init>", "(Ljava/util/Collection;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/Collection;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class UnmodifiableCollection<E> implements java.util.Collection<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Collection<E> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableCollection(java.util.Collection<? extends E> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.delegate = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new com.google.protobuf.kotlin.UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate<? super E> predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.delegate.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean contains(E element) {
        return this.delegate.contains(element);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
