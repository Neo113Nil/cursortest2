package com.google.common.collect;

/* loaded from: classes9.dex */
final class NullsFirstOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> ordering;

    @Override // com.google.common.collect.Ordering
    public final <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
        return this;
    }

    NullsFirstOrdering(com.google.common.collect.Ordering<? super T> ordering) {
        this.ordering = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.ordering.compare(t, t2);
    }

    @Override // com.google.common.collect.Ordering
    public final <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return this.ordering.reverse().nullsLast();
    }

    @Override // com.google.common.collect.Ordering
    public final <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
        return this.ordering.nullsLast();
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.NullsFirstOrdering) {
            return this.ordering.equals(((com.google.common.collect.NullsFirstOrdering) obj).ordering);
        }
        return false;
    }

    public final int hashCode() {
        return this.ordering.hashCode() ^ 957692532;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.ordering);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
