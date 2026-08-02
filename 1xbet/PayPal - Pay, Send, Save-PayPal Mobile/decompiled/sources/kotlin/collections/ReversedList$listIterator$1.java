package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/collections/ReversedList$listIterator$1;", "", "", "hasNext", "()Z", "hasPrevious", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)V", "remove", "()V", "set", "delegateIterator", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReversedList$listIterator$1<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
    private final java.util.ListIterator<T> delegateIterator;
    final /* synthetic */ kotlin.collections.ReversedList<T> getHighSpeedVideoFpsRangesFor;

    ReversedList$listIterator$1(kotlin.collections.ReversedList<T> reversedList, int i) {
        java.util.List list;
        this.getHighSpeedVideoFpsRangesFor = reversedList;
        list = ((kotlin.collections.ReversedList) reversedList).getHighSpeedVideoSizes;
        this.delegateIterator = list.listIterator(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(reversedList, i));
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
        return kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.getHighSpeedVideoFpsRangesFor, this.delegateIterator.previousIndex());
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return this.delegateIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(this.getHighSpeedVideoFpsRangesFor, this.delegateIterator.nextIndex());
    }

    @Override // java.util.ListIterator
    public final void add(T element) {
        this.delegateIterator.add(element);
        this.delegateIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.delegateIterator.remove();
    }

    @Override // java.util.ListIterator
    public final void set(T element) {
        this.delegateIterator.set(element);
    }
}
