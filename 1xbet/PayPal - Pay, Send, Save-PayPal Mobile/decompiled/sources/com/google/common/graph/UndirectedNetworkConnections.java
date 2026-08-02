package com.google.common.graph;

/* loaded from: classes9.dex */
final class UndirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractUndirectedNetworkConnections<N, E> {
    UndirectedNetworkConnections(java.util.Map<E, N> map) {
        super(map);
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> of() {
        return new com.google.common.graph.UndirectedNetworkConnections<>(com.google.common.collect.HashBiMap.create(2));
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> map) {
        return new com.google.common.graph.UndirectedNetworkConnections<>(com.google.common.collect.ImmutableBiMap.copyOf((java.util.Map) map));
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(((com.google.common.collect.BiMap) this.incidentEdgeMap).values());
    }

    @Override // com.google.common.graph.NetworkConnections
    public final java.util.Set<E> edgesConnecting(N n) {
        return new com.google.common.graph.EdgesConnecting(((com.google.common.collect.BiMap) this.incidentEdgeMap).inverse(), n);
    }
}
