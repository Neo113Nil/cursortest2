package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ImmutableMultiset<E> extends com.google.common.collect.ImmutableCollection<E> implements com.google.common.collect.Multiset<E> {
    private static final long serialVersionUID = 912559;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet;

    static /* synthetic */ int lambda$toImmutableMultiset$0(java.lang.Object obj) {
        return 1;
    }

    @Override // com.google.common.collect.Multiset
    public abstract com.google.common.collect.ImmutableSet<E> elementSet();

    abstract com.google.common.collect.Multiset.Entry<E> getEntry(int i);

    @Override // com.google.common.collect.ImmutableCollection
    abstract java.lang.Object writeReplace();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset() {
        return com.google.common.collect.CollectCollectors.toImmutableMultiset(java.util.function.Function.identity(), new java.util.function.ToIntFunction() { // from class: com.google.common.collect.ImmutableMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(java.lang.Object obj) {
                return com.google.common.collect.ImmutableMultiset.lambda$toImmutableMultiset$0(obj);
            }
        });
    }

    public static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(java.util.function.Function<? super T, ? extends E> function, java.util.function.ToIntFunction<? super T> toIntFunction) {
        return com.google.common.collect.CollectCollectors.toImmutableMultiset(function, toIntFunction);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of() {
        return com.google.common.collect.RegularImmutableMultiset.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e) {
        return copyFromElements(e);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e, E e2) {
        return copyFromElements(e, e2);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e, E e2, E e3) {
        return copyFromElements(e, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return copyFromElements(e, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return copyFromElements(e, e2, e3, e4, e5);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new com.google.common.collect.ImmutableMultiset.Builder().add((com.google.common.collect.ImmutableMultiset.Builder) e).add((com.google.common.collect.ImmutableMultiset.Builder<E>) e2).add((com.google.common.collect.ImmutableMultiset.Builder<E>) e3).add((com.google.common.collect.ImmutableMultiset.Builder<E>) e4).add((com.google.common.collect.ImmutableMultiset.Builder<E>) e5).add((com.google.common.collect.ImmutableMultiset.Builder<E>) e6).add((java.lang.Object[]) eArr).build();
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyFromElements(eArr);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof com.google.common.collect.ImmutableMultiset) {
            com.google.common.collect.ImmutableMultiset<E> immutableMultiset = (com.google.common.collect.ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        com.google.common.collect.ImmutableMultiset.Builder builder = new com.google.common.collect.ImmutableMultiset.Builder(com.google.common.collect.Multisets.inferDistinctElements(iterable));
        builder.addAll((java.lang.Iterable) iterable);
        return builder.build();
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.util.Iterator<? extends E> it) {
        return new com.google.common.collect.ImmutableMultiset.Builder().addAll((java.util.Iterator) it).build();
    }

    private static <E> com.google.common.collect.ImmutableMultiset<E> copyFromElements(E... eArr) {
        return new com.google.common.collect.ImmutableMultiset.Builder().add((java.lang.Object[]) eArr).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> com.google.common.collect.ImmutableMultiset<E> copyFromEntries(java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>> collection) {
        com.google.common.collect.ImmutableMultiset.Builder builder = new com.google.common.collect.ImmutableMultiset.Builder(collection.size());
        for (com.google.common.collect.Multiset.Entry<? extends E> entry : collection) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    ImmutableMultiset() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        final com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        return new com.google.common.collect.UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.1
            E element;
            int remaining;
            final /* synthetic */ com.google.common.collect.ImmutableMultiset this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.remaining <= 0) {
                    com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                    this.element = (E) entry.getElement();
                    this.remaining = entry.getCount();
                }
                this.remaining--;
                return (E) java.util.Objects.requireNonNull(this.element);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
        com.google.common.collect.ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        com.google.common.collect.ImmutableList<E> asList = super.asList();
        this.asList = asList;
        return asList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int add(E e, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int remove(java.lang.Object obj, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final int setCount(E e, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @java.lang.Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] objArr, int i) {
        com.google.common.collect.UnmodifiableIterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<E> next = it.next();
            java.util.Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Multisets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public java.lang.String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    private com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.ImmutableMultiset.EntrySet();
    }

    final class EntrySet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return com.google.common.collect.ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        public final com.google.common.collect.Multiset.Entry<E> get(int i) {
            return com.google.common.collect.ImmutableMultiset.this.getEntry(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Multiset.Entry) {
                com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) obj;
                if (entry.getCount() > 0 && com.google.common.collect.ImmutableMultiset.this.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return com.google.common.collect.ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableMultiset.EntrySetSerializedForm(com.google.common.collect.ImmutableMultiset.this);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use EntrySetSerializedForm");
        }
    }

    static final class EntrySetSerializedForm<E> implements java.io.Serializable {
        final com.google.common.collect.ImmutableMultiset<E> multiset;

        EntrySetSerializedForm(com.google.common.collect.ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        final java.lang.Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static <E> com.google.common.collect.ImmutableMultiset.Builder<E> builder() {
        return new com.google.common.collect.ImmutableMultiset.Builder<>();
    }

    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        boolean buildInvoked;
        com.google.common.collect.ObjectCountHashMap<E> contents;
        boolean isLinkedHash;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableMultiset.Builder<E>) obj);
        }

        public Builder() {
            this(4);
        }

        Builder(int i) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = com.google.common.collect.ObjectCountHashMap.createWithExpectedSize(i);
        }

        Builder(boolean z) {
            this.buildInvoked = false;
            this.isLinkedHash = false;
            this.contents = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E e) {
            return addCopies(e, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> add(E... eArr) {
            super.add((java.lang.Object[]) eArr);
            return this;
        }

        public com.google.common.collect.ImmutableMultiset.Builder<E> addCopies(E e, int i) {
            java.util.Objects.requireNonNull(this.contents);
            if (i == 0) {
                return this;
            }
            if (this.buildInvoked) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            com.google.common.base.Preconditions.checkNotNull(e);
            com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.contents;
            objectCountHashMap.put(e, i + objectCountHashMap.get(e));
            return this;
        }

        public com.google.common.collect.ImmutableMultiset.Builder<E> setCount(E e, int i) {
            java.util.Objects.requireNonNull(this.contents);
            if (i == 0 && !this.isLinkedHash) {
                this.contents = new com.google.common.collect.ObjectCountLinkedHashMap(this.contents);
                this.isLinkedHash = true;
            } else if (this.buildInvoked) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = false;
            com.google.common.base.Preconditions.checkNotNull(e);
            if (i == 0) {
                this.contents.remove(e);
                return this;
            }
            this.contents.put(com.google.common.base.Preconditions.checkNotNull(e), i);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            java.util.Objects.requireNonNull(this.contents);
            if (iterable instanceof com.google.common.collect.Multiset) {
                com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) iterable;
                com.google.common.collect.ObjectCountHashMap tryGetMap = tryGetMap(multiset);
                if (tryGetMap != null) {
                    com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.contents;
                    objectCountHashMap.ensureCapacity(java.lang.Math.max(objectCountHashMap.size(), tryGetMap.size()));
                    for (int firstIndex = tryGetMap.firstIndex(); firstIndex >= 0; firstIndex = tryGetMap.nextIndex(firstIndex)) {
                        addCopies(tryGetMap.getKey(firstIndex), tryGetMap.getValue(firstIndex));
                    }
                } else {
                    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet = multiset.entrySet();
                    com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap2 = this.contents;
                    objectCountHashMap2.ensureCapacity(java.lang.Math.max(objectCountHashMap2.size(), entrySet.size()));
                    for (com.google.common.collect.Multiset.Entry<E> entry : multiset.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
                return this;
            }
            super.addAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset.Builder<E> addAll(java.util.Iterator<? extends E> it) {
            super.addAll((java.util.Iterator) it);
            return this;
        }

        static <T> com.google.common.collect.ObjectCountHashMap<T> tryGetMap(java.lang.Iterable<T> iterable) {
            if (iterable instanceof com.google.common.collect.RegularImmutableMultiset) {
                return ((com.google.common.collect.RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof com.google.common.collect.AbstractMapBasedMultiset) {
                return ((com.google.common.collect.AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableMultiset<E> build() {
            java.util.Objects.requireNonNull(this.contents);
            if (this.contents.size() == 0) {
                return com.google.common.collect.ImmutableMultiset.of();
            }
            if (this.isLinkedHash) {
                this.contents = new com.google.common.collect.ObjectCountHashMap<>(this.contents);
                this.isLinkedHash = false;
            }
            this.buildInvoked = true;
            return new com.google.common.collect.RegularImmutableMultiset(this.contents);
        }
    }
}
