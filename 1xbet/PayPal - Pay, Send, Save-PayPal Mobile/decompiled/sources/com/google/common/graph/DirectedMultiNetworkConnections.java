package com.google.common.graph;

/* loaded from: classes9.dex */
final class DirectedMultiNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> predecessorsReference;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.lang.ref.Reference<com.google.common.collect.Multiset<N>> successorsReference;

    private DirectedMultiNetworkConnections(java.util.Map<E, N> map, java.util.Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> of() {
        return new com.google.common.graph.DirectedMultiNetworkConnections<>(new java.util.HashMap(2, 1.0f), new java.util.HashMap(2, 1.0f), 0);
    }

    static <N, E> com.google.common.graph.DirectedMultiNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> map, java.util.Map<E, N> map2, int i) {
        return new com.google.common.graph.DirectedMultiNetworkConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map), com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map2), i);
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> predecessors() {
        return java.util.Collections.unmodifiableSet(predecessorsMultiset().elementSet());
    }

    private com.google.common.collect.Multiset<N> predecessorsMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset create = com.google.common.collect.HashMultiset.create(this.inEdgeMap.values());
        this.predecessorsReference = new java.lang.ref.SoftReference(create);
        return create;
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> successors() {
        return java.util.Collections.unmodifiableSet(successorsMultiset().elementSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset<N> successorsMultiset() {
        com.google.common.collect.Multiset<N> multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            return multiset;
        }
        com.google.common.collect.HashMultiset create = com.google.common.collect.HashMultiset.create(this.outEdgeMap.values());
        this.successorsReference = new java.lang.ref.SoftReference(create);
        return create;
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<E> edgesConnecting(final N n) {
        return new com.google.common.graph.MultiEdgesConnecting<E>(this, this.outEdgeMap, n) { // from class: com.google.common.graph.DirectedMultiNetworkConnections.1
            final /* synthetic */ com.google.common.graph.DirectedMultiNetworkConnections this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.this$0.successorsMultiset().count(n);
            }
        };
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final N removeInEdge(E e, boolean z) {
        N n = (N) super.removeInEdge(e, z);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final N removeOutEdge(E e) {
        N n = (N) super.removeOutEdge(e);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.remove(n));
        }
        return n;
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final void addInEdge(E e, N n, boolean z) {
        super.addInEdge(e, n, z);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.predecessorsReference);
        if (multiset != null) {
            com.google.common.base.Preconditions.checkState(multiset.add(n));
        }
    }

    @Override // com.google.common.graph.AbstractDirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public final void addOutEdge(E e, N n) {
        super.addOutEdge(e, n);
        com.google.common.collect.Multiset multiset = (com.google.common.collect.Multiset) getReference(this.successorsReference);
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
