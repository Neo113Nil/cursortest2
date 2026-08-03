package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class ForwardingSortedSetMultimap<K, V> extends com.google.common.collect.ForwardingSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.SortedSetMultimap<K, V> delegate();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object key) {
        return get((com.google.common.collect.ForwardingSortedSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object key) {
        return get((com.google.common.collect.ForwardingSortedSetMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.ForwardingSortedSetMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.ForwardingSortedSetMultimap<K, V>) key, values);
    }

    protected ForwardingSortedSetMultimap() {
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<V> get(@com.google.common.collect.ParametricNullness K key) {
        return delegate().get((com.google.common.collect.SortedSetMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return delegate().removeAll(key);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return delegate().replaceValues((com.google.common.collect.SortedSetMultimap<K, V>) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.SortedSetMultimap
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super V> valueComparator() {
        return delegate().valueComparator();
    }
}
