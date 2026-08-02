package com.google.common.collect;

/* loaded from: classes9.dex */
final class ReverseOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> forwardOrder;

    ReverseOrdering(com.google.common.collect.Ordering<? super T> ordering) {
        this.forwardOrder = (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    @Override // com.google.common.collect.Ordering
    public final <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return this.forwardOrder;
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E min(E e, E e2) {
        return (E) this.forwardOrder.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E min(E e, E e2, E e3, E... eArr) {
        return (E) this.forwardOrder.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E min(java.util.Iterator<E> it) {
        return (E) this.forwardOrder.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E min(java.lang.Iterable<E> iterable) {
        return (E) this.forwardOrder.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E max(E e, E e2) {
        return (E) this.forwardOrder.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E max(E e, E e2, E e3, E... eArr) {
        return (E) this.forwardOrder.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E max(java.util.Iterator<E> it) {
        return (E) this.forwardOrder.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public final <E extends T> E max(java.lang.Iterable<E> iterable) {
        return (E) this.forwardOrder.min(iterable);
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.ReverseOrdering) {
            return this.forwardOrder.equals(((com.google.common.collect.ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.forwardOrder);
        sb.append(".reverse()");
        return sb.toString();
    }
}
