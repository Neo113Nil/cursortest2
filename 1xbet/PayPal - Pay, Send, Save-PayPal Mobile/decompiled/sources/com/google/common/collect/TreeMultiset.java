package com.google.common.collect;

/* loaded from: classes9.dex */
public final class TreeMultiset<E> extends com.google.common.collect.AbstractSortedMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final transient com.google.common.collect.TreeMultiset.AvlNode<E> header;
    private final transient com.google.common.collect.GeneralRange<E> range;
    private final transient com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference;

    enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            final int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
                return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).elemCount;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            final long treeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).totalCount;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            final int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            final long treeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0L;
                }
                return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).distinctElements;
            }
        };

        abstract int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode);

        abstract long treeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ boolean contains(java.lang.Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType, java.lang.Object obj2, com.google.common.collect.BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create() {
        return new com.google.common.collect.TreeMultiset<>(com.google.common.collect.Ordering.natural());
    }

    public static <E> com.google.common.collect.TreeMultiset<E> create(java.util.Comparator<? super E> comparator) {
        if (comparator == null) {
            return new com.google.common.collect.TreeMultiset<>(com.google.common.collect.Ordering.natural());
        }
        return new com.google.common.collect.TreeMultiset<>(comparator);
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> iterable) {
        com.google.common.collect.TreeMultiset<E> create = create();
        com.google.common.collect.Iterables.addAll(create, iterable);
        return create;
    }

    TreeMultiset(com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> reference, com.google.common.collect.GeneralRange<E> generalRange, com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
        super(generalRange.comparator());
        this.rootReference = reference;
        this.range = generalRange;
        this.header = avlNode;
    }

    TreeMultiset(java.util.Comparator<? super E> comparator) {
        super(comparator);
        this.range = com.google.common.collect.GeneralRange.all(comparator);
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = new com.google.common.collect.TreeMultiset.AvlNode<>();
        this.header = avlNode;
        successor(avlNode, avlNode);
        this.rootReference = new com.google.common.collect.TreeMultiset.Reference<>();
    }

    private long aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate aggregate) {
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        long treeAggregate = aggregate.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            treeAggregate -= aggregateBelowRange(aggregate, avlNode);
        }
        return this.range.hasUpperBound() ? treeAggregate - aggregateAboveRange(aggregate, avlNode) : treeAggregate;
    }

    private long aggregateBelowRange(com.google.common.collect.TreeMultiset.Aggregate aggregate, com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
        long treeAggregate;
        long aggregateBelowRange;
        while (avlNode != null) {
            int compare = comparator().compare(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint()), avlNode.getElement());
            if (compare >= 0) {
                if (compare == 0) {
                    int i = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getLowerBoundType().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.AssertionError();
                        }
                        return aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).left);
                    }
                    treeAggregate = aggregate.nodeAggregate(avlNode);
                    aggregateBelowRange = aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).left);
                } else {
                    treeAggregate = aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).left) + aggregate.nodeAggregate(avlNode);
                    aggregateBelowRange = aggregateBelowRange(aggregate, ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).right);
                }
                return treeAggregate + aggregateBelowRange;
            }
            avlNode = ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).left;
        }
        return 0L;
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[com.google.common.collect.BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[com.google.common.collect.BoundType.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[com.google.common.collect.BoundType.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private long aggregateAboveRange(com.google.common.collect.TreeMultiset.Aggregate aggregate, com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
        long treeAggregate;
        long aggregateAboveRange;
        while (avlNode != null) {
            int compare = comparator().compare(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint()), avlNode.getElement());
            if (compare <= 0) {
                if (compare == 0) {
                    int i = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getUpperBoundType().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.AssertionError();
                        }
                        return aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).right);
                    }
                    treeAggregate = aggregate.nodeAggregate(avlNode);
                    aggregateAboveRange = aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).right);
                } else {
                    treeAggregate = aggregate.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) avlNode).right) + aggregate.nodeAggregate(avlNode);
                    aggregateAboveRange = aggregateAboveRange(aggregate, ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).left);
                }
                return treeAggregate + aggregateAboveRange;
            }
            avlNode = ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).right;
        }
        return 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return com.google.common.primitives.Ints.saturatedCast(aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return com.google.common.primitives.Ints.saturatedCast(aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate.DISTINCT));
    }

    static int distinctElements(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
        if (avlNode == null) {
            return 0;
        }
        return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).distinctElements;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        try {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
            if (!this.range.contains(obj) || avlNode == null) {
                return 0;
            }
            return avlNode.count(comparator(), obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(E e, int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        com.google.common.base.Preconditions.checkArgument(this.range.contains(e));
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            comparator().compare(e, e);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = new com.google.common.collect.TreeMultiset.AvlNode<>(e, i);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode3 = this.header;
            successor(avlNode3, avlNode2, avlNode3);
            this.rootReference.checkAndSet(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.add(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(java.lang.Object obj, int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && avlNode != null) {
                this.rootReference.checkAndSet(avlNode, avlNode.remove(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(E e, int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        if (!this.range.contains(e)) {
            com.google.common.base.Preconditions.checkArgument(i == 0);
            return 0;
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i2, "newCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "oldCount");
        com.google.common.base.Preconditions.checkArgument(this.range.contains(e));
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        }
        if (i != 0) {
            return false;
        }
        if (i2 > 0) {
            add(e, i2);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            com.google.common.collect.Iterators.clear(entryIterator());
            return;
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> succ = this.header.succ();
        while (true) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.header;
            if (succ == avlNode) {
                successor(avlNode, avlNode);
                this.rootReference.clear();
                return;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> succ2 = succ.succ();
            ((com.google.common.collect.TreeMultiset.AvlNode) succ).elemCount = 0;
            ((com.google.common.collect.TreeMultiset.AvlNode) succ).left = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) succ).right = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) succ).pred = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) succ).succ = null;
            succ = succ2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset.Entry<E> wrapEntry(final com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
        return new com.google.common.collect.Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.TreeMultiset.1
            final /* synthetic */ com.google.common.collect.TreeMultiset this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.Multiset.Entry
            public E getElement() {
                return (E) avlNode.getElement();
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int count = avlNode.getCount();
                return count == 0 ? this.this$0.count(getElement()) : count;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.TreeMultiset.AvlNode<E> firstNode() {
        com.google.common.collect.TreeMultiset.AvlNode<E> succ;
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            java.lang.Object uncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint());
            succ = avlNode.ceiling(comparator(), uncheckedCastNullableTToT);
            if (succ == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == com.google.common.collect.BoundType.OPEN && comparator().compare(uncheckedCastNullableTToT, succ.getElement()) == 0) {
                succ = succ.succ();
            }
        } else {
            succ = this.header.succ();
        }
        if (succ == this.header || !this.range.contains(succ.getElement())) {
            return null;
        }
        return succ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.TreeMultiset.AvlNode<E> lastNode() {
        com.google.common.collect.TreeMultiset.AvlNode<E> pred;
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            java.lang.Object uncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint());
            pred = avlNode.floor(comparator(), uncheckedCastNullableTToT);
            if (pred == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == com.google.common.collect.BoundType.OPEN && comparator().compare(uncheckedCastNullableTToT, pred.getElement()) == 0) {
                pred = pred.pred();
            }
        } else {
            pred = this.header.pred();
        }
        if (pred == this.header || !this.range.contains(pred.getElement())) {
            return null;
        }
        return pred;
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<E> elementIterator() {
        return com.google.common.collect.Multisets.elementIterator(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.2
            com.google.common.collect.TreeMultiset.AvlNode<E> current;
            com.google.common.collect.Multiset.Entry<E> prevEntry;

            {
                this.current = com.google.common.collect.TreeMultiset.this.firstNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!com.google.common.collect.TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                if (hasNext()) {
                    com.google.common.collect.Multiset.Entry<E> wrapEntry = com.google.common.collect.TreeMultiset.this.wrapEntry((com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.current));
                    this.prevEntry = wrapEntry;
                    if (this.current.succ() == com.google.common.collect.TreeMultiset.this.header) {
                        this.current = null;
                        return wrapEntry;
                    }
                    this.current = this.current.succ();
                    return wrapEntry;
                }
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator() {
        return new java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3
            com.google.common.collect.TreeMultiset.AvlNode<E> current;
            com.google.common.collect.Multiset.Entry<E> prevEntry = null;

            {
                this.current = com.google.common.collect.TreeMultiset.this.lastNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!com.google.common.collect.TreeMultiset.this.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.util.Objects.requireNonNull(this.current);
                com.google.common.collect.Multiset.Entry<E> wrapEntry = com.google.common.collect.TreeMultiset.this.wrapEntry(this.current);
                this.prevEntry = wrapEntry;
                if (this.current.pred() == com.google.common.collect.TreeMultiset.this.header) {
                    this.current = null;
                    return wrapEntry;
                }
                this.current = this.current.pred();
                return wrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.TreeMultiset(this.rootReference, this.range.intersect(com.google.common.collect.GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.TreeMultiset(this.rootReference, this.range.intersect(com.google.common.collect.GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }

    static final class Reference<T> {
        private T value;

        private Reference() {
        }

        final T get() {
            return this.value;
        }

        final void checkAndSet(T t, T t2) {
            if (this.value != t) {
                throw new java.util.ConcurrentModificationException();
            }
            this.value = t2;
        }

        final void clear() {
            this.value = null;
        }
    }

    static final class AvlNode<E> {
        private int distinctElements;
        private final E elem;
        private int elemCount;
        private int height;
        private com.google.common.collect.TreeMultiset.AvlNode<E> left;
        private com.google.common.collect.TreeMultiset.AvlNode<E> pred;
        private com.google.common.collect.TreeMultiset.AvlNode<E> right;
        private com.google.common.collect.TreeMultiset.AvlNode<E> succ;
        private long totalCount;

        AvlNode(E e, int i) {
            com.google.common.base.Preconditions.checkArgument(i > 0);
            this.elem = e;
            this.elemCount = i;
            this.totalCount = i;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        AvlNode() {
            this.elem = null;
            this.elemCount = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.common.collect.TreeMultiset.AvlNode<E> pred() {
            return (com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.pred);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.common.collect.TreeMultiset.AvlNode<E> succ() {
            return (com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.succ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final int count(java.util.Comparator<? super E> comparator, E e) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this;
            while (true) {
                int compare = comparator.compare(e, avlNode.getElement());
                if (compare < 0) {
                    avlNode = avlNode.left;
                    if (avlNode == null) {
                        return 0;
                    }
                } else if (compare > 0) {
                    avlNode = avlNode.right;
                    if (avlNode == null) {
                        return 0;
                    }
                } else {
                    return avlNode.elemCount;
                }
            }
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addRightChild(E e, int i) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = new com.google.common.collect.TreeMultiset.AvlNode<>(e, i);
            this.right = avlNode;
            com.google.common.collect.TreeMultiset.successor(this, avlNode, succ());
            this.height = java.lang.Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += i;
            return this;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addLeftChild(E e, int i) {
            this.left = new com.google.common.collect.TreeMultiset.AvlNode<>(e, i);
            com.google.common.collect.TreeMultiset.successor(pred(), this.left, this);
            this.height = java.lang.Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += i;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.collect.TreeMultiset.AvlNode<E> add(java.util.Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, getElement());
            if (compare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return addLeftChild(e, i);
                }
                int i2 = avlNode.height;
                com.google.common.collect.TreeMultiset.AvlNode<E> add = avlNode.add(comparator, e, i, iArr);
                this.left = add;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += i;
                if (add.height != i2) {
                    return rebalance();
                }
            } else if (compare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return addRightChild(e, i);
                }
                int i3 = avlNode2.height;
                com.google.common.collect.TreeMultiset.AvlNode<E> add2 = avlNode2.add(comparator, e, i, iArr);
                this.right = add2;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += i;
                if (add2.height != i3) {
                    return rebalance();
                }
            } else {
                int i4 = this.elemCount;
                iArr[0] = i4;
                long j = i;
                com.google.common.base.Preconditions.checkArgument(((long) i4) + j <= androidx.collection.SieveCacheKt.NodeLinkMask);
                this.elemCount += i;
                this.totalCount += j;
                return this;
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.collect.TreeMultiset.AvlNode<E> remove(java.util.Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, getElement());
            if (compare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.distinctElements--;
                        this.totalCount -= i2;
                    } else {
                        this.totalCount -= i;
                    }
                }
                return i2 == 0 ? this : rebalance();
            }
            if (compare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.right = avlNode2.remove(comparator, e, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.distinctElements--;
                        this.totalCount -= i3;
                    } else {
                        this.totalCount -= i;
                    }
                }
                return rebalance();
            }
            int i4 = this.elemCount;
            iArr[0] = i4;
            if (i >= i4) {
                return deleteMe();
            }
            this.elemCount = i4 - i;
            this.totalCount -= i;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, getElement());
            if (compare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return addLeftChild(e, i);
                    }
                } else {
                    this.left = avlNode.setCount(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.distinctElements--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += i - iArr[0];
                    return rebalance();
                }
            } else if (compare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return addRightChild(e, i);
                    }
                } else {
                    this.right = avlNode2.setCount(comparator, e, i, iArr);
                    if (i == 0 && iArr[0] != 0) {
                        this.distinctElements--;
                    } else if (i > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += i - iArr[0];
                    return rebalance();
                }
            } else {
                iArr[0] = this.elemCount;
                if (i == 0) {
                    return deleteMe();
                }
                this.totalCount += i - r3;
                this.elemCount = i;
                return this;
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, getElement());
            if (compare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return addLeftChild(e, i2);
                    }
                } else {
                    this.left = avlNode.setCount(comparator, e, i, i2, iArr);
                    int i3 = iArr[0];
                    if (i3 == i) {
                        if (i2 == 0 && i3 != 0) {
                            this.distinctElements--;
                        } else if (i2 > 0 && i3 == 0) {
                            this.distinctElements++;
                        }
                        this.totalCount += i2 - i3;
                    }
                    return rebalance();
                }
            } else if (compare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return addRightChild(e, i2);
                    }
                } else {
                    this.right = avlNode2.setCount(comparator, e, i, i2, iArr);
                    int i4 = iArr[0];
                    if (i4 == i) {
                        if (i2 == 0 && i4 != 0) {
                            this.distinctElements--;
                        } else if (i2 > 0 && i4 == 0) {
                            this.distinctElements++;
                        }
                        this.totalCount += i2 - i4;
                    }
                    return rebalance();
                }
            } else {
                int i5 = this.elemCount;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return deleteMe();
                    }
                    this.totalCount += i2 - i5;
                    this.elemCount = i2;
                }
            }
            return this;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            com.google.common.collect.TreeMultiset.successor(pred(), succ());
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.height >= avlNode2.height) {
                com.google.common.collect.TreeMultiset.AvlNode<E> pred = pred();
                pred.left = this.left.removeMax(pred);
                pred.right = this.right;
                pred.distinctElements = this.distinctElements - 1;
                pred.totalCount = this.totalCount - i;
                return pred.rebalance();
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> succ = succ();
            succ.right = this.right.removeMin(succ);
            succ.left = this.left;
            succ.distinctElements = this.distinctElements - 1;
            succ.totalCount = this.totalCount - i;
            return succ.rebalance();
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMin(com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.left;
            if (avlNode2 == null) {
                return this.right;
            }
            this.left = avlNode2.removeMin(avlNode);
            this.distinctElements--;
            this.totalCount -= avlNode.elemCount;
            return rebalance();
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMax(com.google.common.collect.TreeMultiset.AvlNode<E> avlNode) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return this.left;
            }
            this.right = avlNode2.removeMax(avlNode);
            this.distinctElements--;
            this.totalCount -= avlNode.elemCount;
            return rebalance();
        }

        private void recomputeMultiset() {
            this.distinctElements = com.google.common.collect.TreeMultiset.distinctElements(this.left) + 1 + com.google.common.collect.TreeMultiset.distinctElements(this.right);
            this.totalCount = this.elemCount + totalCount(this.left) + totalCount(this.right);
        }

        private void recomputeHeight() {
            this.height = java.lang.Math.max(height(this.left), height(this.right)) + 1;
        }

        private void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rebalance() {
            int balanceFactor = balanceFactor();
            if (balanceFactor == -2) {
                java.util.Objects.requireNonNull(this.right);
                if (this.right.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            }
            if (balanceFactor == 2) {
                java.util.Objects.requireNonNull(this.left);
                if (this.left.balanceFactor() < 0) {
                    this.left = this.left.rotateLeft();
                }
                return rotateRight();
            }
            recomputeHeight();
            return this;
        }

        private int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateLeft() {
            com.google.common.base.Preconditions.checkState(this.right != null);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateRight() {
            com.google.common.base.Preconditions.checkState(this.left != null);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private static long totalCount(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0L;
            }
            return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).totalCount;
        }

        private static int height(com.google.common.collect.TreeMultiset.AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public com.google.common.collect.TreeMultiset.AvlNode<E> ceiling(java.util.Comparator<? super E> comparator, E e) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this;
            do {
                int compare = comparator.compare(e, avlNode.getElement());
                if (compare < 0) {
                    com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = avlNode.left;
                    if (avlNode2 != null) {
                        return (com.google.common.collect.TreeMultiset.AvlNode) com.google.common.base.MoreObjects.firstNonNull(avlNode2.ceiling(comparator, e), avlNode);
                    }
                } else if (compare != 0) {
                    avlNode = avlNode.right;
                }
                return avlNode;
            } while (avlNode != null);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public com.google.common.collect.TreeMultiset.AvlNode<E> floor(java.util.Comparator<? super E> comparator, E e) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this;
            do {
                int compare = comparator.compare(e, avlNode.getElement());
                if (compare > 0) {
                    com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = avlNode.right;
                    if (avlNode2 != null) {
                        return (com.google.common.collect.TreeMultiset.AvlNode) com.google.common.base.MoreObjects.firstNonNull(avlNode2.floor(comparator, e), avlNode);
                    }
                } else if (compare != 0) {
                    avlNode = avlNode.left;
                }
                return avlNode;
            } while (avlNode != null);
            return null;
        }

        final E getElement() {
            return (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.elem);
        }

        final int getCount() {
            return this.elemCount;
        }

        public final java.lang.String toString() {
            return com.google.common.collect.Multisets.immutableEntry(getElement(), getCount()).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> avlNode, com.google.common.collect.TreeMultiset.AvlNode<T> avlNode2) {
        ((com.google.common.collect.TreeMultiset.AvlNode) avlNode).succ = avlNode2;
        ((com.google.common.collect.TreeMultiset.AvlNode) avlNode2).pred = avlNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> avlNode, com.google.common.collect.TreeMultiset.AvlNode<T> avlNode2, com.google.common.collect.TreeMultiset.AvlNode<T> avlNode3) {
        successor(avlNode, avlNode2);
        successor(avlNode2, avlNode3);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        com.google.common.collect.Serialization.writeMultiset(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) java.util.Objects.requireNonNull(objectInputStream.readObject());
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.AbstractSortedMultiset.class, "comparator").set((com.google.common.collect.Serialization.FieldSetter) this, (java.lang.Object) comparator);
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, "range").set((com.google.common.collect.Serialization.FieldSetter) this, (java.lang.Object) com.google.common.collect.GeneralRange.all(comparator));
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, "rootReference").set((com.google.common.collect.Serialization.FieldSetter) this, (java.lang.Object) new com.google.common.collect.TreeMultiset.Reference());
        com.google.common.collect.TreeMultiset.AvlNode avlNode = new com.google.common.collect.TreeMultiset.AvlNode();
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER).set((com.google.common.collect.Serialization.FieldSetter) this, (java.lang.Object) avlNode);
        successor(avlNode, avlNode);
        com.google.common.collect.Serialization.populateMultiset(this, objectInputStream);
    }
}
