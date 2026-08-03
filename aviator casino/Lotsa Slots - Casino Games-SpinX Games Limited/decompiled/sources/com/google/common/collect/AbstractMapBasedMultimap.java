package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
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

    java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K key) {
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
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return this.map.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        java.util.Collection<V> collection = this.map.get(key);
        if (collection == null) {
            java.util.Collection<V> createCollection = createCollection(key);
            if (createCollection.add(value)) {
                this.totalSize++;
                this.map.put(key, createCollection);
                return true;
            }
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(value)) {
            return false;
        }
        this.totalSize++;
        return true;
    }

    private java.util.Collection<V> getOrCreateCollection(@com.google.common.collect.ParametricNullness K key) {
        java.util.Collection<V> collection = this.map.get(key);
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> createCollection = createCollection(key);
        this.map.put(key, createCollection);
        return createCollection;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> replaceValues(@com.google.common.collect.ParametricNullness K k, java.lang.Iterable<? extends V> iterable) {
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

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> removeAll(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> get(@com.google.common.collect.ParametricNullness K key) {
        java.util.Collection<V> collection = this.map.get(key);
        if (collection == null) {
            collection = createCollection(key);
        }
        return wrapCollection(key, collection);
    }

    java.util.Collection<V> wrapCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection(key, collection, null);
    }

    final java.util.List<V> wrapList(@com.google.common.collect.ParametricNullness K key, java.util.List<V> list, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.AbstractMapBasedMultimap.RandomAccessWrappedList(this, key, list, ancestor);
        }
        return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList(key, list, ancestor);
    }

    class WrappedCollection extends java.util.AbstractCollection<V> {

        @javax.annotation.CheckForNull
        final com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;

        @javax.annotation.CheckForNull
        final java.util.Collection<V> ancestorDelegate;
        java.util.Collection<V> delegate;

        @com.google.common.collect.ParametricNullness
        final K key;

        WrappedCollection(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> delegate, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
            this.key = key;
            this.delegate = delegate;
            this.ancestor = ancestor;
            this.ancestorDelegate = ancestor == null ? null : ancestor.getDelegate();
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

        @com.google.common.collect.ParametricNullness
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
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(object);
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

            WrappedIterator(java.util.Iterator<V> delegateIterator) {
                this.originalDelegate = com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.this.delegate;
                this.delegateIterator = delegateIterator;
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
            @com.google.common.collect.ParametricNullness
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
        public boolean add(@com.google.common.collect.ParametricNullness V value) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(value);
            if (add) {
                com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        @javax.annotation.CheckForNull
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
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            refreshIfEmpty();
            return this.delegate.contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> c) {
            refreshIfEmpty();
            return this.delegate.containsAll(c);
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
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(o);
            if (remove) {
                com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
                removeIfEmpty();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(c);
            if (removeAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> c) {
            com.google.common.base.Preconditions.checkNotNull(c);
            int size = size();
            boolean retainAll = this.delegate.retainAll(c);
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

    class WrappedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.Set<V> {
        WrappedSet(@com.google.common.collect.ParametricNullness K key, java.util.Set<V> delegate) {
            super(key, delegate, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAllImpl = com.google.common.collect.Sets.removeAllImpl((java.util.Set<?>) this.delegate, c);
            if (removeAllImpl) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAllImpl;
        }
    }

    class WrappedSortedSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.SortedSet<V> {
        WrappedSortedSet(@com.google.common.collect.ParametricNullness K key, java.util.SortedSet<V> delegate, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
            super(key, delegate, ancestor);
        }

        java.util.SortedSet<V> getSortedSetDelegate() {
            return (java.util.SortedSet) getDelegate();
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super V> comparator() {
            return getSortedSetDelegate().comparator();
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public V first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public V last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> headSet(@com.google.common.collect.ParametricNullness V toElement) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().headSet(toElement), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> subSet(@com.google.common.collect.ParametricNullness V fromElement, @com.google.common.collect.ParametricNullness V toElement) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().subSet(fromElement, toElement), getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<V> tailSet(@com.google.common.collect.ParametricNullness V fromElement) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet(getKey(), getSortedSetDelegate().tailSet(fromElement), getAncestor() == null ? this : getAncestor());
        }
    }

    class WrappedNavigableSet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements java.util.NavigableSet<V> {
        WrappedNavigableSet(@com.google.common.collect.ParametricNullness K key, java.util.NavigableSet<V> delegate, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
            super(key, delegate, ancestor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public java.util.NavigableSet<V> getSortedSetDelegate() {
            return (java.util.NavigableSet) super.getSortedSetDelegate();
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V lower(@com.google.common.collect.ParametricNullness V v) {
            return getSortedSetDelegate().lower(v);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V floor(@com.google.common.collect.ParametricNullness V v) {
            return getSortedSetDelegate().floor(v);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V ceiling(@com.google.common.collect.ParametricNullness V v) {
            return getSortedSetDelegate().ceiling(v);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V higher(@com.google.common.collect.ParametricNullness V v) {
            return getSortedSetDelegate().higher(v);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V pollFirst() {
            return (V) com.google.common.collect.Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public V pollLast() {
            return (V) com.google.common.collect.Iterators.pollNext(descendingIterator());
        }

        private java.util.NavigableSet<V> wrap(java.util.NavigableSet<V> wrapped) {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedNavigableSet(this.key, wrapped, getAncestor() == null ? this : getAncestor());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> descendingSet() {
            return wrap(getSortedSetDelegate().descendingSet());
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<V> descendingIterator() {
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection.WrappedIterator(getSortedSetDelegate().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> subSet(@com.google.common.collect.ParametricNullness V fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness V toElement, boolean toInclusive) {
            return wrap(getSortedSetDelegate().subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> headSet(@com.google.common.collect.ParametricNullness V toElement, boolean inclusive) {
            return wrap(getSortedSetDelegate().headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<V> tailSet(@com.google.common.collect.ParametricNullness V fromElement, boolean inclusive) {
            return wrap(getSortedSetDelegate().tailSet(fromElement, inclusive));
        }
    }

    class WrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.List<V> {
        WrappedList(@com.google.common.collect.ParametricNullness K key, java.util.List<V> delegate, @javax.annotation.CheckForNull com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
            super(key, delegate, ancestor);
        }

        java.util.List<V> getListDelegate() {
            return (java.util.List) getDelegate();
        }

        @Override // java.util.List
        public boolean addAll(int index, java.util.Collection<? extends V> c) {
            if (c.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(index, c);
            if (addAll) {
                com.google.common.collect.AbstractMapBasedMultimap.access$212(com.google.common.collect.AbstractMapBasedMultimap.this, getDelegate().size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V get(int index) {
            refreshIfEmpty();
            return getListDelegate().get(index);
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V set(int index, @com.google.common.collect.ParametricNullness V element) {
            refreshIfEmpty();
            return getListDelegate().set(index, element);
        }

        @Override // java.util.List
        public void add(int index, @com.google.common.collect.ParametricNullness V element) {
            refreshIfEmpty();
            boolean isEmpty = getDelegate().isEmpty();
            getListDelegate().add(index, element);
            com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
            if (isEmpty) {
                addToMap();
            }
        }

        @Override // java.util.List
        @com.google.common.collect.ParametricNullness
        public V remove(int index) {
            refreshIfEmpty();
            V remove = getListDelegate().remove(index);
            com.google.common.collect.AbstractMapBasedMultimap.access$210(com.google.common.collect.AbstractMapBasedMultimap.this);
            removeIfEmpty();
            return remove;
        }

        @Override // java.util.List
        public int indexOf(@javax.annotation.CheckForNull java.lang.Object o) {
            refreshIfEmpty();
            return getListDelegate().indexOf(o);
        }

        @Override // java.util.List
        public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object o) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(o);
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator() {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList.WrappedListIterator();
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator(int index) {
            refreshIfEmpty();
            return new com.google.common.collect.AbstractMapBasedMultimap.WrappedList.WrappedListIterator(index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public java.util.List<V> subList(int fromIndex, int toIndex) {
            refreshIfEmpty();
            return com.google.common.collect.AbstractMapBasedMultimap.this.wrapList(getKey(), getListDelegate().subList(fromIndex, toIndex), getAncestor() == null ? this : getAncestor());
        }

        private class WrappedListIterator extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements java.util.ListIterator<V> {
            WrappedListIterator() {
                super();
            }

            public WrappedListIterator(int index) {
                super(com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.getListDelegate().listIterator(index));
            }

            private java.util.ListIterator<V> getDelegateListIterator() {
                return (java.util.ListIterator) getDelegateIterator();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            @Override // java.util.ListIterator
            @com.google.common.collect.ParametricNullness
            public V previous() {
                return getDelegateListIterator().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@com.google.common.collect.ParametricNullness V value) {
                getDelegateListIterator().set(value);
            }

            @Override // java.util.ListIterator
            public void add(@com.google.common.collect.ParametricNullness V value) {
                boolean isEmpty = com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.isEmpty();
                getDelegateListIterator().add(value);
                com.google.common.collect.AbstractMapBasedMultimap.access$208(com.google.common.collect.AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    com.google.common.collect.AbstractMapBasedMultimap.WrappedList.this.addToMap();
                }
            }
        }
    }

    private class RandomAccessWrappedList extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedList implements java.util.RandomAccess {
        RandomAccessWrappedList(@com.google.common.collect.ParametricNullness final com.google.common.collect.AbstractMapBasedMultimap this$0, K key, @javax.annotation.CheckForNull java.util.List<V> delegate, com.google.common.collect.AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor) {
            super(key, delegate, ancestor);
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

    private class KeySet extends com.google.common.collect.Maps.KeySet<K, java.util.Collection<V>> {
        KeySet(final java.util.Map<K, java.util.Collection<V>> subMap) {
            super(subMap);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
            final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> it = map().entrySet().iterator();
            return new java.util.Iterator<K>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1

                @javax.annotation.CheckForNull
                java.util.Map.Entry<K, java.util.Collection<V>> entry;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                @com.google.common.collect.ParametricNullness
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
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> remove = map().remove(key);
            if (remove != null) {
                int size = remove.size();
                remove.clear();
                com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.common.collect.Iterators.clear(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> c) {
            return map().keySet().containsAll(c);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            return this == object || map().keySet().equals(object);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return map().keySet().hashCode();
        }
    }

    private class SortedKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.KeySet implements java.util.SortedSet<K> {
        SortedKeySet(java.util.SortedMap<K, java.util.Collection<V>> subMap) {
            super(subMap);
        }

        java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.SortedMap) super.map();
        }

        @Override // java.util.SortedSet
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K first() {
            return sortedMap().firstKey();
        }

        public java.util.SortedSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @com.google.common.collect.ParametricNullness
        public K last() {
            return sortedMap().lastKey();
        }

        public java.util.SortedSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().subMap(fromElement, toElement));
        }

        public java.util.SortedSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet(sortedMap().tailMap(fromElement));
        }
    }

    private final class NavigableKeySet extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedKeySet implements java.util.NavigableSet<K> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ java.util.SortedSet headSet(@com.google.common.collect.ParametricNullness java.lang.Object toElement) {
            return headSet((com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet) toElement);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ java.util.SortedSet tailSet(@com.google.common.collect.ParametricNullness java.lang.Object fromElement) {
            return tailSet((com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet) fromElement);
        }

        NavigableKeySet(java.util.NavigableMap<K, java.util.Collection<V>> subMap) {
            super(subMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K lower(@com.google.common.collect.ParametricNullness K k) {
            return sortedMap().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K floor(@com.google.common.collect.ParametricNullness K k) {
            return sortedMap().floorKey(k);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K ceiling(@com.google.common.collect.ParametricNullness K k) {
            return sortedMap().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K higher(@com.google.common.collect.ParametricNullness K k) {
            return sortedMap().higherKey(k);
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollFirst() {
            return (K) com.google.common.collect.Iterators.pollNext(iterator());
        }

        @Override // java.util.NavigableSet
        @javax.annotation.CheckForNull
        public K pollLast() {
            return (K) com.google.common.collect.Iterators.pollNext(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> descendingSet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().descendingMap());
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement) {
            return headSet(toElement, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(@com.google.common.collect.ParametricNullness K toElement, boolean inclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().headMap(toElement, inclusive));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, @com.google.common.collect.ParametricNullness K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(@com.google.common.collect.ParametricNullness K fromElement, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toElement, boolean toInclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().subMap(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(@com.google.common.collect.ParametricNullness K fromElement, boolean inclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap().tailMap(fromElement, inclusive));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(@javax.annotation.CheckForNull java.lang.Object key) {
        java.util.Collection collection = (java.util.Collection) com.google.common.collect.Maps.safeRemove(this.map, key);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    private abstract class Itr<T> implements java.util.Iterator<T> {
        final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> keyIterator;

        @javax.annotation.CheckForNull
        K key = null;

        @javax.annotation.CheckForNull
        java.util.Collection<V> collection = null;
        java.util.Iterator<V> valueIterator = com.google.common.collect.Iterators.emptyModifiableIterator();

        abstract T output(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

        Itr() {
            this.keyIterator = com.google.common.collect.AbstractMapBasedMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
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
        return new com.google.common.collect.AbstractMapBasedMultimap<K, V>.Itr<V>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            @com.google.common.collect.ParametricNullness
            V output(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
                return value;
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
            return new com.google.common.collect.AbstractMultimap.EntrySet(this);
        }
        return new com.google.common.collect.AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new com.google.common.collect.AbstractMapBasedMultimap<K, V>.Itr<java.util.Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* bridge */ /* synthetic */ java.lang.Object output(@com.google.common.collect.ParametricNullness java.lang.Object key, @com.google.common.collect.ParametricNullness java.lang.Object value) {
                return output((com.google.common.collect.AbstractMapBasedMultimap.AnonymousClass2) key, value);
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            java.util.Map.Entry<K, V> output(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
                return com.google.common.collect.Maps.immutableEntry(key, value);
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

    private class AsMap extends com.google.common.collect.Maps.ViewCachingAbstractMap<K, java.util.Collection<V>> {
        final transient java.util.Map<K, java.util.Collection<V>> submap;

        AsMap(java.util.Map<K, java.util.Collection<V>> submap) {
            this.submap = submap;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected java.util.Set<java.util.Map.Entry<K, java.util.Collection<V>>> createEntrySet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.AsMap.AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
            return com.google.common.collect.Maps.safeContainsKey(this.submap, key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @javax.annotation.CheckForNull
        public java.util.Collection<V> get(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> collection = (java.util.Collection) com.google.common.collect.Maps.safeGet(this.submap, key);
            if (collection == null) {
                return null;
            }
            return com.google.common.collect.AbstractMapBasedMultimap.this.wrapCollection(key, collection);
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
        @javax.annotation.CheckForNull
        public java.util.Collection<V> remove(@javax.annotation.CheckForNull java.lang.Object key) {
            java.util.Collection<V> remove = this.submap.remove(key);
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
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            return this == object || this.submap.equals(object);
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

        class AsMapEntries extends com.google.common.collect.Maps.EntrySet<K, java.util.Collection<V>> {
            AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            java.util.Map<K, java.util.Collection<V>> map() {
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
                return com.google.common.collect.Collections2.safeContains(com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.submap.entrySet(), o);
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                if (!contains(o)) {
                    return false;
                }
                com.google.common.collect.AbstractMapBasedMultimap.this.removeValuesForKey(((java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) o)).getKey());
                return true;
            }
        }

        class AsMapIterator implements java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> {

            @javax.annotation.CheckForNull
            java.util.Collection<V> collection;
            final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> delegateIterator;

            AsMapIterator() {
                this.delegateIterator = com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.submap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, java.util.Collection<V>> next() {
                java.util.Map.Entry<K, java.util.Collection<V>> next = this.delegateIterator.next();
                this.collection = next.getValue();
                return com.google.common.collect.AbstractMapBasedMultimap.AsMap.this.wrapEntry(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.collection != null, "no calls to next() since the last call to remove()");
                this.delegateIterator.remove();
                com.google.common.collect.AbstractMapBasedMultimap.access$220(com.google.common.collect.AbstractMapBasedMultimap.this, this.collection.size());
                this.collection.clear();
                this.collection = null;
            }
        }
    }

    private class SortedAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.AsMap implements java.util.SortedMap<K, java.util.Collection<V>> {

        @javax.annotation.CheckForNull
        java.util.SortedSet<K> sortedKeySet;

        SortedAsMap(java.util.SortedMap<K, java.util.Collection<V>> submap) {
            super(submap);
        }

        java.util.SortedMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.SortedMap) this.submap;
        }

        @Override // java.util.SortedMap
        @javax.annotation.CheckForNull
        public java.util.Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K firstKey() {
            return sortedMap().firstKey();
        }

        @Override // java.util.SortedMap
        @com.google.common.collect.ParametricNullness
        public K lastKey() {
            return sortedMap().lastKey();
        }

        public java.util.SortedMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().headMap(toKey));
        }

        public java.util.SortedMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().subMap(fromKey, toKey));
        }

        public java.util.SortedMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return new com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap(sortedMap().tailMap(fromKey));
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

    private final class NavigableAsMap extends com.google.common.collect.AbstractMapBasedMultimap<K, V>.SortedAsMap implements java.util.NavigableMap<K, java.util.Collection<V>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap headMap(@com.google.common.collect.ParametricNullness java.lang.Object toKey) {
            return headMap((com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap) toKey);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ java.util.SortedMap tailMap(@com.google.common.collect.ParametricNullness java.lang.Object fromKey) {
            return tailMap((com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap) fromKey);
        }

        NavigableAsMap(java.util.NavigableMap<K, java.util.Collection<V>> submap) {
            super(submap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public java.util.NavigableMap<K, java.util.Collection<V>> sortedMap() {
            return (java.util.NavigableMap) super.sortedMap();
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
            java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry = sortedMap().lowerEntry(key);
            if (lowerEntry == null) {
                return null;
            }
            return wrapEntry(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K lowerKey(@com.google.common.collect.ParametricNullness K key) {
            return sortedMap().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> floorEntry(@com.google.common.collect.ParametricNullness K key) {
            java.util.Map.Entry<K, java.util.Collection<V>> floorEntry = sortedMap().floorEntry(key);
            if (floorEntry == null) {
                return null;
            }
            return wrapEntry(floorEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K floorKey(@com.google.common.collect.ParametricNullness K key) {
            return sortedMap().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
            java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry = sortedMap().ceilingEntry(key);
            if (ceilingEntry == null) {
                return null;
            }
            return wrapEntry(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
            return sortedMap().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> higherEntry(@com.google.common.collect.ParametricNullness K key) {
            java.util.Map.Entry<K, java.util.Collection<V>> higherEntry = sortedMap().higherEntry(key);
            if (higherEntry == null) {
                return null;
            }
            return wrapEntry(higherEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public K higherKey(@com.google.common.collect.ParametricNullness K key) {
            return sortedMap().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> firstEntry() {
            java.util.Map.Entry<K, java.util.Collection<V>> firstEntry = sortedMap().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return wrapEntry(firstEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> lastEntry() {
            java.util.Map.Entry<K, java.util.Collection<V>> lastEntry = sortedMap().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return wrapEntry(lastEntry);
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
            return pollAsMapEntry(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @javax.annotation.CheckForNull
        public java.util.Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
            return pollAsMapEntry(descendingMap().entrySet().iterator());
        }

        @javax.annotation.CheckForNull
        java.util.Map.Entry<K, java.util.Collection<V>> pollAsMapEntry(java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> entryIterator) {
            if (!entryIterator.hasNext()) {
                return null;
            }
            java.util.Map.Entry<K, java.util.Collection<V>> next = entryIterator.next();
            java.util.Collection<V> createCollection = com.google.common.collect.AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(next.getValue());
            entryIterator.remove();
            return com.google.common.collect.Maps.immutableEntry(next.getKey(), com.google.common.collect.AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> descendingMap() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public java.util.NavigableSet<K> keySet() {
            return (java.util.NavigableSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public java.util.NavigableSet<K> createKeySet() {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableKeySet(sortedMap());
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, boolean fromInclusive, @com.google.common.collect.ParametricNullness K toKey, boolean toInclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().headMap(toKey, inclusive));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
            return new com.google.common.collect.AbstractMapBasedMultimap.NavigableAsMap(sortedMap().tailMap(fromKey, inclusive));
        }
    }
}
