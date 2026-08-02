package com.google.common.collect;

/* loaded from: classes9.dex */
final class CompoundOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<? super T>[] comparators;

    CompoundOrdering(java.util.Comparator<? super T> comparator, java.util.Comparator<? super T> comparator2) {
        this.comparators = new java.util.Comparator[]{comparator, comparator2};
    }

    CompoundOrdering(java.lang.Iterable<? extends java.util.Comparator<? super T>> iterable) {
        this.comparators = (java.util.Comparator[]) com.google.common.collect.Iterables.toArray(iterable, new java.util.Comparator[0]);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            java.util.Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.CompoundOrdering) {
            return java.util.Arrays.equals(this.comparators, ((com.google.common.collect.CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.comparators);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ordering.compound(");
        sb.append(java.util.Arrays.toString(this.comparators));
        sb.append(")");
        return sb.toString();
    }
}
