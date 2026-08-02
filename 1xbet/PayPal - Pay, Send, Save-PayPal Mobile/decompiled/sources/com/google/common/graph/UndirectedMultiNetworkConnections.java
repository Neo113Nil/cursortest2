package com.google.common.graph;

/* loaded from: classes9.dex */
final class UndirectedMultiNetworkConnections<N, E> extends com.google.common.graph.AbstractUndirectedNetworkConnections<N, E> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> adjacentNodesReference;

    private UndirectedMultiNetworkConnections(java.util.Map<E, N> map) {
        super(map);
    }

    static <N, E> com.google.common.graph.UndirectedMultiNetworkConnections<N, E> of() {
        return new com.google.common.graph.UndirectedMultiNetworkConnections<>(new java.util.HashMap(2, 1.0f));
    }

    static <N, E> com.google.common.graph.UndirectedMultiNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> map) {
        return new com.google.common.graph.UndirectedMultiNetworkConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map));
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(adjacentNodesMultiset().elementSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset<N> adjacentNodesMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset create = com.google.common.collect.HashMultiset.create(this.incidentEdgeMap.values());
        this.adjacentNodesReference = new java.lang.ref.SoftReference(create);
        return create;
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<E> edgesConnecting(final N n) {
        return new com.google.common.graph.MultiEdgesConnecting<E>(this, this.incidentEdgeMap, n) { // from class: com.google.common.graph.UndirectedMultiNetworkConnections.1
            final /* synthetic */ com.google.common.graph.UndirectedMultiNetworkConnections this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$0.adjacentNodesMultiset().count(n);
            }
        };
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final N removeInEdge(E e, boolean z) {
        if (z) {
            return null;
        }
        return removeOutEdge(e);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final void addInEdge(E e, N n, boolean z) {
        if (z) {
            return;
        }
        addOutEdge(e, n);
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final void addOutEdge(E e, N n) {
        super.addOutEdge(e, n);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.adjacentNodesReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.add(n));
        }
    }

    private static <T> T getReference(java.lang.ref.Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }
}
