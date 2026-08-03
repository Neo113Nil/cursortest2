package i1;

/* renamed from: i1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199r implements java.util.List, java.io.Serializable, java.util.RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public static final i1.C0199r f3325a = new i1.C0199r();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        java.lang.Void element = (java.lang.Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    @Override // java.util.List
    public final java.lang.Object get(int i2) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        java.lang.Void element = (java.lang.Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return i1.C0198q.f3324a;
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        java.lang.Void element = (java.lang.Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return i1.C0198q.f3324a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i2, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final java.util.List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new java.lang.IndexOutOfBoundsException(B1.a.h("fromIndex: ", i2, i3, ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.i.j(this);
    }

    public final java.lang.String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return i1.C0198q.f3324a;
        }
        throw new java.lang.IndexOutOfBoundsException(B1.a.f(i2, "Index: "));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.k(this, array);
    }
}
