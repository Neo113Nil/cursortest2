package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010)J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0010"}, d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Void;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Void;", "indexOf", "(Ljava/lang/Void;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmptyList implements java.util.List, java.io.Serializable, java.util.RandomAccess, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.collections.EmptyList INSTANCE = new kotlin.collections.EmptyList();
    private static final long serialVersionUID = -7390468764508069838L;

    public final int getSize() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    private EmptyList() {
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return contains((java.lang.Void) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return indexOf((java.lang.Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return lastIndexOf((java.lang.Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return (other instanceof java.util.List) && ((java.util.List) other).isEmpty();
    }

    public final java.lang.String toString() {
        return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return elements.isEmpty();
    }

    @Override // java.util.List
    public final java.lang.Void get(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty list doesn't contain element at index ");
        sb.append(index);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return kotlin.collections.EmptyIterator.INSTANCE;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return kotlin.collections.EmptyIterator.INSTANCE;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int index) {
        if (index != 0) {
            throw new java.lang.IndexOutOfBoundsException("Index: ".concat(java.lang.String.valueOf(index)));
        }
        return kotlin.collections.EmptyIterator.INSTANCE;
    }

    @Override // java.util.List
    public final java.util.List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex: ");
        sb.append(fromIndex);
        sb.append(", toIndex: ");
        sb.append(toIndex);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private final java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    public final java.lang.Void set(int i, java.lang.Void r2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Void remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int lastIndexOf(java.lang.Void element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return -1;
    }

    public final int indexOf(java.lang.Void element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return -1;
    }

    public final boolean contains(java.lang.Void element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(java.lang.Void r2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void add(int i, java.lang.Void r2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
