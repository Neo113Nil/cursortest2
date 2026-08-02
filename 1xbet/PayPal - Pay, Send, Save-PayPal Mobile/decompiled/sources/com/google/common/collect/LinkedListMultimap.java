package com.google.common.collect;

/* loaded from: classes9.dex */
public class LinkedListMultimap<K, V> extends com.google.common.collect.AbstractMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> head;
    private transient java.util.Map<K, com.google.common.collect.LinkedListMultimap.KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    private transient com.google.common.collect.LinkedListMultimap.Node<K, V> tail;

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.LinkedListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.LinkedListMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    static final class Node<K, V> extends java.util.AbstractMap.SimpleEntry<K, V> {
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        com.google.common.collect.LinkedListMultimap.Node<K, V> nextSibling;
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;
        com.google.common.collect.LinkedListMultimap.Node<K, V> previousSibling;

        Node(K k, V v) {
            super(k, v);
        }
    }

    static final class KeyList<K, V> {
        int count;
        com.google.common.collect.LinkedListMultimap.Node<K, V> head;
        com.google.common.collect.LinkedListMultimap.Node<K, V> tail;

        KeyList(com.google.common.collect.LinkedListMultimap.Node<K, V> node) {
            this.head = node;
            this.tail = node;
            node.previousSibling = null;
            node.nextSibling = null;
            this.count = 1;
        }
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create() {
        return new com.google.common.collect.LinkedListMultimap<>();
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(int i) {
        return new com.google.common.collect.LinkedListMultimap<>(i);
    }

    public static <K, V> com.google.common.collect.LinkedListMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return new com.google.common.collect.LinkedListMultimap<>(multimap);
    }

    LinkedListMultimap() {
        this(12);
    }

    private LinkedListMultimap(int i) {
        this.keyToKeyList = com.google.common.collect.Platform.newHashMapWithExpectedSize(i);
    }

    private LinkedListMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.LinkedListMultimap.Node<K, V> addNode(K k, V v, com.google.common.collect.LinkedListMultimap.Node<K, V> node) {
        com.google.common.collect.LinkedListMultimap.Node<K, V> node2 = new com.google.common.collect.LinkedListMultimap.Node<>(k, v);
        if (this.head == null) {
            this.tail = node2;
            this.head = node2;
            this.keyToKeyList.put(k, new com.google.common.collect.LinkedListMultimap.KeyList<>(node2));
            this.modCount++;
        } else if (node == null) {
            ((com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(this.tail)).next = node2;
            node2.previous = this.tail;
            this.tail = node2;
            com.google.common.collect.LinkedListMultimap.KeyList<K, V> keyList = this.keyToKeyList.get(k);
            if (keyList == null) {
                this.keyToKeyList.put(k, new com.google.common.collect.LinkedListMultimap.KeyList<>(node2));
                this.modCount++;
            } else {
                keyList.count++;
                com.google.common.collect.LinkedListMultimap.Node<K, V> node3 = keyList.tail;
                node3.nextSibling = node2;
                node2.previousSibling = node3;
                keyList.tail = node2;
            }
        } else {
            com.google.common.collect.LinkedListMultimap.KeyList keyList2 = (com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.get(k));
            keyList2.count++;
            node2.previous = node.previous;
            node2.previousSibling = node.previousSibling;
            node2.next = node;
            node2.nextSibling = node;
            if (node.previousSibling == null) {
                keyList2.head = node2;
            } else {
                node.previousSibling.nextSibling = node2;
            }
            if (node.previous == null) {
                this.head = node2;
            } else {
                node.previous.next = node2;
            }
            node.previous = node2;
            node.previousSibling = node2;
        }
        this.size++;
        return node2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(com.google.common.collect.LinkedListMultimap.Node<K, V> node) {
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            this.head = node.next;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            this.tail = node.previous;
        }
        if (node.previousSibling == null && node.nextSibling == null) {
            ((com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.remove(node.getKey()))).count = 0;
            this.modCount++;
        } else {
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) java.util.Objects.requireNonNull(this.keyToKeyList.get(node.getKey()));
            keyList.count--;
            if (node.previousSibling == null) {
                keyList.head = (com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(node.nextSibling);
            } else {
                node.previousSibling.nextSibling = node.nextSibling;
            }
            if (node.nextSibling == null) {
                keyList.tail = (com.google.common.collect.LinkedListMultimap.Node) java.util.Objects.requireNonNull(node.previousSibling);
            } else {
                node.nextSibling.previousSibling = node.previousSibling;
            }
        }
        this.size--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(K k) {
        com.google.common.collect.Iterators.clear(new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(k));
    }

    final class NodeIterator implements java.util.ListIterator<java.util.Map.Entry<K, V>> {
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        int expectedModCount;
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        int nextIndex;
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        NodeIterator(int i) {
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
            int size = com.google.common.collect.LinkedListMultimap.this.size();
            com.google.common.base.Preconditions.checkPositionIndex(i, size);
            if (i >= size / 2) {
                this.previous = com.google.common.collect.LinkedListMultimap.this.tail;
                this.nextIndex = size;
                while (i < size) {
                    previous();
                    i++;
                }
            } else {
                this.next = com.google.common.collect.LinkedListMultimap.this.head;
                while (i > 0) {
                    next();
                    i--;
                }
            }
            this.current = null;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            checkForConcurrentModification();
            return this.next != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final com.google.common.collect.LinkedListMultimap.Node<K, V> next() {
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.next;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.next;
            this.nextIndex++;
            return this.current;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            checkForConcurrentModification();
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previous;
                this.nextIndex--;
            } else {
                this.next = node.next;
            }
            com.google.common.collect.LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            checkForConcurrentModification();
            return this.previous != null;
        }

        @Override // java.util.ListIterator
        public final com.google.common.collect.LinkedListMultimap.Node<K, V> previous() {
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.previous;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previous;
            this.nextIndex--;
            return this.current;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator
        public final void set(java.util.Map.Entry<K, V> entry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void add(java.util.Map.Entry<K, V> entry) {
            throw new java.lang.UnsupportedOperationException();
        }

        final void setValue(V v) {
            com.google.common.base.Preconditions.checkState(this.current != null);
            this.current.setValue(v);
        }
    }

    final class DistinctKeyIterator implements java.util.Iterator<K> {
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        int expectedModCount;
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        final java.util.Set<K> seenKeys;

        private DistinctKeyIterator() {
            this.seenKeys = com.google.common.collect.Sets.newHashSetWithExpectedSize(com.google.common.collect.LinkedListMultimap.this.keySet().size());
            this.next = com.google.common.collect.LinkedListMultimap.this.head;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.LinkedListMultimap.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            checkForConcurrentModification();
            return this.next != null;
        }

        @Override // java.util.Iterator
        public final K next() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node;
            checkForConcurrentModification();
            com.google.common.collect.LinkedListMultimap.Node<K, V> node2 = this.next;
            if (node2 == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node2;
            this.seenKeys.add(node2.getKey());
            do {
                node = this.next.next;
                this.next = node;
                if (node == null) {
                    break;
                }
            } while (!this.seenKeys.add(node.getKey()));
            return this.current.getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            checkForConcurrentModification();
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.this.removeAllNodes(this.current.getKey());
            this.current = null;
            this.expectedModCount = com.google.common.collect.LinkedListMultimap.this.modCount;
        }
    }

    final class ValueForKeyIterator implements java.util.ListIterator<V> {
        com.google.common.collect.LinkedListMultimap.Node<K, V> current;
        final K key;
        com.google.common.collect.LinkedListMultimap.Node<K, V> next;
        int nextIndex;
        com.google.common.collect.LinkedListMultimap.Node<K, V> previous;

        ValueForKeyIterator(K k) {
            this.key = k;
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) com.google.common.collect.LinkedListMultimap.this.keyToKeyList.get(k);
            this.next = keyList == null ? null : keyList.head;
        }

        ValueForKeyIterator(K k, int i) {
            com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) com.google.common.collect.LinkedListMultimap.this.keyToKeyList.get(k);
            int i2 = keyList == null ? 0 : keyList.count;
            com.google.common.base.Preconditions.checkPositionIndex(i, i2);
            if (i >= i2 / 2) {
                this.previous = keyList == null ? null : keyList.tail;
                this.nextIndex = i2;
                while (i < i2) {
                    previous();
                    i++;
                }
            } else {
                this.next = keyList == null ? null : keyList.head;
                while (i > 0) {
                    next();
                    i--;
                }
            }
            this.key = k;
            this.current = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final V next() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.next;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.previous = node;
            this.next = node.nextSibling;
            this.nextIndex++;
            return this.current.getValue();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.previous != null;
        }

        @Override // java.util.ListIterator
        public final V previous() {
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.previous;
            if (node == null) {
                throw new java.util.NoSuchElementException();
            }
            this.current = node;
            this.next = node;
            this.previous = node.previousSibling;
            this.nextIndex--;
            return this.current.getValue();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.nextIndex - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            com.google.common.base.Preconditions.checkState(this.current != null, "no calls to next() since the last call to remove()");
            com.google.common.collect.LinkedListMultimap.Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previousSibling;
                this.nextIndex--;
            } else {
                this.next = node.nextSibling;
            }
            com.google.common.collect.LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
        }

        @Override // java.util.ListIterator
        public final void set(V v) {
            com.google.common.base.Preconditions.checkState(this.current != null);
            this.current.setValue(v);
        }

        @Override // java.util.ListIterator
        public final void add(V v) {
            this.previous = com.google.common.collect.LinkedListMultimap.this.addNode(this.key, v, this.next);
            this.nextIndex++;
            this.current = null;
        }
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        addNode(k, v, null);
        return true;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        java.util.List<V> copy = getCopy(k);
        com.google.common.collect.LinkedListMultimap.ValueForKeyIterator valueForKeyIterator = new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(k);
        java.util.Iterator<? extends V> it = iterable.iterator();
        while (valueForKeyIterator.hasNext() && it.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.set(it.next());
        }
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
        while (it.hasNext()) {
            valueForKeyIterator.add(it.next());
        }
        return copy;
    }

    private java.util.List<V> getCopy(K k) {
        return java.util.Collections.unmodifiableList(com.google.common.collect.Lists.newArrayList(new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(k)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> removeAll(java.lang.Object obj) {
        java.util.List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.List<V> get(final K k) {
        return new java.util.AbstractSequentialList<V>(this) { // from class: com.google.common.collect.LinkedListMultimap.1
            final /* synthetic */ com.google.common.collect.LinkedListMultimap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                com.google.common.collect.LinkedListMultimap.KeyList keyList = (com.google.common.collect.LinkedListMultimap.KeyList) this.this$0.keyToKeyList.get(k);
                if (keyList == null) {
                    return 0;
                }
                return keyList.count;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public java.util.ListIterator<V> listIterator(int i) {
                return new com.google.common.collect.LinkedListMultimap.ValueForKeyIterator(k, i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Set<K> createKeySet() {
        return new com.google.common.collect.Sets.ImprovedAbstractSet<K>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return com.google.common.collect.LinkedListMultimap.this.keyToKeyList.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<K> iterator() {
                return new com.google.common.collect.LinkedListMultimap.DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(java.lang.Object obj) {
                return com.google.common.collect.LinkedListMultimap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(java.lang.Object obj) {
                return !com.google.common.collect.LinkedListMultimap.this.removeAll(obj).isEmpty();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    com.google.common.collect.Multiset<K> createKeys() {
        return new com.google.common.collect.Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<V> values() {
        return (java.util.List) super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public java.util.List<V> createValues() {
        return new java.util.AbstractSequentialList<V>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return com.google.common.collect.LinkedListMultimap.this.size;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final java.util.ListIterator<V> listIterator(int i) {
                final com.google.common.collect.LinkedListMultimap.NodeIterator nodeIterator = new com.google.common.collect.LinkedListMultimap.NodeIterator(i);
                return new com.google.common.collect.TransformedListIterator<java.util.Map.Entry<K, V>, V>(this, nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    final /* synthetic */ com.google.common.collect.LinkedListMultimap.C1ValuesImpl this$1;

                    {
                        this.this$1 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    public V transform(java.util.Map.Entry<K, V> entry) {
                        return entry.getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public void set(V v) {
                        nodeIterator.setValue(v);
                    }
                };
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<java.util.Map.Entry<K, V>> entries() {
        return (java.util.List) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultimap
    public java.util.List<java.util.Map.Entry<K, V>> createEntries() {
        return new java.util.AbstractSequentialList<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return com.google.common.collect.LinkedListMultimap.this.size;
            }

            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final java.util.ListIterator<java.util.Map.Entry<K, V>> listIterator(int i) {
                return new com.google.common.collect.LinkedListMultimap.NodeIterator(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return new com.google.common.collect.Multimaps.AsMap(this);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (java.util.Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = com.google.common.collect.CompactLinkedHashMap.create();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
}
