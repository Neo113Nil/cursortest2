package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/collections/ReversedListReadOnly$listIterator$1;", "", "", "hasNext", "()Z", "hasPrevious", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "delegateIterator", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReversedListReadOnly$listIterator$1<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.ListIterator<T> delegateIterator;
    final /* synthetic */ kotlin.collections.ReversedListReadOnly<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    ReversedListReadOnly$listIterator$1(kotlin.collections.ReversedListReadOnly<? extends T> reversedListReadOnly, int i) {
        java.util.List list;
        this.getHighResolutionOutputSizeshNQ4ISI = reversedListReadOnly;
        list = ((kotlin.collections.ReversedListReadOnly) reversedListReadOnly).getHighSpeedVideoFpsRanges;
        this.delegateIterator = list.listIterator(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(reversedListReadOnly, i));
    }

    public final java.util.ListIterator<T> getDelegateIterator() {
        return this.delegateIterator;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.delegateIterator.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.delegateIterator.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        return this.delegateIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.getHighResolutionOutputSizeshNQ4ISI, this.delegateIterator.previousIndex());
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.delegateIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.getHighResolutionOutputSizeshNQ4ISI, this.delegateIterator.nextIndex());
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
