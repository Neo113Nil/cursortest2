package i1;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0186e implements java.util.List, java.util.Collection {
    public abstract int a();

    @Override // java.util.List
    public final void add(int i2, java.lang.Object obj) {
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
    public boolean contains(java.lang.Object obj) {
        if (isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.Collection other = (java.util.Collection) obj;
        kotlin.jvm.internal.i.e(other, "other");
        if (size() == other.size()) {
            java.util.Iterator it = other.iterator();
            java.util.Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.i.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new i1.C0183b(this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.i.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new i1.C0184c(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i2) {
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
    public final java.lang.Object set(int i2, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public java.util.List subList(int i2, int i3) {
        return new i1.C0185d(this, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.i.j(this);
    }

    public final java.lang.String toString() {
        return i1.AbstractC0190i.Q(this, ", ", "[", "]", new s1.l() { // from class: i1.a
            @Override // s1.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                return obj == i1.AbstractC0186e.this ? "(this Collection)" : java.lang.String.valueOf(obj);
            }
        }, 24);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i2) {
        return new i1.C0184c(this, i2);
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
