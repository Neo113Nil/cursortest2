package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class AbstractUndirectedNetworkConnections<N, E> implements com.google.common.graph.NetworkConnections<N, E> {
    final java.util.Map<E, N> incidentEdgeMap;

    AbstractUndirectedNetworkConnections(java.util.Map<E, N> map) {
        this.incidentEdgeMap = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> incidentEdges() {
        return java.util.Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e) {
        return (N) java.util.Objects.requireNonNull(this.incidentEdgeMap.get(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e, boolean z) {
        if (z) {
            return null;
        }
        return removeOutEdge(e);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e) {
        return (N) java.util.Objects.requireNonNull(this.incidentEdgeMap.remove(e));
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e, N n, boolean z) {
        if (z) {
            return;
        }
        addOutEdge(e, n);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e, N n) {
        com.google.common.base.Preconditions.checkState(this.incidentEdgeMap.put(e, n) == null);
    }
}
