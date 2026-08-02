package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingSortedSet<E> extends com.google.common.collect.ForwardingSet<E> implements java.util.SortedSet<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedSet<E> delegate();

    protected ForwardingSortedSet() {
    }

    @Override // java.util.SortedSet
    public java.util.Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    @Override // java.util.SortedSet
    public E last() {
        return delegate().last();
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(java.lang.Object obj) {
        try {
            return com.google.common.collect.ForwardingSortedMap.unsafeCompare(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(java.lang.Object obj) {
        try {
            java.util.Iterator<E> it = tailSet(obj).iterator();
            if (!it.hasNext()) {
                return false;
            }
            if (com.google.common.collect.ForwardingSortedMap.unsafeCompare(comparator(), it.next(), obj) != 0) {
                return false;
            }
            it.remove();
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    protected java.util.SortedSet<E> standardSubSet(E e, E e2) {
        return tailSet(e).headSet(e2);
    }
}
