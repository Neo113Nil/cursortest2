package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlin/collections/ArrayAsCollection;", "T", "", "", "p0", "", "p1", "<init>", "([Ljava/lang/Object;Z)V", "isEmpty", "()Z", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "toArray", "()[Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "[Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ArrayAsCollection<T> implements java.util.Collection<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;
    private final T[] getHighSpeedVideoFpsRangesFor;

    public ArrayAsCollection(T[] tArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        this.getHighSpeedVideoFpsRangesFor = tArr;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.length == 0;
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object p0) {
        return kotlin.collections.ArraysKt.contains(this.getHighSpeedVideoFpsRangesFor, p0);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Collection<?> collection = p0;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return kotlin.jvm.internal.ArrayIteratorKt.iterator(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.collections.CollectionsKt.copyToArrayOfAny(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.getHighSpeedVideoFpsRangesFor.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
