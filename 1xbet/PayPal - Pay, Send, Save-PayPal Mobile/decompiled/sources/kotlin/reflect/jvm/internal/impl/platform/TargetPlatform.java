package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes5.dex */
public class TargetPlatform implements java.util.Collection<kotlin.reflect.jvm.internal.impl.platform.SimplePlatform>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.platform.SimplePlatform> getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.platform.SimplePlatform) {
            return contains((kotlin.reflect.jvm.internal.impl.platform.SimplePlatform) obj);
        }
        return false;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.platform.SimplePlatform> getComponentPlatforms() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.platform.PlatformUtilKt.getPresentableDescription(this);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.platform.TargetPlatform) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, ((kotlin.reflect.jvm.internal.impl.platform.TargetPlatform) obj).getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
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
    public boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate<? super kotlin.reflect.jvm.internal.impl.platform.SimplePlatform> predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<kotlin.reflect.jvm.internal.impl.platform.SimplePlatform> iterator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.iterator();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsAll(collection);
    }

    public boolean contains(kotlin.reflect.jvm.internal.impl.platform.SimplePlatform simplePlatform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simplePlatform, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(simplePlatform);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.platform.SimplePlatform> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(kotlin.reflect.jvm.internal.impl.platform.SimplePlatform simplePlatform) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
