package com.google.common.collect;

/* loaded from: classes4.dex */
final class ByFunctionOrdering<F, T> extends com.google.common.collect.Ordering<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.Function<F, ? extends T> function;
    final com.google.common.collect.Ordering<T> ordering;

    ByFunctionOrdering(com.google.common.base.Function<F, ? extends T> function, com.google.common.collect.Ordering<T> ordering) {
        this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        this.ordering = (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public final int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.collect.ByFunctionOrdering)) {
            return false;
        }
        com.google.common.collect.ByFunctionOrdering byFunctionOrdering = (com.google.common.collect.ByFunctionOrdering) obj;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.function, this.ordering);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.ordering);
        sb.append(".onResultOf(");
        sb.append(this.function);
        sb.append(")");
        return sb.toString();
    }
}
