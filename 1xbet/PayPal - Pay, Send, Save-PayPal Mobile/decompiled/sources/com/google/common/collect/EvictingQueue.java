package com.google.common.collect;

/* loaded from: classes9.dex */
public final class EvictingQueue<E> extends com.google.common.collect.ForwardingQueue<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new java.util.ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> com.google.common.collect.EvictingQueue<E> create(int i) {
        return new com.google.common.collect.EvictingQueue<>(i);
    }

    public final int remainingCapacity() {
        return this.maxSize - size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final java.util.Queue<E> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    public final boolean offer(E e) {
        return add(e);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        com.google.common.base.Preconditions.checkNotNull(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        int size = collection.size();
        if (size >= this.maxSize) {
            clear();
            return com.google.common.collect.Iterables.addAll(this, com.google.common.collect.Iterables.skip(collection, size - this.maxSize));
        }
        return standardAddAll(collection);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return super.toArray();
    }
}
