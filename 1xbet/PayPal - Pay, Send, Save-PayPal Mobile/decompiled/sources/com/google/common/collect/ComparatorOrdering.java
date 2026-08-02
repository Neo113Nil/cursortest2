package com.google.common.collect;

/* loaded from: classes4.dex */
final class ComparatorOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator<T> comparator;

    ComparatorOrdering(java.util.Comparator<T> comparator) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.ComparatorOrdering) {
            return this.comparator.equals(((com.google.common.collect.ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final java.lang.String toString() {
        return this.comparator.toString();
    }
}
