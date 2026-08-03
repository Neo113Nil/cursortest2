package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface ListMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    java.util.Map<K, java.util.Collection<V>> asMap();

    boolean equals(@javax.annotation.CheckForNull java.lang.Object obj);

    @Override // com.google.common.collect.Multimap
    java.util.List<V> get(@com.google.common.collect.ParametricNullness K key);

    @Override // com.google.common.collect.Multimap
    java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key);

    @Override // com.google.common.collect.Multimap
    java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values);

    /* renamed from: com.google.common.collect.ListMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
