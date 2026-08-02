package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class IncidentEdgeSet<N> extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
    final com.google.common.graph.BaseGraph<N> graph;
    final N node;

    IncidentEdgeSet(com.google.common.graph.BaseGraph<N> baseGraph, N n) {
        this.graph = baseGraph;
        this.node = n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.graph.isDirected()) {
            return (this.graph.inDegree(this.node) + this.graph.outDegree(this.node)) - (this.graph.successors((com.google.common.graph.BaseGraph<N>) this.node).contains(this.node) ? 1 : 0);
        }
        return this.graph.adjacentNodes(this.node).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.graph.EndpointPair)) {
            return false;
        }
        com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
        if (this.graph.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            java.lang.Object source = endpointPair.source();
            java.lang.Object target = endpointPair.target();
            return (this.node.equals(source) && this.graph.successors((com.google.common.graph.BaseGraph<N>) this.node).contains(target)) || (this.node.equals(target) && this.graph.predecessors((com.google.common.graph.BaseGraph<N>) this.node).contains(source));
        }
        if (endpointPair.isOrdered()) {
            return false;
        }
        java.util.Set<N> adjacentNodes = this.graph.adjacentNodes(this.node);
        java.lang.Object nodeU = endpointPair.nodeU();
        java.lang.Object nodeV = endpointPair.nodeV();
        return (this.node.equals(nodeV) && adjacentNodes.contains(nodeU)) || (this.node.equals(nodeU) && adjacentNodes.contains(nodeV));
    }
}
