package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements java.io.Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient java.util.Map<K, java.util.Collection<V>> map;
    private transient int totalSize;

    abstract java.util.Collection<V> createCollection();

    static /* synthetic */ int access$208(com.google.common.collect.AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(com.google.common.collect.AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.totalSize;
        abstractMapBasedMultimap.totalSize = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(com.google.common.collect.AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize + i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$220(com.google.common.collect.AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.totalSize - i;
        abstractMapBasedMultimap.totalSize = i2;
        return i2;
    }

    protected AbstractMapBasedMultimap(java.util.Map<K, java.util.Collection<V>> map) {
        com.google.common.base.Preconditions.checkArgument(map.isEmpty());
        this.map = map;
    }

    final void setMap(java.util.Map<K, java.util.Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (java.util.Collection<V> collection : map.values()) {
            com.google.common.base.Preconditions.checkArgument(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    java.util.Collection<V> createUnmodifiableEmptyCollection() {
        return (java.util.Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    java.util.Collection<V> createCollection(K k) {
        return createCollection();
    }

    java.util.Map<K, java.util.Collection<V>> backingMap() {
        return this.map;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.totalSize;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        java.util.Collection<V> collection = this.map.get(k);
        if (collection == null) {
            java.util.Collection<V> createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v)) {
            return false;
        }
        this.totalSize++;
        return true;
    }

    private java.util.Collection<V> getOrCreateCollection(K k) {
        java.util.Collection<V> collection = this.map.get(k);
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> createCollection = createCollection(k);
        this.map.put(k, createCollection);
        return createCollection;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        java.util.Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        java.util.Collection<V> orCreateCollection = getOrCreateCollection(k);
        java.util.Collection<V> createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (java.util.Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> removeAll(java.lang.Object obj) {
        java.util.Collection<V> remove = this.map.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        java.util.Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.totalSize -= remove.size();
        remove.clear();
        return (java.util.Collection<V>) unmodifiableCollectionSubclass(createCollection);
    }

    <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> collection) {
        return java.util.Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        java.util.Iterator<java.util.Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Collection<V> get(K k) {
        java.util.Collection<V> collection = this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    java.util.Collection<V> wrapCollection(K k, java.util.Collection<V> collection) {
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection(k, collection, null);
    }

    final java.util.List<V> wrapList(K k, java.util.List<V> list, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.AbstractMapBasedMultimap.RandomAccessWrappedList(k, list, wrappedCollection);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList(k, list, wrappedCollection);
    }

    class WrappedCollection extends java.util.AbstractCollection<V> {
        final com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;
        final java.util.Collection<V> ancestorDelegate;
        java.util.Collection<V> delegate;
        final K key;

        WrappedCollection(K k, java.util.Collection<V> collection, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            this.key = k;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            this.ancestorDelegate = wrappedCollection == null ? null : wrappedCollection.getDelegate();
        }

        void refreshIfEmpty() {
            java.util.Collection<V> collection;
            com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                    throw new java.util.ConcurrentModificationException();
                }
            } else {
                if (!this.delegate.isEmpty() || (collection = (java.util.Collection) com.google.common.collect.AbstractMapBasedMultimap.this.map.get(this.key)) == null) {
                    return;
                }
                this.delegate = collection;
            }
        }

        void removeIfEmpty() {
            com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                com.google.common.collect.AbstractMapBasedMultimap.this.map.remove(this.key);
            }
        }

        K getKey() {
            return this.key;
        }

        void addToMap() {
            com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection == null) {
                com.google.common.collect.AbstractMapBasedMultimap.this.map.put(this.key, this.delegate);
            } else {
                wrappedCollection.addToMap();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }

        java.util.Collection<V> getDelegate() {
            return this.delegate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.WrappedIterator();
        }

        class WrappedIterator implements java.util.Iterator<V> {
            final java.util.Iterator<V> delegateIterator;
            final java.util.Collection<V> originalDelegate;

            WrappedIterator() {
                this.originalDelegate = com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.delegate;
                this.delegateIterator = com.google.common.collect.AbstractMapBasedMultimap.iteratorOrListIterator(com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.delegate);
            }

            WrappedIterator(java.util.Iterator<V> it) {
                this.originalDelegate = com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.delegate;
                this.delegateIterator = it;
            }

            void validateIterator() {
                com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.refreshIfEmpty();
                if (com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.delegate != this.originalDelegate) {
                    throw new java.util.ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.delegateIterator.remove();
                com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
                com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.removeIfEmpty();
            }

            java.util.Iterator<V> getDelegateIterator() {
                validateIterator();
                return this.delegateIterator;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(v);
            if (add) {
                com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection getAncestor() {
            return this.ancestor;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.delegate.clear();
            com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, size);
            removeIfEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
                removeIfEmpty();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            com.google.common.base.Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.delegate.retainAll(collection);
            if (retainAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return retainAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> java.util.Iterator<E> iteratorOrListIterator(java.util.Collection<E> collection) {
        if (collection instanceof java.util.List) {
            return ((java.util.List) collection).listIterator();
        }
        return collection.iterator();
    }

    final class WrappedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.Set<V> {
        WrappedSet(K k, java.util.Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAllImpl = com.google.common.collect.Sets.removeAllImpl((java.util.Set<?>) this.delegate, collection);
            if (removeAllImpl) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAllImpl;
        }
    }

    class WrappedSortedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.SortedSet<V> {
        WrappedSortedSet(K k, java.util.SortedSet<V> sortedSet, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, sortedSet, wrappedCollection);
        }

        java.util.SortedSet<V> getSortedSetDelegate() {
            return (java.util.SortedSet) getDelegate();
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super V> comparator() {
            return getSortedSetDelegate().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        @Override // java.util.SortedSet
        public V last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> headSet(V v) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().headSet(v), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> subSet(V v, V v2) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().subSet(v, v2), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> tailSet(V v) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().tailSet(v), getAncestor() == null ? this : getAncestor());
        }
    }

    final class WrappedNavigableSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements java.util.NavigableSet<V> {
        WrappedNavigableSet(K k, java.util.NavigableSet<V> navigableSet, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, navigableSet, wrappedCollection);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public final java.util.NavigableSet<V> getSortedSetDelegate() {
            return (java.util.NavigableSet) super.getSortedSetDelegate();
        }

        @Override // java.util.NavigableSet
        public final V lower(V v) {
            return getSortedSetDelegate().lower(v);
        }

        @Override // java.util.NavigableSet
        public final V floor(V v) {
            return getSortedSetDelegate().floor(v);
        }

        @Override // java.util.NavigableSet
        public final V ceiling(V v) {
            return getSortedSetDelegate().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public final V higher(V v) {
            return getSortedSetDelegate().higher(v);
        }

        @Override // java.util.NavigableSet
        public final V pollFirst() {
            return (V) com.google.common.collect.Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public final V pollLast() {
            return (V) com.google.common.collect.Iterators.pollNext(descendingIterator());
        }

        private java.util.NavigableSet<V> wrap(java.util.NavigableSet<V> navigableSet) {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(this.key, navigableSet, getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<V> descendingSet() {
            return wrap(getSortedSetDelegate().descendingSet());
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<V> descendingIterator() {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.WrappedIterator(getSortedSetDelegate().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return wrap(getSortedSetDelegate().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<V> headSet(V v, boolean z) {
            return wrap(getSortedSetDelegate().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<V> tailSet(V v, boolean z) {
            return wrap(getSortedSetDelegate().tailSet(v, z));
        }
    }

    class WrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.List<V> {
        WrappedList(K k, java.util.List<V> list, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }

        java.util.List<V> getListDelegate() {
            return (java.util.List) getDelegate();
        }

        @Override // java.util.List
        public boolean addAll(int i, java.util.Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(i, collection);
            if (addAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, getDelegate().size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        @Override // java.util.List
        public V set(int i, V v) {
            refreshIfEmpty();
            return getListDelegate().set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            refreshIfEmpty();
            boolean isEmpty = getDelegate().isEmpty();
            getListDelegate().add(i, v);
            com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
            if (isEmpty) {
                addToMap();
            }
        }

        @Override // java.util.List
        public V remove(int i) {
            refreshIfEmpty();
            V remove = getListDelegate().remove(i);
            com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
            removeIfEmpty();
            return remove;
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator() {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList.WrappedListIterator();
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator(int i) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList.WrappedListIterator(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public java.util.List<V> subList(int i, int i2) {
            refreshIfEmpty();
            return com.google.common.collect.AbstractMapBasedMultimap.this.wrapList(getKey(), getListDelegate().subList(i, i2), getAncestor() == null ? this : getAncestor());
        }

        final class WrappedListIterator extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements java.util.ListIterator<V> {
            WrappedListIterator() {
                super();
            }

            WrappedListIterator(int i) {
                super(com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.getListDelegate().listIterator(i));
            }

            private java.util.ListIterator<V> getDelegateListIterator() {
                return (java.util.ListIterator) getDelegateIterator();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                getDelegateListIterator().set(v);
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                boolean isEmpty = com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.isEmpty();
                getDelegateListIterator().add(v);
                com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.addToMap();
                }
            }
        }
    }

    final class RandomAccessWrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedList implements java.util.RandomAccess {
        RandomAccessWrappedList(K k, java.util.List<V> list, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return new com.google.common.collect.AbstractMapBasedMultimap.KeySet(this.map);
    }

    final java.util.Set<K> createMaybeNavigableKeySet() {
        java.util.Map<K, java.util.Collection<V>> map = this.map;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet((java.util.NavigableMap) this.map);
        }
        if (map instanceof java.util.SortedMap) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet((java.util.SortedMap) this.map);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.KeySet(this.map);
    }

    class KeySet extends com.google.common.collect.Maps.KeySet<K, java.util.Collection<V>> {
        KeySet(java.util.Map<K, java.util.Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = map().entrySet().iterator();
            return new java.util.Iterator<K>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1
                java.util.Map.Entry<K, java.util.Collection<V>> entry;
                final /* synthetic */ com.google.common.collect.AbstractMapBasedMultimap.KeySet this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public K next() {
                    java.util.Map.Entry<K, java.util.Collection<V>> entry = (java.util.Map.Entry) it.next();
                    this.entry = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    com.google.common.base.Preconditions.checkState(this.entry != null, "no calls to next() since the last call to remove()");
                    java.util.Collection<V> value = this.entry.getValue();
                    it.remove();
                    com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, value.size());
                    value.clear();
                    this.entry = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Collection<V> remove = map().remove(obj);
            if (remove == null) {
                return false;
            }
            int size = remove.size();
            remove.clear();
            com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, size);
            return size > 0;
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.Iterators.clear(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> collection) {
            return map().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object obj) {
            return this == obj || map().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return map().keySet().hashCode();
        }
    }

    class SortedKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.KeySet implements java.util.SortedSet<K> {
        SortedKeySet(java.util.SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.SortedMap) super.map();
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return sortedMap().firstKey();
        }

        public java.util.SortedSet<K> headSet(K k) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return sortedMap().lastKey();
        }

        public java.util.SortedSet<K> subSet(K k, K k2) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().subMap(k, k2));
        }

        public java.util.SortedSet<K> tailSet(K k) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().tailMap(k));
        }
    }

    final class NavigableKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedKeySet implements java.util.NavigableSet<K> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
            return headSet((com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
            return tailSet((com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet) obj);
        }

        NavigableKeySet(java.util.NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public final java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return sortedMap().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return sortedMap().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return sortedMap().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return sortedMap().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            return (K) com.google.common.collect.Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            return (K) com.google.common.collect.Iterators.pollNext(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<K> descendingSet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<K> headSet(K k, boolean z) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().headMap(k, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().subMap(k, z, k2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final java.util.NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<K> tailSet(K k, boolean z) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().tailMap(k, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    abstract class Itr<T> implements java.util.Iterator<T> {
        final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> keyIterator;
        K key = null;
        java.util.Collection<V> collection = null;
        java.util.Iterator<V> valueIterator = com.google.common.collect.Iterators.emptyModifiableIterator();

        abstract T output(K k, V v);

        Itr() {
            this.keyIterator = com.google.common.collect.AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.valueIterator.hasNext()) {
                java.util.Map.Entry<K, java.util.Collection<V>> next = this.keyIterator.next();
                this.key = next.getKey();
                java.util.Collection<V> value = next.getValue();
                this.collection = value;
                this.valueIterator = value.iterator();
            }
            return output(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.key), this.valueIterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.valueIterator.remove();
            if (((java.util.Collection) java.util.Objects.requireNonNull(this.collection)).isEmpty()) {
                this.keyIterator.remove();
            }
            com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
        }
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<V> createValues() {
        return new com.google.common.collect.AbstractMultimap.Values();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<V> valueIterator() {
        return new com.google.common.collect.AbstractMapBasedMultimap<K, V>.Itr<V>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            V output(K k, V v) {
                return v;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return new com.google.common.collect.Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Collection<java.util.Map.Entry<K, V>> createEntries() {
        if (this instanceof com.google.common.collect.SetMultimap) {
            return new com.google.common.collect.AbstractMultimap.EntrySet();
        }
        return new com.google.common.collect.AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new com.google.common.collect.AbstractMapBasedMultimap<K, V>.Itr<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* bridge */ /* synthetic */ java.lang.Object output(java.lang.Object obj, java.lang.Object obj2) {
                return output((com.google.common.collect.AbstractMapBasedMultimap.AnonymousClass2) obj, obj2);
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            java.util.Map.Entry<K, V> output(K k, V v) {
                return com.google.common.collect.Maps.immutableEntry(k, v);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return new com.google.common.collect.AbstractMapBasedMultimap.AsMap(this.map);
    }

    final java.util.Map<K, java.util.Collection<V>> createMaybeNavigableAsMap() {
        java.util.Map<K, java.util.Collection<V>> map = this.map;
        if (map instanceof java.util.NavigableMap) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap((java.util.NavigableMap) this.map);
        }
        if (map instanceof java.util.SortedMap) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap((java.util.SortedMap) this.map);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.AsMap(this.map);
    }

    class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        final transient java.util.Map<K, java.util.Collection<V>> submap;

        AsMap(java.util.Map<K, java.util.Collection<V>> map) {
            this.submap = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.AsMap.AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return com.google.common.collect.Maps.safeContainsKey(this.submap, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V> get(java.lang.Object obj) {
            java.util.Collection<V> collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return com.google.common.collect.AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
            return com.google.common.collect.AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.submap.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V> remove(java.lang.Object obj) {
            java.util.Collection<V> remove = this.submap.remove(obj);
            if (remove == null) {
                return null;
            }
            java.util.Collection<V> createCollection = com.google.common.collect.AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(remove);
            com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return createCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(java.lang.Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.submap.hashCode();
        }

        @Override // java.util.AbstractMap
        public java.lang.String toString() {
            return this.submap.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.submap == com.google.common.collect.AbstractMapBasedMultimap.this.map) {
                com.google.common.collect.AbstractMapBasedMultimap.this.clear();
            } else {
                com.google.common.collect.Iterators.clear(new com.google.common.collect.AbstractMapBasedMultimap.AsMap.AsMapIterator());
            }
        }

        java.util.Map.Entry<K, java.util.Collection<V>> wrapEntry(java.util.Map.Entry<K, java.util.Collection<V>> entry) {
            K key = entry.getKey();
            return com.google.common.collect.Maps.immutableEntry(key, com.google.common.collect.AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        final class AsMapEntries extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            final java.util.Map<K, java.util.Collection<V>> map() {
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(java.lang.Object obj) {
                return com.google.common.collect.Collections2.safeContains(com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.submap.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(java.lang.Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                com.google.common.collect.AbstractMapBasedMultimap.this.removeValuesForKey(((java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) obj)).getKey());
                return true;
            }
        }

        final class AsMapIterator implements java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> {
            java.util.Collection<V> collection;
            final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> delegateIterator;

            AsMapIterator() {
                this.delegateIterator = com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.submap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public final java.util.Map.Entry<K, java.util.Collection<V>> next() {
                java.util.Map.Entry<K, java.util.Collection<V>> next = this.delegateIterator.next();
                this.collection = next.getValue();
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.wrapEntry(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                com.google.common.base.Preconditions.checkState(this.collection != null, "no calls to next() since the last call to remove()");
                this.delegateIterator.remove();
                com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, this.collection.size());
                this.collection.clear();
                this.collection = null;
            }
        }
    }

    class SortedAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.AsMap implements java.util.SortedMap<K, java.util.Collection<V>> {
        java.util.SortedSet<K> sortedKeySet;

        SortedAsMap(java.util.SortedMap<K, java.util.Collection<V>> sortedMap) {
            super(sortedMap);
        }

        java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.SortedMap) this.submap;
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return sortedMap().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return sortedMap().lastKey();
        }

        public java.util.SortedMap<K, java.util.Collection<V>> headMap(K k) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().headMap(k));
        }

        public java.util.SortedMap<K, java.util.Collection<V>> subMap(K k, K k2) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().subMap(k, k2));
        }

        public java.util.SortedMap<K, java.util.Collection<V>> tailMap(K k) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().tailMap(k));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.SortedSet<K> keySet() {
            java.util.SortedSet<K> sortedSet = this.sortedKeySet;
            if (sortedSet != null) {
                return sortedSet;
            }
            java.util.SortedSet<K> createKeySet = createKeySet();
            this.sortedKeySet = createKeySet;
            return createKeySet;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.SortedSet<K> createKeySet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap());
        }
    }

    final class NavigableAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedAsMap implements java.util.NavigableMap<K, java.util.Collection<V>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
            return headMap((com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap) obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
            return tailMap((com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap) obj);
        }

        NavigableAsMap(java.util.NavigableMap<K, java.util.Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry(K k) {
            java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry = sortedMap().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return wrapEntry(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return sortedMap().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> floorEntry(K k) {
            java.util.Map.Entry<K, java.util.Collection<V>> floorEntry = sortedMap().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return wrapEntry(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return sortedMap().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry(K k) {
            java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry = sortedMap().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return wrapEntry(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return sortedMap().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> higherEntry(K k) {
            java.util.Map.Entry<K, java.util.Collection<V>> higherEntry = sortedMap().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return wrapEntry(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return sortedMap().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> firstEntry() {
            java.util.Map.Entry<K, java.util.Collection<V>> firstEntry = sortedMap().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return wrapEntry(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> lastEntry() {
            java.util.Map.Entry<K, java.util.Collection<V>> lastEntry = sortedMap().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return wrapEntry(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
            return pollAsMapEntry(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final java.util.Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
            return pollAsMapEntry(descendingMap().entrySet().iterator());
        }

        final java.util.Map.Entry<K, java.util.Collection<V>> pollAsMapEntry(java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            java.util.Map.Entry<K, java.util.Collection<V>> next = it.next();
            java.util.Collection<V> createCollection = com.google.common.collect.AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(next.getValue());
            it.remove();
            return com.google.common.collect.Maps.immutableEntry(next.getKey(), com.google.common.collect.AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> descendingMap() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final java.util.NavigableSet<K> keySet() {
            return (java.util.NavigableSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final java.util.NavigableSet<K> createKeySet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap());
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().subMap(k, z, k2, z2));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> headMap(K k, boolean z) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().headMap(k, z));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public final java.util.NavigableMap<K, java.util.Collection<V>> tailMap(K k, boolean z) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().tailMap(k, z));
        }
    }
}
