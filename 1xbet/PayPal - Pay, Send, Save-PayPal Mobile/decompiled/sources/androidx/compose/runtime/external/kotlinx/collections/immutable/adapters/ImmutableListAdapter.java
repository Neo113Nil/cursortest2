package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u001e\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0096\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0096\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b&\u0010 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001c\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b(\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "impl", "<init>", "(Ljava/util/List;)V", "", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "contains", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImmutableListAdapter<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E>, java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<E> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableListAdapter(java.util.List<? extends E> list) {
        this.Camera2StreamConfigurationMap = list;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList, java.util.List
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> subList(int fromIndex, int toIndex) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableListAdapter(this.Camera2StreamConfigurationMap.subList(fromIndex, toIndex));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return this.Camera2StreamConfigurationMap.equals(other);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super E> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<E> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        return this.Camera2StreamConfigurationMap.listIterator(index);
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator() {
        return this.Camera2StreamConfigurationMap.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object element) {
        return this.Camera2StreamConfigurationMap.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return this.Camera2StreamConfigurationMap.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object element) {
        return this.Camera2StreamConfigurationMap.indexOf(element);
    }

    public final int getSize() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // java.util.List
    public final E get(int index) {
        return this.Camera2StreamConfigurationMap.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        return this.Camera2StreamConfigurationMap.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object element) {
        return this.Camera2StreamConfigurationMap.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
