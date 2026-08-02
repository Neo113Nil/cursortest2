package com.google.common.collect;

/* loaded from: classes9.dex */
final class Synchronized {
    private Synchronized() {
    }

    static class SynchronizedObject implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object delegate;
        final java.lang.Object mutex;

        SynchronizedObject(java.lang.Object obj, java.lang.Object obj2) {
            this.delegate = com.google.common.base.Preconditions.checkNotNull(obj);
            this.mutex = obj2 == null ? this : obj2;
        }

        java.lang.Object delegate() {
            return this.delegate;
        }

        public java.lang.String toString() {
            java.lang.String obj;
            synchronized (this.mutex) {
                obj = this.delegate.toString();
            }
            return obj;
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Collection<E> collection(java.util.Collection<E> collection, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedCollection(collection, obj);
    }

    static class SynchronizedCollection<E> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Collection<E> {
        private static final long serialVersionUID = 0;

        private SynchronizedCollection(java.util.Collection<E> collection, java.lang.Object obj) {
            super(collection, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Collection<E> delegate() {
            return (java.util.Collection) super.delegate();
        }

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean add;
            synchronized (this.mutex) {
                add = delegate().add(e);
            }
            return add;
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = delegate().addAll(collection);
            }
            return addAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        public boolean contains(java.lang.Object obj) {
            boolean contains;
            synchronized (this.mutex) {
                contains = delegate().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(java.util.Collection<?> collection) {
            boolean containsAll;
            synchronized (this.mutex) {
                containsAll = delegate().containsAll(collection);
            }
            return containsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        public java.util.Iterator<E> iterator() {
            return delegate().iterator();
        }

        public boolean remove(java.lang.Object obj) {
            boolean remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(java.util.Collection<?> collection) {
            boolean removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(java.util.Collection<?> collection) {
            boolean retainAll;
            synchronized (this.mutex) {
                retainAll = delegate().retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public java.lang.Object[] toArray() {
            java.lang.Object[] array;
            synchronized (this.mutex) {
                array = delegate().toArray();
            }
            return array;
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) delegate().toArray(tArr);
            }
            return tArr2;
        }
    }

    static <E> java.util.Set<E> set(java.util.Set<E> set, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedSet(set, obj);
    }

    static class SynchronizedSet<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Set<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSet(java.util.Set<E> set, java.lang.Object obj) {
            super(set, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Set<E> delegate() {
            return (java.util.Set) super.delegate();
        }

        public boolean equals(java.lang.Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.SortedSet<E> sortedSet(java.util.SortedSet<E> sortedSet, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedSortedSet(sortedSet, obj);
    }

    static class SynchronizedSortedSet<E> extends com.google.common.collect.Synchronized.SynchronizedSet<E> implements java.util.SortedSet<E> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedSet(java.util.SortedSet<E> sortedSet, java.lang.Object obj) {
            super(sortedSet, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.SortedSet<E> delegate() {
            return (java.util.SortedSet) super.delegate();
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            java.util.Comparator<? super E> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        public java.util.SortedSet<E> subSet(E e, E e2) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().subSet(e, e2), this.mutex);
            }
            return sortedSet;
        }

        public java.util.SortedSet<E> headSet(E e) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().headSet(e), this.mutex);
            }
            return sortedSet;
        }

        public java.util.SortedSet<E> tailSet(E e) {
            java.util.SortedSet<E> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().tailSet(e), this.mutex);
            }
            return sortedSet;
        }

        @Override // java.util.SortedSet
        public E first() {
            E first;
            synchronized (this.mutex) {
                first = delegate().first();
            }
            return first;
        }

        @Override // java.util.SortedSet
        public E last() {
            E last;
            synchronized (this.mutex) {
                last = delegate().last();
            }
            return last;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.List<E> list(java.util.List<E> list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Synchronized.SynchronizedRandomAccessList(list, obj);
        }
        return new com.google.common.collect.Synchronized.SynchronizedList(list, obj);
    }

    static class SynchronizedList<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.List<E> {
        private static final long serialVersionUID = 0;

        SynchronizedList(java.util.List<E> list, java.lang.Object obj) {
            super(list, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.List<E> delegate() {
            return (java.util.List) super.delegate();
        }

        @Override // java.util.List
        public void add(int i, E e) {
            synchronized (this.mutex) {
                delegate().add(i, e);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, java.util.Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.mutex) {
                addAll = delegate().addAll(i, collection);
            }
            return addAll;
        }

        @Override // java.util.List
        public E get(int i) {
            E e;
            synchronized (this.mutex) {
                e = delegate().get(i);
            }
            return e;
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object obj) {
            int indexOf;
            synchronized (this.mutex) {
                indexOf = delegate().indexOf(obj);
            }
            return indexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            int lastIndexOf;
            synchronized (this.mutex) {
                lastIndexOf = delegate().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator() {
            return delegate().listIterator();
        }

        @Override // java.util.List
        public java.util.ListIterator<E> listIterator(int i) {
            return delegate().listIterator(i);
        }

        @Override // java.util.List
        public E remove(int i) {
            E remove;
            synchronized (this.mutex) {
                remove = delegate().remove(i);
            }
            return remove;
        }

        @Override // java.util.List
        public E set(int i, E e) {
            E e2;
            synchronized (this.mutex) {
                e2 = delegate().set(i, e);
            }
            return e2;
        }

        @Override // java.util.List
        public java.util.List<E> subList(int i, int i2) {
            java.util.List<E> list;
            synchronized (this.mutex) {
                list = com.google.common.collect.Synchronized.list(delegate().subList(i, i2), this.mutex);
            }
            return list;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(java.lang.Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }
    }

    static final class SynchronizedRandomAccessList<E> extends com.google.common.collect.Synchronized.SynchronizedList<E> implements java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        SynchronizedRandomAccessList(java.util.List<E> list, java.lang.Object obj) {
            super(list, obj);
        }
    }

    static <E> com.google.common.collect.Multiset<E> multiset(com.google.common.collect.Multiset<E> multiset, java.lang.Object obj) {
        return ((multiset instanceof com.google.common.collect.Synchronized.SynchronizedMultiset) || (multiset instanceof com.google.common.collect.ImmutableMultiset)) ? multiset : new com.google.common.collect.Synchronized.SynchronizedMultiset(multiset, obj);
    }

    static final class SynchronizedMultiset<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements com.google.common.collect.Multiset<E> {
        private static final long serialVersionUID = 0;
        transient java.util.Set<E> elementSet;
        transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        SynchronizedMultiset(com.google.common.collect.Multiset<E> multiset, java.lang.Object obj) {
            super(multiset, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public final com.google.common.collect.Multiset<E> delegate() {
            return (com.google.common.collect.Multiset) super.delegate();
        }

        @Override // com.google.common.collect.Multiset
        public final int count(java.lang.Object obj) {
            int count;
            synchronized (this.mutex) {
                count = delegate().count(obj);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public final int add(E e, int i) {
            int add;
            synchronized (this.mutex) {
                add = delegate().add(e, i);
            }
            return add;
        }

        @Override // com.google.common.collect.Multiset
        public final int remove(java.lang.Object obj, int i) {
            int remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, i);
            }
            return remove;
        }

        @Override // com.google.common.collect.Multiset
        public final int setCount(E e, int i) {
            int count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public final boolean setCount(E e, int i, int i2) {
            boolean count;
            synchronized (this.mutex) {
                count = delegate().setCount(e, i, i2);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public final java.util.Set<E> elementSet() {
            java.util.Set<E> set;
            synchronized (this.mutex) {
                if (this.elementSet == null) {
                    this.elementSet = com.google.common.collect.Synchronized.typePreservingSet(delegate().elementSet(), this.mutex);
                }
                set = this.elementSet;
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public final java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.typePreservingSet(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final boolean equals(java.lang.Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }
    }

    static <K, V> com.google.common.collect.Multimap<K, V> multimap(com.google.common.collect.Multimap<K, V> multimap, java.lang.Object obj) {
        return ((multimap instanceof com.google.common.collect.Synchronized.SynchronizedMultimap) || (multimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? multimap : new com.google.common.collect.Synchronized.SynchronizedMultimap(multimap, obj);
    }

    static class SynchronizedMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Multimap<K, V> {
        private static final long serialVersionUID = 0;
        transient java.util.Map<K, java.util.Collection<V>> asMap;
        transient java.util.Collection<java.util.Map.Entry<K, V>> entries;
        transient java.util.Set<K> keySet;
        transient com.google.common.collect.Multiset<K> keys;
        transient java.util.Collection<V> valuesCollection;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.Multimap<K, V> delegate() {
            return (com.google.common.collect.Multimap) super.delegate();
        }

        SynchronizedMultimap(com.google.common.collect.Multimap<K, V> multimap, java.lang.Object obj) {
            super(multimap, obj);
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(java.lang.Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = delegate().containsKey(obj);
            }
            return containsKey;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(java.lang.Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
            boolean containsEntry;
            synchronized (this.mutex) {
                containsEntry = delegate().containsEntry(obj, obj2);
            }
            return containsEntry;
        }

        public java.util.Collection<V> get(K k) {
            java.util.Collection<V> typePreservingCollection;
            synchronized (this.mutex) {
                typePreservingCollection = com.google.common.collect.Synchronized.typePreservingCollection(delegate().get(k), this.mutex);
            }
            return typePreservingCollection;
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(K k, V v) {
            boolean put;
            synchronized (this.mutex) {
                put = delegate().put(k, v);
            }
            return put;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
            boolean putAll;
            synchronized (this.mutex) {
                putAll = delegate().putAll(k, iterable);
            }
            return putAll;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
            boolean putAll;
            synchronized (this.mutex) {
                putAll = delegate().putAll(multimap);
            }
            return putAll;
        }

        public java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            java.util.Collection<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues(k, iterable);
            }
            return replaceValues;
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            boolean remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, obj2);
            }
            return remove;
        }

        public java.util.Collection<V> removeAll(java.lang.Object obj) {
            java.util.Collection<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Set<K> keySet() {
            java.util.Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = com.google.common.collect.Synchronized.typePreservingSet(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                if (this.valuesCollection == null) {
                    this.valuesCollection = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
                }
                collection = this.valuesCollection;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
            java.util.Collection<java.util.Map.Entry<K, V>> collection;
            synchronized (this.mutex) {
                if (this.entries == null) {
                    this.entries = com.google.common.collect.Synchronized.typePreservingCollection(delegate().entries(), this.mutex);
                }
                collection = this.entries;
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Map<K, java.util.Collection<V>> asMap() {
            java.util.Map<K, java.util.Collection<V>> map;
            synchronized (this.mutex) {
                if (this.asMap == null) {
                    this.asMap = new com.google.common.collect.Synchronized.SynchronizedAsMap(delegate().asMap(), this.mutex);
                }
                map = this.asMap;
            }
            return map;
        }

        @Override // com.google.common.collect.Multimap
        public com.google.common.collect.Multiset<K> keys() {
            com.google.common.collect.Multiset<K> multiset;
            synchronized (this.mutex) {
                if (this.keys == null) {
                    this.keys = com.google.common.collect.Synchronized.multiset(delegate().keys(), this.mutex);
                }
                multiset = this.keys;
            }
            return multiset;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(java.lang.Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }
    }

    static <K, V> com.google.common.collect.ListMultimap<K, V> listMultimap(com.google.common.collect.ListMultimap<K, V> listMultimap, java.lang.Object obj) {
        return ((listMultimap instanceof com.google.common.collect.Synchronized.SynchronizedListMultimap) || (listMultimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? listMultimap : new com.google.common.collect.Synchronized.SynchronizedListMultimap(listMultimap, obj);
    }

    static final class SynchronizedListMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Synchronized.SynchronizedListMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Synchronized.SynchronizedListMultimap<K, V>) obj, iterable);
        }

        SynchronizedListMultimap(com.google.common.collect.ListMultimap<K, V> listMultimap, java.lang.Object obj) {
            super(listMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public final com.google.common.collect.ListMultimap<K, V> delegate() {
            return (com.google.common.collect.ListMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> get(K k) {
            java.util.List<V> list;
            synchronized (this.mutex) {
                list = com.google.common.collect.Synchronized.list(delegate().get((com.google.common.collect.ListMultimap<K, V>) k), this.mutex);
            }
            return list;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> removeAll(java.lang.Object obj) {
            java.util.List<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.List<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            java.util.List<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues((com.google.common.collect.ListMultimap<K, V>) k, (java.lang.Iterable) iterable);
            }
            return replaceValues;
        }
    }

    static <K, V> com.google.common.collect.SetMultimap<K, V> setMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap, java.lang.Object obj) {
        return ((setMultimap instanceof com.google.common.collect.Synchronized.SynchronizedSetMultimap) || (setMultimap instanceof com.google.common.collect.BaseImmutableMultimap)) ? setMultimap : new com.google.common.collect.Synchronized.SynchronizedSetMultimap(setMultimap, obj);
    }

    static class SynchronizedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMultimap<K, V> implements com.google.common.collect.SetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Synchronized.SynchronizedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Synchronized.SynchronizedSetMultimap<K, V>) obj, iterable);
        }

        SynchronizedSetMultimap(com.google.common.collect.SetMultimap<K, V> setMultimap, java.lang.Object obj) {
            super(setMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public com.google.common.collect.SetMultimap<K, V> delegate() {
            return (com.google.common.collect.SetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> get(K k) {
            java.util.Set<V> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().get((com.google.common.collect.SetMultimap<K, V>) k), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> removeAll(java.lang.Object obj) {
            java.util.Set<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            java.util.Set<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues((com.google.common.collect.SetMultimap<K, V>) k, (java.lang.Iterable) iterable);
            }
            return replaceValues;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            java.util.Set<java.util.Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.set(delegate().entries(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }
    }

    static <K, V> com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap, java.lang.Object obj) {
        return sortedSetMultimap instanceof com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap ? sortedSetMultimap : new com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap(sortedSetMultimap, obj);
    }

    static final class SynchronizedSortedSetMultimap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
            return get((com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
            return get((com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
            return replaceValues((com.google.common.collect.Synchronized.SynchronizedSortedSetMultimap<K, V>) obj, iterable);
        }

        SynchronizedSortedSetMultimap(com.google.common.collect.SortedSetMultimap<K, V> sortedSetMultimap, java.lang.Object obj) {
            super(sortedSetMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public final com.google.common.collect.SortedSetMultimap<K, V> delegate() {
            return (com.google.common.collect.SortedSetMultimap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> get(K k) {
            java.util.SortedSet<V> sortedSet;
            synchronized (this.mutex) {
                sortedSet = com.google.common.collect.Synchronized.sortedSet(delegate().get((com.google.common.collect.SortedSetMultimap<K, V>) k), this.mutex);
            }
            return sortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> removeAll(java.lang.Object obj) {
            java.util.SortedSet<V> removeAll;
            synchronized (this.mutex) {
                removeAll = delegate().removeAll(obj);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final java.util.SortedSet<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
            java.util.SortedSet<V> replaceValues;
            synchronized (this.mutex) {
                replaceValues = delegate().replaceValues((com.google.common.collect.SortedSetMultimap<K, V>) k, (java.lang.Iterable) iterable);
            }
            return replaceValues;
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public final java.util.Comparator<? super V> valueComparator() {
            java.util.Comparator<? super V> valueComparator;
            synchronized (this.mutex) {
                valueComparator = delegate().valueComparator();
            }
            return valueComparator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Collection<E> typePreservingCollection(java.util.Collection<E> collection, java.lang.Object obj) {
        if (collection instanceof java.util.SortedSet) {
            return sortedSet((java.util.SortedSet) collection, obj);
        }
        if (collection instanceof java.util.Set) {
            return set((java.util.Set) collection, obj);
        }
        if (collection instanceof java.util.List) {
            return list((java.util.List) collection, obj);
        }
        return collection(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Set<E> typePreservingSet(java.util.Set<E> set, java.lang.Object obj) {
        if (set instanceof java.util.SortedSet) {
            return sortedSet((java.util.SortedSet) set, obj);
        }
        return set(set, obj);
    }

    static final class SynchronizedAsMapEntries<K, V> extends com.google.common.collect.Synchronized.SynchronizedSet<java.util.Map.Entry<K, java.util.Collection<V>>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapEntries(java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> set, java.lang.Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<K, java.util.Collection<V>>, java.util.Map.Entry<K, java.util.Collection<V>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public java.util.Map.Entry<K, java.util.Collection<V>> transform(final java.util.Map.Entry<K, java.util.Collection<V>> entry) {
                    return new com.google.common.collect.ForwardingMapEntry<K, java.util.Collection<V>>(this) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1
                        final /* synthetic */ com.google.common.collect.Synchronized.SynchronizedAsMapEntries.AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        public java.util.Map.Entry<K, java.util.Collection<V>> delegate() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public java.util.Collection<V> getValue() {
                            return com.google.common.collect.Synchronized.typePreservingCollection((java.util.Collection) entry.getValue(), com.google.common.collect.Synchronized.SynchronizedAsMapEntries.this.mutex);
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final java.lang.Object[] toArray() {
            java.lang.Object[] arrayImpl;
            synchronized (this.mutex) {
                arrayImpl = com.google.common.collect.ObjectArrays.toArrayImpl(delegate());
            }
            return arrayImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.mutex) {
                tArr2 = (T[]) com.google.common.collect.ObjectArrays.toArrayImpl(delegate(), tArr);
            }
            return tArr2;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            boolean containsEntryImpl;
            synchronized (this.mutex) {
                containsEntryImpl = com.google.common.collect.Maps.containsEntryImpl(delegate(), obj);
            }
            return containsEntryImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(java.util.Collection<?> collection) {
            boolean containsAllImpl;
            synchronized (this.mutex) {
                containsAllImpl = com.google.common.collect.Collections2.containsAllImpl(delegate(), collection);
            }
            return containsAllImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            boolean equalsImpl;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equalsImpl = com.google.common.collect.Sets.equalsImpl(delegate(), obj);
            }
            return equalsImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            boolean removeEntryImpl;
            synchronized (this.mutex) {
                removeEntryImpl = com.google.common.collect.Maps.removeEntryImpl(delegate(), obj);
            }
            return removeEntryImpl;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(java.util.Collection<?> collection) {
            boolean removeAll;
            synchronized (this.mutex) {
                removeAll = com.google.common.collect.Iterators.removeAll(delegate().iterator(), collection);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(java.util.Collection<?> collection) {
            boolean retainAll;
            synchronized (this.mutex) {
                retainAll = com.google.common.collect.Iterators.retainAll(delegate().iterator(), collection);
            }
            return retainAll;
        }
    }

    static <K, V> java.util.Map<K, V> map(java.util.Map<K, V> map, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedMap(map, obj);
    }

    static class SynchronizedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map<K, V> {
        private static final long serialVersionUID = 0;
        transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
        transient java.util.Set<K> keySet;
        transient java.util.Collection<V> values;

        SynchronizedMap(java.util.Map<K, V> map, java.lang.Object obj) {
            super(map, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Map<K, V> delegate() {
            return (java.util.Map) super.delegate();
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = delegate().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(java.lang.Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, V>> set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = com.google.common.collect.Synchronized.set(delegate().entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        public V get(java.lang.Object obj) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(obj);
            }
            return v;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public java.util.Set<K> keySet() {
            java.util.Set<K> set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = com.google.common.collect.Synchronized.set(delegate().keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            V put;
            synchronized (this.mutex) {
                put = delegate().put(k, v);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(java.util.Map<? extends K, ? extends V> map) {
            synchronized (this.mutex) {
                delegate().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(java.lang.Object obj) {
            V remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj);
            }
            return remove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        public java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                if (this.values == null) {
                    this.values = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
                }
                collection = this.values;
            }
            return collection;
        }

        @Override // java.util.Map
        public boolean equals(java.lang.Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }
    }

    static <K, V> java.util.SortedMap<K, V> sortedMap(java.util.SortedMap<K, V> sortedMap, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedSortedMap(sortedMap, obj);
    }

    static class SynchronizedSortedMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements java.util.SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedSortedMap(java.util.SortedMap<K, V> sortedMap, java.lang.Object obj) {
            super(sortedMap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.SortedMap<K, V> delegate() {
            return (java.util.SortedMap) super.delegate();
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
            java.util.Comparator<? super K> comparator;
            synchronized (this.mutex) {
                comparator = delegate().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K firstKey;
            synchronized (this.mutex) {
                firstKey = delegate().firstKey();
            }
            return firstKey;
        }

        public java.util.SortedMap<K, V> headMap(K k) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().headMap(k), this.mutex);
            }
            return sortedMap;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K lastKey;
            synchronized (this.mutex) {
                lastKey = delegate().lastKey();
            }
            return lastKey;
        }

        public java.util.SortedMap<K, V> subMap(K k, K k2) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().subMap(k, k2), this.mutex);
            }
            return sortedMap;
        }

        public java.util.SortedMap<K, V> tailMap(K k) {
            java.util.SortedMap<K, V> sortedMap;
            synchronized (this.mutex) {
                sortedMap = com.google.common.collect.Synchronized.sortedMap(delegate().tailMap(k), this.mutex);
            }
            return sortedMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> com.google.common.collect.BiMap<K, V> biMap(com.google.common.collect.BiMap<K, V> biMap, java.lang.Object obj) {
        if ((biMap instanceof com.google.common.collect.Synchronized.SynchronizedBiMap) || (biMap instanceof com.google.common.collect.ImmutableBiMap)) {
            return biMap;
        }
        return new com.google.common.collect.Synchronized.SynchronizedBiMap(biMap, obj, null);
    }

    static final class SynchronizedBiMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, V> implements com.google.common.collect.BiMap<K, V> {
        private static final long serialVersionUID = 0;
        private transient com.google.common.collect.BiMap<V, K> inverse;
        private transient java.util.Set<V> valueSet;

        private SynchronizedBiMap(com.google.common.collect.BiMap<K, V> biMap, java.lang.Object obj, com.google.common.collect.BiMap<V, K> biMap2) {
            super(biMap, obj);
            this.inverse = biMap2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public final com.google.common.collect.BiMap<K, V> delegate() {
            return (com.google.common.collect.BiMap) super.delegate();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final java.util.Set<V> values() {
            java.util.Set<V> set;
            synchronized (this.mutex) {
                if (this.valueSet == null) {
                    this.valueSet = com.google.common.collect.Synchronized.set(delegate().values(), this.mutex);
                }
                set = this.valueSet;
            }
            return set;
        }

        @Override // com.google.common.collect.BiMap
        public final V forcePut(K k, V v) {
            V forcePut;
            synchronized (this.mutex) {
                forcePut = delegate().forcePut(k, v);
            }
            return forcePut;
        }

        @Override // com.google.common.collect.BiMap
        public final com.google.common.collect.BiMap<V, K> inverse() {
            com.google.common.collect.BiMap<V, K> biMap;
            synchronized (this.mutex) {
                if (this.inverse == null) {
                    this.inverse = new com.google.common.collect.Synchronized.SynchronizedBiMap(delegate().inverse(), this.mutex, this);
                }
                biMap = this.inverse;
            }
            return biMap;
        }
    }

    static final class SynchronizedAsMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedMap<K, java.util.Collection<V>> {
        private static final long serialVersionUID = 0;
        transient java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> asMapEntrySet;
        transient java.util.Collection<java.util.Collection<V>> asMapValues;

        SynchronizedAsMap(java.util.Map<K, java.util.Collection<V>> map, java.lang.Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final java.util.Collection<V> get(java.lang.Object obj) {
            java.util.Collection<V> typePreservingCollection;
            synchronized (this.mutex) {
                java.util.Collection collection = (java.util.Collection) super.get(obj);
                typePreservingCollection = collection == null ? null : com.google.common.collect.Synchronized.typePreservingCollection(collection, this.mutex);
            }
            return typePreservingCollection;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> entrySet() {
            java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> set;
            synchronized (this.mutex) {
                if (this.asMapEntrySet == null) {
                    this.asMapEntrySet = new com.google.common.collect.Synchronized.SynchronizedAsMapEntries(delegate().entrySet(), this.mutex);
                }
                set = this.asMapEntrySet;
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final java.util.Collection<java.util.Collection<V>> values() {
            java.util.Collection<java.util.Collection<V>> collection;
            synchronized (this.mutex) {
                if (this.asMapValues == null) {
                    this.asMapValues = new com.google.common.collect.Synchronized.SynchronizedAsMapValues(delegate().values(), this.mutex);
                }
                collection = this.asMapValues;
            }
            return collection;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final boolean containsValue(java.lang.Object obj) {
            return values().contains(obj);
        }
    }

    static final class SynchronizedAsMapValues<V> extends com.google.common.collect.Synchronized.SynchronizedCollection<java.util.Collection<V>> {
        private static final long serialVersionUID = 0;

        SynchronizedAsMapValues(java.util.Collection<java.util.Collection<V>> collection, java.lang.Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Collection<V>> iterator() {
            return new com.google.common.collect.TransformedIterator<java.util.Collection<V>, java.util.Collection<V>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                public java.util.Collection<V> transform(java.util.Collection<V> collection) {
                    return com.google.common.collect.Synchronized.typePreservingCollection(collection, com.google.common.collect.Synchronized.SynchronizedAsMapValues.this.mutex);
                }
            };
        }
    }

    static final class SynchronizedNavigableSet<E> extends com.google.common.collect.Synchronized.SynchronizedSortedSet<E> implements java.util.NavigableSet<E> {
        private static final long serialVersionUID = 0;
        transient java.util.NavigableSet<E> descendingSet;

        SynchronizedNavigableSet(java.util.NavigableSet<E> navigableSet, java.lang.Object obj) {
            super(navigableSet, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public final java.util.NavigableSet<E> delegate() {
            return (java.util.NavigableSet) super.delegate();
        }

        @Override // java.util.NavigableSet
        public final E ceiling(E e) {
            E ceiling;
            synchronized (this.mutex) {
                ceiling = delegate().ceiling(e);
            }
            return ceiling;
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<E> descendingIterator() {
            return delegate().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> descendingSet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<E> navigableSet = this.descendingSet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<E> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().descendingSet(), this.mutex);
                this.descendingSet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableSet
        public final E floor(E e) {
            E floor;
            synchronized (this.mutex) {
                floor = delegate().floor(e);
            }
            return floor;
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> headSet(E e, boolean z) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().headSet(e, z), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        @Override // java.util.NavigableSet
        public final E higher(E e) {
            E higher;
            synchronized (this.mutex) {
                higher = delegate().higher(e);
            }
            return higher;
        }

        @Override // java.util.NavigableSet
        public final E lower(E e) {
            E lower;
            synchronized (this.mutex) {
                lower = delegate().lower(e);
            }
            return lower;
        }

        @Override // java.util.NavigableSet
        public final E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = delegate().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.NavigableSet
        public final E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = delegate().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().subSet(e, z, e2, z2), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> tailSet(E e, boolean z) {
            java.util.NavigableSet<E> navigableSet;
            synchronized (this.mutex) {
                navigableSet = com.google.common.collect.Synchronized.navigableSet(delegate().tailSet(e, z), this.mutex);
            }
            return navigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }
    }

    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> navigableSet, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedNavigableSet(navigableSet, obj);
    }

    static <E> java.util.NavigableSet<E> navigableSet(java.util.NavigableSet<E> navigableSet) {
        return navigableSet(navigableSet, null);
    }

    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> navigableMap) {
        return navigableMap(navigableMap, null);
    }

    static <K, V> java.util.NavigableMap<K, V> navigableMap(java.util.NavigableMap<K, V> navigableMap, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedNavigableMap(navigableMap, obj);
    }

    static final class SynchronizedNavigableMap<K, V> extends com.google.common.collect.Synchronized.SynchronizedSortedMap<K, V> implements java.util.NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        transient java.util.NavigableSet<K> descendingKeySet;
        transient java.util.NavigableMap<K, V> descendingMap;
        transient java.util.NavigableSet<K> navigableKeySet;

        SynchronizedNavigableMap(java.util.NavigableMap<K, V> navigableMap, java.lang.Object obj) {
            super(navigableMap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public final java.util.NavigableMap<K, V> delegate() {
            return (java.util.NavigableMap) super.delegate();
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> ceilingEntry(K k) {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().ceilingEntry(k), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            K ceilingKey;
            synchronized (this.mutex) {
                ceilingKey = delegate().ceilingKey(k);
            }
            return ceilingKey;
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> descendingKeySet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<K> navigableSet = this.descendingKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<K> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().descendingKeySet(), this.mutex);
                this.descendingKeySet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> descendingMap() {
            synchronized (this.mutex) {
                java.util.NavigableMap<K, V> navigableMap = this.descendingMap;
                if (navigableMap != null) {
                    return navigableMap;
                }
                java.util.NavigableMap<K, V> navigableMap2 = com.google.common.collect.Synchronized.navigableMap(delegate().descendingMap(), this.mutex);
                this.descendingMap = navigableMap2;
                return navigableMap2;
            }
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> firstEntry() {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().firstEntry(), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> floorEntry(K k) {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().floorEntry(k), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            K floorKey;
            synchronized (this.mutex) {
                floorKey = delegate().floorKey(k);
            }
            return floorKey;
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> headMap(K k, boolean z) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().headMap(k, z), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> higherEntry(K k) {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().higherEntry(k), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            K higherKey;
            synchronized (this.mutex) {
                higherKey = delegate().higherKey(k);
            }
            return higherKey;
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> lastEntry() {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().lastEntry(), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> lowerEntry(K k) {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().lowerEntry(k), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            K lowerKey;
            synchronized (this.mutex) {
                lowerKey = delegate().lowerKey(k);
            }
            return lowerKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final java.util.Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            synchronized (this.mutex) {
                java.util.NavigableSet<K> navigableSet = this.navigableKeySet;
                if (navigableSet != null) {
                    return navigableSet;
                }
                java.util.NavigableSet<K> navigableSet2 = com.google.common.collect.Synchronized.navigableSet(delegate().navigableKeySet(), this.mutex);
                this.navigableKeySet = navigableSet2;
                return navigableSet2;
            }
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollFirstEntry() {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().pollFirstEntry(), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, V> pollLastEntry() {
            java.util.Map.Entry<K, V> nullableSynchronizedEntry;
            synchronized (this.mutex) {
                nullableSynchronizedEntry = com.google.common.collect.Synchronized.nullableSynchronizedEntry(delegate().pollLastEntry(), this.mutex);
            }
            return nullableSynchronizedEntry;
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().subMap(k, z, k2, z2), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, V> tailMap(K k, boolean z) {
            java.util.NavigableMap<K, V> navigableMap;
            synchronized (this.mutex) {
                navigableMap = com.google.common.collect.Synchronized.navigableMap(delegate().tailMap(k, z), this.mutex);
            }
            return navigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Map.Entry<K, V> nullableSynchronizedEntry(java.util.Map.Entry<K, V> entry, java.lang.Object obj) {
        if (entry == null) {
            return null;
        }
        return new com.google.common.collect.Synchronized.SynchronizedEntry(entry, obj);
    }

    static final class SynchronizedEntry<K, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements java.util.Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        SynchronizedEntry(java.util.Map.Entry<K, V> entry, java.lang.Object obj) {
            super(entry, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public final java.util.Map.Entry<K, V> delegate() {
            return (java.util.Map.Entry) super.delegate();
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            boolean equals;
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            K key;
            synchronized (this.mutex) {
                key = delegate().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V value;
            synchronized (this.mutex) {
                value = delegate().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V value;
            synchronized (this.mutex) {
                value = delegate().setValue(v);
            }
            return value;
        }
    }

    static <E> java.util.Queue<E> queue(java.util.Queue<E> queue, java.lang.Object obj) {
        return queue instanceof com.google.common.collect.Synchronized.SynchronizedQueue ? queue : new com.google.common.collect.Synchronized.SynchronizedQueue(queue, obj);
    }

    static class SynchronizedQueue<E> extends com.google.common.collect.Synchronized.SynchronizedCollection<E> implements java.util.Queue<E> {
        private static final long serialVersionUID = 0;

        SynchronizedQueue(java.util.Queue<E> queue, java.lang.Object obj) {
            super(queue, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public java.util.Queue<E> delegate() {
            return (java.util.Queue) super.delegate();
        }

        @Override // java.util.Queue
        public E element() {
            E element;
            synchronized (this.mutex) {
                element = delegate().element();
            }
            return element;
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean offer;
            synchronized (this.mutex) {
                offer = delegate().offer(e);
            }
            return offer;
        }

        @Override // java.util.Queue
        public E peek() {
            E peek;
            synchronized (this.mutex) {
                peek = delegate().peek();
            }
            return peek;
        }

        @Override // java.util.Queue
        public E poll() {
            E poll;
            synchronized (this.mutex) {
                poll = delegate().poll();
            }
            return poll;
        }

        @Override // java.util.Queue
        public E remove() {
            E remove;
            synchronized (this.mutex) {
                remove = delegate().remove();
            }
            return remove;
        }
    }

    static <E> java.util.Deque<E> deque(java.util.Deque<E> deque, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedDeque(deque, obj);
    }

    static final class SynchronizedDeque<E> extends com.google.common.collect.Synchronized.SynchronizedQueue<E> implements java.util.Deque<E> {
        private static final long serialVersionUID = 0;

        SynchronizedDeque(java.util.Deque<E> deque, java.lang.Object obj) {
            super(deque, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public final java.util.Deque<E> delegate() {
            return (java.util.Deque) super.delegate();
        }

        @Override // java.util.Deque
        public final void addFirst(E e) {
            synchronized (this.mutex) {
                delegate().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public final void addLast(E e) {
            synchronized (this.mutex) {
                delegate().addLast(e);
            }
        }

        @Override // java.util.Deque
        public final boolean offerFirst(E e) {
            boolean offerFirst;
            synchronized (this.mutex) {
                offerFirst = delegate().offerFirst(e);
            }
            return offerFirst;
        }

        @Override // java.util.Deque
        public final boolean offerLast(E e) {
            boolean offerLast;
            synchronized (this.mutex) {
                offerLast = delegate().offerLast(e);
            }
            return offerLast;
        }

        @Override // java.util.Deque
        public final E removeFirst() {
            E removeFirst;
            synchronized (this.mutex) {
                removeFirst = delegate().removeFirst();
            }
            return removeFirst;
        }

        @Override // java.util.Deque
        public final E removeLast() {
            E removeLast;
            synchronized (this.mutex) {
                removeLast = delegate().removeLast();
            }
            return removeLast;
        }

        @Override // java.util.Deque
        public final E pollFirst() {
            E pollFirst;
            synchronized (this.mutex) {
                pollFirst = delegate().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.Deque
        public final E pollLast() {
            E pollLast;
            synchronized (this.mutex) {
                pollLast = delegate().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.Deque
        public final E getFirst() {
            E first;
            synchronized (this.mutex) {
                first = delegate().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public final E getLast() {
            E last;
            synchronized (this.mutex) {
                last = delegate().getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public final E peekFirst() {
            E peekFirst;
            synchronized (this.mutex) {
                peekFirst = delegate().peekFirst();
            }
            return peekFirst;
        }

        @Override // java.util.Deque
        public final E peekLast() {
            E peekLast;
            synchronized (this.mutex) {
                peekLast = delegate().peekLast();
            }
            return peekLast;
        }

        @Override // java.util.Deque
        public final boolean removeFirstOccurrence(java.lang.Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.mutex) {
                removeFirstOccurrence = delegate().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        @Override // java.util.Deque
        public final boolean removeLastOccurrence(java.lang.Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.mutex) {
                removeLastOccurrence = delegate().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }

        @Override // java.util.Deque
        public final void push(E e) {
            synchronized (this.mutex) {
                delegate().push(e);
            }
        }

        @Override // java.util.Deque
        public final E pop() {
            E pop;
            synchronized (this.mutex) {
                pop = delegate().pop();
            }
            return pop;
        }

        @Override // java.util.Deque
        public final java.util.Iterator<E> descendingIterator() {
            java.util.Iterator<E> descendingIterator;
            synchronized (this.mutex) {
                descendingIterator = delegate().descendingIterator();
            }
            return descendingIterator;
        }
    }

    static <R, C, V> com.google.common.collect.Table<R, C, V> table(com.google.common.collect.Table<R, C, V> table, java.lang.Object obj) {
        return new com.google.common.collect.Synchronized.SynchronizedTable(table, obj);
    }

    static final class SynchronizedTable<R, C, V> extends com.google.common.collect.Synchronized.SynchronizedObject implements com.google.common.collect.Table<R, C, V> {
        SynchronizedTable(com.google.common.collect.Table<R, C, V> table, java.lang.Object obj) {
            super(table, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public final com.google.common.collect.Table<R, C, V> delegate() {
            return (com.google.common.collect.Table) super.delegate();
        }

        @Override // com.google.common.collect.Table
        public final boolean contains(java.lang.Object obj, java.lang.Object obj2) {
            boolean contains;
            synchronized (this.mutex) {
                contains = delegate().contains(obj, obj2);
            }
            return contains;
        }

        @Override // com.google.common.collect.Table
        public final boolean containsRow(java.lang.Object obj) {
            boolean containsRow;
            synchronized (this.mutex) {
                containsRow = delegate().containsRow(obj);
            }
            return containsRow;
        }

        @Override // com.google.common.collect.Table
        public final boolean containsColumn(java.lang.Object obj) {
            boolean containsColumn;
            synchronized (this.mutex) {
                containsColumn = delegate().containsColumn(obj);
            }
            return containsColumn;
        }

        @Override // com.google.common.collect.Table
        public final boolean containsValue(java.lang.Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = delegate().containsValue(obj);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.Table
        public final V get(java.lang.Object obj, java.lang.Object obj2) {
            V v;
            synchronized (this.mutex) {
                v = delegate().get(obj, obj2);
            }
            return v;
        }

        @Override // com.google.common.collect.Table
        public final boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = delegate().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            int size;
            synchronized (this.mutex) {
                size = delegate().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Table
        public final void clear() {
            synchronized (this.mutex) {
                delegate().clear();
            }
        }

        @Override // com.google.common.collect.Table
        public final V put(R r, C c, V v) {
            V put;
            synchronized (this.mutex) {
                put = delegate().put(r, c, v);
            }
            return put;
        }

        @Override // com.google.common.collect.Table
        public final void putAll(com.google.common.collect.Table<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.mutex) {
                delegate().putAll(table);
            }
        }

        @Override // com.google.common.collect.Table
        public final V remove(java.lang.Object obj, java.lang.Object obj2) {
            V remove;
            synchronized (this.mutex) {
                remove = delegate().remove(obj, obj2);
            }
            return remove;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, V> row(R r) {
            java.util.Map<C, V> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(delegate().row(r), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, V> column(C c) {
            java.util.Map<R, V> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(delegate().column(c), this.mutex);
            }
            return map;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> cellSet() {
            java.util.Set<com.google.common.collect.Table.Cell<R, C, V>> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().cellSet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Set<R> rowKeySet() {
            java.util.Set<R> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().rowKeySet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Set<C> columnKeySet() {
            java.util.Set<C> set;
            synchronized (this.mutex) {
                set = com.google.common.collect.Synchronized.set(delegate().columnKeySet(), this.mutex);
            }
            return set;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Collection<V> values() {
            java.util.Collection<V> collection;
            synchronized (this.mutex) {
                collection = com.google.common.collect.Synchronized.collection(delegate().values(), this.mutex);
            }
            return collection;
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<R, java.util.Map<C, V>> rowMap() {
            java.util.Map<R, java.util.Map<C, V>> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(com.google.common.collect.Maps.transformValues(delegate().rowMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Synchronized$SynchronizedTable$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.collect.Synchronized.SynchronizedTable.this.m10322x382f7800((java.util.Map) obj);
                    }
                }), this.mutex);
            }
            return map;
        }

        /* renamed from: lambda$rowMap$0$com-google-common-collect-Synchronized$SynchronizedTable, reason: not valid java name */
        final /* synthetic */ java.util.Map m10322x382f7800(java.util.Map map) {
            return com.google.common.collect.Synchronized.map(map, this.mutex);
        }

        @Override // com.google.common.collect.Table
        public final java.util.Map<C, java.util.Map<R, V>> columnMap() {
            java.util.Map<C, java.util.Map<R, V>> map;
            synchronized (this.mutex) {
                map = com.google.common.collect.Synchronized.map(com.google.common.collect.Maps.transformValues(delegate().columnMap(), new com.google.common.base.Function() { // from class: com.google.common.collect.Synchronized$SynchronizedTable$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.collect.Synchronized.SynchronizedTable.this.m10321xe2d1ccd6((java.util.Map) obj);
                    }
                }), this.mutex);
            }
            return map;
        }

        /* renamed from: lambda$columnMap$0$com-google-common-collect-Synchronized$SynchronizedTable, reason: not valid java name */
        final /* synthetic */ java.util.Map m10321xe2d1ccd6(java.util.Map map) {
            return com.google.common.collect.Synchronized.map(map, this.mutex);
        }

        @Override // com.google.common.collect.Table
        public final int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = delegate().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.Table
        public final boolean equals(java.lang.Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                equals = delegate().equals(obj);
            }
            return equals;
        }
    }
}
