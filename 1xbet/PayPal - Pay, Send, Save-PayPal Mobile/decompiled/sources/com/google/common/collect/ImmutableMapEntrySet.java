package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class ImmutableMapEntrySet<K, V> extends com.google.common.collect.ImmutableSet<java.util.Map.Entry<K, V>> {
    abstract com.google.common.collect.ImmutableMap<K, V> map();

    static final class RegularEntrySet<K, V> extends com.google.common.collect.ImmutableMapEntrySet<K, V> {
        private final transient com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> entries;
        private final transient com.google.common.collect.ImmutableMap<K, V> map;

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> immutableMap, java.util.Map.Entry<K, V>[] entryArr) {
            this(immutableMap, com.google.common.collect.ImmutableList.asImmutableList(entryArr));
        }

        RegularEntrySet(com.google.common.collect.ImmutableMap<K, V> immutableMap, com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> immutableList) {
            this.map = immutableMap;
            this.entries = immutableList;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        final com.google.common.collect.ImmutableMap<K, V> map() {
            return this.map;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int copyIntoArray(java.lang.Object[] objArr, int i) {
            return this.entries.copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> iterator() {
            return this.entries.iterator();
        }

        @Override // com.google.common.collect.ImmutableSet
        final com.google.common.collect.ImmutableList<java.util.Map.Entry<K, V>> createAsList() {
            return this.entries;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    ImmutableMapEntrySet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        V v = map().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return map().isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return map().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableMapEntrySet.EntrySetSerializedForm(map());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
    }

    static final class EntrySetSerializedForm<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableMap<K, V> map;

        EntrySetSerializedForm(com.google.common.collect.ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        final java.lang.Object readResolve() {
            return this.map.entrySet();
        }
    }
}
