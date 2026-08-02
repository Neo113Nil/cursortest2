package com.google.common.collect;

/* loaded from: classes9.dex */
final class FilteredKeySetMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.FilteredSetMultimap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.FilteredKeySetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.FilteredKeySetMultimap<K, V>) obj, iterable);
    }

    FilteredKeySetMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap, com.google.common.base.Predicate<? super K> predicate) {
        super(setMultimap, predicate);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public final com.google.common.collect.SetMultimap<K, V> unfiltered() {
        return (com.google.common.collect.SetMultimap) this.unfiltered;
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final java.util.Set<V> get(K k) {
        return (java.util.Set) super.get((com.google.common.collect.FilteredKeySetMultimap<K, V>) k);
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final java.util.Set<V> removeAll(java.lang.Object obj) {
        return (java.util.Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        return (java.util.Set) super.replaceValues((com.google.common.collect.FilteredKeySetMultimap<K, V>) k, (java.lang.Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return (java.util.Set) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    public final java.util.Set<java.util.Map.Entry<K, V>> createEntries() {
        return new com.google.common.collect.FilteredKeySetMultimap.EntrySet();
    }

    final class EntrySet extends com.google.common.collect.FilteredKeyMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        private EntrySet() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }
    }
}
