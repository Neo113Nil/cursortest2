package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Sets {
    private Sets() {
    }

    /* loaded from: classes9.dex */
    static abstract class ImprovedAbstractSet<E> extends java.util.AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            return com.google.common.collect.Sets.removeAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            return super.retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
        }
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.of((java.lang.Enum) e, (java.lang.Enum[]) eArr));
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> immutableEnumSet(java.lang.Iterable<E> iterable) {
        if (iterable instanceof com.google.common.collect.ImmutableEnumSet) {
            return (com.google.common.collect.ImmutableEnumSet) iterable;
        }
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            if (collection.isEmpty()) {
                return com.google.common.collect.ImmutableSet.of();
            }
            return com.google.common.collect.ImmutableEnumSet.asImmutable(java.util.EnumSet.copyOf(collection));
        }
        java.util.Iterator<E> it = iterable.iterator();
        if (it.hasNext()) {
            java.util.EnumSet of = java.util.EnumSet.of((java.lang.Enum) it.next());
            com.google.common.collect.Iterators.addAll(of, it);
            return com.google.common.collect.ImmutableEnumSet.asImmutable(of);
        }
        return com.google.common.collect.ImmutableSet.of();
    }

    public static <E extends java.lang.Enum<E>> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableEnumSet() {
        return com.google.common.collect.CollectCollectors.toImmutableEnumSet();
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> newEnumSet(java.lang.Iterable<E> iterable, java.lang.Class<E> cls) {
        java.util.EnumSet<E> noneOf = java.util.EnumSet.noneOf(cls);
        com.google.common.collect.Iterables.addAll(noneOf, iterable);
        return noneOf;
    }

    public static <E> java.util.HashSet<E> newHashSet() {
        return new java.util.HashSet<>();
    }

    public static <E> java.util.HashSet<E> newHashSet(E... eArr) {
        java.util.HashSet<E> newHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        java.util.Collections.addAll(newHashSetWithExpectedSize, eArr);
        return newHashSetWithExpectedSize;
    }

    public static <E> java.util.HashSet<E> newHashSet(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.HashSet<>((java.util.Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> java.util.HashSet<E> newHashSet(java.util.Iterator<? extends E> it) {
        java.util.HashSet<E> hashSet = new java.util.HashSet<>();
        com.google.common.collect.Iterators.addAll(hashSet, it);
        return hashSet;
    }

    public static <E> java.util.HashSet<E> newHashSetWithExpectedSize(int i) {
        return new java.util.HashSet<>(com.google.common.collect.Maps.capacity(i));
    }

    public static <E> java.util.Set<E> newConcurrentHashSet() {
        return java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    public static <E> java.util.Set<E> newConcurrentHashSet(java.lang.Iterable<? extends E> iterable) {
        java.util.Set<E> newConcurrentHashSet = newConcurrentHashSet();
        com.google.common.collect.Iterables.addAll(newConcurrentHashSet, iterable);
        return newConcurrentHashSet;
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet() {
        return new java.util.LinkedHashSet<>();
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSet(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return new java.util.LinkedHashSet<>((java.util.Collection) iterable);
        }
        java.util.LinkedHashSet<E> linkedHashSet = new java.util.LinkedHashSet<>();
        com.google.common.collect.Iterables.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new java.util.LinkedHashSet<>(com.google.common.collect.Maps.capacity(i));
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet() {
        return new java.util.TreeSet<>();
    }

    public static <E extends java.lang.Comparable> java.util.TreeSet<E> newTreeSet(java.lang.Iterable<? extends E> iterable) {
        java.util.TreeSet<E> newTreeSet = newTreeSet();
        com.google.common.collect.Iterables.addAll(newTreeSet, iterable);
        return newTreeSet;
    }

    public static <E> java.util.TreeSet<E> newTreeSet(java.util.Comparator<? super E> comparator) {
        return new java.util.TreeSet<>((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <E> java.util.Set<E> newIdentityHashSet() {
        return java.util.Collections.newSetFromMap(com.google.common.collect.Maps.newIdentityHashMap());
    }

    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new java.util.concurrent.CopyOnWriteArraySet<>();
    }

    public static <E> java.util.concurrent.CopyOnWriteArraySet<E> newCopyOnWriteArraySet(java.lang.Iterable<? extends E> iterable) {
        java.util.Collection newArrayList;
        if (iterable instanceof java.util.Collection) {
            newArrayList = (java.util.Collection) iterable;
        } else {
            newArrayList = com.google.common.collect.Lists.newArrayList(iterable);
        }
        return new java.util.concurrent.CopyOnWriteArraySet<>(newArrayList);
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> collection) {
        if (collection instanceof java.util.EnumSet) {
            return java.util.EnumSet.complementOf((java.util.EnumSet) collection);
        }
        com.google.common.base.Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> complementOf(java.util.Collection<E> collection, java.lang.Class<E> cls) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof java.util.EnumSet) {
            return java.util.EnumSet.complementOf((java.util.EnumSet) collection);
        }
        return makeComplementByHand(collection, cls);
    }

    private static <E extends java.lang.Enum<E>> java.util.EnumSet<E> makeComplementByHand(java.util.Collection<E> collection, java.lang.Class<E> cls) {
        java.util.EnumSet<E> allOf = java.util.EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    @java.lang.Deprecated
    public static <E> java.util.Set<E> newSetFromMap(java.util.Map<E, java.lang.Boolean> map) {
        return java.util.Collections.newSetFromMap(map);
    }

    /* loaded from: classes9.dex */
    public static abstract class SetView<E> extends java.util.AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

        abstract int maxSize();

        abstract int minSize();

        private SetView() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public com.google.common.collect.ImmutableSet<E> immutableCopy() {
            int maxSize = maxSize();
            if (maxSize == 0) {
                return com.google.common.collect.ImmutableSet.of();
            }
            com.google.common.collect.ImmutableSet.Builder builderWithExpectedSize = com.google.common.collect.ImmutableSet.builderWithExpectedSize(maxSize);
            com.google.common.collect.UnmodifiableIterator<E> it = iterator();
            while (it.hasNext()) {
                builderWithExpectedSize.add((com.google.common.collect.ImmutableSet.Builder) com.google.common.base.Preconditions.checkNotNull(it.next()));
            }
            return builderWithExpectedSize.build();
        }

        public <S extends java.util.Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean add(E e) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean addAll(java.util.Collection<? extends E> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean removeAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean retainAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object obj) {
            java.util.Set set;
            int maxSize;
            int minSize;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof java.util.Set) || minSize() > (maxSize = maxSize((set = (java.util.Set) obj))) || maxSize() < (minSize = minSize(set))) {
                return false;
            }
            com.google.common.collect.UnmodifiableIterator<E> it = iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    if (!set.contains(it.next())) {
                        return false;
                    }
                    i++;
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            }
            if (i == maxSize) {
                return true;
            }
            if (i < minSize) {
                return false;
            }
            java.util.Iterator<E> it2 = set.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                it2.next();
                i2++;
                if (i2 > i) {
                    return false;
                }
            }
            return true;
        }

        static int minSize(java.util.Set<?> set) {
            return set instanceof com.google.common.collect.Sets.SetView ? ((com.google.common.collect.Sets.SetView) set).minSize() : set.size();
        }

        static int maxSize(java.util.Set<?> set) {
            return set instanceof com.google.common.collect.Sets.SetView ? ((com.google.common.collect.Sets.SetView) set).maxSize() : set.size();
        }
    }

    public static <E> com.google.common.collect.Sets.SetView<E> union(final java.util.Set<? extends E> set, final java.util.Set<? extends E> set2) {
        com.google.common.base.Preconditions.checkNotNull(set, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = set.size();
                java.util.Iterator<E> it = set2.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>(this, set, set2) { // from class: com.google.common.collect.Sets.1.1
                    final java.util.Iterator<? extends E> itr1;
                    final java.util.Iterator<? extends E> itr2;
                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass1 this$0;
                    final /* synthetic */ java.util.Set val$set1;
                    final /* synthetic */ java.util.Set val$set2;

                    {
                        this.val$set1 = r2;
                        this.val$set2 = r3;
                        this.this$0 = this;
                        this.itr1 = r2.iterator();
                        this.itr2 = r3.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        if (this.itr1.hasNext()) {
                            return this.itr1.next();
                        }
                        while (this.itr2.hasNext()) {
                            E next = this.itr2.next();
                            if (!this.val$set1.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends java.util.Set<E>> S copyInto(S s) {
                s.addAll(set);
                s.addAll(set2);
                return s;
            }

            @Override // com.google.common.collect.Sets.SetView
            int minSize() {
                return java.lang.Math.max(minSize(set), minSize(set2));
            }

            @Override // com.google.common.collect.Sets.SetView
            int maxSize() {
                return com.google.common.math.IntMath.saturatedAdd(maxSize(set), maxSize(set2));
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> intersection(final java.util.Set<E> set, final java.util.Set<?> set2) {
        com.google.common.base.Preconditions.checkNotNull(set, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.2
            @Override // com.google.common.collect.Sets.SetView
            int minSize() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>(this, set, set2) { // from class: com.google.common.collect.Sets.2.1
                    final java.util.Iterator<E> itr;
                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass2 this$0;
                    final /* synthetic */ java.util.Set val$set1;
                    final /* synthetic */ java.util.Set val$set2;

                    {
                        this.val$set1 = r2;
                        this.val$set2 = r3;
                        this.this$0 = this;
                        this.itr = r2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (this.val$set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return java.util.Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(java.util.Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            @Override // com.google.common.collect.Sets.SetView
            int maxSize() {
                return java.lang.Math.min(maxSize(set), maxSize(set2));
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> difference(final java.util.Set<E> set, final java.util.Set<?> set2) {
        com.google.common.base.Preconditions.checkNotNull(set, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                return new com.google.common.collect.AbstractIterator<E>(this, set, set2) { // from class: com.google.common.collect.Sets.3.1
                    final java.util.Iterator<E> itr;
                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass3 this$0;
                    final /* synthetic */ java.util.Set val$set1;
                    final /* synthetic */ java.util.Set val$set2;

                    {
                        this.val$set1 = r2;
                        this.val$set2 = r3;
                        this.this$0 = this;
                        this.itr = r2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (!this.val$set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            int minSize() {
                return java.lang.Math.max(minSize(set) - maxSize(set2), 0);
            }

            @Override // com.google.common.collect.Sets.SetView
            int maxSize() {
                return maxSize(set);
            }
        };
    }

    public static <E> com.google.common.collect.Sets.SetView<E> symmetricDifference(final java.util.Set<? extends E> set, final java.util.Set<? extends E> set2) {
        com.google.common.base.Preconditions.checkNotNull(set, "set1");
        com.google.common.base.Preconditions.checkNotNull(set2, "set2");
        return new com.google.common.collect.Sets.SetView<E>() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<E> iterator() {
                final java.util.Iterator<E> it = set.iterator();
                final java.util.Iterator<E> it2 = set2.iterator();
                final java.util.Set set3 = set2;
                final java.util.Set set4 = set;
                return new com.google.common.collect.AbstractIterator<E>(this) { // from class: com.google.common.collect.Sets.4.1
                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass4 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public E computeNext() {
                        while (it.hasNext()) {
                            E e = (E) it.next();
                            if (!set3.contains(e)) {
                                return e;
                            }
                        }
                        while (it2.hasNext()) {
                            E e2 = (E) it2.next();
                            if (!set4.contains(e2)) {
                                return e2;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                java.util.Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                java.util.Iterator<E> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!set.contains(it2.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.equals(set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                return set2.contains(obj) ^ set.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            int minSize() {
                int minSize = minSize(set) - maxSize(set2);
                return minSize >= 0 ? minSize : java.lang.Math.max(minSize(set2) - maxSize(set), 0);
            }

            @Override // com.google.common.collect.Sets.SetView
            int maxSize() {
                return com.google.common.math.IntMath.saturatedAdd(maxSize(set), maxSize(set2));
            }
        };
    }

    public static <E> java.util.Set<E> filter(java.util.Set<E> set, com.google.common.base.Predicate<? super E> predicate) {
        if (set instanceof java.util.SortedSet) {
            return filter((java.util.SortedSet) set, (com.google.common.base.Predicate) predicate);
        }
        if (set instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) set;
            return new com.google.common.collect.Sets.FilteredSet((java.util.Set) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredSet((java.util.Set) com.google.common.base.Preconditions.checkNotNull(set), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> java.util.SortedSet<E> filter(java.util.SortedSet<E> sortedSet, com.google.common.base.Predicate<? super E> predicate) {
        if (sortedSet instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) sortedSet;
            return new com.google.common.collect.Sets.FilteredSortedSet((java.util.SortedSet) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredSortedSet((java.util.SortedSet) com.google.common.base.Preconditions.checkNotNull(sortedSet), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> java.util.NavigableSet<E> filter(java.util.NavigableSet<E> navigableSet, com.google.common.base.Predicate<? super E> predicate) {
        if (navigableSet instanceof com.google.common.collect.Sets.FilteredSet) {
            com.google.common.collect.Sets.FilteredSet filteredSet = (com.google.common.collect.Sets.FilteredSet) navigableSet;
            return new com.google.common.collect.Sets.FilteredNavigableSet((java.util.NavigableSet) filteredSet.unfiltered, com.google.common.base.Predicates.and(filteredSet.predicate, predicate));
        }
        return new com.google.common.collect.Sets.FilteredNavigableSet((java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(navigableSet), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    /* loaded from: classes9.dex */
    static class FilteredSet<E> extends com.google.common.collect.Collections2.FilteredCollection<E> implements java.util.Set<E> {
        FilteredSet(java.util.Set<E> set, com.google.common.base.Predicate<? super E> predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object obj) {
            return com.google.common.collect.Sets.equalsImpl(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return com.google.common.collect.Sets.hashCodeImpl(this);
        }
    }

    /* loaded from: classes9.dex */
    static class FilteredSortedSet<E> extends com.google.common.collect.Sets.FilteredSet<E> implements java.util.SortedSet<E> {
        FilteredSortedSet(java.util.SortedSet<E> sortedSet, com.google.common.base.Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            return ((java.util.SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(E e, E e2) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).subSet(e, e2), this.predicate);
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(E e) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).headSet(e), this.predicate);
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(E e) {
            return new com.google.common.collect.Sets.FilteredSortedSet(((java.util.SortedSet) this.unfiltered).tailSet(e), this.predicate);
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) com.google.common.collect.Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        public E last() {
            java.util.SortedSet sortedSet = (java.util.SortedSet) this.unfiltered;
            while (true) {
                E e = (java.lang.Object) sortedSet.last();
                if (this.predicate.apply(e)) {
                    return e;
                }
                sortedSet = sortedSet.headSet(e);
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class FilteredNavigableSet<E> extends com.google.common.collect.Sets.FilteredSortedSet<E> implements java.util.NavigableSet<E> {
        FilteredNavigableSet(java.util.NavigableSet<E> navigableSet, com.google.common.base.Predicate<? super E> predicate) {
            super(navigableSet, predicate);
        }

        final java.util.NavigableSet<E> unfiltered() {
            return (java.util.NavigableSet) this.unfiltered;
        }

        @Override // java.util.NavigableSet
        public final E lower(E e) {
            return (E) com.google.common.collect.Iterators.find(unfiltered().headSet(e, false).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public final E floor(E e) {
            return (E) com.google.common.collect.Iterators.find(unfiltered().headSet(e, true).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public final E ceiling(E e) {
            return (E) com.google.common.collect.Iterables.find(unfiltered().tailSet(e, true), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public final E higher(E e) {
            return (E) com.google.common.collect.Iterables.find(unfiltered().tailSet(e, false), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        public final E pollFirst() {
            return (E) com.google.common.collect.Iterables.removeFirstMatching(unfiltered(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public final E pollLast() {
            return (E) com.google.common.collect.Iterables.removeFirstMatching(unfiltered().descendingSet(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> descendingSet() {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().descendingSet(), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<E> descendingIterator() {
            return com.google.common.collect.Iterators.filter(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public final E last() {
            return (E) com.google.common.collect.Iterators.find(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().subSet(e, z, e2, z2), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> headSet(E e, boolean z) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().headSet(e, z), (com.google.common.base.Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> tailSet(E e, boolean z) {
            return com.google.common.collect.Sets.filter((java.util.NavigableSet) unfiltered().tailSet(e, z), (com.google.common.base.Predicate) this.predicate);
        }
    }

    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.Set<? extends B>> list) {
        return com.google.common.collect.Sets.CartesianSet.create(list);
    }

    @java.lang.SafeVarargs
    public static <B> java.util.Set<java.util.List<B>> cartesianProduct(java.util.Set<? extends B>... setArr) {
        return cartesianProduct(java.util.Arrays.asList(setArr));
    }

    /* loaded from: classes9.dex */
    static final class CartesianSet<E> extends com.google.common.collect.ForwardingCollection<java.util.List<E>> implements java.util.Set<java.util.List<E>> {
        private final transient com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> axes;
        private final transient com.google.common.collect.CartesianList<E> delegate;

        static <E> java.util.Set<java.util.List<E>> create(java.util.List<? extends java.util.Set<? extends E>> list) {
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(list.size());
            java.util.Iterator<? extends java.util.Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                com.google.common.collect.ImmutableSet copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) it.next());
                if (copyOf.isEmpty()) {
                    return com.google.common.collect.ImmutableSet.of();
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) copyOf);
            }
            final com.google.common.collect.ImmutableList<E> build = builder.build();
            return new com.google.common.collect.Sets.CartesianSet(build, new com.google.common.collect.CartesianList(new com.google.common.collect.ImmutableList<java.util.List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return com.google.common.collect.ImmutableList.this.size();
                }

                @Override // java.util.List
                public java.util.List<E> get(int i) {
                    return ((com.google.common.collect.ImmutableSet) com.google.common.collect.ImmutableList.this.get(i)).asList();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            }));
        }

        private CartesianSet(com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableSet<E>> immutableList, com.google.common.collect.CartesianList<E> cartesianList) {
            this.axes = immutableList;
            this.delegate = cartesianList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Collection<java.util.List<E>> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            java.util.List list = (java.util.List) obj;
            if (list.size() != this.axes.size()) {
                return false;
            }
            java.util.Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.axes.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Sets.CartesianSet) {
                return this.axes.equals(((com.google.common.collect.Sets.CartesianSet) obj).axes);
            }
            if (!(obj instanceof java.util.Set)) {
                return false;
            }
            java.util.Set set = (java.util.Set) obj;
            return size() == set.size() && containsAll(set);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            int size = size() - 1;
            for (int i = 0; i < this.axes.size(); i++) {
                size = ~(~(size * 31));
            }
            com.google.common.collect.UnmodifiableIterator<com.google.common.collect.ImmutableSet<E>> it = this.axes.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                com.google.common.collect.ImmutableSet<E> next = it.next();
                i2 = ~(~((i2 * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i2 + size));
        }
    }

    public static <E> java.util.Set<java.util.Set<E>> powerSet(java.util.Set<E> set) {
        return new com.google.common.collect.Sets.PowerSet(set);
    }

    /* loaded from: classes9.dex */
    static final class SubSet<E> extends java.util.AbstractSet<E> {
        private final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;
        private final int mask;

        SubSet(com.google.common.collect.ImmutableMap<E, java.lang.Integer> immutableMap, int i) {
            this.inputSet = immutableMap;
            this.mask = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<E> iterator() {
            return new com.google.common.collect.UnmodifiableIterator<E>() { // from class: com.google.common.collect.Sets.SubSet.1
                final com.google.common.collect.ImmutableList<E> elements;
                int remainingSetBits;

                {
                    this.elements = com.google.common.collect.Sets.SubSet.this.inputSet.keySet().asList();
                    this.remainingSetBits = com.google.common.collect.Sets.SubSet.this.mask;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.remainingSetBits != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(this.remainingSetBits);
                    if (numberOfTrailingZeros == 32) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.remainingSetBits &= ~(1 << numberOfTrailingZeros);
                    return this.elements.get(numberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return java.lang.Integer.bitCount(this.mask);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            java.lang.Integer num = this.inputSet.get(obj);
            if (num != null) {
                return ((1 << num.intValue()) & this.mask) != 0;
            }
            return false;
        }
    }

    /* loaded from: classes9.dex */
    static final class PowerSet<E> extends java.util.AbstractSet<java.util.Set<E>> {
        final com.google.common.collect.ImmutableMap<E, java.lang.Integer> inputSet;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return false;
        }

        PowerSet(java.util.Set<E> set) {
            com.google.common.base.Preconditions.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.inputSet = com.google.common.collect.Maps.indexMap(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return 1 << this.inputSet.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Set<E>> iterator() {
            return new com.google.common.collect.AbstractIndexedListIterator<java.util.Set<E>>(size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public java.util.Set<E> get(int i) {
                    return new com.google.common.collect.Sets.SubSet(com.google.common.collect.Sets.PowerSet.this.inputSet, i);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.Set)) {
                return false;
            }
            return this.inputSet.keySet().containsAll((java.util.Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Sets.PowerSet) {
                return this.inputSet.keySet().equals(((com.google.common.collect.Sets.PowerSet) obj).inputSet.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.inputSet.keySet().hashCode() << (this.inputSet.size() - 1);
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("powerSet(");
            sb.append(this.inputSet);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <E> java.util.Set<java.util.Set<E>> combinations(java.util.Set<E> set, final int i) {
        final com.google.common.collect.ImmutableMap indexMap = com.google.common.collect.Maps.indexMap(set);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, io.ktor.http.ContentDisposition.Parameters.Size);
        com.google.common.base.Preconditions.checkArgument(i <= indexMap.size(), "size (%s) must be <= set.size() (%s)", i, indexMap.size());
        if (i == 0) {
            return com.google.common.collect.ImmutableSet.of(com.google.common.collect.ImmutableSet.of());
        }
        if (i == indexMap.size()) {
            return com.google.common.collect.ImmutableSet.of(indexMap.keySet());
        }
        return new java.util.AbstractSet<java.util.Set<E>>() { // from class: com.google.common.collect.Sets.5
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof java.util.Set)) {
                    return false;
                }
                java.util.Set set2 = (java.util.Set) obj;
                return set2.size() == i && indexMap.keySet().containsAll(set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Set<E>> iterator() {
                return new com.google.common.collect.AbstractIterator<java.util.Set<E>>(this, indexMap, i) { // from class: com.google.common.collect.Sets.5.1
                    final java.util.BitSet bits;
                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass5 this$0;
                    final /* synthetic */ com.google.common.collect.ImmutableMap val$index;
                    final /* synthetic */ int val$size;

                    {
                        this.val$index = r2;
                        this.val$size = r3;
                        this.this$0 = this;
                        this.bits = new java.util.BitSet(r2.size());
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public java.util.Set<E> computeNext() {
                        if (this.bits.isEmpty()) {
                            this.bits.set(0, this.val$size);
                        } else {
                            int nextSetBit = this.bits.nextSetBit(0);
                            int nextClearBit = this.bits.nextClearBit(nextSetBit);
                            if (nextClearBit == this.val$index.size()) {
                                return endOfData();
                            }
                            int i2 = (nextClearBit - nextSetBit) - 1;
                            this.bits.set(0, i2);
                            this.bits.clear(i2, nextClearBit);
                            this.bits.set(nextClearBit);
                        }
                        final java.util.BitSet bitSet = (java.util.BitSet) this.bits.clone();
                        final com.google.common.collect.ImmutableMap immutableMap = this.val$index;
                        final int i3 = this.val$size;
                        return new java.util.AbstractSet<E>(this) { // from class: com.google.common.collect.Sets.5.1.1
                            final /* synthetic */ com.google.common.collect.Sets.AnonymousClass5.AnonymousClass1 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                            public boolean contains(java.lang.Object obj) {
                                java.lang.Integer num = (java.lang.Integer) immutableMap.get(obj);
                                return num != null && bitSet.get(num.intValue());
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                            public java.util.Iterator<E> iterator() {
                                final java.util.BitSet bitSet2 = bitSet;
                                final com.google.common.collect.ImmutableMap immutableMap2 = immutableMap;
                                return new com.google.common.collect.AbstractIterator<E>(this) { // from class: com.google.common.collect.Sets.5.1.1.1
                                    int i = -1;
                                    final /* synthetic */ com.google.common.collect.Sets.AnonymousClass5.AnonymousClass1.C00691 this$2;

                                    {
                                        this.this$2 = this;
                                    }

                                    @Override // com.google.common.collect.AbstractIterator
                                    protected E computeNext() {
                                        int nextSetBit2 = bitSet2.nextSetBit(this.i + 1);
                                        this.i = nextSetBit2;
                                        if (nextSetBit2 == -1) {
                                            return endOfData();
                                        }
                                        return immutableMap2.keySet().asList().get(this.i);
                                    }
                                };
                            }

                            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                            public int size() {
                                return i3;
                            }
                        };
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.math.IntMath.binomial(indexMap.size(), i);
            }

            @Override // java.util.AbstractCollection
            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Sets.combinations(");
                sb.append(indexMap.keySet());
                sb.append(", ");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    static int hashCodeImpl(java.util.Set<?> set) {
        java.util.Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean equalsImpl(java.util.Set<?> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public static <E> java.util.NavigableSet<E> unmodifiableNavigableSet(java.util.NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof com.google.common.collect.ImmutableCollection) || (navigableSet instanceof com.google.common.collect.Sets.UnmodifiableNavigableSet)) ? navigableSet : new com.google.common.collect.Sets.UnmodifiableNavigableSet(navigableSet);
    }

    /* loaded from: classes9.dex */
    static final class UnmodifiableNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.NavigableSet<E> delegate;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient com.google.common.collect.Sets.UnmodifiableNavigableSet<E> descendingSet;
        private final java.util.SortedSet<E> unmodifiableDelegate;

        UnmodifiableNavigableSet(java.util.NavigableSet<E> navigableSet) {
            this.delegate = (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(navigableSet);
            this.unmodifiableDelegate = java.util.Collections.unmodifiableSortedSet(navigableSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }

        @Override // java.util.NavigableSet
        public final E lower(E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        public final E floor(E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        public final E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public final E higher(E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        public final E pollFirst() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final E pollLast() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> descendingSet() {
            com.google.common.collect.Sets.UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            com.google.common.collect.Sets.UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new com.google.common.collect.Sets.UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<E> descendingIterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> headSet(E e, boolean z) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public final java.util.NavigableSet<E> tailSet(E e, boolean z) {
            return com.google.common.collect.Sets.unmodifiableNavigableSet(this.delegate.tailSet(e, z));
        }
    }

    public static <E> java.util.NavigableSet<E> synchronizedNavigableSet(java.util.NavigableSet<E> navigableSet) {
        return com.google.common.collect.Synchronized.navigableSet(navigableSet);
    }

    static boolean removeAllImpl(java.util.Set<?> set, java.util.Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean removeAllImpl(java.util.Set<?> set, java.util.Collection<?> collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof com.google.common.collect.Multiset) {
            collection = ((com.google.common.collect.Multiset) collection).elementSet();
        }
        if ((collection instanceof java.util.Set) && collection.size() > set.size()) {
            return com.google.common.collect.Iterators.removeAll(set.iterator(), collection);
        }
        return removeAllImpl(set, collection.iterator());
    }

    /* loaded from: classes9.dex */
    static class DescendingSet<E> extends com.google.common.collect.ForwardingNavigableSet<E> {
        private final java.util.NavigableSet<E> forward;

        DescendingSet(java.util.NavigableSet<E> navigableSet) {
            this.forward = navigableSet;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.NavigableSet<E> delegate() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(E e) {
            return this.forward.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(E e) {
            return this.forward.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(E e) {
            return this.forward.floor(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(E e) {
            return this.forward.lower(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
            return this.forward.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
            return this.forward.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return this.forward.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return this.forward.subSet(e2, z2, e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> subSet(E e, E e2) {
            return standardSubSet(e, e2);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(E e, boolean z) {
            return this.forward.tailSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> headSet(E e) {
            return standardHeadSet(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(E e, boolean z) {
            return this.forward.headSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.SortedSet<E> tailSet(E e) {
            return standardTailSet(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            java.util.Comparator<? super E> comparator = this.forward.comparator();
            if (comparator == null) {
                return com.google.common.collect.Ordering.natural().reverse();
            }
            return reverse(comparator);
        }

        private static <T> com.google.common.collect.Ordering<T> reverse(java.util.Comparator<T> comparator) {
            return com.google.common.collect.Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E first() {
            return this.forward.last();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E last() {
            return this.forward.first();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return this.forward.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public java.lang.String toString() {
            return standardToString();
        }
    }

    public static <K extends java.lang.Comparable<? super K>> java.util.NavigableSet<K> subSet(java.util.NavigableSet<K> navigableSet, com.google.common.collect.Range<K> range) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != com.google.common.collect.Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            com.google.common.base.Preconditions.checkArgument(navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            return navigableSet.subSet(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED, range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasLowerBound()) {
            return navigableSet.tailSet(range.lowerEndpoint(), range.lowerBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableSet.headSet(range.upperEndpoint(), range.upperBoundType() == com.google.common.collect.BoundType.CLOSED);
        }
        return (java.util.NavigableSet) com.google.common.base.Preconditions.checkNotNull(navigableSet);
    }
}
