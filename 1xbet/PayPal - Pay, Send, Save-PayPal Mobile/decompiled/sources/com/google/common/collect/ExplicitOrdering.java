package com.google.common.collect;

/* loaded from: classes9.dex */
final class ExplicitOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.ImmutableMap<T, java.lang.Integer> rankMap;

    ExplicitOrdering(java.util.List<T> list) {
        this(com.google.common.collect.Maps.indexMap(list));
    }

    ExplicitOrdering(com.google.common.collect.ImmutableMap<T, java.lang.Integer> immutableMap) {
        this.rankMap = immutableMap;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(T t, T t2) {
        return rank(t) - rank(t2);
    }

    private int rank(T t) {
        java.lang.Integer num = this.rankMap.get(t);
        if (num == null) {
            throw new com.google.common.collect.Ordering.IncomparableValueException(t);
        }
        return num.intValue();
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.collect.ExplicitOrdering) {
            return this.rankMap.equals(((com.google.common.collect.ExplicitOrdering) obj).rankMap);
        }
        return false;
    }

    public final int hashCode() {
        return this.rankMap.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ordering.explicit(");
        sb.append(this.rankMap.keySet());
        sb.append(")");
        return sb.toString();
    }
}
