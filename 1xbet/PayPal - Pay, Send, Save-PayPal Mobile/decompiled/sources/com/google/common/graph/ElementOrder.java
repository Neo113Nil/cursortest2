package com.google.common.graph;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class ElementOrder<T> {
    private final java.util.Comparator<T> comparator;
    private final com.google.common.graph.ElementOrder.Type type;

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    /* JADX WARN: Multi-variable type inference failed */
    final <T1 extends T> com.google.common.graph.ElementOrder<T1> cast() {
        return this;
    }

    private ElementOrder(com.google.common.graph.ElementOrder.Type type, java.util.Comparator<T> comparator) {
        this.type = (com.google.common.graph.ElementOrder.Type) com.google.common.base.Preconditions.checkNotNull(type);
        this.comparator = comparator;
        com.google.common.base.Preconditions.checkState((type == com.google.common.graph.ElementOrder.Type.SORTED) == (comparator != null));
    }

    public static <S> com.google.common.graph.ElementOrder<S> unordered() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.UNORDERED, null);
    }

    public static <S> com.google.common.graph.ElementOrder<S> stable() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.STABLE, null);
    }

    public static <S> com.google.common.graph.ElementOrder<S> insertion() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.INSERTION, null);
    }

    public static <S extends java.lang.Comparable<? super S>> com.google.common.graph.ElementOrder<S> natural() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.SORTED, com.google.common.collect.Ordering.natural());
    }

    public static <S> com.google.common.graph.ElementOrder<S> sorted(java.util.Comparator<S> comparator) {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.SORTED, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public final com.google.common.graph.ElementOrder.Type type() {
        return this.type;
    }

    public final java.util.Comparator<T> comparator() {
        java.util.Comparator<T> comparator = this.comparator;
        if (comparator != null) {
            return comparator;
        }
        throw new java.lang.UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.ElementOrder)) {
            return false;
        }
        com.google.common.graph.ElementOrder elementOrder = (com.google.common.graph.ElementOrder) obj;
        return this.type == elementOrder.type && java.util.Objects.equals(this.comparator, elementOrder.comparator);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.type, this.comparator);
    }

    public final java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper add = com.google.common.base.MoreObjects.toStringHelper(this).add("type", this.type);
        java.util.Comparator<T> comparator = this.comparator;
        if (comparator != null) {
            add.add("comparator", comparator);
        }
        return add.toString();
    }

    final <K extends T, V> java.util.Map<K, V> createMap(int i) {
        int ordinal = this.type.ordinal();
        if (ordinal == 0) {
            return com.google.common.collect.Maps.newHashMapWithExpectedSize(i);
        }
        if (ordinal == 1 || ordinal == 2) {
            return com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(i);
        }
        if (ordinal == 3) {
            return com.google.common.collect.Maps.newTreeMap(comparator());
        }
        throw new java.lang.AssertionError();
    }
}
