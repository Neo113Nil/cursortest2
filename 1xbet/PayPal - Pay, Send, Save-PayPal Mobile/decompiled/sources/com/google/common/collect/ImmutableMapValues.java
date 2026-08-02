package com.google.common.collect;

/* loaded from: classes9.dex */
final class ImmutableMapValues<K, V> extends com.google.common.collect.ImmutableCollection<V> {
    private final com.google.common.collect.ImmutableMap<K, V> map;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    ImmutableMapValues(com.google.common.collect.ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<V> iterator() {
        return new com.google.common.collect.UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMapValues.1
            final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryItr;

            {
                this.entryItr = com.google.common.collect.ImmutableMapValues.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.entryItr.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.entryItr.next().getValue();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return obj != null && com.google.common.collect.Iterators.contains(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final com.google.common.collect.ImmutableList<V> asList() {
        final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new com.google.common.collect.ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2
            final /* synthetic */ com.google.common.collect.ImmutableMapValues this$0;

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            {
                this.this$0 = this;
            }

            @Override // java.util.List
            public V get(int i) {
                return (V) ((java.util.Map.Entry) asList.get(i)).getValue();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return asList.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapValues.SerializedForm(this.map);
    }

    static final class SerializedForm<V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<?, V> map;

        SerializedForm(com.google.common.collect.ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        final java.lang.Object readResolve() {
            return this.map.values();
        }
    }
}
