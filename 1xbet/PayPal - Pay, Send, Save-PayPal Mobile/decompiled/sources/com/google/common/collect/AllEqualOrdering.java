package com.google.common.collect;

/* loaded from: classes9.dex */
final class AllEqualOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.AllEqualOrdering INSTANCE = new com.google.common.collect.AllEqualOrdering();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public final <S> com.google.common.collect.Ordering<S> reverse() {
        return this;
    }

    AllEqualOrdering() {
    }

    @Override // com.google.common.collect.Ordering
    public final <E> java.util.List<E> sortedCopy(java.lang.Iterable<E> iterable) {
        return com.google.common.collect.Lists.newArrayList(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public final <E> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> iterable) {
        return com.google.common.collect.ImmutableList.copyOf(iterable);
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    public final java.lang.String toString() {
        return "Ordering.allEqual()";
    }
}
