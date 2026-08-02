package io.ktor.util.collections;

/* JADX INFO: Add missing generic type declarations: [Key] */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001d\u0010\u0014\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lio/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1;", "", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "Lio/ktor/util/collections/ConcurrentMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/util/collections/ConcurrentMap;", "getHighSpeedVideoFpsRangesFor", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConcurrentSetKt$ConcurrentSet$1<Key> implements java.util.Set<Key>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.util.collections.ConcurrentMap<Key, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

    ConcurrentSetKt$ConcurrentSet$1() {
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Key element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(element)) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor.put(element, kotlin.Unit.INSTANCE);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends Key> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Collection<? extends Key> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!add(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<Key> iterator() {
        return this.getHighSpeedVideoFpsRangesFor.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object element) {
        return (element == null || this.getHighSpeedVideoFpsRangesFor.remove(element) == null) ? false : true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!remove(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (Key key : this.getHighSpeedVideoFpsRangesFor.keySet()) {
            if (!elements.contains(key)) {
                linkedHashSet.add(key);
            }
        }
        return removeAll(linkedHashSet);
    }

    public final int getSize() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object element) {
        if (element == null) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return elements.containsAll(this.getHighSpeedVideoFpsRangesFor.keySet());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isEmpty();
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
