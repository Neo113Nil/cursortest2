package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class FilteredKeyListMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@com.google.common.collect.ParametricNullness java.lang.Object key) {
        return get((com.google.common.collect.FilteredKeyListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.FilteredKeyListMultimap<K, V>) key, values);
    }

    FilteredKeyListMultimap(com.google.common.collect.ListMultimap<K, V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.ListMultimap<K, V> unfiltered() {
        return (com.google.common.collect.ListMultimap) super.unfiltered();
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.List<V> get(@com.google.common.collect.ParametricNullness K key) {
        return (java.util.List) super.get((com.google.common.collect.FilteredKeyListMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.List<V> removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return (java.util.List) super.removeAll(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return (java.util.List) super.replaceValues((com.google.common.collect.FilteredKeyListMultimap<K, V>) key, (java.lang.Iterable) values);
    }
}
