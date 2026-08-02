package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/collection/OrderedSetWrapper;", "E", "", "Landroidx/collection/OrderedScatterSet;", "p0", "<init>", "(Landroidx/collection/OrderedScatterSet;)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "equals", "", "hashCode", "()I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/OrderedScatterSet;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
class OrderedSetWrapper<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.OrderedScatterSet<E> Camera2StreamConfigurationMap;

    public OrderedSetWrapper(androidx.collection.OrderedScatterSet<E> orderedScatterSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedScatterSet, "");
        this.Camera2StreamConfigurationMap = orderedScatterSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            if (!this.Camera2StreamConfigurationMap.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object p0) {
        return this.Camera2StreamConfigurationMap.contains(p0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return kotlin.sequences.SequencesKt.iterator(new androidx.collection.OrderedSetWrapper$iterator$1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.collection.OrderedSetWrapper) p0).Camera2StreamConfigurationMap);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public java.lang.String toString() {
        return this.Camera2StreamConfigurationMap.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.Camera2StreamConfigurationMap._size;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
