package com.google.common.collect;

/* loaded from: classes9.dex */
final class ImmutableMapKeySet<K, V> extends com.google.common.collect.IndexedImmutableSet<K> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    ImmutableMapKeySet(com.google.common.collect.ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<K> iterator() {
        return this.map.keyIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    final K get(int i) {
        return this.map.entrySet().asList().get(i).getKey();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapKeySet.KeySetSerializedForm(this.map);
    }

    static final class KeySetSerializedForm<K> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, ?> map;

        KeySetSerializedForm(com.google.common.collect.ImmutableMap<K, ?> immutableMap) {
            this.map = immutableMap;
        }

        final java.lang.Object readResolve() {
            return this.map.keySet();
        }
    }
}
