package com.google.common.collect;

/* loaded from: classes9.dex */
final class RegularContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final com.google.common.collect.Range<C> range;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    RegularContiguousSet(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range;
    }

    private com.google.common.collect.ContiguousSet<C> intersectionInCurrentDomain(com.google.common.collect.Range<C> range) {
        if (this.range.isConnected(range)) {
            return com.google.common.collect.ContiguousSet.create(this.range.intersection(range), this.domain);
        }
        return new com.google.common.collect.EmptyContiguousSet(this.domain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> headSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(com.google.common.collect.Range.upTo(c, com.google.common.collect.BoundType.forBoolean(z)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) == 0 && !z && !z2) {
            return new com.google.common.collect.EmptyContiguousSet(this.domain);
        }
        return intersectionInCurrentDomain(com.google.common.collect.Range.range(c, com.google.common.collect.BoundType.forBoolean(z), c2, com.google.common.collect.BoundType.forBoolean(z2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(com.google.common.collect.Range.downTo(c, com.google.common.collect.BoundType.forBoolean(z)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    final int indexOf(java.lang.Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        return (int) this.domain.distance(first(), (java.lang.Comparable) java.util.Objects.requireNonNull(obj));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<C> iterator() {
        return new com.google.common.collect.AbstractSequentialIterator<C>(first()) { // from class: com.google.common.collect.RegularContiguousSet.1
            final C last;

            {
                this.last = (C) com.google.common.collect.RegularContiguousSet.this.last();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            public C computeNext(C c) {
                if (com.google.common.collect.RegularContiguousSet.equalsOrThrow(c, this.last)) {
                    return null;
                }
                return com.google.common.collect.RegularContiguousSet.this.domain.next(c);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
        return new com.google.common.collect.AbstractSequentialIterator<C>(last()) { // from class: com.google.common.collect.RegularContiguousSet.2
            final C first;

            {
                this.first = (C) com.google.common.collect.RegularContiguousSet.this.first();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            public C computeNext(C c) {
                if (com.google.common.collect.RegularContiguousSet.equalsOrThrow(c, this.first)) {
                    return null;
                }
                return com.google.common.collect.RegularContiguousSet.this.domain.previous(c);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsOrThrow(java.lang.Comparable<?> comparable, java.lang.Comparable<?> comparable2) {
        return comparable2 != null && com.google.common.collect.Range.compareOrThrow(comparable, comparable2) == 0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final C first() {
        return (C) java.util.Objects.requireNonNull(this.range.lowerBound.leastValueAbove(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final C last() {
        return (C) java.util.Objects.requireNonNull(this.range.upperBound.greatestValueBelow(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet
    final com.google.common.collect.ImmutableList<C> createAsList() {
        if (this.domain.supportsFastOffset) {
            return new com.google.common.collect.ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.ImmutableAsList
                public com.google.common.collect.ImmutableSortedSet<C> delegateCollection() {
                    return com.google.common.collect.RegularContiguousSet.this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.List
                public C get(int i) {
                    com.google.common.base.Preconditions.checkElementIndex(i, size());
                    return (C) com.google.common.collect.RegularContiguousSet.this.domain.offset(com.google.common.collect.RegularContiguousSet.this.first(), i);
                }

                @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                java.lang.Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        return super.createAsList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long distance = this.domain.distance(first(), last());
        if (distance >= androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return ((int) distance) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((java.lang.Comparable) obj);
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Collections2.containsAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> contiguousSet) {
        com.google.common.base.Preconditions.checkNotNull(contiguousSet);
        com.google.common.base.Preconditions.checkArgument(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) com.google.common.collect.Ordering.natural().max(first(), (java.lang.Comparable) contiguousSet.first());
        java.lang.Comparable comparable2 = (java.lang.Comparable) com.google.common.collect.Ordering.natural().min(last(), (java.lang.Comparable) contiguousSet.last());
        if (comparable.compareTo(comparable2) <= 0) {
            return com.google.common.collect.ContiguousSet.create(com.google.common.collect.Range.closed(comparable, comparable2), this.domain);
        }
        return new com.google.common.collect.EmptyContiguousSet(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.Range<C> range() {
        com.google.common.collect.BoundType boundType = com.google.common.collect.BoundType.CLOSED;
        return range(boundType, boundType);
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.Range<C> range(com.google.common.collect.BoundType boundType, com.google.common.collect.BoundType boundType2) {
        return com.google.common.collect.Range.create(this.range.lowerBound.withLowerBoundType(boundType, this.domain), this.range.upperBound.withUpperBoundType(boundType2, this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.RegularContiguousSet) {
            com.google.common.collect.RegularContiguousSet regularContiguousSet = (com.google.common.collect.RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }

    static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        final com.google.common.collect.DiscreteDomain<C> domain;
        final com.google.common.collect.Range<C> range;

        private SerializedForm(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            this.range = range;
            this.domain = discreteDomain;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.collect.RegularContiguousSet(this.range, this.domain);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.RegularContiguousSet.SerializedForm(this.range, this.domain);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
