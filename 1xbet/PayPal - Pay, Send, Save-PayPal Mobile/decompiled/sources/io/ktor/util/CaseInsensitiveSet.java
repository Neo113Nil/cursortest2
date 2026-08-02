package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lio/ktor/util/CaseInsensitiveSet;", "", "", "<init>", "()V", "", "initial", "(Ljava/lang/Iterable;)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;)Z", "remove", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lio/ktor/util/CaseInsensitiveMap;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/util/CaseInsensitiveMap;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CaseInsensitiveSet implements java.util.Set<java.lang.String>, kotlin.jvm.internal.markers.KMutableSet {
    private final io.ktor.util.CaseInsensitiveMap<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return contains((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    public CaseInsensitiveSet() {
        this.getHighSpeedVideoFpsRangesFor = new io.ktor.util.CaseInsensitiveMap<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaseInsensitiveSet(java.lang.Iterable<java.lang.String> iterable) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.collections.CollectionsKt.addAll(this, iterable);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.String element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        if (this.getHighSpeedVideoFpsRangesFor.containsKey((java.lang.Object) element)) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor.put((io.ktor.util.CaseInsensitiveMap<java.lang.Boolean>) element, (java.lang.String) java.lang.Boolean.TRUE);
        return true;
    }

    public final int getSize() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    public final boolean remove(java.lang.String element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.remove((java.lang.Object) element), java.lang.Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends java.lang.String> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends java.lang.String> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighSpeedVideoFpsRangesFor.keySet().removeAll(kotlin.collections.CollectionsKt.toSet(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighSpeedVideoFpsRangesFor.keySet().retainAll(kotlin.collections.CollectionsKt.toSet(elements));
    }

    public final boolean contains(java.lang.String element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.getHighSpeedVideoFpsRangesFor.containsKey((java.lang.Object) element);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighSpeedVideoFpsRangesFor.keySet().containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return this.getHighSpeedVideoFpsRangesFor.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }
}
