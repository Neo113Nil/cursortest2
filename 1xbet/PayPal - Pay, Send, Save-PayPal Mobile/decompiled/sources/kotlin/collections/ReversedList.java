package kotlin.collections;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ \u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "", "p0", "<init>", "(Ljava/util/List;)V", "", "get", "(I)Ljava/lang/Object;", "", "clear", "()V", "removeAt", "p1", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(ILjava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes", "getSize", "()I", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ReversedList<T> extends kotlin.collections.AbstractMutableList<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<T> getHighSpeedVideoSizes;

    public ReversedList(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int p0) {
        return this.getHighSpeedVideoSizes.get(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, p0));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    public final T removeAt(int p0) {
        return this.getHighSpeedVideoSizes.remove(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, p0));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final T set(int p0, T p1) {
        return this.getHighSpeedVideoSizes.set(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, p0), p1);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int p0, T p1) {
        this.getHighSpeedVideoSizes.add(kotlin.collections.CollectionsKt__ReversedViewsKt.access$reversePositionIndex(this, p0), p1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<T> listIterator(int p0) {
        return new kotlin.collections.ReversedList$listIterator$1(this, p0);
    }
}
