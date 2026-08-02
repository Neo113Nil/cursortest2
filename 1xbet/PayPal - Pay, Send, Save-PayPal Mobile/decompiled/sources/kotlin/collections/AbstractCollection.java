package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractCollection<E> implements java.util.Collection<E>, kotlin.jvm.internal.markers.KMappedMarker {
    /* renamed from: getSize */
    public abstract int getGetHighSpeedVideoFpsRangesFor();

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract java.util.Iterator<E> iterator();

    @Override // java.util.Collection
    public final int size() {
        return getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(java.lang.Object element) {
        kotlin.collections.AbstractCollection<E> abstractCollection = this;
        if (abstractCollection.isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = abstractCollection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(it.next(), element)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Collection<?> collection = elements;
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this, ", ", "[", "]", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.collections.AbstractCollection$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.collections.AbstractCollection.m23545$r8$lambda$RRlQOBNvJqinm9AK_sSPMZpvJY(kotlin.collections.AbstractCollection.this, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, array);
    }

    /* renamed from: $r8$lambda$RRlQOBNvJqinm9A-K_sSPMZpvJY, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m23545$r8$lambda$RRlQOBNvJqinm9AK_sSPMZpvJY(kotlin.collections.AbstractCollection abstractCollection, java.lang.Object obj) {
        return obj == abstractCollection ? "(this Collection)" : java.lang.String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
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
