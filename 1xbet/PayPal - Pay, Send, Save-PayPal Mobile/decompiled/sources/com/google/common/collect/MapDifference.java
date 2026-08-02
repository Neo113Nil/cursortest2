package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
/* loaded from: classes9.dex */
public interface MapDifference<K, V> {

    @com.google.errorprone.annotations.DoNotMock("Use Maps.difference")
    public interface ValueDifference<V> {
        boolean equals(java.lang.Object obj);

        int hashCode();

        V leftValue();

        V rightValue();
    }

    boolean areEqual();

    java.util.Map<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    java.util.Map<K, V> entriesInCommon();

    java.util.Map<K, V> entriesOnlyOnLeft();

    java.util.Map<K, V> entriesOnlyOnRight();

    boolean equals(java.lang.Object obj);

    int hashCode();
}
