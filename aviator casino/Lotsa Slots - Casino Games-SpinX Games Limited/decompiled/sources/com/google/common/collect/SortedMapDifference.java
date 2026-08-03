package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface SortedMapDifference<K, V> extends com.google.common.collect.MapDifference<K, V> {
    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, com.google.common.collect.MapDifference.ValueDifference<V>> entriesDiffering();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesInCommon();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnLeft();

    @Override // com.google.common.collect.MapDifference
    java.util.SortedMap<K, V> entriesOnlyOnRight();

    /* renamed from: com.google.common.collect.SortedMapDifference$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
