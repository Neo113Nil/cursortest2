package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u001e\u0010\u0015\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "impl", "<init>", "(Ljava/util/Collection;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "contains", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRanges", "Ljava/util/Collection;", "getHighResolutionOutputSizeshNQ4ISI", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ImmutableCollectionAdapter<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<E>, java.util.Collection<E>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Collection<E> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableCollectionAdapter(java.util.Collection<? extends E> collection) {
        this.getHighResolutionOutputSizeshNQ4ISI = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object other) {
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
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
    public boolean removeIf(java.util.function.Predicate<? super E> predicate) {
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
    public java.util.Iterator<E> iterator() {
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
    public boolean containsAll(java.util.Collection<?> elements) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object element) {
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(element);
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
