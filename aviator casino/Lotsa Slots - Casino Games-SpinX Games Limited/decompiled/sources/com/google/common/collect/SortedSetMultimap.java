package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface SortedSetMultimap<K, V> extends com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    java.util.Map<K, java.util.Collection<V>> asMap();

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    @Override // com.google.common.collect.SetMultimap, com.google.common.collect.Multimap
    java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);

    @javax.annotation.CheckForNull
    java.util.Comparator<? super V> valueComparator();

    /* renamed from: com.google.common.collect.SortedSetMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
