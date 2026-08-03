package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class AllEqualOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.AllEqualOrdering INSTANCE = new com.google.common.collect.AllEqualOrdering();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@javax.annotation.CheckForNull java.lang.Object left, @javax.annotation.CheckForNull java.lang.Object right) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public <S> com.google.common.collect.Ordering<S> reverse() {
        return this;
    }

    AllEqualOrdering() {
    }

    @Override // com.google.common.collect.Ordering
    public <E> java.util.List<E> sortedCopy(java.lang.Iterable<E> iterable) {
        return com.google.common.collect.Lists.newArrayList(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> iterable) {
        return com.google.common.collect.ImmutableList.copyOf(iterable);
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    public java.lang.String toString() {
        return "Ordering.allEqual()";
    }
}
