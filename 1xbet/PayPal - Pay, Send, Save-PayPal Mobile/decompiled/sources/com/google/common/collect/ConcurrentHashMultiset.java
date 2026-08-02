package com.google.common.collect;

/* loaded from: classes9.dex */
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final transient java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> countMap;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ boolean contains(java.lang.Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    static final class FieldSettersHolder {
        static final com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ConcurrentHashMultiset<?>> COUNT_MAP_FIELD_SETTER = com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create() {
        return new com.google.common.collect.ConcurrentHashMultiset<>(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.lang.Iterable<? extends E> iterable) {
        com.google.common.collect.ConcurrentHashMultiset<E> create = create();
        com.google.common.collect.Iterables.addAll(create, iterable);
        return create;
    }

    public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> concurrentMap) {
        return new com.google.common.collect.ConcurrentHashMultiset<>(concurrentMap);
    }

    ConcurrentHashMultiset(java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> concurrentMap) {
        com.google.common.base.Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        long j = 0;
        while (this.countMap.values().iterator().hasNext()) {
            j += r0.next().get();
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return snapshot().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.util.List<E> snapshot() {
        java.util.ArrayList newArrayListWithExpectedSize = com.google.common.collect.Lists.newArrayListWithExpectedSize(size());
        for (com.google.common.collect.Multiset.Entry entry : entrySet()) {
            java.lang.Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                newArrayListWithExpectedSize.add(element);
            }
        }
        return newArrayListWithExpectedSize;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(E e, int i) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        com.google.common.base.Preconditions.checkNotNull(e);
        if (i == 0) {
            return count(e);
        }
        com.google.common.collect.CollectPreconditions.checkPositive(i, "occurrences");
        do {
            atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, e);
            if (atomicInteger == null && (atomicInteger = this.countMap.putIfAbsent(e, new java.util.concurrent.atomic.AtomicInteger(i))) == null) {
                return 0;
            }
            do {
                i2 = atomicInteger.get();
                if (i2 != 0) {
                    try {
                    } catch (java.lang.ArithmeticException unused) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Overflow adding ");
                        sb.append(i);
                        sb.append(" occurrences to a count of ");
                        sb.append(i2);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                } else {
                    atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(i);
                    if (this.countMap.putIfAbsent(e, atomicInteger2) == null) {
                        break;
                    }
                }
            } while (!atomicInteger.compareAndSet(i2, java.lang.Math.addExact(i2, i)));
            return i2;
        } while (!this.countMap.replace(e, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(java.lang.Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return count(obj);
        }
        com.google.common.collect.CollectPreconditions.checkPositive(i, "occurrences");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = java.lang.Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public final boolean removeExactly(java.lang.Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        com.google.common.collect.CollectPreconditions.checkPositive(i, "occurrences");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(E e, int i) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        com.google.common.base.Preconditions.checkNotNull(e);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        do {
            atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, e);
            if (atomicInteger == null && (i == 0 || (atomicInteger = this.countMap.putIfAbsent(e, new java.util.concurrent.atomic.AtomicInteger(i))) == null)) {
                return 0;
            }
            do {
                i2 = atomicInteger.get();
                if (i2 == 0) {
                    if (i != 0) {
                        atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(i);
                        if (this.countMap.putIfAbsent(e, atomicInteger2) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i2, i));
            if (i == 0) {
                this.countMap.remove(e, atomicInteger);
            }
            return i2;
        } while (!this.countMap.replace(e, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(e);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(i2, "newCount");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.Maps.safeGet(this.countMap, e);
        if (atomicInteger == null) {
            if (i != 0) {
                return false;
            }
            return i2 == 0 || this.countMap.putIfAbsent(e, new java.util.concurrent.atomic.AtomicInteger(i2)) == null;
        }
        int i3 = atomicInteger.get();
        if (i3 == i) {
            if (i3 == 0) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                    return true;
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(i2);
                return this.countMap.putIfAbsent(e, atomicInteger2) == null || this.countMap.replace(e, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i3, i2)) {
                if (i2 == 0) {
                    this.countMap.remove(e, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Set<E> createElementSet() {
        final java.util.Set<E> keySet = this.countMap.keySet();
        return new com.google.common.collect.ForwardingSet<E>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.1
            final /* synthetic */ com.google.common.collect.ConcurrentHashMultiset this$0;

            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<E> delegate() {
                return keySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return obj != null && com.google.common.collect.Collections2.safeContains(keySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean containsAll(java.util.Collection<?> collection) {
                return standardContainsAll(collection);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                return obj != null && com.google.common.collect.Collections2.safeRemove(keySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean removeAll(java.util.Collection<?> collection) {
                return standardRemoveAll(collection);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<E> elementIterator() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    @java.lang.Deprecated
    public final java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return new com.google.common.collect.ConcurrentHashMultiset.EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        final com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>> abstractIterator = new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.2
            private final java.util.Iterator<java.util.Map.Entry<E, java.util.concurrent.atomic.AtomicInteger>> mapEntries;

            {
                this.mapEntries = com.google.common.collect.ConcurrentHashMultiset.this.countMap.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            public com.google.common.collect.Multiset.Entry<E> computeNext() {
                while (this.mapEntries.hasNext()) {
                    java.util.Map.Entry<E, java.util.concurrent.atomic.AtomicInteger> next = this.mapEntries.next();
                    int i = next.getValue().get();
                    if (i != 0) {
                        return com.google.common.collect.Multisets.immutableEntry(next.getKey(), i);
                    }
                }
                return endOfData();
            }
        };
        return new com.google.common.collect.ForwardingIterator<com.google.common.collect.Multiset.Entry<E>>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.3
            private com.google.common.collect.Multiset.Entry<E> last;
            final /* synthetic */ com.google.common.collect.ConcurrentHashMultiset this$0;

            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
            public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> delegate() {
                return abstractIterator;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                com.google.common.collect.Multiset.Entry<E> entry = (com.google.common.collect.Multiset.Entry) super.next();
                this.last = entry;
                return entry;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.last != null, "no calls to next() since the last call to remove()");
                this.this$0.setCount(this.last.getElement(), 0);
                this.last = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.countMap.clear();
    }

    final class EntrySet extends com.google.common.collect.AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public final com.google.common.collect.ConcurrentHashMultiset<E> multiset() {
            return com.google.common.collect.ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final java.lang.Object[] toArray() {
            return snapshot().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) snapshot().toArray(tArr);
        }

        private java.util.List<com.google.common.collect.Multiset.Entry<E>> snapshot() {
            java.util.ArrayList newArrayListWithExpectedSize = com.google.common.collect.Lists.newArrayListWithExpectedSize(size());
            com.google.common.collect.Iterators.addAll(newArrayListWithExpectedSize, iterator());
            return newArrayListWithExpectedSize;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        com.google.common.collect.ConcurrentHashMultiset.FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set((com.google.common.collect.Serialization.FieldSetter<? super com.google.common.collect.ConcurrentHashMultiset<?>>) this, java.util.Objects.requireNonNull(objectInputStream.readObject()));
    }
}
