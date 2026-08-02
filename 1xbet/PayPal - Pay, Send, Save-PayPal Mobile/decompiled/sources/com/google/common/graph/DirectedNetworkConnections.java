package com.google.common.graph;

/* loaded from: classes9.dex */
final class DirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractDirectedNetworkConnections<N, E> {
    DirectedNetworkConnections(java.util.Map<E, N> map, java.util.Map<E, N> map2, int i) {
        super(map, map2, i);
    }

    static <N, E> com.google.common.graph.DirectedNetworkConnections<N, E> of() {
        return new com.google.common.graph.DirectedNetworkConnections<>(com.google.common.collect.HashBiMap.create(2), com.google.common.collect.HashBiMap.create(2), 0);
    }

    static <N, E> com.google.common.graph.DirectedNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> map, java.util.Map<E, N> map2, int i) {
        return new com.google.common.graph.DirectedNetworkConnections<>(com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) map), com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) map2), i);
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> predecessors() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.inEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> successors() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.outEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<E> edgesConnecting(N n) {
        return new com.google.common.graph.EdgesConnecting(((com.google.common.collect.BiMap) this.outEdgeMap).inverse(), n);
    }
}
