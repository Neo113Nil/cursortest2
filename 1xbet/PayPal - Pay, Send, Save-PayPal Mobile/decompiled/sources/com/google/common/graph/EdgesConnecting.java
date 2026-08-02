package com.google.common.graph;

/* loaded from: classes9.dex */
final class EdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<?, E> nodeToOutEdge;
    private final java.lang.Object targetNode;

    EdgesConnecting(java.util.Map<?, E> map, java.lang.Object obj) {
        this.nodeToOutEdge = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        this.targetNode = com.google.common.base.Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        E connectingEdge = getConnectingEdge();
        if (connectingEdge == null) {
            return com.google.common.collect.ImmutableSet.of().iterator();
        }
        return com.google.common.collect.Iterators.singletonIterator(connectingEdge);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getConnectingEdge() == null ? 0 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        E connectingEdge = getConnectingEdge();
        return connectingEdge != null && connectingEdge.equals(obj);
    }

    private E getConnectingEdge() {
        return this.nodeToOutEdge.get(this.targetNode);
    }
}
